
public class Sum2DArray {
	public static void main(String[] args) {
		int[][] arr = {
				{10,20,30,40},
				{5,15,25,35},
				{2,4,6,8}
		};
		
		int hap =0;
		
		for(int i =0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				hap+=arr[i][j];
			}
		}
		System.out.printf("배열 요소의 합은 : %d",hap);
	} 
}
