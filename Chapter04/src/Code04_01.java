
public class Code04_01 {
	public static void main(String[] args) {
		byte age = 127; // byte형의 최댓값
		short birth = 32767; // short형의 최댓값
		int money = 2147483647; // int형의 최댓값
		
		System.out.println((byte)(age+1));
		//byte형의 최댓값에 1을 더하면 오버플로우발생->최솟값으로 순환, -128출력
		System.out.println((short)(birth+1));
		//short형의 최댓값에 1을 더하면 오버플로우발생->최솟값으로 순환, -32768출력
		System.out.println((int)(money+1));
		//int형의 최댓값에 1을 더하면 오버플로우발생->최솟값으로 순환, -2147483648출력
	}
}
