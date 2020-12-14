package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;
import medical.com.medicalApplication.model.Medication;
import medical.com.medicalApplication.model.PatientHistory;
import medical.com.medicalApplication.model.Treatment;



public class TestPatientHistory {
	
	private static PatientHistory patienthistory;
	
	private static Treatment treatment;
	private static Medication medication;
	private static Allergey allergey;
	
	private static List<Treatment> treatments;
	private static List<Medication> medications;
	private static List<Allergey> allergy;
	

	@BeforeClass
	public static void setUpBeforeClass() {
		
		patienthistory = new PatientHistory();
		
		treatment = new Treatment("startDate", "Diagnoses", "Description");
		medication = new Medication("Med Name","startDate","endDate","amount");
		allergey = new Allergey("Allergey Name");
		
		
		treatments = new ArrayList<>();
		treatments.add(treatment);
		
		medications = new ArrayList<>();
		medications.add(medication);
		
		
		allergy = new ArrayList<>();
		allergy.add(allergey);

		//allws for adding each item to list
		patienthistory.addAllergy(allergey);
		patienthistory.addMedication(medication);
		patienthistory.addTreatment(treatment);
		
	}
	
	//tests each item in list to make sure its there
	@Test
	public final void testGetAlergies() {
		
		assertTrue(patienthistory.getAlergies().equals(allergy));
	}

	@Test
	public final void testGetAllTreatments() {
		
		assertTrue(patienthistory.getAllTreatments().equals(treatments));
		
	}

	@Test
	public final void testGetAllMedications() {
		
		assertTrue(patienthistory.getAllMedications().equals(medications));
	}

}
