/**
 * WorkTypeModifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class WorkTypeModifier  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object modifierValue;

    private java.lang.Object modifierType;

    public WorkTypeModifier() {
    }

    public WorkTypeModifier(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object modifierValue,
           java.lang.Object modifierType) {
        super(
            fields,
            id,
            userDefinedFields);
        this.modifierValue = modifierValue;
        this.modifierType = modifierType;
    }


    /**
     * Gets the modifierValue value for this WorkTypeModifier.
     * 
     * @return modifierValue
     */
    public java.lang.Object getModifierValue() {
        return modifierValue;
    }


    /**
     * Sets the modifierValue value for this WorkTypeModifier.
     * 
     * @param modifierValue
     */
    public void setModifierValue(java.lang.Object modifierValue) {
        this.modifierValue = modifierValue;
    }


    /**
     * Gets the modifierType value for this WorkTypeModifier.
     * 
     * @return modifierType
     */
    public java.lang.Object getModifierType() {
        return modifierType;
    }


    /**
     * Sets the modifierType value for this WorkTypeModifier.
     * 
     * @param modifierType
     */
    public void setModifierType(java.lang.Object modifierType) {
        this.modifierType = modifierType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkTypeModifier)) return false;
        WorkTypeModifier other = (WorkTypeModifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.modifierValue==null && other.getModifierValue()==null) || 
             (this.modifierValue!=null &&
              this.modifierValue.equals(other.getModifierValue()))) &&
            ((this.modifierType==null && other.getModifierType()==null) || 
             (this.modifierType!=null &&
              this.modifierType.equals(other.getModifierType())));
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
        if (getModifierValue() != null) {
            _hashCode += getModifierValue().hashCode();
        }
        if (getModifierType() != null) {
            _hashCode += getModifierType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkTypeModifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WorkTypeModifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
