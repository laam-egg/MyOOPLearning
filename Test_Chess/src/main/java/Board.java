import java.util.ArrayList;

public class Board {

    public static final int WIDTH = 8;

    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces;

    /**
     * Constructs a new Board.
     */
    public Board() {
        this.pieces = new ArrayList<Piece>();
    }

    /**
     * Adds a new piece to the board.
     *
     * @param piece - The piece to be added.
     */
    public void addPiece(Piece piece) {
        if (this.getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
            this.pieces.add(piece);
        }
    }

    /**
     * Checks whether given coordinates are valid.
     *
     * @param x - The x coordinate.
     * @param y - The y coordinate.
     * @return boolean.
     */
    public boolean validate(int x, int y) {
        return (
                x >= 1 && x <= 8
                && y >= 1 && y <= 8
        );
    }

    /**
     * Removes a piece on board at specified position.
     *
     * @param coordinatesX - The x coordinate.
     * @param coordinatesY - The y coordinate.
     */
    public void removeAt(int coordinatesX, int coordinatesY) {
        this.pieces.removeIf(
                piece ->
                        piece.getCoordinatesX() == coordinatesX
                        && piece.getCoordinatesY() == coordinatesY
        );
    }

    /**
     * Use this function to retrieve the piece at specified position.
     *
     * @param coordinatesX - The coordinates x.
     * @param coordinatesY - The coordinates y.
     * @return the Piece at specified position, or null if there isn't one.
     */
    public Piece getAt(int coordinatesX, int coordinatesY) {
        for (Piece piece : this.pieces) {
            if (piece.getCoordinatesX() == coordinatesX
                && piece.getCoordinatesY() == coordinatesY) {
                return piece;
            }
        }
        return null;
    }

    /**
     * Use this function to get pieces.
     *
     * @return the result.
     */
    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    /**
     * Use this function to set pieces.
     *
     * @param pieces - The pieces.
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
