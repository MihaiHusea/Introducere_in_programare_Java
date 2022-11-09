public class Variabile {
    public static void main(String[] args) {
        //declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        System.out.println("Am cumparat o masina marca " + marcaMasina);
        System.out.println("Este modelul " + modelMasina);

        //suprascriere
        modelMasina = "XC 60 facelift";
        System.out.println("Am cumparat o masina marca " + marcaMasina);
        System.out.println("Este modelul " + modelMasina);

        //declarare
        String nume;
        String prenume;
        int varsta = 35;
        //Initializare
        prenume = "John";
        nume = "Smith";
        //concatenare de stringuri
        System.out.println("Ma numesc " + prenume + " " + nume + " si am varsta de " + varsta + " de ani.");


    }
}

