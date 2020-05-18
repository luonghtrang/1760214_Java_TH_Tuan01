/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai17;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int n = scan.nextInt();
        int min=0, max=0, demso = 0;
        int tempn = n;
        
        while(tempn>0){
            demso++;
            tempn = tempn/10;
        }
        
        for(int i = 1; i <= demso; i++){
            int temp = n % 10;
            if(i == 1){
                min = temp;
                max = temp;
            }
            
            
            if(min>temp)
                min = temp;
            else if(max<temp)
                max =temp;
            
            n = n/10;
        }
        
        for(int i = 1; i <= demso; i++){
            if(i == 1)
                System.out.print(min);
            else if(i == demso)
                System.out.println(max);
            else System.out.print(0);
        }
        
        
    }
    
}
