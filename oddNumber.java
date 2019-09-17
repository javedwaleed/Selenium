package newpackage;

import java.sql.SQLOutput;

public class oddNumber {
    public static void main(String[] args) {
        int number = 50;
        int remainder = number % 2;
        if(remainder==1){
            System.out.println("odd number");
        }
        else{
            System.out.println("even number");
        }
    }
}

