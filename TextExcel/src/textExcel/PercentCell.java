package textExcel;

public class PercentCell extends RealCell {
	private String percent;
	
	//takes string through Real Cell constructor to make sure 10 characters
	public PercentCell(String percent) {
		super(percent);
		this.percent = percent;
	}
	//turns abbreviated cell text into percentage value
	public String abbreviatedCellText() {
		String abbText = percent.substring(0, percent.indexOf(".")) + "%          ";
		return abbText.substring(0,10); 
	}
	//text for individual cell inspection, not truncated
	public String fullCellText() {
		double diffPercent = Double.parseDouble(percent.substring(0, percent.length() -1));
		diffPercent = diffPercent / 100;
		return diffPercent + "";
	}
	//takes percent value into array, parses into double
	public double getDoubleValue() {
		return Double.parseDouble(fullCellText()) * 100; 
    	
	}

}
 