import java.util.Scanner;

/**
 *Created on 7/3/2014.
 */

public class Factors {



    public Factors() {

        String userInput;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number you would like to find the factors for \n" +
                "If you would like to quit type: quit");
        do {

            userInput = in.next();
            factorsOf(userInput);
            System.out.print("\n\n");

        }while(in.hasNext());


    }

    public void factorsOf(String s){
        if(s.equalsIgnoreCase("quit")){
            System.exit(0);
        }
            int n;
        try {
            n = Integer.parseInt(s);
        }catch(NumberFormatException nfe){
            System.out.println("Somewhere along the line you didn't enter a number try again");
            return;
        }
        System.out.print("\nThe factors are: ");
        for(int i = 1; i<=n; i++){

            if(n%i==0){
                System.out.print(i+", ");
            }

        }

    }


    public static void main(String[] args){
        new Factors();
    }
}
