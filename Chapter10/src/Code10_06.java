
public class Code10_06 {
	static int hap_para2(int v1, int v2) {
		//매개변수를 2개로 받는 메서드
		int result;
		result = v1+v2;
		return result;
	}
	static int hap_para3(int v1, int v2, int v3) {
		//매개변수를 3개로 받는 메서드
		int result;
		result = v1+v2+v3;
		return result;
	}
	//필요에 따라 이름이 다른 메서드를 만들어 사용
	public static void main(String[] args) {
		int hap;
		hap = hap_para2(10,20); //메서드 호출 및 반환 값 저장
		System.out.println("매개변수 2개 메서드 호출 결과 ==> " +hap);
		
		hap = hap_para3(10,20,30); //메서드 호출 및 반환 값 저장
		System.out.println("매개변수 3개 메서드 호출 결과 ==> " +hap);
	}
}
