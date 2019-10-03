package br.com.adesozasilva.gofdesigpatterns.prototype;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class ArmyTest {

	private Army army;
	
	@Before
	public void runBeforeTest() {
		army = new Army("Arm 1");
		army.addSoldiers(
				Arrays.asList(
						new Soldier(SoldierType.BARBARIAN),
						new Soldier(SoldierType.BARBARIAN),
						new Soldier(SoldierType.BARBARIAN),
						new Soldier(SoldierType.WIZARD),
						new Soldier(SoldierType.GIANT)
						));
		
	}

	@Test
	public void should_create_an_army() {
		army.removeFirstSoldier();
		
		System.out.println(army);
		
		assertEquals("Arm 1", army.getName());
		assertEquals(4, army.getAmountSoldiers());
	}
	
	@Test
	public void should_copy_an_army() {
		Army army = this.army.clone();
		army.setName("Arm 2");
		
		System.out.println(army);
		
		assertEquals("Arm 2", army.getName());
		assertEquals(5, army.getAmountSoldiers());
	}

}
