package week6hw5t3;

import java.util.Scanner;

public class Week6Hw5t3 {
    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        int numStore = 5;
        int NumOfEach100;
        String barChart = "Sales bar chart\n";
        
        for ( int store = 1; store <= numStore; store++){
            System.out.println("Enter today's sales for store " + store);
            double sales = keyIn.nextDouble();
            NumOfEach100 = (int)sales/100;
            barChart += " Store " + store + ": ";
            for( int asterisks = 1; asterisks <= NumOfEach100; asterisks++){
                barChart += "*";
            }
            barChart += "\n";
            
            
        }
        System.out.println(barChart);
    }
    
}
