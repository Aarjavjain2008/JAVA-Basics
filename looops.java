import java.util.*;
public class Lecture4 {
    public static void main(String args[]){
        // FOR LOOP
        // Counter++ =>  Counter = Counter + 1

        // for(int counter = 0 ; counter < 11  ; counter++){
        //     System.out.print("Aarjav Jain");
        // }

        // for(int counter = 0 ; counter < 11 ; counter++) {
        //     System.out.print(counter+ " ");
        //  }

        // counter is just a variable, u can put any variable for loop like i or n (usually i or j)
        // for(int i = 0; i<11; i++){
        //     System.out.print(i);
        // }

        // WHILE LOOP
        // int i = 0;
        // while(i<11){
        //     System.out.println(i);
        //     i= i + 1; //i++ 
        // }

        //DO WHILE LOOP
        // int i = 0;
        // do { 
        //     System.out.println("BETI PUSHPA");
        //     i++;
        // } while (i<11);
       

        //PROGRAM TO PRINT SUM OF N NATURAL NUMBERS
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            // int sum = 0;
            // for(int i = 1; i <= n; i++){
            //     sum = sum + i;
            // }
            // System.out.println(sum);

        // Print Table of a number input by user
            for(int i=1; i<11; i++ ){
                System.out.println(n*i);
            }

    }    
}   





