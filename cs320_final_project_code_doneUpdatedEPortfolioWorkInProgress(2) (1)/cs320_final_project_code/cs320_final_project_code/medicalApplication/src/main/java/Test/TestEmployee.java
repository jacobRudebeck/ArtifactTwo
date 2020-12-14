package Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import medical.com.medicalApplication.model.Employee;

public class TestEmployee {
	
	private static Employee employee;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		employee = new Employee("EmployeeName", "123456");
		
	}

	@Test
	public final void testGetName() {
		
		assertTrue(employee.getName().equals("EmployeeName"));
		
	}

	@Test
	public final void testGetId() {
		
		assertTrue(employee.getId().equals("123456"));
		
	}

	@Test
	public final void testGetPassword() {
		
		assertTrue(employee.getPassword().equals("Open"));
	}

}
