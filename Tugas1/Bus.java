/**
 * Write a description of class Bus here.
 *
 * @Name (Fernando Zhahirsyah)
 * @Nim (1908107010026)
 */
import java.util.ArrayList;

public class Bus
{
    // instance variables
    ArrayList<Penumpang> penumpangBiasaa;
    ArrayList<Penumpang> penumpangPrioritas;
    ArrayList<Penumpang> penumpangTotal;
    
    /*
     * Penampungan penumpang biasa, prioritas dan total
     */
    public Bus(){
       penumpangBiasaa = new ArrayList<Penumpang>();
       penumpangPrioritas = new ArrayList<Penumpang>();
       penumpangTotal = new ArrayList<Penumpang>();
    }
    
    /*
     * mengembalikan list penumpang biasa yang diminta.
     */
    public ArrayList<Penumpang> getPenumpangBiasa(){
        for(Penumpang penumpang:penumpangBiasaa){
            penumpang.getName();
        }
        return penumpangBiasaa;
    }
    
    /*
     * mengembalikan list penumpang prioritas yang diminta.
     */
    public ArrayList<Penumpang> getPenumpangPrioritas(){
        for(Penumpang penumpang : penumpangPrioritas){
            penumpang.getName();
        }
        return penumpangPrioritas;
    }
    
    /*
     * + getJumlahPenumpangBiasa(): int
     *  mengembalikan jumlah penumpang biasa yang diminta.
     */
    public int getJumlahPenumpangBiasa(){
        System.out.println();
        int jumlahBiasa = penumpangBiasaa.size();
        System.out.println("Jumlah penumpang biasa = " +jumlahBiasa);
        return jumlahBiasa;
    }
    
    /*
     * + getJumlahPenumpangPrioritas(): int
     *  mengembalikan jumlah penumpang prioritas yang diminta.
     */
    public int getJumlahPenumpangPrioritas(){
        System.out.println();
        int jumlahPrioritas = penumpangBiasaa.size();
        System.out.println("Jumlah penumpang biasa = " +jumlahPrioritas);
        return jumlahPrioritas;
    }
    
    /*
     * total penumpang = penumpang biasa + penumpang prioritas
     */
    public int getJumlahTotalPenumpang(){
        return penumpangBiasaa.size() + penumpangPrioritas.size();
    }
    
    /*
     * + NaikPenumpang(penumpang: Penumpang): boolean
     */
    public boolean naikPenumpang (Penumpang penumpang){
        int b=4, p=2;//Batas kursi
        if((penumpangPrioritas.size() < p ) && ((penumpang.getUmur()<10 || penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang prioritas bernama "+penumpang.getName()+" dinaikkan...");
            return penumpangPrioritas.add(penumpang);
        }else if(penumpangBiasaa.size() < b ){
            System.out.println("Penumpang biasa bernama "+penumpang.getName()+" dinaikkan...");
            return penumpangBiasaa.add(penumpang); 
        }else{
           System.out.print("Penumpang bernama " +penumpang.getName()+ "tidak bisa dinaikkan");
           System.out.println("| Kursi Full |");
           System.out.println();
           return false;
        }
    }
    
    /*
     * + turunkanPenumpang(nama: String): boolean
     */
    public boolean turunkanPenumpang(String name){
        //Mencari nama pada penumpang biasa untuk di
       for (int i = 0; i < penumpangBiasaa.size(); i++) {  
           if(name.equals(penumpangBiasaa.get(i).getName())){
               penumpangBiasaa.remove(i);
               System.out.println("penumpang biasa bernama "+name+" diturunkan");
               return true;
          } 
       }
       //Mencari nama pada penumpang prioritas untuk diturunkan
       for (int i = 0; i < penumpangPrioritas.size(); i ++){
           if(name.equals(penumpangPrioritas.get(i).getName())){
               penumpangPrioritas.remove(i);
               System.out.println("penumpang prioritas bernama "+name+" diturunkan");
               return true;
           }
       }
       //Mengecek nama penumpang biasa dan prioritas
       for (int i = 0; i < penumpangTotal.size(); i ++) {  
           if(( name !=(penumpangPrioritas.get(i).getName()) || (name != penumpangBiasaa.get(i).getName()))){
               System.out.println("Tidak Ada penumpang "); 
               return false;
           }
       }
       return true;
    }
    
    /*
     * mengisi total penumpang
     */
    public ArrayList<Penumpang> penumpangTotal(){
        penumpangTotal = penumpangBiasaa;
        penumpangTotal.addAll(penumpangPrioritas);
        System.out.print("Total penumpang = ");
        for(Penumpang penumpang : penumpangTotal)
        {
            System.out.print(penumpang.getName()+ ", ");
        }
        return penumpangTotal;
    }
    
    /*
     * mencetak daftar nama Penumpang Biasa, Penumpang
     * Prioritas, dan Jumlah semua penumpang
     */
    public String toString(){
        String hasil1 = " ";
        String hasil2 = " ";
        //Menyimpan penumpang
        for(Penumpang penumpang : penumpangBiasaa){
            hasil1 += penumpang.getName().toString(); 
        }
        for(Penumpang penumpang : penumpangPrioritas){
            hasil2 += penumpang.getName().toString();
        }
        //Menampilkan penumpang
        if(penumpangBiasaa.isEmpty() == true ){  
            System.out.println("nama anggota penumpang Biasa = tidak ada") ;
        }else{
            System.out.println("nama anggpta penumpang biasa = " +hasil1);
        }
        if(penumpangPrioritas.isEmpty() == true ){  
            System.out.println("nama anggota penumpang prioritas = tidak ada") ;
          }else{
            System.out.println("nama anggota penumpang prioritas = " +hasil2);
          }
          
        System.out.println("total semua penumpang = " +getJumlahTotalPenumpang());
        
        return "nama anggota penumpang biasa = "+hasil1+" nama anggota penumpang prioritas = "+hasil2+" jumlah penumpang = "+getJumlahTotalPenumpang()+"\n";
    }
}
