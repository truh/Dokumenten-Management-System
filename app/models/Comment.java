package models;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.annotations.Cascade;

@Entity
public class Comment
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long ID;
    
    @NotNull
	private String text;
    
    @ManyToOne(optional = false)
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	private User author;
    
    public Long getID()
    {
    }
    
    public String getText()
    {
        return this.text;
    }
    
    public void setText(String text)
    {
        this.text = text;
    }
    
    public User getAuthor()
    {
        return this.author;
    }
    
    public void setAuthor(User author)
    {
        this.author = author;
    }
}
