/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thosttraderapi;

public class CThostFtdcExchangeMarginRateAdjustField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeMarginRateAdjustField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeMarginRateAdjustField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcExchangeMarginRateAdjustField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setExchLongMarginRatioByMoney(double value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getExchLongMarginRatioByMoney() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setExchLongMarginRatioByVolume(double value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getExchLongMarginRatioByVolume() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setExchShortMarginRatioByMoney(double value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getExchShortMarginRatioByMoney() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setExchShortMarginRatioByVolume(double value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getExchShortMarginRatioByVolume() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setNoLongMarginRatioByMoney(double value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getNoLongMarginRatioByMoney() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setNoLongMarginRatioByVolume(double value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getNoLongMarginRatioByVolume() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setNoShortMarginRatioByMoney(double value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getNoShortMarginRatioByMoney() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setNoShortMarginRatioByVolume(double value) {
    thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getNoShortMarginRatioByVolume() {
    return thosttradeapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public CThostFtdcExchangeMarginRateAdjustField() {
    this(thosttradeapiJNI.new_CThostFtdcExchangeMarginRateAdjustField(), true);
  }

}
