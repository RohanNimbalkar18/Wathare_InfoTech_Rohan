//Recursion
public class Pract {
public int publicVar = 10;
private int privateVar = 20;
protected int protectedVar = 30;
int defaultVar = 40;
public void display() {
System.out.println("Public: " + publicVar);
System.out.println("Private: " + privateVar);
System.out.println("Protected: " + protectedVar);
System.out.println("Default: " + defaultVar);
public static void main(String[] args) {
Pract obj = new Pract();
obj.display();
}
}
}
