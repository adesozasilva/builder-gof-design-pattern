package br.com.adesozasilva.gofdesigpatterns.builder;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class HtmlDocumentTest {
	
	private String expectedHtml;

	@Before
	public  void setup() {
		expectedHtml = "<!doctype html><html>" + 
				"<head>" + 
				"<title>This is the title of the webpage!</title>" + 
				"</head>" + 
				"<body>" + 
				"<p>This is an example paragraph.</p>" + 
				"</body>" + 
				"</html>";

	}
	
	@Test
	public void should_create_html_document() {
		List<HeadElement> headElements = Arrays.asList(new HeadElement("title", "This is the title of the webpage!"));
		HeadDocument headDocument = new HeadDocument(headElements);
		List<BodyElement> elements = Arrays.asList(
				new BodyElement("p", "This is an example paragraph."));
		
		BodyDocument bodyDocument = new BodyDocument(elements);
		ScriptDocument script = new ScriptDocument();
		
		HtmlDocument htmlDocument = new HtmlDocument(headDocument, bodyDocument, script);
		
		assertTrue(expectedHtml.equals(htmlDocument.toString()));
		
	}

	@Test
	public void should_create_html_document_with_builder() {
		HtmlDocument htmlDocument = new HtmlDocumentBuilder()
				.addHeadWith("title", "This is the title of the webpage!")
				.addBodyWith("p", "This is an example paragraph.")
				.addScript()
				.build();
		
		assertTrue(expectedHtml.equals(htmlDocument.toString()));
		
	}

}
