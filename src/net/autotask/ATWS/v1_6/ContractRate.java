/**
 * ContractRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractRate  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object roleID;

    private java.lang.Object contractID;

    private java.lang.Object contractHourlyRate;

    private java.lang.Object internalCurrencyContractHourlyRate;

    public ContractRate() {
    }

    public ContractRate(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object roleID,
           java.lang.Object contractID,
           java.lang.Object contractHourlyRate,
           java.lang.Object internalCurrencyContractHourlyRate) {
        super(
            fields,
            id,
            userDefinedFields);
        this.roleID = roleID;
        this.contractID = contractID;
        this.contractHourlyRate = contractHourlyRate;
        this.internalCurrencyContractHourlyRate = internalCurrencyContractHourlyRate;
    }


    /**
     * Gets the roleID value for this ContractRate.
     * 
     * @return roleID
     */
    public java.lang.Object getRoleID() {
        return roleID;
    }


    /**
     * Sets the roleID value for this ContractRate.
     * 
     * @param roleID
     */
    public void setRoleID(java.lang.Object roleID) {
        this.roleID = roleID;
    }


    /**
     * Gets the contractID value for this ContractRate.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ContractRate.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the contractHourlyRate value for this ContractRate.
     * 
     * @return contractHourlyRate
     */
    public java.lang.Object getContractHourlyRate() {
        return contractHourlyRate;
    }


    /**
     * Sets the contractHourlyRate value for this ContractRate.
     * 
     * @param contractHourlyRate
     */
    public void setContractHourlyRate(java.lang.Object contractHourlyRate) {
        this.contractHourlyRate = contractHourlyRate;
    }


    /**
     * Gets the internalCurrencyContractHourlyRate value for this ContractRate.
     * 
     * @return internalCurrencyContractHourlyRate
     */
    public java.lang.Object getInternalCurrencyContractHourlyRate() {
        return internalCurrencyContractHourlyRate;
    }


    /**
     * Sets the internalCurrencyContractHourlyRate value for this ContractRate.
     * 
     * @param internalCurrencyContractHourlyRate
     */
    public void setInternalCurrencyContractHourlyRate(java.lang.Object internalCurrencyContractHourlyRate) {
        this.internalCurrencyContractHourlyRate = internalCurrencyContractHourlyRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractRate)) return false;
        ContractRate other = (ContractRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.roleID==null && other.getRoleID()==null) || 
             (this.roleID!=null &&
              this.roleID.equals(other.getRoleID()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.contractHourlyRate==null && other.getContractHourlyRate()==null) || 
             (this.contractHourlyRate!=null &&
              this.contractHourlyRate.equals(other.getContractHourlyRate()))) &&
            ((this.internalCurrencyContractHourlyRate==null && other.getInternalCurrencyContractHourlyRate()==null) || 
             (this.internalCurrencyContractHourlyRate!=null &&
              this.internalCurrencyContractHourlyRate.equals(other.getInternalCurrencyContractHourlyRate())));
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
        if (getRoleID() != null) {
            _hashCode += getRoleID().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getContractHourlyRate() != null) {
            _hashCode += getContractHourlyRate().hashCode();
        }
        if (getInternalCurrencyContractHourlyRate() != null) {
            _hashCode += getInternalCurrencyContractHourlyRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RoleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractHourlyRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractHourlyRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyContractHourlyRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyContractHourlyRate"));
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
