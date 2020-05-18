/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai02;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai02 {

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
        
        System.out.println("Nhập điểm C: ");
        System.out.print("x: ");
        double Xc = scan.nextDouble();
        System.out.print("y: ");
        double Yc = scan.nextDouble();
        
        double kc_ab = Math.sqrt((Xb-Xa)*(Xb-Xa)+(Yb-Ya)*(Yb-Ya));
        double kc_ac = Math.sqrt((Xc-Xa)*(Xc-Xa)+(Yc-Ya)*(Yc-Ya));
        double kc_bc = Math.sqrt((Xc-Xb)*(Xc-Xb)+(Yc-Yb)*(Yc-Yb));
        
        if(kc_ab > kc_ac && kc_ab > kc_bc)
            System.out.println("Khoảng cách giữa 2 điểm A và B là: " + kc_ab);
        else if(kc_ac > kc_ab && kc_ac > kc_bc)
            System.out.println("Khoảng cách giữa 2 điểm A và B là: " + kc_ac);
        else System.out.println("Khoảng cách giữa 2 điểm A và B là: " + kc_bc);
    }
    
}
