package com.tech.puzzles;

import java.util.Stack;

public class BalancedParenthesis {
	
	public static boolean checkParenthesis(String input){
		Stack<Character> parenthesis = new Stack<Character>();
		for(int i = 0; i < input.length(); i++){
			char c = input.charAt(i);
			if(isOpenParenthesis(c)){
				parenthesis.push(c);
			}
			else if(isClosedParenthesis(c)){
				if(!isBalanced(c, parenthesis.pop())){
					return false;
				}
			}
		}
		if(!parenthesis.isEmpty())
			return false;
		return true;
	}
	
	private static boolean isOpenParenthesis(char c){
		return c == '{' || c == '(' || c == '[';
	}
	
	private static boolean isClosedParenthesis(char c){
		return c == '}' || c == ')' || c == ']';
	}
	
	private static boolean isBalanced(char c, char openParenthesis){
		switch(c) {
		case '}': return openParenthesis == '{';
		case ')': return openParenthesis == '(';
		case ']': return openParenthesis == '[';
		}
		return true; 
	}
	
	public static void main(String[] args){
		System.out.println(checkParenthesis("[()]{}{[()()]()}"));
	}

}
