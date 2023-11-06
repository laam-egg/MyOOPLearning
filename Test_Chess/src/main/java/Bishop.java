public class Bishop extends Piece {
    /**
     * Constructs a new white Bishop piece.
     *
     * @param coordinatesX - The coordinates x.
     * @param coordinatesY - The coordinates y.
     */
    Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Constructs a new Bishop piece with specified color.
     *
     * @param coordinatesX - The coordinates x.
     * @param coordinatesY - The coordinates y.
     * @param color - The color.
     */
    Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * Use this function to retrieve the symbol of this piece.
     *
     * @return the symbol.
     */
    @Override
    public String getSymbol() {
        return "B";
    }

    /**
     * Determines whether this piece can move to specified position.
     *
     * @param board - The chess board.
     * @param coordinatesX - The specified x coordinate.
     * @param coordinatesY - The specified y coordinate.
     * @return boolean.
     */
    @Override
    public boolean canMove(Board board, int coordinatesX, int coordinatesY) {
        int deltaX = coordinatesX - this.getCoordinatesX();
        int deltaY = coordinatesY - this.getCoordinatesY();
        if (Math.abs(deltaX) != Math.abs(deltaY)) {
            return false;
        }
        int stepX = (deltaX > 0 ? 1 : -1);
        int stepY = (deltaY > 0 ? 1 : -1);
        final int limitX = coordinatesX + stepX;
        for (
                int x = this.getCoordinatesX() + stepX, y = this.getCoordinatesY() + stepY;
                x != limitX;
                x += stepX, y += stepY
        ) {
            final Piece obstacle = board.getAt(x, y);
            if (obstacle == null) {
                continue;
            }
            if (obstacle.getColor().equals(this.getColor())) {
                return false;
            } else {
                // Opponent's piece standing at (x, y).
                return x == coordinatesX;
            }
        }
        return true;
    }
}
