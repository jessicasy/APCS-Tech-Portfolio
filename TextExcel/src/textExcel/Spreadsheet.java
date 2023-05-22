package textExcel;

//Jessica Sy
// February 21, 2023
//Update this file with your own code.

public class Spreadsheet implements Grid{
	private Cell[][] cellArr;
	
	//constructor
	public Spreadsheet() {
		cellArr= new Cell[getCols()][getRows()];
		for (int column=0; column<getCols();column++) {
			for (int row=0;row<getRows();row++) {
				 cellArr[column][row]= new EmptyCell();
			}	
		}
	}   
	@Override 
	public String processCommand(String command)
	{
		String print = "";
		String [] com = command.split(" ", 3); 
		if (com.length == 1) {  
			if (com[0].equalsIgnoreCase("clear")) {
				for (int col = 0; col < getCols(); col ++) {
					for (int row = 0; row < getRows(); row ++) {
						cellArr[col][row] = new EmptyCell();
					}
				}
			print = getGridText();
		} else {
			SpreadsheetLocation location = new SpreadsheetLocation(com[0].toUpperCase());
			Cell x = cellArr[location.getCol()][location.getRow()];
			print = x.fullCellText();
		}
			//checks which operation, which object of the cell
	}   else {
			if (com[0].equalsIgnoreCase("clear")) {
				SpreadsheetLocation location = new SpreadsheetLocation(com[1].toUpperCase());
				cellArr[location.getCol()][location.getRow()] = new EmptyCell();
				print = getGridText();
			}
			if (com[1].equalsIgnoreCase("=")){
				SpreadsheetLocation location = new SpreadsheetLocation(com[0].toUpperCase());
				if (com[2].charAt(com[2].length() -1) == '%') {
					cellArr[location.getCol()][location.getRow()] = new PercentCell(com[2]);
				} else if (com[2].charAt(0) == '\"') {
					cellArr[location.getCol()][location.getRow()] = new TextCell(com[2]);
				} else if (com[2].charAt(com[2].length() -1) == '(') {
					cellArr[location.getCol()][location.getRow()] = new FormulaCell(com[2]);
				} else {
					cellArr[location.getCol()][location.getRow()] = new ValueCell(com[2]);
				}
			}
			print = getGridText();
		}
		return print;
}

	@Override
	//returns amount of rows
	public int getRows()
	{
		return 20;
	}

	@Override
	//returns amount of columns
	public int getCols()
	{
		return 12;
	}

	@Override
	//gets location (rows/col) of cell
	public Cell getCell(Location loc)
	{
		return cellArr[loc.getCol()][loc.getRow()];
	}

	@Override
	//prints grid of spreadsheet
	public String getGridText()
	{
	
		String output = "   |";
		for(int i = 'A'; i < 'A' + getCols(); i++) {
		     output += (char) i + "         |";
		}
		output += "\n";
		
		int count = 1; 
		for (int i = 0; i < getRows(); i ++) {
			if (count < 10) {
				output += count + "  |";
				count ++;
			}else {
				output += count + " |";
				count ++;
			}
			for (int j = 0; j < getCols(); j ++) {
				output += cellArr[j][i].abbreviatedCellText() + "|";
			}
			output += "\n";
		}
	
		 return output;
	}
}