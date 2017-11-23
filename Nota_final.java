package Avaliaçaofinal;

import java.util.Scanner;

public class Nota_final {

	public static void main(String[] args) {
    Scanner dados = new Scanner(System.in);
    int cognitivo, atitudes;
    double resultado;
    String nome;
    System.out.println("Digite o seu nome");
    nome = dados.next();
    System.out.println("Qual a nota dos valores cognitivos?");
    cognitivo = dados.nextInt();
    System.out.println("Qual a nota dos valores das atitudes?");
    atitudes = dados.nextInt();
     resultado = (cognitivo * 0.6)+(atitudes * 0.4);
    		 System.out.println("A avaliaçao final é"+ resultado);
     if (resultado<10)
    	  System.out.print(nome + " tem " +resultado+ " valores, reprovou");
     else
    	 System.out.print(nome + " tem " +resultado+ " valores, passou"); 
     

	}

}
