
public class Code04_14 {
	public static void main(String[] args) {
		String str = "난생처음 자바";
		
		System.out.println(str.indexOf("난생"));
		//"난생"은 0번째 위치에서 시작하므로 0 출력
		System.out.println(str.indexOf("처"));
		//"처"는 2번째 위치에서 시작하므로 2 출력
	}
}
