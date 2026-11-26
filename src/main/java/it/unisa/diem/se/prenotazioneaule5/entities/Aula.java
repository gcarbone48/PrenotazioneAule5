/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.se.prenotazioneaule5.entities;

import java.io.Serializable;

/**
 *
 * @author Giovanni
 */
public class Aula implements Serializable {
    private String id;
    private String nome;
    private String edificio;
    private String piano;
    private int capienza;

    public Aula(String id, String nome, String edificio, String piano, int capienza) {
        this.id = id;
        this.nome = nome;
        this.edificio = edificio;
        this.piano = piano;
        this.capienza = capienza;
    }

    public String getId() {
        return id;
    }

    public String getEdificio() {
        return edificio;
    }

    public String getPiano() {
        return piano;
    }

    public int getCapienza() {
        return capienza;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public void setPiano(String piano) {
        this.piano = piano;
    }

    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }
    
    @Override
    public boolean equals(Object o){
        return false;
    }
    
    @Override
    public int hashCode(){
        return 0;
    }
    
    @Override
    public String toString(){
        return "";
    }
}
