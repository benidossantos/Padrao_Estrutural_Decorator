package padroesestruturais.decorator;

public class Seguro extends ContaDecorator {

    public Seguro(Conta conta) {
        super(conta);
    }

    public float getPercentualLimite() {
        return 5.0f;
    }

    public String getNomeServico() {
        return "Seguro";
    }
}