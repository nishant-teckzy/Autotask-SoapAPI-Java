/**
 * BusinessDivisionSubdivision.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class BusinessDivisionSubdivision  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object businessDivisionID;

    private java.lang.Object businessSubdivisionID;

    private java.lang.Object active;

    public BusinessDivisionSubdivision() {
    }

    public BusinessDivisionSubdivision(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object businessDivisionID,
           java.lang.Object businessSubdivisionID,
           java.lang.Object active) {
        super(
            fields,
            id,
            userDefinedFields);
        this.businessDivisionID = businessDivisionID;
        this.businessSubdivisionID = businessSubdivisionID;
        this.active = active;
    }


    /**
     * Gets the businessDivisionID value for this BusinessDivisionSubdivision.
     * 
     * @return businessDivisionID
     */
    public java.lang.Object getBusinessDivisionID() {
        return businessDivisionID;
    }


    /**
     * Sets the businessDivisionID value for this BusinessDivisionSubdivision.
     * 
     * @param businessDivisionID
     */
    public void setBusinessDivisionID(java.lang.Object businessDivisionID) {
        this.businessDivisionID = businessDivisionID;
    }


    /**
     * Gets the businessSubdivisionID value for this BusinessDivisionSubdivision.
     * 
     * @return businessSubdivisionID
     */
    public java.lang.Object getBusinessSubdivisionID() {
        return businessSubdivisionID;
    }


    /**
     * Sets the businessSubdivisionID value for this BusinessDivisionSubdivision.
     * 
     * @param businessSubdivisionID
     */
    public void setBusinessSubdivisionID(java.lang.Object businessSubdivisionID) {
        this.businessSubdivisionID = businessSubdivisionID;
    }


    /**
     * Gets the active value for this BusinessDivisionSubdivision.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this BusinessDivisionSubdivision.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessDivisionSubdivision)) return false;
        BusinessDivisionSubdivision other = (BusinessDivisionSubdivision) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessDivisionID==null && other.getBusinessDivisionID()==null) || 
             (this.businessDivisionID!=null &&
              this.businessDivisionID.equals(other.getBusinessDivisionID()))) &&
            ((this.businessSubdivisionID==null && other.getBusinessSubdivisionID()==null) || 
             (this.businessSubdivisionID!=null &&
              this.businessSubdivisionID.equals(other.getBusinessSubdivisionID()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive())));
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
        if (getBusinessDivisionID() != null) {
            _hashCode += getBusinessDivisionID().hashCode();
        }
        if (getBusinessSubdivisionID() != null) {
            _hashCode += getBusinessSubdivisionID().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessDivisionSubdivision.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BusinessDivisionSubdivision"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessDivisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BusinessDivisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessSubdivisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BusinessSubdivisionID"));
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
