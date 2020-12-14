package Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import medical.com.medicalApplication.model.Patient;

public class TestPatient {
	
	private static Patient patient;

	@BeforeClass
	public static void setUpBeforeClass() {
		// assigns patient name first,lst and number, lag on virtual slow=typos
		patient = new Patient("FirstName LastName","PatientNumber");
		
	}

	@Test
	public final void testGetName() {
		
		assertTrue(patient.getName().equals("FirstName LastName"));
	}

	@Test
	public final void testSetName() {
		
		assertTrue(patient.getName().equals("FirstName LastName"));
	}

	@Test
	public final void testGetId() {
		
		assertTrue(patient.getId().equals("PatientNumber"));
	}

	@Test
	public final void testSetId() {
		
		assertTrue(patient.getId().equals("PatientNumber"));
	}

	@Test
	public final void testToString() {
		//Asserts that a condition is true. If it isn't it throws an AssertionError without a message. maks sure string work
		assertTrue(patient.toString().equals("Patient Name: FirstName LastName ID: PatientNumber"));
	}

}