package padroesestruturais.decorator;

public class Investimento extends ContaDecorator {

    public Investimento(Conta conta) {
        super(conta);
    }

    public float getPercentualLimite() {
        return 10.0f;
    }

    public String getNomeServico() {
        return "Investimento";
    }
}
