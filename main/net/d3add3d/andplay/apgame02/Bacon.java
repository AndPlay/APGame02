package net.d3add3d.andplay.apgame02;

public class Bacon {
	
	boolean tasty, crunchy, fried;
	String tastyText, crunchyText, friedText;
	
	Bacon(boolean tasty, boolean crunchy, boolean fried) {
		this.tasty = tasty;
		this.crunchy = crunchy;
		this.fried = fried;
		if (this.tasty) {
			this.tastyText = " is ";
		} else {
			this.tastyText = " is not ";
		}
		if (this.crunchy) {
			this.crunchyText = " is ";
		} else {
			this.crunchyText = " is not ";
		}
		if (this.fried) {
			this.friedText = " is ";
		} else {
			this.friedText = " is not ";
		}
	}
	
	public void getTraits(){
		System.out.println("Bacon" + this.friedText + "tasty," + this.crunchyText + "crunchy," + this.friedText + "fried!");
	}
	
}
