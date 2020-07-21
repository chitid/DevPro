package com.devpro.first;

public class RemovingDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Developer";
		System.out.println(removeDuplicates(s));

	}

	private static String removeDuplicates(String s) {
		// TODO Auto-generated method stub
		//s.chars().mapToObj(ch,(k,v)->(v==null)?1:++v);
		 char[] chArray = s.toCharArray(); // or, use charAt(i)
		  StringBuilder sb = new StringBuilder();

		  for (char ch : chArray) {
		    if (sb.indexOf(String.valueOf(ch)) == -1) {
		      sb.append(ch);
		    }
		  }
		  return sb.toString();
		
	}
	
	
	/*public static String removeDuplicates(String str) {

		  return Arrays.asList(str.split("")).stream()
		    .distinct()
		    .collect(Collectors.joining());
		}*/

}
