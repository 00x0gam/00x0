package ex10;

public class SalaryExpr {
	
	private int bonus;
	
	public SalaryExpr(){
		this.bonus = 0;
	}
	
	public SalaryExpr(int bonus){// tlqkf 스펠링
		this.bonus = bonus;
		
	}
	
	int getBonus() {
		return bonus;	
	}
	
	int getSalary(int grade){
		
		switch(grade) {
		case 1:
			bonus += 100;
			break;
		case 2:
			bonus += 90;
			break;
		case 3:
			bonus += 80;
			break;
		case 4:
			bonus += 70;
			break;
			
		}
		
	    return bonus;
				
	}

}
