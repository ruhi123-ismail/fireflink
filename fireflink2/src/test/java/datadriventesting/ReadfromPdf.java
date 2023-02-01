package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class ReadfromPdf {
	public static void main(String[] args) throws IOException, SAXException, TikaException {
		BodyContentHandler contentHandler=new BodyContentHandler();
		FileInputStream fis=new FileInputStream("./src/test/resources/PDFS/resume.pdf");
		Metadata metaData=new Metadata();
		ParseContext parseContext=new ParseContext();
		PDFParser parser=new PDFParser();
		parser.parse(fis, contentHandler, metaData, parseContext);
		System.out.println(contentHandler.toString());
		
	}

}
