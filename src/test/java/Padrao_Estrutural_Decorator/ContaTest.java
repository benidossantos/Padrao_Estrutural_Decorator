package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void deveRetornarLimiteConta() {
        Conta conta = new ContaCorrente(1000.0f);

        assertEquals(1000.0f, conta.getLimite());
    }

    @Test
    void deveRetornarLimiteContaComInvestimento() {
        Conta conta = new Investimento(new ContaCorrente(1000.0f));

        assertEquals(1100.0f, conta.getLimite());
    }

    @Test
    void deveRetornarLimiteContaComCartaoCredito() {
        Conta conta = new CartaoCredito(new ContaCorrente(1000.0f));

        assertEquals(1200.0f, conta.getLimite());
    }

    @Test
    void deveRetornarLimiteContaComSeguro() {
        Conta conta = new Seguro(new ContaCorrente(1000.0f));

        assertEquals(1050.0f, conta.getLimite());
    }

    @Test
    void deveRetornarLimiteContaComInvestimentoMaisCartaoCredito() {
        Conta conta = new Investimento(new CartaoCredito(new ContaCorrente(1000.0f)));

        assertEquals(1320.0f, conta.getLimite());
    }

    @Test
    void deveRetornarLimiteContaComInvestimentoMaisSeguro() {
        Conta conta = new Investimento(new Seguro(new ContaCorrente(1000.0f)));

        assertEquals(1155.0f, conta.getLimite());
    }

    @Test
    void deveRetornarLimiteContaComCartaoCreditoMaisSeguro() {
        Conta conta = new CartaoCredito(new Seguro(new ContaCorrente(1000.0f)));

        assertEquals(1260.0f, conta.getLimite());
    }

    @Test
    void deveRetornarLimiteContaComInvestimentoMaisCartaoCreditoMaisSeguro() {
        Conta conta = new Investimento(new CartaoCredito(new Seguro(new ContaCorrente(1000.0f))));

        assertEquals(1386.0f, conta.getLimite());
    }

    @Test
    void deveRetornarServicosConta() {
        Conta conta = new ContaCorrente();

        assertEquals("Corrente", conta.getServicos());
    }

    @Test
    void deveRetornarServicosContaComInvestimento() {
        Conta conta = new Investimento(new ContaCorrente());

        assertEquals("Corrente/Investimento", conta.getServicos());
    }

    @Test
    void deveRetornarServicosContaComCartaoCredito() {
        Conta conta = new CartaoCredito(new ContaCorrente());

        assertEquals("Corrente/Cartão", conta.getServicos());
    }

    @Test
    void deveRetornarServicosContaComSeguro() {
        Conta conta = new Seguro(new ContaCorrente());

        assertEquals("Corrente/Seguro", conta.getServicos());
    }

    @Test
    void deveRetornarServicosContaComInvestimentoMaisCartaoCredito() {
        Conta conta = new Investimento(new CartaoCredito(new ContaCorrente()));

        assertEquals("Corrente/Cartão/Investimento", conta.getServicos());
    }

    @Test
    void deveRetornarServicosContaComInvestimentoMaisSeguro() {
        Conta conta = new Investimento(new Seguro(new ContaCorrente()));

        assertEquals("Corrente/Seguro/Investimento", conta.getServicos());
    }

    @Test
    void deveRetornarServicosContaComCartaoCreditoMaisSeguro() {
        Conta conta = new CartaoCredito(new Seguro(new ContaCorrente()));

        assertEquals("Corrente/Seguro/Cartão", conta.getServicos());
    }

    @Test
    void deveRetornarServicosContaComInvestimentoMaisCartaoCreditoMaisSeguro() {
        Conta conta = new Investimento(new CartaoCredito(new Seguro(new ContaCorrente())));

        assertEquals("Corrente/Seguro/Cartão/Investimento", conta.getServicos());
    }

}
