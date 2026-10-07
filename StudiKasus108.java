import java.util.Scanner;
public class StudiKasus108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 15000,jumlahCup,uangBayar,totalHarga,diskon,totalBayar,kembalian,kurang;
        
        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang yang dibayarkan: ");
        uangBayar = sc.nextInt();
        
        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;
    }
}
