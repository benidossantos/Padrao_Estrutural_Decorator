package padroesestruturais.decorator;

public class ContaCorrente implements Conta {

    public float limite;

    public ContaCorrente() {
    }

    public ContaCorrente(float limite) {
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public String getServicos() {
        return "Corrente";
    }

}
