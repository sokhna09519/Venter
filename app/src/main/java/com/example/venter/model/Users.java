package com.example.venter.model;

public class Users {
    private String nom_boutique;
    private String telephone_boutique;
    private String mot_de_passe;
    private String adreese;
    private String description;
    private String Ville;
    private String mail;

    public Users(String nom_boutique, String telephone_boutique, String mot_de_passe, String adreese, String description, String ville, String mail) {
        this.nom_boutique = nom_boutique;
        this.telephone_boutique = telephone_boutique;
        this.mot_de_passe = mot_de_passe;
        this.adreese = adreese;
        this.description = description;
        Ville = ville;
        this.mail = mail;
    }

    public String getNom_boutique() {
        return nom_boutique;
    }

    public void setNom_boutique(String nom_boutique) {
        this.nom_boutique = nom_boutique;
    }

    public String getTelephone_boutique() {
        return telephone_boutique;
    }

    public void setTelephone_boutique(String telephone_boutique) {
        this.telephone_boutique = telephone_boutique;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public String getAdreese() {
        return adreese;
    }

    public void setAdreese(String adreese) {
        this.adreese = adreese;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}

