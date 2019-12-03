/**
 * PaymentTerm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class PaymentTerm  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object name;

    private java.lang.Object description;

    private java.lang.Object active;

    private java.lang.Object paymentDueInDays;

    public PaymentTerm() {
    }

    public PaymentTerm(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object name,
           java.lang.Object description,
           java.lang.Object active,
           java.lang.Object paymentDueInDays) {
        super(
            fields,
            id,
            userDefinedFields);
        this.name = name;
        this.description = description;
        this.active = active;
        this.paymentDueInDays = paymentDueInDays;
    }


    /**
     * Gets the name value for this PaymentTerm.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this PaymentTerm.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the description value for this PaymentTerm.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PaymentTerm.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the active value for this PaymentTerm.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this PaymentTerm.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the paymentDueInDays value for this PaymentTerm.
     * 
     * @return paymentDueInDays
     */
    public java.lang.Object getPaymentDueInDays() {
        return paymentDueInDays;
    }


    /**
     * Sets the paymentDueInDays value for this PaymentTerm.
     * 
     * @param paymentDueInDays
     */
    public void setPaymentDueInDays(java.lang.Object paymentDueInDays) {
        this.paymentDueInDays = paymentDueInDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentTerm)) return false;
        PaymentTerm other = (PaymentTerm) obj;
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
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.paymentDueInDays==null && other.getPaymentDueInDays()==null) || 
             (this.paymentDueInDays!=null &&
              this.paymentDueInDays.equals(other.getPaymentDueInDays())));
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getPaymentDueInDays() != null) {
            _hashCode += getPaymentDueInDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentTerm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PaymentTerm"));
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
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDueInDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PaymentDueInDays"));
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
