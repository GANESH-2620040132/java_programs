class Class1 {
    int add(int a,int b) {
    return a+b;
    }
}
public class Class2 {
    public static void main(String[] args) {
        Class1 obj1 = new Class1();
        int result1 = obj1.add(10,20);
        Class1 obj2 = new Class1();
        int result2 = obj2.add(50,60);
        System.out.println(result1);
        System.out.println(result2);
    }
}