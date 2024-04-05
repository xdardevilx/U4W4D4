package valerio.U4W4D4.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "topping")
public class Topping extends Item {


	@Column(name = "nome")
	private String name;

	@ManyToOne
	@JoinColumn(name = "pizza_id")
	private Pizza pizza;

	public Topping() {};

	public Topping(String name, int calories, double price) {
		super(calories, price);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Topping{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}
}
