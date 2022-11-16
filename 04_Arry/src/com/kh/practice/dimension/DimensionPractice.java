package com.kh.practice.dimension;

public class DimensionPractice {

	public void practice1() {
		String[][] arr = new String[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] arr = new int[4][4];
		int a = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = a++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice3() {
		int[][] arr = new int[4][4];
		int a = arr.length * arr[0].length;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = a--;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j < arr[0].length; j++) {
				int a = (int)(Math.random()*10+1);
				if(j != arr[0].length-1) {
					arr[i][j] = a;
					arr[i][arr[0].length-1] += arr[i][j];
				}else if (j == )
				if(i!=arr.length) {
					arr[arr.length-1][i] += arr[i][j];
				}
			}
			System.out.println();	
		}
		
	}
}
