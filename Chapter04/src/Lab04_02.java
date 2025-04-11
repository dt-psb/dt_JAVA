
public class Lab04_02 {
	public static void main(String[] args) {
		String ss = "Java";
		System.out.println("원본 문자열 ==> " +ss); //원본 문자열 출력
		String newSS = ""; //변환한 문자열을 저장할 빈 문자열 변수
		
		newSS += ss.substring(0,1).toLowerCase(); //첫번째 문자 J를 소문자로 변환하여 추가
		newSS += ss.substring(1,2).toUpperCase(); //두번째 문자 a를 대문자로 변환하여 추가
		newSS += ss.substring(2,3).toUpperCase(); //세번째 문자 v를 대문자로 변환하여 추가
		newSS += ss.substring(3,4).toUpperCase(); //네번째 문자 a를 대문자로 변환하여 추가
		
		System.out.print("변환 문자열 ==> ");
		System.out.print(newSS); //jAVA 출력
	}
}
