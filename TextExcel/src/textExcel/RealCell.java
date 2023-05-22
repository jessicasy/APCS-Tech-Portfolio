package textExcel;

public class RealCell implements Cell {
	private String origValue;
	// constructor
	public RealCell(String s) {
		origValue = s;
	}
	@Override
	//adds spaces if cell text is less than 10 characters 
	public String abbreviatedCellText() {
		String abbText = origValue + "          ";
		return abbText.substring(0,10);
	}
	@Override
	//returns full cell text of 10 characters
	public String fullCellText() {
		 return origValue;
	}
	//converts String to double value
	public double getDoubleValue() {
		return Double.parseDouble(origValue);
	}

}
