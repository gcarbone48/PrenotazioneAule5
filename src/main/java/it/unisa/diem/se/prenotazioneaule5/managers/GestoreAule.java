package it.unisa.diem.se.prenotazioneaule5.managers;

import it.unisa.diem.se.prenotazioneaule5.entities.Aula;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestoreAule implements Serializable{
    private Map<String, Aula> aule;
    
    public GestoreAule(){
        aule = new HashMap<>();
    }
    
    public EsitoAula aggiungiAula(Aula aula){
        return EsitoAula.AULA_OK;
    }
    
    public EsitoAula modificaAula(String vecchioId, String nuovoId, String nome, 
            String edificio, String piano, int capienza){
        return EsitoAula.AULA_OK;
    }
    
    public EsitoAula rimuoviAula(String id){
        return EsitoAula.AULA_OK;
    }
    
    public EsitoAula rimuoviAula(Aula a){
        return EsitoAula.AULA_OK;
    }
    
    public Aula ricercaId(String id){
        return null;
    }
    
    public Map<String, Aula> getAule(){
        return null;
    }
    
    public List<Aula> filtraEdificio(String edificio){
        return null;
    }
    
    public List<Aula> filtraCapienza(int capienza){
        return null;
    }

    @Override
    public String toString() {
        return "GestoreAule{" + "aule=" + aule + '}';
    }
}
