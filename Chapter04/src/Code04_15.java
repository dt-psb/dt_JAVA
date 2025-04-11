
public class Code04_15 {
	public static void main(String[] args) {
		String str = "난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재미있네요.";
		
		System.out.println(str.indexOf("처음"));
		//"처음"은 2번째 위치에서 시작하므로 2 출력
		System.out.println(str.indexOf("처음"));
		//"처음"은 2번째 위치에서 시작하므로 2 출력
		//그 다음 "처음"을 출력하는 게 아니라 0번째 위치에서 가장 가까운 위치를 출력
		//즉 첫번째 "처음"위치 출력과 동일한 결과 출력
		
		System.out.println(str.indexOf("처음", 4));
		//문자열 str에서 4번째 위치에서 탐색하여 "처음"이라는 문자열이
		//나타나는 위치를 출력, 9번째에서 등장하므로 9 출력
	}
}
