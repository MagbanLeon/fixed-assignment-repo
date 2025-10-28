//import java.util.ArrayList;

public class PlayerInvoker {
    private MoveCommand[] commands = new MoveCommand[6];
    //private ArrayList commands = new ArrayList();
    private Board currentBoard;

    public PlayerInvoker() {
        commands = new MoveCommand[6];
        //currentBoard = new Board();

        Pawn();     //0
        Rook();     //1 
        Knight();   //2
        Bishop();   //3
        Queen();    //4
        King();     //5
    }
    public void move(int level){
        commands[level].move();
    }
    public void Redo(int level) {
        commands[level].redo();
    }
    public void Undo(int level){
        commands[level].undo();
    }

    //Adding Pawn Movement
    public void Pawn() {
        MoveCommand cmd = new Pawn(currentBoard);
        commands[0] = cmd;
    }
    //Adding Rook Movement
    public void Rook() {
        MoveCommand cmd = new Rook(currentBoard);
        commands[1] = cmd;
    }
    //Adding Knight Movement
    public void Knight() {
        MoveCommand cmd = new Knight(currentBoard);
        commands[2] = cmd;
    }
    //Adding Bishop Movement
    public void Bishop() {
        MoveCommand cmd = new Bishop(currentBoard);
        commands[3] = cmd;
    }
    //Adding Queen Movement
    public void Queen() {
        MoveCommand cmd = new Queen(currentBoard);
        commands[4] = cmd;
    }
    //Adding King Movement
    public void King() {
        MoveCommand cmd = new King(currentBoard);
        commands[5] = cmd;
    }
}
