
package carlos1;
import java.util.Scanner;
import java.util.*;
public class Carlos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre =sc.nextLine();
        System.out.println("hola " +nombre);
        
        int num;
        Scanner n = new Scanner(System.in);
      System.out.println("ingrese un  numero: ");
      num=n.nextInt();
      
      if(num<0){
          System.out.println("El numero es negativo");  
    }
      else{
       System.out.println("El numero es positivo");    
          } 
    }  
    
    
}
