/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int n = scan.nextInt();
        int sumin=0, sumout=0, demso = 0;
        int tempn = n;
        
        while(tempn>0){
            demso++;
            tempn = tempn/10;
        }
        
        for(int i = 1; i <= demso; i++){
            int temp = n%10;
            if(i == 1 || i == demso)
                sumout += temp;
            else sumin += temp;
            
            n = n/10;
        }
        
        if(sumout == sumin)
            System.out.println("Số cân bằng");
        else System.out.println("Không phải là số cân bằng");
    }
    
}
