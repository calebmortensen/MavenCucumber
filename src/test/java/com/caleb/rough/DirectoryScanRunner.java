package com.caleb.rough;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		
		Path currentDirectory = Paths.get(".");
		
		//Files.list(currentDirectory).forEach(System.out::println);
		
		//Predicate checks for boolean
		/*
		 * Predicate<? super Path> predicate = path ->
		 * String.valueOf(path).contains(".java");
		 */
		
		/*
		 * Files.walk(currentDirectory, 8) .filter(predicate)
		 * .forEach(System.out::println); //change number for subfolders or 'walk'
		 */		
		
		BiPredicate<Path, BasicFileAttributes> javaMatcher 
		= (path, attributes) -> String.valueOf(path).contains(".java");
		
		/*
		 * BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes)
		 * -> attributes.isDirectory();
		 */
		
		Files.find(currentDirectory, 5, javaMatcher)
		.forEach(System.out::println);
		
		
		

	}

}
