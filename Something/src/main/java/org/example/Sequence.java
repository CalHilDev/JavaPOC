package org.example;
import java.util.Scanner;

public class Sequence {

    public static void getInput(){
        Scanner user_input = new Scanner(System.in);

        String sequence_limit;
        System.out.print("Enter the number of iterations for the sequence: ");
        sequence_limit = user_input.next();
        int limit_value = Integer.parseInt(sequence_limit);
        runSequence(limit_value);
    }

    public static int runSequence(int limit_value){
        //int n = 1;
        int current_value = 1;
        if(limit_value <= 0){
            current_value = 0;
        }
        for(int i = 1; i <= limit_value; i++){
            current_value *= i;
        }
        /*while(n <= limit_value){
            current_value *= n;
            n += 1;
        }*/
        return current_value;
    }

}
