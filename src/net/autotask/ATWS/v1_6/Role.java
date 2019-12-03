/**
 * Role.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Role  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object name;

    private java.lang.Object description;

    private java.lang.Object systemRole;

    private java.lang.Object hourlyFactor;

    private java.lang.Object hourlyRate;

    private java.lang.Object quoteItemDefaultTaxCategoryId;

    private java.lang.Object active;

    private java.lang.Object isExcludedFromNewContracts;

    private java.lang.Object roleType;

    public Role() {
    }

    public Role(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object name,
           java.lang.Object description,
           java.lang.Object systemRole,
           java.lang.Object hourlyFactor,
           java.lang.Object hourlyRate,
           java.lang.Object quoteItemDefaultTaxCategoryId,
           java.lang.Object active,
           java.lang.Object isExcludedFromNewContracts,
           java.lang.Object roleType) {
        super(
            fields,
            id,
            userDefinedFields);
        this.name = name;
        this.description = description;
        this.systemRole = systemRole;
        this.hourlyFactor = hourlyFactor;
        this.hourlyRate = hourlyRate;
        this.quoteItemDefaultTaxCategoryId = quoteItemDefaultTaxCategoryId;
        this.active = active;
        this.isExcludedFromNewContracts = isExcludedFromNewContracts;
        this.roleType = roleType;
    }


    /**
     * Gets the name value for this Role.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this Role.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the description value for this Role.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Role.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the systemRole value for this Role.
     * 
     * @return systemRole
     */
    public java.lang.Object getSystemRole() {
        return systemRole;
    }


    /**
     * Sets the systemRole value for this Role.
     * 
     * @param systemRole
     */
    public void setSystemRole(java.lang.Object systemRole) {
        this.systemRole = systemRole;
    }


    /**
     * Gets the hourlyFactor value for this Role.
     * 
     * @return hourlyFactor
     */
    public java.lang.Object getHourlyFactor() {
        return hourlyFactor;
    }


    /**
     * Sets the hourlyFactor value for this Role.
     * 
     * @param hourlyFactor
     */
    public void setHourlyFactor(java.lang.Object hourlyFactor) {
        this.hourlyFactor = hourlyFactor;
    }


    /**
     * Gets the hourlyRate value for this Role.
     * 
     * @return hourlyRate
     */
    public java.lang.Object getHourlyRate() {
        return hourlyRate;
    }


    /**
     * Sets the hourlyRate value for this Role.
     * 
     * @param hourlyRate
     */
    public void setHourlyRate(java.lang.Object hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    /**
     * Gets the quoteItemDefaultTaxCategoryId value for this Role.
     * 
     * @return quoteItemDefaultTaxCategoryId
     */
    public java.lang.Object getQuoteItemDefaultTaxCategoryId() {
        return quoteItemDefaultTaxCategoryId;
    }


    /**
     * Sets the quoteItemDefaultTaxCategoryId value for this Role.
     * 
     * @param quoteItemDefaultTaxCategoryId
     */
    public void setQuoteItemDefaultTaxCategoryId(java.lang.Object quoteItemDefaultTaxCategoryId) {
        this.quoteItemDefaultTaxCategoryId = quoteItemDefaultTaxCategoryId;
    }


    /**
     * Gets the active value for this Role.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this Role.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the isExcludedFromNewContracts value for this Role.
     * 
     * @return isExcludedFromNewContracts
     */
    public java.lang.Object getIsExcludedFromNewContracts() {
        return isExcludedFromNewContracts;
    }


    /**
     * Sets the isExcludedFromNewContracts value for this Role.
     * 
     * @param isExcludedFromNewContracts
     */
    public void setIsExcludedFromNewContracts(java.lang.Object isExcludedFromNewContracts) {
        this.isExcludedFromNewContracts = isExcludedFromNewContracts;
    }


    /**
     * Gets the roleType value for this Role.
     * 
     * @return roleType
     */
    public java.lang.Object getRoleType() {
        return roleType;
    }


    /**
     * Sets the roleType value for this Role.
     * 
     * @param roleType
     */
    public void setRoleType(java.lang.Object roleType) {
        this.roleType = roleType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Role)) return false;
        Role other = (Role) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.systemRole==null && other.getSystemRole()==null) || 
             (this.systemRole!=null &&
              this.systemRole.equals(other.getSystemRole()))) &&
            ((this.hourlyFactor==null && other.getHourlyFactor()==null) || 
             (this.hourlyFactor!=null &&
              this.hourlyFactor.equals(other.getHourlyFactor()))) &&
            ((this.hourlyRate==null && other.getHourlyRate()==null) || 
             (this.hourlyRate!=null &&
              this.hourlyRate.equals(other.getHourlyRate()))) &&
            ((this.quoteItemDefaultTaxCategoryId==null && other.getQuoteItemDefaultTaxCategoryId()==null) || 
             (this.quoteItemDefaultTaxCategoryId!=null &&
              this.quoteItemDefaultTaxCategoryId.equals(other.getQuoteItemDefaultTaxCategoryId()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.isExcludedFromNewContracts==null && other.getIsExcludedFromNewContracts()==null) || 
             (this.isExcludedFromNewContracts!=null &&
              this.isExcludedFromNewContracts.equals(other.getIsExcludedFromNewContracts()))) &&
            ((this.roleType==null && other.getRoleType()==null) || 
             (this.roleType!=null &&
              this.roleType.equals(other.getRoleType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSystemRole() != null) {
            _hashCode += getSystemRole().hashCode();
        }
        if (getHourlyFactor() != null) {
            _hashCode += getHourlyFactor().hashCode();
        }
        if (getHourlyRate() != null) {
            _hashCode += getHourlyRate().hashCode();
        }
        if (getQuoteItemDefaultTaxCategoryId() != null) {
            _hashCode += getQuoteItemDefaultTaxCategoryId().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getIsExcludedFromNewContracts() != null) {
            _hashCode += getIsExcludedFromNewContracts().hashCode();
        }
        if (getRoleType() != null) {
            _hashCode += getRoleType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Role.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Role"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SystemRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourlyFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HourlyFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourlyRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HourlyRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteItemDefaultTaxCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuoteItemDefaultTaxCategoryId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExcludedFromNewContracts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsExcludedFromNewContracts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RoleType"));
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
