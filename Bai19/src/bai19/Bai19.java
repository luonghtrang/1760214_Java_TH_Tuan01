/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai19;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int n = scan.nextInt();
        int tempn = n;
        int nn = n;
        
        int demso = 0;
        while(tempn>0){
            demso++;
            tempn = tempn/10;
        }
        
        System.out.print("Nhập vị trí cần tìm [0-" + (demso-1) +"]:");
        int x = scan.nextInt();
        
        for(int i = demso-1; i >= 0; i--){
            nn = n % 10;
            if(x==i)
                System.out.println("Vị trí "+x+" => Chữ số: "+nn);
            
            n = n/10;
        }
    }
    
}
