/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai06;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số tiền cần rút: ");
        int sotien = scan.nextInt();
        int demnamtram=0, demmottram=0, demnamchuc=0, demmuoi=0;
        
        while(sotien >= 500000){
            demnamtram++;
            sotien -= 500000;
        }
        
        while(sotien >= 100000){
            demmottram++;
            sotien -= 100000;
        }
        
        while(sotien >= 50000){
            demnamchuc++;
            sotien -= 50000;
        }
        
        while(sotien >= 10000){
            demmuoi++;
            sotien -= 10000;
        }
        
        System.out.println("Các mệnh giá là: " + demnamtram + " tờ 500,000 và " + demmottram + " tờ 100,000 và " + demnamchuc + " tờ 50,000 và " + demmuoi + " tờ 10,000");
    }
    
}
