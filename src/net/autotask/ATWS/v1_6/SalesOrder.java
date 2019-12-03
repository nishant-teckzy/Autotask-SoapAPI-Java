/**
 * SalesOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class SalesOrder  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object accountID;

    private java.lang.Object title;

    private java.lang.Object status;

    private java.lang.Object contact;

    private java.lang.Object ownerResourceID;

    private java.lang.Object salesOrderDate;

    private java.lang.Object promisedDueDate;

    private java.lang.Object billToAddress1;

    private java.lang.Object billToAddress2;

    private java.lang.Object billToCity;

    private java.lang.Object billToState;

    private java.lang.Object billToPostalCode;

    private java.lang.Object billToCountry;

    private java.lang.Object shipToAddress1;

    private java.lang.Object shipToAddress2;

    private java.lang.Object shipToCity;

    private java.lang.Object shipToState;

    private java.lang.Object shipToPostalCode;

    private java.lang.Object shipToCountry;

    private java.lang.Object opportunityID;

    private java.lang.Object additionalBillToAddressInformation;

    private java.lang.Object additionalShipToAddressInformation;

    private java.lang.Object shipToCountryID;

    private java.lang.Object billToCountryID;

    private java.lang.Object businessDivisionSubdivisionID;

    public SalesOrder() {
    }

    public SalesOrder(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountID,
           java.lang.Object title,
           java.lang.Object status,
           java.lang.Object contact,
           java.lang.Object ownerResourceID,
           java.lang.Object salesOrderDate,
           java.lang.Object promisedDueDate,
           java.lang.Object billToAddress1,
           java.lang.Object billToAddress2,
           java.lang.Object billToCity,
           java.lang.Object billToState,
           java.lang.Object billToPostalCode,
           java.lang.Object billToCountry,
           java.lang.Object shipToAddress1,
           java.lang.Object shipToAddress2,
           java.lang.Object shipToCity,
           java.lang.Object shipToState,
           java.lang.Object shipToPostalCode,
           java.lang.Object shipToCountry,
           java.lang.Object opportunityID,
           java.lang.Object additionalBillToAddressInformation,
           java.lang.Object additionalShipToAddressInformation,
           java.lang.Object shipToCountryID,
           java.lang.Object billToCountryID,
           java.lang.Object businessDivisionSubdivisionID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountID = accountID;
        this.title = title;
        this.status = status;
        this.contact = contact;
        this.ownerResourceID = ownerResourceID;
        this.salesOrderDate = salesOrderDate;
        this.promisedDueDate = promisedDueDate;
        this.billToAddress1 = billToAddress1;
        this.billToAddress2 = billToAddress2;
        this.billToCity = billToCity;
        this.billToState = billToState;
        this.billToPostalCode = billToPostalCode;
        this.billToCountry = billToCountry;
        this.shipToAddress1 = shipToAddress1;
        this.shipToAddress2 = shipToAddress2;
        this.shipToCity = shipToCity;
        this.shipToState = shipToState;
        this.shipToPostalCode = shipToPostalCode;
        this.shipToCountry = shipToCountry;
        this.opportunityID = opportunityID;
        this.additionalBillToAddressInformation = additionalBillToAddressInformation;
        this.additionalShipToAddressInformation = additionalShipToAddressInformation;
        this.shipToCountryID = shipToCountryID;
        this.billToCountryID = billToCountryID;
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }


    /**
     * Gets the accountID value for this SalesOrder.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this SalesOrder.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the title value for this SalesOrder.
     * 
     * @return title
     */
    public java.lang.Object getTitle() {
        return title;
    }


    /**
     * Sets the title value for this SalesOrder.
     * 
     * @param title
     */
    public void setTitle(java.lang.Object title) {
        this.title = title;
    }


    /**
     * Gets the status value for this SalesOrder.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SalesOrder.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the contact value for this SalesOrder.
     * 
     * @return contact
     */
    public java.lang.Object getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this SalesOrder.
     * 
     * @param contact
     */
    public void setContact(java.lang.Object contact) {
        this.contact = contact;
    }


    /**
     * Gets the ownerResourceID value for this SalesOrder.
     * 
     * @return ownerResourceID
     */
    public java.lang.Object getOwnerResourceID() {
        return ownerResourceID;
    }


    /**
     * Sets the ownerResourceID value for this SalesOrder.
     * 
     * @param ownerResourceID
     */
    public void setOwnerResourceID(java.lang.Object ownerResourceID) {
        this.ownerResourceID = ownerResourceID;
    }


    /**
     * Gets the salesOrderDate value for this SalesOrder.
     * 
     * @return salesOrderDate
     */
    public java.lang.Object getSalesOrderDate() {
        return salesOrderDate;
    }


    /**
     * Sets the salesOrderDate value for this SalesOrder.
     * 
     * @param salesOrderDate
     */
    public void setSalesOrderDate(java.lang.Object salesOrderDate) {
        this.salesOrderDate = salesOrderDate;
    }


    /**
     * Gets the promisedDueDate value for this SalesOrder.
     * 
     * @return promisedDueDate
     */
    public java.lang.Object getPromisedDueDate() {
        return promisedDueDate;
    }


    /**
     * Sets the promisedDueDate value for this SalesOrder.
     * 
     * @param promisedDueDate
     */
    public void setPromisedDueDate(java.lang.Object promisedDueDate) {
        this.promisedDueDate = promisedDueDate;
    }


    /**
     * Gets the billToAddress1 value for this SalesOrder.
     * 
     * @return billToAddress1
     */
    public java.lang.Object getBillToAddress1() {
        return billToAddress1;
    }


    /**
     * Sets the billToAddress1 value for this SalesOrder.
     * 
     * @param billToAddress1
     */
    public void setBillToAddress1(java.lang.Object billToAddress1) {
        this.billToAddress1 = billToAddress1;
    }


    /**
     * Gets the billToAddress2 value for this SalesOrder.
     * 
     * @return billToAddress2
     */
    public java.lang.Object getBillToAddress2() {
        return billToAddress2;
    }


    /**
     * Sets the billToAddress2 value for this SalesOrder.
     * 
     * @param billToAddress2
     */
    public void setBillToAddress2(java.lang.Object billToAddress2) {
        this.billToAddress2 = billToAddress2;
    }


    /**
     * Gets the billToCity value for this SalesOrder.
     * 
     * @return billToCity
     */
    public java.lang.Object getBillToCity() {
        return billToCity;
    }


    /**
     * Sets the billToCity value for this SalesOrder.
     * 
     * @param billToCity
     */
    public void setBillToCity(java.lang.Object billToCity) {
        this.billToCity = billToCity;
    }


    /**
     * Gets the billToState value for this SalesOrder.
     * 
     * @return billToState
     */
    public java.lang.Object getBillToState() {
        return billToState;
    }


    /**
     * Sets the billToState value for this SalesOrder.
     * 
     * @param billToState
     */
    public void setBillToState(java.lang.Object billToState) {
        this.billToState = billToState;
    }


    /**
     * Gets the billToPostalCode value for this SalesOrder.
     * 
     * @return billToPostalCode
     */
    public java.lang.Object getBillToPostalCode() {
        return billToPostalCode;
    }


    /**
     * Sets the billToPostalCode value for this SalesOrder.
     * 
     * @param billToPostalCode
     */
    public void setBillToPostalCode(java.lang.Object billToPostalCode) {
        this.billToPostalCode = billToPostalCode;
    }


    /**
     * Gets the billToCountry value for this SalesOrder.
     * 
     * @return billToCountry
     */
    public java.lang.Object getBillToCountry() {
        return billToCountry;
    }


    /**
     * Sets the billToCountry value for this SalesOrder.
     * 
     * @param billToCountry
     */
    public void setBillToCountry(java.lang.Object billToCountry) {
        this.billToCountry = billToCountry;
    }


    /**
     * Gets the shipToAddress1 value for this SalesOrder.
     * 
     * @return shipToAddress1
     */
    public java.lang.Object getShipToAddress1() {
        return shipToAddress1;
    }


    /**
     * Sets the shipToAddress1 value for this SalesOrder.
     * 
     * @param shipToAddress1
     */
    public void setShipToAddress1(java.lang.Object shipToAddress1) {
        this.shipToAddress1 = shipToAddress1;
    }


    /**
     * Gets the shipToAddress2 value for this SalesOrder.
     * 
     * @return shipToAddress2
     */
    public java.lang.Object getShipToAddress2() {
        return shipToAddress2;
    }


    /**
     * Sets the shipToAddress2 value for this SalesOrder.
     * 
     * @param shipToAddress2
     */
    public void setShipToAddress2(java.lang.Object shipToAddress2) {
        this.shipToAddress2 = shipToAddress2;
    }


    /**
     * Gets the shipToCity value for this SalesOrder.
     * 
     * @return shipToCity
     */
    public java.lang.Object getShipToCity() {
        return shipToCity;
    }


    /**
     * Sets the shipToCity value for this SalesOrder.
     * 
     * @param shipToCity
     */
    public void setShipToCity(java.lang.Object shipToCity) {
        this.shipToCity = shipToCity;
    }


    /**
     * Gets the shipToState value for this SalesOrder.
     * 
     * @return shipToState
     */
    public java.lang.Object getShipToState() {
        return shipToState;
    }


    /**
     * Sets the shipToState value for this SalesOrder.
     * 
     * @param shipToState
     */
    public void setShipToState(java.lang.Object shipToState) {
        this.shipToState = shipToState;
    }


    /**
     * Gets the shipToPostalCode value for this SalesOrder.
     * 
     * @return shipToPostalCode
     */
    public java.lang.Object getShipToPostalCode() {
        return shipToPostalCode;
    }


    /**
     * Sets the shipToPostalCode value for this SalesOrder.
     * 
     * @param shipToPostalCode
     */
    public void setShipToPostalCode(java.lang.Object shipToPostalCode) {
        this.shipToPostalCode = shipToPostalCode;
    }


    /**
     * Gets the shipToCountry value for this SalesOrder.
     * 
     * @return shipToCountry
     */
    public java.lang.Object getShipToCountry() {
        return shipToCountry;
    }


    /**
     * Sets the shipToCountry value for this SalesOrder.
     * 
     * @param shipToCountry
     */
    public void setShipToCountry(java.lang.Object shipToCountry) {
        this.shipToCountry = shipToCountry;
    }


    /**
     * Gets the opportunityID value for this SalesOrder.
     * 
     * @return opportunityID
     */
    public java.lang.Object getOpportunityID() {
        return opportunityID;
    }


    /**
     * Sets the opportunityID value for this SalesOrder.
     * 
     * @param opportunityID
     */
    public void setOpportunityID(java.lang.Object opportunityID) {
        this.opportunityID = opportunityID;
    }


    /**
     * Gets the additionalBillToAddressInformation value for this SalesOrder.
     * 
     * @return additionalBillToAddressInformation
     */
    public java.lang.Object getAdditionalBillToAddressInformation() {
        return additionalBillToAddressInformation;
    }


    /**
     * Sets the additionalBillToAddressInformation value for this SalesOrder.
     * 
     * @param additionalBillToAddressInformation
     */
    public void setAdditionalBillToAddressInformation(java.lang.Object additionalBillToAddressInformation) {
        this.additionalBillToAddressInformation = additionalBillToAddressInformation;
    }


    /**
     * Gets the additionalShipToAddressInformation value for this SalesOrder.
     * 
     * @return additionalShipToAddressInformation
     */
    public java.lang.Object getAdditionalShipToAddressInformation() {
        return additionalShipToAddressInformation;
    }


    /**
     * Sets the additionalShipToAddressInformation value for this SalesOrder.
     * 
     * @param additionalShipToAddressInformation
     */
    public void setAdditionalShipToAddressInformation(java.lang.Object additionalShipToAddressInformation) {
        this.additionalShipToAddressInformation = additionalShipToAddressInformation;
    }


    /**
     * Gets the shipToCountryID value for this SalesOrder.
     * 
     * @return shipToCountryID
     */
    public java.lang.Object getShipToCountryID() {
        return shipToCountryID;
    }


    /**
     * Sets the shipToCountryID value for this SalesOrder.
     * 
     * @param shipToCountryID
     */
    public void setShipToCountryID(java.lang.Object shipToCountryID) {
        this.shipToCountryID = shipToCountryID;
    }


    /**
     * Gets the billToCountryID value for this SalesOrder.
     * 
     * @return billToCountryID
     */
    public java.lang.Object getBillToCountryID() {
        return billToCountryID;
    }


    /**
     * Sets the billToCountryID value for this SalesOrder.
     * 
     * @param billToCountryID
     */
    public void setBillToCountryID(java.lang.Object billToCountryID) {
        this.billToCountryID = billToCountryID;
    }


    /**
     * Gets the businessDivisionSubdivisionID value for this SalesOrder.
     * 
     * @return businessDivisionSubdivisionID
     */
    public java.lang.Object getBusinessDivisionSubdivisionID() {
        return businessDivisionSubdivisionID;
    }


    /**
     * Sets the businessDivisionSubdivisionID value for this SalesOrder.
     * 
     * @param businessDivisionSubdivisionID
     */
    public void setBusinessDivisionSubdivisionID(java.lang.Object businessDivisionSubdivisionID) {
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrder)) return false;
        SalesOrder other = (SalesOrder) obj;
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
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.ownerResourceID==null && other.getOwnerResourceID()==null) || 
             (this.ownerResourceID!=null &&
              this.ownerResourceID.equals(other.getOwnerResourceID()))) &&
            ((this.salesOrderDate==null && other.getSalesOrderDate()==null) || 
             (this.salesOrderDate!=null &&
              this.salesOrderDate.equals(other.getSalesOrderDate()))) &&
            ((this.promisedDueDate==null && other.getPromisedDueDate()==null) || 
             (this.promisedDueDate!=null &&
              this.promisedDueDate.equals(other.getPromisedDueDate()))) &&
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
            ((this.billToPostalCode==null && other.getBillToPostalCode()==null) || 
             (this.billToPostalCode!=null &&
              this.billToPostalCode.equals(other.getBillToPostalCode()))) &&
            ((this.billToCountry==null && other.getBillToCountry()==null) || 
             (this.billToCountry!=null &&
              this.billToCountry.equals(other.getBillToCountry()))) &&
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
            ((this.shipToCountry==null && other.getShipToCountry()==null) || 
             (this.shipToCountry!=null &&
              this.shipToCountry.equals(other.getShipToCountry()))) &&
            ((this.opportunityID==null && other.getOpportunityID()==null) || 
             (this.opportunityID!=null &&
              this.opportunityID.equals(other.getOpportunityID()))) &&
            ((this.additionalBillToAddressInformation==null && other.getAdditionalBillToAddressInformation()==null) || 
             (this.additionalBillToAddressInformation!=null &&
              this.additionalBillToAddressInformation.equals(other.getAdditionalBillToAddressInformation()))) &&
            ((this.additionalShipToAddressInformation==null && other.getAdditionalShipToAddressInformation()==null) || 
             (this.additionalShipToAddressInformation!=null &&
              this.additionalShipToAddressInformation.equals(other.getAdditionalShipToAddressInformation()))) &&
            ((this.shipToCountryID==null && other.getShipToCountryID()==null) || 
             (this.shipToCountryID!=null &&
              this.shipToCountryID.equals(other.getShipToCountryID()))) &&
            ((this.billToCountryID==null && other.getBillToCountryID()==null) || 
             (this.billToCountryID!=null &&
              this.billToCountryID.equals(other.getBillToCountryID()))) &&
            ((this.businessDivisionSubdivisionID==null && other.getBusinessDivisionSubdivisionID()==null) || 
             (this.businessDivisionSubdivisionID!=null &&
              this.businessDivisionSubdivisionID.equals(other.getBusinessDivisionSubdivisionID())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getOwnerResourceID() != null) {
            _hashCode += getOwnerResourceID().hashCode();
        }
        if (getSalesOrderDate() != null) {
            _hashCode += getSalesOrderDate().hashCode();
        }
        if (getPromisedDueDate() != null) {
            _hashCode += getPromisedDueDate().hashCode();
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
        if (getBillToPostalCode() != null) {
            _hashCode += getBillToPostalCode().hashCode();
        }
        if (getBillToCountry() != null) {
            _hashCode += getBillToCountry().hashCode();
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
        if (getShipToCountry() != null) {
            _hashCode += getShipToCountry().hashCode();
        }
        if (getOpportunityID() != null) {
            _hashCode += getOpportunityID().hashCode();
        }
        if (getAdditionalBillToAddressInformation() != null) {
            _hashCode += getAdditionalBillToAddressInformation().hashCode();
        }
        if (getAdditionalShipToAddressInformation() != null) {
            _hashCode += getAdditionalShipToAddressInformation().hashCode();
        }
        if (getShipToCountryID() != null) {
            _hashCode += getShipToCountryID().hashCode();
        }
        if (getBillToCountryID() != null) {
            _hashCode += getBillToCountryID().hashCode();
        }
        if (getBusinessDivisionSubdivisionID() != null) {
            _hashCode += getBusinessDivisionSubdivisionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SalesOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Title"));
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
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Contact"));
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
        elemField.setFieldName("salesOrderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SalesOrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promisedDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PromisedDueDate"));
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
        elemField.setFieldName("billToPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillToCountry"));
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
        elemField.setFieldName("shipToCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShipToCountry"));
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
        elemField.setFieldName("additionalBillToAddressInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdditionalBillToAddressInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalShipToAddressInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdditionalShipToAddressInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToCountryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShipToCountryID"));
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
        elemField.setFieldName("businessDivisionSubdivisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BusinessDivisionSubdivisionID"));
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
