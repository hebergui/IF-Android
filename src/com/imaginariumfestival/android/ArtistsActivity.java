package com.imaginariumfestival.android;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class ArtistsActivity extends ListActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		DbHelper dbHelper = DbHelper.getInstance();
		List<ArtistModel> artists = dbHelper.getArtists();

		// Cr�ation de la ArrayList qui nous permettra d'alimenter la listView
		ArrayList<HashMap<String, String>> listItemToDisplay = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> artistItem;

		for (ArtistModel artist : artists) {
			artistItem = new HashMap<String, String>();
			artistItem.put("title", artist.getName());
			artistItem.put("programmation", artist.getProgrammation()
					.toString());
			artistItem.put("img", String.valueOf(R.drawable.artist_icon));
			listItemToDisplay.add(artistItem);
		}

		// Cr�ation d'un SimpleAdapter qui se chargera de mettre les items
		// pr�sent dans notre list (listItem) dans la vue
		SimpleAdapter mSchedule = new SimpleAdapter(this.getBaseContext(),
				listItemToDisplay, R.layout.artist_list_item, new String[] {
						"img", "title", "programmation" }, new int[] {
						R.id.artistListItemIcon, R.id.artistListItemName,
						R.id.artistListItemProgrammation });

		// On attribut � notre listActivity l'adapter que l'on vient de cr�er
		setListAdapter(mSchedule);

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		HashMap<String, String> map = (HashMap<String, String>) getListAdapter().getItem(position);
		Toast.makeText(this, map.get("title") + " selected", Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
}
