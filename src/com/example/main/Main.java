package com.example.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		System.out.println("Input your text");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String text = null;
		try {
			text = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		LetterCounter counter = new LetterCounter();
		int[] results = counter.countOfChar(text);
		System.out.println("=========");
		System.out.println("==Report==");
		for (int i = 0; i < text.length(); i++) {
			char currentChar = text.charAt(i);
			if (results[currentChar] > 0) {
				System.out.println(currentChar + ":" + results[currentChar]);
				results[currentChar] = 0;
			}
		}

	}

}
