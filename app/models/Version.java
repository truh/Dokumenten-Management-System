package models;

import org.hibernate.annotations.Cascade;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Version
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long ID;
    
    @NotNull
	private int number;
    
    @NotNull
	private Date date;
    
    @ManyToOne(optional = false)
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	private User author;
    
    @ManyToOne(optional = true)
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	private Comment comment;
    
    public Long getID()
    {
        return this.ID;
    }
    
    public int getNumber()
    {
        return this.number;
    }
    
    public void setNumber(int number)
    {
        this.number = number;
    }
    
    public Date getDate()
    {
        return this.date;
    }
    
    public void setDate(Date date)
    {
        this.date = date;
    }
    
    public User getAuthor()
    {
        return this.author;
    }
    
    public void setAuthor(User author)
    {
        this.author = author;
    }
    
    public Comment getComment()
    {
        return this.comment;
    }
    
    public void setComment(Comment comment)
    {
        this.comment = comment;
    }
}
