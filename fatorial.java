package fatorial1;
import java.util.Scanner;
public class fatorial {

	public static void main(String[] args) {
		int N, fat=1;
		java.util.Scanner LerS = new Scanner(System.in);
		System.out.print("Digite um inteiro positivo inferior a 32");
		N=LerS.nextInt();
		for (int M=N; M>=1; M--)
        fat*=M;
        System.out.printf("%d!=%d", N ,fat);
	}

}
