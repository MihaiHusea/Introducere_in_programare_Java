
/*Operatori:

Aritmetici: +,-,*,/,%
De comparare: <,>,==,!=,>=,<=
Logici: &&(and), ||(or), !(not)

 */
public class Operatori {
    public static void main(String[] args) {
        int a = 3; //declarare && initializare
        int b = 5;
        a = b; //suprascriere
        System.out.println(a + b); //adunare
        System.out.println(a - b); //scadere
        System.out.println(a * b); //inmultire
        System.out.println(a / b); //impartire
        System.out.println(a % b); //modulo -> restul impartirii
        System.out.println(11 % b);
        System.out.println(12 > 5); //12 mai mare decat 5?  => true
        System.out.println(5 > 5); //false
        System.out.println(a - 1 >= b); //false
        System.out.println(a != b); //a diferit de b? => false
        System.out.println(7 > b && 8 > b); //7>5 si 8>5 ? =>true
        System.out.println(7 > b && 3 > b); //7>5 si 3>5 ? =>false
        System.out.println(7 > b || 3 > b); //7>5 sau 3>5 ? =>true
        System.out.println(7 > b && (2 > b || 3 > b)); //true && false => false
        System.out.println(7 > b || (2 > b || 3 > b)); //true || false => true
        System.out.println(!(7 > b)); // !true=>false
    }
}
