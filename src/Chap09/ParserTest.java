package Chap09;

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("korean");
		parser.parse("한글파일이 들어있는 파일.pdf");
		
		parser = ParserManager.getParser("english");
		parser.parse("영어가 들어있는 파일.pdf");
	}
}
