package InterfaceSegregation;

public class Converter {
	public Csv ExcelToCsv(){
        // CSV -> Excel conversion logic
    }

    public Excel CsvToExcel(){
        /// Excel -> CSV conversion logic
    }

    public Pdf ExcelToPdf() throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    public Pdf CsvToPdf() throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }
}