/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmduserapiJNI.CThostFtdcOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return thostmduserapiJNI.CThostFtdcOrderField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcOrderField_UserID_get(swigCPtr, this);
  }

  public void setOrderPriceType(char value) {
    thostmduserapiJNI.CThostFtdcOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return thostmduserapiJNI.CThostFtdcOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thostmduserapiJNI.CThostFtdcOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thostmduserapiJNI.CThostFtdcOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return thostmduserapiJNI.CThostFtdcOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return thostmduserapiJNI.CThostFtdcOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    thostmduserapiJNI.CThostFtdcOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return thostmduserapiJNI.CThostFtdcOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return thostmduserapiJNI.CThostFtdcOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    thostmduserapiJNI.CThostFtdcOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return thostmduserapiJNI.CThostFtdcOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return thostmduserapiJNI.CThostFtdcOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    thostmduserapiJNI.CThostFtdcOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return thostmduserapiJNI.CThostFtdcOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return thostmduserapiJNI.CThostFtdcOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    thostmduserapiJNI.CThostFtdcOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return thostmduserapiJNI.CThostFtdcOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    thostmduserapiJNI.CThostFtdcOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return thostmduserapiJNI.CThostFtdcOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    thostmduserapiJNI.CThostFtdcOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return thostmduserapiJNI.CThostFtdcOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return thostmduserapiJNI.CThostFtdcOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thostmduserapiJNI.CThostFtdcOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmduserapiJNI.CThostFtdcOrderField_RequestID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return thostmduserapiJNI.CThostFtdcOrderField_OrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmduserapiJNI.CThostFtdcOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thostmduserapiJNI.CThostFtdcOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmduserapiJNI.CThostFtdcOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thostmduserapiJNI.CThostFtdcOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thostmduserapiJNI.CThostFtdcOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmduserapiJNI.CThostFtdcOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    thostmduserapiJNI.CThostFtdcOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return thostmduserapiJNI.CThostFtdcOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return thostmduserapiJNI.CThostFtdcOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmduserapiJNI.CThostFtdcOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thostmduserapiJNI.CThostFtdcOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return thostmduserapiJNI.CThostFtdcOrderField_OrderSysID_get(swigCPtr, this);
  }

  public void setOrderSource(char value) {
    thostmduserapiJNI.CThostFtdcOrderField_OrderSource_set(swigCPtr, this, value);
  }

  public char getOrderSource() {
    return thostmduserapiJNI.CThostFtdcOrderField_OrderSource_get(swigCPtr, this);
  }

  public void setOrderStatus(char value) {
    thostmduserapiJNI.CThostFtdcOrderField_OrderStatus_set(swigCPtr, this, value);
  }

  public char getOrderStatus() {
    return thostmduserapiJNI.CThostFtdcOrderField_OrderStatus_get(swigCPtr, this);
  }

  public void setOrderType(char value) {
    thostmduserapiJNI.CThostFtdcOrderField_OrderType_set(swigCPtr, this, value);
  }

  public char getOrderType() {
    return thostmduserapiJNI.CThostFtdcOrderField_OrderType_get(swigCPtr, this);
  }

  public void setVolumeTraded(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_VolumeTraded_set(swigCPtr, this, value);
  }

  public int getVolumeTraded() {
    return thostmduserapiJNI.CThostFtdcOrderField_VolumeTraded_get(swigCPtr, this);
  }

  public void setVolumeTotal(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_VolumeTotal_set(swigCPtr, this, value);
  }

  public int getVolumeTotal() {
    return thostmduserapiJNI.CThostFtdcOrderField_VolumeTotal_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return thostmduserapiJNI.CThostFtdcOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return thostmduserapiJNI.CThostFtdcOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setActiveTime(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_ActiveTime_set(swigCPtr, this, value);
  }

  public String getActiveTime() {
    return thostmduserapiJNI.CThostFtdcOrderField_ActiveTime_get(swigCPtr, this);
  }

  public void setSuspendTime(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_SuspendTime_set(swigCPtr, this, value);
  }

  public String getSuspendTime() {
    return thostmduserapiJNI.CThostFtdcOrderField_SuspendTime_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return thostmduserapiJNI.CThostFtdcOrderField_UpdateTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return thostmduserapiJNI.CThostFtdcOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setActiveTraderID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_ActiveTraderID_set(swigCPtr, this, value);
  }

  public String getActiveTraderID() {
    return thostmduserapiJNI.CThostFtdcOrderField_ActiveTraderID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return thostmduserapiJNI.CThostFtdcOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thostmduserapiJNI.CThostFtdcOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thostmduserapiJNI.CThostFtdcOrderField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmduserapiJNI.CThostFtdcOrderField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return thostmduserapiJNI.CThostFtdcOrderField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return thostmduserapiJNI.CThostFtdcOrderField_StatusMsg_get(swigCPtr, this);
  }

  public void setUserForceClose(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_UserForceClose_set(swigCPtr, this, value);
  }

  public int getUserForceClose() {
    return thostmduserapiJNI.CThostFtdcOrderField_UserForceClose_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return thostmduserapiJNI.CThostFtdcOrderField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerOrderSeq(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_BrokerOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerOrderSeq() {
    return thostmduserapiJNI.CThostFtdcOrderField_BrokerOrderSeq_get(swigCPtr, this);
  }

  public void setRelativeOrderSysID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_RelativeOrderSysID_set(swigCPtr, this, value);
  }

  public String getRelativeOrderSysID() {
    return thostmduserapiJNI.CThostFtdcOrderField_RelativeOrderSysID_get(swigCPtr, this);
  }

  public void setZCETotalTradedVolume(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_ZCETotalTradedVolume_set(swigCPtr, this, value);
  }

  public int getZCETotalTradedVolume() {
    return thostmduserapiJNI.CThostFtdcOrderField_ZCETotalTradedVolume_get(swigCPtr, this);
  }

  public void setIsSwapOrder(int value) {
    thostmduserapiJNI.CThostFtdcOrderField_IsSwapOrder_set(swigCPtr, this, value);
  }

  public int getIsSwapOrder() {
    return thostmduserapiJNI.CThostFtdcOrderField_IsSwapOrder_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return thostmduserapiJNI.CThostFtdcOrderField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmduserapiJNI.CThostFtdcOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmduserapiJNI.CThostFtdcOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmduserapiJNI.CThostFtdcOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmduserapiJNI.CThostFtdcOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmduserapiJNI.CThostFtdcOrderField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcOrderField() {
    this(thostmduserapiJNI.new_CThostFtdcOrderField(), true);
  }

}