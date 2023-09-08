import java.util.Scanner;

// Lớp Rectangle đại diện cho hình chữ nhật
class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void display() {
        System.out.println("Chiều rộng: " + width);
        System.out.println("Chiều cao: " + height);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }
}

// Lớp Application đại diện cho ứng dụng
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        System.out.print("Nhập chiều cao: ");
        double height = scanner.nextDouble();

        // Tạo một đối tượng hình chữ nhật
        Rectangle rectangle = new Rectangle(width, height);

        // Hiển thị thông tin về hình chữ nhật
        System.out.println("Thông tin về hình chữ nhật:");
        rectangle.display();

        scanner.close();
    }
}
