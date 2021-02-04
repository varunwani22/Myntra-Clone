package com.example.myntraapp;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseShopModel implements Serializable {

	@SerializedName("shop")
	private List<ShopShopModel> shop;

	public List<ShopShopModel> getShop(){
		return shop;
	}
}