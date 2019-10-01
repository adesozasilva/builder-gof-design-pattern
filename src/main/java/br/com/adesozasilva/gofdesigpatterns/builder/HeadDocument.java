package br.com.adesozasilva.gofdesigpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class HeadDocument {
	
	private List<HeadElement> elements;
	
	public HeadDocument(List<HeadElement> elements) {
		this.elements = elements;
	}

	public HeadDocument() {
		elements = new ArrayList<HeadElement>();
	}

	@Override
	public String toString() {
		return "<head>"+ formatElementToString()+"</head>";
	}

	public void addTag(HeadElement headElement) {
		this.elements.add(headElement);
	}
	
	private String formatElementToString() {
		StringBuilder builder = new StringBuilder("");
				
		this.elements.forEach(element -> {
			builder.append(element.toString());
		});
		
		return builder.toString();
		
	}

}
