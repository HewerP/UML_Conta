public class Pessoa_Fisica extends Pessoa{
    private String CPF;

    public Pessoa_Fisica(int ID, String nome, String endereco, String CPF) {
        super(ID, nome, endereco);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
