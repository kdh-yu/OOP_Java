public class ToyClass2 {
    private String name;
    private int number;

    public ToyClass2(String newName, int newNumber) {
        name = newName;
        number = newNumber;
    }
    public ToyClass2() {
        name = "No name yet.";
        number = 0;
    }

    public void set(String newName, int newNumber) {
        name = newName;
        number = newNumber;
    }
    
    public String toString() {
        return name + " " + number;
    }

    public static void changer(ToyClass2 aParameter) {
        aParameter.name = "Hot Shot";
        aParameter.number = 42;
    }

    public boolean equals(ToyClass2 otherObject) {
        return (name == otherObject.name) && (number == otherObject.number);
    }

    public void makeEqual(ToyClass2 anObject) {
        anObject.name = name;
        anObject.number = number;
    }

    public void tryToMakeEqual(int newNumber) {
        number = newNumber;
    }
}
