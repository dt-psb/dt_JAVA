import java.util.Scanner;


public class Hard_code_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		num=s.nextInt();
		boolean result= true;
		if(num<2) result = false;
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					result=false;
					break;
				}
			}
		}
		System.out.println(result);
		s.close();
		}
}


