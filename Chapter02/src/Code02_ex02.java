
public class Code02_ex02 {
	public static void main(String[ ] args) {
		String text = "Hello, Java";
		System.out.println("길이: "+text.length());
		System.out.println("3번째 분자: "+text.charAt(2));
		System.out.println("부분 문자열: "+text.substring(7));
		System.out.println("대문자로 변환: "+text.toUpperCase());
		
		String text2 = "    Trim Example   ";
		System.out.println("공백 제거: "+"["+text2.trim()+"]");
	}
}