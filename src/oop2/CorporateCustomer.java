package oop2;

public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxNumer;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumer() {
		return taxNumer;
	}

	public void setTaxNumer(String taxNumer) {
		this.taxNumer = taxNumer;
	}
}
