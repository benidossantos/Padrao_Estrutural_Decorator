package padroesestruturais.decorator;

public abstract class ContaDecorator implements Conta {

    private Conta conta;
    public String servicos;

    public ContaDecorator(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public abstract float getPercentualLimite();

    public float getLimite() {
        return this.conta.getLimite() * (1 + (this.getPercentualLimite() / 100));
    }

    public abstract String getNomeServico();

    public String getServicos() {
        return this.conta.getServicos() + "/" + this.getNomeServico();
    }

    public void setServicos(String servicos) {
        this.servicos = servicos;
    }
}
