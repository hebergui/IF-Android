package com.imaginariumfestival.android;

import java.util.ArrayList;
import java.util.List;

public class DbHelper {

	List<ArtistModel> artists = null;

	private DbHelper() {
		populate();
	}

	public static DbHelper getInstance() {
		return new DbHelper();
	}

	private void populate() {
		ProgrammationModel prog1 = new ProgrammationModel("Main Stage","31 mai", "22h");
		ArtistModel artist1 = new ArtistModel("","Justice", "Electro",
				"Justice est un duo fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fra fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay fran�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnayn�ais de synthpop, musique �lectronique, compos� de Gaspard Aug� et de Xavier de Rosnay.",
				prog1,"","","","");
		ProgrammationModel prog2 = new ProgrammationModel("Main Stage","31 mai", "20h");
		ArtistModel artist2 = new ArtistModel("","Manu Chao", "Autre",
				"Manu Chao (n� Jos�-Manuel Thomas Arthur Chao le 21 juin 1961 � Paris1) est un chanteur auteur-compositeur-interpr�te et musicien fran�ais d'origine espagnole et bilingue hispanophone, devenu une figure majeure du rock fran�ais et de la musique latine avec son groupe la Mano Negra.",
				prog2, "","","","");
		ProgrammationModel prog3 = new ProgrammationModel("Main Stage","31 mai", "18h");
		ArtistModel artist3 = new ArtistModel("","Wej", "Electro",
				"Wej (n� MartinBouvier) est un auteur-compositeur �tudiant vraiment tr�s sympa.",
				prog3,"","","","");
		ProgrammationModel prog4 = new ProgrammationModel("Main Stage", "31 mai", "16h");
		ArtistModel artist4 = new ArtistModel("", "Daft Punk", "Electro",
				"Daft Punk est un groupe fran�ais de musique �lectronique, originaire de Paris. Actifs depuis 1992, Thomas Bangalter et Guy-Manuel de Homem-Christo, les deux membres, ont alli� � leurs sons electro, house et techno des tonalit�s rock, groove et disco.\nDaft Punk est un groupe fran�ais de musique �lectronique, originaire de Paris. Actifs depuis 1992, Thomas Bangalter et Guy-Manuel de Homem-Christo, les deux membres, ont alli� � leurs sons electro, house et techno des tonalit�s rock, groove et disco.Daft Punk est un groupe fran�ais de musique �lectronique, originaire de Paris. Actifs depuis 1992, Thomas Bangalter et Guy-Manuel de Homem-Christo, les deux membres, ont alli� � leurs sons electro, house et techno des tonalit�s rock, groove et disco.Daft Punk est un groupe fran�ais de musique �lectronique, originaire de Paris. Actifs depuis 1992, Thomas Bangalter et Guy-Manuel de Homem-Christo, les deux membres, ont alli� � leurs sons electro, house et techno des tonalit�s rock, groove et disco.Daft Punk est un groupe fran�ais de musique �lectronique, originaire de Paris. Actifs depuis 1992, Thomas Bangalter et Guy-Manuel de Homem-Christo, les deux membres, ont alli� � leurs sons electro, house et techno des tonalit�s rock, groove et disco.Daft Punk est un groupe fran�ais de musique �lectronique, originaire de Paris. Actifs depuis 1992, Thomas Bangalter et Guy-Manuel de Homem-Christo, les deux membres, ont alli� � leurs sons electro, house et techno des tonalit�s rock, groove et disco.Daft Punk est un groupe fran�ais de musique �lectronique, originaire de Paris. Actifs depuis 1992, Thomas Bangalter et Guy-Manuel de Homem-Christo, les deux membres, ont alli� � leurs sons electro, house et techno des tonalit�s rock, groove et disco.",
				prog4,"http://google.fr","http://google.fr","http://google.fr","http://google.fr");
		ProgrammationModel prog5 = new ProgrammationModel("Main Stage", "31 mai", "14h");
		ArtistModel artist5 = new ArtistModel("", "Naive New Beaters", "Pop",
				"Naive New Beaters est un groupe originaire de Paris, en France, dont la musique est un m�lange d'�lectronique, de rock et de rap.",
				prog5,"","","","");
		ProgrammationModel prog6 = new ProgrammationModel("Main Stage", "31 mai", "00h");
		ArtistModel artist6 = new ArtistModel("", "Uppermost", "Electro",
				"Behdad Nejatbakhshe, better known by his stage name Uppermost, is a French electronic music producer based in Paris, France.",
				prog6,"","","","");
		
		artists = new ArrayList<ArtistModel>();
		artists.add(artist1);
		artists.add(artist2);
		artists.add(artist3);
		artists.add(artist4);
		artists.add(artist5);
		artists.add(artist6);
	}

	public List<ArtistModel> getArtists() {
		return artists;
	}

	public void setArtists(List<ArtistModel> artists) {
		this.artists = artists;
	}

	public ArtistModel getArtist(String artistName) {
		for (ArtistModel artist : artists) {
			if ( artist.getName().equals(artistName) )
				return artist;
		}
		return null;
	}
	
	
}
