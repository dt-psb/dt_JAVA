import java.util.Scanner; //과제들어가나봐;;;; 일단 과제할때 넣기
public class Hard_code_01 {//Char Counter로 바꾸기 이름
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		int alpha=0, blank=0, num=0, ect=0;
		char check;
		str=s.nextLine();
		for (int i=0; i<str.length();i++) {
			check = str.charAt(i);
			if (Character.isLetter(check)) {
				alpha++;
			} else if(Character.isDigit(check)) {
				num++;
			} else if(Character.isWhitespace(check)) {
				blank++;
			} else {
				ect++;
			}
		}
		System.out.printf("알파벳 : %d\n숫자 : %d\n공백 : %d\n기타 : %d",alpha, num,blank,ect);
		s.close();
		}
	} 

