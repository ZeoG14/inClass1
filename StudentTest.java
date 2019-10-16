import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

	private static final int INITIAL_RATING = 5;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testStudent()
	{
		try {
		Student s = new Student();
		Integer rating = s.getRating();
		Integer expected = INITIAL_RATING;
		
			
		assertEquals(expected, rating);
		}catch (NameException e) {
		fail();
		}
	}
	
	
	@Test
	public void tesCompareTo() throws NameException{
		Student firstStudent = new Student("x", "y", 2);
		Student secondStudent = new Student("x","y",3);
	
		int actual = secondStudent.compareTo(firstStudent);
		//should be bigger than zero
		boolean result = false;
		
		if(actual > 0)
		{
			result = true; 
		}
		assertTrue(result);
		
		Student student = new Student("x","y",5);
		result = false;
		
		actual = secondStudent.compareTo(student);
		//should be less than one
		if(actual < 0)
		{
			result = true;
		}
		assertTrue(result);
		
		
		result = false;
		Student studentSame = new Student("x","y",5);
		//should be equal to zero
		actual = student.compareTo(studentSame);
		int expected = 0;
		assertEquals(expected, actual);
		
		
		
		
	}

	@Test
	public void testGet()
	{
		try {
		Integer rating = 4;
		Integer expected = rating;
		String firstName = "Alex";
		String lastName = "Bo";
		Student s = new Student(firstName, lastName, rating);
		Integer actual = s.getRating();
		assertEquals(expected, actual);
		}catch (NameException e)
		{
			fail();
		}
		
	}
}
