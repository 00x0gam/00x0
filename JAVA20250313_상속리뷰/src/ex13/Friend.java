package ex13;

public class Friend extends Person {
	
	private String phoneNum;
	private String email;
	
	Friend(String name, String phoneNum, String email){
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
		
	}
	
	public String getInfo() { 
		return super.getInfo() + "\t" + phoneNum  + "\t" + email; 
		}
	

}
