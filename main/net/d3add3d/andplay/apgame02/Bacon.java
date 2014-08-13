package net.d3add3d.andplay.apgame02;

public class Bacon {
	
	String tastyText, crunchyText, friedText;
	
	Bacon(boolean tasty, boolean crunchy, boolean fried) {
		if (tasty) {
			this.tastyText = " is ";
		} else {
			this.tastyText = " is not ";
		}
		if (crunchy) {
			this.crunchyText = " is ";
		} else {
			this.crunchyText = " is not ";
		}
		if (fried) {
			this.friedText = " is ";
		} else {
			this.friedText = " is not ";
		}
	}
	
	public void getTraits(){
		System.out.println("Bacon" + this.friedText + "tasty," + this.crunchyText + "crunchy," + this.friedText + "fried!");
	}
	
}
