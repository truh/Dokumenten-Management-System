package models;

import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * User Entity
 * 
 * @author Andreas Willinger
 * @version 30.05.2014
 */
@Entity
public class User
{
	@Id
	private String name;
	
	@NotNull
	private String password;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}
