/**
 * ContractServiceBundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractServiceBundle  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object contractID;

    private java.lang.Object serviceBundleID;

    private java.lang.Object unitPrice;

    private java.lang.Object adjustedPrice;

    private java.lang.Object invoiceDescription;

    private java.lang.Object quoteItemID;

    private java.lang.Object internalCurrencyUnitPrice;

    private java.lang.Object internalCurrencyAdjustedPrice;

    private java.lang.Object internalDescription;

    public ContractServiceBundle() {
    }

    public ContractServiceBundle(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object contractID,
           java.lang.Object serviceBundleID,
           java.lang.Object unitPrice,
           java.lang.Object adjustedPrice,
           java.lang.Object invoiceDescription,
           java.lang.Object quoteItemID,
           java.lang.Object internalCurrencyUnitPrice,
           java.lang.Object internalCurrencyAdjustedPrice,
           java.lang.Object internalDescription) {
        super(
            fields,
            id,
            userDefinedFields);
        this.contractID = contractID;
        this.serviceBundleID = serviceBundleID;
        this.unitPrice = unitPrice;
        this.adjustedPrice = adjustedPrice;
        this.invoiceDescription = invoiceDescription;
        this.quoteItemID = quoteItemID;
        this.internalCurrencyUnitPrice = internalCurrencyUnitPrice;
        this.internalCurrencyAdjustedPrice = internalCurrencyAdjustedPrice;
        this.internalDescription = internalDescription;
    }


    /**
     * Gets the contractID value for this ContractServiceBundle.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ContractServiceBundle.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the serviceBundleID value for this ContractServiceBundle.
     * 
     * @return serviceBundleID
     */
    public java.lang.Object getServiceBundleID() {
        return serviceBundleID;
    }


    /**
     * Sets the serviceBundleID value for this ContractServiceBundle.
     * 
     * @param serviceBundleID
     */
    public void setServiceBundleID(java.lang.Object serviceBundleID) {
        this.serviceBundleID = serviceBundleID;
    }


    /**
     * Gets the unitPrice value for this ContractServiceBundle.
     * 
     * @return unitPrice
     */
    public java.lang.Object getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this ContractServiceBundle.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.lang.Object unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the adjustedPrice value for this ContractServiceBundle.
     * 
     * @return adjustedPrice
     */
    public java.lang.Object getAdjustedPrice() {
        return adjustedPrice;
    }


    /**
     * Sets the adjustedPrice value for this ContractServiceBundle.
     * 
     * @param adjustedPrice
     */
    public void setAdjustedPrice(java.lang.Object adjustedPrice) {
        this.adjustedPrice = adjustedPrice;
    }


    /**
     * Gets the invoiceDescription value for this ContractServiceBundle.
     * 
     * @return invoiceDescription
     */
    public java.lang.Object getInvoiceDescription() {
        return invoiceDescription;
    }


    /**
     * Sets the invoiceDescription value for this ContractServiceBundle.
     * 
     * @param invoiceDescription
     */
    public void setInvoiceDescription(java.lang.Object invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }


    /**
     * Gets the quoteItemID value for this ContractServiceBundle.
     * 
     * @return quoteItemID
     */
    public java.lang.Object getQuoteItemID() {
        return quoteItemID;
    }


    /**
     * Sets the quoteItemID value for this ContractServiceBundle.
     * 
     * @param quoteItemID
     */
    public void setQuoteItemID(java.lang.Object quoteItemID) {
        this.quoteItemID = quoteItemID;
    }


    /**
     * Gets the internalCurrencyUnitPrice value for this ContractServiceBundle.
     * 
     * @return internalCurrencyUnitPrice
     */
    public java.lang.Object getInternalCurrencyUnitPrice() {
        return internalCurrencyUnitPrice;
    }


    /**
     * Sets the internalCurrencyUnitPrice value for this ContractServiceBundle.
     * 
     * @param internalCurrencyUnitPrice
     */
    public void setInternalCurrencyUnitPrice(java.lang.Object internalCurrencyUnitPrice) {
        this.internalCurrencyUnitPrice = internalCurrencyUnitPrice;
    }


    /**
     * Gets the internalCurrencyAdjustedPrice value for this ContractServiceBundle.
     * 
     * @return internalCurrencyAdjustedPrice
     */
    public java.lang.Object getInternalCurrencyAdjustedPrice() {
        return internalCurrencyAdjustedPrice;
    }


    /**
     * Sets the internalCurrencyAdjustedPrice value for this ContractServiceBundle.
     * 
     * @param internalCurrencyAdjustedPrice
     */
    public void setInternalCurrencyAdjustedPrice(java.lang.Object internalCurrencyAdjustedPrice) {
        this.internalCurrencyAdjustedPrice = internalCurrencyAdjustedPrice;
    }


    /**
     * Gets the internalDescription value for this ContractServiceBundle.
     * 
     * @return internalDescription
     */
    public java.lang.Object getInternalDescription() {
        return internalDescription;
    }


    /**
     * Sets the internalDescription value for this ContractServiceBundle.
     * 
     * @param internalDescription
     */
    public void setInternalDescription(java.lang.Object internalDescription) {
        this.internalDescription = internalDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractServiceBundle)) return false;
        ContractServiceBundle other = (ContractServiceBundle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.serviceBundleID==null && other.getServiceBundleID()==null) || 
             (this.serviceBundleID!=null &&
              this.serviceBundleID.equals(other.getServiceBundleID()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.adjustedPrice==null && other.getAdjustedPrice()==null) || 
             (this.adjustedPrice!=null &&
              this.adjustedPrice.equals(other.getAdjustedPrice()))) &&
            ((this.invoiceDescription==null && other.getInvoiceDescription()==null) || 
             (this.invoiceDescription!=null &&
              this.invoiceDescription.equals(other.getInvoiceDescription()))) &&
            ((this.quoteItemID==null && other.getQuoteItemID()==null) || 
             (this.quoteItemID!=null &&
              this.quoteItemID.equals(other.getQuoteItemID()))) &&
            ((this.internalCurrencyUnitPrice==null && other.getInternalCurrencyUnitPrice()==null) || 
             (this.internalCurrencyUnitPrice!=null &&
              this.internalCurrencyUnitPrice.equals(other.getInternalCurrencyUnitPrice()))) &&
            ((this.internalCurrencyAdjustedPrice==null && other.getInternalCurrencyAdjustedPrice()==null) || 
             (this.internalCurrencyAdjustedPrice!=null &&
              this.internalCurrencyAdjustedPrice.equals(other.getInternalCurrencyAdjustedPrice()))) &&
            ((this.internalDescription==null && other.getInternalDescription()==null) || 
             (this.internalDescription!=null &&
              this.internalDescription.equals(other.getInternalDescription())));
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
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getServiceBundleID() != null) {
            _hashCode += getServiceBundleID().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getAdjustedPrice() != null) {
            _hashCode += getAdjustedPrice().hashCode();
        }
        if (getInvoiceDescription() != null) {
            _hashCode += getInvoiceDescription().hashCode();
        }
        if (getQuoteItemID() != null) {
            _hashCode += getQuoteItemID().hashCode();
        }
        if (getInternalCurrencyUnitPrice() != null) {
            _hashCode += getInternalCurrencyUnitPrice().hashCode();
        }
        if (getInternalCurrencyAdjustedPrice() != null) {
            _hashCode += getInternalCurrencyAdjustedPrice().hashCode();
        }
        if (getInternalDescription() != null) {
            _hashCode += getInternalDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractServiceBundle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractServiceBundle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
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
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustedPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdjustedPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuoteItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyAdjustedPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyAdjustedPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalDescription"));
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
