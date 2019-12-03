/**
 * Invoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Invoice  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object accountID;

    private java.lang.Object creatorResourceID;

    private java.lang.Object invoiceDateTime;

    private java.lang.Object createDateTime;

    private java.lang.Object invoiceNumber;

    private java.lang.Object comments;

    private java.lang.Object invoiceTotal;

    private java.lang.Object totalTaxValue;

    private java.lang.Object fromDate;

    private java.lang.Object toDate;

    private java.lang.Object orderNumber;

    private java.lang.Object paymentTerm;

    private java.lang.Object webServiceDate;

    private java.lang.Object isVoided;

    private java.lang.Object voidedDate;

    private java.lang.Object voidedByResourceID;

    private java.lang.Object paidDate;

    private java.lang.Object taxGroup;

    private java.lang.Object taxRegionName;

    private java.lang.Object dueDate;

    private java.lang.Object batchID;

    private java.lang.Object invoiceEditorTemplateID;

    public Invoice() {
    }

    public Invoice(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountID,
           java.lang.Object creatorResourceID,
           java.lang.Object invoiceDateTime,
           java.lang.Object createDateTime,
           java.lang.Object invoiceNumber,
           java.lang.Object comments,
           java.lang.Object invoiceTotal,
           java.lang.Object totalTaxValue,
           java.lang.Object fromDate,
           java.lang.Object toDate,
           java.lang.Object orderNumber,
           java.lang.Object paymentTerm,
           java.lang.Object webServiceDate,
           java.lang.Object isVoided,
           java.lang.Object voidedDate,
           java.lang.Object voidedByResourceID,
           java.lang.Object paidDate,
           java.lang.Object taxGroup,
           java.lang.Object taxRegionName,
           java.lang.Object dueDate,
           java.lang.Object batchID,
           java.lang.Object invoiceEditorTemplateID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountID = accountID;
        this.creatorResourceID = creatorResourceID;
        this.invoiceDateTime = invoiceDateTime;
        this.createDateTime = createDateTime;
        this.invoiceNumber = invoiceNumber;
        this.comments = comments;
        this.invoiceTotal = invoiceTotal;
        this.totalTaxValue = totalTaxValue;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.orderNumber = orderNumber;
        this.paymentTerm = paymentTerm;
        this.webServiceDate = webServiceDate;
        this.isVoided = isVoided;
        this.voidedDate = voidedDate;
        this.voidedByResourceID = voidedByResourceID;
        this.paidDate = paidDate;
        this.taxGroup = taxGroup;
        this.taxRegionName = taxRegionName;
        this.dueDate = dueDate;
        this.batchID = batchID;
        this.invoiceEditorTemplateID = invoiceEditorTemplateID;
    }


    /**
     * Gets the accountID value for this Invoice.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this Invoice.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the creatorResourceID value for this Invoice.
     * 
     * @return creatorResourceID
     */
    public java.lang.Object getCreatorResourceID() {
        return creatorResourceID;
    }


    /**
     * Sets the creatorResourceID value for this Invoice.
     * 
     * @param creatorResourceID
     */
    public void setCreatorResourceID(java.lang.Object creatorResourceID) {
        this.creatorResourceID = creatorResourceID;
    }


    /**
     * Gets the invoiceDateTime value for this Invoice.
     * 
     * @return invoiceDateTime
     */
    public java.lang.Object getInvoiceDateTime() {
        return invoiceDateTime;
    }


    /**
     * Sets the invoiceDateTime value for this Invoice.
     * 
     * @param invoiceDateTime
     */
    public void setInvoiceDateTime(java.lang.Object invoiceDateTime) {
        this.invoiceDateTime = invoiceDateTime;
    }


    /**
     * Gets the createDateTime value for this Invoice.
     * 
     * @return createDateTime
     */
    public java.lang.Object getCreateDateTime() {
        return createDateTime;
    }


    /**
     * Sets the createDateTime value for this Invoice.
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(java.lang.Object createDateTime) {
        this.createDateTime = createDateTime;
    }


    /**
     * Gets the invoiceNumber value for this Invoice.
     * 
     * @return invoiceNumber
     */
    public java.lang.Object getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this Invoice.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.Object invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the comments value for this Invoice.
     * 
     * @return comments
     */
    public java.lang.Object getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Invoice.
     * 
     * @param comments
     */
    public void setComments(java.lang.Object comments) {
        this.comments = comments;
    }


    /**
     * Gets the invoiceTotal value for this Invoice.
     * 
     * @return invoiceTotal
     */
    public java.lang.Object getInvoiceTotal() {
        return invoiceTotal;
    }


    /**
     * Sets the invoiceTotal value for this Invoice.
     * 
     * @param invoiceTotal
     */
    public void setInvoiceTotal(java.lang.Object invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }


    /**
     * Gets the totalTaxValue value for this Invoice.
     * 
     * @return totalTaxValue
     */
    public java.lang.Object getTotalTaxValue() {
        return totalTaxValue;
    }


    /**
     * Sets the totalTaxValue value for this Invoice.
     * 
     * @param totalTaxValue
     */
    public void setTotalTaxValue(java.lang.Object totalTaxValue) {
        this.totalTaxValue = totalTaxValue;
    }


    /**
     * Gets the fromDate value for this Invoice.
     * 
     * @return fromDate
     */
    public java.lang.Object getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this Invoice.
     * 
     * @param fromDate
     */
    public void setFromDate(java.lang.Object fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this Invoice.
     * 
     * @return toDate
     */
    public java.lang.Object getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this Invoice.
     * 
     * @param toDate
     */
    public void setToDate(java.lang.Object toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the orderNumber value for this Invoice.
     * 
     * @return orderNumber
     */
    public java.lang.Object getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this Invoice.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.Object orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the paymentTerm value for this Invoice.
     * 
     * @return paymentTerm
     */
    public java.lang.Object getPaymentTerm() {
        return paymentTerm;
    }


    /**
     * Sets the paymentTerm value for this Invoice.
     * 
     * @param paymentTerm
     */
    public void setPaymentTerm(java.lang.Object paymentTerm) {
        this.paymentTerm = paymentTerm;
    }


    /**
     * Gets the webServiceDate value for this Invoice.
     * 
     * @return webServiceDate
     */
    public java.lang.Object getWebServiceDate() {
        return webServiceDate;
    }


    /**
     * Sets the webServiceDate value for this Invoice.
     * 
     * @param webServiceDate
     */
    public void setWebServiceDate(java.lang.Object webServiceDate) {
        this.webServiceDate = webServiceDate;
    }


    /**
     * Gets the isVoided value for this Invoice.
     * 
     * @return isVoided
     */
    public java.lang.Object getIsVoided() {
        return isVoided;
    }


    /**
     * Sets the isVoided value for this Invoice.
     * 
     * @param isVoided
     */
    public void setIsVoided(java.lang.Object isVoided) {
        this.isVoided = isVoided;
    }


    /**
     * Gets the voidedDate value for this Invoice.
     * 
     * @return voidedDate
     */
    public java.lang.Object getVoidedDate() {
        return voidedDate;
    }


    /**
     * Sets the voidedDate value for this Invoice.
     * 
     * @param voidedDate
     */
    public void setVoidedDate(java.lang.Object voidedDate) {
        this.voidedDate = voidedDate;
    }


    /**
     * Gets the voidedByResourceID value for this Invoice.
     * 
     * @return voidedByResourceID
     */
    public java.lang.Object getVoidedByResourceID() {
        return voidedByResourceID;
    }


    /**
     * Sets the voidedByResourceID value for this Invoice.
     * 
     * @param voidedByResourceID
     */
    public void setVoidedByResourceID(java.lang.Object voidedByResourceID) {
        this.voidedByResourceID = voidedByResourceID;
    }


    /**
     * Gets the paidDate value for this Invoice.
     * 
     * @return paidDate
     */
    public java.lang.Object getPaidDate() {
        return paidDate;
    }


    /**
     * Sets the paidDate value for this Invoice.
     * 
     * @param paidDate
     */
    public void setPaidDate(java.lang.Object paidDate) {
        this.paidDate = paidDate;
    }


    /**
     * Gets the taxGroup value for this Invoice.
     * 
     * @return taxGroup
     */
    public java.lang.Object getTaxGroup() {
        return taxGroup;
    }


    /**
     * Sets the taxGroup value for this Invoice.
     * 
     * @param taxGroup
     */
    public void setTaxGroup(java.lang.Object taxGroup) {
        this.taxGroup = taxGroup;
    }


    /**
     * Gets the taxRegionName value for this Invoice.
     * 
     * @return taxRegionName
     */
    public java.lang.Object getTaxRegionName() {
        return taxRegionName;
    }


    /**
     * Sets the taxRegionName value for this Invoice.
     * 
     * @param taxRegionName
     */
    public void setTaxRegionName(java.lang.Object taxRegionName) {
        this.taxRegionName = taxRegionName;
    }


    /**
     * Gets the dueDate value for this Invoice.
     * 
     * @return dueDate
     */
    public java.lang.Object getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this Invoice.
     * 
     * @param dueDate
     */
    public void setDueDate(java.lang.Object dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the batchID value for this Invoice.
     * 
     * @return batchID
     */
    public java.lang.Object getBatchID() {
        return batchID;
    }


    /**
     * Sets the batchID value for this Invoice.
     * 
     * @param batchID
     */
    public void setBatchID(java.lang.Object batchID) {
        this.batchID = batchID;
    }


    /**
     * Gets the invoiceEditorTemplateID value for this Invoice.
     * 
     * @return invoiceEditorTemplateID
     */
    public java.lang.Object getInvoiceEditorTemplateID() {
        return invoiceEditorTemplateID;
    }


    /**
     * Sets the invoiceEditorTemplateID value for this Invoice.
     * 
     * @param invoiceEditorTemplateID
     */
    public void setInvoiceEditorTemplateID(java.lang.Object invoiceEditorTemplateID) {
        this.invoiceEditorTemplateID = invoiceEditorTemplateID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Invoice)) return false;
        Invoice other = (Invoice) obj;
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
            ((this.creatorResourceID==null && other.getCreatorResourceID()==null) || 
             (this.creatorResourceID!=null &&
              this.creatorResourceID.equals(other.getCreatorResourceID()))) &&
            ((this.invoiceDateTime==null && other.getInvoiceDateTime()==null) || 
             (this.invoiceDateTime!=null &&
              this.invoiceDateTime.equals(other.getInvoiceDateTime()))) &&
            ((this.createDateTime==null && other.getCreateDateTime()==null) || 
             (this.createDateTime!=null &&
              this.createDateTime.equals(other.getCreateDateTime()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.invoiceTotal==null && other.getInvoiceTotal()==null) || 
             (this.invoiceTotal!=null &&
              this.invoiceTotal.equals(other.getInvoiceTotal()))) &&
            ((this.totalTaxValue==null && other.getTotalTaxValue()==null) || 
             (this.totalTaxValue!=null &&
              this.totalTaxValue.equals(other.getTotalTaxValue()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.paymentTerm==null && other.getPaymentTerm()==null) || 
             (this.paymentTerm!=null &&
              this.paymentTerm.equals(other.getPaymentTerm()))) &&
            ((this.webServiceDate==null && other.getWebServiceDate()==null) || 
             (this.webServiceDate!=null &&
              this.webServiceDate.equals(other.getWebServiceDate()))) &&
            ((this.isVoided==null && other.getIsVoided()==null) || 
             (this.isVoided!=null &&
              this.isVoided.equals(other.getIsVoided()))) &&
            ((this.voidedDate==null && other.getVoidedDate()==null) || 
             (this.voidedDate!=null &&
              this.voidedDate.equals(other.getVoidedDate()))) &&
            ((this.voidedByResourceID==null && other.getVoidedByResourceID()==null) || 
             (this.voidedByResourceID!=null &&
              this.voidedByResourceID.equals(other.getVoidedByResourceID()))) &&
            ((this.paidDate==null && other.getPaidDate()==null) || 
             (this.paidDate!=null &&
              this.paidDate.equals(other.getPaidDate()))) &&
            ((this.taxGroup==null && other.getTaxGroup()==null) || 
             (this.taxGroup!=null &&
              this.taxGroup.equals(other.getTaxGroup()))) &&
            ((this.taxRegionName==null && other.getTaxRegionName()==null) || 
             (this.taxRegionName!=null &&
              this.taxRegionName.equals(other.getTaxRegionName()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.batchID==null && other.getBatchID()==null) || 
             (this.batchID!=null &&
              this.batchID.equals(other.getBatchID()))) &&
            ((this.invoiceEditorTemplateID==null && other.getInvoiceEditorTemplateID()==null) || 
             (this.invoiceEditorTemplateID!=null &&
              this.invoiceEditorTemplateID.equals(other.getInvoiceEditorTemplateID())));
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
        if (getCreatorResourceID() != null) {
            _hashCode += getCreatorResourceID().hashCode();
        }
        if (getInvoiceDateTime() != null) {
            _hashCode += getInvoiceDateTime().hashCode();
        }
        if (getCreateDateTime() != null) {
            _hashCode += getCreateDateTime().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getInvoiceTotal() != null) {
            _hashCode += getInvoiceTotal().hashCode();
        }
        if (getTotalTaxValue() != null) {
            _hashCode += getTotalTaxValue().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getPaymentTerm() != null) {
            _hashCode += getPaymentTerm().hashCode();
        }
        if (getWebServiceDate() != null) {
            _hashCode += getWebServiceDate().hashCode();
        }
        if (getIsVoided() != null) {
            _hashCode += getIsVoided().hashCode();
        }
        if (getVoidedDate() != null) {
            _hashCode += getVoidedDate().hashCode();
        }
        if (getVoidedByResourceID() != null) {
            _hashCode += getVoidedByResourceID().hashCode();
        }
        if (getPaidDate() != null) {
            _hashCode += getPaidDate().hashCode();
        }
        if (getTaxGroup() != null) {
            _hashCode += getTaxGroup().hashCode();
        }
        if (getTaxRegionName() != null) {
            _hashCode += getTaxRegionName().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getBatchID() != null) {
            _hashCode += getBatchID().hashCode();
        }
        if (getInvoiceEditorTemplateID() != null) {
            _hashCode += getInvoiceEditorTemplateID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Invoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Invoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
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
        elemField.setFieldName("invoiceDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceDateTime"));
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
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTaxValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TotalTaxValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OrderNumber"));
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
        elemField.setFieldName("webServiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WebServiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVoided");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsVoided"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voidedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "VoidedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voidedByResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "VoidedByResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PaidDate"));
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
        elemField.setFieldName("taxRegionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaxRegionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BatchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceEditorTemplateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceEditorTemplateID"));
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
