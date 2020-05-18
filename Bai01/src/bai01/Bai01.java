/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai01;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập điểm A: ");
        System.out.print("x: ");
        double Xa = scan.nextDouble();
        System.out.print("y: ");
        double Ya = scan.nextDouble();
        
        System.out.println("Nhập điểm B: ");
        System.out.print("x: ");
        double Xb = scan.nextDouble();
        System.out.print("y: ");
        double Yb = scan.nextDouble();
        
        double kc = Math.sqrt((Xb-Xa)*(Xb-Xa)+(Yb-Ya)*(Yb-Ya));
        System.out.println("Khoảng cách giữa 2 điểm A và B là: " + kc);
    }
    
}
