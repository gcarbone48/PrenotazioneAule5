package it.unisa.diem.oop.managers.eccezioni;


public class PersistenzaException extends Exception{

    public PersistenzaException(String msg) {
        super(msg);
    }
    
    public PersistenzaException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
