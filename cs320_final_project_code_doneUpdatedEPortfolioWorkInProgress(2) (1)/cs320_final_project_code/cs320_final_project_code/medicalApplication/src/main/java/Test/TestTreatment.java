package Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import medical.com.medicalApplication.model.Treatment;

public class TestTreatment {
	
	private static Treatment treatment;

	@BeforeClass
	public static void BeforeClass(){
		
		treatment = new Treatment("date","Diagnose","Description");
	}

	

	@Test
	public final void testGetTreatmentDate() {
		
		assertTrue(treatment.getTreatmentDate().equals("date"));
	}

	@Test
	public final void testSetTreatmentDate() {
		
		assertTrue(treatment.getTreatmentDate().equals("date"));
	}

	@Test
	public final void testGetDiagnose() {
		
		assertTrue(treatment.getDiagnose().equals("Diagnose"));
	}

	@Test
	public final void testSetDiagnose() {
		
		assertTrue(treatment.getDiagnose().equals("Diagnose"));
	}

	@Test
	public final void testGetDescription() {
		
		assertTrue(treatment.getDescription().equals("Description"));
	}

	@Test
	public final void testSetDescription() {
		
		assertTrue(treatment.getDescription().equals("Description"));
	}

	@Test
	public final void testToString() {
		
		assertTrue(treatment.toString().equals("Treatment:  Date: date Diagnose: Diagnose"));
	}

}