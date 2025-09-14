import java.util.Arrays;
public class Lab10_02 {
	static int lotto_method() {
		int lottoNum = (int)(Math.random()*45+1);//1~45 정수 랜덤 생성
		return lottoNum;//생성한 랜덤 숫자 반환
	}
	
	public static void main(String[] args) {
		int[] lottoAry = {};
		int num=0;
		System.out.println("** 로또 추첨을 시작합니다. **");
		
		my_loop : // 중첩 반복문에서 가장 바깥쪽 반복문으로 이동하기 위해 필요
		while(true) {
			//이 부분에서 중복되지 않는 6개의 숫자 추첨
			num=lotto_method();//메서드 호출 및 반환 값 저장
			
			for(int v : lottoAry) {//lottoAry의 각 요소(v)를 순회
				if(num==v) //뽑은 숫자와 로또 배열 안의 숫자가 같으면
					continue my_loop; //while()문 처음으로 돌아감
			}
			//처음 나온 숫자라면 로또 배열의 크기를 하나 늘림
			lottoAry = Arrays.copyOf(lottoAry, lottoAry.length+1);
			//로또 배열의 마지막 위치에 숫자를 넣음
			lottoAry[lottoAry.length-1]=num;
			//만약 배열의 숫자가 6개가 되면 while문을 탈출
			if(lottoAry.length==6)
				break;
		}
		
		Arrays.sort(lottoAry);//로또 배열을 오름차순으로 정렬하고 출력
		System.out.print("오늘의 로또 번호 ==> ");
		System.out.println(Arrays.toString(lottoAry));//문자열 형태로 출력
		
	}
}
