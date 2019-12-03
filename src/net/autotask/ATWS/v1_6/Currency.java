/**
 * Currency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Currency  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object name;

    private java.lang.Object description;

    private java.lang.Object displaySymbol;

    private java.lang.Object exchangeRate;

    private java.lang.Object lastModifiedDateTime;

    private java.lang.Object updateResourceId;

    private java.lang.Object isInternalCurrency;

    private java.lang.Object active;

    private java.lang.Object currencyPositiveFormat;

    private java.lang.Object currencyNegativeFormat;

    public Currency() {
    }

    public Currency(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object name,
           java.lang.Object description,
           java.lang.Object displaySymbol,
           java.lang.Object exchangeRate,
           java.lang.Object lastModifiedDateTime,
           java.lang.Object updateResourceId,
           java.lang.Object isInternalCurrency,
           java.lang.Object active,
           java.lang.Object currencyPositiveFormat,
           java.lang.Object currencyNegativeFormat) {
        super(
            fields,
            id,
            userDefinedFields);
        this.name = name;
        this.description = description;
        this.displaySymbol = displaySymbol;
        this.exchangeRate = exchangeRate;
        this.lastModifiedDateTime = lastModifiedDateTime;
        this.updateResourceId = updateResourceId;
        this.isInternalCurrency = isInternalCurrency;
        this.active = active;
        this.currencyPositiveFormat = currencyPositiveFormat;
        this.currencyNegativeFormat = currencyNegativeFormat;
    }


    /**
     * Gets the name value for this Currency.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this Currency.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the description value for this Currency.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Currency.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the displaySymbol value for this Currency.
     * 
     * @return displaySymbol
     */
    public java.lang.Object getDisplaySymbol() {
        return displaySymbol;
    }


    /**
     * Sets the displaySymbol value for this Currency.
     * 
     * @param displaySymbol
     */
    public void setDisplaySymbol(java.lang.Object displaySymbol) {
        this.displaySymbol = displaySymbol;
    }


    /**
     * Gets the exchangeRate value for this Currency.
     * 
     * @return exchangeRate
     */
    public java.lang.Object getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this Currency.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Object exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the lastModifiedDateTime value for this Currency.
     * 
     * @return lastModifiedDateTime
     */
    public java.lang.Object getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Currency.
     * 
     * @param lastModifiedDateTime
     */
    public void setLastModifiedDateTime(java.lang.Object lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the updateResourceId value for this Currency.
     * 
     * @return updateResourceId
     */
    public java.lang.Object getUpdateResourceId() {
        return updateResourceId;
    }


    /**
     * Sets the updateResourceId value for this Currency.
     * 
     * @param updateResourceId
     */
    public void setUpdateResourceId(java.lang.Object updateResourceId) {
        this.updateResourceId = updateResourceId;
    }


    /**
     * Gets the isInternalCurrency value for this Currency.
     * 
     * @return isInternalCurrency
     */
    public java.lang.Object getIsInternalCurrency() {
        return isInternalCurrency;
    }


    /**
     * Sets the isInternalCurrency value for this Currency.
     * 
     * @param isInternalCurrency
     */
    public void setIsInternalCurrency(java.lang.Object isInternalCurrency) {
        this.isInternalCurrency = isInternalCurrency;
    }


    /**
     * Gets the active value for this Currency.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this Currency.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the currencyPositiveFormat value for this Currency.
     * 
     * @return currencyPositiveFormat
     */
    public java.lang.Object getCurrencyPositiveFormat() {
        return currencyPositiveFormat;
    }


    /**
     * Sets the currencyPositiveFormat value for this Currency.
     * 
     * @param currencyPositiveFormat
     */
    public void setCurrencyPositiveFormat(java.lang.Object currencyPositiveFormat) {
        this.currencyPositiveFormat = currencyPositiveFormat;
    }


    /**
     * Gets the currencyNegativeFormat value for this Currency.
     * 
     * @return currencyNegativeFormat
     */
    public java.lang.Object getCurrencyNegativeFormat() {
        return currencyNegativeFormat;
    }


    /**
     * Sets the currencyNegativeFormat value for this Currency.
     * 
     * @param currencyNegativeFormat
     */
    public void setCurrencyNegativeFormat(java.lang.Object currencyNegativeFormat) {
        this.currencyNegativeFormat = currencyNegativeFormat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Currency)) return false;
        Currency other = (Currency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.displaySymbol==null && other.getDisplaySymbol()==null) || 
             (this.displaySymbol!=null &&
              this.displaySymbol.equals(other.getDisplaySymbol()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.updateResourceId==null && other.getUpdateResourceId()==null) || 
             (this.updateResourceId!=null &&
              this.updateResourceId.equals(other.getUpdateResourceId()))) &&
            ((this.isInternalCurrency==null && other.getIsInternalCurrency()==null) || 
             (this.isInternalCurrency!=null &&
              this.isInternalCurrency.equals(other.getIsInternalCurrency()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.currencyPositiveFormat==null && other.getCurrencyPositiveFormat()==null) || 
             (this.currencyPositiveFormat!=null &&
              this.currencyPositiveFormat.equals(other.getCurrencyPositiveFormat()))) &&
            ((this.currencyNegativeFormat==null && other.getCurrencyNegativeFormat()==null) || 
             (this.currencyNegativeFormat!=null &&
              this.currencyNegativeFormat.equals(other.getCurrencyNegativeFormat())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisplaySymbol() != null) {
            _hashCode += getDisplaySymbol().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getUpdateResourceId() != null) {
            _hashCode += getUpdateResourceId().hashCode();
        }
        if (getIsInternalCurrency() != null) {
            _hashCode += getIsInternalCurrency().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getCurrencyPositiveFormat() != null) {
            _hashCode += getCurrencyPositiveFormat().hashCode();
        }
        if (getCurrencyNegativeFormat() != null) {
            _hashCode += getCurrencyNegativeFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Currency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Currency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
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
        elemField.setFieldName("displaySymbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DisplaySymbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateResourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UpdateResourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInternalCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsInternalCurrency"));
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
        elemField.setFieldName("currencyPositiveFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CurrencyPositiveFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyNegativeFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CurrencyNegativeFormat"));
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
