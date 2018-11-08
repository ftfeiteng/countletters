package com.example.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.main.LetterCounter;

class TestLetterCounter {
	
	int[] expected = new int[256];
	
	@BeforeEach
	void setUp() {
		// reset it's value for test
		expected = new int[256];
	}
	
	@Test
	void testCount1() {
		expected['a'] = 1;
		expected['b'] = 1;
		expected['c'] = 1;
		LetterCounter counter = new LetterCounter();
		assertArrayEquals(expected, counter.countOfChar("abc"));
	}

	
	@Test
	void testCount2() {
		expected['a'] = 2;
		expected['b'] = 2;
		expected['c'] = 1;
		LetterCounter counter = new LetterCounter();
		assertArrayEquals(expected, counter.countOfChar("abcba"));
	}

	
	@Test
	void testCount3() {
		expected['a'] = 1;
		expected['_'] = 1;
		expected['+'] = 2;
		expected['e'] = 1;
		expected['f'] = 1;
		expected['g'] = 1;
		LetterCounter counter = new LetterCounter();
		assertArrayEquals(expected, counter.countOfChar("a_++efg"));
	}
	
	
	@Test
	void testCount4() {
		expected['f'] = 10;
		LetterCounter counter = new LetterCounter();
		assertArrayEquals(expected, counter.countOfChar("ffffffffff"));
	}

	
	@Test
	void testEmptyAndNull() {
		LetterCounter counter = new LetterCounter();
		assertArrayEquals(expected, counter.countOfChar(""));
		assertArrayEquals(expected, counter.countOfChar(null));
	}
}
