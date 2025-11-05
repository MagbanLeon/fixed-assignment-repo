import java.util.HashMap;

public class Board {    //Clinet
    private HashMap<String, Position> piecePositions = new HashMap<String, Position>(); //to track board states

    public Board(){
        piecePositions.put("Pawn", new Position());
        piecePositions.put("Rook", new Position());
        piecePositions.put("Knight", new Position());
        piecePositions.put("Bishop", new Position());
        piecePositions.put("King", new Position());
        piecePositions.put("Queen", new Position());
    }
    public void move(int left, int right, String pieceName){
        piecePositions.get(pieceName).setLeftCoord(piecePositions.get(pieceName).getLeftCoord() + left);
        piecePositions.get(pieceName).setRightCoord(piecePositions.get(pieceName).getRightCoord() + right);
    }
    public void moveBack(int left, int right, String pieceName){
        piecePositions.get(pieceName).setLeftCoord(piecePositions.get(pieceName).getLeftCoord() - left);
        piecePositions.get(pieceName).setRightCoord(piecePositions.get(pieceName).getRightCoord() - right);
    }
    public String getCurrent(String pieceName){
        return "Current place is " + piecePositions.get(pieceName).getLeftCoord() + ", " + piecePositions.get(pieceName).getRightCoord() + ".";
    }
}
