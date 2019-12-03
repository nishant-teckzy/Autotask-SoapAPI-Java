/**
 * ContractExclusionSetExcludedWorkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractExclusionSetExcludedWorkType  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object contractExclusionSetID;

    private java.lang.Object excludedWorkTypeID;

    public ContractExclusionSetExcludedWorkType() {
    }

    public ContractExclusionSetExcludedWorkType(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object contractExclusionSetID,
           java.lang.Object excludedWorkTypeID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.contractExclusionSetID = contractExclusionSetID;
        this.excludedWorkTypeID = excludedWorkTypeID;
    }


    /**
     * Gets the contractExclusionSetID value for this ContractExclusionSetExcludedWorkType.
     * 
     * @return contractExclusionSetID
     */
    public java.lang.Object getContractExclusionSetID() {
        return contractExclusionSetID;
    }


    /**
     * Sets the contractExclusionSetID value for this ContractExclusionSetExcludedWorkType.
     * 
     * @param contractExclusionSetID
     */
    public void setContractExclusionSetID(java.lang.Object contractExclusionSetID) {
        this.contractExclusionSetID = contractExclusionSetID;
    }


    /**
     * Gets the excludedWorkTypeID value for this ContractExclusionSetExcludedWorkType.
     * 
     * @return excludedWorkTypeID
     */
    public java.lang.Object getExcludedWorkTypeID() {
        return excludedWorkTypeID;
    }


    /**
     * Sets the excludedWorkTypeID value for this ContractExclusionSetExcludedWorkType.
     * 
     * @param excludedWorkTypeID
     */
    public void setExcludedWorkTypeID(java.lang.Object excludedWorkTypeID) {
        this.excludedWorkTypeID = excludedWorkTypeID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractExclusionSetExcludedWorkType)) return false;
        ContractExclusionSetExcludedWorkType other = (ContractExclusionSetExcludedWorkType) obj;
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
            ((this.excludedWorkTypeID==null && other.getExcludedWorkTypeID()==null) || 
             (this.excludedWorkTypeID!=null &&
              this.excludedWorkTypeID.equals(other.getExcludedWorkTypeID())));
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
        if (getExcludedWorkTypeID() != null) {
            _hashCode += getExcludedWorkTypeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractExclusionSetExcludedWorkType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractExclusionSetExcludedWorkType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractExclusionSetID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractExclusionSetID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedWorkTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExcludedWorkTypeID"));
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
