package liushiqihomework;

public class g_num {
	public static void main(String[] args) {
		int i, j, k;
		int m = 0;
		for (i = 1; i < 5; i++) {
			for (j = 1; j < 5; j++) {
				for (k = 1; k < 5; k++) {
					if (i != j && k != j && i != k) {
						m++;
						System.out.print(i * 100 + j * 10 + k + " ");
					}
				}
			}
		}
		System.out.println();

		System.out.print("¸öÊýÎª" + m);

	}

}
