
public class Test {

	public static void main(String[] args) {
		
		Kisi K1 = new Kisi(654131242163L, "Ali", "Karlı", "1 Nisan 1991");
		
		
		System.out.println("TC: " + K1.getTC());
		System.out.println("Adı: " + K1.getAd());
		K1.gezer();
		K1.uyur();
		
		Ogrenci O1 = new Ogrenci(45648641315L, "Kalu", "uche", "1987", 236, "Bil Müh", "3. sınıf", "uganda");
		
		System.out.println("Öğrenci no: " + O1.getOgrenciNo());
		System.out.println("Bölüm adı: " + O1.getBolumAd());
		System.out.println("Sınıfı: " + O1.getSınıfBilgi());
		System.out.println("Memleketi: " + O1.getMemleket());
		O1.derseGit();
		O1.gezer();
		O1.kantineGit();
		
		Hoca H1 = new Hoca(45613341315L, "Ousman", "Jallow", "1981", 123456789, "İnşaat");
		
		System.out.println("Sicil no: " + H1.getSicilNo());
		System.out.println("Bölümü " + H1.getBolum());

		H1.derseGit();
		H1.gezer();
		H1.sınavYap();
		
		OgretimUyesi Ou = new OgretimUyesi(123456789L, "Malika", "Zazayev", "1968", 4567891423L, "Bilgisayar", "Yar.Doc.");
		
		System.out.println("TC: " + Ou.getTC());
		System.out.println("Adı: " + Ou.getAd());
		System.out.println("Soyadı: " + Ou.getSoyad());
		
		Memur M = new Memur(1236547896L, "Muhittin", "Akalın", "1960", 456978452, "Öğrenci işleri");
		System.out.println("TC: " + M.getTC());
		System.out.println("Adı: " + M.getAd());		
		M.evrakGetir();
		M.evrakGotur();
		
	}

}
