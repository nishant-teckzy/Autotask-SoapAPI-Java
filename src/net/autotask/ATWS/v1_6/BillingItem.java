/**
 * BillingItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class BillingItem  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object accountManagerWhenApprovedID;

    private java.lang.Object type;

    private java.lang.Object subType;

    private java.lang.Object itemName;

    private java.lang.Object description;

    private java.lang.Object quantity;

    private java.lang.Object rate;

    private java.lang.Object totalAmount;

    private java.lang.Object ourCost;

    private java.lang.Object itemDate;

    private java.lang.Object invoiceID;

    private java.lang.Object itemApproverID;

    private java.lang.Object accountID;

    private java.lang.Object ticketID;

    private java.lang.Object taskID;

    private java.lang.Object projectID;

    private java.lang.Object allocationCodeID;

    private java.lang.Object roleID;

    private java.lang.Object timeEntryID;

    private java.lang.Object contractID;

    private java.lang.Object webServiceDate;

    private java.lang.Object nonBillable;

    private java.lang.Object taxDollars;

    private java.lang.Object purchaseOrderNumber;

    private java.lang.Object extendedPrice;

    private java.lang.Object expenseItemID;

    private java.lang.Object contractCostID;

    private java.lang.Object projectCostID;

    private java.lang.Object ticketCostID;

    private java.lang.Object lineItemID;

    private java.lang.Object milestoneID;

    private java.lang.Object serviceID;

    private java.lang.Object serviceBundleID;

    private java.lang.Object vendorID;

    private java.lang.Object lineItemFullDescription;

    private java.lang.Object lineItemGroupDescription;

    private java.lang.Object installedProductID;

    private java.lang.Object internalCurrencyExtendedPrice;

    private java.lang.Object internalCurrencyRate;

    private java.lang.Object internalCurrencyTaxDollars;

    private java.lang.Object internalCurrencyTotalAmount;

    private java.lang.Object businessDivisionSubdivisionID;

    private java.lang.Object postedOnTime;

    private java.lang.Object postedDate;

    public BillingItem() {
    }

    public BillingItem(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountManagerWhenApprovedID,
           java.lang.Object type,
           java.lang.Object subType,
           java.lang.Object itemName,
           java.lang.Object description,
           java.lang.Object quantity,
           java.lang.Object rate,
           java.lang.Object totalAmount,
           java.lang.Object ourCost,
           java.lang.Object itemDate,
           java.lang.Object invoiceID,
           java.lang.Object itemApproverID,
           java.lang.Object accountID,
           java.lang.Object ticketID,
           java.lang.Object taskID,
           java.lang.Object projectID,
           java.lang.Object allocationCodeID,
           java.lang.Object roleID,
           java.lang.Object timeEntryID,
           java.lang.Object contractID,
           java.lang.Object webServiceDate,
           java.lang.Object nonBillable,
           java.lang.Object taxDollars,
           java.lang.Object purchaseOrderNumber,
           java.lang.Object extendedPrice,
           java.lang.Object expenseItemID,
           java.lang.Object contractCostID,
           java.lang.Object projectCostID,
           java.lang.Object ticketCostID,
           java.lang.Object lineItemID,
           java.lang.Object milestoneID,
           java.lang.Object serviceID,
           java.lang.Object serviceBundleID,
           java.lang.Object vendorID,
           java.lang.Object lineItemFullDescription,
           java.lang.Object lineItemGroupDescription,
           java.lang.Object installedProductID,
           java.lang.Object internalCurrencyExtendedPrice,
           java.lang.Object internalCurrencyRate,
           java.lang.Object internalCurrencyTaxDollars,
           java.lang.Object internalCurrencyTotalAmount,
           java.lang.Object businessDivisionSubdivisionID,
           java.lang.Object postedOnTime,
           java.lang.Object postedDate) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountManagerWhenApprovedID = accountManagerWhenApprovedID;
        this.type = type;
        this.subType = subType;
        this.itemName = itemName;
        this.description = description;
        this.quantity = quantity;
        this.rate = rate;
        this.totalAmount = totalAmount;
        this.ourCost = ourCost;
        this.itemDate = itemDate;
        this.invoiceID = invoiceID;
        this.itemApproverID = itemApproverID;
        this.accountID = accountID;
        this.ticketID = ticketID;
        this.taskID = taskID;
        this.projectID = projectID;
        this.allocationCodeID = allocationCodeID;
        this.roleID = roleID;
        this.timeEntryID = timeEntryID;
        this.contractID = contractID;
        this.webServiceDate = webServiceDate;
        this.nonBillable = nonBillable;
        this.taxDollars = taxDollars;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.extendedPrice = extendedPrice;
        this.expenseItemID = expenseItemID;
        this.contractCostID = contractCostID;
        this.projectCostID = projectCostID;
        this.ticketCostID = ticketCostID;
        this.lineItemID = lineItemID;
        this.milestoneID = milestoneID;
        this.serviceID = serviceID;
        this.serviceBundleID = serviceBundleID;
        this.vendorID = vendorID;
        this.lineItemFullDescription = lineItemFullDescription;
        this.lineItemGroupDescription = lineItemGroupDescription;
        this.installedProductID = installedProductID;
        this.internalCurrencyExtendedPrice = internalCurrencyExtendedPrice;
        this.internalCurrencyRate = internalCurrencyRate;
        this.internalCurrencyTaxDollars = internalCurrencyTaxDollars;
        this.internalCurrencyTotalAmount = internalCurrencyTotalAmount;
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
        this.postedOnTime = postedOnTime;
        this.postedDate = postedDate;
    }


    /**
     * Gets the accountManagerWhenApprovedID value for this BillingItem.
     * 
     * @return accountManagerWhenApprovedID
     */
    public java.lang.Object getAccountManagerWhenApprovedID() {
        return accountManagerWhenApprovedID;
    }


    /**
     * Sets the accountManagerWhenApprovedID value for this BillingItem.
     * 
     * @param accountManagerWhenApprovedID
     */
    public void setAccountManagerWhenApprovedID(java.lang.Object accountManagerWhenApprovedID) {
        this.accountManagerWhenApprovedID = accountManagerWhenApprovedID;
    }


    /**
     * Gets the type value for this BillingItem.
     * 
     * @return type
     */
    public java.lang.Object getType() {
        return type;
    }


    /**
     * Sets the type value for this BillingItem.
     * 
     * @param type
     */
    public void setType(java.lang.Object type) {
        this.type = type;
    }


    /**
     * Gets the subType value for this BillingItem.
     * 
     * @return subType
     */
    public java.lang.Object getSubType() {
        return subType;
    }


    /**
     * Sets the subType value for this BillingItem.
     * 
     * @param subType
     */
    public void setSubType(java.lang.Object subType) {
        this.subType = subType;
    }


    /**
     * Gets the itemName value for this BillingItem.
     * 
     * @return itemName
     */
    public java.lang.Object getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this BillingItem.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.Object itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the description value for this BillingItem.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BillingItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the quantity value for this BillingItem.
     * 
     * @return quantity
     */
    public java.lang.Object getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this BillingItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Object quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the rate value for this BillingItem.
     * 
     * @return rate
     */
    public java.lang.Object getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this BillingItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.Object rate) {
        this.rate = rate;
    }


    /**
     * Gets the totalAmount value for this BillingItem.
     * 
     * @return totalAmount
     */
    public java.lang.Object getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this BillingItem.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.lang.Object totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the ourCost value for this BillingItem.
     * 
     * @return ourCost
     */
    public java.lang.Object getOurCost() {
        return ourCost;
    }


    /**
     * Sets the ourCost value for this BillingItem.
     * 
     * @param ourCost
     */
    public void setOurCost(java.lang.Object ourCost) {
        this.ourCost = ourCost;
    }


    /**
     * Gets the itemDate value for this BillingItem.
     * 
     * @return itemDate
     */
    public java.lang.Object getItemDate() {
        return itemDate;
    }


    /**
     * Sets the itemDate value for this BillingItem.
     * 
     * @param itemDate
     */
    public void setItemDate(java.lang.Object itemDate) {
        this.itemDate = itemDate;
    }


    /**
     * Gets the invoiceID value for this BillingItem.
     * 
     * @return invoiceID
     */
    public java.lang.Object getInvoiceID() {
        return invoiceID;
    }


    /**
     * Sets the invoiceID value for this BillingItem.
     * 
     * @param invoiceID
     */
    public void setInvoiceID(java.lang.Object invoiceID) {
        this.invoiceID = invoiceID;
    }


    /**
     * Gets the itemApproverID value for this BillingItem.
     * 
     * @return itemApproverID
     */
    public java.lang.Object getItemApproverID() {
        return itemApproverID;
    }


    /**
     * Sets the itemApproverID value for this BillingItem.
     * 
     * @param itemApproverID
     */
    public void setItemApproverID(java.lang.Object itemApproverID) {
        this.itemApproverID = itemApproverID;
    }


    /**
     * Gets the accountID value for this BillingItem.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this BillingItem.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the ticketID value for this BillingItem.
     * 
     * @return ticketID
     */
    public java.lang.Object getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this BillingItem.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Object ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the taskID value for this BillingItem.
     * 
     * @return taskID
     */
    public java.lang.Object getTaskID() {
        return taskID;
    }


    /**
     * Sets the taskID value for this BillingItem.
     * 
     * @param taskID
     */
    public void setTaskID(java.lang.Object taskID) {
        this.taskID = taskID;
    }


    /**
     * Gets the projectID value for this BillingItem.
     * 
     * @return projectID
     */
    public java.lang.Object getProjectID() {
        return projectID;
    }


    /**
     * Sets the projectID value for this BillingItem.
     * 
     * @param projectID
     */
    public void setProjectID(java.lang.Object projectID) {
        this.projectID = projectID;
    }


    /**
     * Gets the allocationCodeID value for this BillingItem.
     * 
     * @return allocationCodeID
     */
    public java.lang.Object getAllocationCodeID() {
        return allocationCodeID;
    }


    /**
     * Sets the allocationCodeID value for this BillingItem.
     * 
     * @param allocationCodeID
     */
    public void setAllocationCodeID(java.lang.Object allocationCodeID) {
        this.allocationCodeID = allocationCodeID;
    }


    /**
     * Gets the roleID value for this BillingItem.
     * 
     * @return roleID
     */
    public java.lang.Object getRoleID() {
        return roleID;
    }


    /**
     * Sets the roleID value for this BillingItem.
     * 
     * @param roleID
     */
    public void setRoleID(java.lang.Object roleID) {
        this.roleID = roleID;
    }


    /**
     * Gets the timeEntryID value for this BillingItem.
     * 
     * @return timeEntryID
     */
    public java.lang.Object getTimeEntryID() {
        return timeEntryID;
    }


    /**
     * Sets the timeEntryID value for this BillingItem.
     * 
     * @param timeEntryID
     */
    public void setTimeEntryID(java.lang.Object timeEntryID) {
        this.timeEntryID = timeEntryID;
    }


    /**
     * Gets the contractID value for this BillingItem.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this BillingItem.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the webServiceDate value for this BillingItem.
     * 
     * @return webServiceDate
     */
    public java.lang.Object getWebServiceDate() {
        return webServiceDate;
    }


    /**
     * Sets the webServiceDate value for this BillingItem.
     * 
     * @param webServiceDate
     */
    public void setWebServiceDate(java.lang.Object webServiceDate) {
        this.webServiceDate = webServiceDate;
    }


    /**
     * Gets the nonBillable value for this BillingItem.
     * 
     * @return nonBillable
     */
    public java.lang.Object getNonBillable() {
        return nonBillable;
    }


    /**
     * Sets the nonBillable value for this BillingItem.
     * 
     * @param nonBillable
     */
    public void setNonBillable(java.lang.Object nonBillable) {
        this.nonBillable = nonBillable;
    }


    /**
     * Gets the taxDollars value for this BillingItem.
     * 
     * @return taxDollars
     */
    public java.lang.Object getTaxDollars() {
        return taxDollars;
    }


    /**
     * Sets the taxDollars value for this BillingItem.
     * 
     * @param taxDollars
     */
    public void setTaxDollars(java.lang.Object taxDollars) {
        this.taxDollars = taxDollars;
    }


    /**
     * Gets the purchaseOrderNumber value for this BillingItem.
     * 
     * @return purchaseOrderNumber
     */
    public java.lang.Object getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }


    /**
     * Sets the purchaseOrderNumber value for this BillingItem.
     * 
     * @param purchaseOrderNumber
     */
    public void setPurchaseOrderNumber(java.lang.Object purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }


    /**
     * Gets the extendedPrice value for this BillingItem.
     * 
     * @return extendedPrice
     */
    public java.lang.Object getExtendedPrice() {
        return extendedPrice;
    }


    /**
     * Sets the extendedPrice value for this BillingItem.
     * 
     * @param extendedPrice
     */
    public void setExtendedPrice(java.lang.Object extendedPrice) {
        this.extendedPrice = extendedPrice;
    }


    /**
     * Gets the expenseItemID value for this BillingItem.
     * 
     * @return expenseItemID
     */
    public java.lang.Object getExpenseItemID() {
        return expenseItemID;
    }


    /**
     * Sets the expenseItemID value for this BillingItem.
     * 
     * @param expenseItemID
     */
    public void setExpenseItemID(java.lang.Object expenseItemID) {
        this.expenseItemID = expenseItemID;
    }


    /**
     * Gets the contractCostID value for this BillingItem.
     * 
     * @return contractCostID
     */
    public java.lang.Object getContractCostID() {
        return contractCostID;
    }


    /**
     * Sets the contractCostID value for this BillingItem.
     * 
     * @param contractCostID
     */
    public void setContractCostID(java.lang.Object contractCostID) {
        this.contractCostID = contractCostID;
    }


    /**
     * Gets the projectCostID value for this BillingItem.
     * 
     * @return projectCostID
     */
    public java.lang.Object getProjectCostID() {
        return projectCostID;
    }


    /**
     * Sets the projectCostID value for this BillingItem.
     * 
     * @param projectCostID
     */
    public void setProjectCostID(java.lang.Object projectCostID) {
        this.projectCostID = projectCostID;
    }


    /**
     * Gets the ticketCostID value for this BillingItem.
     * 
     * @return ticketCostID
     */
    public java.lang.Object getTicketCostID() {
        return ticketCostID;
    }


    /**
     * Sets the ticketCostID value for this BillingItem.
     * 
     * @param ticketCostID
     */
    public void setTicketCostID(java.lang.Object ticketCostID) {
        this.ticketCostID = ticketCostID;
    }


    /**
     * Gets the lineItemID value for this BillingItem.
     * 
     * @return lineItemID
     */
    public java.lang.Object getLineItemID() {
        return lineItemID;
    }


    /**
     * Sets the lineItemID value for this BillingItem.
     * 
     * @param lineItemID
     */
    public void setLineItemID(java.lang.Object lineItemID) {
        this.lineItemID = lineItemID;
    }


    /**
     * Gets the milestoneID value for this BillingItem.
     * 
     * @return milestoneID
     */
    public java.lang.Object getMilestoneID() {
        return milestoneID;
    }


    /**
     * Sets the milestoneID value for this BillingItem.
     * 
     * @param milestoneID
     */
    public void setMilestoneID(java.lang.Object milestoneID) {
        this.milestoneID = milestoneID;
    }


    /**
     * Gets the serviceID value for this BillingItem.
     * 
     * @return serviceID
     */
    public java.lang.Object getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this BillingItem.
     * 
     * @param serviceID
     */
    public void setServiceID(java.lang.Object serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the serviceBundleID value for this BillingItem.
     * 
     * @return serviceBundleID
     */
    public java.lang.Object getServiceBundleID() {
        return serviceBundleID;
    }


    /**
     * Sets the serviceBundleID value for this BillingItem.
     * 
     * @param serviceBundleID
     */
    public void setServiceBundleID(java.lang.Object serviceBundleID) {
        this.serviceBundleID = serviceBundleID;
    }


    /**
     * Gets the vendorID value for this BillingItem.
     * 
     * @return vendorID
     */
    public java.lang.Object getVendorID() {
        return vendorID;
    }


    /**
     * Sets the vendorID value for this BillingItem.
     * 
     * @param vendorID
     */
    public void setVendorID(java.lang.Object vendorID) {
        this.vendorID = vendorID;
    }


    /**
     * Gets the lineItemFullDescription value for this BillingItem.
     * 
     * @return lineItemFullDescription
     */
    public java.lang.Object getLineItemFullDescription() {
        return lineItemFullDescription;
    }


    /**
     * Sets the lineItemFullDescription value for this BillingItem.
     * 
     * @param lineItemFullDescription
     */
    public void setLineItemFullDescription(java.lang.Object lineItemFullDescription) {
        this.lineItemFullDescription = lineItemFullDescription;
    }


    /**
     * Gets the lineItemGroupDescription value for this BillingItem.
     * 
     * @return lineItemGroupDescription
     */
    public java.lang.Object getLineItemGroupDescription() {
        return lineItemGroupDescription;
    }


    /**
     * Sets the lineItemGroupDescription value for this BillingItem.
     * 
     * @param lineItemGroupDescription
     */
    public void setLineItemGroupDescription(java.lang.Object lineItemGroupDescription) {
        this.lineItemGroupDescription = lineItemGroupDescription;
    }


    /**
     * Gets the installedProductID value for this BillingItem.
     * 
     * @return installedProductID
     */
    public java.lang.Object getInstalledProductID() {
        return installedProductID;
    }


    /**
     * Sets the installedProductID value for this BillingItem.
     * 
     * @param installedProductID
     */
    public void setInstalledProductID(java.lang.Object installedProductID) {
        this.installedProductID = installedProductID;
    }


    /**
     * Gets the internalCurrencyExtendedPrice value for this BillingItem.
     * 
     * @return internalCurrencyExtendedPrice
     */
    public java.lang.Object getInternalCurrencyExtendedPrice() {
        return internalCurrencyExtendedPrice;
    }


    /**
     * Sets the internalCurrencyExtendedPrice value for this BillingItem.
     * 
     * @param internalCurrencyExtendedPrice
     */
    public void setInternalCurrencyExtendedPrice(java.lang.Object internalCurrencyExtendedPrice) {
        this.internalCurrencyExtendedPrice = internalCurrencyExtendedPrice;
    }


    /**
     * Gets the internalCurrencyRate value for this BillingItem.
     * 
     * @return internalCurrencyRate
     */
    public java.lang.Object getInternalCurrencyRate() {
        return internalCurrencyRate;
    }


    /**
     * Sets the internalCurrencyRate value for this BillingItem.
     * 
     * @param internalCurrencyRate
     */
    public void setInternalCurrencyRate(java.lang.Object internalCurrencyRate) {
        this.internalCurrencyRate = internalCurrencyRate;
    }


    /**
     * Gets the internalCurrencyTaxDollars value for this BillingItem.
     * 
     * @return internalCurrencyTaxDollars
     */
    public java.lang.Object getInternalCurrencyTaxDollars() {
        return internalCurrencyTaxDollars;
    }


    /**
     * Sets the internalCurrencyTaxDollars value for this BillingItem.
     * 
     * @param internalCurrencyTaxDollars
     */
    public void setInternalCurrencyTaxDollars(java.lang.Object internalCurrencyTaxDollars) {
        this.internalCurrencyTaxDollars = internalCurrencyTaxDollars;
    }


    /**
     * Gets the internalCurrencyTotalAmount value for this BillingItem.
     * 
     * @return internalCurrencyTotalAmount
     */
    public java.lang.Object getInternalCurrencyTotalAmount() {
        return internalCurrencyTotalAmount;
    }


    /**
     * Sets the internalCurrencyTotalAmount value for this BillingItem.
     * 
     * @param internalCurrencyTotalAmount
     */
    public void setInternalCurrencyTotalAmount(java.lang.Object internalCurrencyTotalAmount) {
        this.internalCurrencyTotalAmount = internalCurrencyTotalAmount;
    }


    /**
     * Gets the businessDivisionSubdivisionID value for this BillingItem.
     * 
     * @return businessDivisionSubdivisionID
     */
    public java.lang.Object getBusinessDivisionSubdivisionID() {
        return businessDivisionSubdivisionID;
    }


    /**
     * Sets the businessDivisionSubdivisionID value for this BillingItem.
     * 
     * @param businessDivisionSubdivisionID
     */
    public void setBusinessDivisionSubdivisionID(java.lang.Object businessDivisionSubdivisionID) {
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }


    /**
     * Gets the postedOnTime value for this BillingItem.
     * 
     * @return postedOnTime
     */
    public java.lang.Object getPostedOnTime() {
        return postedOnTime;
    }


    /**
     * Sets the postedOnTime value for this BillingItem.
     * 
     * @param postedOnTime
     */
    public void setPostedOnTime(java.lang.Object postedOnTime) {
        this.postedOnTime = postedOnTime;
    }


    /**
     * Gets the postedDate value for this BillingItem.
     * 
     * @return postedDate
     */
    public java.lang.Object getPostedDate() {
        return postedDate;
    }


    /**
     * Sets the postedDate value for this BillingItem.
     * 
     * @param postedDate
     */
    public void setPostedDate(java.lang.Object postedDate) {
        this.postedDate = postedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingItem)) return false;
        BillingItem other = (BillingItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountManagerWhenApprovedID==null && other.getAccountManagerWhenApprovedID()==null) || 
             (this.accountManagerWhenApprovedID!=null &&
              this.accountManagerWhenApprovedID.equals(other.getAccountManagerWhenApprovedID()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.subType==null && other.getSubType()==null) || 
             (this.subType!=null &&
              this.subType.equals(other.getSubType()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.ourCost==null && other.getOurCost()==null) || 
             (this.ourCost!=null &&
              this.ourCost.equals(other.getOurCost()))) &&
            ((this.itemDate==null && other.getItemDate()==null) || 
             (this.itemDate!=null &&
              this.itemDate.equals(other.getItemDate()))) &&
            ((this.invoiceID==null && other.getInvoiceID()==null) || 
             (this.invoiceID!=null &&
              this.invoiceID.equals(other.getInvoiceID()))) &&
            ((this.itemApproverID==null && other.getItemApproverID()==null) || 
             (this.itemApproverID!=null &&
              this.itemApproverID.equals(other.getItemApproverID()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.ticketID==null && other.getTicketID()==null) || 
             (this.ticketID!=null &&
              this.ticketID.equals(other.getTicketID()))) &&
            ((this.taskID==null && other.getTaskID()==null) || 
             (this.taskID!=null &&
              this.taskID.equals(other.getTaskID()))) &&
            ((this.projectID==null && other.getProjectID()==null) || 
             (this.projectID!=null &&
              this.projectID.equals(other.getProjectID()))) &&
            ((this.allocationCodeID==null && other.getAllocationCodeID()==null) || 
             (this.allocationCodeID!=null &&
              this.allocationCodeID.equals(other.getAllocationCodeID()))) &&
            ((this.roleID==null && other.getRoleID()==null) || 
             (this.roleID!=null &&
              this.roleID.equals(other.getRoleID()))) &&
            ((this.timeEntryID==null && other.getTimeEntryID()==null) || 
             (this.timeEntryID!=null &&
              this.timeEntryID.equals(other.getTimeEntryID()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.webServiceDate==null && other.getWebServiceDate()==null) || 
             (this.webServiceDate!=null &&
              this.webServiceDate.equals(other.getWebServiceDate()))) &&
            ((this.nonBillable==null && other.getNonBillable()==null) || 
             (this.nonBillable!=null &&
              this.nonBillable.equals(other.getNonBillable()))) &&
            ((this.taxDollars==null && other.getTaxDollars()==null) || 
             (this.taxDollars!=null &&
              this.taxDollars.equals(other.getTaxDollars()))) &&
            ((this.purchaseOrderNumber==null && other.getPurchaseOrderNumber()==null) || 
             (this.purchaseOrderNumber!=null &&
              this.purchaseOrderNumber.equals(other.getPurchaseOrderNumber()))) &&
            ((this.extendedPrice==null && other.getExtendedPrice()==null) || 
             (this.extendedPrice!=null &&
              this.extendedPrice.equals(other.getExtendedPrice()))) &&
            ((this.expenseItemID==null && other.getExpenseItemID()==null) || 
             (this.expenseItemID!=null &&
              this.expenseItemID.equals(other.getExpenseItemID()))) &&
            ((this.contractCostID==null && other.getContractCostID()==null) || 
             (this.contractCostID!=null &&
              this.contractCostID.equals(other.getContractCostID()))) &&
            ((this.projectCostID==null && other.getProjectCostID()==null) || 
             (this.projectCostID!=null &&
              this.projectCostID.equals(other.getProjectCostID()))) &&
            ((this.ticketCostID==null && other.getTicketCostID()==null) || 
             (this.ticketCostID!=null &&
              this.ticketCostID.equals(other.getTicketCostID()))) &&
            ((this.lineItemID==null && other.getLineItemID()==null) || 
             (this.lineItemID!=null &&
              this.lineItemID.equals(other.getLineItemID()))) &&
            ((this.milestoneID==null && other.getMilestoneID()==null) || 
             (this.milestoneID!=null &&
              this.milestoneID.equals(other.getMilestoneID()))) &&
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.serviceBundleID==null && other.getServiceBundleID()==null) || 
             (this.serviceBundleID!=null &&
              this.serviceBundleID.equals(other.getServiceBundleID()))) &&
            ((this.vendorID==null && other.getVendorID()==null) || 
             (this.vendorID!=null &&
              this.vendorID.equals(other.getVendorID()))) &&
            ((this.lineItemFullDescription==null && other.getLineItemFullDescription()==null) || 
             (this.lineItemFullDescription!=null &&
              this.lineItemFullDescription.equals(other.getLineItemFullDescription()))) &&
            ((this.lineItemGroupDescription==null && other.getLineItemGroupDescription()==null) || 
             (this.lineItemGroupDescription!=null &&
              this.lineItemGroupDescription.equals(other.getLineItemGroupDescription()))) &&
            ((this.installedProductID==null && other.getInstalledProductID()==null) || 
             (this.installedProductID!=null &&
              this.installedProductID.equals(other.getInstalledProductID()))) &&
            ((this.internalCurrencyExtendedPrice==null && other.getInternalCurrencyExtendedPrice()==null) || 
             (this.internalCurrencyExtendedPrice!=null &&
              this.internalCurrencyExtendedPrice.equals(other.getInternalCurrencyExtendedPrice()))) &&
            ((this.internalCurrencyRate==null && other.getInternalCurrencyRate()==null) || 
             (this.internalCurrencyRate!=null &&
              this.internalCurrencyRate.equals(other.getInternalCurrencyRate()))) &&
            ((this.internalCurrencyTaxDollars==null && other.getInternalCurrencyTaxDollars()==null) || 
             (this.internalCurrencyTaxDollars!=null &&
              this.internalCurrencyTaxDollars.equals(other.getInternalCurrencyTaxDollars()))) &&
            ((this.internalCurrencyTotalAmount==null && other.getInternalCurrencyTotalAmount()==null) || 
             (this.internalCurrencyTotalAmount!=null &&
              this.internalCurrencyTotalAmount.equals(other.getInternalCurrencyTotalAmount()))) &&
            ((this.businessDivisionSubdivisionID==null && other.getBusinessDivisionSubdivisionID()==null) || 
             (this.businessDivisionSubdivisionID!=null &&
              this.businessDivisionSubdivisionID.equals(other.getBusinessDivisionSubdivisionID()))) &&
            ((this.postedOnTime==null && other.getPostedOnTime()==null) || 
             (this.postedOnTime!=null &&
              this.postedOnTime.equals(other.getPostedOnTime()))) &&
            ((this.postedDate==null && other.getPostedDate()==null) || 
             (this.postedDate!=null &&
              this.postedDate.equals(other.getPostedDate())));
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
        if (getAccountManagerWhenApprovedID() != null) {
            _hashCode += getAccountManagerWhenApprovedID().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSubType() != null) {
            _hashCode += getSubType().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getOurCost() != null) {
            _hashCode += getOurCost().hashCode();
        }
        if (getItemDate() != null) {
            _hashCode += getItemDate().hashCode();
        }
        if (getInvoiceID() != null) {
            _hashCode += getInvoiceID().hashCode();
        }
        if (getItemApproverID() != null) {
            _hashCode += getItemApproverID().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
        }
        if (getTaskID() != null) {
            _hashCode += getTaskID().hashCode();
        }
        if (getProjectID() != null) {
            _hashCode += getProjectID().hashCode();
        }
        if (getAllocationCodeID() != null) {
            _hashCode += getAllocationCodeID().hashCode();
        }
        if (getRoleID() != null) {
            _hashCode += getRoleID().hashCode();
        }
        if (getTimeEntryID() != null) {
            _hashCode += getTimeEntryID().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getWebServiceDate() != null) {
            _hashCode += getWebServiceDate().hashCode();
        }
        if (getNonBillable() != null) {
            _hashCode += getNonBillable().hashCode();
        }
        if (getTaxDollars() != null) {
            _hashCode += getTaxDollars().hashCode();
        }
        if (getPurchaseOrderNumber() != null) {
            _hashCode += getPurchaseOrderNumber().hashCode();
        }
        if (getExtendedPrice() != null) {
            _hashCode += getExtendedPrice().hashCode();
        }
        if (getExpenseItemID() != null) {
            _hashCode += getExpenseItemID().hashCode();
        }
        if (getContractCostID() != null) {
            _hashCode += getContractCostID().hashCode();
        }
        if (getProjectCostID() != null) {
            _hashCode += getProjectCostID().hashCode();
        }
        if (getTicketCostID() != null) {
            _hashCode += getTicketCostID().hashCode();
        }
        if (getLineItemID() != null) {
            _hashCode += getLineItemID().hashCode();
        }
        if (getMilestoneID() != null) {
            _hashCode += getMilestoneID().hashCode();
        }
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getServiceBundleID() != null) {
            _hashCode += getServiceBundleID().hashCode();
        }
        if (getVendorID() != null) {
            _hashCode += getVendorID().hashCode();
        }
        if (getLineItemFullDescription() != null) {
            _hashCode += getLineItemFullDescription().hashCode();
        }
        if (getLineItemGroupDescription() != null) {
            _hashCode += getLineItemGroupDescription().hashCode();
        }
        if (getInstalledProductID() != null) {
            _hashCode += getInstalledProductID().hashCode();
        }
        if (getInternalCurrencyExtendedPrice() != null) {
            _hashCode += getInternalCurrencyExtendedPrice().hashCode();
        }
        if (getInternalCurrencyRate() != null) {
            _hashCode += getInternalCurrencyRate().hashCode();
        }
        if (getInternalCurrencyTaxDollars() != null) {
            _hashCode += getInternalCurrencyTaxDollars().hashCode();
        }
        if (getInternalCurrencyTotalAmount() != null) {
            _hashCode += getInternalCurrencyTotalAmount().hashCode();
        }
        if (getBusinessDivisionSubdivisionID() != null) {
            _hashCode += getBusinessDivisionSubdivisionID().hashCode();
        }
        if (getPostedOnTime() != null) {
            _hashCode += getPostedOnTime().hashCode();
        }
        if (getPostedDate() != null) {
            _hashCode += getPostedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillingItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountManagerWhenApprovedID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountManagerWhenApprovedID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ItemName"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ourCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OurCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ItemDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemApproverID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ItemApproverID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaskID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AllocationCodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RoleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeEntryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TimeEntryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webServiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WebServiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonBillable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NonBillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDollars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaxDollars"));
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
        elemField.setFieldName("extendedPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExtendedPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpenseItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractCostID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractCostID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectCostID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectCostID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketCostID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketCostID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LineItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MilestoneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceBundleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceBundleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "VendorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemFullDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LineItemFullDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemGroupDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LineItemGroupDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installedProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InstalledProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyExtendedPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyExtendedPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyTaxDollars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyTaxDollars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyTotalAmount"));
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
        elemField.setFieldName("postedOnTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PostedOnTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PostedDate"));
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
