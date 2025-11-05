public class BlackKing implements MoveCommand {
    private Board chessboard;
    private String name;
    
    public BlackKing(Board chessboard) {
        this.chessboard = chessboard;
        name = "BlackKing";
    }
    public void move(){
        chessboard.move(1,1, getName());
        System.out.println("BLACK MOVE KING: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(1,1, getName());
        System.out.println("BLACK UNDO KING: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(1,1, getName());
        System.out.println("BLACK REDO KING: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}