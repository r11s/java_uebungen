public class Main {
  public static void main(String[] args) {

    PdfChecker.reportPdfsMitSuffix("./pdfs");

    System.out.println("----------------------------------");

    PdfChecker.reportPdfsMitTyp("./pdfs");

  }
}
