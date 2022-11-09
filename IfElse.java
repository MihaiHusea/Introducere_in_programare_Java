import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //Flow control -if else
        //evalueaza conditii si bifurca codul in functie de rezultat

        //if
//        System.out.println("Pornim radioul");
//        boolean piesa_faina = false; // invat calculatorul daca piesa este faina sau nu
//        // daca imi place piesa, dau mai tare
//        if (piesa_faina) {
//            System.out.println("Dau mai tare!");
//            System.out.println("Incep sa cant!");
//        }
//        System.out.println("Oprim radioul");
//
//        //if else
//        int nr = 4;
//        if (nr % 2 == 0) {
//            System.out.println("Numarul este par!");
//        } else {
//            System.out.println("Numarul este impar!");
//
//        }

        // if, else if , else
        //luam date de la tastatura
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduceti ora: ");
//        int ora = sc.nextInt();
//        if (ora<0){
//            System.out.println("Ora invalida!");
//        } else if (ora<=11){
//            System.out.println("Buna dimineata!");
//        }
//        else if (ora<=18){
//            System.out.println("Buna ziua!");
//        }
//        else if (ora<=21){
//            System.out.println("Buna seara!");
//        }
//        else if (ora<=24){
//            System.out.println("Noapte buna!");
//        } else{
//            System.out.println("Ora invalida!");
//        }

        // Exercitiu: viteza<0(invalida) , 0(stationeaza), <=50(localitate), <=90(judetean), <=130(autostarada)
//        Scanner scn=new Scanner(System.in);
//        System.out.println("Introduceti viteza: ");
//        int viteza=scn.nextInt();
//        if (viteza<0){
//            System.out.println("Viteza invalida");
//        } else if (viteza==0){
//            System.out.println("Masina stationeaza ");
//        } else if (viteza<=50){
//            System.out.println("Masina merge in localitate ");
//        } else if (viteza<=90){
//            System.out.println("Masina merge pe drum judetean ");
//        } else if (viteza<=130){
//            System.out.println("Masina merge pe autostrada ");
//        } else {
//            System.out.println("Masina a depasit viteza legala!");
//        }

        //flow control
        //switch-se foloseste cand stim valorile posibile
        Scanner scx = new Scanner(System.in);
        System.out.println("Alege optiunea:");
        int optiunea = scx.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("Meniul anterior");
                break;
            case 1:
                System.out.println("Limba romana");
                break;
            case 2:
                System.out.println("Limba engleza");
                break;
            default:
                System.out.println("Optiune invalida");
        }

    }//inchide functia main
}//inchide clasa
