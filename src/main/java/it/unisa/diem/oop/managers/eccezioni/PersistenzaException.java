package it.unisa.diem.oop.managers.eccezioni;


public class PersistenzaException extends Exception{

    public PersistenzaException() {
    }

    public PersistenzaException(String msg) {
        super(msg);
    }
}
