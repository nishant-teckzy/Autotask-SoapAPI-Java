/**
 * ServiceCallTaskResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ServiceCallTaskResource  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object serviceCallTaskID;

    private java.lang.Object resourceID;

    public ServiceCallTaskResource() {
    }

    public ServiceCallTaskResource(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object serviceCallTaskID,
           java.lang.Object resourceID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.serviceCallTaskID = serviceCallTaskID;
        this.resourceID = resourceID;
    }


    /**
     * Gets the serviceCallTaskID value for this ServiceCallTaskResource.
     * 
     * @return serviceCallTaskID
     */
    public java.lang.Object getServiceCallTaskID() {
        return serviceCallTaskID;
    }


    /**
     * Sets the serviceCallTaskID value for this ServiceCallTaskResource.
     * 
     * @param serviceCallTaskID
     */
    public void setServiceCallTaskID(java.lang.Object serviceCallTaskID) {
        this.serviceCallTaskID = serviceCallTaskID;
    }


    /**
     * Gets the resourceID value for this ServiceCallTaskResource.
     * 
     * @return resourceID
     */
    public java.lang.Object getResourceID() {
        return resourceID;
    }


    /**
     * Sets the resourceID value for this ServiceCallTaskResource.
     * 
     * @param resourceID
     */
    public void setResourceID(java.lang.Object resourceID) {
        this.resourceID = resourceID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceCallTaskResource)) return false;
        ServiceCallTaskResource other = (ServiceCallTaskResource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceCallTaskID==null && other.getServiceCallTaskID()==null) || 
             (this.serviceCallTaskID!=null &&
              this.serviceCallTaskID.equals(other.getServiceCallTaskID()))) &&
            ((this.resourceID==null && other.getResourceID()==null) || 
             (this.resourceID!=null &&
              this.resourceID.equals(other.getResourceID())));
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
        if (getServiceCallTaskID() != null) {
            _hashCode += getServiceCallTaskID().hashCode();
        }
        if (getResourceID() != null) {
            _hashCode += getResourceID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceCallTaskResource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceCallTaskResource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCallTaskID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceCallTaskID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ResourceID"));
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
