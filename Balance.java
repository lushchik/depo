package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "Balance" database table.
 * 
 */
@Entity
@Table(name="\"Balance\"")
@NamedQuery(name="Balance.findAll", query="SELECT b FROM Balance b")
public class Balance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Long balance;

	@Temporal(TemporalType.DATE)
	@Column(name="from_date")
	private Date fromDate;

	@Temporal(TemporalType.DATE)
	@Column(name="to_date")
	private Date toDate;

	//bi-directional many-to-one association to Deposit
	@ManyToOne
	private Deposit deposit;

	public Balance() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getBalance() {
		return this.balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
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