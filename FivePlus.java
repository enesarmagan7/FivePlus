package Week2;

public class FivePlus {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); // Kullanıcıdan alınan değer
        recursiveIslem(n);
    }

    public static void recursiveIslem(int n) {
        // Base case: n 0 veya negatif olduğunda işlemi sonlandır
        if (n <= 0) {
            System.out.println("Son Değer: " + n);
        } else {
            // 5 çıkar ve son değeri yazdır
            System.out.println("Çıkarma Sonucu: " + n);
            recursiveIslem(n - 5); // Recursive çağrı

            // 5 ekle ve son değeri yazdır
            System.out.println("Toplama Sonucu: " + n);
        }
    }
}
