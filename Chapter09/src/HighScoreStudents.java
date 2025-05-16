
public class HighScoreStudents {
	public static void main(String[] args) {
		int [][][] scores = {
				{ {90,80,70}, {85,75,95}}, //1반
				{{88,77,66}, {99,99,99}} //2반
		};
		
		int count=0;
				
		for (int i =0; i<scores.length;i++) {//반
			for (int j =0;j<scores[i].length;j++) {//학생
				int highScoreCount =0;
				for(int k =0; k<scores[i][j].length;k++) {//과목
					if(scores[i][j][k] >=90) {
						highScoreCount++;
					}
				}
				if(highScoreCount ==3) {
					count++;
				}
			}
		}
		System.out.println("90점 이상 과목이 3개인 학생 수: "+count+"명");
	} 
}
