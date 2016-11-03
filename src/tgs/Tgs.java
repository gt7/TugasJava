
package tgs;
import java.util.Scanner;

public class Tgs {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int n;
       
       System.out.println("======= Membuat Berbagai Bentuk Segitiga Bintang =======");
       System.out.print("Masukan Tinggi Segitiga : ");
       n = input.nextInt();
       
       // Menampilkan segitiga siku-siku kanan atas
       System.out.println("menampilkan segitiga siku siku kanan atas");
       for(int b = 1; b <= n; b++){
           for(int k = 1; k <= n; k++){
                if(k >= b){
                    System.out.print("+");
                }else
                    System.out.print(" ");
            }
           System.out.println();
       }
       System.out.println();
       
       //menampilkan segitiga sama kaki terbalik
       System.out.println("menampilkan segitiga sama kaki terbalik");
       for(int b = 1; b <=n; b++){
           for(int k=1; k<=n; k++){
                if(k>=b){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
           }
           System.out.println();
       }
       System.out.println();
       
       // menampilkan segitiga siku kiri bawah
       System.out.println("menampilkan segitiga siku siku kiri bawah");
       for(int b = 1; b <= n; b++){
           for(int k=1; k<=n; k++){
                if(k<=b){
                    System.out.print("+");
                }else{
                    System.out.print(" ");
                }
            }
           System.out.println();
       }
       System.out.println();
       
       //menampilkan segitiga siku kanan bawah
       System.out.println("menampilkan segitiga siku kanan bawah");
       for (int b=1;b<=n;b++){
            for (int k=b;k<n;k++){
                System.out.print(" ");
            }
            for (int k=0;k<b;k++){
                System.out.print("+");
            }
            System.out.println();
        }
       System.out.println();
       
       System.out.println("menampilkan segitiga siku kiri atas");
       for (int b=n;b>0;b--){
            for (int k=0;k<b;k++){
                System.out.print("+");
            }
            System.out.println();
        } 
    }
    
}
