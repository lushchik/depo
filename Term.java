package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Term" database table.
 * 
 */
@Entity
@Table(name="\"Term\"")
@NamedQuery(name="Term.findAll", query="SELECT t FROM Term t")
public class Term implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="days_count")
	private Integer daysCount;

	private String descr;

	@Column(name="months_count")
	private Integer monthsCount;

	@Column(name="years_count")
	private Integer yearsCount;

	public Term() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDaysCount() {
		return this.daysCount;
	}

	public void setDaysCount(Integer daysCount) {
		this.daysCount = daysCount;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Integer getMonthsCount() {
		return this.monthsCount;
	}

	public void setMonthsCount(Integer monthsCount) {
		this.monthsCount = monthsCount;
	}

	public Integer getYearsCount() {
		return this.yearsCount;
	}

	public void setYearsCount(Integer yearsCount) {
		this.yearsCount = yearsCount;
	}

}