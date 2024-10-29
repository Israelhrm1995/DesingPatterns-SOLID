package br.com.dip.model;

public class MySQLProduct implements IDbProduct{

    public String getProductById(String productID){
        return "Mysql: Exibindo dados do produto " + productID;
    }
}
