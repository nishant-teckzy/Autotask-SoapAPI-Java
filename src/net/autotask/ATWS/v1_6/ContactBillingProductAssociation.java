/**
 * ContactBillingProductAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContactBillingProductAssociation  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object contactID;

    private java.lang.Object billingProductID;

    private java.lang.Object effectiveDate;

    private java.lang.Object expirationDate;

    public ContactBillingProductAssociation() {
    }

    public ContactBillingProductAssociation(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object contactID,
           java.lang.Object billingProductID,
           java.lang.Object effectiveDate,
           java.lang.Object expirationDate) {
        super(
            fields,
            id,
            userDefinedFields);
        this.contactID = contactID;
        this.billingProductID = billingProductID;
        this.effectiveDate = effectiveDate;
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the contactID value for this ContactBillingProductAssociation.
     * 
     * @return contactID
     */
    public java.lang.Object getContactID() {
        return contactID;
    }


    /**
     * Sets the contactID value for this ContactBillingProductAssociation.
     * 
     * @param contactID
     */
    public void setContactID(java.lang.Object contactID) {
        this.contactID = contactID;
    }


    /**
     * Gets the billingProductID value for this ContactBillingProductAssociation.
     * 
     * @return billingProductID
     */
    public java.lang.Object getBillingProductID() {
        return billingProductID;
    }


    /**
     * Sets the billingProductID value for this ContactBillingProductAssociation.
     * 
     * @param billingProductID
     */
    public void setBillingProductID(java.lang.Object billingProductID) {
        this.billingProductID = billingProductID;
    }


    /**
     * Gets the effectiveDate value for this ContactBillingProductAssociation.
     * 
     * @return effectiveDate
     */
    public java.lang.Object getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ContactBillingProductAssociation.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.Object effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expirationDate value for this ContactBillingProductAssociation.
     * 
     * @return expirationDate
     */
    public java.lang.Object getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this ContactBillingProductAssociation.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.Object expirationDate) {
        this.expirationDate = expirationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactBillingProductAssociation)) return false;
        ContactBillingProductAssociation other = (ContactBillingProductAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contactID==null && other.getContactID()==null) || 
             (this.contactID!=null &&
              this.contactID.equals(other.getContactID()))) &&
            ((this.billingProductID==null && other.getBillingProductID()==null) || 
             (this.billingProductID!=null &&
              this.billingProductID.equals(other.getBillingProductID()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate())));
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
        if (getContactID() != null) {
            _hashCode += getContactID().hashCode();
        }
        if (getBillingProductID() != null) {
            _hashCode += getBillingProductID().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactBillingProductAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContactBillingProductAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContactID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillingProductID"));
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
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpirationDate"));
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
