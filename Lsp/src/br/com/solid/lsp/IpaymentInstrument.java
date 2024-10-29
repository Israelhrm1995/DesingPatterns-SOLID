package br.com.solid.lsp;

public interface IpaymentInstrument {

    void validate() throws Exception;
    void collectPayment();
}
