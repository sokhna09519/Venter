package com.example.venter;

public class Upload {

    public String nom_prod;
    public String descrip_prod;
    public String prix_prod;

    public String imageURL;
    public String category;

    public String date;
    //public String time;


    public Upload() {
        //empty constructor needed
    }

    public Upload(String nom, String url ) {


        this.imageURL = url;
        this.nom_prod = nom;

        // this.date = time;

    }

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom) {
        this.nom_prod = nom;
    }



    public String  getImageURL() {
        return imageURL;
    }

    public void setImageURL(String url) {
        this.imageURL = url;
    }






    //public String getTime() {
    // return time;
    // }

    // public void setTime(String time) {
    // this.time = time;
    // }
}