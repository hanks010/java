package doitProject;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Subject {
	
	private String subjectName;
	private String subjectId;
	private int gradeType;
	
	private ArrayList<Student> studentList = new ArrayList<>();
	
	Subject(String subjectName, String subjectId){
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYBE;
	}
	public void register(Student student) {
		studentList.add(student);
	}

}
