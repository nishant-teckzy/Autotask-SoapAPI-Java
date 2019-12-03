/**
 * PriceListRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class PriceListRole  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object roleID;

    private java.lang.Object currencyID;

    private java.lang.Object usesInternalCurrencyPrice;

    private java.lang.Object hourlyRate;

    public PriceListRole() {
    }

    public PriceListRole(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object roleID,
           java.lang.Object currencyID,
           java.lang.Object usesInternalCurrencyPrice,
           java.lang.Object hourlyRate) {
        super(
            fields,
            id,
            userDefinedFields);
        this.roleID = roleID;
        this.currencyID = currencyID;
        this.usesInternalCurrencyPrice = usesInternalCurrencyPrice;
        this.hourlyRate = hourlyRate;
    }


    /**
     * Gets the roleID value for this PriceListRole.
     * 
     * @return roleID
     */
    public java.lang.Object getRoleID() {
        return roleID;
    }


    /**
     * Sets the roleID value for this PriceListRole.
     * 
     * @param roleID
     */
    public void setRoleID(java.lang.Object roleID) {
        this.roleID = roleID;
    }


    /**
     * Gets the currencyID value for this PriceListRole.
     * 
     * @return currencyID
     */
    public java.lang.Object getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this PriceListRole.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.lang.Object currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the usesInternalCurrencyPrice value for this PriceListRole.
     * 
     * @return usesInternalCurrencyPrice
     */
    public java.lang.Object getUsesInternalCurrencyPrice() {
        return usesInternalCurrencyPrice;
    }


    /**
     * Sets the usesInternalCurrencyPrice value for this PriceListRole.
     * 
     * @param usesInternalCurrencyPrice
     */
    public void setUsesInternalCurrencyPrice(java.lang.Object usesInternalCurrencyPrice) {
        this.usesInternalCurrencyPrice = usesInternalCurrencyPrice;
    }


    /**
     * Gets the hourlyRate value for this PriceListRole.
     * 
     * @return hourlyRate
     */
    public java.lang.Object getHourlyRate() {
        return hourlyRate;
    }


    /**
     * Sets the hourlyRate value for this PriceListRole.
     * 
     * @param hourlyRate
     */
    public void setHourlyRate(java.lang.Object hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceListRole)) return false;
        PriceListRole other = (PriceListRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.roleID==null && other.getRoleID()==null) || 
             (this.roleID!=null &&
              this.roleID.equals(other.getRoleID()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.usesInternalCurrencyPrice==null && other.getUsesInternalCurrencyPrice()==null) || 
             (this.usesInternalCurrencyPrice!=null &&
              this.usesInternalCurrencyPrice.equals(other.getUsesInternalCurrencyPrice()))) &&
            ((this.hourlyRate==null && other.getHourlyRate()==null) || 
             (this.hourlyRate!=null &&
              this.hourlyRate.equals(other.getHourlyRate())));
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
        if (getRoleID() != null) {
            _hashCode += getRoleID().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getUsesInternalCurrencyPrice() != null) {
            _hashCode += getUsesInternalCurrencyPrice().hashCode();
        }
        if (getHourlyRate() != null) {
            _hashCode += getHourlyRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceListRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PriceListRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RoleID"));
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
        elemField.setFieldName("hourlyRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HourlyRate"));
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
