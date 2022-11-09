import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // Listele au o dimensiune dinamica

        //adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");
        System.out.println(fructe);

        //cum se iau elemente
        System.out.println(fructe.get(0));

        //cum se afla index-ul unui element
        System.out.println(fructe.indexOf("banana"));

        System.out.println(fructe.isEmpty()); //este lista goala?

//        //eliminam toate elementele din lista
//        fructe.clear();

        //sooatem un element din lista
        fructe.remove("mar");

        //listam elementele
        System.out.println(fructe);

        if (!fructe.isEmpty()) { //daca nu este lista goala
            System.out.println("Mancam fructe!");
        } else {
            System.out.println("Nu mancam fructe!");
        }
        //declaram o lista imutabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[]{1, 12, 33, 24});
        //numere.add(99); // eroare , nu mai putem adauga elemente
        System.out.println(numere);

        //declaram o lista dinamica
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(flowerList);

        //aflam unde este Poppy
        int poppy_index = flowerList.indexOf("Poppy");
        System.out.println(poppy_index);

        //stergem ce este in acea pozitie
        flowerList.remove(poppy_index);
        System.out.println(flowerList);

        //scoatem in functie de valoare
        flowerList.remove("Catmint");
        System.out.println(flowerList);


    }
}
