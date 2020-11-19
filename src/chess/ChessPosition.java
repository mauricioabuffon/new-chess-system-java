package chess;

import boardgame.Position;

public class ChessPosition {
	private char column;
	private int row;
// Verify if chess position received is on limits 8 columns (a-h) and 8 rows (1-8)
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException(
					"Error in instancing chess position. Columns limited from a to h and rows between 1 to 8");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	// converts chess position to matrix position
	protected Position toPosition() { 
		return new Position(8 - row, column - 'a');
	}
// // converts matrix position to chess position
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), (8 - position.getRow()));
	}

	@Override
	public String toString() {
		return "" + column + row;
	}
}
