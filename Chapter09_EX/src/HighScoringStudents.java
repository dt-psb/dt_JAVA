import java.util.*;
public class HighScoringStudents {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("영희","철수","민수","지영");
		List<Integer> scores = Arrays.asList(85,92,76,90);
		
		double average= scores.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("평균 점수: "+average);
		
		System.out.println("평균 이상인 학생");
		for (int i =0; i<scores.size();i++) {
			if(scores.get(i) >= average) {
				System.out.println(students.get(i) + ": "+scores.get(i));
			}
		}
	}
}
