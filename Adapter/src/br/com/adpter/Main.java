package br.com.adpter;

import br.com.adpter.adapters.MercadopagoAdapter;
import br.com.adpter.adapters.PayonnerAdapter;
import br.com.adpter.mercadopago.Mercadopago;
import br.com.adpter.payoneer.IPayonnerPayments;
import br.com.adpter.payoneer.Payonner;
import br.com.adpter.paypal.IPayPalPayments;
import br.com.adpter.paypal.PayPal;

public class Main {
    public static void main(String[] args) {

        /*
        IPayonnerPayments payment = new Payonner();
        payment.sendPayment();
        payment.receivePayment();*/

        /*
        IPayPalPayments payments = new PayonnerAdapter(new Payonner());
        payments.paypalPayment();
        payments.paypalReceive(); */

        IPayPalPayments payments = new MercadopagoAdapter(new Mercadopago());
        payments.paypalPayment();
        payments.paypalReceive();

    }
}