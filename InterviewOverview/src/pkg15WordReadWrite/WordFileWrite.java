package pkg15WordReadWrite;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class WordFileWrite {

	public static void main(String[] args) {
		try {
			XWPFDocument document = new XWPFDocument();
			XWPFParagraph paragraph = document.createParagraph();
			XWPFRun run = paragraph.createRun();
			run.setText("Word File Write By Automation");
			File path = new File("F:\\Excel File read\\WordDocument.docx");

			FileOutputStream out = new FileOutputStream(path);
			document.write(out);
			out.close();

		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
