
public class Code06_08 {
	public static void main(String[] args) {
		int hap =0;
		for (int i =1001 ; i<=2000 ; i+=2) { //1000부터 2000까지 홀수를 반복
			//조건식을 i<=2000으로 함으로써 끝값을 2000으로 설정
			//i는 1001, 1003, 1005 ...로 증가
			hap = hap+i;
		}
		System.out.println("1000부터 2000까지의 홀수의 합계 : "+hap);
	} 
}

