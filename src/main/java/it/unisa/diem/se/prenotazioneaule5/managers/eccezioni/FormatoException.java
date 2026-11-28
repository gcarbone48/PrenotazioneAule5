package it.unisa.diem.se.prenotazioneaule5.managers.eccezioni;

public class FormatoException extends PersistenzaException{

    public FormatoException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public FormatoException(String msg) {
        super(msg);
    }
}
