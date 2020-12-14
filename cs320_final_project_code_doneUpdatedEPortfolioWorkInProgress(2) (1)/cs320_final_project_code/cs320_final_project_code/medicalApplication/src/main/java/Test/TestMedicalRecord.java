package Test;

import static org.junit.Assert.*;



import org.junit.BeforeClass;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;
import medical.com.medicalApplication.model.MedicalRecord;
import medical.com.medicalApplication.model.Medication;
import medical.com.medicalApplication.model.Patient;
import medical.com.medicalApplication.model.Treatment;

public class TestMedicalRecord {
	

	private static MedicalRecord medicalrecord;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		medicalrecord = new MedicalRecord(new Patient("Dr Name", "111"));
		
		
		medicalrecord.getHistory().addAllergy(new Allergey("Allergy"));
		medicalrecord.getHistory().addMedication(new Medication("Medication","1/11/1111","2/22/2222","amount"));
		medicalrecord.getHistory().addTreatment(new Treatment("1/23/4567", "affects","Treatment"));
	}


	@Test
	public final void testGetPatient() {
		
		assertTrue(medicalrecord.getPatient().getName().equals("Dr Name"));
	}

	@Test
	public final void testGetHistory() {
		//get history of each item throug medical recdrd
		boolean allergy1 = medicalrecord.getHistory().getAlergies().stream().anyMatch(allergy ->allergy.getName().equals("Allergy"));
		boolean medicationname1 = medicalrecord.getHistory().getAllMedications().stream().anyMatch(medic ->medic.getName().equals("Medication"));
		boolean treatment1 = medicalrecord.getHistory().getAllTreatments().stream().anyMatch(treat ->treat.getDiagnose().equals("affects"));
		assertTrue(" Medical histoy fo patient", allergy1 && medicationname1 && treatment1);
						
	}
	
	

}
