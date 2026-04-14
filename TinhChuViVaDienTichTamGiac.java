package demo;

public class TinhChuViVaDienTichTamGiac {
    static void main() {
        int a, b,c;
        a = 4;
        b = 3;
        c = 2;
        int chuvi = a+b+c;
        float p = (float)chuvi/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Chu vi tam giac la: "+chuvi);
        System.out.println("Dien tich tam giac la: "+area);
    }
}
