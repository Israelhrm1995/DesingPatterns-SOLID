package br.com.solid.lsp;

public class NubankRewards implements IpaymentInstrument{

    @Override
    public void validate() throws Exception {

        System.out.println("Limite OK, Rewards OK!");
    }

    @Override
    public void collectPayment() {

        System.out.println("Pagamento Realizado com sucesso!");
        System.out.println("Pontuacao creditada no Rewards!");
    }
}
