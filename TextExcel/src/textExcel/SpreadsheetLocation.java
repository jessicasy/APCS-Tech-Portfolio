package textExcel;

//Jessica Sy
//February 21, 2023
//Update this file with your own code.

public class SpreadsheetLocation implements Location {
	private String cell;

	public SpreadsheetLocation(String cell){
		this.cell = cell;
	}
	
	@Override
    public int getRow()
    {
		int row = Integer.parseInt(cell.substring(1)) -1;
        return row;
    }

    @Override
    public int getCol()
    {
    	int column = Character.toUpperCase(cell.charAt(0)) - 'A';
        return column;
    }
 
 
} 
