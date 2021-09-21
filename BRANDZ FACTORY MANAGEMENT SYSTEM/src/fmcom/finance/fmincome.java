package fmcom.finance;

public class fmincome {
	private int transactionid;
	private String bname;
	private String bankDetails;
	private String discount;
	private String icode;
	private String quantity;
	private String proce;
	
	public fmincome(int transactionid, String bname, String bankDetails, String discount, String icode, String quantity,
			String proce) {
		
		this.transactionid = transactionid;
		this.bname = bname;
		this.bankDetails = bankDetails;
		this.discount = discount;
		this.icode = icode;
		this.quantity = quantity;
		this.proce = proce;
	}

	public int getTransactionid() {
		return transactionid;
	}

	public String getBname() {
		return bname;
	}

	public String getBankDetails() {
		return bankDetails;
	}

	public String getDiscount() {
		return discount;
	}

	public String getIcode() {
		return icode;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getProce() {
		return proce;
	}

	

}
