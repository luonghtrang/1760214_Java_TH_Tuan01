/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai09;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int n = scan.nextInt();
        int tmp = 0;
        
        int res = 0;
        while(n > 0){
            tmp = n % 10;
            res = res * 10 + tmp;
            n = n / 10;
        }
        
        System.out.print("Số nghịch đảo là: " + res);
    }
    
}
