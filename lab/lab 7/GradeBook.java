import java.util.Scanner;

public class GradeBook {
    private int numberOfStudents;
    private int numberOfQuizzes;

    private int[][] grade;
    private double[] studentAverage;
    private double[] quizAverage;

    public GradeBook(int[][] a) {
        if (a.length == 0 || a[0].length == 0) {
            System.out.println("Empty grade records. Aborting.");
            System.exit(0);
        }
        numberOfStudents = a.length;
        numberOfQuizzes = a[0].length;
        fillGrade(a);
        fillStudentAverage();
        fillQuizAverage();
    }

    public GradeBook(GradeBook book) {
        numberOfStudents = book.numberOfStudents;
        numberOfQuizzes = book.numberOfQuizzes;
        fillGrade(book.grade);
        fillStudentAverage();
        fillQuizAverage();
    }   

    public GradeBook() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numer of students:");
        numberOfStudents = in.nextInt();

        System.out.println("Enter number of quizzes:");
        numberOfQuizzes = in.nextInt();

        grade = new int[numberOfStudents][numberOfQuizzes];
        for (int studentNumber=0; studentNumber<numberOfStudents; studentNumber++) {
            for (int quizNumber=0; quizNumber<numberOfQuizzes; quizNumber++) {
                System.out.println("Enter score for student number " + studentNumber+1);
                System.out.println("on quiz number " + quizNumber+1);
                grade[studentNumber][quizNumber] = in.nextInt();
            }
        }
        fillStudentAverage();
        fillQuizAverage();
    }

    private void fillGrade(int[][] a) {
        grade = new int[numberOfStudents][numberOfQuizzes];
        for (int studentNumber=0; studentNumber<numberOfStudents; studentNumber++)
            for (int quizNumber=0; quizNumber<numberOfQuizzes; quizNumber++)
                grade[studentNumber][quizNumber] = a[studentNumber][quizNumber];
    }

    private void fillStudentAverage() {
        studentAverage = new double[numberOfStudents];

        for (int studentNumber=0; studentNumber<numberOfStudents; studentNumber++) {
            double sum = 0;
            for (int quizNumber=0; quizNumber<numberOfQuizzes; quizNumber++)
                sum += grade[studentNumber][quizNumber];
            studentAverage[numberOfQuizzes] = sum / numberOfQuizzes;
        }
    }

    private void fillQuizAverage() {
        quizAverage = new double[numberOfQuizzes];
        
        for (int quizNumber=0; quizNumber<numberOfQuizzes; quizNumber++) {
            double sum = 0;
            for (int studentNumber=0; studentNumber<numberOfStudents; studentNumber++)
                sum += grade[studentNumber][quizNumber];
            quizAverage[quizNumber] = sum / numberOfStudents;
        }
    }

    public void display() {
        for (int studentNumber=0; studentNumber<numberOfStudents; studentNumber++) {
            System.out.print("Student " + (studentNumber+1) + " Quizzes: ");
            for (int quizNumber=0; quizNumber<numberOfQuizzes; quizNumber++)
                System.out.print(grade[studentNumber][quizNumber] + " ");
            System.out.println("\nAverage = " + studentAverage[studentNumber]);
        }
        
        System.out.println("Quiz averages: ");
        for (int quizNumber=0; quizNumber<numberOfQuizzes; quizNumber++)
            System.out.print(grade[studentNumber][quizNumber] + " ");
        System.out.println("\nAverage = " + studentAverage[studentNumber]);
        System.out.println();
    }
}
