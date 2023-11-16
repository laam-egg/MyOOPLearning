public abstract class Piece {

    private int coordinatesX;

    private int coordinatesY;

    private String color;

    /**
     * Constructs a new Piece object
     * with default color white.
     *
     * @param coordinatesX - The x coordinate.
     * @param coordinatesY - The y coordinate.
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = "white";
    }

    /**
     * Constructs a new Piece object
     * with given properties.
     *
     * @param coordinatesX - The x coordinate.
     * @param coordinatesY - The y coordinate.
     * @param color - The color.
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    /**
     * Use this function to retrieve the symbol
     * of the piece.
     *
     * @return the symbol.
     */
    public abstract String getSymbol();

    /**
     * Use this function to get coordinates x.
     *
     * @return the result.
     */
    public int getCoordinatesX() {
        return this.coordinatesX;
    }

    /**
     * Use this function to set coordinates x.
     *
     * @param coordinatesX - The coordinates x.
     */
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * Use this function to get coordinates y.
     *
     * @return the result.
     */
    public int getCoordinatesY() {
        return this.coordinatesY;
    }

    /**
     * Use this function to set coordinates y.
     *
     * @param coordinatesY - The coordinates y.
     */
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * Use this function to get color.
     *
     * @return the result.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Use this function to set color.
     *
     * @param color - The color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Checks if this piece can move to specified position.
     *
     * @param board - The chess board.
     * @param coordinatesX - The specified x coordinate.
     * @param coordinatesY - The specified y coordinate.
     * @return boolean.
     */
    public abstract boolean canMove(Board board, int coordinatesX, int coordinatesY);

    /**
     * I don't know what does this method mean to do.
     *
     * @param other - Another Piece.
     * @return boolean.
     */
    public boolean checkPosition(Piece other) {
        return true;
    }
}
