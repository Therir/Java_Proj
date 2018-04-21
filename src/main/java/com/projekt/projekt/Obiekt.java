package com.projekt.projekt;

public class Obiekt {
    private int id;
    private String tytul;
    private String wydawca;
    private int rokProd;
    public Obiekt(){

    }
    public Obiekt(String tytul, String wydawca,int rokProd){
        this.tytul = tytul;
        this.wydawca = wydawca;
        this.rokProd = rokProd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTytul(){
        return tytul;
    }
    public String getWydawca(){
        return wydawca;
    }
    public int getRokProd(){
        return rokProd;
    }
    public void setTytul(String tytul){
        this.tytul = tytul;
    }
    public void setWydawca(String wydawca){
        this.wydawca = wydawca;
    }
    public void setRokProd(int rokProd){
        this.rokProd = rokProd;
    }

}
