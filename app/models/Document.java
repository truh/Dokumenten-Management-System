package models;

import java.util.Collection;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Document
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long ID;
	
	private String author;

	private String kategorie;

	private String dokumentName;

	private String dokumentenTyp;

	private String schluesselWoerter;

	private boolean locked;

	private Comment[] comment;

	private User owner;
	
	@OneToMany(optional = true)
	private Collection<Usage> usage;

	private Collection<Version> versions;

	public Long getID()
	{
		return ID;
	}
	
	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getKategorie()
	{
		return kategorie;
	}

	public void setKategorie(String kategorie)
	{
		this.kategorie = kategorie;
	}

	public String getDokumentName()
	{
		return dokumentName;
	}

	public void setDokumentName(String dokumentName)
	{
		this.dokumentName = dokumentName;
	}

	public String getDokumentenTyp()
	{
		return dokumentenTyp;
	}

	public void setDokumentenTyp(String dokumentenTyp)
	{
		this.dokumentenTyp = dokumentenTyp;
	}

	public String getSchluesselWoerter()
	{
		return schluesselWoerter;
	}

	public void setSchluesselWoerter(String schluesselWoerter)
	{
		this.schluesselWoerter = schluesselWoerter;
	}

	public boolean isLocked()
	{
		return locked;
	}

	public void setLocked(boolean locked)
	{
		this.locked = locked;
	}

	public Comment[] getComment()
	{
		return comment;
	}

	public void setComment(Comment[] comment)
	{
		this.comment = comment;
	}

	public User getOwner()
	{
		return owner;
	}

	public void setOwner(User owner)
	{
		this.owner = owner;
	}

	public Collection<User> getUsers()
	{
		return users;
	}

	public void setUsers(Collection<User> users)
	{
		this.users = users;
	}

	public Collection<Usage> getUsage()
	{
		return usage;
	}

	public void setUsage(Collection<Usage> usage)
	{
		this.usage = usage;
	}

	public Collection<Version> getVersions()
	{
		return versions;
	}

	public void setVersions(Collection<Version> versions)
	{
		this.versions = versions;
	}
}
