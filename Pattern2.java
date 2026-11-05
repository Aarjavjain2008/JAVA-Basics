import java.util.*;
public class Pattern2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // //upper half
        // for(int i = 1;i<=n;i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     //Spaces
        //     int spaces = 2*(n-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }   
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //Lower Half
        //   for(int i = n;i>=1;i--){
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     //Spaces
        //     int spaces = 2*(n-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }   
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        
        
        
        // for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j = 1 ; j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j = 1; j<=n;j++){
        //         System.out.print("*");
        //     }System.out.println();
        // }

        // for(int i =1;i<=n;i++){
        //     //spaces
        //     for(int j=1; j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //numbers -> print row no., row no. times
        //     for(int j = 1; j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }


        
        // for(int i=1; i<=n; i++){                                  //BOB or Palindrome Questions with numbers
        //     //Spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //1st Half
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j);
        //     }
        //     //2nd Half
        //     for(int j=2; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }  

        int n=4;
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1 ;j++){
                System.out.print("*");
            }
         System.out.println();   
        }
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= (2*i-1) ;j++){
                System.out.print("*");
            }
         System.out.println();   
        }

    }
}
