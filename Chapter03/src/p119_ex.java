
public class p119_ex {
	public static void main(String[] ars) {
		int a = 5;
		int b = ++a; // a를 먼저 증가시키고, b에 대입
		System.out.println("전위 증가 : a = " +a+", b =  "+ b);
		
		int x = 5;
		int y = x++; // x를 먼저 대입한 뒤 증가
		System.out.println("후위 증가 : x = " +x+", y =  "+ y);
		

	}
}
