
public class Code06_06 {
	public static void main(String[] args) {
		int hap =0;
		for (int i =1 ; i<=10 ; i++) { //10번 반복하라는 의미
			hap = hap+i; // hap+=i; 로 줄일 수 있음
		} //결과상 hap =  1+2+3+4+5+6+7+8+9+10;와 똑같음 
		System.out.println("1부터 10까지의 합계 : "+hap);
	} 
}

