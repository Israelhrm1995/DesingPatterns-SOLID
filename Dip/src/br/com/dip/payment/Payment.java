package br.com.dip.payment;

import br.com.dip.factory.Db;
import br.com.dip.factory.DbProductFactory;
import br.com.dip.model.IDbProduct;
import br.com.dip.model.MySQLProduct;

public class Payment {

    public void pay(String productID){
//        MySQLProduct dbProduct = new MySQLProduct();
        IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
