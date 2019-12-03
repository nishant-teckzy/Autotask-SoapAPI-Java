/**
 * UserDefinedFieldListItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class UserDefinedFieldListItem  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object udfFieldId;

    private java.lang.Object valueForExport;

    private java.lang.Object valueForDisplay;

    private java.lang.Object createDate;

    public UserDefinedFieldListItem() {
    }

    public UserDefinedFieldListItem(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object udfFieldId,
           java.lang.Object valueForExport,
           java.lang.Object valueForDisplay,
           java.lang.Object createDate) {
        super(
            fields,
            id,
            userDefinedFields);
        this.udfFieldId = udfFieldId;
        this.valueForExport = valueForExport;
        this.valueForDisplay = valueForDisplay;
        this.createDate = createDate;
    }


    /**
     * Gets the udfFieldId value for this UserDefinedFieldListItem.
     * 
     * @return udfFieldId
     */
    public java.lang.Object getUdfFieldId() {
        return udfFieldId;
    }


    /**
     * Sets the udfFieldId value for this UserDefinedFieldListItem.
     * 
     * @param udfFieldId
     */
    public void setUdfFieldId(java.lang.Object udfFieldId) {
        this.udfFieldId = udfFieldId;
    }


    /**
     * Gets the valueForExport value for this UserDefinedFieldListItem.
     * 
     * @return valueForExport
     */
    public java.lang.Object getValueForExport() {
        return valueForExport;
    }


    /**
     * Sets the valueForExport value for this UserDefinedFieldListItem.
     * 
     * @param valueForExport
     */
    public void setValueForExport(java.lang.Object valueForExport) {
        this.valueForExport = valueForExport;
    }


    /**
     * Gets the valueForDisplay value for this UserDefinedFieldListItem.
     * 
     * @return valueForDisplay
     */
    public java.lang.Object getValueForDisplay() {
        return valueForDisplay;
    }


    /**
     * Sets the valueForDisplay value for this UserDefinedFieldListItem.
     * 
     * @param valueForDisplay
     */
    public void setValueForDisplay(java.lang.Object valueForDisplay) {
        this.valueForDisplay = valueForDisplay;
    }


    /**
     * Gets the createDate value for this UserDefinedFieldListItem.
     * 
     * @return createDate
     */
    public java.lang.Object getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this UserDefinedFieldListItem.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.Object createDate) {
        this.createDate = createDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDefinedFieldListItem)) return false;
        UserDefinedFieldListItem other = (UserDefinedFieldListItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.udfFieldId==null && other.getUdfFieldId()==null) || 
             (this.udfFieldId!=null &&
              this.udfFieldId.equals(other.getUdfFieldId()))) &&
            ((this.valueForExport==null && other.getValueForExport()==null) || 
             (this.valueForExport!=null &&
              this.valueForExport.equals(other.getValueForExport()))) &&
            ((this.valueForDisplay==null && other.getValueForDisplay()==null) || 
             (this.valueForDisplay!=null &&
              this.valueForDisplay.equals(other.getValueForDisplay()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate())));
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
        if (getUdfFieldId() != null) {
            _hashCode += getUdfFieldId().hashCode();
        }
        if (getValueForExport() != null) {
            _hashCode += getValueForExport().hashCode();
        }
        if (getValueForDisplay() != null) {
            _hashCode += getValueForDisplay().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDefinedFieldListItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UserDefinedFieldListItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udfFieldId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UdfFieldId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueForExport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ValueForExport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueForDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ValueForDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateDate"));
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
