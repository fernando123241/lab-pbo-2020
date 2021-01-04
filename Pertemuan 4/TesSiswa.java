public class TesSiswa{
 	public static void main(String[] ar){
 	//Attribute
 	Siswa s = new Siswa();
 	Siswa ss = new Siswa(1234567, "Lolow");

 	//ini akan menimbulkan error
 	//Siswa sss = new Siswa(8030002);
 	
 	System.out.println(s.getNrp() + " " + s.getNama());
 	System.out.println(ss.getNrp() + " " + ss.getNama());
	}
}