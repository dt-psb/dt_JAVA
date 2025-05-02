import java.util.Scanner;
public class writing_practice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		String cleanstr=str.toLowerCase().replaceAll(" ", "");
		
		boolean result = true;
		
		for (int i =0 ; i<cleanstr.length()/2 ; i++) {
			if(cleanstr.charAt(i) != cleanstr.charAt(cleanstr.length()-i-1)) {
				result=false;
				break;
			}
		}
		
		if(result) {
			System.out.println("회문");
		} else {System.out.println("회문아님");}
		s.close();
	}
}
