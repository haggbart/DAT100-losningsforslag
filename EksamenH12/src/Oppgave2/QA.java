package Oppgave2;



public class QA {

    //  A
    // i)   Konstant er en variabel som ikke kan endres.
    final double pi = 3.14;
    // ii)  Konstanter brukes for å tydeliggjøre hva variablen skal brukes til
    // og redusere sjansen for å kode feil.

    //  B
    // i) Overload betyr at man har flere metoder med samme navn,
    // men som aksepterer forskjellige parametere.
    // Metoden som passer parameterene gitt i et metodekall blir brukt.

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // ii) Overskrive en metode betyr å endre en metode klassen har arvet.
    @Override
    public String toString() {
        return "Oppgave2";
    }

    //  C
    // i) Innkapsling/informasjonsskjuling: Begrense tilgang på objektvariabler utenfor klassen,
    // f eks ved bruk av private
    // ii) private forran en objektvariabel gjør at man ikke har tilgang til variabelen
    // utenfor klassen med mindre man benytter getters/setters.


}
