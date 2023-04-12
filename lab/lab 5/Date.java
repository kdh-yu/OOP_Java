import java.util.Scanner;

public class Date {

    // Constructor
    public Date(int m, int d, int y) {
        this.year = y;
        this.month = this.monthString(m);
        this.day = d;
    }
    public Date(String m, int d, int y) {
        this.year = y;
        this.month = m;
        this.day = d;
    }
    public Date() {
        this.year = 1000;
        this.month = "January";
        this.day = 1;
    }
    public Date(int year) {
        this.year = year;
        this.month = "January";
        this.day = 1;
    }
    public Date(Date aDate) {
        if (aDate == null) System.out.println("Fatal Error");
        else {
            this.year = aDate.year;
            this.month = aDate.month;
            this.day = aDate.day;
        }
    }

    private String month;
    private int day, year;
    private String[] months = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public String toString() {
        return month + " " + day + ", " + year;
    }

    public void writeOutput() {
        System.out.println(toString());
    }

    public void readInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter month, day, and year.");
        System.out.println("Do not use a comma.");
        boolean flag = false;
        do {
            if (flag) {
                System.out.println("Illegal date. Reenter input.");
            }
            flag = true;
            this.month = in.next();
            this.day = in.nextInt();
            this.year = in.nextInt();
        } while (!dateOK(month, day, year));

        in.close();
    }

    public int geyDay() {
        return day;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        int numMonth = 0;
        for (int i=0; i<12; i++) {
            if (month == months[i]) {
                numMonth = i+1;
                break;
            }
        }

        if (numMonth == 0)
            System.out.println("Fatal Error");
        
        return numMonth;
    }

    public String monthString(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12)
            return months[monthNumber-1];
        else {
            System.out.println("Fatal Error");
            return "Error";
        }
    }
/*
    public void setDate(int newMonth, int newDay, int newYear) {
        month = monthString(newMonth);
        day = newDay;
        year = newYear;
    }
*/
    public boolean equals(Date otherDate) {
        return (otherDate == this);
    }

    public boolean precedes(Date otherDate) {
        if (this.getYear() == otherDate.getYear()) {
            if (this.getMonth() == otherDate.getMonth()) {
                return (this.geyDay() < otherDate.geyDay());
            } else return (this.getMonth() < otherDate.getMonth());
        } else return (this.getYear() < otherDate.getYear());
    }

    private boolean monthOK(String month) {
        for (String str : months) {
            if (str.equals(month)) return true;
        }
        return false;
    }


    private boolean dateOK(String month, int day, int year) {
        boolean check_day = (day <= 31) && (day >= 1);
        boolean check_month = monthOK(month);
        boolean check_year = (year <= 9999) && (year >= 1000);
        return check_day && check_month && check_year;
    }
    
    private boolean dateOK(int month, int day, int year) {
        boolean check_day = (day <= 31) && (day >= 1);
        boolean check_month = (month >= 1) && (month <= 12);
        boolean check_year = (year <= 9999) && (year >= 1000);
        return check_day && check_month && check_year;
    }

    public void setDate(String month, int day, int year) {
        if (dateOK(month, day, year)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Fatal Error");
        }
    }
    public void setDate(int month, int day, int year) {
        if (dateOK(month, day, year)) {
            this.year = year;
            this.month = monthString(month);
            this.day = day;
        } else {
            System.out.println("Fatal Error");
        }
    }
    public void setDate(int year) {
        if ((year >= 1000) && (year <= 9999)) {
            this.year = year;
            this.month = "January";
            this.day = 1;
        } else {
            System.out.println("Fatal Error");
        }
    }

    public void setMonth(int month) {
        if ((month >= 1) && (month <= 12)) {
            this.month = monthString(month);
        } else {
            System.out.println("Fatal Error");
        }
    }

    public void setDay(int day) {
        if ((day >= 1) && (day <= 31)) {
            this.day = day;
        } else {
            System.out.println("Fatal Error");
        }
    }

    public void setYear(int year) {
        if ((year >= 1000) && (year <= 9999)) {
            this.year = year;
        } else {
            System.out.println("Fatal Error");
        }
    }
}
