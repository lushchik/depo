package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "Rate" database table.
 * 
 */
@Entity
@Table(name="\"Rate\"")
@NamedQuery(name="Rate.findAll", query="SELECT r FROM Rate r")
public class Rate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name="from_date")
	private Date fromDate;

	private float rate;

	@Temporal(TemporalType.DATE)
	@Column(name="to_date")
	private Date toDate;

	//bi-directional many-to-one association to Deposit
	@ManyToOne
	private Deposit deposit;

	public Rate() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public float getRate() {
		return this.rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Deposit getDeposit() {
		return this.deposit;
	}

	public void setDeposit(Deposit deposit) {
		this.deposit = deposit;
	}

}