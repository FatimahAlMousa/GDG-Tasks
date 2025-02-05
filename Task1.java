import java.util.Scanner;
import java.util.InputMismatchException;
public class Task1
{
    public static void main(String[] args){
        double amount=0;
        double tip=0;
        boolean flag = true;
        Scanner input=new Scanner(System.in);
       do {
        
            try{
                
            System.out.print("bill amount: ");
            amount=input.nextDouble();
            System.out.print("tip rate: ");
            tip=input.nextDouble();

            if (amount < 0 || tip < 0) {  
                System.out.println("Values must be positive!"); 
                flag = false; 
            } else { 
                flag = true; 
            }
            

        
        
        }catch(Exception e){
            System.out.println("Please enter a valid invoice amount number!");
            input.next();
            flag=false;
        }
    
        
       
    } while (!flag);   

        System.out.println("Expected result: ");
        double res=calcTip(amount,tip);
        System.out.print("Tip: "+ res );
        System.out.println("");
        double resultTotal=res+amount;
        System.out.print("Total: "+resultTotal );
        input.close();   

      
    }

    public static double calcTip(double amount, double tipR){
        double Tip=(tipR/100)*amount;
        return roundUp(Tip);
    }

    public static double roundUp(double n){
        return Math.ceil(n*20)/20;
    }
    
}
