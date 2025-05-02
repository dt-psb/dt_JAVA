
public class Lab06_01 {
	public static void main(String[] args) {
		int fact =1; //팩토리얼 계산 용 변수
		int friends_num =5; //친구수
		
		for(int i =1; i<=friends_num ; i++) {//1에서 친구수 만큼 반복
			fact = fact*i; //결과상 1*2*3*4*....*친구수 값이 나옴
		}
		System.out.println("A, B, C, D, E 학생들을 순서대로 세우는 경우의 수 : "+fact);
	} 
}

