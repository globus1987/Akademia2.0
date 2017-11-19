package pl.atena.edu.akademia3.sklep;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.UnaryOperator;

public class Towar implements Produkt {
	protected RodzajTowaru nazwa;
	protected BigDecimal cena;
	protected Integer ilosc;

	public void setCenaPromocyjna(final BigDecimal cena) {
		this.cena = this.cena.multiply((BigDecimal.valueOf(100).subtract(cena)).divide(BigDecimal.valueOf(100)));
		this.zaokraglenieCeny();
	}

	public void CenaBazowaWymus(final boolean parzysty) {
		BigDecimal cenabazowa = this.nazwa.getCenaBazowa();

		if (parzysty) {
			this.cena = cenabazowa.multiply(BigDecimal.valueOf(0.9));
		} else {
			this.cena = cenabazowa.multiply(BigDecimal.valueOf(0.95));
		}
		this.zaokraglenieCeny();
	}

	public void CenaBazowa() {
		int month = LocalDate.now().getMonthValue();
		this.cena = this.nazwa.getCenaBazowa();
		this.zaokraglenieCeny();
	}

	public void CenaBazowaZModyfikatorem() {
		this.cena = this.modyfikator().apply(this.nazwa.getCenaBazowa());
		this.zaokraglenieCeny();
	}

	protected UnaryOperator<BigDecimal> modyfikator() {
		int month = LocalDate.now().getMonthValue();
		if (month % 2 == 0) {
			return item -> item.multiply(BigDecimal.valueOf(0.9));
		} else {
			return item -> item.multiply(BigDecimal.valueOf(0.95));
		}
	}

	public void zaokraglenieCeny() {
		this.cena = this.cena.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public Towar() {
		this.ilosc = Integer.valueOf(0);
	}

	public Integer getIlosc() {
		return this.ilosc;
	}

	public Towar(final RodzajTowaru rodzaj) {
		this.ilosc = Integer.valueOf(0);
		this.nazwa = rodzaj;
		this.CenaBazowa();
	}

	public void dostarczTowar(final Integer ilosc) {
		if (ilosc != null) {
			this.ilosc += ilosc;
		}

	}

	public BigDecimal getCena() {
		return this.cena;
	}

	public void sprzedajTowar(final Integer ilosc) {
		if (ilosc != null) {
			this.ilosc -= ilosc;
		}

	}

	public Integer podajIloscTowaru() {
		return this.ilosc;
	}

	@Override
	public String toString() {
		return String.format("Towar [nazwa=%s, cena=%s, ilosc=%s, %s\n]", this.nazwa, this.cena, this.ilosc,
				this.nazwa.tekst());
	}

	@Override
	public RodzajTowaru nazwaProduktu() {

		return this.nazwa;
	}

	@Override
	public Boolean dlaPelnoletnich() {
		return this.nazwa.getDlaPelnoletnich();
	}

}
