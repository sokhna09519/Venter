package com.example.venter;

public class ImageUploadInfo {

    public String nom_prod;
    public String descrip_prod;
    public String prix_prod;

    public String imageURL;
    public String category;

    public String date;
    //public String time;

    public ImageUploadInfo() {

    }

    public ImageUploadInfo(String nom, String descrip, String prix, String url, String category, String date ) {
        this.category = category;
        this.date = date;

        this.descrip_prod = descrip;

        this.imageURL = url;
        this.nom_prod = nom;
        this.prix_prod = prix;
       // this.date = time;
    }

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom) {
        this.nom_prod = nom;
    }

    public String getDescrip_prod() {
        return descrip_prod;
    }

    public void setDescrip_prod(String descrip) {
        this.descrip_prod = descrip;
    }

    public String getPrix_prod() {
        return prix_prod;
    }

    public void setPrix_prod(String prix) {
        this.prix_prod = prix;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String url) {
        this.imageURL = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //public String getTime() {
       // return time;
   // }

   // public void setTime(String time) {
       // this.time = time;
   // }
}