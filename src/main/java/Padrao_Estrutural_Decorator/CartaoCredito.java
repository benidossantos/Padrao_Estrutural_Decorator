package padroesestruturais.decorator;

public class CartaoCredito extends ContaDecorator {

    public CartaoCredito(Conta conta) {
        super(conta);
    }

    public float getPercentualLimite() {
        return 20.0f;
    }

    public String getNomeServico() {
        return "Cartão";
    }
}

