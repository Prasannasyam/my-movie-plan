package com.MyMoviePlan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "prices")
public class PriceEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@Column
    private double general;
    @Column
    private double silver;
    @Column
    private double gold;

    public PriceEntity(double general, double silver, double gold) {
        this.setGeneral(general);
        this.setSilver(silver);
        this.setGold(gold);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getGeneral() {
		return general;
	}

	public void setGeneral(double general) {
		this.general = general;
	}

	public double getSilver() {
		return silver;
	}

	public void setSilver(double silver) {
		this.silver = silver;
	}

	public double getGold() {
		return gold;
	}

	public void setGold(double gold) {
		this.gold = gold;
	}
}
