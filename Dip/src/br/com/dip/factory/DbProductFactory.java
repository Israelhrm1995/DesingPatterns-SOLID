package br.com.dip.factory;

import br.com.dip.model.IDbProduct;
import br.com.dip.model.MongoProduct;
import br.com.dip.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(Db type){
        if(type == Db.MYSQL) return new MySQLProduct();
        return new MongoProduct();
    }
}
