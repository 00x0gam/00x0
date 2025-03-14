package ex13;

public class FriendTest {

	public static void main(String[] args) {

		Friend Arrarys[] = new Friend[5];
		
		Arrarys[0] = new Friend("고새싹", "010-1234-5678", "adc@gmail.com");
		Arrarys[1] = new Friend("삼색이", "010-1234-5678", "adc@gmail.com");
		Arrarys[2] = new Friend("길막이", "010-1234-5678", "adc@gmail.com");
		Arrarys[3] = new Friend("야통이", "010-1234-5678", "adc@gmail.com");
		Arrarys[4] = new Friend("콩물이", "010-1234-5678", "adc@gmail.com");
	
		for(int i=0; i<5; i++)
			System.out.println(Arrarys[i].getInfo());
		
	}

}
