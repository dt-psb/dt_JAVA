
public class Code02_08 {
	public static void main(String[ ] args) {
		String str1 = "난생처음";
		String str2 = "자바";
		String s = "HelloWorld";
		System.out.print(str1); //난생처음 출력 (줄바꿈 없음)
		System.out.println(str2); //자바 출력 (줄바꿈 있음)
		
		String result = str1 + str2; //난생처음 + 자바를 result에 저장
		String result2=s.replace("World",""); //s에 있는 World를 공백으로 변환함
		
		System.out.println(result); //result(난생처음자바)를 출력
		System.out.println(result2);//s(Hello)를 출력
	}
}
