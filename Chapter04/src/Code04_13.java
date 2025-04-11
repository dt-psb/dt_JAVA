
public class Code04_13 {
	public static void main(String[] args) {
		String str = "     한글     ABCD     efgh      ";
		String cutStr= "";
		
		cutStr=str.trim(); //trim()은 문자열 앞뒤의 공백을 잘라냄. 문자열 중간의 공백은 제거X
		
		System.out.println("기존 문자열 ==> ["+str+"]");
		//출력 : [     한글     ABCD     efgh      ]
		System.out.println("공백 제거 ==> ["+cutStr+"]");
		//출력 : [한글     ABCD     efgh]
	}
}
