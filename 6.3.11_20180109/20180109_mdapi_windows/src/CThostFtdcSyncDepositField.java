/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcSyncDepositField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSyncDepositField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDepositField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcSyncDepositField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDepositSeqNo(String value) {
    thostmduserapiJNI.CThostFtdcSyncDepositField_DepositSeqNo_set(swigCPtr, this, value);
  }

  public String getDepositSeqNo() {
    return thostmduserapiJNI.CThostFtdcSyncDepositField_DepositSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcSyncDepositField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcSyncDepositField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcSyncDepositField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcSyncDepositField_InvestorID_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    thostmduserapiJNI.CThostFtdcSyncDepositField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return thostmduserapiJNI.CThostFtdcSyncDepositField_Deposit_get(swigCPtr, this);
  }

  public void setIsForce(int value) {
    thostmduserapiJNI.CThostFtdcSyncDepositField_IsForce_set(swigCPtr, this, value);
  }

  public int getIsForce() {
    return thostmduserapiJNI.CThostFtdcSyncDepositField_IsForce_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcSyncDepositField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcSyncDepositField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcSyncDepositField() {
    this(thostmduserapiJNI.new_CThostFtdcSyncDepositField(), true);
  }

}
