package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {
    // modify the Cell.toString() to be faster and take up less CPU time
	@Test
	public void toStringtest1() {
		Cell oldToString = new Cell();
        String oldToStringResult = oldToString.oldToString();
        Cell newToString = new Cell();
        String newToStringResult = newToString.toString();
        assertEquals(oldToStringResult, newToStringResult);
	}
	
	
	// modify the Cell.toString() to be faster and take up less CPU time
    @Test
    public void toStringtest2() {
        Cell newToString = new Cell();
        newToString.setAlive(true);
        String newToStringResult = newToString.toString();      
        assertEquals(newToStringResult, "X");
    }
    
    
    // modify the Cell.toString() to be faster and take up less CPU time
    @Test
    public void toStringtest3() {
        Cell newToString = new Cell();
        String newToStringResult = newToString.toString();
        assertEquals(newToStringResult, ".");
    
    }
}
