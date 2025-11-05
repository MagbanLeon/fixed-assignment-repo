public class WhiteKnight implements MoveCommand {
    private Board chessboard;
    private String name;
    
    public WhiteKnight(Board chessboard) {
        this.chessboard = chessboard;
        name = "WhiteKnight";
    }
    public void move(){
        chessboard.move(1,2, getName());
        System.out.println("WHITE MOVE KNIGHT: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(1,2, getName());
        System.out.println("WHITE UNDO KNIGHT: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(1,2, getName());
        System.out.println("WHITE REDO KNIGHT: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}