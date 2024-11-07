import java.math.BigDecimal;

public class StedniRacun extends Racun{

    private final BigDecimal kamatnaStopa = BigDecimal.valueOf(0.015);

    public StedniRacun(String brojRacuna, BigDecimal stanjeRacuna, String vlasnik) {
        super(brojRacuna, stanjeRacuna, vlasnik);
    }

    public StedniRacun() {
    }

    public void obracunKamate() {
        BigDecimal kamata = getStanjeRacuna().multiply(kamatnaStopa);
        uplata(kamata);
        System.out.println("Kamata za stedni racun: " + kamata + ", Novo stanje stednog racuna: " + getStanjeRacuna());
    }
}
