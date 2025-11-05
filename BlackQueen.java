public class BlackQueen implements MoveCommand {
    private Board chessboard;
    private String name;

    public BlackQueen(Board chessboard) {
        this.chessboard = chessboard;
        name = "BlackQueen";
    }
    public void move(){
        chessboard.move(5,5, getName());
        System.out.println("BLACK MOVE QUEEN: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(5,5, getName());
        System.out.println("BLACK REDO QUEEN: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(5,5, getName());
        System.out.println("BLACK UNDO QUEEN: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}