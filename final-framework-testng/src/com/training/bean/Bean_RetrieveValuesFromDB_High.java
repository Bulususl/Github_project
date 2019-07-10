package com.training.bean;

public class Bean_RetrieveValuesFromDB_High {

	private String name;
	private String description;
	private String MetaTag;
	private String MetaTagD;
	
	public Bean_RetrieveValuesFromDB_High() {
	}
	
	public Bean_RetrieveValuesFromDB_High(String name, String description, String Metatag, String MetatagD) {
		super();
		this.name = name;
		this.description = description;
		this.MetaTag= Metatag;
		this.MetaTagD= MetatagD;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getMetaTag() {
		return MetaTag;
	}

	public void setMetaTag(String MetaTag) {
		this.MetaTag = MetaTag;
	}
	
	public String getMetaTagD() {
		return MetaTagD;
	}

	public void setMetaTagD(String MetaTagD) {
		this.MetaTagD = MetaTagD;
	}
	
	
	@Override
	public String toString() {
		return "Bean_RetrieveValuesFromDB_High [name=" + name + ", description=" + description + ", MetaTag=" + MetaTag + ", MetaTagD=" + MetaTagD +"]";
	}
	

}
