public class BlackKnight implements MoveCommand {
    private Board chessboard;
    private String name;
    
    public BlackKnight(Board chessboard) {
        this.chessboard = chessboard;
        name = "BlackKnight";
    }
    public void move(){
        chessboard.move(1,2, getName());
        System.out.println("BLACK MOVE KNIGHT: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(1,2, getName());
        System.out.println("BLACK UNDO KNIGHT: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(1,2, getName());
        System.out.println("BLACK REDO KNIGHT: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}