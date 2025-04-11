
public class Code06_07 {
	public static void main(String[] args) {
		int hap =0;
		for (int i =1 ; i<=1000 ; i++) { //1000번 반복하라는 의미
			//조건식을 i<=1000 또는 i<1001로 해야함
			hap = hap+i;
		}
		System.out.println("1부터 1000까지의 합계 : "+hap);
	} 
}

