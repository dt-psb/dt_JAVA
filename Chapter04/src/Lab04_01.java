
public class Lab04_01 {
	public static void main(String[] args) {
		String ss = "블랙핑크";
		System.out.println("원본 문자열 ==> " +ss); //원본문자열 출력
		
		System.out.print("반대 문자열 ==> "); //"반대 문자열 ==>" 이라는 문자열을 출력
		//문자열 ss의 뒤에서부터 하나씩 출력하여 반대 순서로 출력
		System.out.print(ss.charAt(3));//3번째 문자 '크' 출력
		System.out.print(ss.charAt(2));//2번째 문자 '핑' 출력
		System.out.print(ss.charAt(1));//1번째 문자 '랙' 출력
		System.out.print(ss.charAt(0));//0번째 문자 '블' 출력
		//=>크핑랙블 출력
	}
}
