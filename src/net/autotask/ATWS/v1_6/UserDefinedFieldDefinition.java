/**
 * UserDefinedFieldDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class UserDefinedFieldDefinition  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object name;

    private java.lang.Object description;

    private java.lang.Object udfType;

    private java.lang.Object dataType;

    private java.lang.Object defaultValue;

    private java.lang.Object isFieldMapping;

    private java.lang.Object isProtected;

    private java.lang.Object isEncrypted;

    private java.lang.Object isRequired;

    private java.lang.Object isActive;

    private java.lang.Object createDate;

    private java.lang.Object mergeVariableName;

    private java.lang.Object crmToProjectUdfId;

    private java.lang.Object displayFormat;

    private java.lang.Object sortOrder;

    private java.lang.Object numberOfDecimalPlaces;

    private java.lang.Object isVisibleToClientPortal;

    public UserDefinedFieldDefinition() {
    }

    public UserDefinedFieldDefinition(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object name,
           java.lang.Object description,
           java.lang.Object udfType,
           java.lang.Object dataType,
           java.lang.Object defaultValue,
           java.lang.Object isFieldMapping,
           java.lang.Object isProtected,
           java.lang.Object isEncrypted,
           java.lang.Object isRequired,
           java.lang.Object isActive,
           java.lang.Object createDate,
           java.lang.Object mergeVariableName,
           java.lang.Object crmToProjectUdfId,
           java.lang.Object displayFormat,
           java.lang.Object sortOrder,
           java.lang.Object numberOfDecimalPlaces,
           java.lang.Object isVisibleToClientPortal) {
        super(
            fields,
            id,
            userDefinedFields);
        this.name = name;
        this.description = description;
        this.udfType = udfType;
        this.dataType = dataType;
        this.defaultValue = defaultValue;
        this.isFieldMapping = isFieldMapping;
        this.isProtected = isProtected;
        this.isEncrypted = isEncrypted;
        this.isRequired = isRequired;
        this.isActive = isActive;
        this.createDate = createDate;
        this.mergeVariableName = mergeVariableName;
        this.crmToProjectUdfId = crmToProjectUdfId;
        this.displayFormat = displayFormat;
        this.sortOrder = sortOrder;
        this.numberOfDecimalPlaces = numberOfDecimalPlaces;
        this.isVisibleToClientPortal = isVisibleToClientPortal;
    }


    /**
     * Gets the name value for this UserDefinedFieldDefinition.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this UserDefinedFieldDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the description value for this UserDefinedFieldDefinition.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UserDefinedFieldDefinition.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the udfType value for this UserDefinedFieldDefinition.
     * 
     * @return udfType
     */
    public java.lang.Object getUdfType() {
        return udfType;
    }


    /**
     * Sets the udfType value for this UserDefinedFieldDefinition.
     * 
     * @param udfType
     */
    public void setUdfType(java.lang.Object udfType) {
        this.udfType = udfType;
    }


    /**
     * Gets the dataType value for this UserDefinedFieldDefinition.
     * 
     * @return dataType
     */
    public java.lang.Object getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this UserDefinedFieldDefinition.
     * 
     * @param dataType
     */
    public void setDataType(java.lang.Object dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the defaultValue value for this UserDefinedFieldDefinition.
     * 
     * @return defaultValue
     */
    public java.lang.Object getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this UserDefinedFieldDefinition.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.Object defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the isFieldMapping value for this UserDefinedFieldDefinition.
     * 
     * @return isFieldMapping
     */
    public java.lang.Object getIsFieldMapping() {
        return isFieldMapping;
    }


    /**
     * Sets the isFieldMapping value for this UserDefinedFieldDefinition.
     * 
     * @param isFieldMapping
     */
    public void setIsFieldMapping(java.lang.Object isFieldMapping) {
        this.isFieldMapping = isFieldMapping;
    }


    /**
     * Gets the isProtected value for this UserDefinedFieldDefinition.
     * 
     * @return isProtected
     */
    public java.lang.Object getIsProtected() {
        return isProtected;
    }


    /**
     * Sets the isProtected value for this UserDefinedFieldDefinition.
     * 
     * @param isProtected
     */
    public void setIsProtected(java.lang.Object isProtected) {
        this.isProtected = isProtected;
    }


    /**
     * Gets the isEncrypted value for this UserDefinedFieldDefinition.
     * 
     * @return isEncrypted
     */
    public java.lang.Object getIsEncrypted() {
        return isEncrypted;
    }


    /**
     * Sets the isEncrypted value for this UserDefinedFieldDefinition.
     * 
     * @param isEncrypted
     */
    public void setIsEncrypted(java.lang.Object isEncrypted) {
        this.isEncrypted = isEncrypted;
    }


    /**
     * Gets the isRequired value for this UserDefinedFieldDefinition.
     * 
     * @return isRequired
     */
    public java.lang.Object getIsRequired() {
        return isRequired;
    }


    /**
     * Sets the isRequired value for this UserDefinedFieldDefinition.
     * 
     * @param isRequired
     */
    public void setIsRequired(java.lang.Object isRequired) {
        this.isRequired = isRequired;
    }


    /**
     * Gets the isActive value for this UserDefinedFieldDefinition.
     * 
     * @return isActive
     */
    public java.lang.Object getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this UserDefinedFieldDefinition.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Object isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the createDate value for this UserDefinedFieldDefinition.
     * 
     * @return createDate
     */
    public java.lang.Object getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this UserDefinedFieldDefinition.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.Object createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the mergeVariableName value for this UserDefinedFieldDefinition.
     * 
     * @return mergeVariableName
     */
    public java.lang.Object getMergeVariableName() {
        return mergeVariableName;
    }


    /**
     * Sets the mergeVariableName value for this UserDefinedFieldDefinition.
     * 
     * @param mergeVariableName
     */
    public void setMergeVariableName(java.lang.Object mergeVariableName) {
        this.mergeVariableName = mergeVariableName;
    }


    /**
     * Gets the crmToProjectUdfId value for this UserDefinedFieldDefinition.
     * 
     * @return crmToProjectUdfId
     */
    public java.lang.Object getCrmToProjectUdfId() {
        return crmToProjectUdfId;
    }


    /**
     * Sets the crmToProjectUdfId value for this UserDefinedFieldDefinition.
     * 
     * @param crmToProjectUdfId
     */
    public void setCrmToProjectUdfId(java.lang.Object crmToProjectUdfId) {
        this.crmToProjectUdfId = crmToProjectUdfId;
    }


    /**
     * Gets the displayFormat value for this UserDefinedFieldDefinition.
     * 
     * @return displayFormat
     */
    public java.lang.Object getDisplayFormat() {
        return displayFormat;
    }


    /**
     * Sets the displayFormat value for this UserDefinedFieldDefinition.
     * 
     * @param displayFormat
     */
    public void setDisplayFormat(java.lang.Object displayFormat) {
        this.displayFormat = displayFormat;
    }


    /**
     * Gets the sortOrder value for this UserDefinedFieldDefinition.
     * 
     * @return sortOrder
     */
    public java.lang.Object getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this UserDefinedFieldDefinition.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.Object sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the numberOfDecimalPlaces value for this UserDefinedFieldDefinition.
     * 
     * @return numberOfDecimalPlaces
     */
    public java.lang.Object getNumberOfDecimalPlaces() {
        return numberOfDecimalPlaces;
    }


    /**
     * Sets the numberOfDecimalPlaces value for this UserDefinedFieldDefinition.
     * 
     * @param numberOfDecimalPlaces
     */
    public void setNumberOfDecimalPlaces(java.lang.Object numberOfDecimalPlaces) {
        this.numberOfDecimalPlaces = numberOfDecimalPlaces;
    }


    /**
     * Gets the isVisibleToClientPortal value for this UserDefinedFieldDefinition.
     * 
     * @return isVisibleToClientPortal
     */
    public java.lang.Object getIsVisibleToClientPortal() {
        return isVisibleToClientPortal;
    }


    /**
     * Sets the isVisibleToClientPortal value for this UserDefinedFieldDefinition.
     * 
     * @param isVisibleToClientPortal
     */
    public void setIsVisibleToClientPortal(java.lang.Object isVisibleToClientPortal) {
        this.isVisibleToClientPortal = isVisibleToClientPortal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDefinedFieldDefinition)) return false;
        UserDefinedFieldDefinition other = (UserDefinedFieldDefinition) obj;
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
            ((this.udfType==null && other.getUdfType()==null) || 
             (this.udfType!=null &&
              this.udfType.equals(other.getUdfType()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.isFieldMapping==null && other.getIsFieldMapping()==null) || 
             (this.isFieldMapping!=null &&
              this.isFieldMapping.equals(other.getIsFieldMapping()))) &&
            ((this.isProtected==null && other.getIsProtected()==null) || 
             (this.isProtected!=null &&
              this.isProtected.equals(other.getIsProtected()))) &&
            ((this.isEncrypted==null && other.getIsEncrypted()==null) || 
             (this.isEncrypted!=null &&
              this.isEncrypted.equals(other.getIsEncrypted()))) &&
            ((this.isRequired==null && other.getIsRequired()==null) || 
             (this.isRequired!=null &&
              this.isRequired.equals(other.getIsRequired()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.mergeVariableName==null && other.getMergeVariableName()==null) || 
             (this.mergeVariableName!=null &&
              this.mergeVariableName.equals(other.getMergeVariableName()))) &&
            ((this.crmToProjectUdfId==null && other.getCrmToProjectUdfId()==null) || 
             (this.crmToProjectUdfId!=null &&
              this.crmToProjectUdfId.equals(other.getCrmToProjectUdfId()))) &&
            ((this.displayFormat==null && other.getDisplayFormat()==null) || 
             (this.displayFormat!=null &&
              this.displayFormat.equals(other.getDisplayFormat()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.numberOfDecimalPlaces==null && other.getNumberOfDecimalPlaces()==null) || 
             (this.numberOfDecimalPlaces!=null &&
              this.numberOfDecimalPlaces.equals(other.getNumberOfDecimalPlaces()))) &&
            ((this.isVisibleToClientPortal==null && other.getIsVisibleToClientPortal()==null) || 
             (this.isVisibleToClientPortal!=null &&
              this.isVisibleToClientPortal.equals(other.getIsVisibleToClientPortal())));
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
        if (getUdfType() != null) {
            _hashCode += getUdfType().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getIsFieldMapping() != null) {
            _hashCode += getIsFieldMapping().hashCode();
        }
        if (getIsProtected() != null) {
            _hashCode += getIsProtected().hashCode();
        }
        if (getIsEncrypted() != null) {
            _hashCode += getIsEncrypted().hashCode();
        }
        if (getIsRequired() != null) {
            _hashCode += getIsRequired().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getMergeVariableName() != null) {
            _hashCode += getMergeVariableName().hashCode();
        }
        if (getCrmToProjectUdfId() != null) {
            _hashCode += getCrmToProjectUdfId().hashCode();
        }
        if (getDisplayFormat() != null) {
            _hashCode += getDisplayFormat().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getNumberOfDecimalPlaces() != null) {
            _hashCode += getNumberOfDecimalPlaces().hashCode();
        }
        if (getIsVisibleToClientPortal() != null) {
            _hashCode += getIsVisibleToClientPortal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDefinedFieldDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UserDefinedFieldDefinition"));
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
        elemField.setFieldName("udfType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UdfType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DefaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFieldMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsFieldMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProtected");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsProtected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEncrypted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsEncrypted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mergeVariableName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MergeVariableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crmToProjectUdfId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CrmToProjectUdfId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DisplayFormat"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfDecimalPlaces");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NumberOfDecimalPlaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisibleToClientPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsVisibleToClientPortal"));
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
