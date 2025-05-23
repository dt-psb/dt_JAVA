
public class Code10_07 {
	static int hap_para(int v1, int v2) {
		//매개변수를 2개로 받는 메서드
		int result;
		result = v1+v2;
		return result;
	}
	static int hap_para(int v1, int v2, int v3) {
		//매개변수를 3개로 받는 메서드
		int result;
		result = v1+v2+v3;
		return result;
	}
	//매개변수가 다르면 동일한 이름의 메서드가 여러 개 있어도 자바가 알아서 호출된 매개변수에 맞는 메서드를 찾음
	//이를 메서드 오버로등(method overloading)이라고 함
	public static void main(String[] args) {
		int hap;
		//메소드를 호출하고 10과 20을 매개변수로 전달, 반환값 저장
		//매개변수를 2개 사용했기에 2행의 hap_para() 호출
		hap = hap_para(10,20);
		System.out.println("매개변수 2개 메서드 호출 결과 ==> " +hap);
		
		//메소드를 호출하고 10과 20과 30을 매개변수로 전달, 반환값 저장
		//매개변수를 3개 사용했기에 9행의 hap_para() 호출
		hap = hap_para(10,20,30);
		System.out.println("매개변수 3개 메서드 호출 결과 ==> " +hap);
	}
}
