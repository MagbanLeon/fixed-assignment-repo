public class PlayerInvoker {
    private Board currentBoard;
    private MoveCommand mostRecent;

    public PlayerInvoker(Board newBoard) {
        currentBoard = newBoard;
    }
    public void Redo() {
        mostRecent.redo();
    }
    public void Undo(){
        mostRecent.undo();
    }
    //---------WHITE---------------
    //Adding Pawn Movement
    public void WhitePawn() {
        mostRecent = new WhitePawn(currentBoard);
        mostRecent.move();
    }
    //Adding Rook Movement
    public void WhiteRook() {
        mostRecent = new WhiteRook(currentBoard);
        mostRecent.move();
    }
    //Adding Knight Movement
    public void WhiteKnight() {
        mostRecent = new WhiteKnight(currentBoard);
        mostRecent.move();
    }
    //Adding Bishop Movement
    public void WhiteBishop() {
        mostRecent = new WhiteBishop(currentBoard);
        mostRecent.move();
    }
    //Adding Queen Movement
    public void WhiteQueen() {
        mostRecent = new WhiteQueen(currentBoard);
        mostRecent.move();
    }
    //Adding King Movement
    public void WhiteKing() {
        mostRecent = new WhiteKing(currentBoard);
        mostRecent.move();
    }
    //------------BLACK---------
    //Adding Pawn Movement
    public void BlackPawn() {
        mostRecent = new BlackPawn(currentBoard);
        mostRecent.move();
    }
    //Adding Rook Movement
    public void BlackRook() {
        mostRecent = new BlackRook(currentBoard);
        mostRecent.move();
    }
    //Adding Knight Movement
    public void BlackKnight() {
        mostRecent = new BlackKnight(currentBoard);
        mostRecent.move();
    }
    //Adding Bishop Movement
    public void BlackBishop() {
        mostRecent = new BlackBishop(currentBoard);
        mostRecent.move();
    }
    //Adding Queen Movement
    public void BlackQueen() {
        mostRecent = new BlackQueen(currentBoard);
        mostRecent.move();
    }
    //Adding King Movement
    public void BlackKing() {
        mostRecent = new BlackKing(currentBoard);
        mostRecent.move();
    }
}
