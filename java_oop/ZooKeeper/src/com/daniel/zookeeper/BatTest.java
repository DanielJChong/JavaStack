package com.daniel.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		Bat b = new Bat(300);
		
		b.displayEnergy();
		
		b.fly();
		b.fly();
		
		b.eatHumans();
		b.eatHumans();
		
		b.attackTown();
		b.attackTown();
		b.attackTown();
		
		b.displayEnergy();

	}

}
