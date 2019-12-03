/**
 * ContractServiceBundleAdjustment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractServiceBundleAdjustment  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object contractID;

    private java.lang.Object serviceBundleID;

    private java.lang.Object effectiveDate;

    private java.lang.Object unitChange;

    private java.lang.Object adjustedUnitPrice;

    private java.lang.Object quoteItemID;

    private java.lang.Object contractServiceBundleID;

    private java.lang.Object allowRepeatServiceBundle;

    public ContractServiceBundleAdjustment() {
    }

    public ContractServiceBundleAdjustment(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object contractID,
           java.lang.Object serviceBundleID,
           java.lang.Object effectiveDate,
           java.lang.Object unitChange,
           java.lang.Object adjustedUnitPrice,
           java.lang.Object quoteItemID,
           java.lang.Object contractServiceBundleID,
           java.lang.Object allowRepeatServiceBundle) {
        super(
            fields,
            id,
            userDefinedFields);
        this.contractID = contractID;
        this.serviceBundleID = serviceBundleID;
        this.effectiveDate = effectiveDate;
        this.unitChange = unitChange;
        this.adjustedUnitPrice = adjustedUnitPrice;
        this.quoteItemID = quoteItemID;
        this.contractServiceBundleID = contractServiceBundleID;
        this.allowRepeatServiceBundle = allowRepeatServiceBundle;
    }


    /**
     * Gets the contractID value for this ContractServiceBundleAdjustment.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ContractServiceBundleAdjustment.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the serviceBundleID value for this ContractServiceBundleAdjustment.
     * 
     * @return serviceBundleID
     */
    public java.lang.Object getServiceBundleID() {
        return serviceBundleID;
    }


    /**
     * Sets the serviceBundleID value for this ContractServiceBundleAdjustment.
     * 
     * @param serviceBundleID
     */
    public void setServiceBundleID(java.lang.Object serviceBundleID) {
        this.serviceBundleID = serviceBundleID;
    }


    /**
     * Gets the effectiveDate value for this ContractServiceBundleAdjustment.
     * 
     * @return effectiveDate
     */
    public java.lang.Object getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ContractServiceBundleAdjustment.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.Object effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the unitChange value for this ContractServiceBundleAdjustment.
     * 
     * @return unitChange
     */
    public java.lang.Object getUnitChange() {
        return unitChange;
    }


    /**
     * Sets the unitChange value for this ContractServiceBundleAdjustment.
     * 
     * @param unitChange
     */
    public void setUnitChange(java.lang.Object unitChange) {
        this.unitChange = unitChange;
    }


    /**
     * Gets the adjustedUnitPrice value for this ContractServiceBundleAdjustment.
     * 
     * @return adjustedUnitPrice
     */
    public java.lang.Object getAdjustedUnitPrice() {
        return adjustedUnitPrice;
    }


    /**
     * Sets the adjustedUnitPrice value for this ContractServiceBundleAdjustment.
     * 
     * @param adjustedUnitPrice
     */
    public void setAdjustedUnitPrice(java.lang.Object adjustedUnitPrice) {
        this.adjustedUnitPrice = adjustedUnitPrice;
    }


    /**
     * Gets the quoteItemID value for this ContractServiceBundleAdjustment.
     * 
     * @return quoteItemID
     */
    public java.lang.Object getQuoteItemID() {
        return quoteItemID;
    }


    /**
     * Sets the quoteItemID value for this ContractServiceBundleAdjustment.
     * 
     * @param quoteItemID
     */
    public void setQuoteItemID(java.lang.Object quoteItemID) {
        this.quoteItemID = quoteItemID;
    }


    /**
     * Gets the contractServiceBundleID value for this ContractServiceBundleAdjustment.
     * 
     * @return contractServiceBundleID
     */
    public java.lang.Object getContractServiceBundleID() {
        return contractServiceBundleID;
    }


    /**
     * Sets the contractServiceBundleID value for this ContractServiceBundleAdjustment.
     * 
     * @param contractServiceBundleID
     */
    public void setContractServiceBundleID(java.lang.Object contractServiceBundleID) {
        this.contractServiceBundleID = contractServiceBundleID;
    }


    /**
     * Gets the allowRepeatServiceBundle value for this ContractServiceBundleAdjustment.
     * 
     * @return allowRepeatServiceBundle
     */
    public java.lang.Object getAllowRepeatServiceBundle() {
        return allowRepeatServiceBundle;
    }


    /**
     * Sets the allowRepeatServiceBundle value for this ContractServiceBundleAdjustment.
     * 
     * @param allowRepeatServiceBundle
     */
    public void setAllowRepeatServiceBundle(java.lang.Object allowRepeatServiceBundle) {
        this.allowRepeatServiceBundle = allowRepeatServiceBundle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractServiceBundleAdjustment)) return false;
        ContractServiceBundleAdjustment other = (ContractServiceBundleAdjustment) obj;
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
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.unitChange==null && other.getUnitChange()==null) || 
             (this.unitChange!=null &&
              this.unitChange.equals(other.getUnitChange()))) &&
            ((this.adjustedUnitPrice==null && other.getAdjustedUnitPrice()==null) || 
             (this.adjustedUnitPrice!=null &&
              this.adjustedUnitPrice.equals(other.getAdjustedUnitPrice()))) &&
            ((this.quoteItemID==null && other.getQuoteItemID()==null) || 
             (this.quoteItemID!=null &&
              this.quoteItemID.equals(other.getQuoteItemID()))) &&
            ((this.contractServiceBundleID==null && other.getContractServiceBundleID()==null) || 
             (this.contractServiceBundleID!=null &&
              this.contractServiceBundleID.equals(other.getContractServiceBundleID()))) &&
            ((this.allowRepeatServiceBundle==null && other.getAllowRepeatServiceBundle()==null) || 
             (this.allowRepeatServiceBundle!=null &&
              this.allowRepeatServiceBundle.equals(other.getAllowRepeatServiceBundle())));
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
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getUnitChange() != null) {
            _hashCode += getUnitChange().hashCode();
        }
        if (getAdjustedUnitPrice() != null) {
            _hashCode += getAdjustedUnitPrice().hashCode();
        }
        if (getQuoteItemID() != null) {
            _hashCode += getQuoteItemID().hashCode();
        }
        if (getContractServiceBundleID() != null) {
            _hashCode += getContractServiceBundleID().hashCode();
        }
        if (getAllowRepeatServiceBundle() != null) {
            _hashCode += getAllowRepeatServiceBundle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractServiceBundleAdjustment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractServiceBundleAdjustment"));
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
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UnitChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustedUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdjustedUnitPrice"));
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
        elemField.setFieldName("contractServiceBundleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractServiceBundleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowRepeatServiceBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AllowRepeatServiceBundle"));
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
