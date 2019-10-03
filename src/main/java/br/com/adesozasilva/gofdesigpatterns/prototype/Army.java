package br.com.adesozasilva.gofdesigpatterns.prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Army implements Cloneable {

	private String name;
	private List<Soldier> soldiers = new ArrayList<>();

	public Army(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<Soldier> getSoldiers() {
		return Collections.unmodifiableList(soldiers);
	}

	public void addSoldiers(List<Soldier> soldiers) {
		this.soldiers.addAll(soldiers);
	}

	public int getAmountSoldiers() {
		return this.soldiers.size();
	}

	@Override
	public Army clone() {
		Army clone = null;
		try {
			clone = (Army) super.clone();
		} catch (CloneNotSupportedException  e) {
			System.err.println(e.getMessage());
		}
		
		return clone;
	}

	public void removeFirstSoldier() {
		if(!this.soldiers.isEmpty()) this.soldiers.remove(0);
	}

	@Override
	public String toString() {
		return "Army [name=" + name + ", soldiers=" + soldiers + "]";
	}

}
