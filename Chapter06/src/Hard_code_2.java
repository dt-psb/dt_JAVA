import java.util.Scanner; 
public class Hard_code_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		boolean result = true;
		str=s.nextLine();
		str=str.toLowerCase();
		str=str.replaceAll(" ", "");
		int len=str.length();
		for (int i=0;i<=(len/2); i++) {
			System.out.printf("%c vs %c\n",str.charAt(i), str.charAt(len-i-1));
			if (str.charAt(i) == str.charAt(len-i-1)) {
				continue;
			} else {
				result=false;
				break;
			}
		}

		if (result) {System.out.println("회문입니다");
		} else {System.out.println("회문이 아닙니다.");
		}
		
		s.close();
		}
	} 

