import java.util.Scanner;
public class Lab06_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner 객체 생성
		int computer, user; //변수 선언
		
		for(int i =1; i<=10; i++) { //10번 반복
			computer = (int)(Math.random()*5 +1); //1~5숫자 랜덤으로 지정
			System.out.printf("게임 %d회: ", i);
			System.out.printf("컴퓨터가 생각한 숫자는? ");
			user=s.nextInt();//사용자가 입력한 숫자 저장
			
			if(computer ==user) { //컴퓨터 숫자와 입력한 숫자가 같다면
				System.out.println("맞췄네요. 축하드립니다!");
				break;//반복문 탈출
			}else {//숫자가 다르다면
				System.out.printf(" 아까워요. %d였는데요. 다시 해보세요. ㅠ\n",computer);
				continue; //반복문 처음으로 돌아감
			}
		}
		System.out.println("게임을 마칩니다.");
		s.close();//Scanner 닫기
	} 
}

