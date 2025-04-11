
public class Lab06_02 {
	public static void main(String[] args) {
		int dan, num;
		
		for (dan=2 ;dan<=9 ;dan++) { //2단부터 9단까지
			for (num=1 ; num<=9 ; num++) { //1곱하기부터 9곱하기까지
				System.out.println(dan+" x "+num+" = "+(dan*num)); //2x1 부터 9x9까지 출력
			}
		}
	} 
}

