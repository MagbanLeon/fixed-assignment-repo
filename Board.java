import java.util.HashMap;

public class Board {    //Clinet
    private HashMap<String, Position> piecePositions = new HashMap<String, Position>(); //to track board states

    public Board(){
        piecePositions.put("WhitePawn", new Position());
        piecePositions.put("WhiteRook", new Position());
        piecePositions.put("WhiteKnight", new Position());
        piecePositions.put("WhiteBishop", new Position());
        piecePositions.put("WhiteKing", new Position());
        piecePositions.put("WhiteQueen", new Position());

        piecePositions.put("BlackPawn", new Position());
        piecePositions.put("BlackRook", new Position());
        piecePositions.put("BlackKnight", new Position());
        piecePositions.put("BlackBishop", new Position());
        piecePositions.put("BlackKing", new Position());
        piecePositions.put("BlackQueen", new Position());
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
