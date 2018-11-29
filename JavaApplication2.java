/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author yao-s9
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    System.out.println("Please give three angles");
    Scanner in = new Scanner(System.in);
    int Angle1 = 0;
    int Angle2 = 0;
    int Angle3 = 0; 
    Angle1=in.nextInt();
    Angle2=in.nextInt();
    Angle3=in.nextInt();
    int total = Angle1+Angle2+Angle3; 
    
    if(total<180){
       System.out.println("Cant be Triangle");
    }
    else{ 
       System.out.println("Triangle NA");
    }
    if(Angle1==Angle2||Angle2==Angle3||Angle1==Angle3&&total==180){
        System.out.println("Isosceles");
    }
    else{
        System.out.println("Scalene");
    }
    
    
    }
}
