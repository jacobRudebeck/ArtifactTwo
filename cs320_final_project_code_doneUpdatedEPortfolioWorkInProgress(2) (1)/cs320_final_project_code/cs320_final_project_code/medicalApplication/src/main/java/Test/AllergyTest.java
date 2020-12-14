package Test;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;

public class AllergyTest {
	 private static Allergey allergy;
	@BeforeClass
	public static void BeforeClass() {
		
		allergy = new Allergey("AlergyName");
		
	}


	@Test
	public final void testSetName() {
		assertTrue(allergy.getName().equals("AlergyName"));
	}
	
	
	@Test
	public final void testToString() {
		
		assertTrue(allergy.toString().equals("Allergy AlergyName"));
		
	}

}