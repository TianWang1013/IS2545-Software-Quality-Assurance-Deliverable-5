

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

public class MainPanelTest {
	// modify the MainPanel.convertToInt to be faster and take up less CPU time
	@Test
	public void convertTotest1() {
		MainPanel testConvertToInt = new MainPanel(9);
		int newGetNumNeighborsResult = testConvertToInt.getNumNeighbors(2,2);
        int oldGetNumNeighborsResult = testConvertToInt.oldGetNumNeighbors(2,2);
        assertEquals(newGetNumNeighborsResult, oldGetNumNeighborsResult);
	}	
	
	// modify the MainPanel.convertToInt to be faster and take up less CPU time
	@Test
	public void convertTotest2() {
		MainPanel testConvertToInt = new MainPanel(6);
		int newGetNumNeighborsResult = testConvertToInt.getNumNeighbors(5,4);
        int oldGetNumNeighborsResult = testConvertToInt.oldGetNumNeighbors(5,4);
        assertEquals(newGetNumNeighborsResult, oldGetNumNeighborsResult);
	}
	
	// modify the MainPanel.convertToInt to be faster and take up less CPU time
	@Test
	public void convertTotest3() {
		MainPanel testConvertToInt = new MainPanel(15);
		int newGetNumNeighborsResult = testConvertToInt.getNumNeighbors(9,14);
        int oldGetNumNeighborsResult = testConvertToInt.oldGetNumNeighbors(9,14);
        assertEquals(newGetNumNeighborsResult, oldGetNumNeighborsResult);
	}
}
