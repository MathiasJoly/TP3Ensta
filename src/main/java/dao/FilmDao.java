package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ensta.utils.EstablishConnection;
import model.Film;

public class FilmDao 
{
	private FilmDao instance;
	private String ID;
	private String TITRE;
	private String REALISATEUR;
	private String GET = " SELECT id, titre, realisateur FROM film WHERE id = ?";

	private FilmDao ()
	{}
	
	public FilmDao getInstance() 
	{
		if (instance == null) instance = new FilmDao();
		return instance;
	}

	public void setInstance(FilmDao instance) 
	{
		this.instance = instance;
	}
	
	public Film get(int id) throws Exception
	{
		try(Connection conn = EstablishConnection.getConnection();PreparedStatement stmt = conn.prepareStatement(GET))
		{
			stmt.setInt(1, id);
			ResultSet resultSet = stmt.executeQuery();
			Film film = new Film();
			if (resultSet.next())
			{
				film.setId(resultSet.getInt(ID));
				film.setTitre(resultSet.getString(TITRE));
				film.setRealisateur(resultSet.getString(REALISATEUR));
			}
			resultSet.close();
			return film;
		}
		catch (SQLException throwables)
		{
			throw new Exception();
		}	
	}
	
}
