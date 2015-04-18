

import java.util.ArrayList;
import java.util.Scanner;

public class TestMyStack{
	public static void main(String[] args){
			MyStack object = new MyStack();
			Scanner input = new Scanner(System.in);
			System.out.print("Enter first string: ");
			String s1 = input.next();
			System.out.print("Enter second string: ");
			String s2 = input.next();
			System.out.print("Enter third string: ");
			String s3 = input.next();
			System.out.print("Enter forth string: ");
			String s4 = input.next();
			System.out.print("Enter fifth string: ");
			String s5 = input.next();
			object.push(s1);
			object.push(s2);
			object.push(s3);
			object.push(s4);
			object.push(s5);
			

			}
}


public class MyStack extends ArrayList<Object>{
	
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	public int getSize(){
		return super.size();
	}
	
	public Object peek(){
		return super.get(getSize() - 1);
	}
	
	public Object pop(){
		Object o = super.get(getSize() - 1);
		super.remove(getSize() - 1);
		return o;
	}
	
	public void push(Object o){
		super.add(o);
	}
	
	@Override
	public String toString(){
		return "stack: " + super.toString();
	}
}