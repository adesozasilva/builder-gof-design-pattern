package br.com.adesozasilva.gofdesigpatterns.builder;

public class HtmlDocument {
	
	private HeadDocument head;
	private BodyDocument body;
	private ScriptDocument script;
	
	public HtmlDocument(HeadDocument head, BodyDocument body, ScriptDocument script) {
		this.head = head;
		this.body = body;
		this.script = script;
	}
	public HeadDocument getHead() {
		return head;
	}
	public BodyDocument getBody() {
		return body;
	}
	public ScriptDocument getScript() {
		return script;
	}
	
	@Override
	public String toString() {
		return "<!doctype html>"
				+ "<html>"+ 
				 this.head.toString()  +
	             this.body.toString() +
		         
		         "</html>";
	}
	
	
	

}
