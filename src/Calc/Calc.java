package Calc;
//Importanto o scanner para receber valores do teclado
import Numero.Numero;

import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
    //Criando o scanner
    Scanner scan=new Scanner(System.in);

    //Instanciando objetos e o metodo principal junto com a estrura de looping
    Numero n1=new Numero();
    Numero n2=new Numero();
    Numero resultado=new Numero();
    String opt="S";

    while(opt.equals("s") || opt.equals("S")){
    System.out.println("Digite o primeiro valor: ");
    n1.setValor(scan.nextDouble());
    System.out.println("Digite o segundo valor: ");
    n2.setValor(scan.nextDouble());
    resultado.setValor(n1.getValor() + n2.getValor());
    System.out.println("Resultado final: " + resultado.getValor());
    System.out.println("Deseja somar mais algum valor?");
    opt=scan.next();
    System.out.println("Digite o primeiro valor: ");
    n1.setValor(scan.nextDouble());
    System.out.println("Digite o segundo valor: ");
    n2.setValor(scan.nextDouble());
    resultado.setValor(n1.getValor() + n2.getValor());
    System.out.println("Resultado final: " + resultado.getValor());
    System.out.println("Deseja somar mais algum valor?");
    opt=scan.next();
        }
    }
}
