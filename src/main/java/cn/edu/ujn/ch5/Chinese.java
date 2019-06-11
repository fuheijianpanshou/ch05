package cn.edu.ujn.ch5;

public class Chinese implements IHuman{
	
	private ILanguage language;
	private ILanguage language2;
	
	

	public void setLanguage(ILanguage language) {
		this.language = language;
	}
	
	



	public void setLanguage2(ILanguage language2) {
		this.language2 = language2;
	}





	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("中国人讲!"+language.kind());
		System.out.println("......"+language2.kind());
		
	}

}
