package fr.diginamic.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.enumerations.Saison;

public class SaisonTest {
	
	@Test
	public void testValueOfLibelleNormalName() {
		String libelle = "Automne";
		
		Saison valueOfLibelle = Saison.valueOfLibelle(libelle);
		
		assertEquals("Automne", valueOfLibelle.getLibelle());
	}
	
	@Test
	public void testValueOfLibelleNormalNameCamelCase() {
		String libelle = "eté";
		
		Saison valueOfLibelle = Saison.valueOfLibelle(libelle);
		
		assertEquals("Eté", valueOfLibelle.getLibelle());
	}
	
	@Test
	public void testValueOfLibelleFakeName() {
		String libelle = "SaisonQuiNExistePas";
		
		Saison valueOfLibelle = Saison.valueOfLibelle(libelle);
		
		assertEquals(null, valueOfLibelle);
	}
	
	@Test
	public void testValueOfLibelleEmptyName() {
		String libelle = "";
		
		Saison valueOfLibelle = Saison.valueOfLibelle(libelle);
		
		assertEquals(null, valueOfLibelle);
	}
	
	@Test
	public void testValueOfLibelleNullName() {
		String libelle = null;
		
		Saison valueOfLibelle = Saison.valueOfLibelle(libelle);
		
		assertEquals(null, valueOfLibelle);
	}
}
