/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.se.prenotazioneaule5.managers;

import it.unisa.diem.se.prenotazioneaule5.entities.Docente;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class GestoreDocenti implements Serializable{
    private Set<Docente> docenti;
    
    public GestoreDocenti(){
        docenti = new TreeSet<>();
    }
    
    public EsitoDocente aggiungiDocente(Docente d){
        return EsitoDocente.DOCENTE_OK;
    }
    
    public EsitoDocente rimuoviDocente(Docente d){
        return EsitoDocente.DOCENTE_OK;
    }
    
    public EsitoDocente modificaDocente(Docente d, String nome, String cognome, 
            String email){
        return EsitoDocente.DOCENTE_OK;
    }
    
    public List<Docente> listaOrdinata(){
        return null;
    }
    
    public List<Docente> ricercaCognome(String cognome){
        return null;
    }
    
    public List<Docente> ricercaEmail(String email){
        return null;
    }

    @Override
    public String toString() {
        return "GestoreDocenti{" + "docenti=" + docenti + '}';
    }
    
    
}
