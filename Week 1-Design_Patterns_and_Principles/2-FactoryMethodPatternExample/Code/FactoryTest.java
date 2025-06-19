public class FactoryTest {
    public static void main(String[] args) {
        // Create word document
        DocumentFactory word = new WordDocumentFactory();
        Document wordDoc = word.createDocument();
        wordDoc.open();
        wordDoc.close();

        // create pdf document
        DocumentFactory pdf = new PdfDocumentFactory();
        Document pdfDoc = pdf.createDocument();
        pdfDoc.open();
        pdfDoc.close();

        // create excel document
        DocumentFactory excel = new ExcelDocumentFactory();
        Document excelDoc = excel.createDocument();
        excelDoc.open();
        excelDoc.close();
    }
}
