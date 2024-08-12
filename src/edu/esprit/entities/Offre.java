package edu.esprit.entities;

import java.sql.Date;

public abstract class Offre {
    
    private int id; 
    private String libelle;
    private String post;
    private Date dateExpiration;
    private String description;
    private String level;

    public Offre() {
    }
    public Offre(int id,String libelle, String post, Date dateExpiration,String level) {
        this.id=id;
        this.libelle = libelle;
        this.post = post;
        this.dateExpiration = dateExpiration;
        this.level = level;
    }
    public Offre(int id,String libelle, String post, Date dateExpiration, String description, String level) {
        this.id=id;
        this.libelle = libelle;
        this.post = post;
        this.dateExpiration = dateExpiration;
        this.description = description;
        this.level = level;
    }

    //<editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDate_expiration(Date date_expiration) {
        this.dateExpiration = date_expiration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "libelle=" + libelle + ", post=" + post + ", date_expiration=" + dateExpiration + ", description=" + description + ", level=" + level ;
    }
    
    
}
