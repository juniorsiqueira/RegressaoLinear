import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Read {
	
	private double qtdLinhas = 0;
	private ArrayList<Double> metros = new ArrayList<Double>();
	private ArrayList<Double> valores = new ArrayList<Double>();

	public void ler(){
		
		try{  
	        
	         BufferedReader br = new BufferedReader(new FileReader("Apartamentos.txt"));  
	  
	         while(br.ready()){  
	            String linha = br.readLine();
	            
	            String metros = linha.substring(0, linha.indexOf(' '));
	            String valor = linha.substring(linha.lastIndexOf(' ')+ 1, linha.length());
	            
	            double m = Double.parseDouble(metros);
	            this.metros.add(m);
	            
	            double v = Double.parseDouble(valor);   
	            this.valores.add(v);
	            
	            this.qtdLinhas++;
	          }  
	         
	         br.close();  
	      }catch(IOException ioe){  
	         ioe.printStackTrace();  
	      }  
	}

	public double getQtdLinhas() {
		return qtdLinhas;
	}

	public void setQtdLinhas(int qtdLinhas) {
		this.qtdLinhas = qtdLinhas;
	}

	public ArrayList<Double> getMetros() {
		return metros;
	}

	public void setMetros(ArrayList<Double> metros) {
		this.metros = metros;
	}

	public ArrayList<Double> getValores() {
		return valores;
	}

	public void setValores(ArrayList<Double> valores) {
		this.valores = valores;
	}
	

}
