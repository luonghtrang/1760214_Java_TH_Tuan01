/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int num = scan.nextInt();
        
        int r,sum=0,temp;
        
        for(temp=num;num!=0;num=num/10){
         r=num%10;
         sum=sum*10+r;
        }
        if(temp==sum)
             System.out.println("Là số đối xứng: ");
        else
             System.out.println("Không phải số đối xứng");
        }
    
}
