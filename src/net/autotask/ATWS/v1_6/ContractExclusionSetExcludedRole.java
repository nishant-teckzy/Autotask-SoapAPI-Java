/**
 * ContractExclusionSetExcludedRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractExclusionSetExcludedRole  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object contractExclusionSetID;

    private java.lang.Object excludedRoleID;

    public ContractExclusionSetExcludedRole() {
    }

    public ContractExclusionSetExcludedRole(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object contractExclusionSetID,
           java.lang.Object excludedRoleID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.contractExclusionSetID = contractExclusionSetID;
        this.excludedRoleID = excludedRoleID;
    }


    /**
     * Gets the contractExclusionSetID value for this ContractExclusionSetExcludedRole.
     * 
     * @return contractExclusionSetID
     */
    public java.lang.Object getContractExclusionSetID() {
        return contractExclusionSetID;
    }


    /**
     * Sets the contractExclusionSetID value for this ContractExclusionSetExcludedRole.
     * 
     * @param contractExclusionSetID
     */
    public void setContractExclusionSetID(java.lang.Object contractExclusionSetID) {
        this.contractExclusionSetID = contractExclusionSetID;
    }


    /**
     * Gets the excludedRoleID value for this ContractExclusionSetExcludedRole.
     * 
     * @return excludedRoleID
     */
    public java.lang.Object getExcludedRoleID() {
        return excludedRoleID;
    }


    /**
     * Sets the excludedRoleID value for this ContractExclusionSetExcludedRole.
     * 
     * @param excludedRoleID
     */
    public void setExcludedRoleID(java.lang.Object excludedRoleID) {
        this.excludedRoleID = excludedRoleID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractExclusionSetExcludedRole)) return false;
        ContractExclusionSetExcludedRole other = (ContractExclusionSetExcludedRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contractExclusionSetID==null && other.getContractExclusionSetID()==null) || 
             (this.contractExclusionSetID!=null &&
              this.contractExclusionSetID.equals(other.getContractExclusionSetID()))) &&
            ((this.excludedRoleID==null && other.getExcludedRoleID()==null) || 
             (this.excludedRoleID!=null &&
              this.excludedRoleID.equals(other.getExcludedRoleID())));
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
        if (getContractExclusionSetID() != null) {
            _hashCode += getContractExclusionSetID().hashCode();
        }
        if (getExcludedRoleID() != null) {
            _hashCode += getExcludedRoleID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractExclusionSetExcludedRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractExclusionSetExcludedRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractExclusionSetID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractExclusionSetID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedRoleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExcludedRoleID"));
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
