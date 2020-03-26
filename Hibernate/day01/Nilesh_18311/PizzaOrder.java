
 
package com.sonata.Pizza;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class PizzaOrder {
	@Id
	@GeneratedValue
	private int orderId;
	private double cost;
	private String item;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "userId") 
	private PizzaLogin pizzalogin;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public PizzaLogin getPizzalogin() {
		return pizzalogin;
	}

	public void setPizzalogin(PizzaLogin pizzalogin) {
		this.pizzalogin = pizzalogin;
	}
	
	
	

}
