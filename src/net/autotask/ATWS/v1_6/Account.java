/**
 * Account.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Account extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object address1;

    private java.lang.Object address2;

    private java.lang.Object alternatePhone1;

    private java.lang.Object alternatePhone2;

    private java.lang.Object assetValue;

    private java.lang.Object city;

    private java.lang.Object competitorID;

    private java.lang.Object country;

    private java.lang.Object createDate;

    private java.lang.Object fax;

    private java.lang.Object keyAccountIcon;

    private java.lang.Object lastActivityDate;

    private java.lang.Object marketSegmentID;

    private java.lang.Object accountName;

    private java.lang.Object accountNumber;

    private java.lang.Object ownerResourceID;

    private java.lang.Object parentAccountID;

    private java.lang.Object phone;

    private java.lang.Object postalCode;

    private java.lang.Object SICCode;

    private java.lang.Object state;

    private java.lang.Object stockMarket;

    private java.lang.Object stockSymbol;

    private java.lang.Object territoryID;

    private java.lang.Object accountType;

    private java.lang.Object webAddress;

    private java.lang.Object active;

    private java.lang.Object clientPortalActive;

    private java.lang.Object taskFireActive;

    private java.lang.Object taxExempt;

    private java.lang.Object taxRegionID;

    private java.lang.Object taxID;

    private java.lang.Object additionalAddressInformation;

    private java.lang.Object countryID;

    private java.lang.Object billToAddressToUse;

    private java.lang.Object billToAttention;

    private java.lang.Object billToAddress1;

    private java.lang.Object billToAddress2;

    private java.lang.Object billToCity;

    private java.lang.Object billToState;

    private java.lang.Object billToZipCode;

    private java.lang.Object billToCountryID;

    private java.lang.Object billToAdditionalAddressInformation;

    private java.lang.Object invoiceMethod;

    private java.lang.Object invoiceNonContractItemsToParentAccount;

    private java.lang.Object quoteTemplateID;

    private java.lang.Object quoteEmailMessageID;

    private java.lang.Object invoiceTemplateID;

    private java.lang.Object invoiceEmailMessageID;

    private java.lang.Object currencyID;

    private java.lang.Object billToAccountPhysicalLocationID;

    private java.lang.Object surveyAccountRating;

    private java.lang.Object createdByResourceID;

    private java.lang.Object apiVendorID;

    public Account() {
    }

    public Account(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object address1,
           java.lang.Object address2,
           java.lang.Object alternatePhone1,
           java.lang.Object alternatePhone2,
           java.lang.Object assetValue,
           java.lang.Object city,
           java.lang.Object competitorID,
           java.lang.Object country,
           java.lang.Object createDate,
           java.lang.Object fax,
           java.lang.Object keyAccountIcon,
           java.lang.Object lastActivityDate,
           java.lang.Object marketSegmentID,
           java.lang.Object accountName,
           java.lang.Object accountNumber,
           java.lang.Object ownerResourceID,
           java.lang.Object parentAccountID,
           java.lang.Object phone,
           java.lang.Object postalCode,
           java.lang.Object SICCode,
           java.lang.Object state,
           java.lang.Object stockMarket,
           java.lang.Object stockSymbol,
           java.lang.Object territoryID,
           java.lang.Object accountType,
           java.lang.Object webAddress,
           java.lang.Object active,
           java.lang.Object clientPortalActive,
           java.lang.Object taskFireActive,
           java.lang.Object taxExempt,
           java.lang.Object taxRegionID,
           java.lang.Object taxID,
           java.lang.Object additionalAddressInformation,
           java.lang.Object countryID,
           java.lang.Object billToAddressToUse,
           java.lang.Object billToAttention,
           java.lang.Object billToAddress1,
           java.lang.Object billToAddress2,
           java.lang.Object billToCity,
           java.lang.Object billToState,
           java.lang.Object billToZipCode,
           java.lang.Object billToCountryID,
           java.lang.Object billToAdditionalAddressInformation,
           java.lang.Object invoiceMethod,
           java.lang.Object invoiceNonContractItemsToParentAccount,
           java.lang.Object quoteTemplateID,
           java.lang.Object quoteEmailMessageID,
           java.lang.Object invoiceTemplateID,
           java.lang.Object invoiceEmailMessageID,
           java.lang.Object currencyID,
           java.lang.Object billToAccountPhysicalLocationID,
           java.lang.Object surveyAccountRating,
           java.lang.Object createdByResourceID,
           java.lang.Object apiVendorID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.address1 = address1;
        this.address2 = address2;
        this.alternatePhone1 = alternatePhone1;
        this.alternatePhone2 = alternatePhone2;
        this.assetValue = assetValue;
        this.city = city;
        this.competitorID = competitorID;
        this.country = country;
        this.createDate = createDate;
        this.fax = fax;
        this.keyAccountIcon = keyAccountIcon;
        this.lastActivityDate = lastActivityDate;
        this.marketSegmentID = marketSegmentID;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.ownerResourceID = ownerResourceID;
        this.parentAccountID = parentAccountID;
        this.phone = phone;
        this.postalCode = postalCode;
        this.SICCode = SICCode;
        this.state = state;
        this.stockMarket = stockMarket;
        this.stockSymbol = stockSymbol;
        this.territoryID = territoryID;
        this.accountType = accountType;
        this.webAddress = webAddress;
        this.active = active;
        this.clientPortalActive = clientPortalActive;
        this.taskFireActive = taskFireActive;
        this.taxExempt = taxExempt;
        this.taxRegionID = taxRegionID;
        this.taxID = taxID;
        this.additionalAddressInformation = additionalAddressInformation;
        this.countryID = countryID;
        this.billToAddressToUse = billToAddressToUse;
        this.billToAttention = billToAttention;
        this.billToAddress1 = billToAddress1;
        this.billToAddress2 = billToAddress2;
        this.billToCity = billToCity;
        this.billToState = billToState;
        this.billToZipCode = billToZipCode;
        this.billToCountryID = billToCountryID;
        this.billToAdditionalAddressInformation = billToAdditionalAddressInformation;
        this.invoiceMethod = invoiceMethod;
        this.invoiceNonContractItemsToParentAccount = invoiceNonContractItemsToParentAccount;
        this.quoteTemplateID = quoteTemplateID;
        this.quoteEmailMessageID = quoteEmailMessageID;
        this.invoiceTemplateID = invoiceTemplateID;
        this.invoiceEmailMessageID = invoiceEmailMessageID;
        this.currencyID = currencyID;
        this.billToAccountPhysicalLocationID = billToAccountPhysicalLocationID;
        this.surveyAccountRating = surveyAccountRating;
        this.createdByResourceID = createdByResourceID;
        this.apiVendorID = apiVendorID;
    }


    /**
     * Gets the address1 value for this Account.
     * 
     * @return address1
     */
    public java.lang.Object getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this Account.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.Object address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this Account.
     * 
     * @return address2
     */
    public java.lang.Object getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this Account.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.Object address2) {
        this.address2 = address2;
    }


    /**
     * Gets the alternatePhone1 value for this Account.
     * 
     * @return alternatePhone1
     */
    public java.lang.Object getAlternatePhone1() {
        return alternatePhone1;
    }


    /**
     * Sets the alternatePhone1 value for this Account.
     * 
     * @param alternatePhone1
     */
    public void setAlternatePhone1(java.lang.Object alternatePhone1) {
        this.alternatePhone1 = alternatePhone1;
    }


    /**
     * Gets the alternatePhone2 value for this Account.
     * 
     * @return alternatePhone2
     */
    public java.lang.Object getAlternatePhone2() {
        return alternatePhone2;
    }


    /**
     * Sets the alternatePhone2 value for this Account.
     * 
     * @param alternatePhone2
     */
    public void setAlternatePhone2(java.lang.Object alternatePhone2) {
        this.alternatePhone2 = alternatePhone2;
    }


    /**
     * Gets the assetValue value for this Account.
     * 
     * @return assetValue
     */
    public java.lang.Object getAssetValue() {
        return assetValue;
    }


    /**
     * Sets the assetValue value for this Account.
     * 
     * @param assetValue
     */
    public void setAssetValue(java.lang.Object assetValue) {
        this.assetValue = assetValue;
    }


    /**
     * Gets the city value for this Account.
     * 
     * @return city
     */
    public java.lang.Object getCity() {
        return city;
    }


    /**
     * Sets the city value for this Account.
     * 
     * @param city
     */
    public void setCity(java.lang.Object city) {
        this.city = city;
    }


    /**
     * Gets the competitorID value for this Account.
     * 
     * @return competitorID
     */
    public java.lang.Object getCompetitorID() {
        return competitorID;
    }


    /**
     * Sets the competitorID value for this Account.
     * 
     * @param competitorID
     */
    public void setCompetitorID(java.lang.Object competitorID) {
        this.competitorID = competitorID;
    }


    /**
     * Gets the country value for this Account.
     * 
     * @return country
     */
    public java.lang.Object getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Account.
     * 
     * @param country
     */
    public void setCountry(java.lang.Object country) {
        this.country = country;
    }


    /**
     * Gets the createDate value for this Account.
     * 
     * @return createDate
     */
    public java.lang.Object getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this Account.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.Object createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the fax value for this Account.
     * 
     * @return fax
     */
    public java.lang.Object getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Account.
     * 
     * @param fax
     */
    public void setFax(java.lang.Object fax) {
        this.fax = fax;
    }


    /**
     * Gets the keyAccountIcon value for this Account.
     * 
     * @return keyAccountIcon
     */
    public java.lang.Object getKeyAccountIcon() {
        return keyAccountIcon;
    }


    /**
     * Sets the keyAccountIcon value for this Account.
     * 
     * @param keyAccountIcon
     */
    public void setKeyAccountIcon(java.lang.Object keyAccountIcon) {
        this.keyAccountIcon = keyAccountIcon;
    }


    /**
     * Gets the lastActivityDate value for this Account.
     * 
     * @return lastActivityDate
     */
    public java.lang.Object getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Account.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.lang.Object lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the marketSegmentID value for this Account.
     * 
     * @return marketSegmentID
     */
    public java.lang.Object getMarketSegmentID() {
        return marketSegmentID;
    }


    /**
     * Sets the marketSegmentID value for this Account.
     * 
     * @param marketSegmentID
     */
    public void setMarketSegmentID(java.lang.Object marketSegmentID) {
        this.marketSegmentID = marketSegmentID;
    }


    /**
     * Gets the accountName value for this Account.
     * 
     * @return accountName
     */
    public java.lang.Object getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this Account.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.Object accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the accountNumber value for this Account.
     * 
     * @return accountNumber
     */
    public java.lang.Object getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Account.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.Object accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the ownerResourceID value for this Account.
     * 
     * @return ownerResourceID
     */
    public java.lang.Object getOwnerResourceID() {
        return ownerResourceID;
    }


    /**
     * Sets the ownerResourceID value for this Account.
     * 
     * @param ownerResourceID
     */
    public void setOwnerResourceID(java.lang.Object ownerResourceID) {
        this.ownerResourceID = ownerResourceID;
    }


    /**
     * Gets the parentAccountID value for this Account.
     * 
     * @return parentAccountID
     */
    public java.lang.Object getParentAccountID() {
        return parentAccountID;
    }


    /**
     * Sets the parentAccountID value for this Account.
     * 
     * @param parentAccountID
     */
    public void setParentAccountID(java.lang.Object parentAccountID) {
        this.parentAccountID = parentAccountID;
    }


    /**
     * Gets the phone value for this Account.
     * 
     * @return phone
     */
    public java.lang.Object getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Account.
     * 
     * @param phone
     */
    public void setPhone(java.lang.Object phone) {
        this.phone = phone;
    }


    /**
     * Gets the postalCode value for this Account.
     * 
     * @return postalCode
     */
    public java.lang.Object getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this Account.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.Object postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the SICCode value for this Account.
     * 
     * @return SICCode
     */
    public java.lang.Object getSICCode() {
        return SICCode;
    }


    /**
     * Sets the SICCode value for this Account.
     * 
     * @param SICCode
     */
    public void setSICCode(java.lang.Object SICCode) {
        this.SICCode = SICCode;
    }


    /**
     * Gets the state value for this Account.
     * 
     * @return state
     */
    public java.lang.Object getState() {
        return state;
    }


    /**
     * Sets the state value for this Account.
     * 
     * @param state
     */
    public void setState(java.lang.Object state) {
        this.state = state;
    }


    /**
     * Gets the stockMarket value for this Account.
     * 
     * @return stockMarket
     */
    public java.lang.Object getStockMarket() {
        return stockMarket;
    }


    /**
     * Sets the stockMarket value for this Account.
     * 
     * @param stockMarket
     */
    public void setStockMarket(java.lang.Object stockMarket) {
        this.stockMarket = stockMarket;
    }


    /**
     * Gets the stockSymbol value for this Account.
     * 
     * @return stockSymbol
     */
    public java.lang.Object getStockSymbol() {
        return stockSymbol;
    }


    /**
     * Sets the stockSymbol value for this Account.
     * 
     * @param stockSymbol
     */
    public void setStockSymbol(java.lang.Object stockSymbol) {
        this.stockSymbol = stockSymbol;
    }


    /**
     * Gets the territoryID value for this Account.
     * 
     * @return territoryID
     */
    public java.lang.Object getTerritoryID() {
        return territoryID;
    }


    /**
     * Sets the territoryID value for this Account.
     * 
     * @param territoryID
     */
    public void setTerritoryID(java.lang.Object territoryID) {
        this.territoryID = territoryID;
    }


    /**
     * Gets the accountType value for this Account.
     * 
     * @return accountType
     */
    public java.lang.Object getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this Account.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.Object accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the webAddress value for this Account.
     * 
     * @return webAddress
     */
    public java.lang.Object getWebAddress() {
        return webAddress;
    }


    /**
     * Sets the webAddress value for this Account.
     * 
     * @param webAddress
     */
    public void setWebAddress(java.lang.Object webAddress) {
        this.webAddress = webAddress;
    }


    /**
     * Gets the active value for this Account.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this Account.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the clientPortalActive value for this Account.
     * 
     * @return clientPortalActive
     */
    public java.lang.Object getClientPortalActive() {
        return clientPortalActive;
    }


    /**
     * Sets the clientPortalActive value for this Account.
     * 
     * @param clientPortalActive
     */
    public void setClientPortalActive(java.lang.Object clientPortalActive) {
        this.clientPortalActive = clientPortalActive;
    }


    /**
     * Gets the taskFireActive value for this Account.
     * 
     * @return taskFireActive
     */
    public java.lang.Object getTaskFireActive() {
        return taskFireActive;
    }


    /**
     * Sets the taskFireActive value for this Account.
     * 
     * @param taskFireActive
     */
    public void setTaskFireActive(java.lang.Object taskFireActive) {
        this.taskFireActive = taskFireActive;
    }


    /**
     * Gets the taxExempt value for this Account.
     * 
     * @return taxExempt
     */
    public java.lang.Object getTaxExempt() {
        return taxExempt;
    }


    /**
     * Sets the taxExempt value for this Account.
     * 
     * @param taxExempt
     */
    public void setTaxExempt(java.lang.Object taxExempt) {
        this.taxExempt = taxExempt;
    }


    /**
     * Gets the taxRegionID value for this Account.
     * 
     * @return taxRegionID
     */
    public java.lang.Object getTaxRegionID() {
        return taxRegionID;
    }


    /**
     * Sets the taxRegionID value for this Account.
     * 
     * @param taxRegionID
     */
    public void setTaxRegionID(java.lang.Object taxRegionID) {
        this.taxRegionID = taxRegionID;
    }


    /**
     * Gets the taxID value for this Account.
     * 
     * @return taxID
     */
    public java.lang.Object getTaxID() {
        return taxID;
    }


    /**
     * Sets the taxID value for this Account.
     * 
     * @param taxID
     */
    public void setTaxID(java.lang.Object taxID) {
        this.taxID = taxID;
    }


    /**
     * Gets the additionalAddressInformation value for this Account.
     * 
     * @return additionalAddressInformation
     */
    public java.lang.Object getAdditionalAddressInformation() {
        return additionalAddressInformation;
    }


    /**
     * Sets the additionalAddressInformation value for this Account.
     * 
     * @param additionalAddressInformation
     */
    public void setAdditionalAddressInformation(java.lang.Object additionalAddressInformation) {
        this.additionalAddressInformation = additionalAddressInformation;
    }


    /**
     * Gets the countryID value for this Account.
     * 
     * @return countryID
     */
    public java.lang.Object getCountryID() {
        return countryID;
    }


    /**
     * Sets the countryID value for this Account.
     * 
     * @param countryID
     */
    public void setCountryID(java.lang.Object countryID) {
        this.countryID = countryID;
    }


    /**
     * Gets the billToAddressToUse value for this Account.
     * 
     * @return billToAddressToUse
     */
    public java.lang.Object getBillToAddressToUse() {
        return billToAddressToUse;
    }


    /**
     * Sets the billToAddressToUse value for this Account.
     * 
     * @param billToAddressToUse
     */
    public void setBillToAddressToUse(java.lang.Object billToAddressToUse) {
        this.billToAddressToUse = billToAddressToUse;
    }


    /**
     * Gets the billToAttention value for this Account.
     * 
     * @return billToAttention
     */
    public java.lang.Object getBillToAttention() {
        return billToAttention;
    }


    /**
     * Sets the billToAttention value for this Account.
     * 
     * @param billToAttention
     */
    public void setBillToAttention(java.lang.Object billToAttention) {
        this.billToAttention = billToAttention;
    }


    /**
     * Gets the billToAddress1 value for this Account.
     * 
     * @return billToAddress1
     */
    public java.lang.Object getBillToAddress1() {
        return billToAddress1;
    }


    /**
     * Sets the billToAddress1 value for this Account.
     * 
     * @param billToAddress1
     */
    public void setBillToAddress1(java.lang.Object billToAddress1) {
        this.billToAddress1 = billToAddress1;
    }


    /**
     * Gets the billToAddress2 value for this Account.
     * 
     * @return billToAddress2
     */
    public java.lang.Object getBillToAddress2() {
        return billToAddress2;
    }


    /**
     * Sets the billToAddress2 value for this Account.
     * 
     * @param billToAddress2
     */
    public void setBillToAddress2(java.lang.Object billToAddress2) {
        this.billToAddress2 = billToAddress2;
    }


    /**
     * Gets the billToCity value for this Account.
     * 
     * @return billToCity
     */
    public java.lang.Object getBillToCity() {
        return billToCity;
    }


    /**
     * Sets the billToCity value for this Account.
     * 
     * @param billToCity
     */
    public void setBillToCity(java.lang.Object billToCity) {
        this.billToCity = billToCity;
    }


    /**
     * Gets the billToState value for this Account.
     * 
     * @return billToState
     */
    public java.lang.Object getBillToState() {
        return billToState;
    }


    /**
     * Sets the billToState value for this Account.
     * 
     * @param billToState
     */
    public void setBillToState(java.lang.Object billToState) {
        this.billToState = billToState;
    }


    /**
     * Gets the billToZipCode value for this Account.
     * 
     * @return billToZipCode
     */
    public java.lang.Object getBillToZipCode() {
        return billToZipCode;
    }


    /**
     * Sets the billToZipCode value for this Account.
     * 
     * @param billToZipCode
     */
    public void setBillToZipCode(java.lang.Object billToZipCode) {
        this.billToZipCode = billToZipCode;
    }


    /**
     * Gets the billToCountryID value for this Account.
     * 
     * @return billToCountryID
     */
    public java.lang.Object getBillToCountryID() {
        return billToCountryID;
    }


    /**
     * Sets the billToCountryID value for this Account.
     * 
     * @param billToCountryID
     */
    public void setBillToCountryID(java.lang.Object billToCountryID) {
        this.billToCountryID = billToCountryID;
    }


    /**
     * Gets the billToAdditionalAddressInformation value for this Account.
     * 
     * @return billToAdditionalAddressInformation
     */
    public java.lang.Object getBillToAdditionalAddressInformation() {
        return billToAdditionalAddressInformation;
    }


    /**
     * Sets the billToAdditionalAddressInformation value for this Account.
     * 
     * @param billToAdditionalAddressInformation
     */
    public void setBillToAdditionalAddressInformation(java.lang.Object billToAdditionalAddressInformation) {
        this.billToAdditionalAddressInformation = billToAdditionalAddressInformation;
    }


    /**
     * Gets the invoiceMethod value for this Account.
     * 
     * @return invoiceMethod
     */
    public java.lang.Object getInvoiceMethod() {
        return invoiceMethod;
    }


    /**
     * Sets the invoiceMethod value for this Account.
     * 
     * @param invoiceMethod
     */
    public void setInvoiceMethod(java.lang.Object invoiceMethod) {
        this.invoiceMethod = invoiceMethod;
    }


    /**
     * Gets the invoiceNonContractItemsToParentAccount value for this Account.
     * 
     * @return invoiceNonContractItemsToParentAccount
     */
    public java.lang.Object getInvoiceNonContractItemsToParentAccount() {
        return invoiceNonContractItemsToParentAccount;
    }


    /**
     * Sets the invoiceNonContractItemsToParentAccount value for this Account.
     * 
     * @param invoiceNonContractItemsToParentAccount
     */
    public void setInvoiceNonContractItemsToParentAccount(java.lang.Object invoiceNonContractItemsToParentAccount) {
        this.invoiceNonContractItemsToParentAccount = invoiceNonContractItemsToParentAccount;
    }


    /**
     * Gets the quoteTemplateID value for this Account.
     * 
     * @return quoteTemplateID
     */
    public java.lang.Object getQuoteTemplateID() {
        return quoteTemplateID;
    }


    /**
     * Sets the quoteTemplateID value for this Account.
     * 
     * @param quoteTemplateID
     */
    public void setQuoteTemplateID(java.lang.Object quoteTemplateID) {
        this.quoteTemplateID = quoteTemplateID;
    }


    /**
     * Gets the quoteEmailMessageID value for this Account.
     * 
     * @return quoteEmailMessageID
     */
    public java.lang.Object getQuoteEmailMessageID() {
        return quoteEmailMessageID;
    }


    /**
     * Sets the quoteEmailMessageID value for this Account.
     * 
     * @param quoteEmailMessageID
     */
    public void setQuoteEmailMessageID(java.lang.Object quoteEmailMessageID) {
        this.quoteEmailMessageID = quoteEmailMessageID;
    }


    /**
     * Gets the invoiceTemplateID value for this Account.
     * 
     * @return invoiceTemplateID
     */
    public java.lang.Object getInvoiceTemplateID() {
        return invoiceTemplateID;
    }


    /**
     * Sets the invoiceTemplateID value for this Account.
     * 
     * @param invoiceTemplateID
     */
    public void setInvoiceTemplateID(java.lang.Object invoiceTemplateID) {
        this.invoiceTemplateID = invoiceTemplateID;
    }


    /**
     * Gets the invoiceEmailMessageID value for this Account.
     * 
     * @return invoiceEmailMessageID
     */
    public java.lang.Object getInvoiceEmailMessageID() {
        return invoiceEmailMessageID;
    }


    /**
     * Sets the invoiceEmailMessageID value for this Account.
     * 
     * @param invoiceEmailMessageID
     */
    public void setInvoiceEmailMessageID(java.lang.Object invoiceEmailMessageID) {
        this.invoiceEmailMessageID = invoiceEmailMessageID;
    }


    /**
     * Gets the currencyID value for this Account.
     * 
     * @return currencyID
     */
    public java.lang.Object getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this Account.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.lang.Object currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the billToAccountPhysicalLocationID value for this Account.
     * 
     * @return billToAccountPhysicalLocationID
     */
    public java.lang.Object getBillToAccountPhysicalLocationID() {
        return billToAccountPhysicalLocationID;
    }


    /**
     * Sets the billToAccountPhysicalLocationID value for this Account.
     * 
     * @param billToAccountPhysicalLocationID
     */
    public void setBillToAccountPhysicalLocationID(java.lang.Object billToAccountPhysicalLocationID) {
        this.billToAccountPhysicalLocationID = billToAccountPhysicalLocationID;
    }


    /**
     * Gets the surveyAccountRating value for this Account.
     * 
     * @return surveyAccountRating
     */
    public java.lang.Object getSurveyAccountRating() {
        return surveyAccountRating;
    }


    /**
     * Sets the surveyAccountRating value for this Account.
     * 
     * @param surveyAccountRating
     */
    public void setSurveyAccountRating(java.lang.Object surveyAccountRating) {
        this.surveyAccountRating = surveyAccountRating;
    }


    /**
     * Gets the createdByResourceID value for this Account.
     * 
     * @return createdByResourceID
     */
    public java.lang.Object getCreatedByResourceID() {
        return createdByResourceID;
    }


    /**
     * Sets the createdByResourceID value for this Account.
     * 
     * @param createdByResourceID
     */
    public void setCreatedByResourceID(java.lang.Object createdByResourceID) {
        this.createdByResourceID = createdByResourceID;
    }


    /**
     * Gets the apiVendorID value for this Account.
     * 
     * @return apiVendorID
     */
    public java.lang.Object getApiVendorID() {
        return apiVendorID;
    }


    /**
     * Sets the apiVendorID value for this Account.
     * 
     * @param apiVendorID
     */
    public void setApiVendorID(java.lang.Object apiVendorID) {
        this.apiVendorID = apiVendorID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.alternatePhone1==null && other.getAlternatePhone1()==null) || 
             (this.alternatePhone1!=null &&
              this.alternatePhone1.equals(other.getAlternatePhone1()))) &&
            ((this.alternatePhone2==null && other.getAlternatePhone2()==null) || 
             (this.alternatePhone2!=null &&
              this.alternatePhone2.equals(other.getAlternatePhone2()))) &&
            ((this.assetValue==null && other.getAssetValue()==null) || 
             (this.assetValue!=null &&
              this.assetValue.equals(other.getAssetValue()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.competitorID==null && other.getCompetitorID()==null) || 
             (this.competitorID!=null &&
              this.competitorID.equals(other.getCompetitorID()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.keyAccountIcon==null && other.getKeyAccountIcon()==null) || 
             (this.keyAccountIcon!=null &&
              this.keyAccountIcon.equals(other.getKeyAccountIcon()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
            ((this.marketSegmentID==null && other.getMarketSegmentID()==null) || 
             (this.marketSegmentID!=null &&
              this.marketSegmentID.equals(other.getMarketSegmentID()))) &&
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.ownerResourceID==null && other.getOwnerResourceID()==null) || 
             (this.ownerResourceID!=null &&
              this.ownerResourceID.equals(other.getOwnerResourceID()))) &&
            ((this.parentAccountID==null && other.getParentAccountID()==null) || 
             (this.parentAccountID!=null &&
              this.parentAccountID.equals(other.getParentAccountID()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.SICCode==null && other.getSICCode()==null) || 
             (this.SICCode!=null &&
              this.SICCode.equals(other.getSICCode()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stockMarket==null && other.getStockMarket()==null) || 
             (this.stockMarket!=null &&
              this.stockMarket.equals(other.getStockMarket()))) &&
            ((this.stockSymbol==null && other.getStockSymbol()==null) || 
             (this.stockSymbol!=null &&
              this.stockSymbol.equals(other.getStockSymbol()))) &&
            ((this.territoryID==null && other.getTerritoryID()==null) || 
             (this.territoryID!=null &&
              this.territoryID.equals(other.getTerritoryID()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.webAddress==null && other.getWebAddress()==null) || 
             (this.webAddress!=null &&
              this.webAddress.equals(other.getWebAddress()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.clientPortalActive==null && other.getClientPortalActive()==null) || 
             (this.clientPortalActive!=null &&
              this.clientPortalActive.equals(other.getClientPortalActive()))) &&
            ((this.taskFireActive==null && other.getTaskFireActive()==null) || 
             (this.taskFireActive!=null &&
              this.taskFireActive.equals(other.getTaskFireActive()))) &&
            ((this.taxExempt==null && other.getTaxExempt()==null) || 
             (this.taxExempt!=null &&
              this.taxExempt.equals(other.getTaxExempt()))) &&
            ((this.taxRegionID==null && other.getTaxRegionID()==null) || 
             (this.taxRegionID!=null &&
              this.taxRegionID.equals(other.getTaxRegionID()))) &&
            ((this.taxID==null && other.getTaxID()==null) || 
             (this.taxID!=null &&
              this.taxID.equals(other.getTaxID()))) &&
            ((this.additionalAddressInformation==null && other.getAdditionalAddressInformation()==null) || 
             (this.additionalAddressInformation!=null &&
              this.additionalAddressInformation.equals(other.getAdditionalAddressInformation()))) &&
            ((this.countryID==null && other.getCountryID()==null) || 
             (this.countryID!=null &&
              this.countryID.equals(other.getCountryID()))) &&
            ((this.billToAddressToUse==null && other.getBillToAddressToUse()==null) || 
             (this.billToAddressToUse!=null &&
              this.billToAddressToUse.equals(other.getBillToAddressToUse()))) &&
            ((this.billToAttention==null && other.getBillToAttention()==null) || 
             (this.billToAttention!=null &&
              this.billToAttention.equals(other.getBillToAttention()))) &&
            ((this.billToAddress1==null && other.getBillToAddress1()==null) || 
             (this.billToAddress1!=null &&
              this.billToAddress1.equals(other.getBillToAddress1()))) &&
            ((this.billToAddress2==null && other.getBillToAddress2()==null) || 
             (this.billToAddress2!=null &&
              this.billToAddress2.equals(other.getBillToAddress2()))) &&
            ((this.billToCity==null && other.getBillToCity()==null) || 
             (this.billToCity!=null &&
              this.billToCity.equals(other.getBillToCity()))) &&
            ((this.billToState==null && other.getBillToState()==null) || 
             (this.billToState!=null &&
              this.billToState.equals(other.getBillToState()))) &&
            ((this.billToZipCode==null && other.getBillToZipCode()==null) || 
             (this.billToZipCode!=null &&
              this.billToZipCode.equals(other.getBillToZipCode()))) &&
            ((this.billToCountryID==null && other.getBillToCountryID()==null) || 
             (this.billToCountryID!=null &&
              this.billToCountryID.equals(other.getBillToCountryID()))) &&
            ((this.billToAdditionalAddressInformation==null && other.getBillToAdditionalAddressInformation()==null) || 
             (this.billToAdditionalAddressInformation!=null &&
              this.billToAdditionalAddressInformation.equals(other.getBillToAdditionalAddressInformation()))) &&
            ((this.invoiceMethod==null && other.getInvoiceMethod()==null) || 
             (this.invoiceMethod!=null &&
              this.invoiceMethod.equals(other.getInvoiceMethod()))) &&
            ((this.invoiceNonContractItemsToParentAccount==null && other.getInvoiceNonContractItemsToParentAccount()==null) || 
             (this.invoiceNonContractItemsToParentAccount!=null &&
              this.invoiceNonContractItemsToParentAccount.equals(other.getInvoiceNonContractItemsToParentAccount()))) &&
            ((this.quoteTemplateID==null && other.getQuoteTemplateID()==null) || 
             (this.quoteTemplateID!=null &&
              this.quoteTemplateID.equals(other.getQuoteTemplateID()))) &&
            ((this.quoteEmailMessageID==null && other.getQuoteEmailMessageID()==null) || 
             (this.quoteEmailMessageID!=null &&
              this.quoteEmailMessageID.equals(other.getQuoteEmailMessageID()))) &&
            ((this.invoiceTemplateID==null && other.getInvoiceTemplateID()==null) || 
             (this.invoiceTemplateID!=null &&
              this.invoiceTemplateID.equals(other.getInvoiceTemplateID()))) &&
            ((this.invoiceEmailMessageID==null && other.getInvoiceEmailMessageID()==null) || 
             (this.invoiceEmailMessageID!=null &&
              this.invoiceEmailMessageID.equals(other.getInvoiceEmailMessageID()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.billToAccountPhysicalLocationID==null && other.getBillToAccountPhysicalLocationID()==null) || 
             (this.billToAccountPhysicalLocationID!=null &&
              this.billToAccountPhysicalLocationID.equals(other.getBillToAccountPhysicalLocationID()))) &&
            ((this.surveyAccountRating==null && other.getSurveyAccountRating()==null) || 
             (this.surveyAccountRating!=null &&
              this.surveyAccountRating.equals(other.getSurveyAccountRating()))) &&
            ((this.createdByResourceID==null && other.getCreatedByResourceID()==null) || 
             (this.createdByResourceID!=null &&
              this.createdByResourceID.equals(other.getCreatedByResourceID()))) &&
            ((this.apiVendorID==null && other.getApiVendorID()==null) || 
             (this.apiVendorID!=null &&
              this.apiVendorID.equals(other.getApiVendorID())));
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
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getAlternatePhone1() != null) {
            _hashCode += getAlternatePhone1().hashCode();
        }
        if (getAlternatePhone2() != null) {
            _hashCode += getAlternatePhone2().hashCode();
        }
        if (getAssetValue() != null) {
            _hashCode += getAssetValue().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCompetitorID() != null) {
            _hashCode += getCompetitorID().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getKeyAccountIcon() != null) {
            _hashCode += getKeyAccountIcon().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
        }
        if (getMarketSegmentID() != null) {
            _hashCode += getMarketSegmentID().hashCode();
        }
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getOwnerResourceID() != null) {
            _hashCode += getOwnerResourceID().hashCode();
        }
        if (getParentAccountID() != null) {
            _hashCode += getParentAccountID().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getSICCode() != null) {
            _hashCode += getSICCode().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStockMarket() != null) {
            _hashCode += getStockMarket().hashCode();
        }
        if (getStockSymbol() != null) {
            _hashCode += getStockSymbol().hashCode();
        }
        if (getTerritoryID() != null) {
            _hashCode += getTerritoryID().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getWebAddress() != null) {
            _hashCode += getWebAddress().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getClientPortalActive() != null) {
            _hashCode += getClientPortalActive().hashCode();
        }
        if (getTaskFireActive() != null) {
            _hashCode += getTaskFireActive().hashCode();
        }
        if (getTaxExempt() != null) {
            _hashCode += getTaxExempt().hashCode();
        }
        if (getTaxRegionID() != null) {
            _hashCode += getTaxRegionID().hashCode();
        }
        if (getTaxID() != null) {
            _hashCode += getTaxID().hashCode();
        }
        if (getAdditionalAddressInformation() != null) {
            _hashCode += getAdditionalAddressInformation().hashCode();
        }
        if (getCountryID() != null) {
            _hashCode += getCountryID().hashCode();
        }
        if (getBillToAddressToUse() != null) {
            _hashCode += getBillToAddressToUse().hashCode();
        }
        if (getBillToAttention() != null) {
            _hashCode += getBillToAttention().hashCode();
        }
        if (getBillToAddress1() != null) {
            _hashCode += getBillToAddress1().hashCode();
        }
        if (getBillToAddress2() != null) {
            _hashCode += getBillToAddress2().hashCode();
        }
        if (getBillToCity() != null) {
            _hashCode += getBillToCity().hashCode();
        }
        if (getBillToState() != null) {
            _hashCode += getBillToState().hashCode();
        }
        if (getBillToZipCode() != null) {
            _hashCode += getBillToZipCode().hashCode();
        }
        if (getBillToCountryID() != null) {
            _hashCode += getBillToCountryID().hashCode();
        }
        if (getBillToAdditionalAddressInformation() != null) {
            _hashCode += getBillToAdditionalAddressInformation().hashCode();
        }
        if (getInvoiceMethod() != null) {
            _hashCode += getInvoiceMethod().hashCode();
        }
        if (getInvoiceNonContractItemsToParentAccount() != null) {
            _hashCode += getInvoiceNonContractItemsToParentAccount().hashCode();
        }
        if (getQuoteTemplateID() != null) {
            _hashCode += getQuoteTemplateID().hashCode();
        }
        if (getQuoteEmailMessageID() != null) {
            _hashCode += getQuoteEmailMessageID().hashCode();
        }
        if (getInvoiceTemplateID() != null) {
            _hashCode += getInvoiceTemplateID().hashCode();
        }
        if (getInvoiceEmailMessageID() != null) {
            _hashCode += getInvoiceEmailMessageID().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getBillToAccountPhysicalLocationID() != null) {
            _hashCode += getBillToAccountPhysicalLocationID().hashCode();
        }
        if (getSurveyAccountRating() != null) {
            _hashCode += getSurveyAccountRating().hashCode();
        }
        if (getCreatedByResourceID() != null) {
            _hashCode += getCreatedByResourceID().hashCode();
        }
        if (getApiVendorID() != null) {
            _hashCode += getApiVendorID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Account.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternatePhone1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AlternatePhone1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternatePhone2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AlternatePhone2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AssetValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competitorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompetitorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyAccountIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "KeyAccountIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketSegmentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MarketSegmentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OwnerResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ParentAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SICCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SICCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockMarket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "StockMarket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockSymbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "StockSymbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TerritoryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WebAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientPortalActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ClientPortalActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskFireActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaskFireActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExempt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaxExempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaxRegionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaxID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalAddressInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdditionalAddressInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CountryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToAddressToUse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToAddressToUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToAttention");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToAttention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToCountryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToCountryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToAdditionalAddressInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToAdditionalAddressInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNonContractItemsToParentAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceNonContractItemsToParentAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteTemplateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuoteTemplateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteEmailMessageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuoteEmailMessageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceTemplateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceTemplateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceEmailMessageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceEmailMessageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToAccountPhysicalLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToAccountPhysicalLocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyAccountRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SurveyAccountRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdByResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreatedByResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVendorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ApiVendorID"));
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
