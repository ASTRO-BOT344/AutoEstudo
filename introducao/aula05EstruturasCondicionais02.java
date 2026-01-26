package acacemy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >=18 categoria adulto

        int age = 19;
        if(age < 15){
            System.out.println("A pessoa em questão entra na categoria infantil");
        }else if(age >= 15 &&  age <18) {
            System.out.println("A pessoa em questão entra na categoria juvenil");
        }else if(age >=18){
            System.out.println("A pessoa em questão entra na categoria adulto");
        }else{
            System.out.println("Idade invalida");
        }
    }
}
