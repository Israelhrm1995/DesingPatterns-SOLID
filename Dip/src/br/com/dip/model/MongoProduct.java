package br.com.dip.model;

public class MongoProduct implements IDbProduct{

    public String getProductById(String productID){
        return "MongoDB: Exibindo dados do produto " + productID;
    }
}
