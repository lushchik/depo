package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Currency" database table.
 * 
 */
@Entity
@Table(name="\"Currency\"")
@NamedQuery(name="Currency.findAll", query="SELECT c FROM Currency c")
public class Currency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String descr;

	public Currency() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

}