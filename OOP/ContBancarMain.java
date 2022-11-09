package OOP;

public class ContBancarMain {
    public static void main(String[] args) {
        //desktop

        //initializam obiecte de tip ConBancar
        //instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("John Wayne", "RO0001");
        ContBancar cont2 = new ContBancar("Mary Wayne", "RO0001");

//        cont1.descriere();
//        cont2.descriere();

        //activam conturile

        cont1.activareCont(7767);
        cont2.activareCont(4345);
        cont2.activareCont(4341);
        cont2.activareCont(7767);
//        cont1.descriere();
//        cont2.descriere();

        //alimentam contul

        cont1.alimentare_Cont(2300.5);
        cont2.alimentare_Cont(3000);
        cont1.alimentare_Cont(500);
        cont2.alimentare_Cont(100);

//        cont1.descriere();
//        cont2.descriere();

        //negative testing-cheluim mai mult decat avem

        cont1.debitareCont(2800.51);
        cont1.descriere();


        //pozitive testing suma exacta

        cont1.debitareCont(2800.5);
        cont1.descriere();

        //pozitive de 2x

        cont2.debitareCont(100);
        cont2.debitareCont(2200);


    }
}
