import java.util.HashMap;

public class Board {    //Clinet
    private int leftCoord;
    private int rightCoord;
    private HashMap<String, Position> piecePositions = new HashMap<String, Position>(); //to track board states

    public Board(int left, int right){
        this.leftCoord = left;
        this.rightCoord = right;
        piecePositions.put(null, null);
    }
    public void move(int left, int right){
        leftCoord = leftCoord + left;
        rightCoord = rightCoord + right;
    }
    public void moveBack(int left, int right){
        leftCoord = leftCoord - left;
        rightCoord = rightCoord - right;
    }
    public String getCurrent(){
        return "Current place is " + leftCoord + ", " + rightCoord + ".";
    }
}
