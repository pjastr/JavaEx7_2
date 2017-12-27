public class Osoba {
    private String imie;
    private String nazwisko;
    private int rok;

    public Osoba(String imie, String nazwisko, int rok)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rok = rok;
    }

    @Override
    public String toString()
    {
        return imie+" "+nazwisko+" "+rok;
    }
}
