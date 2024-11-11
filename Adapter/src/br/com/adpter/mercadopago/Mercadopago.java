package br.com.adpter.mercadopago;

import br.com.adpter.utils.Token;

public class Mercadopago implements  IMercadopagoPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void enviandoPagemento() {
        System.out.println("Enviando pagamentos via Mercadopago");
    }

    @Override
    public void recebendoPagamento() {
        System.out.println("Recebendo pagamentos via Mercadopago");
    }
}
