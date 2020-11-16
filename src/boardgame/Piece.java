package boardgame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.position = position;
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
