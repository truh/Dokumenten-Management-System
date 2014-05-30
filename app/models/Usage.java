package models;

import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * * .. * Entity between Document & User
 * 
 * @author Andreas Willinger
 * @version 30.05.2014
 */
@Entity
public class Usage
{
	private RType role;
	
	private User user;

	public RType getRole()
	{
		return role;
	}

	public void setRole(RType role)
	{
		this.role = role;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}
}
