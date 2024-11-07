package br.com.adpter.payoneer;

import br.com.adpter.utils.Token;

public interface IPayonnerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
