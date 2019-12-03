/**
 * InventoryItemSerialNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class InventoryItemSerialNumber  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object inventoryItemID;

    private java.lang.Object serialNumber;

    public InventoryItemSerialNumber() {
    }

    public InventoryItemSerialNumber(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object inventoryItemID,
           java.lang.Object serialNumber) {
        super(
            fields,
            id,
            userDefinedFields);
        this.inventoryItemID = inventoryItemID;
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the inventoryItemID value for this InventoryItemSerialNumber.
     * 
     * @return inventoryItemID
     */
    public java.lang.Object getInventoryItemID() {
        return inventoryItemID;
    }


    /**
     * Sets the inventoryItemID value for this InventoryItemSerialNumber.
     * 
     * @param inventoryItemID
     */
    public void setInventoryItemID(java.lang.Object inventoryItemID) {
        this.inventoryItemID = inventoryItemID;
    }


    /**
     * Gets the serialNumber value for this InventoryItemSerialNumber.
     * 
     * @return serialNumber
     */
    public java.lang.Object getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this InventoryItemSerialNumber.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.Object serialNumber) {
        this.serialNumber = serialNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryItemSerialNumber)) return false;
        InventoryItemSerialNumber other = (InventoryItemSerialNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.inventoryItemID==null && other.getInventoryItemID()==null) || 
             (this.inventoryItemID!=null &&
              this.inventoryItemID.equals(other.getInventoryItemID()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber())));
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
        if (getInventoryItemID() != null) {
            _hashCode += getInventoryItemID().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryItemSerialNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InventoryItemSerialNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InventoryItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SerialNumber"));
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
