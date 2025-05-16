
public class Code09_05 {
	public static void main(String[] args) {
		int ary[] = {10,20,30,40,50}; //정수형 배열 ary 선언 및 초기값
		int count, size; //변수 선언
		
		count=ary.length; //배열의 요소 개수를 변수에 저장
		size = count *Integer.BYTES; //배열의 전체 크기를 계산해서 변수에 저장
		
		System.out.println("배열 ary[]의 요소 개수 : " + count); //배열 ary의 요소 개수 출력
		System.out.println("배열 ary[]의 요소 전체 크기 : " + size);//배열 ary의 전체 크기를 출력(바이트 단위)
	} 
}
