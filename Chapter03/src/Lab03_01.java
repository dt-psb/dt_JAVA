import java.util.Scanner;
public class Lab03_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double pound, kg, test;
		
		test=Math.round(5.6);
		System.out.println(test); // 6.0 출력, 소수점 자리에서 반올림됨
		
		System.out.print("파운드(lb)를 입력하세요 : ");
		pound = s.nextDouble();
		kg = pound * 0.453592;
		kg=Math.round(kg*1000.0) / 1000.0; // 소수점을 표기하기 위해서는 반올림할 자릿수만큼 10(100,1000)을 곱하고 반올림 이후 그 만큼 나눠서 소수점자리 표시
		System.out.println(pound + "파운드(lb)는 "+kg+"킬로그램(kg)입니다");
		
		System.out.print("킬로그램(kg)를 입력하세요 : ");
		kg = s.nextDouble();
		pound = kg * 2.204626;
		pound=Math.round(pound*1000.0) / 1000.0;
		System.out.println(kg + "킬로그램(kg)는 "+pound+"파운드(lb)입니다");
	
	}
	
	
}
