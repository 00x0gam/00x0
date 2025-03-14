package ex11;

public class GradeExpr {
	private int[] jumsu;
	
	public GradeExpr(int[] jumsu){
		this.jumsu=jumsu;
		
	}
	
	double getAverage() {
		return (double)getTotal()/jumsu.length; //정수 => 실수로 타입 변환
	}                  // 총합/배열 수 => 평균          
	
	int getTotal() {
		int sum =0;
		for(int i=0; i<jumsu.length; i++)
			sum += jumsu[i];
		
		return sum; // 총합
	}
	
	int getGoodScore() {
		int max = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(max < jumsu[i])
				max = jumsu[i];
		}
		return max; // 최대값 반환
	}

	int getBadScore() {
		int min = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(min > jumsu[i])
				min = jumsu[i];
		}
		return min; // 최소값 반환
	}
}
