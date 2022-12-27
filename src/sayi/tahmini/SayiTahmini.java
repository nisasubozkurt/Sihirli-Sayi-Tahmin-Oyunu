/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sayi.tahmini;
import java.util.Scanner;
public class SayiTahmini {

    public static void main(String[] args) {
  //tahmin edilecek sayıyı üretme
  int sayi = (int)(Math.random()*101);
  //klavyeden giris
  Scanner giris = new Scanner (System.in);
  //kullanıcıdan tahmin etmesi isteniyor
  System.out.println("0 ile 100 arasında sihirli bir sayi tahmin ediniz");
   int tahmin  = -1;
   while(tahmin != sayi){
       System.out.print("\nTahmin ediniz: ");
       tahmin = giris.nextInt();
       
       if(tahmin== sayi){
           System.out.println("Evet, sayi:" + sayi);
       }
       else if(tahmin > sayi){
           System.out.println("Tahmininiz çok yüksek");
       }
       else {
           System.out.println("Tahmininiz çok düşük");
       }
   }
    }
    
}
