package it.unisa.diem.se.prenotazioneaule5.managers.eccezioni;


public class ScritturaException extends PersistenzaException{

    public ScritturaException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public ScritturaException(String msg) {
        super(msg);
    }
}
