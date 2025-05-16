
public class Code09_04 {
	public static void main(String[] args) {
		int ary1[] = {100,200,300,400};//배열 ary1선언 및 초기값 지정
		int ary2[] =new int[] {100,200,300};//배열 ary2선언 및 초기값 지정
		int ary3[];//배열 ary3 선언만 하고 초기화는 하지 않음
		ary3=new int[] {100,200};//배열 ary3 초기값으로 초기화
		int[]ary4=new int[1];//크기가 1인 배열 ary4 선언, 생성
		ary4[0]=100;//ary4 배열의 0번째 인덱스에 값 100 저장
		
		for (int i =0; i<4;i++) { //for문으로 ary1 배열 출력
			System.out.printf("ary1[%d]==>%d\t",i,ary1[i]);
		}
		System.out.println();//줄바꿈
		
		for (int i =0; i<3;i++) {//for문으로 ary2 배열 출력
			System.out.printf("ary2[%d]==>%d\t",i,ary2[i]);
		}
		System.out.println();//줄바꿈
		
		for (int i =0; i<2;i++) {//for문으로 ary3 배열 출력
			System.out.printf("ary3[%d]==>%d\t",i,ary3[i]);
		}
		System.out.println();//줄바꿈
		
		for (int i =0; i<1;i++) {//for문으로 ary4 배열 출력
			System.out.printf("ary4[%d]==>%d\t",i,ary4[i]);
		}
		System.out.println();//줄바꿈
	} 
}