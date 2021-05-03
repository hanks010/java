package doitProject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Score {
	private int studentId;
	private Subject subject;
	private int point;
	
	@Override
	public String toString() {
	return "학번: "+studentId+", "+subject.getSubjectName()+ ":"+point;
	}

	
}
