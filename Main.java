import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
        public static void main(String args[]) {
             
          BigDecimal bd;
          
          Scanner stdIn = new Scanner(System.in);
             
                System.out.println("BMI�̌v�Z");
             
                System.out.print("�E�g��(m)����͂��Ă��������F");
                double height = stdIn.nextDouble(); 
                System.out.print("�E�̏d(Kg)����͂��Ă��������F");
                
                double weight = stdIn.nextDouble(); 
             
                double bmi = weight / Math.pow(height, 2);        
                
                System.out.println("BMI�l��" + (Math.floor(bmi*100))/100);
  
              }
            }                       
        



