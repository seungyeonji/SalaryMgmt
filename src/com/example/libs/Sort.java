package com.example.libs;

public class Sort {
	private Employee [] array;
	private int count;
	
	public Sort(Employee[] array, int count) {	//생성자
		this.array = array;
		this.count = count;
	}
	
	public void selectionSort() {
		for(int i = 0; i<this.count-1; i++) {
			for(int j = i+1; j<this.count; j++) {
				String front = this.array[i].getEmpno();
				String back = this.array[j].getEmpno();
				if(front.compareTo(back)>0) {	//front가 back보다 크다면(오름차순)
					swap(i, j);
				}
			}
		}
	}
	
	//bubble sort는 옆에 있는 거끼리 비교(j와 j+1), i와 j범위가 같음
	//selection은 i와 j 비교, j는 i 다음부터
	
	//문자열 비교는 compareTo, 대소문자 무시하고 비교할 경우는 compareToIgnoreCase
	//양수(앞에꺼가 큰경우), 음수(앞에꺼가 작은경우), 0(같은경우)
	//오름차순이 되려면 앞에가 커야 바꿈 -> 결과가 양수일때 바꿔야함
	
	private void swap(int front, int back) {	//swap은 private으로 따로 빼기
		Employee temp = this.array[front];
		this.array[front] = this.array[back];
		this.array[back] = temp;
	}
}
