import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class Maps {
    public static void main(String[] args) {
        //map = reprezentare de date in sistem cheie-valoare
        //exemplu: Gigel are nota 10 , Costel are nota 9

        //declaram un map
        Map<String, Integer> note_elevi = new HashMap<String, Integer>();

        //adaugam elemente
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 10);

        //aflu notele
        System.out.println("Ana are nota " + note_elevi.get("Ana") + ".");

        //actualizam valori
        note_elevi.replace("Costel", 10);
        System.out.println("Costel si-a marit nota la " + note_elevi.get("Costel") + ".");

        //aflam dimensiunea
        System.out.println(note_elevi.size());

        //Stergem valori
        note_elevi.remove("Gigel");
        System.out.println(note_elevi);
        System.out.println(note_elevi.get("Gigel"));

        //Declaram si initializam cu valori
        //Map nu este ordonat
        Map<String, Integer> luni = new HashMap<>() {{
            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);

        }};
        System.out.println(luni);

    }
}
