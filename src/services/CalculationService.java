package services;

import java.util.List;

public class CalculationService {
	/*
	 * Adaptação do max para que funcione com qualquer tipo. Para que não de erro no
	 * .compareTo, pois ele não está definido pelo tipo T, é necessário especificar
	 * que o tipo T é do tipo comparable <T extends Comparable<T>.
	 */

	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}