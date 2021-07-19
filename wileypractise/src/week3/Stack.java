package week3;
import java.util.EmptyStackException;
import java.util.*;

 class Stackclass {
	
		 
	    private int arr[];
	    public int size;
	    private int index = 0;
	 
	    public Stackclass(int size) {
	        this.size = size;
	        arr = new int[size];
	    }
	 
	    public void push(int element) {
	 
	        if (isFull()) {
	            throw new StackOverflowError("Stack is full");
	        }
	 
	        arr[index] = element;
	        index++;
	    }
	 
	    public int pop() {
	 
	        if (isEmpty()) {
	            throw new EmptyStackException();
	        }
	        return arr[--index];
	    }
	 
	    public boolean isEmpty() {
	        if (index == 0) {
	            return true;
	        }
	        return false;
	    }
	 
	    public boolean isFull() {
	        if (index == size) {
	            return true;
	        }
	        return false;
	    }
	 
	    public int size() {
	        return index;
	    }
	   
	    public void peek(int x) {
	    	System.out.println(arr[x]);
	    }
	}

public class Stack{
	public static void main(String []args) {
		Stackclass s=new Stackclass(4);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		//s.push(5);
		
		s.peek(1);
		//s.push(1);
		System.out.println(s.size());
		
	}
	
}
