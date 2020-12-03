/**
 * Write a description of class Main here.
 *
 * @Name (Fernando Zhahirsyah)
 * @Nim (1908107010026)
 */
import java.util.Scanner;

public class Main
{
    // instance variables
    static void main(){
       int index;
       int pilihan = 0;
       Bus b1 = new Bus();
       Scanner input = new Scanner(System.in);
       //Tampilan Menu
       System.out.println("===== BUS =====");
       System.out.println("MENU");
       System.out.println("1. Naikkan Penumpang");
       System.out.println("2. Turunkan Penumpang");
       System.out.println("3. Lihat Penumpang");
       System.out.println("4. exit");
       System.out.print("Pilih nomor: ");
       index = input.nextInt();
       //Looping
       while(index !=4){   
           switch (index) {
             case 1:
               while(pilihan != 2 ){
                 //Input
                 System.out.print("Masukan nama : ");
                 String nama = input.next(); 
                 System.out.print("Masukan umur: ");
                 int umur = input.nextInt();
                 System.out.print("Hamil [y/n]: "); 
                 Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("Y")?true:false;
                 //membuat objeck penumpang berdasarkan class bus
                 Penumpang penumpang = new Penumpang(nama, umur, hamil);
                 b1.naikPenumpang(penumpang);
                 //hasilnya
                 b1.toString();
                 System.out.println();
                 //lanjut atau tidak
                 System.out.print("naikkan lagi? (1.iya 2.tidak) :");
                 pilihan = input.nextInt();
                 System.out.println("-----------------------------");
               }
               break;
             case 2: 
                //imput
                System.out.print("\nMasukan nama yang ingin dihapus: ");
                String nama = input.next();
                b1.turunkanPenumpang(nama);
                //hasilnya
                b1.toString();
                System.out.println("============================");
                System.out.println("");
                break;
             case 3:
                //hasil
                b1.toString(); 
                System.out.println("============================");
                System.out.println("");
                break;
             case 4:
                //keluar
                System.exit(0);
                break;
             default:
                //selain 1,2,3,4
                System.out.println("Pilihan salah!");
           }
       }
    
       public static void main(String[] args){
        Penumpang p1 = new Penumpang("Andi ", 12, false);
        Penumpang p2 = new Penumpang("Susi ", 22, false);
        Penumpang p3 = new Penumpang("Apis ", 55, false);
        
        Bus b1 = new Bus();
        b1.naikPenumpang(p1);
        b1.naikPenumpang(p2);
        b1.naikPenumpang(p3);
        
        b1.getJumlahPenumpangPrioritas();
        b1.getJumlahPenumpangBiasa();
        
        b1.toString();
    }
}
