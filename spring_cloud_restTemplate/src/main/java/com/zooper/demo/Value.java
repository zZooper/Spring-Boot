package com.zooper.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * @JsonIgnoreProperties : json转换忽略不存在的属性
 * @author Administrator
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Value {

	private Long id;
	private String Quote;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuote() {
		return Quote;
	}
	public void setQuote(String quote) {
		Quote = quote;
	}
	@Override
	public String toString() {
		return "Value [id=" + id + ", Quote=" + Quote + "]";
	}
	
}
