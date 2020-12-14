package Test;

import static org.junit.Assert.*;



import org.junit.BeforeClass;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;
import medical.com.medicalApplication.services.MedicalRescordService;


public class TestMedicalRescordService {
	
	
   MedicalRescordService mdrecordservice = new MedicalRescordService(); 
   

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		MedicalRescordService.getReference().addPatient("FirstName Lastname","11111");
		
		MedicalRescordService.getReference().addPatient("FirstName2 Lastname","22222");
		
		MedicalRescordService.getReference().getMedicalRecord("11111").getHistory().addAllergy(new Allergey("Allergey Name"));
		MedicalRescordService.getReference().getMedicalRecord("22222").getHistory().addAllergy(new Allergey("Allergey Name2"));
		
		
		
	}
	
	
	@Test
	public void testAddPatient() {
		
		MedicalRescordService.getReference().addPatient("","");
		

	}
	
	@Test
	public void testAddAllergies() {
		
		for(int n = 0; n < 10; n++) {
			
		MedicalRescordService.getReference().getMedicalRecord("11111").getHistory().addAllergy(new Allergey("Allergey Name"));
		}
		}
		


	@Test
	public final void testGetMedicalRecord() {
		
		assertTrue(MedicalRescordService.getReference().getMedicalRecord("11111").getPatient().getName().equals("FirstName Lastname"));
		
	}

	@Test
	public final void testGetPatient() {
		
		assertTrue(MedicalRescordService.getReference().getPatient("11111").getName().equals("FirstName Lastname"));
		
	}

	@Test
	public final void testGetAllPatients() {
		
		assertTrue(MedicalRescordService.getReference().getAllPatients().stream().anyMatch(Patient -> Patient.getName()
				.equals("FirstName Lastname")));
	}

	@Test
	public final void testGetPatientsWithAllergies() {
		
		assertTrue(MedicalRescordService.getReference().getMedicalRecord("22222").getHistory().getAlergies().stream()
				.anyMatch(Allergey -> Allergey.getName().equals("Allergey Name2")));
		
	}

}