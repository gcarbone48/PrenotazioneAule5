```mermaid
classDiagram
    class Aula{
        - String id     %% codice identificativo univoco
        - String nome
        - String edificio
        - String piano
        - int capienza
    }

    class Docente{
        - String email      %% univoca
        - String nome
        - String cognome
    }

    class Prenotazione{
        - Aula aula
        - Docente docente
        - TipoAttivita attivita
        - String nomeAttivita
        - LocalDate dataInizio
        - LocalDate dataFine
        - LocalTime oraInizio
        - LocalTime oraFine
        - boolean isRicorrente
        - String idSerie        %% codice interno x controlli nostri
    }

    class TipoAttività{
        <<enumeration>>
        LEZIONE
        SEMINARIO
        ESAME
        LAUREA
        ALTRO
    }

    Prenotazione "0..*" --> "1" Aula : aula             %% ogni singola Prenotazione è associata a esattamente 1 
                                                           aula e 1 docente responsabile.
    Prenotazione "0..*" --> "1" Docente : docente       %% una stessa Aula (o Docente) può essere associata a zero
                                                           o più prenotazioni nell'archivio.
    Prenotazione --> "1" TipoAttivita : tipo
