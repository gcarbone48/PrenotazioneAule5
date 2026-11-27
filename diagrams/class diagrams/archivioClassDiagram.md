```mermaid
classDiagram

    class Serializable {
             <<interface>>
    }

    Serializable <|.. Archivio

    class Archivio{
    - final GestoreAule gestoreAule
    - final GestoreDocenti gestoreDocenti
    - final GestorePrenotazioni gestorePrenotazioni

    %% getter
    
    + getGestoreAule() GestoreAule
    + getGestoreDocenti() GestoreDocenti
    + getGestorePrenotazioni() GestorePrenotazioni
    }

```
