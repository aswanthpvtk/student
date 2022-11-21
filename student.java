import java.util.ArrayList;
import java.util.Scanner;

public class student {

    String name;
    int adno;
    int rollno;
    String cname;

    public student(String name, int adno, int rollno, String cname) {
        this.name = name;
        this.adno = adno;
        this.rollno = rollno;
        this.cname = cname;
    }

    public String getName() {
        return name;
    }

    public int getAdno() {
        return adno;
    }

    public int getRollno() {
        return rollno;
    }

    public String getCname() {
        return cname;
    }

    public static void main(String[] args) {
        int op;
        ArrayList<student> arr = new ArrayList<student>();

            System.out.println("Enter the option:");
            System.out.println("--------------------------------------------");
            System.out.println("1.Add\n2.View\n3.Search\n4.Delete\n5.Exit");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();

            switch(op)
            {
                case 1:
                    System.out.println("Enter the student name");
                    String name = sc.next();
                    System.out.println("Enter the ad no");
                    int adno = sc.nextInt();
                    System.out.println("enter the rollno");
                    int rollno = sc.nextInt();
                    System.out.println("enter the college name");
                    String cname = sc.next();
                    student e = new student(name, adno, rollno, cname);
                    arr.add(e);
                    break;


            }

    }
}
