package beinplayer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beinplayer.metier.Artiste;
import beinplayer.metier.Genre;
import beinplayer.metier.Titre;

class TitreDAOImpl implements TitreDAO{
	
	private final static String SELECT_ALL_TITRES = "select * from titre";
	
	@Override
	public List<Titre> getTousLesTitres() {
		List<Titre> titres = new ArrayList<Titre>();
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			Connection cnx = DriverManager.getConnection("jdbc:hsqldb:hsql:localhost","sa","");
			Statement stmt = cnx.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_ALL_TITRES);
			while(rs.next()){
				Artiste artiste = new Artiste(rs.getString("artiste"));
				Titre titre = new Titre(rs.getString("nom"), rs.getInt("duree"), artiste, Genre.getGenreByIndex(rs.getInt("genre")));
				titres.add(titre);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return titres;
	}
	
	
	
}
