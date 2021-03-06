/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcFutureSignIOField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcFutureSignIOField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcFutureSignIOField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcFutureSignIOField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_UserID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_Digest_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_CurrencyID_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thostmduserapiJNI.CThostFtdcFutureSignIOField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thostmduserapiJNI.CThostFtdcFutureSignIOField_TID_get(swigCPtr, this);
  }

  public CThostFtdcFutureSignIOField() {
    this(thostmduserapiJNI.new_CThostFtdcFutureSignIOField(), true);
  }

}
