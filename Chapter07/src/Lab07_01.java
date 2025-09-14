import java.util.Scanner;
class Rabbit {
	String shape; //토끼의 모양
	int xPos; //x위치
	int yPos; //y위치
	
	void setPosition(int x, int y) { //위치 변경 메소드
		xPos =x ;
		yPos=y;
	}
}

public class Lab07_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner 객체 생성
		Rabbit rabbit;//토끼 객체 선언
		int userX, userY;//x,y좌표 입력받을 변수 생성
		
		rabbit=new Rabbit(); // 토끼 객체 생성
		rabbit.shape="토끼";//토끼 모양 설정
		while(true) {//무한 루프
			System.out.print("토끼가 이동할 X좌표 ==> ");
			userX=s.nextInt();//x좌표 입력받아서 저장
			System.out.print("토끼가 이동할 Y좌표 ==> ");
			userY=s.nextInt();//y좌표 입력받아서 저장
			
			rabbit.setPosition(userX, userY);//메소드로 토끼 객체 좌표 변경
			System.out.printf("** 토끼의 현재 위치는 (%d, %d)입니다\n", userX, userY);
		}
		
	}
}
