
public class ClassAverage {
	public static void main(String[] args) {
		int [][][] scores = {
				{ {90,80,70}, {85,75,95}}, //1반
				{{88,77,66}, {99,89,79}} //2반
		};
		
		for (int i =0; i<scores.length;i++) {//반
			int sum=0;
			int count=0;
			
			for (int j =0;j<scores[i].length;j++) {//학생
				for(int k =0; k<scores[i][j].length;k++) {//과목
					sum+=scores[i][j][k];
					count++;
				}
			}
			double average = (double)sum/count;
			System.out.printf("%d반 평균:%.1f\n",i+1,average);
		}
	} 
}
