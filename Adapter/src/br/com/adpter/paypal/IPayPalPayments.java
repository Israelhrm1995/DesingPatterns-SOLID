package br.com.adpter.paypal;

import br.com.adpter.utils.Token;

public interface IPayPalPayments {
    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
