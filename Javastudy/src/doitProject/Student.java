package doitProject;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
public class Student {
	private String name;
	private String studentId;
	private String majorSubject;
	
	private ArrayList<Score> scoreList = new ArrayList<>();
	
	Student(String name, String StuNum, String major){
		this.name = name;
		this.studentId =studentId;
		this.majorSubject = majorSubject;
	}
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
}
