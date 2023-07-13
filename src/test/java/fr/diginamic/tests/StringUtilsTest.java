package fr.diginamic.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.utils.StringUtils;

public class StringUtilsTest {
	
	@Test
	public void testLevenshteinDistanceSameWords() {
		int distance = StringUtils.levenshteinDistance("distance", "distance");
		
		assertEquals(0, distance);
	}
	
	@Test
	public void testLevenshteinDistanceDiffWords() {
		int distance = StringUtils.levenshteinDistance("instance", "distance");
		
		assertEquals(2, distance);
	}
	
	@Test
	public void testLevenshteinDistanceDiffLength() {
		int distance = StringUtils.levenshteinDistance("proche", "distance");
		
		assertEquals(7, distance);
	}
	
	@Test
	public void testLevenshteinDistanceDiffLengthReversed() {
		int distance = StringUtils.levenshteinDistance("distance", "proche");
		
		assertEquals(7, distance);
	}
	
	@Test
	public void testLevenshteinDistanceOneParamEmpty() {
		int distance = StringUtils.levenshteinDistance("distance", "");
		
		assertEquals(8, distance);
	}
	
	@Test
	public void testLevenshteinDistanceOneParamNull() {
		int distance = StringUtils.levenshteinDistance("distance", null);
		
		assertEquals(-1, distance);
	}
	
	@Test
	public void testLevenshteinDistanceBothParamNull() {
		int distance = StringUtils.levenshteinDistance(null, null);
		
		assertEquals(-1, distance);
	}
	
}
