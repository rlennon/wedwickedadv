package mvnUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
	
	Person p1 = new Person("David", "McDaid", 21);
	
	@Test
	public void testGetAge() {
		int age = p1.getAge();
		assertEquals(21, age);
	}
	
	@Test
	public void testGetFirstName() {
		String firstName = p1.getFirstName();
		assertEquals("David", firstName);
	}
	
	@Test
	public void testGetLastName() {
		String lastName = p1.getLastName();
		assertEquals("McDaid", lastName);
	}

}