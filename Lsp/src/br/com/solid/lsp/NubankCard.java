package br.com.solid.lsp;

abstract  public class NubankCard implements  IpaymentInstrument{

    @Override
    public void validate() throws Exception{
        //validacao basica
    }

    @Override
    public void collectPayment(){
        System.out.println("Pagamento Realizado");
    }
}
