package com.hadirezaie.algorithm_fundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmFundamentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmFundamentalsApplication.class, args);
		// finding the largest number in an array
		int[] testNumbers = { 3, 7, 2, 9, 1, 8, 12, 4 };
		int result = Maximum.findMaximum(testNumbers);
		System.out.println("Largest number: " + result);

		System.out.println("\n" + "=".repeat(40) + "\n");

		// finding the largest number with logging
		Maximum.findMaximumWithLogging(testNumbers);
	}

}
