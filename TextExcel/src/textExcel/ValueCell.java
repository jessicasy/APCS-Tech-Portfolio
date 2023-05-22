package textExcel;

public class ValueCell extends RealCell{
	
	//takes string through super class of Real Cell
	public ValueCell(String s) {
		super(s);
	}
	//returns abbreviated cell text 
	public String abbreviatedCellText() {
		String abbText = getDoubleValue() + "           ";
		return abbText.substring(0,10);
	}
	//inherited from real cell
	public String fullCellText() {
		return super.fullCellText();
	}
	//returns double value
	public double getDoubleValue() { 
		return super.getDoubleValue();
	}
} 
