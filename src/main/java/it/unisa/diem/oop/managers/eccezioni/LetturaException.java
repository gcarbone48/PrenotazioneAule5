
package it.unisa.diem.oop.managers.eccezioni;


public class LetturaException extends PersistenzaException{

    public LetturaException() {
    }

    public LetturaException(String msg) {
        super(msg);
    }
}
