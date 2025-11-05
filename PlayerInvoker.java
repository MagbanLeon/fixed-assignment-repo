public class PlayerInvoker {
    private Board currentBoard;
    private MoveCommand mostRecent;

    public PlayerInvoker() {
        // commands = new MoveCommand[6];
        currentBoard = new Board();
    }
    public void Redo() {
        mostRecent.redo();
    }
    public void Undo(){
        mostRecent.undo();
    }

    //Adding Pawn Movement
    public void Pawn() {
        mostRecent = new Pawn(currentBoard);
        mostRecent.move();
    }
    //Adding Rook Movement
    public void Rook() {
        mostRecent = new Rook(currentBoard);
        mostRecent.move();
    }
    //Adding Knight Movement
    public void Knight() {
        mostRecent = new Knight(currentBoard);
        mostRecent.move();
    }
    //Adding Bishop Movement
    public void Bishop() {
        mostRecent = new Bishop(currentBoard);
        mostRecent.move();
    }
    //Adding Queen Movement
    public void Queen() {
        mostRecent = new Queen(currentBoard);
        mostRecent.move();
    }
    //Adding King Movement
    public void King() {
        mostRecent = new King(currentBoard);
        mostRecent.move();
    }
}
