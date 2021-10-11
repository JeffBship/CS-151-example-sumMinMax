

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *
 * @author MANGGAR-LAPTOP
 */
public class Buffer1 {
    public static void main(String[] args) {
        
        int isi=0;
        
        
        
        BufferedReader cobabuf = new BufferedReader(new InputStreamReader(System.in) );
        
        try{
            System.out.println("---|||Penjumlahan Sebuah Angka|||---");
            System.out.print("Masukkan Angka Pertama : ");
            int no1 = Integer.parseInt(cobabuf.readLine());
            System.out.print("Masukkan Angka Kedua : ");
            int no2 = Integer.parseInt(cobabuf.readLine());
            int hasil= no1+no2;
            System.out.println("Hasil Penjumlahan Dari Angka "+no1+" Dan "+no2+" Adalah = "+hasil);
        }
        catch(Exception ex){
            System.out.println("Maaf input sebuah angka salah");
        }
        
    }
}
