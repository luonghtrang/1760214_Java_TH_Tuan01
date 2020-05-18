/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai04;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Mời bạn nhập 1 ký tự để kiểm tra: ");
        String n = scan.nextLine();
        
        switch(n){
            case "a":
                System.out.println(n+" là nguyên âm");
                break;
            case "e":
                System.out.println(n+" là nguyên âm");
                break;
            case "i":
                System.out.println(n+" là nguyên âm");
                break;    
            case "o":
                System.out.println(n+" là nguyên âm");
                break;
            case "u":
                System.out.println(n+" là nguyên âm");
                break;
            default: System.out.println(n+" là phụ âm");
        }
    }
    
}
