
public class BubbleSort {
	/**
	 * 
	 * @param pkmns - 
	 */
	public static void sortByAttack(Pokemon[] pkmns) {
		for (int i = 0; i < pkmns.length; i++) {

			for (int j = 0; j < pkmns.length - 1 - i; j++) {
				if (pkmns[j].attack < pkmns[j + 1].attack) {
					swap(pkmns, j, j + 1);
				}
			}

		}

	}

	public static void sortByDefense(Pokemon[] pkmns) {
		for (int i = 0; i < pkmns.length; i++) {

			for (int j = 0; j < pkmns.length - 1 - i; j++) {
				if (pkmns[j].attack < pkmns[j + 1].attack) {
					swap(pkmns, j, j + 1);
				}
			}

		}

	}

	public static void sortBySpAtk(Pokemon[] pkmns) {
		for (int i = 0; i < pkmns.length; i++) {

			for (int j = 0; j < pkmns.length - 1 - i; j++) {
				if (pkmns[j].attack < pkmns[j + 1].attack) {
					swap(pkmns, j, j + 1);
				}
			}

		}

	}

	public static void sortBySpDef(Pokemon[] pkmns) {
		for (int i = 0; i < pkmns.length; i++) {

			for (int j = 0; j < pkmns.length - 1 - i; j++) {
				if (pkmns[j].attack < pkmns[j + 1].attack) {
					swap(pkmns, j, j + 1);
				}
			}

		}

	}

	public static void sortBySpeed(Pokemon[] pkmns) {
		for (int i = 0; i < pkmns.length; i++) {

			for (int j = 0; j < pkmns.length - 1 - i; j++) {
				if (pkmns[j].attack < pkmns[j + 1].attack) {
					swap(pkmns, j, j + 1);
				}
			}

		}

	}

	private static void swap(Pokemon[] pkmns, int i, int j) {

		Pokemon k = pkmns[i];
		pkmns[i] = pkmns[j];
		pkmns[j] = k;
	}
}
