import java.math.BigDecimal;

public class TekuciRacun extends Racun{

    private final BigDecimal kamatnaStopa = BigDecimal.valueOf(0.001);

    public TekuciRacun(String brojRacuna, BigDecimal stanjeRacuna, String vlasnik) {
        super(brojRacuna, stanjeRacuna, vlasnik);
    }

    public TekuciRacun() {
    }

    public void obracunKamate() {
        BigDecimal kamata = getStanjeRacuna().multiply(kamatnaStopa);
        uplata(kamata);
        System.out.println("Kamata za tekuci racun: " + kamata + ", Novo stanje tekuceg racuna: " + getStanjeRacuna());
    }
}
