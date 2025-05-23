
public class Code10_05 {
	static int para3_method(int v1, int v2, int v3) {
		int result;//결과를 저장할 변수 선언
		result = v1+v2+v3;//세 개의 매개변수의 합을 저장
		return result;//v1+v2+v3의 값을 반환함
	}
	
	public static void main(String[] args) {
		int hap;
		//메소드를 호출하고 10과 20과 30을 매개변수로 전달
		//메소드에서 반환된 값이 hap에 저장
		hap = para3_method(10,20,30);
		System.out.println("매개변수 3개 메서드 호출 결과 ==> " +hap);
	}
}
