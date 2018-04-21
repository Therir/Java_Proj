package com.projekt.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Kontroler {

    private final Zapisz zapis;
    public ArrayList<Obiekt> listaObiekt = new ArrayList<Obiekt>();

    @Autowired
    public Kontroler(Zapisz zapis){
        this.zapis = zapis;
    }

    @GetMapping("/result")
    public String showLista(Model model){
        model.addAttribute("lista",listaObiekt);
        return "result";
    }

    @GetMapping("/obiekt")
    public String showForm(Obiekt obiekt){
        return "obiekt";
    }
    @PostMapping("/obiekt")
    public String greetingSubmit(@ModelAttribute Obiekt obiekt){
        listaObiekt.add(obiekt);
        return "redirect:/result";
    }

    @GetMapping("/delete")
    public String deleteObject(@RequestParam("id") int id){

        if(listaObiekt.size()>=id){
            listaObiekt.remove(id);

        }
        return "redirect:/result";
    }

    @GetMapping("/zapis")
    public String zapis(){
        try{
            zapis.zapiszListe(listaObiekt);
            for(Obiekt x: listaObiekt){
                System.out.println(x.getTytul());
            }
        }catch(Exception e){

        }

        return "redirect:/result";
    }
}