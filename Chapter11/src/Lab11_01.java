import java.io.BufferedReader;
import java.io.FileReader;
public class Lab11_01 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("txt/myData1.txt"));
		String inStr;
		//이 부분에서 파일 처리 코딩
		int lineNum =1;
		while(true) {//한 행씩 읽고 출력
			inStr=br.readLine();
			if(inStr==null) 
				break;
			System.out.println(lineNum+ " : "+inStr);
			lineNum ++;
		}
		br.close();

	}
}
