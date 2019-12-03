/**
 * ContractServiceAdjustment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractServiceAdjustment  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object contractID;

    private java.lang.Object serviceID;

    private java.lang.Object effectiveDate;

    private java.lang.Object unitChange;

    private java.lang.Object adjustedUnitPrice;

    private java.lang.Object adjustedUnitCost;

    private java.lang.Object quoteItemID;

    private java.lang.Object contractServiceID;

    private java.lang.Object allowRepeatService;

    public ContractServiceAdjustment() {
    }

    public ContractServiceAdjustment(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object contractID,
           java.lang.Object serviceID,
           java.lang.Object effectiveDate,
           java.lang.Object unitChange,
           java.lang.Object adjustedUnitPrice,
           java.lang.Object adjustedUnitCost,
           java.lang.Object quoteItemID,
           java.lang.Object contractServiceID,
           java.lang.Object allowRepeatService) {
        super(
            fields,
            id,
            userDefinedFields);
        this.contractID = contractID;
        this.serviceID = serviceID;
        this.effectiveDate = effectiveDate;
        this.unitChange = unitChange;
        this.adjustedUnitPrice = adjustedUnitPrice;
        this.adjustedUnitCost = adjustedUnitCost;
        this.quoteItemID = quoteItemID;
        this.contractServiceID = contractServiceID;
        this.allowRepeatService = allowRepeatService;
    }


    /**
     * Gets the contractID value for this ContractServiceAdjustment.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ContractServiceAdjustment.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the serviceID value for this ContractServiceAdjustment.
     * 
     * @return serviceID
     */
    public java.lang.Object getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this ContractServiceAdjustment.
     * 
     * @param serviceID
     */
    public void setServiceID(java.lang.Object serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the effectiveDate value for this ContractServiceAdjustment.
     * 
     * @return effectiveDate
     */
    public java.lang.Object getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ContractServiceAdjustment.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.Object effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the unitChange value for this ContractServiceAdjustment.
     * 
     * @return unitChange
     */
    public java.lang.Object getUnitChange() {
        return unitChange;
    }


    /**
     * Sets the unitChange value for this ContractServiceAdjustment.
     * 
     * @param unitChange
     */
    public void setUnitChange(java.lang.Object unitChange) {
        this.unitChange = unitChange;
    }


    /**
     * Gets the adjustedUnitPrice value for this ContractServiceAdjustment.
     * 
     * @return adjustedUnitPrice
     */
    public java.lang.Object getAdjustedUnitPrice() {
        return adjustedUnitPrice;
    }


    /**
     * Sets the adjustedUnitPrice value for this ContractServiceAdjustment.
     * 
     * @param adjustedUnitPrice
     */
    public void setAdjustedUnitPrice(java.lang.Object adjustedUnitPrice) {
        this.adjustedUnitPrice = adjustedUnitPrice;
    }


    /**
     * Gets the adjustedUnitCost value for this ContractServiceAdjustment.
     * 
     * @return adjustedUnitCost
     */
    public java.lang.Object getAdjustedUnitCost() {
        return adjustedUnitCost;
    }


    /**
     * Sets the adjustedUnitCost value for this ContractServiceAdjustment.
     * 
     * @param adjustedUnitCost
     */
    public void setAdjustedUnitCost(java.lang.Object adjustedUnitCost) {
        this.adjustedUnitCost = adjustedUnitCost;
    }


    /**
     * Gets the quoteItemID value for this ContractServiceAdjustment.
     * 
     * @return quoteItemID
     */
    public java.lang.Object getQuoteItemID() {
        return quoteItemID;
    }


    /**
     * Sets the quoteItemID value for this ContractServiceAdjustment.
     * 
     * @param quoteItemID
     */
    public void setQuoteItemID(java.lang.Object quoteItemID) {
        this.quoteItemID = quoteItemID;
    }


    /**
     * Gets the contractServiceID value for this ContractServiceAdjustment.
     * 
     * @return contractServiceID
     */
    public java.lang.Object getContractServiceID() {
        return contractServiceID;
    }


    /**
     * Sets the contractServiceID value for this ContractServiceAdjustment.
     * 
     * @param contractServiceID
     */
    public void setContractServiceID(java.lang.Object contractServiceID) {
        this.contractServiceID = contractServiceID;
    }


    /**
     * Gets the allowRepeatService value for this ContractServiceAdjustment.
     * 
     * @return allowRepeatService
     */
    public java.lang.Object getAllowRepeatService() {
        return allowRepeatService;
    }


    /**
     * Sets the allowRepeatService value for this ContractServiceAdjustment.
     * 
     * @param allowRepeatService
     */
    public void setAllowRepeatService(java.lang.Object allowRepeatService) {
        this.allowRepeatService = allowRepeatService;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractServiceAdjustment)) return false;
        ContractServiceAdjustment other = (ContractServiceAdjustment) obj;
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
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.unitChange==null && other.getUnitChange()==null) || 
             (this.unitChange!=null &&
              this.unitChange.equals(other.getUnitChange()))) &&
            ((this.adjustedUnitPrice==null && other.getAdjustedUnitPrice()==null) || 
             (this.adjustedUnitPrice!=null &&
              this.adjustedUnitPrice.equals(other.getAdjustedUnitPrice()))) &&
            ((this.adjustedUnitCost==null && other.getAdjustedUnitCost()==null) || 
             (this.adjustedUnitCost!=null &&
              this.adjustedUnitCost.equals(other.getAdjustedUnitCost()))) &&
            ((this.quoteItemID==null && other.getQuoteItemID()==null) || 
             (this.quoteItemID!=null &&
              this.quoteItemID.equals(other.getQuoteItemID()))) &&
            ((this.contractServiceID==null && other.getContractServiceID()==null) || 
             (this.contractServiceID!=null &&
              this.contractServiceID.equals(other.getContractServiceID()))) &&
            ((this.allowRepeatService==null && other.getAllowRepeatService()==null) || 
             (this.allowRepeatService!=null &&
              this.allowRepeatService.equals(other.getAllowRepeatService())));
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
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
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
        if (getAdjustedUnitCost() != null) {
            _hashCode += getAdjustedUnitCost().hashCode();
        }
        if (getQuoteItemID() != null) {
            _hashCode += getQuoteItemID().hashCode();
        }
        if (getContractServiceID() != null) {
            _hashCode += getContractServiceID().hashCode();
        }
        if (getAllowRepeatService() != null) {
            _hashCode += getAllowRepeatService().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractServiceAdjustment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractServiceAdjustment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
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
        elemField.setFieldName("adjustedUnitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdjustedUnitCost"));
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
        elemField.setFieldName("contractServiceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractServiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowRepeatService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AllowRepeatService"));
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
