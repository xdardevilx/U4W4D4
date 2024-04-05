package valerio.U4W4D4.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Item {

	@Id
	@GeneratedValue
	private int id;

	@Column
	protected int calories;
	@Column
	protected double price;

	public Item() {};

	public Item(int calories, double price) {
		this.calories = calories;
		this.price = price;
	}

}
