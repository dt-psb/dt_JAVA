
public class Code10_04 {
	static int para2_method(int v1, int v2) {
		int result;//결과를 저장할 변수 선언
		result = v1+v2;//두 매개변수의 합을 저장
		return result;//v1+v2의 값을 반환함
	}
	
	public static void main(String[] args) {
		int hap;
		hap = para2_method(10,20); //메소드를 호출하고 10과 20을 매개변수로 전달
		//메소드에서 반환된 값이 hap에 저장
		System.out.println("매개변수 2개 메서드 호출 결과 ==> " +hap);
	}
}
