import java.util.ArrayList;

public class Game {

    private Board board;

    private final ArrayList<Move> moveHistory;

    /**
     * Constructs a new Game.
     *
     * @param board - The chessboard.
     */
    public Game(Board board) {
        this.board = board;
        this.moveHistory = new ArrayList<Move>();
    }

    /**
     * Moves the specified piece to specified position.
     *
     * @param piece - The piece to be moved.
     * @param endX - The coordinates x.
     * @param endY - The coordinates y.
     */
    public void movePiece(Piece piece, int endX, int endY) {
        final int startX = piece.getCoordinatesX();
        final int startY = piece.getCoordinatesY();
        if (startX == endX && startY == endY) {
            return;
        }
        if (piece.canMove(this.board, endX, endY)) {
            final Piece killedPiece = this.board.getAt(endX, endY);
            if (killedPiece != null) {
                this.board.removeAt(endX, endY);
            }

            this.board.removeAt(startX, startY);
            piece.setCoordinatesX(endX);
            piece.setCoordinatesY(endY);
            this.board.addPiece(piece);

            final Move m = new Move(startX, startY, endX, endY, piece, killedPiece);
            this.moveHistory.add(m);
        }
    }

    /**
     * Use this function to get board.
     *
     * @return the result.
     */
    public Board getBoard() {
        return this.board;
    }

    /**
     * Use this function to set board.
     *
     * @param board - The board.
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Use this function to get move history.
     *
     * @return the result.
     */
    public ArrayList<Move> getMoveHistory() {
        return this.moveHistory;
    }
}
