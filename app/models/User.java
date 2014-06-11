package models;

import javax.persistence.*;

import play.data.validation.Constraints.*;
import play.db.ebean.*;

import java.util.List;

/**
 * User Entity
 *
 * @author Andreas Willinger
 * @version 11.06.2014
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="_type", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
public class User
    extends Model
{
	@Id
	private String name;

	@Required
	private String password;

    public static Finder<String, User> find = new Finder(
            String.class, User.class
    );

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

    /**
     * Checks whether or not a user and password combination exists in the system.
     *
     * @param username The username to check
     * @param password The matching password
     * @return true on success, false on failure
     */
    public static boolean doLogin(String username, String password)
    {
        List<User> res = find.findList();
        for(User u:res)
            if(u.getName().equals(username) && u.getPassword().equals(password)) return true;
        return false;
    }

    /**
     * Creates a new User
     * @param username The unique username
     * @param password A matching password
     * @return true on success, false on failure (user already exists)
     */
    public static boolean createUser(String username, String password)
    {
        User u1 = new User();
        u1.setName(username);
        u1.setPassword(password);

        try
        {
            u1.save();

            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
}
