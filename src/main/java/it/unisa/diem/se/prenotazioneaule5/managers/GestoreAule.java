package it.unisa.diem.se.prenotazioneaule5.managers;

import it.unisa.diem.se.prenotazioneaule5.entities.Aula;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GestoreAule implements Serializable{
    private Map<String, Aula> aule;
    
    public GestoreAule(){
        aule = new HashMap<>();
    }
    
    public EsitoAula aggiungiAula(Aula aula){
        return 0;
    }
    
    public EsitoAula modificaAula(String vecchioId, String nuovoId, String nome, 
            String edificio, String piano, int capienza){
        return 0;
    }
    
    public EsitoAula rimuoviAula(String id){
        return 0;
    }
    
    

    @Override
    public String toString() {
        return "GestoreAule{" + "aule=" + aule + '}';
    }
}
