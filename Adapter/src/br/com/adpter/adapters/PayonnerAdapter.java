package br.com.adpter.adapters;

import br.com.adpter.payoneer.Payonner;
import br.com.adpter.paypal.IPayPalPayments;
import br.com.adpter.utils.Token;

public class PayonnerAdapter implements IPayPalPayments {
    private Token token;
    private Payonner payonner;

    public  PayonnerAdapter(Payonner payonner){
        this.payonner = payonner;
        System.out.println("Adaptando o Payonner utilizando os metodos padroes do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payonner.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payonner.receivePayment();
    }
}
