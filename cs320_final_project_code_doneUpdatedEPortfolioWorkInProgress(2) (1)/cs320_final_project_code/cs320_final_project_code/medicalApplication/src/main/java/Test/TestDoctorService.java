package Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import medical.com.medicalApplication.model.Doctor;
import medical.com.medicalApplication.services.DoctorService;

public class TestDoctorService {
	
    
    private static List<Doctor> doctors;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		DoctorService.getReference().addDoctor("Doctor Name 1", "1234");
		DoctorService.getReference().addDoctor("Doctor Name 2", "12345");
		DoctorService.getReference().addDoctor("Doctor Name 3", "12345");
		
		doctors = DoctorService.getReference().getAllDoctors();
		
		
	}
	
	@Test
	public final void testAddDoctor_one() {
		
		
		assertTrue("Add Doctr",doctors.stream().anyMatch(doctor -> doctor.getName().equals("Doctor Name 1") && 
				doctor.getId().equals("1234")));
		
		
	}
	@Test
	public final void testAddDoctor() {
		
		int duplicates = 0;
		for(int x =0; x < doctors.size(); x++) {
			
			if(doctors.get(x).getId() == "12345") {
				
				duplicates++;
			}
			
		}
		//uniqueid
		assertFalse("DuplicateID", duplicates == 1);
		
	}


	@Test
	public final void testGetAllDoctors() {
		
		assertTrue(doctors.stream().anyMatch(doctor -> doctor.getName().equals("Doctor Name 2") && 
				doctor.getId().equals("12345")));
		
	}

	
}