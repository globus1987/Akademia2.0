package pl.atena.edu.akademia3.sklep;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/**
 * @author Arkadiusz
 *
 */
public class ListaTowarow {

	private List<Towar> towary;

	public ListaTowarow() {
		List<Towar> towaryinicjalne = new ArrayList<>();
		Set<RodzajTowaru> rodzajeTowarow = EnumSet.allOf(RodzajTowaru.class);
		rodzajeTowarow.forEach(o->towaryinicjalne.add(new Towar(o)));
		towaryinicjalne.sort(Comparator.comparing(Towar::getIlosc));
		this.towary = towaryinicjalne;	}

	public List<Towar> getTowary() {
		this.towary.sort(Comparator.comparing(Towar::getIlosc));
		return this.towary;
	}

	public void setTowary(final List<Towar> towary) {
		this.towary = towary;
	}

	@Override
	public String toString() {
		return String.format("ListaTowarow [towary=%s]", this.towary);
	}

}
