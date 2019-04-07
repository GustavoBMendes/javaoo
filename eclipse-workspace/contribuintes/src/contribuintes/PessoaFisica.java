package contribuintes;

public class PessoaFisica extends TaxPayer{

	private Double gastosSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double imposto() {
		Double renda = super.getRendaAnual();
		Double gastosS = getGastosSaude();
		if(renda > 20000.00) {
			if(gastosS > 0.00) {
				return (renda * 0.25) - (gastosS * 0.50);
			}
			else {
				return renda * 0.25;
			}
		}
		else {
			if(gastosS > 0.00) {
				return (renda * 0.15) - (gastosS * 0.50);
			}
			else {
				return renda * 0.15;
			}
		}
	}
}
