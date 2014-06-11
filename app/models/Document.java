package models;

import org.hibernate.annotations.*;

import java.util.Collection;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.*;

/**
 * A Document
 *
 * @author  Andreas Willinger
 * @version 11.06.2014
 */
@Entity
public class Document
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long ID;

    @NotNull
	private String author;

	private String kategorie;

    @NotNull
	private String dokumentName;
    @NotNull
	private String dokumentenTyp;

	private String schluesselWoerter;

	private boolean locked = false;

    @NotNull
    private User owner;

    @OneToMany
    @Transient
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
	private Collection<Comment> comment;

    @NotNull
    @Transient
	@OneToMany
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
	private Collection<Usage> usage;

    @OneToMany
    @Transient
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
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

	public Collection<Comment> getComment()
	{
		return comment;
	}

	public void setComment(Collection<Comment> comment)
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
