package br.com.adesozasilva.gofdesigpatterns.builder;

public class BodyElement {

	private String tag;
	private String content;

	public BodyElement(String tag, String content) {
		this.tag = tag;
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}

	public String getTag() {
		return tag;
	}
	
	@Override
	public String toString() {
		return "<"+this.tag+">"+ this.content +"</"+this.tag+">";
	}

}
