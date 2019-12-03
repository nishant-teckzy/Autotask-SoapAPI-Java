/**
 * HolidaySet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class HolidaySet  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object holidaySetName;

    private java.lang.Object holidaySetDescription;

    public HolidaySet() {
    }

    public HolidaySet(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object holidaySetName,
           java.lang.Object holidaySetDescription) {
        super(
            fields,
            id,
            userDefinedFields);
        this.holidaySetName = holidaySetName;
        this.holidaySetDescription = holidaySetDescription;
    }


    /**
     * Gets the holidaySetName value for this HolidaySet.
     * 
     * @return holidaySetName
     */
    public java.lang.Object getHolidaySetName() {
        return holidaySetName;
    }


    /**
     * Sets the holidaySetName value for this HolidaySet.
     * 
     * @param holidaySetName
     */
    public void setHolidaySetName(java.lang.Object holidaySetName) {
        this.holidaySetName = holidaySetName;
    }


    /**
     * Gets the holidaySetDescription value for this HolidaySet.
     * 
     * @return holidaySetDescription
     */
    public java.lang.Object getHolidaySetDescription() {
        return holidaySetDescription;
    }


    /**
     * Sets the holidaySetDescription value for this HolidaySet.
     * 
     * @param holidaySetDescription
     */
    public void setHolidaySetDescription(java.lang.Object holidaySetDescription) {
        this.holidaySetDescription = holidaySetDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HolidaySet)) return false;
        HolidaySet other = (HolidaySet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.holidaySetName==null && other.getHolidaySetName()==null) || 
             (this.holidaySetName!=null &&
              this.holidaySetName.equals(other.getHolidaySetName()))) &&
            ((this.holidaySetDescription==null && other.getHolidaySetDescription()==null) || 
             (this.holidaySetDescription!=null &&
              this.holidaySetDescription.equals(other.getHolidaySetDescription())));
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
        if (getHolidaySetName() != null) {
            _hashCode += getHolidaySetName().hashCode();
        }
        if (getHolidaySetDescription() != null) {
            _hashCode += getHolidaySetDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HolidaySet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HolidaySet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidaySetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HolidaySetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidaySetDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HolidaySetDescription"));
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
