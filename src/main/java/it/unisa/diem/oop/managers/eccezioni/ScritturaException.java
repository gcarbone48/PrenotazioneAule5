package it.unisa.diem.oop.managers.eccezioni;


public class ScritturaException extends PersistenzaException{

    public ScritturaException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public ScritturaException(String msg) {
        super(msg);
    }
}
