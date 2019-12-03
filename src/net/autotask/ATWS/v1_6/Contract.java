/**
 * Contract.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Contract  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object accountID;

    private java.lang.Object billingPreference;

    private java.lang.Object compliance;

    private java.lang.Object contactID;

    private java.lang.Object contactName;

    private java.lang.Object contractCategory;

    private java.lang.Object contractName;

    private java.lang.Object contractNumber;

    private java.lang.Object contractPeriodType;

    private java.lang.Object contractType;

    private java.lang.Object isDefaultContract;

    private java.lang.Object description;

    private java.lang.Object endDate;

    private java.lang.Object estimatedCost;

    private java.lang.Object estimatedHours;

    private java.lang.Object estimatedRevenue;

    private java.lang.Object overageBillingRate;

    private java.lang.Object setupFee;

    private java.lang.Object startDate;

    private java.lang.Object status;

    private java.lang.Object timeReportingRequiresStartAndStopTimes;

    private java.lang.Object serviceLevelAgreementID;

    private java.lang.Object purchaseOrderNumber;

    private java.lang.Object opportunityID;

    private java.lang.Object renewedContractID;

    private java.lang.Object setupFeeAllocationCodeID;

    private java.lang.Object exclusionContractID;

    private java.lang.Object internalCurrencyOverageBillingRate;

    private java.lang.Object internalCurrencySetupFee;

    private java.lang.Object businessDivisionSubdivisionID;

    private java.lang.Object billToAccountID;

    private java.lang.Object billToAccountContactID;

    private java.lang.Object contractExclusionSetID;

    public Contract() {
    }

    public Contract(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountID,
           java.lang.Object billingPreference,
           java.lang.Object compliance,
           java.lang.Object contactID,
           java.lang.Object contactName,
           java.lang.Object contractCategory,
           java.lang.Object contractName,
           java.lang.Object contractNumber,
           java.lang.Object contractPeriodType,
           java.lang.Object contractType,
           java.lang.Object isDefaultContract,
           java.lang.Object description,
           java.lang.Object endDate,
           java.lang.Object estimatedCost,
           java.lang.Object estimatedHours,
           java.lang.Object estimatedRevenue,
           java.lang.Object overageBillingRate,
           java.lang.Object setupFee,
           java.lang.Object startDate,
           java.lang.Object status,
           java.lang.Object timeReportingRequiresStartAndStopTimes,
           java.lang.Object serviceLevelAgreementID,
           java.lang.Object purchaseOrderNumber,
           java.lang.Object opportunityID,
           java.lang.Object renewedContractID,
           java.lang.Object setupFeeAllocationCodeID,
           java.lang.Object exclusionContractID,
           java.lang.Object internalCurrencyOverageBillingRate,
           java.lang.Object internalCurrencySetupFee,
           java.lang.Object businessDivisionSubdivisionID,
           java.lang.Object billToAccountID,
           java.lang.Object billToAccountContactID,
           java.lang.Object contractExclusionSetID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountID = accountID;
        this.billingPreference = billingPreference;
        this.compliance = compliance;
        this.contactID = contactID;
        this.contactName = contactName;
        this.contractCategory = contractCategory;
        this.contractName = contractName;
        this.contractNumber = contractNumber;
        this.contractPeriodType = contractPeriodType;
        this.contractType = contractType;
        this.isDefaultContract = isDefaultContract;
        this.description = description;
        this.endDate = endDate;
        this.estimatedCost = estimatedCost;
        this.estimatedHours = estimatedHours;
        this.estimatedRevenue = estimatedRevenue;
        this.overageBillingRate = overageBillingRate;
        this.setupFee = setupFee;
        this.startDate = startDate;
        this.status = status;
        this.timeReportingRequiresStartAndStopTimes = timeReportingRequiresStartAndStopTimes;
        this.serviceLevelAgreementID = serviceLevelAgreementID;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.opportunityID = opportunityID;
        this.renewedContractID = renewedContractID;
        this.setupFeeAllocationCodeID = setupFeeAllocationCodeID;
        this.exclusionContractID = exclusionContractID;
        this.internalCurrencyOverageBillingRate = internalCurrencyOverageBillingRate;
        this.internalCurrencySetupFee = internalCurrencySetupFee;
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
        this.billToAccountID = billToAccountID;
        this.billToAccountContactID = billToAccountContactID;
        this.contractExclusionSetID = contractExclusionSetID;
    }


    /**
     * Gets the accountID value for this Contract.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this Contract.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the billingPreference value for this Contract.
     * 
     * @return billingPreference
     */
    public java.lang.Object getBillingPreference() {
        return billingPreference;
    }


    /**
     * Sets the billingPreference value for this Contract.
     * 
     * @param billingPreference
     */
    public void setBillingPreference(java.lang.Object billingPreference) {
        this.billingPreference = billingPreference;
    }


    /**
     * Gets the compliance value for this Contract.
     * 
     * @return compliance
     */
    public java.lang.Object getCompliance() {
        return compliance;
    }


    /**
     * Sets the compliance value for this Contract.
     * 
     * @param compliance
     */
    public void setCompliance(java.lang.Object compliance) {
        this.compliance = compliance;
    }


    /**
     * Gets the contactID value for this Contract.
     * 
     * @return contactID
     */
    public java.lang.Object getContactID() {
        return contactID;
    }


    /**
     * Sets the contactID value for this Contract.
     * 
     * @param contactID
     */
    public void setContactID(java.lang.Object contactID) {
        this.contactID = contactID;
    }


    /**
     * Gets the contactName value for this Contract.
     * 
     * @return contactName
     */
    public java.lang.Object getContactName() {
        return contactName;
    }


    /**
     * Sets the contactName value for this Contract.
     * 
     * @param contactName
     */
    public void setContactName(java.lang.Object contactName) {
        this.contactName = contactName;
    }


    /**
     * Gets the contractCategory value for this Contract.
     * 
     * @return contractCategory
     */
    public java.lang.Object getContractCategory() {
        return contractCategory;
    }


    /**
     * Sets the contractCategory value for this Contract.
     * 
     * @param contractCategory
     */
    public void setContractCategory(java.lang.Object contractCategory) {
        this.contractCategory = contractCategory;
    }


    /**
     * Gets the contractName value for this Contract.
     * 
     * @return contractName
     */
    public java.lang.Object getContractName() {
        return contractName;
    }


    /**
     * Sets the contractName value for this Contract.
     * 
     * @param contractName
     */
    public void setContractName(java.lang.Object contractName) {
        this.contractName = contractName;
    }


    /**
     * Gets the contractNumber value for this Contract.
     * 
     * @return contractNumber
     */
    public java.lang.Object getContractNumber() {
        return contractNumber;
    }


    /**
     * Sets the contractNumber value for this Contract.
     * 
     * @param contractNumber
     */
    public void setContractNumber(java.lang.Object contractNumber) {
        this.contractNumber = contractNumber;
    }


    /**
     * Gets the contractPeriodType value for this Contract.
     * 
     * @return contractPeriodType
     */
    public java.lang.Object getContractPeriodType() {
        return contractPeriodType;
    }


    /**
     * Sets the contractPeriodType value for this Contract.
     * 
     * @param contractPeriodType
     */
    public void setContractPeriodType(java.lang.Object contractPeriodType) {
        this.contractPeriodType = contractPeriodType;
    }


    /**
     * Gets the contractType value for this Contract.
     * 
     * @return contractType
     */
    public java.lang.Object getContractType() {
        return contractType;
    }


    /**
     * Sets the contractType value for this Contract.
     * 
     * @param contractType
     */
    public void setContractType(java.lang.Object contractType) {
        this.contractType = contractType;
    }


    /**
     * Gets the isDefaultContract value for this Contract.
     * 
     * @return isDefaultContract
     */
    public java.lang.Object getIsDefaultContract() {
        return isDefaultContract;
    }


    /**
     * Sets the isDefaultContract value for this Contract.
     * 
     * @param isDefaultContract
     */
    public void setIsDefaultContract(java.lang.Object isDefaultContract) {
        this.isDefaultContract = isDefaultContract;
    }


    /**
     * Gets the description value for this Contract.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Contract.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the endDate value for this Contract.
     * 
     * @return endDate
     */
    public java.lang.Object getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Contract.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.Object endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the estimatedCost value for this Contract.
     * 
     * @return estimatedCost
     */
    public java.lang.Object getEstimatedCost() {
        return estimatedCost;
    }


    /**
     * Sets the estimatedCost value for this Contract.
     * 
     * @param estimatedCost
     */
    public void setEstimatedCost(java.lang.Object estimatedCost) {
        this.estimatedCost = estimatedCost;
    }


    /**
     * Gets the estimatedHours value for this Contract.
     * 
     * @return estimatedHours
     */
    public java.lang.Object getEstimatedHours() {
        return estimatedHours;
    }


    /**
     * Sets the estimatedHours value for this Contract.
     * 
     * @param estimatedHours
     */
    public void setEstimatedHours(java.lang.Object estimatedHours) {
        this.estimatedHours = estimatedHours;
    }


    /**
     * Gets the estimatedRevenue value for this Contract.
     * 
     * @return estimatedRevenue
     */
    public java.lang.Object getEstimatedRevenue() {
        return estimatedRevenue;
    }


    /**
     * Sets the estimatedRevenue value for this Contract.
     * 
     * @param estimatedRevenue
     */
    public void setEstimatedRevenue(java.lang.Object estimatedRevenue) {
        this.estimatedRevenue = estimatedRevenue;
    }


    /**
     * Gets the overageBillingRate value for this Contract.
     * 
     * @return overageBillingRate
     */
    public java.lang.Object getOverageBillingRate() {
        return overageBillingRate;
    }


    /**
     * Sets the overageBillingRate value for this Contract.
     * 
     * @param overageBillingRate
     */
    public void setOverageBillingRate(java.lang.Object overageBillingRate) {
        this.overageBillingRate = overageBillingRate;
    }


    /**
     * Gets the setupFee value for this Contract.
     * 
     * @return setupFee
     */
    public java.lang.Object getSetupFee() {
        return setupFee;
    }


    /**
     * Sets the setupFee value for this Contract.
     * 
     * @param setupFee
     */
    public void setSetupFee(java.lang.Object setupFee) {
        this.setupFee = setupFee;
    }


    /**
     * Gets the startDate value for this Contract.
     * 
     * @return startDate
     */
    public java.lang.Object getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Contract.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.Object startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this Contract.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Contract.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the timeReportingRequiresStartAndStopTimes value for this Contract.
     * 
     * @return timeReportingRequiresStartAndStopTimes
     */
    public java.lang.Object getTimeReportingRequiresStartAndStopTimes() {
        return timeReportingRequiresStartAndStopTimes;
    }


    /**
     * Sets the timeReportingRequiresStartAndStopTimes value for this Contract.
     * 
     * @param timeReportingRequiresStartAndStopTimes
     */
    public void setTimeReportingRequiresStartAndStopTimes(java.lang.Object timeReportingRequiresStartAndStopTimes) {
        this.timeReportingRequiresStartAndStopTimes = timeReportingRequiresStartAndStopTimes;
    }


    /**
     * Gets the serviceLevelAgreementID value for this Contract.
     * 
     * @return serviceLevelAgreementID
     */
    public java.lang.Object getServiceLevelAgreementID() {
        return serviceLevelAgreementID;
    }


    /**
     * Sets the serviceLevelAgreementID value for this Contract.
     * 
     * @param serviceLevelAgreementID
     */
    public void setServiceLevelAgreementID(java.lang.Object serviceLevelAgreementID) {
        this.serviceLevelAgreementID = serviceLevelAgreementID;
    }


    /**
     * Gets the purchaseOrderNumber value for this Contract.
     * 
     * @return purchaseOrderNumber
     */
    public java.lang.Object getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }


    /**
     * Sets the purchaseOrderNumber value for this Contract.
     * 
     * @param purchaseOrderNumber
     */
    public void setPurchaseOrderNumber(java.lang.Object purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }


    /**
     * Gets the opportunityID value for this Contract.
     * 
     * @return opportunityID
     */
    public java.lang.Object getOpportunityID() {
        return opportunityID;
    }


    /**
     * Sets the opportunityID value for this Contract.
     * 
     * @param opportunityID
     */
    public void setOpportunityID(java.lang.Object opportunityID) {
        this.opportunityID = opportunityID;
    }


    /**
     * Gets the renewedContractID value for this Contract.
     * 
     * @return renewedContractID
     */
    public java.lang.Object getRenewedContractID() {
        return renewedContractID;
    }


    /**
     * Sets the renewedContractID value for this Contract.
     * 
     * @param renewedContractID
     */
    public void setRenewedContractID(java.lang.Object renewedContractID) {
        this.renewedContractID = renewedContractID;
    }


    /**
     * Gets the setupFeeAllocationCodeID value for this Contract.
     * 
     * @return setupFeeAllocationCodeID
     */
    public java.lang.Object getSetupFeeAllocationCodeID() {
        return setupFeeAllocationCodeID;
    }


    /**
     * Sets the setupFeeAllocationCodeID value for this Contract.
     * 
     * @param setupFeeAllocationCodeID
     */
    public void setSetupFeeAllocationCodeID(java.lang.Object setupFeeAllocationCodeID) {
        this.setupFeeAllocationCodeID = setupFeeAllocationCodeID;
    }


    /**
     * Gets the exclusionContractID value for this Contract.
     * 
     * @return exclusionContractID
     */
    public java.lang.Object getExclusionContractID() {
        return exclusionContractID;
    }


    /**
     * Sets the exclusionContractID value for this Contract.
     * 
     * @param exclusionContractID
     */
    public void setExclusionContractID(java.lang.Object exclusionContractID) {
        this.exclusionContractID = exclusionContractID;
    }


    /**
     * Gets the internalCurrencyOverageBillingRate value for this Contract.
     * 
     * @return internalCurrencyOverageBillingRate
     */
    public java.lang.Object getInternalCurrencyOverageBillingRate() {
        return internalCurrencyOverageBillingRate;
    }


    /**
     * Sets the internalCurrencyOverageBillingRate value for this Contract.
     * 
     * @param internalCurrencyOverageBillingRate
     */
    public void setInternalCurrencyOverageBillingRate(java.lang.Object internalCurrencyOverageBillingRate) {
        this.internalCurrencyOverageBillingRate = internalCurrencyOverageBillingRate;
    }


    /**
     * Gets the internalCurrencySetupFee value for this Contract.
     * 
     * @return internalCurrencySetupFee
     */
    public java.lang.Object getInternalCurrencySetupFee() {
        return internalCurrencySetupFee;
    }


    /**
     * Sets the internalCurrencySetupFee value for this Contract.
     * 
     * @param internalCurrencySetupFee
     */
    public void setInternalCurrencySetupFee(java.lang.Object internalCurrencySetupFee) {
        this.internalCurrencySetupFee = internalCurrencySetupFee;
    }


    /**
     * Gets the businessDivisionSubdivisionID value for this Contract.
     * 
     * @return businessDivisionSubdivisionID
     */
    public java.lang.Object getBusinessDivisionSubdivisionID() {
        return businessDivisionSubdivisionID;
    }


    /**
     * Sets the businessDivisionSubdivisionID value for this Contract.
     * 
     * @param businessDivisionSubdivisionID
     */
    public void setBusinessDivisionSubdivisionID(java.lang.Object businessDivisionSubdivisionID) {
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }


    /**
     * Gets the billToAccountID value for this Contract.
     * 
     * @return billToAccountID
     */
    public java.lang.Object getBillToAccountID() {
        return billToAccountID;
    }


    /**
     * Sets the billToAccountID value for this Contract.
     * 
     * @param billToAccountID
     */
    public void setBillToAccountID(java.lang.Object billToAccountID) {
        this.billToAccountID = billToAccountID;
    }


    /**
     * Gets the billToAccountContactID value for this Contract.
     * 
     * @return billToAccountContactID
     */
    public java.lang.Object getBillToAccountContactID() {
        return billToAccountContactID;
    }


    /**
     * Sets the billToAccountContactID value for this Contract.
     * 
     * @param billToAccountContactID
     */
    public void setBillToAccountContactID(java.lang.Object billToAccountContactID) {
        this.billToAccountContactID = billToAccountContactID;
    }


    /**
     * Gets the contractExclusionSetID value for this Contract.
     * 
     * @return contractExclusionSetID
     */
    public java.lang.Object getContractExclusionSetID() {
        return contractExclusionSetID;
    }


    /**
     * Sets the contractExclusionSetID value for this Contract.
     * 
     * @param contractExclusionSetID
     */
    public void setContractExclusionSetID(java.lang.Object contractExclusionSetID) {
        this.contractExclusionSetID = contractExclusionSetID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contract)) return false;
        Contract other = (Contract) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.billingPreference==null && other.getBillingPreference()==null) || 
             (this.billingPreference!=null &&
              this.billingPreference.equals(other.getBillingPreference()))) &&
            ((this.compliance==null && other.getCompliance()==null) || 
             (this.compliance!=null &&
              this.compliance.equals(other.getCompliance()))) &&
            ((this.contactID==null && other.getContactID()==null) || 
             (this.contactID!=null &&
              this.contactID.equals(other.getContactID()))) &&
            ((this.contactName==null && other.getContactName()==null) || 
             (this.contactName!=null &&
              this.contactName.equals(other.getContactName()))) &&
            ((this.contractCategory==null && other.getContractCategory()==null) || 
             (this.contractCategory!=null &&
              this.contractCategory.equals(other.getContractCategory()))) &&
            ((this.contractName==null && other.getContractName()==null) || 
             (this.contractName!=null &&
              this.contractName.equals(other.getContractName()))) &&
            ((this.contractNumber==null && other.getContractNumber()==null) || 
             (this.contractNumber!=null &&
              this.contractNumber.equals(other.getContractNumber()))) &&
            ((this.contractPeriodType==null && other.getContractPeriodType()==null) || 
             (this.contractPeriodType!=null &&
              this.contractPeriodType.equals(other.getContractPeriodType()))) &&
            ((this.contractType==null && other.getContractType()==null) || 
             (this.contractType!=null &&
              this.contractType.equals(other.getContractType()))) &&
            ((this.isDefaultContract==null && other.getIsDefaultContract()==null) || 
             (this.isDefaultContract!=null &&
              this.isDefaultContract.equals(other.getIsDefaultContract()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.estimatedCost==null && other.getEstimatedCost()==null) || 
             (this.estimatedCost!=null &&
              this.estimatedCost.equals(other.getEstimatedCost()))) &&
            ((this.estimatedHours==null && other.getEstimatedHours()==null) || 
             (this.estimatedHours!=null &&
              this.estimatedHours.equals(other.getEstimatedHours()))) &&
            ((this.estimatedRevenue==null && other.getEstimatedRevenue()==null) || 
             (this.estimatedRevenue!=null &&
              this.estimatedRevenue.equals(other.getEstimatedRevenue()))) &&
            ((this.overageBillingRate==null && other.getOverageBillingRate()==null) || 
             (this.overageBillingRate!=null &&
              this.overageBillingRate.equals(other.getOverageBillingRate()))) &&
            ((this.setupFee==null && other.getSetupFee()==null) || 
             (this.setupFee!=null &&
              this.setupFee.equals(other.getSetupFee()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.timeReportingRequiresStartAndStopTimes==null && other.getTimeReportingRequiresStartAndStopTimes()==null) || 
             (this.timeReportingRequiresStartAndStopTimes!=null &&
              this.timeReportingRequiresStartAndStopTimes.equals(other.getTimeReportingRequiresStartAndStopTimes()))) &&
            ((this.serviceLevelAgreementID==null && other.getServiceLevelAgreementID()==null) || 
             (this.serviceLevelAgreementID!=null &&
              this.serviceLevelAgreementID.equals(other.getServiceLevelAgreementID()))) &&
            ((this.purchaseOrderNumber==null && other.getPurchaseOrderNumber()==null) || 
             (this.purchaseOrderNumber!=null &&
              this.purchaseOrderNumber.equals(other.getPurchaseOrderNumber()))) &&
            ((this.opportunityID==null && other.getOpportunityID()==null) || 
             (this.opportunityID!=null &&
              this.opportunityID.equals(other.getOpportunityID()))) &&
            ((this.renewedContractID==null && other.getRenewedContractID()==null) || 
             (this.renewedContractID!=null &&
              this.renewedContractID.equals(other.getRenewedContractID()))) &&
            ((this.setupFeeAllocationCodeID==null && other.getSetupFeeAllocationCodeID()==null) || 
             (this.setupFeeAllocationCodeID!=null &&
              this.setupFeeAllocationCodeID.equals(other.getSetupFeeAllocationCodeID()))) &&
            ((this.exclusionContractID==null && other.getExclusionContractID()==null) || 
             (this.exclusionContractID!=null &&
              this.exclusionContractID.equals(other.getExclusionContractID()))) &&
            ((this.internalCurrencyOverageBillingRate==null && other.getInternalCurrencyOverageBillingRate()==null) || 
             (this.internalCurrencyOverageBillingRate!=null &&
              this.internalCurrencyOverageBillingRate.equals(other.getInternalCurrencyOverageBillingRate()))) &&
            ((this.internalCurrencySetupFee==null && other.getInternalCurrencySetupFee()==null) || 
             (this.internalCurrencySetupFee!=null &&
              this.internalCurrencySetupFee.equals(other.getInternalCurrencySetupFee()))) &&
            ((this.businessDivisionSubdivisionID==null && other.getBusinessDivisionSubdivisionID()==null) || 
             (this.businessDivisionSubdivisionID!=null &&
              this.businessDivisionSubdivisionID.equals(other.getBusinessDivisionSubdivisionID()))) &&
            ((this.billToAccountID==null && other.getBillToAccountID()==null) || 
             (this.billToAccountID!=null &&
              this.billToAccountID.equals(other.getBillToAccountID()))) &&
            ((this.billToAccountContactID==null && other.getBillToAccountContactID()==null) || 
             (this.billToAccountContactID!=null &&
              this.billToAccountContactID.equals(other.getBillToAccountContactID()))) &&
            ((this.contractExclusionSetID==null && other.getContractExclusionSetID()==null) || 
             (this.contractExclusionSetID!=null &&
              this.contractExclusionSetID.equals(other.getContractExclusionSetID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getBillingPreference() != null) {
            _hashCode += getBillingPreference().hashCode();
        }
        if (getCompliance() != null) {
            _hashCode += getCompliance().hashCode();
        }
        if (getContactID() != null) {
            _hashCode += getContactID().hashCode();
        }
        if (getContactName() != null) {
            _hashCode += getContactName().hashCode();
        }
        if (getContractCategory() != null) {
            _hashCode += getContractCategory().hashCode();
        }
        if (getContractName() != null) {
            _hashCode += getContractName().hashCode();
        }
        if (getContractNumber() != null) {
            _hashCode += getContractNumber().hashCode();
        }
        if (getContractPeriodType() != null) {
            _hashCode += getContractPeriodType().hashCode();
        }
        if (getContractType() != null) {
            _hashCode += getContractType().hashCode();
        }
        if (getIsDefaultContract() != null) {
            _hashCode += getIsDefaultContract().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEstimatedCost() != null) {
            _hashCode += getEstimatedCost().hashCode();
        }
        if (getEstimatedHours() != null) {
            _hashCode += getEstimatedHours().hashCode();
        }
        if (getEstimatedRevenue() != null) {
            _hashCode += getEstimatedRevenue().hashCode();
        }
        if (getOverageBillingRate() != null) {
            _hashCode += getOverageBillingRate().hashCode();
        }
        if (getSetupFee() != null) {
            _hashCode += getSetupFee().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTimeReportingRequiresStartAndStopTimes() != null) {
            _hashCode += getTimeReportingRequiresStartAndStopTimes().hashCode();
        }
        if (getServiceLevelAgreementID() != null) {
            _hashCode += getServiceLevelAgreementID().hashCode();
        }
        if (getPurchaseOrderNumber() != null) {
            _hashCode += getPurchaseOrderNumber().hashCode();
        }
        if (getOpportunityID() != null) {
            _hashCode += getOpportunityID().hashCode();
        }
        if (getRenewedContractID() != null) {
            _hashCode += getRenewedContractID().hashCode();
        }
        if (getSetupFeeAllocationCodeID() != null) {
            _hashCode += getSetupFeeAllocationCodeID().hashCode();
        }
        if (getExclusionContractID() != null) {
            _hashCode += getExclusionContractID().hashCode();
        }
        if (getInternalCurrencyOverageBillingRate() != null) {
            _hashCode += getInternalCurrencyOverageBillingRate().hashCode();
        }
        if (getInternalCurrencySetupFee() != null) {
            _hashCode += getInternalCurrencySetupFee().hashCode();
        }
        if (getBusinessDivisionSubdivisionID() != null) {
            _hashCode += getBusinessDivisionSubdivisionID().hashCode();
        }
        if (getBillToAccountID() != null) {
            _hashCode += getBillToAccountID().hashCode();
        }
        if (getBillToAccountContactID() != null) {
            _hashCode += getBillToAccountContactID().hashCode();
        }
        if (getContractExclusionSetID() != null) {
            _hashCode += getContractExclusionSetID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contract.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Contract"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillingPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compliance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Compliance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContactID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractPeriodType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractPeriodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultContract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsDefaultContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EstimatedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EstimatedHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EstimatedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overageBillingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OverageBillingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SetupFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeReportingRequiresStartAndStopTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TimeReportingRequiresStartAndStopTimes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLevelAgreementID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceLevelAgreementID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PurchaseOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OpportunityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewedContractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RenewedContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupFeeAllocationCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SetupFeeAllocationCodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclusionContractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExclusionContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyOverageBillingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyOverageBillingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencySetupFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencySetupFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessDivisionSubdivisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BusinessDivisionSubdivisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToAccountContactID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToAccountContactID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractExclusionSetID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractExclusionSetID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
