import java.math.BigDecimal;

public class Main {
    /*
    *  Kreirajte klasu Racun koja sadrzi atribute brojRacuna (String), stanje (BigDecimal) i vlasnik (String)
    *  Kreiraj dvije izvedene klase:
    *
    *  TekuciRacun, na kojemu se obracunavaju kamate s fiksnom kamatnom stopom od 0.1%
    *  StedniRacun -//-
    *                                                 od 1.5%.
    *  Na svaki racun korisnik mora moci uplatiti i isplatiti novac, te postoji metoda obracunKamate koja ce
    *  obracunavati kamate na trenutno stanje na racunu (ovisno o tipu racuna) te nadodati izracunati
    *  iznos na trenutno stanje i poslije toga ispisati koliko iznosi kamata i koliko je trenutno stanje.
    *
    *  Kreirajte par racuna u main klasi, napravite  par uplata/isplata te obracunajte kamate za napravljene racune
    *
    * */

    public static void main(String[] args) {

        TekuciRacun tekuciRacun = new TekuciRacun("123-456", BigDecimal.valueOf(1000), "Ivan");
        StedniRacun stedniRacun = new StedniRacun("789-101", BigDecimal.valueOf(2000), "Ana");

        tekuciRacun.uplata(BigDecimal.valueOf(500));
        tekuciRacun.isplata(BigDecimal.valueOf(200));

        stedniRacun.uplata(BigDecimal.valueOf(1000));
        stedniRacun.isplata(BigDecimal.valueOf(500));

        tekuciRacun.obracunKamate();
        stedniRacun.obracunKamate();
    }
}