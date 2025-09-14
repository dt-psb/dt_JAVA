
public class Sum2DArray2 {
	public static void main(String[] args) {
		int[][] scores = {
				{80,90,85},//학생1
				{70,75,60},//학생2
				{88,92,78}//학생3
		};
		
		
		
		for(int i =0;i<scores.length;i++) {
			int hap=0;
			for (int j=0;j<scores[i].length;j++) {
				hap+=scores[i][j];
			}
			System.out.printf("학생%d 총점: %d\n",i+1,hap);
		}

		
	} 
}
