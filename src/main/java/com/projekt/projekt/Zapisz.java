package com.projekt.projekt;

import org.springframework.stereotype.Service;

import java.io.PrintWriter;
import java.util.List;

@Service
public class Zapisz {

    public void zapiszListe(List<Obiekt> mojaLista) throws Exception {

        PrintWriter plik = new PrintWriter("wyniki.txt");
        for(Obiekt x: mojaLista){
            plik.print(x.getId()+" ");
            plik.print(x.getTytul()+ " ");
            plik.print(x.getWydawca());
            plik.println();
        }
        plik.close();
    }
}
