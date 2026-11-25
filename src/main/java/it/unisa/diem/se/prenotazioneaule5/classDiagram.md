```mermaid
classDiagram
    class Aula{
        - String id     %% codice identificativo univoco
        - String nome
        - String edificio
        - String piano
        - int capienza

        +Aula(String id, String nome, String edificio, String piano, int capienza)
        +getId() String
        +setId(String id) void
        +getNome() String
        +setNome(String nome) void
        +getEdificio() String
        +setEdificio(String edificio) void
        +getPiano() String
        +setPiano(String piano) void
        +getCapienza() int
        +setCapienza(int capienza) void
        +equals(Object o)
        +hashCode()
        +compareTo(Aula a)
    }

    class Docente{
        - String email      %% univoca
        - String nome
        - String cognome

        +Docente(String email, String nome, String cognome)
        +getEmail() String
        +setEmail(String email) void
        +getNome() String
        +setNome(String nome) void
        +getCognome() String
        +setCognome(String cognome) void
        +equals(Object o)
        +hashCode()
        +compareTo(Docente d)
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

        +Prenotazione(Aula aula, Docente docente, TipoAttivita attivita, String nomeAttivita, LocalDate dataInizio, LocalDate dataFine, LocalTime oraInizio, LocalTime oraFine, boolean isRicorrente, String idSerie)
        +getAula() Aula
        +getDocente() Docente
        +getAttivita() TipoAttivita
        +getNomeAttivita() String
        +getDataInizio() LocalDate
        +getDataFine() LocalDate
        +getOraInizio() LocalTime
        +getOraFine() LocalTime
        +isRicorrente() boolean
        +getIdSerie() String
        +equals(Object o)
        +hashCode()
        +compareTo(Prenotazione p)
    }

    class TipoAttività{
        <<enumeration>>
        LEZIONE
        SEMINARIO
        ESAME
        LAUREA
        ALTRO
    }



    class Archivio{
        -List~Aula~ aule
        -List~Docente~ docenti
        -List~Prenotazione~ prenotazioni
        +Archivio()
        +aggiungiAula(Aula aula) void
        +rimuoviAula(String idAula) void
        +trovaAulaPerId(String id) Aula
        +aggiungiDocente(Docente docente) void
        +rimuoviDocente(String email) void
        +trovaDocentePerEmail(String email) Docente
        +aggiungiPrenotazioneSingola(Aula aula, Docente docente, TipoAttivita attivita, String nomeAttivita, LocalDate data, LocalTime oraInizio, LocalTime oraFine) void
        +aggiungiPrenotazioneRicorrente(Aula aula, Docente docente, TipoAttivita attivita, String nomeAttivita, LocalDate dataInizioRico, LocalDate dataFineRico, LocalTime oraInizio, LocalTime oraFine, String idSerie) void
        +cercaAuleFiltro(String criterio, String valore) List~Aula~
        +cercaDocenti(String query) List~Docente~
        +getAule() List~Aula~
        +getDocenti() List~Docente~
        +getPrenotazioni() List~Prenotazione~
    }

    Prenotazione "0..*" --> "1" Aula : aula             %% ogni singola Prenotazione è associata a esattamente 1 
                                                           aula e 1 docente responsabile.
    Prenotazione "0..*" --> "1" Docente : docente       %% una stessa Aula (o Docente) può essere associata a zero
                                                           o più prenotazioni nell'archivio.
    Prenotazione --> "1" TipoAttivita : tipo
