public class Yönetici extends Calisan{

    private int sorumlu_kisi_sayısı;



    public Yönetici(String ad, String soyad, int ID, int sorumlu_kisi_sayısı) {
        super(ad, soyad, ID);
        this.sorumlu_kisi_sayısı = sorumlu_kisi_sayısı;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu  olduğu kişi sayısı: " + sorumlu_kisi_sayısı);
    }

    public void zamYap(int zamMiktarı) {

        System.out.println(getAd() + " çalışanlara " + zamMiktarı +" kadar zam yapıyor...");
    }

}
