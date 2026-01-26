package acacemy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade =15;
        boolean isAuthorizedPurchasableAlcohol = idade >= 18;
        if (isAuthorizedPurchasableAlcohol){
            System.out.println("Está autorizado a beber");

        }else{
            System.out.println("Não está autorizado a beber");
        }
        if (isAuthorizedPurchasableAlcohol == false){
            System.out.println("Não está autorizado a beber");
           // é a mesma coisa que isso: if (!isAuthorizedPurchasableAlcohol){
                //System.out.println("Não está autorizado a beber");
        }
        System.out.println("Fora do if");
    }
}
