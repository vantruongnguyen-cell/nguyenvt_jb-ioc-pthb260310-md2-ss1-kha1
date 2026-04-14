import java.util.Scanner;

public class BaiKha1 {
    static void main() {
        int radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kinh: ");
        radius = Integer.parseInt(sc.nextLine());

        double Area;
        Area = Math.PI * Math.pow(radius, 2);
        System.out.println("Diện tích hình tròn với bán kính = "+radius +" là: "+Area);
    }
}
