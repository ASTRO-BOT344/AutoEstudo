package acacemy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero01 = 100;
        int numero02 = 400;
        double numero03 = 200.0;
        System.out.println("O valor da operação entre 100,  400  e 200.0 é ");
        System.out.println(numero01+numero02/numero03);

        // relacionais %
        int rest = 33 % 2;
        System.out.println(rest);

        // logicos < > <=  >= == !=

        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenMinorThanTwenty = 10 < 20;
        boolean isTenEqualThantwenty = 10 == 20;
        boolean isTenEqualThanTen = 10 == 10;
        boolean isTenDifferentThan20 = 10 != 20;

        System.out.println("10 é maior que 20? "+isTenBiggerThanTwenty);
        System.out.println("10 é menor que 20? "+isTenMinorThanTwenty);
        System.out.println("10 é igual a 20? "+isTenEqualThantwenty);
        System.out.println("10 é igual a 10? "+isTenEqualThanTen);
        System.out.println("10 é diferente que 20? "+isTenDifferentThan20);

        // && (AND) || (OR) !(NOT)
        int age = 30;
        float salario = 3000F;
        boolean isWithinInTheLawBiggerThanThirty = age >= 30 && salario >= 4612;
        boolean isWithinInTheLawMinerThanThirty = age <= 30 && salario >= 3381;

        System.out.println("isWithinInTheLawMinerThanThirty"+isWithinInTheLawBiggerThanThirty);
        System.out.println("pode aposentar?"+isWithinInTheLawMinerThanThirty);

        double valorContaCorrente = 200;
        double valorPoupanca = 10000;
        float playstation5 = 5000f;
        boolean isPs5Purchasable = valorContaCorrente > playstation5 || valorPoupanca > playstation5;

        System.out.println(isPs5Purchasable);

        // = += -= /= *=

        double bonus = 1000;
        bonus += 1000;
        bonus *=2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        contador++;
        contador++;
        int contador2 = 0;
        contador2++;
        contador2++;
        System.out.println(++contador);
        System.out.println(contador2);
    }
}
