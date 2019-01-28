package problema.pkg2;
import java.util.*;
import javax.swing.*;
public class Problema2 {

    
    public static void main(String[] args) {
        Scanner tecla = new Scanner (System.in);
         double salario = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese su salario, por favor "));
         double parte = salario*0.15;
         System.out.println(" Su 15% de "+salario+" es de : "+parte);
        
        
    }
    
}
