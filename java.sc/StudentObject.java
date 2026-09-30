public class StudentObject{
    public static void main (String[] a){
        Student s1 = new Student();
        s1.marks = 50;
        Student s2 = new Student();
        s2.marks = 70;
        System.out.println(s1.marks);
        System.out.println(s2.marks);
    }
}
class Student{
    int marks;
}