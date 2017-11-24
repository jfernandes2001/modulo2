package primeirospontos;

import java.util.Scanner;

public class primeiros_pontos {
    public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
    	
		int soma=0;
		int num;
			System.out.println("Qual o numero a introduzir?");
		    num = l .nextInt ();
			for(int I = 1 ; I<=10 ; I++) {
			soma +=I;
			
		}
		System.out.println("O total é "+soma);			
	}

}
