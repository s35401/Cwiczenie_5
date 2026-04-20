public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String id, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(id, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;

    }

    @Override
    public double obliczKosztMiesieczny() {
        return getStawkaBazowa();
    }
    @Override
    public String przedstawSie() {
        return super.przedstawSie() + "Programista :" + glownyJezyk;
    }
    public void wypiszTechnologie() {
        System.out.println("Moja technologia to:" + glownyJezyk + "itd., itp.");
    }
}
