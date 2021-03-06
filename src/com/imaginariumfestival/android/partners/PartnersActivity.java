package com.imaginariumfestival.android.partners;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.imaginariumfestival.android.R;
import com.imaginariumfestival.android.Utils;
import com.imaginariumfestival.android.database.MySQLiteHelper;
import com.imaginariumfestival.android.database.PartnersDataSource;

public class PartnersActivity extends Activity {
	private LinearLayout linearLayout = null;
	List<PartnerModel> partners;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_partners);
		
		ImageButton backButton = (ImageButton) findViewById(R.id.back_button);
		backButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				NavUtils.navigateUpFromSameTask(PartnersActivity.this);
			}
		});
		Utils.addAlphaEffectOnClick(backButton);
		
		Typeface euroFont = Typeface.createFromAsset(getAssets(), "eurof55.ttf");
		((TextView)findViewById(R.id.partners_header_text)).setTypeface( euroFont );
		
		PartnersDataSource partnerDataSource = new PartnersDataSource(PartnersActivity.this);
		partnerDataSource.open();
		partners = partnerDataSource.getAllPartners();
		partnerDataSource.close();
		
		linearLayout = ((LinearLayout)findViewById(R.id.partnerLinearLayout));
		for (PartnerModel partner : partners) {
			fillViewWithPartnerData(partner);
		}
	}
	
	private void fillViewWithPartnerData( final PartnerModel partner) {
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		final View view = inflater.inflate(R.layout.partner_item, null);
		int childCount = ((ViewGroup) view).getChildCount();
		
		for (int i = 0; i < childCount; i++) {
			View child = ((ViewGroup) view).getChildAt(i);
			
			if (child.getId() == R.id.partner_icon) {
				String filePath = getApplicationContext().getFilesDir() + "/"
						+ MySQLiteHelper.TABLE_PARTNERS + "/" + partner.getName();
				((ImageView) child).setImageBitmap(Utils
						.decodeSampledBitmapFromFile(filePath, getResources(),
								R.drawable.partner_empty_icon, 150, 150));
			}
		}
		
		if ( partner.getWebsite().equals("") ) {
			view.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Toast.makeText(PartnersActivity.this, getResources().getString(R.string.partner_has_no_website_linked), Toast.LENGTH_SHORT).show();
				}
			});
		} else {
			view.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String url = partner.getWebsite();
					if (!url.startsWith("https://") && !url.startsWith("http://")){
						url = "http://" + url;
					}
					Intent intent = new Intent(Intent.ACTION_VIEW);
					intent.setData(Uri.parse(url));
					startActivity(intent);
				}
			});
		}
		linearLayout.addView(view);
	}
}

