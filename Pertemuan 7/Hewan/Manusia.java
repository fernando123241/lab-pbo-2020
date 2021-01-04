public class Manusia{
	private String nama;

	public Manusia(String nama) {
		this.nama  = nama;
	}

	public String getNama() {
		return this.nama;
	}

	public void suara() {
		System.out.println("Suara Manusia default");
	}

	public void bernafas() {
		System.out.println("Manusia sedang bernafas...");
	}

	public void makan(){
		System.out.println("Manusia sedang makan...");
	}

	public void berjalan(){
		System.out.println("Manusia sedang berjalan...");
	}
}