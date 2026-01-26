package acacemy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 2;
        while (count < 10) {
            System.out.println(++count);
        }
        count = 0;
        do {
            System.out.println("dentro do  DO~WHILE" + ++count);
        } while (count < 10);

        for (int i=0;i<10;i++){
        System.out.println("FOR"+i);

        }
    }
}
