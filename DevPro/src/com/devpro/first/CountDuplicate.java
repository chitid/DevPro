package com.devpro.first;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mywordforduplication";
		Map<Character,Integer> cDupli=countDuplicateCharacters(str);
		cDupli.forEach((k,v)-> System.out.println((k+":"+v)));		
	}
	
	public static Map<Character, Integer> countDuplicateCharacters(String str) {

		  Map<Character, Integer> result = new HashMap<>();
		  // or use for(char ch: str.toCharArray()) { ... }
		  for (int i = 0; i<str.length(); i++) {
		    char ch = str.charAt(i); 
		    result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
		  }
		  return result;
		}
	
	//second solution
	public static Map<Character, Integer> countSecondDuplicateCharacters(String str) {
		  Map<Character, Integer> result = new HashMap<>();
		  str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(c->c,Collectors.counting()));		  
		  return result;		
	}

}
