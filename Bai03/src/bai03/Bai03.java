/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai03;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double x1, x2;

        System.out.print("Nhap he so a: ");
        double a = scan.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scan.nextDouble();
        System.out.print("Nhap he so c: ");
        double c = scan.nextDouble();

        double Denta = b * b - 4 * a * c;
        if (Denta == 0)
        {
            x1 = -b / (2.0 * a);
            x2 = x1;
            System.out.print("Phuong trinh co 1 nghiem duy nhat la: " + x1);
        }
        else if (Denta > 0)
        {
            System.out.print("Phuong trinh co hai nghiem thuc phan biet:");

            x1 = (-b + Math.sqrt(Denta)) / (2 * a);
            x2 = (-b - Math.sqrt(Denta)) / (2 * a);

            System.out.print("Nghiem thu nhat: x1 = " + x1);
            System.out.print("Nghiem thu nhat: x2 = " + x2);
        }
        else
            System.out.print("Phuong trinh vo nghiem.");
    }
    
}
