```mermaid
classDiagram
    class Docente{
        - String email
        %% univoca      
        - String nome
        - String cognome
    }

    class EsitoDocente{
        <<enumeration>>
        %%esito corretto
        DOCENTE_OK
        %%restituita se il docente passato non esiste
        DOCENTE_INESISTENTE
        %%restituita se la mail è già associata ad un altro docente
        EMAIL_DUPLICATA
        %%restituita se il docente passato è null
        DOCENTE_NULL
        - String messaggio
        + getMessaggio() String
    }

    class GestoreDocenti{
        - TreeSet~Docente~ docenti
        %%restituisce l'esito dell'operazione
        + aggiungiDocente(Docente d) EsitoDocente
        %%restituisce l'esito della prenotazione
        + rimuoviDocente (Docente d) EsitoDocente
        %%restituisce l'esito dell'operazione
        + modificaDocente (Docente d, String nome, String cognome, String email) EsitoDocente
        %%restituisce una lista ordinata contenente i docenti
        + listaOrdinata () List~Docente~
        %%restituisce una lista ordinata di docenti il cui cognome 
        %%contiene la stringa passata
        + ricercaCognome (String cognome) List~Docente~
        %%restituisce una lista ordinata di docenti la cui mail 
        %%contiene la stringa passata
        + ricercaEmail (String email) List~Docente~
    }

    GestoreDocenti "1" --> "*" Docente
    GestoreDocenti ..> EsitoDocente : utilizza
```

