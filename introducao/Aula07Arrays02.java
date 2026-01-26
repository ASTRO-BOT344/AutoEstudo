package acacemy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Rudo";
        names[1] = "Itadori";
        names[2] = "Tanjiro";

        for (int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }

    }
}
