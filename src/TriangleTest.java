import java.util.Scanner;
public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao canh thu nhat: ");
        double size1 = input.nextDouble();
        triangle.setSize1(size1);
        System.out.println("Nhap vao canh thu hai: ");
        double size2 = input.nextDouble();
        triangle.setSize2(size2);
        System.out.println("Nhap vao canh thu ba: ");
        double size3 = input.nextDouble();
        input.nextLine();
        triangle.setSize3(size3);
        System.out.println("Nhap vao mau sac:");
        String color =input.nextLine();
        triangle.setColor(color);
        System.out.println(triangle);
    }
}
