
public class Ogrenci extends Kisi {
	private int ogrenciNo;
	private String bolumAd;
	private String sınıfBilgi;
	private String memleket;
	
	public int getOgrenciNo() {
		return ogrenciNo;
	}
	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	public String getBolumAd() {
		return bolumAd;
	}
	public void setBolumAd(String bolumAd) {
		this.bolumAd = bolumAd;
	}
	public String getSınıfBilgi() {
		return sınıfBilgi;
	}
	public void setSınıfBilgi(String sınıfBilgi) {
		this.sınıfBilgi = sınıfBilgi;
	}
	public String getMemleket() {
		return memleket;
	}
	public void setMemleket(String memleket) {
		this.memleket = memleket;
	}
	public Ogrenci(long tC, String ad, String soyad, String dogTarih,
			int ogrenciNo, String bolumAd, String sınıfBilgi, String memleket) {
		super(tC, ad, soyad, dogTarih);
		this.ogrenciNo = ogrenciNo;
		this.bolumAd = bolumAd;
		this.sınıfBilgi = sınıfBilgi;
		this.memleket = memleket;
	}
	
	public void derseGit(){
		System.out.println("Derse gittim geleceğim.");
	}
	
	public void kantineGit(){
		System.out.println("Kantinde masa tut.");
	}
}
