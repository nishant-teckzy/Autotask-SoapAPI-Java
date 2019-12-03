/**
 * PurchaseOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class PurchaseOrder  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object vendorID;

    private java.lang.Object status;

    private java.lang.Object creatorResourceID;

    private java.lang.Object createDateTime;

    private java.lang.Object submitDateTime;

    private java.lang.Object cancelDateTime;

    private java.lang.Object shipToName;

    private java.lang.Object shipToAddress1;

    private java.lang.Object shipToAddress2;

    private java.lang.Object shipToCity;

    private java.lang.Object shipToState;

    private java.lang.Object shipToPostalCode;

    private java.lang.Object generalMemo;

    private java.lang.Object phone;

    private java.lang.Object fax;

    private java.lang.Object vendorInvoiceNumber;

    private java.lang.Object externalPONumber;

    private java.lang.Object purchaseForAccountID;

    private java.lang.Object shippingType;

    private java.lang.Object shippingDate;

    private java.lang.Object freight;

    private java.lang.Object taxGroup;

    private java.lang.Object paymentTerm;

    private java.lang.Object showTaxCategory;

    private java.lang.Object showEachTaxInGroup;

    private java.lang.Object latestEstimatedArrivalDate;

    private java.lang.Object useItemDescriptionsFrom;

    private java.lang.Object internalCurrencyFreight;

    public PurchaseOrder() {
    }

    public PurchaseOrder(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object vendorID,
           java.lang.Object status,
           java.lang.Object creatorResourceID,
           java.lang.Object createDateTime,
           java.lang.Object submitDateTime,
           java.lang.Object cancelDateTime,
           java.lang.Object shipToName,
           java.lang.Object shipToAddress1,
           java.lang.Object shipToAddress2,
           java.lang.Object shipToCity,
           java.lang.Object shipToState,
           java.lang.Object shipToPostalCode,
           java.lang.Object generalMemo,
           java.lang.Object phone,
           java.lang.Object fax,
           java.lang.Object vendorInvoiceNumber,
           java.lang.Object externalPONumber,
           java.lang.Object purchaseForAccountID,
           java.lang.Object shippingType,
           java.lang.Object shippingDate,
           java.lang.Object freight,
           java.lang.Object taxGroup,
           java.lang.Object paymentTerm,
           java.lang.Object showTaxCategory,
           java.lang.Object showEachTaxInGroup,
           java.lang.Object latestEstimatedArrivalDate,
           java.lang.Object useItemDescriptionsFrom,
           java.lang.Object internalCurrencyFreight) {
        super(
            fields,
            id,
            userDefinedFields);
        this.vendorID = vendorID;
        this.status = status;
        this.creatorResourceID = creatorResourceID;
        this.createDateTime = createDateTime;
        this.submitDateTime = submitDateTime;
        this.cancelDateTime = cancelDateTime;
        this.shipToName = shipToName;
        this.shipToAddress1 = shipToAddress1;
        this.shipToAddress2 = shipToAddress2;
        this.shipToCity = shipToCity;
        this.shipToState = shipToState;
        this.shipToPostalCode = shipToPostalCode;
        this.generalMemo = generalMemo;
        this.phone = phone;
        this.fax = fax;
        this.vendorInvoiceNumber = vendorInvoiceNumber;
        this.externalPONumber = externalPONumber;
        this.purchaseForAccountID = purchaseForAccountID;
        this.shippingType = shippingType;
        this.shippingDate = shippingDate;
        this.freight = freight;
        this.taxGroup = taxGroup;
        this.paymentTerm = paymentTerm;
        this.showTaxCategory = showTaxCategory;
        this.showEachTaxInGroup = showEachTaxInGroup;
        this.latestEstimatedArrivalDate = latestEstimatedArrivalDate;
        this.useItemDescriptionsFrom = useItemDescriptionsFrom;
        this.internalCurrencyFreight = internalCurrencyFreight;
    }


    /**
     * Gets the vendorID value for this PurchaseOrder.
     * 
     * @return vendorID
     */
    public java.lang.Object getVendorID() {
        return vendorID;
    }


    /**
     * Sets the vendorID value for this PurchaseOrder.
     * 
     * @param vendorID
     */
    public void setVendorID(java.lang.Object vendorID) {
        this.vendorID = vendorID;
    }


    /**
     * Gets the status value for this PurchaseOrder.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PurchaseOrder.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the creatorResourceID value for this PurchaseOrder.
     * 
     * @return creatorResourceID
     */
    public java.lang.Object getCreatorResourceID() {
        return creatorResourceID;
    }


    /**
     * Sets the creatorResourceID value for this PurchaseOrder.
     * 
     * @param creatorResourceID
     */
    public void setCreatorResourceID(java.lang.Object creatorResourceID) {
        this.creatorResourceID = creatorResourceID;
    }


    /**
     * Gets the createDateTime value for this PurchaseOrder.
     * 
     * @return createDateTime
     */
    public java.lang.Object getCreateDateTime() {
        return createDateTime;
    }


    /**
     * Sets the createDateTime value for this PurchaseOrder.
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(java.lang.Object createDateTime) {
        this.createDateTime = createDateTime;
    }


    /**
     * Gets the submitDateTime value for this PurchaseOrder.
     * 
     * @return submitDateTime
     */
    public java.lang.Object getSubmitDateTime() {
        return submitDateTime;
    }


    /**
     * Sets the submitDateTime value for this PurchaseOrder.
     * 
     * @param submitDateTime
     */
    public void setSubmitDateTime(java.lang.Object submitDateTime) {
        this.submitDateTime = submitDateTime;
    }


    /**
     * Gets the cancelDateTime value for this PurchaseOrder.
     * 
     * @return cancelDateTime
     */
    public java.lang.Object getCancelDateTime() {
        return cancelDateTime;
    }


    /**
     * Sets the cancelDateTime value for this PurchaseOrder.
     * 
     * @param cancelDateTime
     */
    public void setCancelDateTime(java.lang.Object cancelDateTime) {
        this.cancelDateTime = cancelDateTime;
    }


    /**
     * Gets the shipToName value for this PurchaseOrder.
     * 
     * @return shipToName
     */
    public java.lang.Object getShipToName() {
        return shipToName;
    }


    /**
     * Sets the shipToName value for this PurchaseOrder.
     * 
     * @param shipToName
     */
    public void setShipToName(java.lang.Object shipToName) {
        this.shipToName = shipToName;
    }


    /**
     * Gets the shipToAddress1 value for this PurchaseOrder.
     * 
     * @return shipToAddress1
     */
    public java.lang.Object getShipToAddress1() {
        return shipToAddress1;
    }


    /**
     * Sets the shipToAddress1 value for this PurchaseOrder.
     * 
     * @param shipToAddress1
     */
    public void setShipToAddress1(java.lang.Object shipToAddress1) {
        this.shipToAddress1 = shipToAddress1;
    }


    /**
     * Gets the shipToAddress2 value for this PurchaseOrder.
     * 
     * @return shipToAddress2
     */
    public java.lang.Object getShipToAddress2() {
        return shipToAddress2;
    }


    /**
     * Sets the shipToAddress2 value for this PurchaseOrder.
     * 
     * @param shipToAddress2
     */
    public void setShipToAddress2(java.lang.Object shipToAddress2) {
        this.shipToAddress2 = shipToAddress2;
    }


    /**
     * Gets the shipToCity value for this PurchaseOrder.
     * 
     * @return shipToCity
     */
    public java.lang.Object getShipToCity() {
        return shipToCity;
    }


    /**
     * Sets the shipToCity value for this PurchaseOrder.
     * 
     * @param shipToCity
     */
    public void setShipToCity(java.lang.Object shipToCity) {
        this.shipToCity = shipToCity;
    }


    /**
     * Gets the shipToState value for this PurchaseOrder.
     * 
     * @return shipToState
     */
    public java.lang.Object getShipToState() {
        return shipToState;
    }


    /**
     * Sets the shipToState value for this PurchaseOrder.
     * 
     * @param shipToState
     */
    public void setShipToState(java.lang.Object shipToState) {
        this.shipToState = shipToState;
    }


    /**
     * Gets the shipToPostalCode value for this PurchaseOrder.
     * 
     * @return shipToPostalCode
     */
    public java.lang.Object getShipToPostalCode() {
        return shipToPostalCode;
    }


    /**
     * Sets the shipToPostalCode value for this PurchaseOrder.
     * 
     * @param shipToPostalCode
     */
    public void setShipToPostalCode(java.lang.Object shipToPostalCode) {
        this.shipToPostalCode = shipToPostalCode;
    }


    /**
     * Gets the generalMemo value for this PurchaseOrder.
     * 
     * @return generalMemo
     */
    public java.lang.Object getGeneralMemo() {
        return generalMemo;
    }


    /**
     * Sets the generalMemo value for this PurchaseOrder.
     * 
     * @param generalMemo
     */
    public void setGeneralMemo(java.lang.Object generalMemo) {
        this.generalMemo = generalMemo;
    }


    /**
     * Gets the phone value for this PurchaseOrder.
     * 
     * @return phone
     */
    public java.lang.Object getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this PurchaseOrder.
     * 
     * @param phone
     */
    public void setPhone(java.lang.Object phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this PurchaseOrder.
     * 
     * @return fax
     */
    public java.lang.Object getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this PurchaseOrder.
     * 
     * @param fax
     */
    public void setFax(java.lang.Object fax) {
        this.fax = fax;
    }


    /**
     * Gets the vendorInvoiceNumber value for this PurchaseOrder.
     * 
     * @return vendorInvoiceNumber
     */
    public java.lang.Object getVendorInvoiceNumber() {
        return vendorInvoiceNumber;
    }


    /**
     * Sets the vendorInvoiceNumber value for this PurchaseOrder.
     * 
     * @param vendorInvoiceNumber
     */
    public void setVendorInvoiceNumber(java.lang.Object vendorInvoiceNumber) {
        this.vendorInvoiceNumber = vendorInvoiceNumber;
    }


    /**
     * Gets the externalPONumber value for this PurchaseOrder.
     * 
     * @return externalPONumber
     */
    public java.lang.Object getExternalPONumber() {
        return externalPONumber;
    }


    /**
     * Sets the externalPONumber value for this PurchaseOrder.
     * 
     * @param externalPONumber
     */
    public void setExternalPONumber(java.lang.Object externalPONumber) {
        this.externalPONumber = externalPONumber;
    }


    /**
     * Gets the purchaseForAccountID value for this PurchaseOrder.
     * 
     * @return purchaseForAccountID
     */
    public java.lang.Object getPurchaseForAccountID() {
        return purchaseForAccountID;
    }


    /**
     * Sets the purchaseForAccountID value for this PurchaseOrder.
     * 
     * @param purchaseForAccountID
     */
    public void setPurchaseForAccountID(java.lang.Object purchaseForAccountID) {
        this.purchaseForAccountID = purchaseForAccountID;
    }


    /**
     * Gets the shippingType value for this PurchaseOrder.
     * 
     * @return shippingType
     */
    public java.lang.Object getShippingType() {
        return shippingType;
    }


    /**
     * Sets the shippingType value for this PurchaseOrder.
     * 
     * @param shippingType
     */
    public void setShippingType(java.lang.Object shippingType) {
        this.shippingType = shippingType;
    }


    /**
     * Gets the shippingDate value for this PurchaseOrder.
     * 
     * @return shippingDate
     */
    public java.lang.Object getShippingDate() {
        return shippingDate;
    }


    /**
     * Sets the shippingDate value for this PurchaseOrder.
     * 
     * @param shippingDate
     */
    public void setShippingDate(java.lang.Object shippingDate) {
        this.shippingDate = shippingDate;
    }


    /**
     * Gets the freight value for this PurchaseOrder.
     * 
     * @return freight
     */
    public java.lang.Object getFreight() {
        return freight;
    }


    /**
     * Sets the freight value for this PurchaseOrder.
     * 
     * @param freight
     */
    public void setFreight(java.lang.Object freight) {
        this.freight = freight;
    }


    /**
     * Gets the taxGroup value for this PurchaseOrder.
     * 
     * @return taxGroup
     */
    public java.lang.Object getTaxGroup() {
        return taxGroup;
    }


    /**
     * Sets the taxGroup value for this PurchaseOrder.
     * 
     * @param taxGroup
     */
    public void setTaxGroup(java.lang.Object taxGroup) {
        this.taxGroup = taxGroup;
    }


    /**
     * Gets the paymentTerm value for this PurchaseOrder.
     * 
     * @return paymentTerm
     */
    public java.lang.Object getPaymentTerm() {
        return paymentTerm;
    }


    /**
     * Sets the paymentTerm value for this PurchaseOrder.
     * 
     * @param paymentTerm
     */
    public void setPaymentTerm(java.lang.Object paymentTerm) {
        this.paymentTerm = paymentTerm;
    }


    /**
     * Gets the showTaxCategory value for this PurchaseOrder.
     * 
     * @return showTaxCategory
     */
    public java.lang.Object getShowTaxCategory() {
        return showTaxCategory;
    }


    /**
     * Sets the showTaxCategory value for this PurchaseOrder.
     * 
     * @param showTaxCategory
     */
    public void setShowTaxCategory(java.lang.Object showTaxCategory) {
        this.showTaxCategory = showTaxCategory;
    }


    /**
     * Gets the showEachTaxInGroup value for this PurchaseOrder.
     * 
     * @return showEachTaxInGroup
     */
    public java.lang.Object getShowEachTaxInGroup() {
        return showEachTaxInGroup;
    }


    /**
     * Sets the showEachTaxInGroup value for this PurchaseOrder.
     * 
     * @param showEachTaxInGroup
     */
    public void setShowEachTaxInGroup(java.lang.Object showEachTaxInGroup) {
        this.showEachTaxInGroup = showEachTaxInGroup;
    }


    /**
     * Gets the latestEstimatedArrivalDate value for this PurchaseOrder.
     * 
     * @return latestEstimatedArrivalDate
     */
    public java.lang.Object getLatestEstimatedArrivalDate() {
        return latestEstimatedArrivalDate;
    }


    /**
     * Sets the latestEstimatedArrivalDate value for this PurchaseOrder.
     * 
     * @param latestEstimatedArrivalDate
     */
    public void setLatestEstimatedArrivalDate(java.lang.Object latestEstimatedArrivalDate) {
        this.latestEstimatedArrivalDate = latestEstimatedArrivalDate;
    }


    /**
     * Gets the useItemDescriptionsFrom value for this PurchaseOrder.
     * 
     * @return useItemDescriptionsFrom
     */
    public java.lang.Object getUseItemDescriptionsFrom() {
        return useItemDescriptionsFrom;
    }


    /**
     * Sets the useItemDescriptionsFrom value for this PurchaseOrder.
     * 
     * @param useItemDescriptionsFrom
     */
    public void setUseItemDescriptionsFrom(java.lang.Object useItemDescriptionsFrom) {
        this.useItemDescriptionsFrom = useItemDescriptionsFrom;
    }


    /**
     * Gets the internalCurrencyFreight value for this PurchaseOrder.
     * 
     * @return internalCurrencyFreight
     */
    public java.lang.Object getInternalCurrencyFreight() {
        return internalCurrencyFreight;
    }


    /**
     * Sets the internalCurrencyFreight value for this PurchaseOrder.
     * 
     * @param internalCurrencyFreight
     */
    public void setInternalCurrencyFreight(java.lang.Object internalCurrencyFreight) {
        this.internalCurrencyFreight = internalCurrencyFreight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrder)) return false;
        PurchaseOrder other = (PurchaseOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vendorID==null && other.getVendorID()==null) || 
             (this.vendorID!=null &&
              this.vendorID.equals(other.getVendorID()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.creatorResourceID==null && other.getCreatorResourceID()==null) || 
             (this.creatorResourceID!=null &&
              this.creatorResourceID.equals(other.getCreatorResourceID()))) &&
            ((this.createDateTime==null && other.getCreateDateTime()==null) || 
             (this.createDateTime!=null &&
              this.createDateTime.equals(other.getCreateDateTime()))) &&
            ((this.submitDateTime==null && other.getSubmitDateTime()==null) || 
             (this.submitDateTime!=null &&
              this.submitDateTime.equals(other.getSubmitDateTime()))) &&
            ((this.cancelDateTime==null && other.getCancelDateTime()==null) || 
             (this.cancelDateTime!=null &&
              this.cancelDateTime.equals(other.getCancelDateTime()))) &&
            ((this.shipToName==null && other.getShipToName()==null) || 
             (this.shipToName!=null &&
              this.shipToName.equals(other.getShipToName()))) &&
            ((this.shipToAddress1==null && other.getShipToAddress1()==null) || 
             (this.shipToAddress1!=null &&
              this.shipToAddress1.equals(other.getShipToAddress1()))) &&
            ((this.shipToAddress2==null && other.getShipToAddress2()==null) || 
             (this.shipToAddress2!=null &&
              this.shipToAddress2.equals(other.getShipToAddress2()))) &&
            ((this.shipToCity==null && other.getShipToCity()==null) || 
             (this.shipToCity!=null &&
              this.shipToCity.equals(other.getShipToCity()))) &&
            ((this.shipToState==null && other.getShipToState()==null) || 
             (this.shipToState!=null &&
              this.shipToState.equals(other.getShipToState()))) &&
            ((this.shipToPostalCode==null && other.getShipToPostalCode()==null) || 
             (this.shipToPostalCode!=null &&
              this.shipToPostalCode.equals(other.getShipToPostalCode()))) &&
            ((this.generalMemo==null && other.getGeneralMemo()==null) || 
             (this.generalMemo!=null &&
              this.generalMemo.equals(other.getGeneralMemo()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.vendorInvoiceNumber==null && other.getVendorInvoiceNumber()==null) || 
             (this.vendorInvoiceNumber!=null &&
              this.vendorInvoiceNumber.equals(other.getVendorInvoiceNumber()))) &&
            ((this.externalPONumber==null && other.getExternalPONumber()==null) || 
             (this.externalPONumber!=null &&
              this.externalPONumber.equals(other.getExternalPONumber()))) &&
            ((this.purchaseForAccountID==null && other.getPurchaseForAccountID()==null) || 
             (this.purchaseForAccountID!=null &&
              this.purchaseForAccountID.equals(other.getPurchaseForAccountID()))) &&
            ((this.shippingType==null && other.getShippingType()==null) || 
             (this.shippingType!=null &&
              this.shippingType.equals(other.getShippingType()))) &&
            ((this.shippingDate==null && other.getShippingDate()==null) || 
             (this.shippingDate!=null &&
              this.shippingDate.equals(other.getShippingDate()))) &&
            ((this.freight==null && other.getFreight()==null) || 
             (this.freight!=null &&
              this.freight.equals(other.getFreight()))) &&
            ((this.taxGroup==null && other.getTaxGroup()==null) || 
             (this.taxGroup!=null &&
              this.taxGroup.equals(other.getTaxGroup()))) &&
            ((this.paymentTerm==null && other.getPaymentTerm()==null) || 
             (this.paymentTerm!=null &&
              this.paymentTerm.equals(other.getPaymentTerm()))) &&
            ((this.showTaxCategory==null && other.getShowTaxCategory()==null) || 
             (this.showTaxCategory!=null &&
              this.showTaxCategory.equals(other.getShowTaxCategory()))) &&
            ((this.showEachTaxInGroup==null && other.getShowEachTaxInGroup()==null) || 
             (this.showEachTaxInGroup!=null &&
              this.showEachTaxInGroup.equals(other.getShowEachTaxInGroup()))) &&
            ((this.latestEstimatedArrivalDate==null && other.getLatestEstimatedArrivalDate()==null) || 
             (this.latestEstimatedArrivalDate!=null &&
              this.latestEstimatedArrivalDate.equals(other.getLatestEstimatedArrivalDate()))) &&
            ((this.useItemDescriptionsFrom==null && other.getUseItemDescriptionsFrom()==null) || 
             (this.useItemDescriptionsFrom!=null &&
              this.useItemDescriptionsFrom.equals(other.getUseItemDescriptionsFrom()))) &&
            ((this.internalCurrencyFreight==null && other.getInternalCurrencyFreight()==null) || 
             (this.internalCurrencyFreight!=null &&
              this.internalCurrencyFreight.equals(other.getInternalCurrencyFreight())));
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
        if (getVendorID() != null) {
            _hashCode += getVendorID().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCreatorResourceID() != null) {
            _hashCode += getCreatorResourceID().hashCode();
        }
        if (getCreateDateTime() != null) {
            _hashCode += getCreateDateTime().hashCode();
        }
        if (getSubmitDateTime() != null) {
            _hashCode += getSubmitDateTime().hashCode();
        }
        if (getCancelDateTime() != null) {
            _hashCode += getCancelDateTime().hashCode();
        }
        if (getShipToName() != null) {
            _hashCode += getShipToName().hashCode();
        }
        if (getShipToAddress1() != null) {
            _hashCode += getShipToAddress1().hashCode();
        }
        if (getShipToAddress2() != null) {
            _hashCode += getShipToAddress2().hashCode();
        }
        if (getShipToCity() != null) {
            _hashCode += getShipToCity().hashCode();
        }
        if (getShipToState() != null) {
            _hashCode += getShipToState().hashCode();
        }
        if (getShipToPostalCode() != null) {
            _hashCode += getShipToPostalCode().hashCode();
        }
        if (getGeneralMemo() != null) {
            _hashCode += getGeneralMemo().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getVendorInvoiceNumber() != null) {
            _hashCode += getVendorInvoiceNumber().hashCode();
        }
        if (getExternalPONumber() != null) {
            _hashCode += getExternalPONumber().hashCode();
        }
        if (getPurchaseForAccountID() != null) {
            _hashCode += getPurchaseForAccountID().hashCode();
        }
        if (getShippingType() != null) {
            _hashCode += getShippingType().hashCode();
        }
        if (getShippingDate() != null) {
            _hashCode += getShippingDate().hashCode();
        }
        if (getFreight() != null) {
            _hashCode += getFreight().hashCode();
        }
        if (getTaxGroup() != null) {
            _hashCode += getTaxGroup().hashCode();
        }
        if (getPaymentTerm() != null) {
            _hashCode += getPaymentTerm().hashCode();
        }
        if (getShowTaxCategory() != null) {
            _hashCode += getShowTaxCategory().hashCode();
        }
        if (getShowEachTaxInGroup() != null) {
            _hashCode += getShowEachTaxInGroup().hashCode();
        }
        if (getLatestEstimatedArrivalDate() != null) {
            _hashCode += getLatestEstimatedArrivalDate().hashCode();
        }
        if (getUseItemDescriptionsFrom() != null) {
            _hashCode += getUseItemDescriptionsFrom().hashCode();
        }
        if (getInternalCurrencyFreight() != null) {
            _hashCode += getInternalCurrencyFreight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PurchaseOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "VendorID"));
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
        elemField.setFieldName("creatorResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreatorResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SubmitDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CancelDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShipToName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShipToAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShipToAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShipToCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShipToState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShipToPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalMemo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "GeneralMemo"));
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
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorInvoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "VendorInvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalPONumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExternalPONumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseForAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PurchaseForAccountID"));
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
        elemField.setFieldName("shippingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShippingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Freight"));
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
        elemField.setFieldName("paymentTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PaymentTerm"));
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
        elemField.setFieldName("showEachTaxInGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShowEachTaxInGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestEstimatedArrivalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LatestEstimatedArrivalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useItemDescriptionsFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UseItemDescriptionsFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyFreight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyFreight"));
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
