public class Board {    //Clinet
    //private PlayerInvoker player;
    private int leftCoord;
    private int rightCoord;

    public Board(int left, int right){
        this.leftCoord = left;
        this.rightCoord = right;
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
