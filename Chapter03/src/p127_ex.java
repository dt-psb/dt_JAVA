
public class p127_ex {
	public static void main (String[] args) {
		int age = 20 ; //나이 20살
		boolean hasTicket = true; //티켓이 있는가 -> True
		//and 예제
		if (age>=18 &&hasTicket) { //나이가 18살 이상이면서 티켓을 가지고 있는가
			System.out.println("입장 가능합니다.");
		}else { 
			System.out.println("입장 불가입니다.");
		}
		
		//or 예제
		int score = 85; //점수 85점
		if(score > 90 || score == 85) { //점수가 90점 이상이거나 85점인가
			System.out.println("좋음 점수 입니다.");
		}
		
		//not 예제
		boolean isRain = false; 
		if(isRain) { //isRain이라는 변수가 True인가?
			System.out.println("오늘 날씨는 맑음입니다.");
		}else {
			System.out.println("오늘 날씨는 비입니다.");
		}
	}
}
