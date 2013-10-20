import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		double teclado = Double.parseDouble(JOptionPane.showInputDialog("Digite o Tamanho do Apartamento em Metros Quadrados e Press Enter"));
		RegressaoLinear rl = new RegressaoLinear();
		JOptionPane.showMessageDialog(null, "O tamanho passado foi " + teclado +" Metros"+"\n" + "O poss’vel Valor do Apartamnto Ž " 
		+ "R$: "+ df.format(rl.regressao(teclado)));;
	}
}
