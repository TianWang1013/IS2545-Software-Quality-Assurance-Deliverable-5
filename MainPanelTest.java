package test;

import static org.junit.Assert.*;

import org.junit.Test;


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
	
	
	// modify the MainPanel.bckup() to be faster and take up less CPU time
	@Test
	public void backupTest1() {
		MainPanel m = new MainPanel(15);
		Cell[][] _cells = new Cell[15][15];
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
			    _cells[i][j] = new Cell(false);
			}
		}	
		m.backup();	
		assertEquals(m._backupCells[14][14].getAlive(), _cells[14][14].getAlive());
	}
	
	// modify the MainPanel.bckup() to be faster and take up less CPU time
	@Test
	public void backupTest2() {
		MainPanel m = new MainPanel(15);
		Cell[][] _cells = new Cell[15][15];
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
			    _cells[i][j] = new Cell(true);
			}
		}	
		m.setCells(_cells);
		m.backup();	
		assertEquals(m._backupCells[14][14].getAlive(), _cells[14][14].getAlive());
	}
	
	// modify the MainPanel.bckup() to be faster and take up less CPU time
		@Test
		public void backupTest3() {
			MainPanel m = new MainPanel(10);
			Cell[][] _cells = new Cell[10][10];
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
				    _cells[i][j] = new Cell(true);
				}
			}	
			m.setCells(_cells);
			m.backup();	
			assertEquals(m._backupCells[9][9].getAlive(), _cells[9][9].getAlive());
		}
}
