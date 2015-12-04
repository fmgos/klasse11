package de.fmg.datenelement;


public class Dokumentarfilm extends Datenelement{
	
	private boolean tiere;

	public Dokumentarfilm(String name, boolean tiere) {
		super(name);
		this.tiere = tiere;
	}

	@Override
	public void ausgeben() {
		System.out.print("Der Dokumentarfilm " + name + " enthält ");
		if (tiere)
			System.out.println("Tiere.");
		else
			System.out.println("keine Tiere.");
		
	}

}
