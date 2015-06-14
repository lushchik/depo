package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "Deposit" database table.
 * 
 */
@Entity
@Table(name="\"Deposit\"")
@NamedQuery(name="Deposit.findAll", query="SELECT d FROM Deposit d")
public class Deposit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="auto_renewal_count")
	private Integer autoRenewalCount;

	@Column(name="bank_id")
	private Integer bankId;

	@Column(name="branch_id")
	private Integer branchId;

	@Column(name="capitalization_frequency_id")
	private Integer capitalizationFrequencyId;

	@Column(name="currency_id")
	private Integer currencyId;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Temporal(TemporalType.DATE)
	@Column(name="fix_term_end_date")
	private Date fixTermEndDate;

	@Column(name="fix_term_id")
	private Integer fixTermId;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	@Column(name="term_id")
	private Integer termId;

	//bi-directional many-to-one association to Balance
	@OneToMany(mappedBy="deposit")
	private List<Balance> balances;

	//bi-directional many-to-one association to Rate
	@OneToMany(mappedBy="deposit")
	private List<Rate> rates;

	public Deposit() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAutoRenewalCount() {
		return this.autoRenewalCount;
	}

	public void setAutoRenewalCount(Integer autoRenewalCount) {
		this.autoRenewalCount = autoRenewalCount;
	}

	public Integer getBankId() {
		return this.bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public Integer getBranchId() {
		return this.branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public Integer getCapitalizationFrequencyId() {
		return this.capitalizationFrequencyId;
	}

	public void setCapitalizationFrequencyId(Integer capitalizationFrequencyId) {
		this.capitalizationFrequencyId = capitalizationFrequencyId;
	}

	public Integer getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getFixTermEndDate() {
		return this.fixTermEndDate;
	}

	public void setFixTermEndDate(Date fixTermEndDate) {
		this.fixTermEndDate = fixTermEndDate;
	}

	public Integer getFixTermId() {
		return this.fixTermId;
	}

	public void setFixTermId(Integer fixTermId) {
		this.fixTermId = fixTermId;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getTermId() {
		return this.termId;
	}

	public void setTermId(Integer termId) {
		this.termId = termId;
	}

	public List<Balance> getBalances() {
		return this.balances;
	}

	public void setBalances(List<Balance> balances) {
		this.balances = balances;
	}

	public Balance addBalance(Balance balance) {
		getBalances().add(balance);
		balance.setDeposit(this);

		return balance;
	}

	public Balance removeBalance(Balance balance) {
		getBalances().remove(balance);
		balance.setDeposit(null);

		return balance;
	}

	public List<Rate> getRates() {
		return this.rates;
	}

	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}

	public Rate addRate(Rate rate) {
		getRates().add(rate);
		rate.setDeposit(this);

		return rate;
	}

	public Rate removeRate(Rate rate) {
		getRates().remove(rate);
		rate.setDeposit(null);

		return rate;
	}

}