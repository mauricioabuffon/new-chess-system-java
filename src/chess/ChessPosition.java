package chess;

import boardgame.Position;

public class ChessPosition {
	private char column;
	private int row;

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

	protected Position toPosition() { // converts chess position to matrix position
		return new Position(8 - row, column - 'a');
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), (8 - position.getRow()));
	}

	@Override
	public String toString() {
		return "" + column + row;
	}
}