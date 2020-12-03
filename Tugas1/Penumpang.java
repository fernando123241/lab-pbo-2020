/**
 * Write a description of class Penumpang here.
 *
 * @Nama (Fernando Zhahirsyah)
 * @Nim (1908107010026)
 */
public class Penumpang
{
    // instance variables
    private String name;
    private int umur;
    private boolean hamil;
    
    public Penumpang(String name, int umur, boolean hamil){
        this.name = name;
        this.umur = umur;
        this.hamil = hamil;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getUmur(){
        return this.umur;
    }
    
    public boolean getHamil(){
        return this.hamil;
    }
}
