import java.util.ArrayList;
import java.util.Scanner;

public class student {

    String name;
    int adno;
    int rollno;
    String cname;
static student w;
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
        boolean fl=true;

        while (fl)
        {
        ArrayList<student> arr = new ArrayList<student>();

            System.out.println("Enter the option:");
        while (true) {
            System.out.println("--------------------------------------------");
            System.out.println("1.Add\n2.View\n3.Search\n4.Delete\n5.Exit");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();

            switch (op) {
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

                case 2:
                    System.out.println("The details are:");
                    for (int i = 0; i < arr.size(); i++) {
                        System.out.println("employee details");
                        System.out.println("name:" + arr.get(i).name);
                        System.out.println("Adno:" + arr.get(i).adno);
                        System.out.println("rollno:" + arr.get(i).rollno);
                        System.out.println("college:" + arr.get(i).cname);
                    }
                    break;


                case 3:
                    System.out.println("enter the adno code to be search");
                    Scanner sca = new Scanner(System.in);
                    int ecod = sca.nextInt();
                    for (student e1 : arr) {
                        if (ecod == e1.adno) {
                            System.out.println("Details of employee with employee code " + ecod + "is ");
                            System.out.println("name:" + e1.name);
                            System.out.println("rollid:" + e1.rollno);
                            System.out.println("admission:" + e1.adno);
                            System.out.println("college:" + e1.cname);
                        } else {
                            System.out.println("No such student found");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter the employee code");
                    Scanner obj2 = new Scanner(System.in);
                    int ecode2 = obj2.nextInt();
                    for (student i : arr) {
                        if (ecode2 == i.adno) {
                            w = i;
                        }
                    }
                    arr.remove(w);
                    break;


                case 5:
                    fl = false;
                    break;


            }
            break;
        }
    }}
}
