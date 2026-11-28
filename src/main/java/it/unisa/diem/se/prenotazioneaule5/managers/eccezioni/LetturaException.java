
package it.unisa.diem.se.prenotazioneaule5.managers.eccezioni;


public class LetturaException extends PersistenzaException{

    public LetturaException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public LetturaException(String msg) {
        super(msg);
    }
}
