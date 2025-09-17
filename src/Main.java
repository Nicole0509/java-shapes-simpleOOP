//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Shapes OOP!");

        Circle circle = new Circle( 3);
        Rectangle rectangle = new Rectangle(4 ,5);


        System.out.printf("The area of the circle is %.2f cm²\n" , circle.calculateArea());

        System.out.printf("The area of the rectangle is %.2f cm²\n" , rectangle.calculateArea());

    }
}