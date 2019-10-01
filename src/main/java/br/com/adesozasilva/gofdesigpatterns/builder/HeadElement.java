package br.com.adesozasilva.gofdesigpatterns.builder;

public class HeadElement {
	
	private String tag;
	private String content;
	
	public HeadElement(String tag, String content) {
		this.tag = tag;
		this.content = content;
	}

	public String getTag() {
		return tag;
	}
	
	public String getContent() {
		return content;
	}
	
	@Override
	public String toString() {
		return "<"+this.tag+">"+ this.content +"</"+this.tag+">";
	}

}
