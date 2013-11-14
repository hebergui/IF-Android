package com.imaginariumfestival.android.artists;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.imaginariumfestival.android.R;
import com.imaginariumfestival.android.data.ArtistDataSource;

public class ArtistActivity extends Activity {
	private ArtistModel artist;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		setContentView(R.layout.activity_artist);
		
		String artistId = (String) getIntent().getSerializableExtra("artistId");
	    if (artistId == null || artistId.equals("")) {
	    	Toast.makeText(this, "Impossible d'afficher l'artiste", Toast.LENGTH_LONG).show();
	    } else {
	    	ArtistDataSource datasource = new ArtistDataSource(ArtistActivity.this);
			datasource.open();
			artist = datasource.getArtistFromId(Long.parseLong(artistId));
			datasource.close();
			
			fillViewWithArtistData();
	    }
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem menuItem) {
		switch (menuItem.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;
		default:
			return super.onOptionsItemSelected(menuItem);
		}
	}

	private void fillViewWithArtistData() {
		getActionBar().setTitle(artist.getName());
		((ImageView)findViewById(R.id.artist_icon)).setImageResource(R.drawable.artist_icon);
		((TextView)findViewById(R.id.artistProgrammationStage)).setText(artist.getStage());
		((TextView)findViewById(R.id.artistProgrammationDay)).setText(artist.getDay());
		((TextView)findViewById(R.id.artistProgrammationHour)).setText(artist.getBeginHour());
		((TextView)findViewById(R.id.artistDescription)).setText(artist.getDescription());
		((TextView)findViewById(R.id.artistDescription)).setMovementMethod(new ScrollingMovementMethod());
		
		updateLink(artist.getWebsite(), R.id.websiteIcon);
		updateLink(artist.getFacebook(), R.id.facebookIcon);
		updateLink(artist.getTwitter(), R.id.twitterIcon);
		updateLink(artist.getYoutube(), R.id.youtubeIcon);
	}

	private void updateLink(final String url, final int viewId) {
		if (null != url && !url.equals("")) {
			((ImageButton)findViewById(viewId)).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String finalUrl = url;
					if (!url.startsWith("https://") && !url.startsWith("http://")){
						finalUrl = "http://" + url;
					}
					Intent toWebViewIntent = new Intent(ArtistActivity.this, ArtistWebView.class);
					Bundle bundle = new Bundle();
					bundle.putString("weblink", finalUrl);
					bundle.putString("artistName", artist.getName());
					toWebViewIntent.putExtras(bundle);
					startActivity(toWebViewIntent);
				}
			});	
		} else {
			//TODO : mettre plutot une image "no link"
			((ImageButton) findViewById(viewId)).setVisibility(View.INVISIBLE);
		}
	}
}
