package models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Represents an Admin in the System.
 *
 * @author Andreas Willinger
 * @version 11.06.2014
 */
@Entity
@DiscriminatorValue("1")
public class Admin extends User
{
}
