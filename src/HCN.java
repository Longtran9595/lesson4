import java.util.Scanner;

class HCN{
    double chieuRong;
    double chieuDai;

    public HCN (double chieuRong, double chieuDai){
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }

    public double Dientich(){
        return chieuDai*chieuRong;
    }

    public double ChuVi(){
        return 2*(chieuRong+chieuDai);
    }

    public void Display(){
        System.out.println("chieu rong "+ chieuRong);
        System.out.println("chieu dai " + chieuDai);
        System.out.println("dien tich " + Dientich());
        System.out.println("chu vi "+ChuVi());
    }
}

class Show{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap chieu rong ");
        double chieuRong = input.nextDouble();
        System.out.println("nhap chieu dai");
        double chieuDai = input.nextDouble();

        HCN Rectangle = new HCN(chieuRong, chieuDai);
        System.out.println("thông tin của hình chữ nhật");
        Rectangle.Display();

        input.close();
    }
}