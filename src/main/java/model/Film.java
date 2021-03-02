package model;

public class Film {
	private int id;
	private String titre;
	private String realisateur;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getTitre() 
	{
		return titre;
	}
	public void setTitre(String titre) 
	{
		this.titre = titre;
	}
	public String getRealisateur() 
	{
		return realisateur;
	}
	public void setRealisateur(String realisateur) 
	{
		this.realisateur = realisateur;
	}
	
	public Film(int anId, String aTitle, String aDirector)
	{
		this.id = anId;
		this.titre = aTitle;
		this.realisateur = aDirector;
	}
	
	
}
