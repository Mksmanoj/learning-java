package com.upcasting;

class Cricket extends Game {

	public void type() {
		System.out.println("outdoor game");
	}

	public static void main(String[] args) {
		Game gm = new Game();
		Cricket ck = new Cricket();
		gm.type1();
		ck.type();
		gm = ck;
		gm.type1();
	}
}