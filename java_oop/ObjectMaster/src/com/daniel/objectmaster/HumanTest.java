package com.daniel.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		
		Human a = new Human();
		Human b = new Human();
		
		a.attack(b);
		
		a.showHealth();
		b.showHealth();
		
	}
}
