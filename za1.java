package org.example;
import java.util.Scanner;
public class za1 {
    public static void main (String[] args) {
        String correctPass="hello";
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter new password");
        String userPassword=scanner.nextLine();

        if (userPassword.equals(correctPass)){
            System.out.println("You have access,here is the message");
            System.out.println("jryy qrb");
        }
        else{
            System.out.println("wrong password");
        }
        scanner.close();

    }
}
