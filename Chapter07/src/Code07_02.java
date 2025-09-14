
public class Code07_02 {
	public static void main(String[] args) {
		String myStr = "My First Life"; //문자열 클래스 객체 생성
		String var1;//문자열 클래스 객체 생성(초기값X)
		
		var1=myStr.toUpperCase(); //대문자로 바꾸는 메소드 사용
		System.out.println(var1);//문자열 출력
		System.out.println(var1.length());//문자열 길이 출력
		System.out.println(var1.isEmpty());//문자열이 공백인지 출력
	} 
}
