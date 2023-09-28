package ch.bbz.zins.aufgaben;

import java.util.Scanner;

public class Choice {
    public void ausWaehlen(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welches Programm möchten Sie starten?");
        System.out.println("1. Durchschnitt von jedem Monat \n 2. Höchster Durchschnitt \n 3. Durchschnittszinssatz über das ganze Jahr");
        System.out.print("4. Liste mit Minimalwert eines Monats \n 5.Eine Liste mit veränderten Minimal- und Maxwert");
        String eingabe = scan.nextLine();

        switch (eingabe) {
            case "1":
                averageMonth();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":

                break;
            case "5":

                break;
        }
    }
    public String averageMonth(){
        return "funktioniert";
    }
}

