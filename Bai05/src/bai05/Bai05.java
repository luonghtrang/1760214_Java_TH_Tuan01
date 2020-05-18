/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai05;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số km khách hàng đã đi: ");
        int km = scan.nextInt();
        int sum = 0;
        
        if(km == 1)
            sum = 7800000;
        else if(km>1 && km<5)
            sum = 7800000 + (km-1)*500000;
        else sum = 7800000 + 3*500000 + (km-4)*4300000;
        
        System.out.print("Số tiền khách phải trả: "+sum);
    }
    
}
