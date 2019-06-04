package main.java.com.gs.loan;


import java.sql.SQLException;
import java.util.TreeMap;

public class AcctPaymentSchedule {

  private String serialno;
  private String objecttype;
  private String objectno;
  /** �ڴ� */
  private double periodno;
  /** ���ڻ����� */
  private String paydate;
  /** �������Ӻ�Ļ������� */
  private String graceintedate;
  /** ����Ӧ������ */
  private double payprincipalamt;
  /** �����ѻ����� */
  private double actualpayprincipalamt;
  /** ���ڼ��Ȿ�� */
  private double waiveprincipalamt;
  /** �������ڱ��� */
  private double overdueprincipalamt;
  /** ����Ӧ����Ϣ */
  private double payinterestamt;
  /**�����ѻ���Ϣ*/
  private double actualpayinterestamt;
  /** ���ڼ�����Ϣ */
  private double waiveinterestamt;
  /** ����Ӧ����Ϣ */
  private double payprincipalpenaltyamt;
  /** �����ѻ���Ϣ */
  private double actualpayprincipalpenaltyamt;
  /** ���ڼ��ⷣϢ */
  private double waiveprincipalpenaltyamt;
  /** ����������Ϣ */
  private double overdueinterestamt;
  /** �������ڷ�Ϣ */
  private double overdueprincipalpenaltyamt;
  /** ������� */
  private String loanOrderNo;
  /**  ������ */
  private String policyno;
  /** ��ݺ� */
  private String loanInfo;
  /** ���������� */
  private long loanTerm;
  /** ��ǰ���� */
  private long currTermNo;
  /** ����Ӧ����� */
  private double planBal;
  /** �����ѻ���� */
  private double paidBal;
  /** ����������� */
  private double overdueBal;


  public String getSerialno() {
    return serialno;
  }

  public void setSerialno(String serialno) {
    this.serialno = serialno;
  }

  public String getObjecttype() {
    return objecttype;
  }

  public void setObjecttype(String objecttype) {
    this.objecttype = objecttype;
  }

  public String getObjectno() {
    return objectno;
  }

  public void setObjectno(String objectno) {
    this.objectno = objectno;
  }

  public double getPeriodno() {
    return periodno;
  }

  public void setPeriodno(double periodno) {
    this.periodno = periodno;
  }

  public String getPaydate() {
    return paydate;
  }

  public void setPaydate(String paydate) {
    this.paydate = paydate;
  }

  public String getGraceintedate() {
    return graceintedate;
  }

  public void setGraceintedate(String graceintedate) {
    this.graceintedate = graceintedate;
  }

  public double getPayprincipalamt() {
    return payprincipalamt;
  }

  public void setPayprincipalamt(double payprincipalamt) {
    this.payprincipalamt = payprincipalamt;
  }

  public double getActualpayprincipalamt() {
    return actualpayprincipalamt;
  }

  public void setActualpayprincipalamt(double actualpayprincipalamt) {
    this.actualpayprincipalamt = actualpayprincipalamt;
  }

  public double getWaiveprincipalamt() {
    return waiveprincipalamt;
  }

  public void setWaiveprincipalamt(double waiveprincipalamt) {
    this.waiveprincipalamt = waiveprincipalamt;
  }

  public double getOverdueprincipalamt() {
    return overdueprincipalamt;
  }

  public void setOverdueprincipalamt(double overdueprincipalamt) {
    this.overdueprincipalamt = overdueprincipalamt;
  }

  public double getPayinterestamt() {
    return payinterestamt;
  }

  public void setPayinterestamt(double payinterestamt) {
    this.payinterestamt = payinterestamt;
  }

  public double getActualpayinterestamt() {
    return actualpayinterestamt;
  }

  public void setActualpayinterestamt(double actualpayinterestamt) {
    this.actualpayinterestamt = actualpayinterestamt;
  }

  public double getWaiveinterestamt() {
    return waiveinterestamt;
  }

  public void setWaiveinterestamt(double waiveinterestamt) {
    this.waiveinterestamt = waiveinterestamt;
  }

  public double getPayprincipalpenaltyamt() {
    return payprincipalpenaltyamt;
  }

  public void setPayprincipalpenaltyamt(double payprincipalpenaltyamt) {
    this.payprincipalpenaltyamt = payprincipalpenaltyamt;
  }

  public double getActualpayprincipalpenaltyamt() {
    return actualpayprincipalpenaltyamt;
  }

  public void setActualpayprincipalpenaltyamt(double actualpayprincipalpenaltyamt) {
    this.actualpayprincipalpenaltyamt = actualpayprincipalpenaltyamt;
  }

  public double getWaiveprincipalpenaltyamt() {
    return waiveprincipalpenaltyamt;
  }

  public void setWaiveprincipalpenaltyamt(double waiveprincipalpenaltyamt) {
    this.waiveprincipalpenaltyamt = waiveprincipalpenaltyamt;
  }

  public double getOverdueinterestamt() {
    return overdueinterestamt;
  }

  public void setOverdueinterestamt(double overdueinterestamt) {
    this.overdueinterestamt = overdueinterestamt;
  }

  public double getOverdueprincipalpenaltyamt() {
    return overdueprincipalpenaltyamt;
  }

  public void setOverdueprincipalpenaltyamt(double overdueprincipalpenaltyamt) {
    this.overdueprincipalpenaltyamt = overdueprincipalpenaltyamt;
  }

  public String getLoanOrderNo() {
    return loanOrderNo;
  }

  public void setLoanOrderNo(String loanOrderNo) {
    this.loanOrderNo = loanOrderNo;
  }

  public String getPolicyno() {
    return policyno;
  }

  public void setPolicyno(String policyno) {
    this.policyno = policyno;
  }

  public String getLoanInfo() {
    return loanInfo;
  }

  public void setLoanInfo(String loanInfo) {
    this.loanInfo = loanInfo;
  }

  public long getLoanTerm() {
    return loanTerm;
  }

  public void setLoanTerm(long loanTerm) {
    this.loanTerm = loanTerm;
  }

  public long getCurrTermNo() {
    return currTermNo;
  }

  public void setCurrTermNo(long currTermNo) {
    this.currTermNo = currTermNo;
  }

  public double getPlanBal() {
    return planBal;
  }

  public void setPlanBal(double planBal) {
    this.planBal = planBal;
  }

  public double getPaidBal() {
    return paidBal;
  }

  public void setPaidBal(double paidBal) {
    this.paidBal = paidBal;
  }

  public double getOverdueBal() {
    return overdueBal;
  }

  public void setOverdueBal(double overdueBal) {
    this.overdueBal = overdueBal;
  }

  public AcctPaymentSchedule() {
  }

  public AcctPaymentSchedule(Loan loan,String loanDate) throws SQLException {
    this.actualpayinterestamt=0;
    this.actualpayprincipalamt=0;
    this.actualpayprincipalpenaltyamt=0;
    this.currTermNo=0;
    this.graceintedate=System.;
    this.loanInfo=rs.getString("loanInfo");
    this.loanOrderNo=rs.getString("loanOrderNo");
    this.loanTerm=rs.getLong("loanTerm");
    this.objectno=rs.getString("OBJECTNO");
    this.objecttype=rs.getString("OBJECTTYPE");
    this.overdueBal=rs.getDouble("overdueBal");
    this.overdueinterestamt=rs.getDouble("OVERDUEINTERESTAMT");
    this.overdueprincipalamt=rs.getDouble("OVERDUEPRINCIPALAMT");
    this.overdueprincipalpenaltyamt=rs.getDouble("OVERDUEPRINCIPALPENALTYAMT");
    this.paidBal=rs.getDouble("paidBal");
    this.paydate=rs.getString("PAYDATE");
    this.payinterestamt=rs.getDouble("PAYINTERESTAMT");
    this.payprincipalamt=rs.getDouble("PAYPRINCIPALAMT");
    this.payprincipalpenaltyamt=rs.getDouble("PAYPRINCIPALPENALTYAMT");
    this.periodno=rs.getDouble("PERIODNO");
    this.planBal=rs.getDouble("planBal");
    this.policyno=rs.getString("policyno");
    this.serialno=rs.getString("SERIALNO");
    this.waiveinterestamt=rs.getDouble("WAIVEINTERESTAMT");
    this.waiveprincipalamt=rs.getDouble("WAIVEPRINCIPALAMT");
    this.waiveprincipalpenaltyamt=rs.getDouble("WAIVEPRINCIPALPENALTYAMT");
  }
}
