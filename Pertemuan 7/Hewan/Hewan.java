public class Hewan {
	private String nama;

	public Hewan(String nama) {
		this.nama  = nama;
	}

	public String getNama() {
		return this.nama;
	}

	public void suara() {
		System.out.println("Suara Hewan default");
	}

	public void bernafas() {
		System.out.println("Hewan sedang bernafas...");
	}

	public void makan(){
		System.out.println("Hewan sedang makan...");
	}

	public void berjalan(){
		System.out.println("Hewan sedang berjalan...");
	}
}