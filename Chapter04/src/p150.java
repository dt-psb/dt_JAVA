
public class p150 {
	public static void main(String[] args) {
		char a = 'A'; //아스키코드 /  유니코드와 값은 같음
		char h = '가';//유니코드
		char n = '中';//유니코드
		int m = 20013;//유니코드
		
		System.out.println(a); //a 출력
		System.out.println(h);//h 출력
		System.out.println("=========================");
		
		System.out.println((int)a); //변수 a를 int로 변환하여 a의 유니코드 값 출력
		System.out.println((int)h); //변수 h를 int로 변환하여 h의 유니코드 값 출력
		System.out.println((int)n); //변수 n를 int로 변환하여 n의 유니코드 값 출력
		System.out.println((char)m); //정수형 변수 m을 char로 변환하여 해당 유니코드 문자 출력
		
	}
}
