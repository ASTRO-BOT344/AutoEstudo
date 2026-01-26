package acacemy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 4000;
        String messagemDonate = "Eu vou doar 500 para o paçoca";
        String messageNotDonate = "Eu não vou doar para o paçoca, por falta de condições";
        String result = salario > 5000 ?"Eu vou doar 500 para o paçoca" : "Eu não vou doar para o paçoca, por falta de condições";
        System.out.println(result);
    }
}
