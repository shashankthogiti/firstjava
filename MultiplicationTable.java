package com.in28minutes.firstjavaproject;

public class MultiplicationTable {
	// 5*1=5
	//5*10=50
	void Print() {
		print(5);
	
  }
	void print(int table) {
		print(table, 6, 1);
		
}
	void print(int table, int from, int to) {
		for(int i = from; i <= to; i++) {
			System.out.printf("%d X %d = %d ", table, i, table * i).println();
		}
}
}