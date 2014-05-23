package models;

public class Document {

	private String author;

	private String kategorie;

	private String dokumentName;

	private String dokumentenTyp;

	private String schluesselWoerter;

	private boolean locked;

	private Comment[] comment;

	private User owner;

	private User[] users;

	private Usage[] usage;

	private Version[] versions;

}
