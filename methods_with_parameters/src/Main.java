public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = şehirVer();
        System.out.println(yeniMesaj);

        int topla = topla(5,2);
        System.out.println(topla);

        int toplam = topla2(2,3,4,5,10);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void güncelle() {
        System.out.println("Güncellendi");
    }

    public static String şehirVer(){
        return "Ankara";
    }

    public static int topla(int x,int y){
        return x+y;
    }

    public static int topla2(int... sayilar){
        int x = 0;
        for(int sayi:sayilar){
            x+=sayi;
        }
        return x;
    }
}

