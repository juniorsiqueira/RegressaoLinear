public class RegressaoLinear {

	// Tomarei para tal implementação a Variável X como sendo o Tamanho do
	// Apartamento
	// Tomarei para tal implementação a Variável Y como sendo o Valor do
	// Apartamento
	Read read = new Read();

	private double n;

	public RegressaoLinear() {
		read.ler();
		n = read.getQtdLinhas();
	}

	public double somatorioNXY() {
		double SomaXY = 0;
		for (int i = 0; i < read.getMetros().size(); i++) {
			SomaXY += (Double) read.getMetros().get(i)
					* (Double) read.getValores().get(i);
		}
		return n * SomaXY;
	}

	public double somatorioXporY() {
		double SomaX = 0;
		double SomaY = 0;
		for (int i = 0; i < read.getMetros().size(); i++) {
			SomaX += (Double) read.getMetros().get(i);
			SomaY += (Double) read.getValores().get(i);
		}
		return SomaX * SomaY;
	}

	public double somatorioNX2() {
		double SomaX2 = 0;
		for (int i = 0; i < read.getMetros().size(); i++) {
			SomaX2 += Math.pow((Double) read.getMetros().get(i), 2);
		}
		return n * SomaX2;
	}

	public double somatorioX2() {
		double SomaX = 0;
		for (int i = 0; i < read.getMetros().size(); i++) {
			SomaX += (Double) read.getMetros().get(i);
		}
		return Math.pow(SomaX, 2);
	}

	public double mediaX() {
		double MediaX = 0;
		for (int i = 0; i < read.getMetros().size(); i++) {
			MediaX += (Double) read.getMetros().get(i);
		}
		return MediaX / n;
	}

	public double mediaY() {
		double MediaY = 0;
		for (int i = 0; i < read.getValores().size(); i++) {
			MediaY += (Double) read.getValores().get(i);
		}
		return MediaY / n;
	}

	public double inclination() {
		double SomaInclination = 0;
		SomaInclination = (somatorioNXY() - somatorioXporY())
				/ ((somatorioNX2()) - somatorioX2());
		return SomaInclination;
	}

	public double intercept() {
		double Calculo = 0;
		Calculo = mediaY() - inclination() * mediaX();
		return Calculo;
	}

	public double regressao(double Total) {
		double Regressao = 0;
		Regressao = inclination() * Total + intercept();
		return Regressao;
	}
}