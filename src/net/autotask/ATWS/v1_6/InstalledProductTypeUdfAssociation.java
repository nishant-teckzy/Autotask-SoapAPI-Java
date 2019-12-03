/**
 * InstalledProductTypeUdfAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class InstalledProductTypeUdfAssociation  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object installedProductTypeId;

    private java.lang.Object userDefinedFieldDefinitionId;

    private java.lang.Object required;

    private java.lang.Object sortOrder;

    public InstalledProductTypeUdfAssociation() {
    }

    public InstalledProductTypeUdfAssociation(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object installedProductTypeId,
           java.lang.Object userDefinedFieldDefinitionId,
           java.lang.Object required,
           java.lang.Object sortOrder) {
        super(
            fields,
            id,
            userDefinedFields);
        this.installedProductTypeId = installedProductTypeId;
        this.userDefinedFieldDefinitionId = userDefinedFieldDefinitionId;
        this.required = required;
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the installedProductTypeId value for this InstalledProductTypeUdfAssociation.
     * 
     * @return installedProductTypeId
     */
    public java.lang.Object getInstalledProductTypeId() {
        return installedProductTypeId;
    }


    /**
     * Sets the installedProductTypeId value for this InstalledProductTypeUdfAssociation.
     * 
     * @param installedProductTypeId
     */
    public void setInstalledProductTypeId(java.lang.Object installedProductTypeId) {
        this.installedProductTypeId = installedProductTypeId;
    }


    /**
     * Gets the userDefinedFieldDefinitionId value for this InstalledProductTypeUdfAssociation.
     * 
     * @return userDefinedFieldDefinitionId
     */
    public java.lang.Object getUserDefinedFieldDefinitionId() {
        return userDefinedFieldDefinitionId;
    }


    /**
     * Sets the userDefinedFieldDefinitionId value for this InstalledProductTypeUdfAssociation.
     * 
     * @param userDefinedFieldDefinitionId
     */
    public void setUserDefinedFieldDefinitionId(java.lang.Object userDefinedFieldDefinitionId) {
        this.userDefinedFieldDefinitionId = userDefinedFieldDefinitionId;
    }


    /**
     * Gets the required value for this InstalledProductTypeUdfAssociation.
     * 
     * @return required
     */
    public java.lang.Object getRequired() {
        return required;
    }


    /**
     * Sets the required value for this InstalledProductTypeUdfAssociation.
     * 
     * @param required
     */
    public void setRequired(java.lang.Object required) {
        this.required = required;
    }


    /**
     * Gets the sortOrder value for this InstalledProductTypeUdfAssociation.
     * 
     * @return sortOrder
     */
    public java.lang.Object getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this InstalledProductTypeUdfAssociation.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.Object sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstalledProductTypeUdfAssociation)) return false;
        InstalledProductTypeUdfAssociation other = (InstalledProductTypeUdfAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.installedProductTypeId==null && other.getInstalledProductTypeId()==null) || 
             (this.installedProductTypeId!=null &&
              this.installedProductTypeId.equals(other.getInstalledProductTypeId()))) &&
            ((this.userDefinedFieldDefinitionId==null && other.getUserDefinedFieldDefinitionId()==null) || 
             (this.userDefinedFieldDefinitionId!=null &&
              this.userDefinedFieldDefinitionId.equals(other.getUserDefinedFieldDefinitionId()))) &&
            ((this.required==null && other.getRequired()==null) || 
             (this.required!=null &&
              this.required.equals(other.getRequired()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder())));
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
        if (getInstalledProductTypeId() != null) {
            _hashCode += getInstalledProductTypeId().hashCode();
        }
        if (getUserDefinedFieldDefinitionId() != null) {
            _hashCode += getUserDefinedFieldDefinitionId().hashCode();
        }
        if (getRequired() != null) {
            _hashCode += getRequired().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstalledProductTypeUdfAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InstalledProductTypeUdfAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installedProductTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InstalledProductTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedFieldDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UserDefinedFieldDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SortOrder"));
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
