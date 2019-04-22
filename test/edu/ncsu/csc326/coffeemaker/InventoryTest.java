package edu.ncsu.csc326.coffeemaker;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.ncsu.csc326.coffeemaker.Inventory;

public class InventoryTest {
	
	@Test
	public void testDefaults() {
		Inventory inventory = new Inventory();
		int chocUnits = inventory.getChocolate();
		assertEquals(15, chocUnits);
	}
}