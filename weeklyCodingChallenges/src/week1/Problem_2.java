package week1;

/*
Problem statement
Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.

Input
The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
Each test case is described with a single line containing a string S, the alphanumeric string.
Output
For each test case, output a single line containing the sum of all the digit characters in that string.
Constraints
1 ≤ T ≤ 1000
1 ≤ |S| ≤ 1000, where |S| is the length of the string S.
Example
Input:
1
ab1231da
Output:
7

Explanation
The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7.
 */

public class Problem_2 {
	public static int getCharSum(String input) {
		int sum = 0;
		for(char c : input.toCharArray()) {
			if(Character.isDigit(c)) {
				int digit = Integer.parseInt(Character.toString(c));
				sum += digit;
			}
		}
		return sum;
	}
	
	public static void printCharSum(int T, String[] testCases) {
		for(int i=0;i<T;i++) {
			System.out.println(getCharSum(testCases[i]));
		}
	}
	
	public static void main(String[] args) {
		int T = 2;
		String[] testCases = {"ab1231da","ab1231da"};
		
		printCharSum(T,testCases);
	}
}
