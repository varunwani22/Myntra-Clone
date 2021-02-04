package com.example.myntraapp;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ShopShopModel implements Serializable {

	@SerializedName("id")
	private int id;

	@SerializedName("category")
	private String category;

	@SerializedName("brand")
	private String brand;

	@SerializedName("title")
	private String title;

	@SerializedName("price")
	private String price;

	@SerializedName("avatar")
	private String avatar;

	@SerializedName("description")
	private String description;

	public int getId(){
		return id;
	}

	public String getCategory(){
		return category;
	}

	public String getBrand(){
		return brand;
	}

	public String getTitle(){
		return title;
	}

	public String getPrice(){
		return price;
	}

	public String getAvatar(){
		return avatar;
	}

	public String getDescription(){
		return description;
	}
}