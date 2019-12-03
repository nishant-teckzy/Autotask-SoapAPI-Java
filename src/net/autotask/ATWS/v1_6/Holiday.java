/**
 * Holiday.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Holiday  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object holidayName;

    private java.lang.Object holidayDate;

    private java.lang.Object holidaySetID;

    public Holiday() {
    }

    public Holiday(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object holidayName,
           java.lang.Object holidayDate,
           java.lang.Object holidaySetID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.holidayName = holidayName;
        this.holidayDate = holidayDate;
        this.holidaySetID = holidaySetID;
    }


    /**
     * Gets the holidayName value for this Holiday.
     * 
     * @return holidayName
     */
    public java.lang.Object getHolidayName() {
        return holidayName;
    }


    /**
     * Sets the holidayName value for this Holiday.
     * 
     * @param holidayName
     */
    public void setHolidayName(java.lang.Object holidayName) {
        this.holidayName = holidayName;
    }


    /**
     * Gets the holidayDate value for this Holiday.
     * 
     * @return holidayDate
     */
    public java.lang.Object getHolidayDate() {
        return holidayDate;
    }


    /**
     * Sets the holidayDate value for this Holiday.
     * 
     * @param holidayDate
     */
    public void setHolidayDate(java.lang.Object holidayDate) {
        this.holidayDate = holidayDate;
    }


    /**
     * Gets the holidaySetID value for this Holiday.
     * 
     * @return holidaySetID
     */
    public java.lang.Object getHolidaySetID() {
        return holidaySetID;
    }


    /**
     * Sets the holidaySetID value for this Holiday.
     * 
     * @param holidaySetID
     */
    public void setHolidaySetID(java.lang.Object holidaySetID) {
        this.holidaySetID = holidaySetID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Holiday)) return false;
        Holiday other = (Holiday) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.holidayName==null && other.getHolidayName()==null) || 
             (this.holidayName!=null &&
              this.holidayName.equals(other.getHolidayName()))) &&
            ((this.holidayDate==null && other.getHolidayDate()==null) || 
             (this.holidayDate!=null &&
              this.holidayDate.equals(other.getHolidayDate()))) &&
            ((this.holidaySetID==null && other.getHolidaySetID()==null) || 
             (this.holidaySetID!=null &&
              this.holidaySetID.equals(other.getHolidaySetID())));
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
        if (getHolidayName() != null) {
            _hashCode += getHolidayName().hashCode();
        }
        if (getHolidayDate() != null) {
            _hashCode += getHolidayDate().hashCode();
        }
        if (getHolidaySetID() != null) {
            _hashCode += getHolidaySetID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Holiday.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Holiday"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HolidayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidayDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HolidayDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidaySetID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HolidaySetID"));
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
