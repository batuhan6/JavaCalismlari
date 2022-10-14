public abstract class GameCalculator {
    public abstract void hesapla(); //diğer sınıflar hesapla yı implemente edip override etmek zorunda

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
