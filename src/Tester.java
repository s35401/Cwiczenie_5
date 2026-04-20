public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String id, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy ) {
        super(id, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }
    @Override
    public double obliczKosztMiesieczny() {
        return getStawkaBazowa();
    }
    @Override
    public String przedstawSie() {
        return super.przedstawSie() + "Tester: ";

    }
    public void uruchomRaportTestow() {
        System.out.println("Uruchom raport testow.");
    }
}