
public class BankaHesabi {
	private String hesapNo;
	private String email;
	private double bakiye;
	private String isim;
	private String telNo;
	
	public BankaHesabi( String hesapNo,  String email, 
			double bakiye ,String isim,String telNo) {
		
		this.hesapNo= hesapNo;
		this.email = email;			
		this.bakiye = bakiye;		
		this.isim = isim;                        
		this.telNo = telNo;
	}
	@Override
	public String toString(){
		return "\nHesap numarası: "+hesapNo
				+"\nMail Adresi: "+email
				+"\nBakiye: "+bakiye
				+"\nKullanıcı Adı: "+isim
				+"\nTelefon Numarası: "+telNo;
	
	}
	
	public  void paraYatirma(double para) {
		
		bakiye+=para;
		
	}
	
	public void paraCekme(double para) {
		
		if(para>bakiye) {
			System.out.println("Bakiyeniz yetersiz!..");
			
		}
		
		else if(para>5000) {
			System.out.println("Tek seferde alabileceğiniz en yüksek tutar 5000 TL");
			
		}
		else {
			bakiye-=para;
		}
	}
	
	
	public String getHesapNo() {
		return hesapNo;
	}
    public void setHesapNo(String hesapNo) {
	    this.hesapNo = hesapNo;
    }
    public double getBakiye() {
		return bakiye;
	}
    public void setBakiye(double bakiye) {
	    this.bakiye = bakiye;
    }
    public String getIsim() {
    	return isim;
    }
    public void setIsim(String isim) {
    	this.isim = isim;
    }
    
    public String getEmail() {
    	return email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    public String getTelNo() {
    	return telNo;
    }
    public void setTelNo(String telNo) {
    	this.telNo= telNo;
    }
    
}
	
/*public static void main(String[]args) {
		
		BankaHesabi hesabim = new BankaHesabi("1000102039","guclusumeyra90@gmail.com",
			4566.0, "Sümeyra Güçlü","444 0 444"	);
		System.out.println("Hesap bilgilerim "+ hesabim);
		
		//para yatırma
		hesabim.paraYatirma(2344);
		
		System.out.println("Yeni Bakiye: "+ hesabim.getBakiye());



}

	
}*/

