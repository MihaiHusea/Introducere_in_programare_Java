public class Functii {
    //functie = o logica delimitata care poate fi refolosita
    //nu putem folosi spatii in nume
    //nu putem defini o functie in alta functie

    // o functie simpla care ne printeaza ceva pe ecran si nu returneaza nimic
    //nu ne da nici un raspuns(nu are return)
    //nu are parametri

    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // o functie simpla care saluta clientul in functie de numele lui
    //nu ne da nici un raspuns(nu are return)
    //are nevoie de parametri

    public static void printGreetingByName(String prenume, String nume) {
        System.out.println("Buna ziua " + prenume + " " + nume + "!" + " Bine ati venit!");
    }

    // o functie care calculeaza media a 3 numere
    //ne da un raspuns-media nr. (va avea return)
    //are nevoie de parametri

    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    // o functie care ne da valoarea lui pi
    //ne da un raspuns? Da.
    //raspunsul va fi tip double
    //nu are nevoie de parametri

    public static double piValue() {
        //constanta=variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }

    //aria unui dreptunghi
    public static int ariaDreptunghi(int L, int l) {
        int aria = L * l;
        return aria;
    }

    //aria cercului
    public static double ariaCercului(double R) {
        final double PI = 3.14;
        double aria = PI * (R * R);
        return aria;
    }

    //suma a doua numere
    public static int suma(int a, int b) {
        int suma = a + b;
        return suma;
    }

    //o functie care returneaza cate caractere are numele+prenumele

    public static int nrCaractereNume(String prenume, String nume) {
        int caractere = prenume.length() + nume.length();
        return caractere;
    }

    //nr maxim din 3 numere
    public static int maxim(int a, int b, int c) {
        if (a > b & a > c) {
            return a;
        } else if (b > a & b > c) {
            return b;
        } else {
            return c;
        }
    }


    public static void main(String[] args) { //zona de apelare (desktop)
        //intra clientul 1
        printGreeting(); //se apeleaza functia
        //intra clientul 2
        printGreeting(); //CTRL+Click - navigam la corpul functiei

        //apelam o functie cu parametri , oferind argumente
        printGreetingByName("John", "Wayne");
        printGreetingByName("James", "Bond");
        System.out.println("Media nr este: " + mediaNr(2, 3, 5));
        double media1 = mediaNr(12, 20, 10);
        double media2 = mediaNr(5, 7, 9);
        double media3 = mediaNr(3.5, 8.5, 4.2);
        System.out.println("Media 1 este: " + media1);
        System.out.println("Media 2 esye:" + media2);
        System.out.println("Media 3 este: " + media3);

        System.out.println("Valoarea lui Pi este: " + piValue());
        System.out.println("Valoarea lui Pi este: " + piValue());

        System.out.println("Aria  dreptunghiului este: " + ariaDreptunghi(20, 10) + " mm");
        System.out.println("Aria cercului este: " + ariaCercului(3));
        System.out.println("Suma este: " + suma(3, 5));

        System.out.println("Numele are :" + nrCaractereNume("James", "Bond") + " caractere");
        System.out.println("Nr maxim este: " + maxim(12, 35, 23));

    }
}


