/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int n = scan.nextInt();
        int sumleft=0, sumright=0, demso = 0;
        int tempn = n;
        
        while(tempn>0){
            demso++;
            tempn = tempn/10;
        }
        
        for(int i = 1; i <= demso; i++){
            int temp = n%10;
            if(i == demso)
                sumleft += temp;
            else sumright += temp;
            
            n = n/10;
        }
        
        if(sumleft > sumright)
            System.out.println("Số lệch trái");
        else System.out.println("Số không lệch trái");
    }
    
}
