package com.ibm;

public class PracticeArray {

	public static void main(String[] args) {
		
		//int[] i= {11,22,33,44};
		//int[] i=new int[4];
		System.out.println("1D Array:");
		int[] i=new int[]{11,22,33,44};					//1D array
		
		for(int k=0;k<4;k++) { 							//k is serving as array index
			System.out.print(i[k]+" ");
		}
		System.out.println();
		System.out.println("---------------------");
		System.out.println("2D Array:");
		int d[][]={{1,2,3,4},{2,3,4,5},{3,4,5,6}};		//2D array
		
		for (int e=0;e<3;e++) {
			for(int f=0;f<4;f++) {
				System.out.print(d[e][f]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		System.out.println("Jagged Array:");			//Jagged Array
		int g[][]= {{1,2,3,4},{1,2,3},{1,2},{1}};
		for (int q=0;q<g.length;q++) {					//g.length gives the no. of rows
			for (int w=0; w<g[q].length;w++) {			//g[q].length gives the no. of columns
				System.out.print(g[q][w]+" ");
			}
			System.out.println();
		}
		System.out.println("Using For Each:");
		for(int r[]:g) {
			for (int t:r) {
				System.out.print(t+" ");
			}
			System.out.println();
		}
	}
}
