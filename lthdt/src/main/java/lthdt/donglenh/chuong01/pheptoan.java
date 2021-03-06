/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong01;

/**
 *
 * @author KimAnh
 */
public class pheptoan {
    public static void main(String[]args){
        //Cac phep toan voi so nguyen
        int a = 17, b = 4, c;
        c = a + b;
        System.out.println("Phep cong " + a + " + " + b + " = " + c);
        c = b - a;
        System.out.println("Phep tru " + b + " - " + a + " = " + c);
        c = a*b;
        System.out.println("Phep nhan " + a + " * " + b + " = " + c);
        c = a / b;
        System.out.println("Phep chia lay phan nguyen " + a + " / " + b + " = " + c);
        c = a % b;
        System.out.println("Phep chia lay phan du " + a + " % " + b + " = " + c);
        System.out.println("-------------------------");
        // cac phep toan voi so thuc 
         double x = 14.3, y = 3.56, z;
         z = x + y;
         System.out.println("Phep cong " + x + " + " + y + " = " + z);
         z = y - x;
         System.out.println("Phep tru " + y + " - " + x + " = " + z);
         z = y * x;
         System.out.println("Phep nhan " + y + " * " + x + " = " + z);
         z = y / x;
         System.out.println("Phep chia " + y + " / " + x + " = " + z);
         System.out.println("-------------------------");
         //cac phep toan tren kieu logic
         boolean flag1 = true, flag2 = false, flag3 = true;
         System.out.println("Phep AND " + (flag1 && flag2));
         System.out.println("Phep OR " + (flag1 || flag2));
         System.out.println("Phep NOT " + (!flag1));
         System.out.println("Phep XOR " + (flag1 ^ flag2));
         System.out.println("-------------------------");
         //Mot so phep toan tren chuoi
         String s1 = "Hue University";
         String s2 = "university";
         System.out.println(s1.toLowerCase());
         System.out.println(s2.toUpperCase());
         System.out.println(s1.contains(s2));
         System.out.println(s1.toLowerCase().contains(s2));
         s1 += " " +s2;
         System.out.println(s1);
         System.out.println("-------------------------");
    }
}
