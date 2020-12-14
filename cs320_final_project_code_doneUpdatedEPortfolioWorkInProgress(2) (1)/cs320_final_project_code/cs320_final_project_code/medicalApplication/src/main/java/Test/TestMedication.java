package Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import medical.com.medicalApplication.model.Medication;

public class TestMedication {
	
	private static Medication medication;

	@BeforeClass
	public static void BeforeClass() {
		//medication wit name start,end and amount of medicine , end date cant be before start date
		// test get, and set to retrieve and assign
		medication = new Medication("Name", "startDate","endDate","Amount");
		
	}
	@Test
	public final void testGetName() {
		
		assertTrue(medication.getName().equals("Name"));
	}

	@Test
	public final void testSetName() {
		
		assertTrue(medication.getName().equals("Name"));
	}

	@Test
	public final void testGetStartDate() {
		
		assertTrue(medication.getStartDate().equals("startDate"));
	}

	@Test
	public final void testSetStartDate() {
		
		assertTrue(medication.getStartDate().equals("startDate"));
	}

	@Test
	public final void testGetEndDate() {
		
		assertTrue(medication.getEndDate().equals("endDate"));
	}

	@Test
	public final void testSetEndDate() {
		
		assertTrue(medication.getEndDate().equals("endDate"));
	}

	@Test
	public final void testGetDose() {
		
		assertTrue(medication.getDose().equals("Amount"));
	}

	@Test
	public final void testSetDose() {
		
		assertTrue(medication.getDose().equals("Amount"));
	}

	@Test
	public final void testToString() {
		
		assertTrue(medication.toString().equals("Medication:Name Start Date: startDate End Date: endDate Dose: Amount"));
	}

}