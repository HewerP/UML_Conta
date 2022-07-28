abstract class Conta_Redimento extends Conta{
    private float juros;

    public Conta_Redimento(int n_conta, Pessoa titular) {
        super(n_conta, titular);
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public void render(){
        addSaldo(getSaldo() * (juros/1200));
    }
}
