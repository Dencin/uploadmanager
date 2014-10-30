package com.softeem.train.dao1;

import java.util.List;

import com.softeem.train.dto.BuyProduct;

public interface BuyProductDAO {

	boolean addProduct(BuyProduct bp);

	List<BuyProduct> allbuyProduct();

}
