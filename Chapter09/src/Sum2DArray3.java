
public class Sum2DArray3 {
	public static void main(String[] args) {
		int [][][] scores = {
				{ {90,80,70}, {85,75,95}},
				{{88,77,66}, {99,89,79}}
		};
		
		int best_students_count=0;
		for (int i =0; i<scores.length;i++) {
			int class_sum=0;
			for (int j =0;j<scores[i].length;j++) {
				boolean best_stu=true;
				for(int k =0; k<scores[i][j].length;k++) {
					class_sum+=scores[i][j][k];
					if (scores[i][j][k]<90) {
						best_stu=false;
					}
				if(best_stu==true) {
					best_students_count++;
				}
				}
			}
			System.out.printf("%d반 평균:%.1f\n",i, (double)class_sum/(3*scores[i].length));
		}
		
		System.out.printf("세과목이 전부 90점 이상인 학생 수 : %d",best_students_count);
	} 
}
