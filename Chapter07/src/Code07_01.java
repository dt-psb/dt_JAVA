
public class Code07_01 {
	public static void main(String[] args) {
	Turtle turtle = new Turtle();//터틀 객체 생성
	int curX, curY;//현재 x,y좌표 저장할 변수
	
	turtle.shape("arrow");//터틀 앞부분 모양
	turtle.shapeSize(50,50);//터틀 모양 크기
	turtle.down();//터틀 내려놓기
	turtle.left(45);//터틀 왼쪽으로 45도 회전 
	turtle.forward(200);//터틀 자신의 방향으로 200 직진
	
	curX=(int) turtle.getX();//현재x좌표 저장
	curY=(int) turtle.getY();//현재y좌표 저장 
	System.out.println("거북이 위치 ==>"+curX+","+curY);//좌표 출력


	} 
}
