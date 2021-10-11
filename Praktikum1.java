/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppbop1;
import java.util.Scanner;
/**
 *
 * @author MANGGAR-LAPTOP
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat Program Kasir
        Scanner sc =new Scanner(System.in);
        String kdbrg,nmbrg,jmlbel;
        int hrg,ttlbeli,total;
        System.out.print("-----||Aplikasi Kasir||-----\n->Nama Barang  :");
        nmbrg=sc.next();
        System.out.print("->Harga Barang :");
        hrg=sc.nextInt();
        System.out.print("->Jumlah Beli Barang :");
        ttlbeli=sc.nextInt();
        System.out.println("--------------------------");
        System.out.println("---||Total Harga||---");
        total=ttlbeli*hrg;
        System.out.println("->"+total+"\n---||Grand Total||---");
        int diskon=(total)*5/100;
        System.out.println("->Potongan Harga 5% :"+(diskon));
        System.out.println("->Total Bayar       :"+(total-diskon));
        
    }
}
