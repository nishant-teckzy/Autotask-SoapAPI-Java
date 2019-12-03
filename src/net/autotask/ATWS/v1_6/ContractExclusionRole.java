/**
 * ContractExclusionRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractExclusionRole  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object contractID;

    private java.lang.Object roleID;

    public ContractExclusionRole() {
    }

    public ContractExclusionRole(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object contractID,
           java.lang.Object roleID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.contractID = contractID;
        this.roleID = roleID;
    }


    /**
     * Gets the contractID value for this ContractExclusionRole.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ContractExclusionRole.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the roleID value for this ContractExclusionRole.
     * 
     * @return roleID
     */
    public java.lang.Object getRoleID() {
        return roleID;
    }


    /**
     * Sets the roleID value for this ContractExclusionRole.
     * 
     * @param roleID
     */
    public void setRoleID(java.lang.Object roleID) {
        this.roleID = roleID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractExclusionRole)) return false;
        ContractExclusionRole other = (ContractExclusionRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.roleID==null && other.getRoleID()==null) || 
             (this.roleID!=null &&
              this.roleID.equals(other.getRoleID())));
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
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getRoleID() != null) {
            _hashCode += getRoleID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractExclusionRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractExclusionRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RoleID"));
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
