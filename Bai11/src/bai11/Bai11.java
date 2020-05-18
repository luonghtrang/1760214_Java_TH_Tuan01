/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = scan.nextInt();
        int demso = 0;
        
        int dem = 0;
        while(N > 0)
        {
            demso++;
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
        
        if(demso/2 < dem)
            System.out.println("Là số thần tài");
        else System.out.println("Không là số thần tài");
        
    }
    
}
