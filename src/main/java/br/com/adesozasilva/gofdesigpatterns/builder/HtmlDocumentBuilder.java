package br.com.adesozasilva.gofdesigpatterns.builder;

public class HtmlDocumentBuilder {

	private HeadDocument head;
	private BodyDocument body;
	private ScriptDocument script;
	
	public HtmlDocumentBuilder() {
		head = new HeadDocument();
		body = new BodyDocument();
	}

	public HtmlDocument build() {
		return new HtmlDocument(head, body, script);
	}

	public HtmlDocumentBuilder addHeadWith(String tag, String content) {
		head.addTag(new HeadElement(tag, content));
		return this;
	}

	public HtmlDocumentBuilder addBodyWith(String tag, String content) {
		body.addTag(new BodyElement(tag, content));
		return this;
	}

	public HtmlDocumentBuilder addScript() {
		script = new ScriptDocument();
		return this;
	}

}
