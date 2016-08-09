package com.tech.puzzles;

import java.util.Stack;

public class LargestRectangleHistogram {
	
	public static int getLargestRectangle(int[] arr,int n){
		Stack<Integer> stack = new Stack<Integer>();
        int area=0;
        int max=0;
        int top=0;
        int i=0;
        
        while(i<n){
            if(stack.isEmpty() || arr[stack.peek()]<=arr[i])
                stack.push(i++);
            else{
                top = stack.peek();
                stack.pop();
                area = arr[top] * (stack.isEmpty()?i:i-stack.peek()-1);
                if(max<area)
                    max = area;
            }
        }
        while(!stack.isEmpty()){
            top = stack.peek();
            stack.pop();
            area = arr[top] * (stack.isEmpty()?i:i-stack.peek()-1);
            if(max<area)
                max = area;
        }
        return max;
	}
	
	public static void main(String[] args){
		System.out.println(getLargestRectangle(new int[]{6, 2, 5, 4, 5, 1, 6}, 7));
	}

}
