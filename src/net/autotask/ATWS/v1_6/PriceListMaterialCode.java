/**
 * PriceListMaterialCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class PriceListMaterialCode  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object allocationCodeID;

    private java.lang.Object currencyID;

    private java.lang.Object usesInternalCurrencyPrice;

    private java.lang.Object unitPrice;

    public PriceListMaterialCode() {
    }

    public PriceListMaterialCode(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object allocationCodeID,
           java.lang.Object currencyID,
           java.lang.Object usesInternalCurrencyPrice,
           java.lang.Object unitPrice) {
        super(
            fields,
            id,
            userDefinedFields);
        this.allocationCodeID = allocationCodeID;
        this.currencyID = currencyID;
        this.usesInternalCurrencyPrice = usesInternalCurrencyPrice;
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the allocationCodeID value for this PriceListMaterialCode.
     * 
     * @return allocationCodeID
     */
    public java.lang.Object getAllocationCodeID() {
        return allocationCodeID;
    }


    /**
     * Sets the allocationCodeID value for this PriceListMaterialCode.
     * 
     * @param allocationCodeID
     */
    public void setAllocationCodeID(java.lang.Object allocationCodeID) {
        this.allocationCodeID = allocationCodeID;
    }


    /**
     * Gets the currencyID value for this PriceListMaterialCode.
     * 
     * @return currencyID
     */
    public java.lang.Object getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this PriceListMaterialCode.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.lang.Object currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the usesInternalCurrencyPrice value for this PriceListMaterialCode.
     * 
     * @return usesInternalCurrencyPrice
     */
    public java.lang.Object getUsesInternalCurrencyPrice() {
        return usesInternalCurrencyPrice;
    }


    /**
     * Sets the usesInternalCurrencyPrice value for this PriceListMaterialCode.
     * 
     * @param usesInternalCurrencyPrice
     */
    public void setUsesInternalCurrencyPrice(java.lang.Object usesInternalCurrencyPrice) {
        this.usesInternalCurrencyPrice = usesInternalCurrencyPrice;
    }


    /**
     * Gets the unitPrice value for this PriceListMaterialCode.
     * 
     * @return unitPrice
     */
    public java.lang.Object getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this PriceListMaterialCode.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.lang.Object unitPrice) {
        this.unitPrice = unitPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceListMaterialCode)) return false;
        PriceListMaterialCode other = (PriceListMaterialCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allocationCodeID==null && other.getAllocationCodeID()==null) || 
             (this.allocationCodeID!=null &&
              this.allocationCodeID.equals(other.getAllocationCodeID()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.usesInternalCurrencyPrice==null && other.getUsesInternalCurrencyPrice()==null) || 
             (this.usesInternalCurrencyPrice!=null &&
              this.usesInternalCurrencyPrice.equals(other.getUsesInternalCurrencyPrice()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice())));
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
        if (getAllocationCodeID() != null) {
            _hashCode += getAllocationCodeID().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getUsesInternalCurrencyPrice() != null) {
            _hashCode += getUsesInternalCurrencyPrice().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceListMaterialCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PriceListMaterialCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AllocationCodeID"));
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
        elemField.setFieldName("usesInternalCurrencyPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UsesInternalCurrencyPrice"));
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
