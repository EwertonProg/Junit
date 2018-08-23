package fatorial;

public class Fatorial {
	static public int calcFor(int ii) {
		for (int i = ii; i > 1; i--) {
			ii *= i - 1;
		}
		return ii;
	}

	static public int calcRec(int ii) {
		if (ii != 0) {
			return ii * calcRec(ii - 1);
		} else {
			return 1;
		}
	}
}
