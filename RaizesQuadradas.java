package raizesquadradas;
import java.util.Scanner;
public class RaizesQuadradas {
	static void RaizesQuadradas(int linf,int lsup)
    {Scanner LerS = new Scanner (System.in);
    
     System.out.print("Qual o numero minimo ?");
     linf=LerS.nextInt();
        System.out.print("Qual o numero maximo ?");
        lsup=LerS.nextInt();
            for (int I = linf; I <= lsup; I++)
       
                System.out.print(String.format("%5.1f",Math.sqrt(I)));
}       
    public static void main(String[] args)
    {  
        {int lsup=0, linf=0;
        
        
        RaizesQuadradas (linf,lsup);
 
             
     
     
        }
    }
}
		




