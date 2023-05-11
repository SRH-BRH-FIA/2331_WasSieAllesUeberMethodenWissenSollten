public class IrgendEineKlasse {

    /*
     * Methoden
     * aka Unterprogramme
     * aka Subroutinen
     * aka Prozeduren
     * aka Funktionen
     * aka Nachrichten
     */

    /*
     * Warum brauchen wir Methoden:
     * 1) Um doppelten Programmcode zu vermeiden
     *    -> um nur eine Stelle zu haben, um den Programmcode
     *       zu überarbeiten
     *    Entwicklungsprinzip: DRY - Don't repeat yourself
     * 2) Einführung einer domain-spezifische Sprache
     *      Methodenname stellt Funktion des Programmcodes klar
     *      (damit kann Kommentar eingespart werden)
     * 3) Um komplexe Probleme in kleine lösbare Teilprobleme zu
     *      zerlegen, um die aktuelle Abstraktionsebene nicht zu
     *      verlassen. Quasi, eine Delegation (Aufgabe) an mein
     *      zukünftiges Ich (oder ein anderer Mitarbeiter)
     */
    public static void eineMethode() {
        System.out.println("in eineMethode wird gearbeitet");
    }

    // Aufbau von Methoden:
//  |----------------------------------------------------| Methodenkopf
//  |-----------| Zusatz/Modifikatoren
//                |-| Datentyp, was die Methode am Ende liefern soll
//                    |--------------| Methodenname
//                                     |-----------------| Parameter
    public static int berechneZinssatz(String kontoInhaber) {
//                    |-----------------------------------| Methodensignatur
        int kundennummer = sucheKundeInDatebank(kontoInhaber);
        return leseFestgelegtenZinssatzFürKunde(kundennummer);
    }

    // mehrere Parameter sind durch Komma getrennt
    public static double berechnePolynom(double x, double koeffizient, double y){
        return koeffizient * x + y;
    }

    // muss in der Zukunft gelöst werden
    private static int leseFestgelegtenZinssatzFürKunde(int kundennummer) {
        return 0;
    }

    // muss in der Zukunft gelöst werden (siehe oben)
    private static int sucheKundeInDatebank(String kontoInhaber) {
        return 0;
    }
//  alles zwischen den geschweiften Klammern {...} ist der Methodenrumpf

    // feine Unterscheidung zwischen den Methoden
    public static void prozedur() {
        // Methoden mit void, d.h. ohne Rückgabewert werden auch als
        // Prozeduren bezeichnet
    }

    public static int funktion(int x) {
        // Methoden mit Datentyp berechnen ein Ergebnis (benötigen ein
        // return Befehl) und werden als Funktionen bezeichnet
        return x;
    }

    // Das hier "main" ist der Einsprungpunkt in unser Programm
    // main aka start aka init aka setup
    public static void main(String[] args) {
        // hier gehts ja normalerweise los ...
        System.out.println("Hallo, aus main");
        eineMethode();
        System.out.println("Nochmal hier in main");
        eineMethode();

        // Kommentar zu Kommentare
        // ========================
        // gib die Zahlen von 0 bis 9 aus
        // eher wichtig: WARUM brauch ich diese 10 Zahlen ???
        for (int i=0; i<20; i++) System.out.println(i);

        double ergebnis = berechnePolynom(17, 4, 0);
        eineMethode();
    }
}