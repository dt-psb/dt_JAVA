
public class Code06_15 {
	public static void main(String[] args) {
		int hap=0;
		for (int i=0; i<=100;i++) { //0에서 100까지 반복하는 for문
			if(i%4==0) { //만약 i가 4로 나누었을 때 나머지가 0이라면, 즉 4의 배수라면
				continue; // 아래 부분 실행 안하고 for문 처음으로 돌아감
			}
			hap+=i; // hap = hap + i;
		}
		System.out.println("1~100의 합계(4의 배수 제외) : " + hap);
	} 
}

