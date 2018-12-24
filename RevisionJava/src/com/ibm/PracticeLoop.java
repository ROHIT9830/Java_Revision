package com.ibm;

public class PracticeLoop {
	public void LoopExample() {
		int i;
		// for loop practice
		for (i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
			if (i == 9) {
				break;
			}
		}
		// do-while loop
		int b = 5;
		do {
			System.out.println(b);
			b++;
		} while (b < 9);
		
		//Star design:(Numbers/with *)
		for(int z=0;z<=5;z++) {
			for (int x=0;x<=z;x++) {
				System.out.print(z+" ");
			}
			System.out.println();
		}
		for(int r=4;r>=0;r--) {
			for (int t=0;t<=r;t++) {
				System.out.print(r+" ");
			}
			System.out.println();
			}
	}

	public static void main(String[] args) {
		PracticeLoop pl = new PracticeLoop();
		pl.LoopExample();
	}
}
