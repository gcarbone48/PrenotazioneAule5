package it.unisa.diem.se.prenotazioneaule5.managers.eccezioni;


public class PersistenzaException extends Exception{

    public PersistenzaException(String msg) {
        super(msg);
    }
    
    public PersistenzaException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
