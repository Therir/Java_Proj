package com.projekt.projekt;

import java.util.ArrayList;

public class ObiektForm {
    private ArrayList<Obiekt> obiektList = new ArrayList<Obiekt>();
    public ArrayList<Obiekt> getObiektList(){
        return obiektList;
    }
    public void setObiektList(ArrayList<Obiekt> obiektList){
        this.obiektList = obiektList;
    }
}
