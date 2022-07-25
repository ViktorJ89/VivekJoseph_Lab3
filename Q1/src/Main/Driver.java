package Main;

import Service.Balancing;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Enter the paranthesis");
        Scanner sc=new Scanner(System.in);
        String brack=sc.nextLine();
        Balancing ob=new Balancing();
        Balancing.balancebracket(brack);
        if(ob.balancebracket(brack))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");


    }

}

