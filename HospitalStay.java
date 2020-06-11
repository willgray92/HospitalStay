/*Will Gray linked in Challenge
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalstay;
import java.util.Scanner;

/**
 *
 * @author will
 */
public class HospitalStay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double medCharges =0, labCharges = 0, hospitalCharges = 0, totalCost;
        String response = "";
        do{
            if(checkForOvernight()== true)
            {
                System.out.println("Enter the cost of the hospital stay: ");
                hospitalCharges = input.nextDouble();
            }
            else
            {
                hospitalCharges = 0;
            }
            System.out.println("Enter the medication charges:");
            medCharges = input.nextDouble();
            System.out.println("Enter the lab charges:");
            labCharges = input.nextDouble();
            totalCost = hospitalCharges + medCharges + labCharges;
            printTotal(totalCost);
            System.out.println("Do you have another patient? (y/n)");
            response = input.next();
            
        }while(response.equalsIgnoreCase("y"));
      
    }
     public static boolean checkForOvernight()
     {
         Scanner input = new Scanner(System.in);
         String response = "";
         System.out.println("Is this and overnight stay? (y/n)");
         response = input.next();
         if (response.equalsIgnoreCase("y"))
             return true;
         else
             return false;
         
     
     }
   public static void printTotal(double totalCost)
    {
        System.out.printf("The total cost for this patient is: $%6.2f",totalCost);
        System.out.println("\n");
    }
}