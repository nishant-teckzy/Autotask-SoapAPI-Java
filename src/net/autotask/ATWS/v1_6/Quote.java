/**
 * Quote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Quote  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object accountID;

    private java.lang.Object billToLocationID;

    private java.lang.Object comment;

    private java.lang.Object contactID;

    private java.lang.Object createDate;

    private java.lang.Object creatorResourceID;

    private java.lang.Object description;

    private java.lang.Object effectiveDate;

    private java.lang.Object eQuoteActive;

    private java.lang.Object expirationDate;

    private java.lang.Object externalQuoteNumber;

    private java.lang.Object groupByID;

    private java.lang.Object lastActivityDate;

    private java.lang.Object lastModifiedBy;

    private java.lang.Object name;

    private java.lang.Object opportunityID;

    private java.lang.Object paymentTerm;

    private java.lang.Object paymentType;

    private java.lang.Object primaryQuote;

    private java.lang.Object proposalProjectID;

    private java.lang.Object purchaseOrderNumber;

    private java.lang.Object quoteTemplateID;

    private java.lang.Object shippingType;

    private java.lang.Object shipToLocationID;

    private java.lang.Object soldToLocationID;

    private java.lang.Object taxGroup;

    private java.lang.Object quoteNumber;

    private java.lang.Object showEachTaxInGroup;

    private java.lang.Object showTaxCategory;

    private java.lang.Object calculateTaxSeparately;

    private java.lang.Object groupByProductCategory;

    public Quote() {
    }

    public Quote(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountID,
           java.lang.Object billToLocationID,
           java.lang.Object comment,
           java.lang.Object contactID,
           java.lang.Object createDate,
           java.lang.Object creatorResourceID,
           java.lang.Object description,
           java.lang.Object effectiveDate,
           java.lang.Object eQuoteActive,
           java.lang.Object expirationDate,
           java.lang.Object externalQuoteNumber,
           java.lang.Object groupByID,
           java.lang.Object lastActivityDate,
           java.lang.Object lastModifiedBy,
           java.lang.Object name,
           java.lang.Object opportunityID,
           java.lang.Object paymentTerm,
           java.lang.Object paymentType,
           java.lang.Object primaryQuote,
           java.lang.Object proposalProjectID,
           java.lang.Object purchaseOrderNumber,
           java.lang.Object quoteTemplateID,
           java.lang.Object shippingType,
           java.lang.Object shipToLocationID,
           java.lang.Object soldToLocationID,
           java.lang.Object taxGroup,
           java.lang.Object quoteNumber,
           java.lang.Object showEachTaxInGroup,
           java.lang.Object showTaxCategory,
           java.lang.Object calculateTaxSeparately,
           java.lang.Object groupByProductCategory) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountID = accountID;
        this.billToLocationID = billToLocationID;
        this.comment = comment;
        this.contactID = contactID;
        this.createDate = createDate;
        this.creatorResourceID = creatorResourceID;
        this.description = description;
        this.effectiveDate = effectiveDate;
        this.eQuoteActive = eQuoteActive;
        this.expirationDate = expirationDate;
        this.externalQuoteNumber = externalQuoteNumber;
        this.groupByID = groupByID;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.name = name;
        this.opportunityID = opportunityID;
        this.paymentTerm = paymentTerm;
        this.paymentType = paymentType;
        this.primaryQuote = primaryQuote;
        this.proposalProjectID = proposalProjectID;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.quoteTemplateID = quoteTemplateID;
        this.shippingType = shippingType;
        this.shipToLocationID = shipToLocationID;
        this.soldToLocationID = soldToLocationID;
        this.taxGroup = taxGroup;
        this.quoteNumber = quoteNumber;
        this.showEachTaxInGroup = showEachTaxInGroup;
        this.showTaxCategory = showTaxCategory;
        this.calculateTaxSeparately = calculateTaxSeparately;
        this.groupByProductCategory = groupByProductCategory;
    }


    /**
     * Gets the accountID value for this Quote.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this Quote.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the billToLocationID value for this Quote.
     * 
     * @return billToLocationID
     */
    public java.lang.Object getBillToLocationID() {
        return billToLocationID;
    }


    /**
     * Sets the billToLocationID value for this Quote.
     * 
     * @param billToLocationID
     */
    public void setBillToLocationID(java.lang.Object billToLocationID) {
        this.billToLocationID = billToLocationID;
    }


    /**
     * Gets the comment value for this Quote.
     * 
     * @return comment
     */
    public java.lang.Object getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Quote.
     * 
     * @param comment
     */
    public void setComment(java.lang.Object comment) {
        this.comment = comment;
    }


    /**
     * Gets the contactID value for this Quote.
     * 
     * @return contactID
     */
    public java.lang.Object getContactID() {
        return contactID;
    }


    /**
     * Sets the contactID value for this Quote.
     * 
     * @param contactID
     */
    public void setContactID(java.lang.Object contactID) {
        this.contactID = contactID;
    }


    /**
     * Gets the createDate value for this Quote.
     * 
     * @return createDate
     */
    public java.lang.Object getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this Quote.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.Object createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the creatorResourceID value for this Quote.
     * 
     * @return creatorResourceID
     */
    public java.lang.Object getCreatorResourceID() {
        return creatorResourceID;
    }


    /**
     * Sets the creatorResourceID value for this Quote.
     * 
     * @param creatorResourceID
     */
    public void setCreatorResourceID(java.lang.Object creatorResourceID) {
        this.creatorResourceID = creatorResourceID;
    }


    /**
     * Gets the description value for this Quote.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Quote.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the effectiveDate value for this Quote.
     * 
     * @return effectiveDate
     */
    public java.lang.Object getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this Quote.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.Object effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the eQuoteActive value for this Quote.
     * 
     * @return eQuoteActive
     */
    public java.lang.Object getEQuoteActive() {
        return eQuoteActive;
    }


    /**
     * Sets the eQuoteActive value for this Quote.
     * 
     * @param eQuoteActive
     */
    public void setEQuoteActive(java.lang.Object eQuoteActive) {
        this.eQuoteActive = eQuoteActive;
    }


    /**
     * Gets the expirationDate value for this Quote.
     * 
     * @return expirationDate
     */
    public java.lang.Object getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this Quote.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.Object expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the externalQuoteNumber value for this Quote.
     * 
     * @return externalQuoteNumber
     */
    public java.lang.Object getExternalQuoteNumber() {
        return externalQuoteNumber;
    }


    /**
     * Sets the externalQuoteNumber value for this Quote.
     * 
     * @param externalQuoteNumber
     */
    public void setExternalQuoteNumber(java.lang.Object externalQuoteNumber) {
        this.externalQuoteNumber = externalQuoteNumber;
    }


    /**
     * Gets the groupByID value for this Quote.
     * 
     * @return groupByID
     */
    public java.lang.Object getGroupByID() {
        return groupByID;
    }


    /**
     * Sets the groupByID value for this Quote.
     * 
     * @param groupByID
     */
    public void setGroupByID(java.lang.Object groupByID) {
        this.groupByID = groupByID;
    }


    /**
     * Gets the lastActivityDate value for this Quote.
     * 
     * @return lastActivityDate
     */
    public java.lang.Object getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Quote.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.lang.Object lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Quote.
     * 
     * @return lastModifiedBy
     */
    public java.lang.Object getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Quote.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(java.lang.Object lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the name value for this Quote.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this Quote.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the opportunityID value for this Quote.
     * 
     * @return opportunityID
     */
    public java.lang.Object getOpportunityID() {
        return opportunityID;
    }


    /**
     * Sets the opportunityID value for this Quote.
     * 
     * @param opportunityID
     */
    public void setOpportunityID(java.lang.Object opportunityID) {
        this.opportunityID = opportunityID;
    }


    /**
     * Gets the paymentTerm value for this Quote.
     * 
     * @return paymentTerm
     */
    public java.lang.Object getPaymentTerm() {
        return paymentTerm;
    }


    /**
     * Sets the paymentTerm value for this Quote.
     * 
     * @param paymentTerm
     */
    public void setPaymentTerm(java.lang.Object paymentTerm) {
        this.paymentTerm = paymentTerm;
    }


    /**
     * Gets the paymentType value for this Quote.
     * 
     * @return paymentType
     */
    public java.lang.Object getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this Quote.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.Object paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the primaryQuote value for this Quote.
     * 
     * @return primaryQuote
     */
    public java.lang.Object getPrimaryQuote() {
        return primaryQuote;
    }


    /**
     * Sets the primaryQuote value for this Quote.
     * 
     * @param primaryQuote
     */
    public void setPrimaryQuote(java.lang.Object primaryQuote) {
        this.primaryQuote = primaryQuote;
    }


    /**
     * Gets the proposalProjectID value for this Quote.
     * 
     * @return proposalProjectID
     */
    public java.lang.Object getProposalProjectID() {
        return proposalProjectID;
    }


    /**
     * Sets the proposalProjectID value for this Quote.
     * 
     * @param proposalProjectID
     */
    public void setProposalProjectID(java.lang.Object proposalProjectID) {
        this.proposalProjectID = proposalProjectID;
    }


    /**
     * Gets the purchaseOrderNumber value for this Quote.
     * 
     * @return purchaseOrderNumber
     */
    public java.lang.Object getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }


    /**
     * Sets the purchaseOrderNumber value for this Quote.
     * 
     * @param purchaseOrderNumber
     */
    public void setPurchaseOrderNumber(java.lang.Object purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }


    /**
     * Gets the quoteTemplateID value for this Quote.
     * 
     * @return quoteTemplateID
     */
    public java.lang.Object getQuoteTemplateID() {
        return quoteTemplateID;
    }


    /**
     * Sets the quoteTemplateID value for this Quote.
     * 
     * @param quoteTemplateID
     */
    public void setQuoteTemplateID(java.lang.Object quoteTemplateID) {
        this.quoteTemplateID = quoteTemplateID;
    }


    /**
     * Gets the shippingType value for this Quote.
     * 
     * @return shippingType
     */
    public java.lang.Object getShippingType() {
        return shippingType;
    }


    /**
     * Sets the shippingType value for this Quote.
     * 
     * @param shippingType
     */
    public void setShippingType(java.lang.Object shippingType) {
        this.shippingType = shippingType;
    }


    /**
     * Gets the shipToLocationID value for this Quote.
     * 
     * @return shipToLocationID
     */
    public java.lang.Object getShipToLocationID() {
        return shipToLocationID;
    }


    /**
     * Sets the shipToLocationID value for this Quote.
     * 
     * @param shipToLocationID
     */
    public void setShipToLocationID(java.lang.Object shipToLocationID) {
        this.shipToLocationID = shipToLocationID;
    }


    /**
     * Gets the soldToLocationID value for this Quote.
     * 
     * @return soldToLocationID
     */
    public java.lang.Object getSoldToLocationID() {
        return soldToLocationID;
    }


    /**
     * Sets the soldToLocationID value for this Quote.
     * 
     * @param soldToLocationID
     */
    public void setSoldToLocationID(java.lang.Object soldToLocationID) {
        this.soldToLocationID = soldToLocationID;
    }


    /**
     * Gets the taxGroup value for this Quote.
     * 
     * @return taxGroup
     */
    public java.lang.Object getTaxGroup() {
        return taxGroup;
    }


    /**
     * Sets the taxGroup value for this Quote.
     * 
     * @param taxGroup
     */
    public void setTaxGroup(java.lang.Object taxGroup) {
        this.taxGroup = taxGroup;
    }


    /**
     * Gets the quoteNumber value for this Quote.
     * 
     * @return quoteNumber
     */
    public java.lang.Object getQuoteNumber() {
        return quoteNumber;
    }


    /**
     * Sets the quoteNumber value for this Quote.
     * 
     * @param quoteNumber
     */
    public void setQuoteNumber(java.lang.Object quoteNumber) {
        this.quoteNumber = quoteNumber;
    }


    /**
     * Gets the showEachTaxInGroup value for this Quote.
     * 
     * @return showEachTaxInGroup
     */
    public java.lang.Object getShowEachTaxInGroup() {
        return showEachTaxInGroup;
    }


    /**
     * Sets the showEachTaxInGroup value for this Quote.
     * 
     * @param showEachTaxInGroup
     */
    public void setShowEachTaxInGroup(java.lang.Object showEachTaxInGroup) {
        this.showEachTaxInGroup = showEachTaxInGroup;
    }


    /**
     * Gets the showTaxCategory value for this Quote.
     * 
     * @return showTaxCategory
     */
    public java.lang.Object getShowTaxCategory() {
        return showTaxCategory;
    }


    /**
     * Sets the showTaxCategory value for this Quote.
     * 
     * @param showTaxCategory
     */
    public void setShowTaxCategory(java.lang.Object showTaxCategory) {
        this.showTaxCategory = showTaxCategory;
    }


    /**
     * Gets the calculateTaxSeparately value for this Quote.
     * 
     * @return calculateTaxSeparately
     */
    public java.lang.Object getCalculateTaxSeparately() {
        return calculateTaxSeparately;
    }


    /**
     * Sets the calculateTaxSeparately value for this Quote.
     * 
     * @param calculateTaxSeparately
     */
    public void setCalculateTaxSeparately(java.lang.Object calculateTaxSeparately) {
        this.calculateTaxSeparately = calculateTaxSeparately;
    }


    /**
     * Gets the groupByProductCategory value for this Quote.
     * 
     * @return groupByProductCategory
     */
    public java.lang.Object getGroupByProductCategory() {
        return groupByProductCategory;
    }


    /**
     * Sets the groupByProductCategory value for this Quote.
     * 
     * @param groupByProductCategory
     */
    public void setGroupByProductCategory(java.lang.Object groupByProductCategory) {
        this.groupByProductCategory = groupByProductCategory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Quote)) return false;
        Quote other = (Quote) obj;
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
            ((this.billToLocationID==null && other.getBillToLocationID()==null) || 
             (this.billToLocationID!=null &&
              this.billToLocationID.equals(other.getBillToLocationID()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.contactID==null && other.getContactID()==null) || 
             (this.contactID!=null &&
              this.contactID.equals(other.getContactID()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.creatorResourceID==null && other.getCreatorResourceID()==null) || 
             (this.creatorResourceID!=null &&
              this.creatorResourceID.equals(other.getCreatorResourceID()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.eQuoteActive==null && other.getEQuoteActive()==null) || 
             (this.eQuoteActive!=null &&
              this.eQuoteActive.equals(other.getEQuoteActive()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.externalQuoteNumber==null && other.getExternalQuoteNumber()==null) || 
             (this.externalQuoteNumber!=null &&
              this.externalQuoteNumber.equals(other.getExternalQuoteNumber()))) &&
            ((this.groupByID==null && other.getGroupByID()==null) || 
             (this.groupByID!=null &&
              this.groupByID.equals(other.getGroupByID()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.opportunityID==null && other.getOpportunityID()==null) || 
             (this.opportunityID!=null &&
              this.opportunityID.equals(other.getOpportunityID()))) &&
            ((this.paymentTerm==null && other.getPaymentTerm()==null) || 
             (this.paymentTerm!=null &&
              this.paymentTerm.equals(other.getPaymentTerm()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.primaryQuote==null && other.getPrimaryQuote()==null) || 
             (this.primaryQuote!=null &&
              this.primaryQuote.equals(other.getPrimaryQuote()))) &&
            ((this.proposalProjectID==null && other.getProposalProjectID()==null) || 
             (this.proposalProjectID!=null &&
              this.proposalProjectID.equals(other.getProposalProjectID()))) &&
            ((this.purchaseOrderNumber==null && other.getPurchaseOrderNumber()==null) || 
             (this.purchaseOrderNumber!=null &&
              this.purchaseOrderNumber.equals(other.getPurchaseOrderNumber()))) &&
            ((this.quoteTemplateID==null && other.getQuoteTemplateID()==null) || 
             (this.quoteTemplateID!=null &&
              this.quoteTemplateID.equals(other.getQuoteTemplateID()))) &&
            ((this.shippingType==null && other.getShippingType()==null) || 
             (this.shippingType!=null &&
              this.shippingType.equals(other.getShippingType()))) &&
            ((this.shipToLocationID==null && other.getShipToLocationID()==null) || 
             (this.shipToLocationID!=null &&
              this.shipToLocationID.equals(other.getShipToLocationID()))) &&
            ((this.soldToLocationID==null && other.getSoldToLocationID()==null) || 
             (this.soldToLocationID!=null &&
              this.soldToLocationID.equals(other.getSoldToLocationID()))) &&
            ((this.taxGroup==null && other.getTaxGroup()==null) || 
             (this.taxGroup!=null &&
              this.taxGroup.equals(other.getTaxGroup()))) &&
            ((this.quoteNumber==null && other.getQuoteNumber()==null) || 
             (this.quoteNumber!=null &&
              this.quoteNumber.equals(other.getQuoteNumber()))) &&
            ((this.showEachTaxInGroup==null && other.getShowEachTaxInGroup()==null) || 
             (this.showEachTaxInGroup!=null &&
              this.showEachTaxInGroup.equals(other.getShowEachTaxInGroup()))) &&
            ((this.showTaxCategory==null && other.getShowTaxCategory()==null) || 
             (this.showTaxCategory!=null &&
              this.showTaxCategory.equals(other.getShowTaxCategory()))) &&
            ((this.calculateTaxSeparately==null && other.getCalculateTaxSeparately()==null) || 
             (this.calculateTaxSeparately!=null &&
              this.calculateTaxSeparately.equals(other.getCalculateTaxSeparately()))) &&
            ((this.groupByProductCategory==null && other.getGroupByProductCategory()==null) || 
             (this.groupByProductCategory!=null &&
              this.groupByProductCategory.equals(other.getGroupByProductCategory())));
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
        if (getBillToLocationID() != null) {
            _hashCode += getBillToLocationID().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getContactID() != null) {
            _hashCode += getContactID().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getCreatorResourceID() != null) {
            _hashCode += getCreatorResourceID().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getEQuoteActive() != null) {
            _hashCode += getEQuoteActive().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getExternalQuoteNumber() != null) {
            _hashCode += getExternalQuoteNumber().hashCode();
        }
        if (getGroupByID() != null) {
            _hashCode += getGroupByID().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
        }
        if (getLastModifiedBy() != null) {
            _hashCode += getLastModifiedBy().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOpportunityID() != null) {
            _hashCode += getOpportunityID().hashCode();
        }
        if (getPaymentTerm() != null) {
            _hashCode += getPaymentTerm().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getPrimaryQuote() != null) {
            _hashCode += getPrimaryQuote().hashCode();
        }
        if (getProposalProjectID() != null) {
            _hashCode += getProposalProjectID().hashCode();
        }
        if (getPurchaseOrderNumber() != null) {
            _hashCode += getPurchaseOrderNumber().hashCode();
        }
        if (getQuoteTemplateID() != null) {
            _hashCode += getQuoteTemplateID().hashCode();
        }
        if (getShippingType() != null) {
            _hashCode += getShippingType().hashCode();
        }
        if (getShipToLocationID() != null) {
            _hashCode += getShipToLocationID().hashCode();
        }
        if (getSoldToLocationID() != null) {
            _hashCode += getSoldToLocationID().hashCode();
        }
        if (getTaxGroup() != null) {
            _hashCode += getTaxGroup().hashCode();
        }
        if (getQuoteNumber() != null) {
            _hashCode += getQuoteNumber().hashCode();
        }
        if (getShowEachTaxInGroup() != null) {
            _hashCode += getShowEachTaxInGroup().hashCode();
        }
        if (getShowTaxCategory() != null) {
            _hashCode += getShowTaxCategory().hashCode();
        }
        if (getCalculateTaxSeparately() != null) {
            _hashCode += getCalculateTaxSeparately().hashCode();
        }
        if (getGroupByProductCategory() != null) {
            _hashCode += getGroupByProductCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Quote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Quote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToLocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Comment"));
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
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreatorResourceID"));
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
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EQuoteActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "eQuoteActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalQuoteNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExternalQuoteNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupByID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "GroupByID"));
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
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
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
        elemField.setFieldName("paymentTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PaymentTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryQuote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PrimaryQuote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalProjectID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProposalProjectID"));
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
        elemField.setFieldName("quoteTemplateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuoteTemplateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShippingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShipToLocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldToLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SoldToLocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaxGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuoteNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showEachTaxInGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShowEachTaxInGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showTaxCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShowTaxCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculateTaxSeparately");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CalculateTaxSeparately"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupByProductCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "GroupByProductCategory"));
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
