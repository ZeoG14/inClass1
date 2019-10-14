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
	public void tesCompareTo() {
		fail("Not yet implemented");
	}

}
