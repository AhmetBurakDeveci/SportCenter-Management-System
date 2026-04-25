import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Member> memberList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean devamEt = true;

        System.out.println("************************************");
        System.out.println("* SPOR MERKEZİ YÖNETİM SİSTEMİ v1.0 *");
        System.out.println("************************************");

        while (devamEt) {
            System.out.println("\n--- ANA MENÜ ---");
            System.out.println("1 - Yeni Üye Kaydet");
            System.out.println("2 - Tüm Üyeleri Listele");
            System.out.println("3 - Sistemden Çıkış");
            System.out.print("Seçiminiz: ");
            
            int secim = input.nextInt();
            input.nextLine(); 

            if (secim == 1) {
                
                System.out.print("ID: ");
                int id = input.nextInt();
                input.nextLine();
                System.out.print("Ad Soyad: ");
                String isim = input.nextLine();
                System.out.print("Branş: ");
                String brans = input.nextLine();
                System.out.print("Aylık Borç: ");
                double borc = input.nextDouble();

                memberList.add(new Member(id, isim, brans, borc));
                System.out.println("✅ Üye başarıyla eklendi.");

            } else if (secim == 2) {
             
                System.out.println("\n--- GÜNCEL ÜYE LİSTESİ ---");
                if (memberList.isEmpty()) {
                    System.out.println("⚠ Henüz kayıtlı üye yok.");
                } else {
                    for (Member m : memberList) {
                        System.out.println(m);
                    }
                }

            } else if (secim == 3) {
             
                System.out.println("👋 Sistem kapatılıyor. İyi çalışmalar!");
                devamEt = false;
            } else {
                System.out.println("❌ Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
        input.close();
    }
}