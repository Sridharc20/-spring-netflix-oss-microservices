/**
 * 
 */
package com.spring.netflix.oss.microservices.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Sridhar.C
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardVO {

	private Long id;
	private String cardHolderName;
	private String panNumber;
	private String validDate;

	/**
	 * constructor
	 */
	public CardVO() {
		super();
	}

	public CardVO(Long id, String cardHolderName, String panNumber, String validDate) {
		super();
		this.id = id;
		this.cardHolderName = cardHolderName;
		this.panNumber = panNumber;
		this.validDate = validDate;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getValidDate() {
		return validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", cardHolderName=" + cardHolderName + ", panNumber=" + panNumber + ", validDate="
				+ validDate + "]";
	}

}
