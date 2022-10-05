public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] sayilar = {3, 5, 2, 9, 7, 5};

        int aranacak = 2;

        for (int sayi:sayilar){
            if(sayi == aranacak){
                mesajVer(aranacak);
                break;
            }
        }
    }

    public static void mesajVer(int aranacak){
        System.out.println("sayıyı buldun");
    }
}