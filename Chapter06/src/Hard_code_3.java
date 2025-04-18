import java.util.Scanner;  //피보나치 수열생성기, 시험문제내기 쉽다고 언급함 읽어라
public class Hard_code_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		int front_num=1;
		int back_num=1;
		num=s.nextInt();
		for (int i =1;i<=num;i++) {
			if (i==1|| i==2) {System.out.print("1 ");
			} else {
				int print_num =front_num+back_num;
				System.out.print(print_num+" ");
				front_num=back_num;
				back_num=print_num;
			}
		}
		
		s.close();
		}
	} 

