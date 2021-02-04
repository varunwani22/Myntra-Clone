package com.example.myntraapp;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class StudioStudioModel implements Serializable {

	@SerializedName("id")
	private int id;

	@SerializedName("name")
	private String name;

	@SerializedName("follow")
	private String follow;

	@SerializedName("online_status")
	private String onlineStatus;

	@SerializedName("avatar")
	private String avatar;

	@SerializedName("description")
	private String description;

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getFollow(){
		return follow;
	}

	public String getOnlineStatus(){
		return onlineStatus;
	}

	public String getAvatar(){
		return avatar;
	}

	public String getDescription(){
		return description;
	}
}