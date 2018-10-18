public class KaryawanTest{
	public static void main(String[] args){
		System.out.println("Macam - macam gaji karyawan perusahaan XYZ");
		System.out.println(" ");
		Desaigner a = new Desaigner();
		a.setNama("Aduar");
		a.setAlamat("Bangodua");
		a.setGaji(80);

		System.out.println(" ");
		Pm b = new Pm();
		b.setNama("Fiqi");
		b.setAlamat("Cirebon");
		b.setGaji(90);

		System.out.println(" ");
		Programmer c = new Programmer();
		c.setNama("Juan");
		c.setAlamat("Kalensari");
		c.setGaji(80);

	}
}