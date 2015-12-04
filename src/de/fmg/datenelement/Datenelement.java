package de.fmg.datenelement;



public abstract class Datenelement {
	
	protected String name;
	
	public Datenelement(String name){
		this.name = name;
	}
	
	public abstract void ausgeben();

}
