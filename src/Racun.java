import java.math.BigDecimal;

public class Racun {

    private String brojRacuna;
    private BigDecimal stanjeRacuna;
    private String vlasnik;

    public Racun(String brojRacuna, BigDecimal stanjeRacuna, String vlasnik) {
        this.brojRacuna = brojRacuna;
        this.stanjeRacuna = stanjeRacuna;
        this.vlasnik = vlasnik;
    }

    public Racun() {
    }

    public String getBrojRacuna() {
        return this.brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public BigDecimal getStanjeRacuna() {
        return this.stanjeRacuna;
    }

    public void setStanjeRacuna(BigDecimal stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }

    public String getVlasnik() {
        return this.vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public void uplata(BigDecimal iznos) {
        if (iznos.compareTo(BigDecimal.ZERO) > 0) {
            stanjeRacuna = stanjeRacuna.add(iznos);
            System.out.println("Uplata izvršena. Novo stanje: " + stanjeRacuna);
        } else {
            System.out.println("Uplata mora biti pozitivan iznos.");
        }
    }

    public void isplata(BigDecimal iznos) {
        if (iznos.compareTo(BigDecimal.ZERO) > 0 && iznos.compareTo(stanjeRacuna) <= 0) {
            stanjeRacuna = stanjeRacuna.subtract(iznos);
            System.out.println("Isplata izvršena. Novo stanje: " + stanjeRacuna);
        } else {
            System.out.println("Isplata nije moguća. Proverite stanje na računu.");
        }
    }

}
