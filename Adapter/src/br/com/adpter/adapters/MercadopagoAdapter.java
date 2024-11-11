package br.com.adpter.adapters;

import br.com.adpter.mercadopago.Mercadopago;
import br.com.adpter.payoneer.Payonner;
import br.com.adpter.paypal.IPayPalPayments;
import br.com.adpter.utils.Token;

public class MercadopagoAdapter implements IPayPalPayments {
    private Token token;
    private Mercadopago mercadopago;

    public MercadopagoAdapter(Mercadopago mercadopago){
        this.mercadopago = mercadopago;
        System.out.println("Adaptando o MercadoPago utilizando os metodos padroes do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadopago.enviandoPagemento();
    }

    @Override
    public void paypalReceive() {
        this.mercadopago.recebendoPagamento();
    }
}
