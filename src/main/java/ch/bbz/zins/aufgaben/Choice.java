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
                highestMonth();
                break;
            case "3":
                averageZins();
                break;
            case "4":
                minValueMonth();
                break;
            case "5":
                randomTask();
                break;
        }
    }
    public String averageMonth(){
        return "funktioniert";
    }
    public String highestMonth(){
        return "function";
    }
    public String averageZins(){
        return "sheesh";
    }
    public String minValueMonth(){
        return "1234";
    }
    public String randomTask(){
        return "1111";
    }
}

