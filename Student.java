
public class Student extends Person implements Comparable<Student>{

	private String className;
	private Integer rating;
	private static final int INITIAL_RATING = 5;

	
	public Student() throws NameException
	{
		super();
		rating = INITIAL_RATING;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Integer getRating() {
		// TODO Auto-generated method stub
		return this.rating;
	}
	
	

}
