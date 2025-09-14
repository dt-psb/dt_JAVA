import java.io.FileWriter; //실습X
public class Code11_04 {
	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("txt/myData2.txt");
		String outStr;
	
		outStr="하츠네미쿠";
		fw.write(outStr+"\n");
		
		outStr="카가미네린";
		fw.write(outStr+"\n");
		
		outStr="메구리네루카";
		fw.write(outStr+"\n");
		
		fw.close();
		System.out.println("--- myData2.txt 파일이 저장됨 ---");
	}
}
