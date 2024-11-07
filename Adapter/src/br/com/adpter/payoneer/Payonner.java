package br.com.adpter.payoneer;

import br.com.adpter.utils.Token;

public class Payonner implements IPayonnerPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via Payonner");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via Payonner");
    }
}
