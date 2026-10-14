class B {
    void showMessage() {
        System.out.println("Hello from class B!");
    }
}
public class A {
    public static void main(String[] args) {
        B obj = new B();   // create object of B
        obj.showMessage(); // call method of B
    }
}
