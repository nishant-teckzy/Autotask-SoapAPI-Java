/**
 * PriceListWorkTypeModifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class PriceListWorkTypeModifier  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object workTypeModifierID;

    private java.lang.Object modifierValue;

    private java.lang.Object modifierType;

    private java.lang.Object currencyID;

    private java.lang.Object usesInternalCurrencyPrice;

    public PriceListWorkTypeModifier() {
    }

    public PriceListWorkTypeModifier(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object workTypeModifierID,
           java.lang.Object modifierValue,
           java.lang.Object modifierType,
           java.lang.Object currencyID,
           java.lang.Object usesInternalCurrencyPrice) {
        super(
            fields,
            id,
            userDefinedFields);
        this.workTypeModifierID = workTypeModifierID;
        this.modifierValue = modifierValue;
        this.modifierType = modifierType;
        this.currencyID = currencyID;
        this.usesInternalCurrencyPrice = usesInternalCurrencyPrice;
    }


    /**
     * Gets the workTypeModifierID value for this PriceListWorkTypeModifier.
     * 
     * @return workTypeModifierID
     */
    public java.lang.Object getWorkTypeModifierID() {
        return workTypeModifierID;
    }


    /**
     * Sets the workTypeModifierID value for this PriceListWorkTypeModifier.
     * 
     * @param workTypeModifierID
     */
    public void setWorkTypeModifierID(java.lang.Object workTypeModifierID) {
        this.workTypeModifierID = workTypeModifierID;
    }


    /**
     * Gets the modifierValue value for this PriceListWorkTypeModifier.
     * 
     * @return modifierValue
     */
    public java.lang.Object getModifierValue() {
        return modifierValue;
    }


    /**
     * Sets the modifierValue value for this PriceListWorkTypeModifier.
     * 
     * @param modifierValue
     */
    public void setModifierValue(java.lang.Object modifierValue) {
        this.modifierValue = modifierValue;
    }


    /**
     * Gets the modifierType value for this PriceListWorkTypeModifier.
     * 
     * @return modifierType
     */
    public java.lang.Object getModifierType() {
        return modifierType;
    }


    /**
     * Sets the modifierType value for this PriceListWorkTypeModifier.
     * 
     * @param modifierType
     */
    public void setModifierType(java.lang.Object modifierType) {
        this.modifierType = modifierType;
    }


    /**
     * Gets the currencyID value for this PriceListWorkTypeModifier.
     * 
     * @return currencyID
     */
    public java.lang.Object getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this PriceListWorkTypeModifier.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.lang.Object currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the usesInternalCurrencyPrice value for this PriceListWorkTypeModifier.
     * 
     * @return usesInternalCurrencyPrice
     */
    public java.lang.Object getUsesInternalCurrencyPrice() {
        return usesInternalCurrencyPrice;
    }


    /**
     * Sets the usesInternalCurrencyPrice value for this PriceListWorkTypeModifier.
     * 
     * @param usesInternalCurrencyPrice
     */
    public void setUsesInternalCurrencyPrice(java.lang.Object usesInternalCurrencyPrice) {
        this.usesInternalCurrencyPrice = usesInternalCurrencyPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceListWorkTypeModifier)) return false;
        PriceListWorkTypeModifier other = (PriceListWorkTypeModifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.workTypeModifierID==null && other.getWorkTypeModifierID()==null) || 
             (this.workTypeModifierID!=null &&
              this.workTypeModifierID.equals(other.getWorkTypeModifierID()))) &&
            ((this.modifierValue==null && other.getModifierValue()==null) || 
             (this.modifierValue!=null &&
              this.modifierValue.equals(other.getModifierValue()))) &&
            ((this.modifierType==null && other.getModifierType()==null) || 
             (this.modifierType!=null &&
              this.modifierType.equals(other.getModifierType()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.usesInternalCurrencyPrice==null && other.getUsesInternalCurrencyPrice()==null) || 
             (this.usesInternalCurrencyPrice!=null &&
              this.usesInternalCurrencyPrice.equals(other.getUsesInternalCurrencyPrice())));
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
        if (getWorkTypeModifierID() != null) {
            _hashCode += getWorkTypeModifierID().hashCode();
        }
        if (getModifierValue() != null) {
            _hashCode += getModifierValue().hashCode();
        }
        if (getModifierType() != null) {
            _hashCode += getModifierType().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getUsesInternalCurrencyPrice() != null) {
            _hashCode += getUsesInternalCurrencyPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceListWorkTypeModifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PriceListWorkTypeModifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workTypeModifierID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WorkTypeModifierID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifierValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ModifierValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifierType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ModifierType"));
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
