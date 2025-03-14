package ex10;

import java.util.Scanner;

public class SalaryExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월: ");
		int month = sc.nextInt();
		
		System.out.println("등급(1~4): ");
		int grade = sc.nextInt();
		int salary = 0;
		SalaryExpr expr = null;
		
//		if(month % 2 == 0) {//월 짝수 - 보너스 O
//			expr = new SalaryExpr(100);
//			salary = expr.getSalary(grade);
//			
//		}else {//월 홀수 - 보너스 X
//			expr = new SalaryExpr();
//			salary = expr.getSalary(grade);
//		}
		
		expr = (month % 2 == 0) ? new SalaryExpr(100): new SalaryExpr(0);
		salary = expr.getSalary(grade);
		
		System.out.println
		(month + "월 " + grade + "등급의 월급은 " + salary + "입니다.");
	}

}
