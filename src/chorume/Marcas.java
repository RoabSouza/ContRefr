package chorume;

public class Marcas {

	final private double COCACOLA = 8.90;
	private double CocaPreco = 0;
	private int colacont = 0;

	final private double PEPSI = 7.50;
	private int pepsicont = 0;
	private double PepsiPreco = 0;

	final private double ROLLER = 5.50;
	private int rollercont = 0;
	private double RollerPreco = 0;

	public void cont(int Ccont) {

		CocaPreco += Ccont;
		if (CocaPreco >= COCACOLA) {
			colacont++;

			CocaPreco = 0;
		}
		PepsiPreco += Ccont;
		if (PepsiPreco >= COCACOLA) {
			colacont++;

			PepsiPreco = 0;
		}

		rollercont += Ccont;
		if (rollercont >= COCACOLA) {
			colacont++;

			rollercont = 0;
		}

	}

}
