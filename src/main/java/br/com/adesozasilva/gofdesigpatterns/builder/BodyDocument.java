package br.com.adesozasilva.gofdesigpatterns.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BodyDocument {
	
	private List<BodyElement> elements;
	
	public BodyDocument(List<BodyElement> elements) {
		this.elements = elements;
	}

	public BodyDocument() {
		this.elements = new ArrayList<BodyElement>();
	}

	public List<BodyElement> getElements() {
		return Collections.unmodifiableList(elements);
	}
	
	public void addTag(BodyElement bodyElement) {
		this.elements.add(bodyElement);
		
	}
	
	@Override
	public String toString() {
		return "<body>"+ this.formatElementToString() +"</body>";
	}
	
	private String formatElementToString() {
		StringBuilder builder = new StringBuilder("");
				
		this.elements.forEach(element -> {
			builder.append(element.toString());
		});
		
		return builder.toString();
		
	}

}
