/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai07;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = scan.nextInt();
        
        int dem = 0;
        while(N > 0)
        {
            int temp = N%10;
            int demnguyento=0;
            for(int i = 1; i<=temp; i++){
                if(temp % i == 0)
                    demnguyento++;
            }
            
            if(demnguyento == 2)
                dem++;
            
            N = N/10;
        }
        
        System.out.println("Đếm được "+dem);
    }
    
}
