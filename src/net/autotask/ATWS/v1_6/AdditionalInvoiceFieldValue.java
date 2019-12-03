/**
 * AdditionalInvoiceFieldValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class AdditionalInvoiceFieldValue  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object additionalInvoiceFieldID;

    private java.lang.Object invoiceBatchID;

    private java.lang.Object fieldValue;

    public AdditionalInvoiceFieldValue() {
    }

    public AdditionalInvoiceFieldValue(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object additionalInvoiceFieldID,
           java.lang.Object invoiceBatchID,
           java.lang.Object fieldValue) {
        super(
            fields,
            id,
            userDefinedFields);
        this.additionalInvoiceFieldID = additionalInvoiceFieldID;
        this.invoiceBatchID = invoiceBatchID;
        this.fieldValue = fieldValue;
    }


    /**
     * Gets the additionalInvoiceFieldID value for this AdditionalInvoiceFieldValue.
     * 
     * @return additionalInvoiceFieldID
     */
    public java.lang.Object getAdditionalInvoiceFieldID() {
        return additionalInvoiceFieldID;
    }


    /**
     * Sets the additionalInvoiceFieldID value for this AdditionalInvoiceFieldValue.
     * 
     * @param additionalInvoiceFieldID
     */
    public void setAdditionalInvoiceFieldID(java.lang.Object additionalInvoiceFieldID) {
        this.additionalInvoiceFieldID = additionalInvoiceFieldID;
    }


    /**
     * Gets the invoiceBatchID value for this AdditionalInvoiceFieldValue.
     * 
     * @return invoiceBatchID
     */
    public java.lang.Object getInvoiceBatchID() {
        return invoiceBatchID;
    }


    /**
     * Sets the invoiceBatchID value for this AdditionalInvoiceFieldValue.
     * 
     * @param invoiceBatchID
     */
    public void setInvoiceBatchID(java.lang.Object invoiceBatchID) {
        this.invoiceBatchID = invoiceBatchID;
    }


    /**
     * Gets the fieldValue value for this AdditionalInvoiceFieldValue.
     * 
     * @return fieldValue
     */
    public java.lang.Object getFieldValue() {
        return fieldValue;
    }


    /**
     * Sets the fieldValue value for this AdditionalInvoiceFieldValue.
     * 
     * @param fieldValue
     */
    public void setFieldValue(java.lang.Object fieldValue) {
        this.fieldValue = fieldValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdditionalInvoiceFieldValue)) return false;
        AdditionalInvoiceFieldValue other = (AdditionalInvoiceFieldValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.additionalInvoiceFieldID==null && other.getAdditionalInvoiceFieldID()==null) || 
             (this.additionalInvoiceFieldID!=null &&
              this.additionalInvoiceFieldID.equals(other.getAdditionalInvoiceFieldID()))) &&
            ((this.invoiceBatchID==null && other.getInvoiceBatchID()==null) || 
             (this.invoiceBatchID!=null &&
              this.invoiceBatchID.equals(other.getInvoiceBatchID()))) &&
            ((this.fieldValue==null && other.getFieldValue()==null) || 
             (this.fieldValue!=null &&
              this.fieldValue.equals(other.getFieldValue())));
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
        if (getAdditionalInvoiceFieldID() != null) {
            _hashCode += getAdditionalInvoiceFieldID().hashCode();
        }
        if (getInvoiceBatchID() != null) {
            _hashCode += getInvoiceBatchID().hashCode();
        }
        if (getFieldValue() != null) {
            _hashCode += getFieldValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdditionalInvoiceFieldValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdditionalInvoiceFieldValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInvoiceFieldID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdditionalInvoiceFieldID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceBatchID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceBatchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FieldValue"));
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
