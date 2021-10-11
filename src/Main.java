import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalışanlar programına hoşgeldiniz");

        String islemler = "İşlemler...\n"
                + "1. Yazılımcı işlemleri\n"
                + "2. Yönetici işlemleri\n"
                + "Çıkış için q'ya basın";

        System.out.println("*****************");
        System.out.println(islemler);
        System.out.println("*****************");

        while(true){

        System.out.println("İşlemi seçiniz : ");
        String islem = scanner.nextLine();

        if(islem.equals("q")){

            System.out.println("Programdan çıkılıyor");
            break;
        }

        else if (islem.equals("1")){

         Yazilimci yazilimci = new Yazilimci("Mustafa Murat" , "Coşkun" , 567 , "Python,C,Java");
         String yazilimci_islem = "1. Format At\n"
                 +"2. Bilgileri Göster\n"
                 +"Çıkış için q'ya basın";

            System.out.println(yazilimci_islem);

         while(true){

             System.out.println("İşlem Seçiniz");
             String y_islem = scanner.nextLine();

             if(y_islem.equals("q")){
                 System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                 break;
             }
             else if (y_islem.equals("1")){

                 System.out.println("İşletim Sistemi");
                 String isletim_sistemi = scanner.nextLine();
                 yazilimci.formatAt(isletim_sistemi);
             }
             else if (y_islem.equals("2")){

                 yazilimci.bilgileriGoster();
             }
             else
                 System.out.println("Geçersiz yazılımcı işlemi");


         }

        }
        else if (islem.equals("2")){

            Yönetici yonetici = new Yönetici("Serhat" , "Say" ,123 ,10);

            String yonetici_islem = "Yönetici İşlemleri\n"
                                  + "1. Zam Yap\n"
                                  + "2. Bilgileri Göster\n"
                                  + "Çıkış için q'ya basın";

            System.out.println(yonetici_islem);

            while(true){
                System.out.println("İşlem seçiniz");
                String y_islem = scanner.nextLine();

                if (y_islem.equals("q")){
                    System.out.println("Yönetici işlemlerinden çıkılıyor");
                    break;
                }

                else if(y_islem.equals("1")){
                    System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                    int zamMiktari = scanner.nextInt();
                    scanner.nextLine();
                    yonetici.zamYap(zamMiktari);
                }
                else if (y_islem.equals("2")){
                    yonetici.bilgileriGoster();
                }
                else
                    System.out.println("Geçersiz yönetici işlemi");
            }
        }

        else
            System.out.println("Geçersiz işlem");


        }





    }


}
