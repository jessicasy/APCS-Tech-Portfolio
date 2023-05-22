package textExcel;

public class FormulaCell extends RealCell {
	private String formula;
	
	// text for individual cell inspection, not truncated or padded
	public FormulaCell (String formula) {
		super(formula);
		this.formula = formula;
	}
	
	public String abbreviatedCellText() {
		return "hello";
	}
	public String fullCellText() {
		return "( " + formula + " )";
	}
	public double getDoubleValue() {
		return Double.parseDouble(formula);
	}
}


 