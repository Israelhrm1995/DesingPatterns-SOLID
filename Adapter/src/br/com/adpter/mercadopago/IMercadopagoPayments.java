package br.com.adpter.mercadopago;

import br.com.adpter.utils.Token;

public interface IMercadopagoPayments {
    Token authToken();
    void enviandoPagemento();
    void recebendoPagamento();
}
