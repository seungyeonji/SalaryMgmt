package com.example.libs;
import java.util.Scanner;

public class Input {
	private Employee [] array;
	private Scanner sc;
	private int count;	//멤버변수 선언
	
	public Input(Employee[] array) {	//생성자     //scanner랑 count는 받아올거니까 파라미터에 필요x
		this.array = array;
		this.sc = new Scanner(System.in);	//표준입력
		this.count = 0;	//초기값 0
	}
	
	public int input() {
		String y_n = null;
		do {
			System.out.print("사원번호 : ");
			String empno = this.sc.nextLine();
			
			System.out.print("사원이름 : ");
			String name = this.sc.nextLine();
			
			System.out.print("기본급 : ");
			int base = this.sc.nextInt();
			
			System.out.print("야근시간 : ");
			int night = this.sc.nextInt();
			
			System.out.print("가족수 : ");
			int family = this.sc.nextInt();
			this.sc.nextLine();	//buffer 날리기
			
			this.array[count++] = new Employee(empno, name, base, night, family);	//++을 count뒤에 쓰면 array의 count번째 방에 넣은 뒤에 ++ 연산, 아니면 그냥 count로 넣고 아래줄에 count++;넣어줘도됨
			
			System.out.print("Again(y/n) ? : ");
			y_n = this.sc.next();
		}while(y_n.equals("Y")||y_n.equals("y"));
		return count;
	}
}
