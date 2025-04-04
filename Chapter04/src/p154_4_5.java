
public class p154_4_5 {
	public static void main(String[] args) {
		int intVal = 4255;
		long longVal = 123456789L;
		double doublVal=3.14159;
		String strVal ="Java";
		
		//정수 서식 : %d
		System.out.printf("%%d : %d (int 값) \n", intVal);
		System.out.printf("%%d : %d (long 값) \n", longVal);
		
		//실수 서식 :%f
		System.out.printf("%%f : %f (double 값) \n", doublVal);
		System.out.printf("%%f : %.2f (소수점 2자리) \n", doublVal);
		
		//문자열 서식 : %s
		System.out.printf("%%s : %s (문자열) \n", strVal);
		
		//문자 서식 : %c
		System.out.printf("%%c : %c (문자) \n", 'A');
		
		//16진수 출력 : %x
		System.out.printf("%%x : %x (16진수 int 출력) \n", intVal);
		
		// 부호 포함 : %+d
		System.out.printf("%%+d : %+d (양수에도 부호 표시) \n", intVal);
		
		// 자리수 맞춤 : %5d (오른쪽 정렬)
		System.out.printf("%%5d :  [%5d]\n", intVal);
		//자리수 맞춤 : %,6d(오른쪽 정렬 + , 표시)
		System.out.printf("%%,6d : [%,06d]\n", intVal);
		// 자리수 맞춤 : %05d (오른쪽 정렬), 빈칸을 0으로 채움
		System.out.printf("%%05d :  [%05d]\n", intVal);
		
		//왼쪽 정렬 : %-5d
		System.out.printf("%%-5d :  [%-5d]\n", intVal);
		//좌측방향으로 정렬할 경우 빈칸을 0으로 채우지 못함
	}
}
