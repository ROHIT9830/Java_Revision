package com.ibm;

public class PracticeException {

	public static void main(String[] args) {
		try {
			//int[] a=new int[5];
			//a[6]=8;
			//int i=0/0;						//This line throws the object of exception
			
			int c=5;
			int b=89;
			int d=c/b;
			if(d==0) {
				throw new ArithmeticException("error created :)");
			}
		}
		catch (ArithmeticException e) { //This line catches the object of exception
			System.err.println("Error : "+e.getMessage());
			//System.out.println();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array related error");
		}
		finally {							//This block is executed irrespective of error
		System.out.println("Bye Java");
		}
	}

}
