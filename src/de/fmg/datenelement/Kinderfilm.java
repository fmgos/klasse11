package de.fmg.datenelement;


public class Kinderfilm extends Datenelement{
	
	private boolean prinzessin;

	public Kinderfilm(String name, boolean prinzessin) {
		super(name);
		this.prinzessin = prinzessin;
	}

	@Override
	public void ausgeben() {
		System.out.print("Der Kinderfilm " + name + "enthält ");
		if (prinzessin)
			System.out.println("eine Prinzessin.");
		else
			System.out.println("keine Prinzessin.");		
	}

}
