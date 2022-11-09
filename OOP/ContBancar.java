package OOP;

public class ContBancar {
    // program files=definim logica unui cont bancar

    // oop=object oriented programming

    // o clasa =este un tip nou
    // este definitia unui concept
    // ex o clasa este reteta la paste carbonara

    // un obiect este instanta unei clase(implementarea clasei)
    // ex un obiect pastele carbonara
    //Ex: 10 obiecte de tip Car

    //fields=proprietati=atribute(sunt variabilele)
    //ex: atribute masina: culoare, marca , model, consum, pret, esteOPrita

    //metode-actiuni ce pot fi facute de catre obiecte
    //functii
    //ex: accelereaza(), franeaza(), deschideUsa(),vopsire()

    //proprietatile
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7767;
    int incercari_activare = 0;


    //constructor= are rolul de a impune date de start(ca si * din formulare-required fields)


    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    //metode
    //actiunile clasei
    public void descriere() {
        System.out.println("Titular: " + this.titularCont);
        System.out.println("IBAN: " + this.iban);
        System.out.println("Sold: " + this.sold);
        System.out.println("Activ: " + this.activ);
        System.out.println("Nr de incercari gresite: " + this.incercari_activare);
        System.out.println("-------------------------------------");
    }

    public void activareCont(int pinUtilizator) {
        //modifica activ in true doar daca pinul este corect
        System.out.println("Buna ziua! " + this.titularCont);
        if (pinUtilizator == this.pin) {
            this.activ = true;
            System.out.println("Cont activat cu succes!");
            System.out.println("-------------------------------------");
        } else {
            System.out.println("PIN gresit!");
            System.out.println("-------------------------------------");
            this.incercari_activare++; // se incrementeaza
        }
    }

    public void alimentare_Cont(double sumaDepusa) {
        //la ce aveam in cont(this.cont) se adauga sumaDepusa
        this.sold = this.sold + sumaDepusa;
        System.out.println("Buna ziua! " + this.titularCont);
        System.out.println("Ati depus cu succes suma de:" + sumaDepusa + " Aveti in cont suma de: " + this.sold);
    }

    public void debitareCont(double sumaDebitata) {
        //pot sa cheltuiesc doar ce am (suma debitata<=sold)
        if (sumaDebitata <= this.sold) {
            //retrag banii din cont
            this.sold = this.sold - sumaDebitata;
            System.out.println("Buna ziua! " + this.titularCont);
            System.out.println("Ati retras cu succes suma de:" + sumaDebitata + " Aveti in cont suma de: " + this.sold);
        } else {
            System.out.println("Buna ziua! " + this.titularCont);
            System.out.println("Suma de " + sumaDebitata + " nu poate fi debitata! Fonduri insuficiente!" + " Aveti in cont suma de: " + this.sold);
        }
    }
}