public class TurnTaker {
    public static int turn = 0;
    private int myTurn;
    private String name;

    public TurnTaker() {
        this.name = "No name yet.";
        this.myTurn = 0;
    }
    public TurnTaker(String name, int turn) {
        this.name = name;
        this.myTurn = turn;
    }
    public String getName() {
        return this.name;
    }
    public static int getTurn() {
        turn++;
        return turn;
    }
    public boolean isMyTurn() {
        return (this.myTurn == turn);
    }
}
