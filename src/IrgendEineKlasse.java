public class IrgendEineKlasse {

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
    }
}