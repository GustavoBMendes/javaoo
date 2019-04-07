package contribuintes;

public class PessoaJuridica extends TaxPayer{
	
	private int numFunc;
	
	public PessoaJuridica(String nome, Double rendaAnual, int numFunc) {
		super(nome, rendaAnual);
		this.numFunc = numFunc;
	}

	public int getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}
	
	@Override
	public Double imposto() {
		int numeroFunc = getNumFunc();
		Double renda = super.getRendaAnual();
		
		if(numeroFunc > 10) {
			return renda * 0.14;
		}
		else {
			return renda * 0.16;
		}
	}

}
