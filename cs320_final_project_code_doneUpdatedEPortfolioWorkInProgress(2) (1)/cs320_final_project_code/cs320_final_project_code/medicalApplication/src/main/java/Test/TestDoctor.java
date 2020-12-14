package Test;


import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import medical.com.medicalApplication.model.Doctor;


public class TestDoctor {
	
	private static Doctor doctor;
	private static Doctor doctorTwo;

	@BeforeClass
	public static void BeforeClass() {
		doctor = new Doctor("Dr DrName", "11111");
		doctorTwo = new Doctor("","");
	}

	@Test
	public final void testDoctorName() {
		
		assertTrue(doctor.getName().equals("Dr DrName"));
	}
	
	@Test
	public final void testDoctorName_2() {
		
		assertTrue(doctor.getName().equals("Dr DrName"));
	}

	@Test
	public final void testSetId() {
		
		assertTrue(doctor.getId().equals("11111"));
	}

	@Test
	public final void testToString() {
		
		assertTrue(doctor.toString().equals("Doctor Name:Dr DrName ID: 11111"));
	}

}
