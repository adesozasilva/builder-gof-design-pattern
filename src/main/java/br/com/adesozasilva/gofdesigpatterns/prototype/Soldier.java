package br.com.adesozasilva.gofdesigpatterns.prototype;

public class Soldier {
	
	private SoldierType soldierType;
	
	public Soldier(SoldierType soldierType) {
		this.soldierType = soldierType;
	}
	
	public SoldierType getSoldierType() {
		return soldierType;
	}

	@Override
	public String toString() {
		return "Soldier [soldierType=" + soldierType + "]";
	}
	
	
}
	

