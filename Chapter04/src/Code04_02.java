
public class Code04_02 {
	public static void main(String[] args) {
		float f = 0.1234567890123456789012345f;
		//float는 소수점 6~7자리까지 정밀도
		double d = 0.1234567890123456789012345;
		//double은 float보다 더 높은 정밀도 (15~16자리)
		System.out.println(f); //출력값 :  0.12345679
		System.out.println(d);//출력값 :  0.12345678901234568
	}
}
