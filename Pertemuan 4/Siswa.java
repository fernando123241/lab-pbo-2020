public class Siswa{

	//Attribute
 	private int nrp;
 	private String nama;

 	//Method Constructor
 	public Siswa(){
 		this.nrp = 12345;
 		this.nama = "nama default";
 	}

 	public Siswa(int nrp, String nama){
 		this.nrp = nrp;
 		this.nama = nama;
 	}

 	//Method Accestor
 	public void setNrp(int nrp){
 		this.nrp = nrp;
 	}

 	public void setNama(String nama){
 		this.nama = nama;
 	}

 	//Method Mutattor
 	public int getNrp(){
 		return this.nrp;
 	}

 	public String getNama(){
 		return this.nama;
 	}

 	public String toString(){
 		return this.nrp + "\t" + this.nama + "\n";
 	}
}