package multiplica�aorussa;
import java.util.Scanner;
public class multiplica�aorussa {

	public static void main(String[] args) {
//Variaveis		
		int M , m , m1 , M1 , r ;
		Scanner dados = new Scanner(System.in);
//Codigo Principal
		System.out.print("Qual � o multiplicando? ");
		m=dados.nextInt();
		System.out.print("Qual � o multiplicador ?" );
		M=dados.nextInt();
//Mostrar Leitura
		//System.out.print("O multiplicando �" + m + "\n");
		//System.out.print("O multiplicador �" + M); 
//while
		while (m>1){
		m=m/2;
		System.out.print(m + "\n");
		  //M=M*2;
		
		//System.out.print(M + "\n \n");
		//if (m/2==0)
		       //else(r = r+M);

	
		
		}
	}
}
