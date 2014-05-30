package models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class User
{
	@Id
	private String name;
	
	@NotNull
	private String password;
	
	
}
