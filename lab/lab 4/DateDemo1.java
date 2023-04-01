public class DateDemo1 {
    public static void main(String[] args) {
        Date date = new Date();
        Date Liberation = new Date(1945, 8, 15);
        date.readInput();
        if (date.equals(Liberation)) {
            System.out.println(date.toString() + " is equal to " + Liberation.toString());
        } else {
            System.out.println(date.toString() + " is not equal to " + Liberation.toString());
            if (Liberation.precedes(date)) 
                System.out.println(Liberation.toString() + " comes before " + date.toString());
            else
                System.out.println(Liberation.toString() + " does not comes before " + date.toString());
        }
    }
}
