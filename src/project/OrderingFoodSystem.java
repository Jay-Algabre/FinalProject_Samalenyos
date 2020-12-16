/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.Scanner;

/**
 *
 * @author Mystery Password
 */
public class OrderingFoodSystem {
    public static Scanner input = new Scanner(System.in);
    public static String again,name;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("\t\t\t\t+========================================+");
    System.out.println("\t\t\t\t             SAMAL SPECIAL BILAO          ");
    System.out.println("\t\t\t\t   1. Samal Burger             Php. 30.00 ");
    System.out.println("\t\t\t\t   2. Samal French Fries       Php. 35.00 ");
    System.out.println("\t\t\t\t   3. Samal Footlong           Php. 40.00 ");
    System.out.println("\t\t\t\t   4. Samal Spaghetti          Php. 45.00 ");
    System.out.println("\t\t\t\t   5. Samal Milktea            Php. 50.00 ");
    System.out.println("\t\t\t\t   6. Samal Sundae             Php. 30.00 ");
    System.out.println("\t\t\t\t   7. CANCEL ORDER                        ");
    System.out.println("\t\t\t\t+========================================+");
    
    System.out.println("Enter your Name: ") ;
    name = input.next();
    }
    public static void order(){
    
    System.out.println("Press 1 to Samal Burger          Press 2 to Samal French Fries          Press 3 to Samal Footlong\n"
                     + "Press 4 to Samal Spaghetti       Press 5 to Samal Milktea               Press 6 to Sundae\n"
                     + "Press 7 to Cancel your Order\n");
    System.out.println("Press you want to buy? :");
    choose = input.nextInt();
    //conditions
    if(choose==1){
        System.out.println("You choose Samal Burger");
        System.out.println("\nHow many Samal Burger you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*30);
        
        System.out.println("\nYou want to buy again? ");
        System.out.println("Press Y for Yes and N for N : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("\t\t\t\t+=======================================+");
            System.out.println("\t\t\t\t                 Recepit                 ");
            System.out.println("\t\t\t\t                                         ");
            System.out.println("\t\t\t\t   Customer's Name: " + name + "              ") ;
            System.out.println("\t\t\t\t   Total price is " + total + "                 ");
            total = pay-total;
            System.out.println("\t\t\t\t   The change is " + total + "                  ");
            System.out.println("\t\t\t\t                                         ");
            System.out.println("\n\t\t\t                 Thank you! Come Again!         ");
            System.out.println("\t\t\t\t+=======================================+\n\n");
            }
        }
    }else if(choose==2){
        System.out.println("You choose Samal French Fries");
        System.out.println("How many Samal French Fries you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*35);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for N : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("\t\t\t\t+=======================================+");
            System.out.println("\t\t\t\t                 Recepit                 ");
            System.out.println("\t\t\t\t                                         ");
            System.out.println("\t\t\t\t   Customer's Name: " + name + "              ") ;
            System.out.println("\t\t\t\t   Total price is " + total + "                 ");
            total = pay-total;
            System.out.println("\t\t\t\t   The change is " + total + "                  ");
            System.out.println("\t\t\t\t                                         ");
            System.out.println("\n\t\t\t                 Thank you! Come Again!         ");
            System.out.println("\t\t\t\t+=======================================+\n\n");
            }
        }
    }else if(choose==3){
        System.out.println("You choose Samal Footlong");
        System.out.println("How many Samal Footlong you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*40);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for N : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("\t\t\t\t+=======================================+");
            System.out.println("\t\t\t\t                 Recepit                 ");
            System.out.println("\t\t\t\t                                         ");
            System.out.println("\t\t\t\t   Customer's Name: " + name + "              ") ;
            System.out.println("\t\t\t\t   Total price is " + total + "                 ");
            total = pay-total;
            System.out.println("\t\t\t\t   The change is " + total + "                  ");
            System.out.println("\t\t\t\t                                         ");
            System.out.println("\n\t\t\t                 Thank you! Come Again!         ");
            System.out.println("\t\t\t\t+=======================================+\n\n");
            }
        }
    }else if(choose==4){
        System.out.println("You choose Samal Spaghetti");
        System.out.println("How many Samal Spaghetti you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*45);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for N : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("\t\t\t\t+=======================================+");
            System.out.println("\t\t\t\t                 Recepit                 ");
            System.out.println("\t\t\t\t                                         ");
            System.out.println("\t\t\t\t   Customer's Name: " + name + "              ") ;
            System.out.println("\t\t\t\t   Total price is " + total + "                 ");
            total = pay-total;
            System.out.println("\t\t\t\t   The change is " + total + "                  ");
            System.out.println("\t\t\t\t                                         ");
            System.out.println("\n\t\t\t                 Thank you! Come Again!         ");
            System.out.println("\t\t\t\t+=======================================+\n\n");
            }
        }
    }else if(choose==5){
        System.out.println("You choose Samal Milktea");
        System.out.println("How many Samal Burger you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*50);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for N : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("\t\t\t\t+=======================================+");
            System.out.println("\t\t\t\t                 Recepit                 ");
            System.out.println("\t\t\t\t                                         ");
            System.out.println("\t\t\t\t   Customer's Name: " + name + "              ") ;
            System.out.println("\t\t\t\t   Total price is " + total + "                 ");
            total = pay-total;
            System.out.println("\t\t\t\t   The change is " + total + "                  ");
            System.out.println("\t\t\t\t                                         ");
            System.out.println("\n\t\t\t                 Thank you! Come Again!         ");
            System.out.println("\t\t\t\t+=======================================+\n\n");
            }
        }
    }else if(choose==6){
        System.out.println("You choose Samal Sundae");
        System.out.println("How many Samal French Fries you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*30);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for N : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("\t\t\t\t+=======================================+");
            System.out.println("\t\t\t\t                 Recepit                 ");
            System.out.println("\t\t\t\t                                         ");
            System.out.println("\t\t\t\t   Customer's Name: " + name + "              ") ;
            System.out.println("\t\t\t\t   Total price is " + total + "                 ");
            total = pay-total;
            System.out.println("\t\t\t\t   The change is " + total + "                  ");
            System.out.println("\t\t\t\t                                         ");
            System.out.println("\n\t\t\t                 Thank you! Come Again!         ");
            System.out.println("\t\t\t\t+=======================================+\n\n");
            }
        }
    }else if(choose==7){
        System.exit(0);//close program
    }else{
        System.out.println("Choose 1 to 6 only!");
        order();
    }
    
    
    }
}