public class Move {

    private Piece movedPiece;

    private int startX;

    private int startY;

    private int endX;

    private int endY;

    private Piece killedPiece;

    /**
     * Use this function to get moved piece.
     *
     * @return the result.
     */
    public Piece getMovedPiece() {
        return this.movedPiece;
    }

    /**
     * Use this function to set moved piece.
     *
     * @param movedPiece - The moved piece.
     */
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * Use this function to get start x.
     *
     * @return the result.
     */
    public int getStartX() {
        return this.startX;
    }

    /**
     * Use this function to set start x.
     *
     * @param startX - The start x.
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * Use this function to get start y.
     *
     * @return the result.
     */
    public int getStartY() {
        return this.startY;
    }

    /**
     * Use this function to set start y.
     *
     * @param startY - The start y.
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * Use this function to get end x.
     *
     * @return the result.
     */
    public int getEndX() {
        return this.endX;
    }

    /**
     * Use this function to set end x.
     *
     * @param endX - The end x.
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * Use this function to get end y.
     *
     * @return the result.
     */
    public int getEndY() {
        return this.endY;
    }

    /**
     * Use this function to set end y.
     *
     * @param endY - The end y.
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * Use this function to get killed piece.
     *
     * @return the result.
     */
    public Piece getKilledPiece() {
        return this.killedPiece;
    }

    /**
     * Use this function to set killed piece.
     *
     * @param killedPiece - The killed piece.
     */
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }

    /**
     * Constructs a new Move with one piece killed.
     *
     * @param startX - The start x.
     * @param startY - The start y.
     * @param endX - The end x.
     * @param endY - The end y.
     * @param movedPiece - The moved piece.
     * @param killedPiece - The killed piece.
     */
    public Move(int startX, int startY, int endX, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * Constructs a new Move with no killed piece.
     *
     * @param startX - The start x.
     * @param startY - The start y.
     * @param endX - The end x.
     * @param endY - The end y.
     * @param movedPiece - The moved piece.
     */
    public Move(int startX, int startY, int endX, int endY, Piece movedPiece) {
        this(startX, startY, endX, endY, movedPiece, null);
    }

    /**
     * Stringifies this Move object.
     *
     * @return the string representation.
     */
    public String toString() {
        final String rowNames = "abcdefgh";
        return String.format("%s-%s%s%s",
                this.movedPiece.getColor(),
                this.movedPiece.getSymbol(),
                rowNames.charAt(this.endX - 1),
                this.endY
        );
    }
}
