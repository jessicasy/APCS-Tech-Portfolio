package textExcel;

public class TextCell implements Cell {
	private String originalString;
	// constructor
	public TextCell(String originalString) {
		this.originalString = originalString;
	}
	//returns original code
	public String fullCellText() {
		return originalString;
	}
	//returns abbreviated cell text (10 spaces)
	public String abbreviatedCellText() {
		String abbString = originalString.substring(1,originalString.length()-1);
		abbString += "          ";
		return abbString.substring(0,10);
		
	}

}
  