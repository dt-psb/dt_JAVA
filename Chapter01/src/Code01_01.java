
public class Code01_01 {

	public static void main(String[] args) {
		System.out.println("start");
		
		int a =5;
		int b =10;
		int result = addNumber(a,b);
		
		System.out.println("결과 :"+result);
		
		
	}
	
	public static int addNumber(int x, int y) {
		int sum =x+y;
		return sum;
	}
	
	

}
