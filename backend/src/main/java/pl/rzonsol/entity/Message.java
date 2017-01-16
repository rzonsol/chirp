package pl.rzonsol.entity;

import org.springframework.data.annotation.Id;


import java.util.Date;

/**
 * Created by rzonsol on 11.01.2017.
 */
public class Message {
    @Id
    private String id;
    private String description;
    private Date date;
    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUsername() {return username;}

    public void setUsername(String username) { this.username = username;}
}
