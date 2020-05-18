/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai08;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = scan.nextInt();
        int sum = 0;
        
        while(N > 0)
        {
            int temp = N%10;
            sum = sum + temp;
            N = N / 10;
        }
        
        System.out.println("Tổng: " + sum);
    }
    
}
