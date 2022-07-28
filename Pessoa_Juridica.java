public class Pessoa_Juridica extends Pessoa{
    private String CNPJ;

    public Pessoa_Juridica(int ID, String nome, String endereco, String CNPJ) {
        super(ID, nome, endereco);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
