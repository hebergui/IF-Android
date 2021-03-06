package com.imaginariumfestival.android.artists;

import java.util.List;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import com.imaginariumfestival.android.R;
import com.imaginariumfestival.android.Utils;
import com.imaginariumfestival.android.database.ArtistDataSource;

public class ArtistsActivity extends Activity {
	
	private static final boolean ALPHA_SORT_SWITCH_VALUE = false;
	private static final boolean STYLE_SORT_SWITCH_VALUE = true;
	
	private List<ArtistModel> artists;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_artists);

		ArtistDataSource datasource = new ArtistDataSource(ArtistsActivity.this);
		datasource.open();
		artists = datasource.getAllArtists();
		datasource.close();
		
		initializeButtons();
		computeListToView( new ArtistsAlphabeticalAdapter(this, artists) );
	}

	private void initializeButtons() {
		ImageButton backButton = (ImageButton) findViewById(R.id.back_button);
		backButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				NavUtils.navigateUpFromSameTask(ArtistsActivity.this);
			}
		});
		Utils.addAlphaEffectOnClick(backButton);
		
		((Switch) findViewById(R.id.sort_toggle)).setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked == ALPHA_SORT_SWITCH_VALUE) {
					computeListToView( new ArtistsAlphabeticalAdapter(ArtistsActivity.this, artists) );
				} else if (isChecked == STYLE_SORT_SWITCH_VALUE) {
					computeListToView( new ArtistsStyleAdapter(ArtistsActivity.this, artists) );
				}
			}
		});
		((TextView) findViewById(R.id.action_alpha_sort)).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				((Switch) findViewById(R.id.sort_toggle)).setChecked(ALPHA_SORT_SWITCH_VALUE);
			}
		});
		((TextView) findViewById(R.id.action_type_sort)).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				((Switch) findViewById(R.id.sort_toggle)).setChecked(STYLE_SORT_SWITCH_VALUE);
			}
		});
		Typeface euroFont = Typeface.createFromAsset(getAssets(), "eurof55.ttf");
		((TextView) findViewById(R.id.action_alpha_sort)).setTypeface(euroFont);
		((TextView) findViewById(R.id.action_type_sort)).setTypeface(euroFont);
	}

	private void computeListToView(ListAdapter adapter) {
		ListView list = (ListView) findViewById(R.id.artistsList);
		list.removeAllViewsInLayout();
		list.setAdapter(adapter);
	}
}
