/**
 * Field.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Field  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String label;

    private java.lang.String type;

    private int length;

    private java.lang.String description;

    private boolean isRequired;

    private boolean isReadOnly;

    private boolean isQueryable;

    private boolean isReference;

    private java.lang.String referenceEntityType;

    private boolean isPickList;

    private net.autotask.ATWS.v1_6.PickListValue[] picklistValues;

    private java.lang.String picklistParentValueField;

    private java.lang.String defaultValue;

    public Field() {
    }

    public Field(
           java.lang.String name,
           java.lang.String label,
           java.lang.String type,
           int length,
           java.lang.String description,
           boolean isRequired,
           boolean isReadOnly,
           boolean isQueryable,
           boolean isReference,
           java.lang.String referenceEntityType,
           boolean isPickList,
           net.autotask.ATWS.v1_6.PickListValue[] picklistValues,
           java.lang.String picklistParentValueField,
           java.lang.String defaultValue) {
           this.name = name;
           this.label = label;
           this.type = type;
           this.length = length;
           this.description = description;
           this.isRequired = isRequired;
           this.isReadOnly = isReadOnly;
           this.isQueryable = isQueryable;
           this.isReference = isReference;
           this.referenceEntityType = referenceEntityType;
           this.isPickList = isPickList;
           this.picklistValues = picklistValues;
           this.picklistParentValueField = picklistParentValueField;
           this.defaultValue = defaultValue;
    }


    /**
     * Gets the name value for this Field.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Field.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the label value for this Field.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this Field.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the type value for this Field.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Field.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the length value for this Field.
     * 
     * @return length
     */
    public int getLength() {
        return length;
    }


    /**
     * Sets the length value for this Field.
     * 
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }


    /**
     * Gets the description value for this Field.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Field.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isRequired value for this Field.
     * 
     * @return isRequired
     */
    public boolean isIsRequired() {
        return isRequired;
    }


    /**
     * Sets the isRequired value for this Field.
     * 
     * @param isRequired
     */
    public void setIsRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }


    /**
     * Gets the isReadOnly value for this Field.
     * 
     * @return isReadOnly
     */
    public boolean isIsReadOnly() {
        return isReadOnly;
    }


    /**
     * Sets the isReadOnly value for this Field.
     * 
     * @param isReadOnly
     */
    public void setIsReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }


    /**
     * Gets the isQueryable value for this Field.
     * 
     * @return isQueryable
     */
    public boolean isIsQueryable() {
        return isQueryable;
    }


    /**
     * Sets the isQueryable value for this Field.
     * 
     * @param isQueryable
     */
    public void setIsQueryable(boolean isQueryable) {
        this.isQueryable = isQueryable;
    }


    /**
     * Gets the isReference value for this Field.
     * 
     * @return isReference
     */
    public boolean isIsReference() {
        return isReference;
    }


    /**
     * Sets the isReference value for this Field.
     * 
     * @param isReference
     */
    public void setIsReference(boolean isReference) {
        this.isReference = isReference;
    }


    /**
     * Gets the referenceEntityType value for this Field.
     * 
     * @return referenceEntityType
     */
    public java.lang.String getReferenceEntityType() {
        return referenceEntityType;
    }


    /**
     * Sets the referenceEntityType value for this Field.
     * 
     * @param referenceEntityType
     */
    public void setReferenceEntityType(java.lang.String referenceEntityType) {
        this.referenceEntityType = referenceEntityType;
    }


    /**
     * Gets the isPickList value for this Field.
     * 
     * @return isPickList
     */
    public boolean isIsPickList() {
        return isPickList;
    }


    /**
     * Sets the isPickList value for this Field.
     * 
     * @param isPickList
     */
    public void setIsPickList(boolean isPickList) {
        this.isPickList = isPickList;
    }


    /**
     * Gets the picklistValues value for this Field.
     * 
     * @return picklistValues
     */
    public net.autotask.ATWS.v1_6.PickListValue[] getPicklistValues() {
        return picklistValues;
    }


    /**
     * Sets the picklistValues value for this Field.
     * 
     * @param picklistValues
     */
    public void setPicklistValues(net.autotask.ATWS.v1_6.PickListValue[] picklistValues) {
        this.picklistValues = picklistValues;
    }


    /**
     * Gets the picklistParentValueField value for this Field.
     * 
     * @return picklistParentValueField
     */
    public java.lang.String getPicklistParentValueField() {
        return picklistParentValueField;
    }


    /**
     * Sets the picklistParentValueField value for this Field.
     * 
     * @param picklistParentValueField
     */
    public void setPicklistParentValueField(java.lang.String picklistParentValueField) {
        this.picklistParentValueField = picklistParentValueField;
    }


    /**
     * Gets the defaultValue value for this Field.
     * 
     * @return defaultValue
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this Field.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Field)) return false;
        Field other = (Field) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.length == other.getLength() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.isRequired == other.isIsRequired() &&
            this.isReadOnly == other.isIsReadOnly() &&
            this.isQueryable == other.isIsQueryable() &&
            this.isReference == other.isIsReference() &&
            ((this.referenceEntityType==null && other.getReferenceEntityType()==null) || 
             (this.referenceEntityType!=null &&
              this.referenceEntityType.equals(other.getReferenceEntityType()))) &&
            this.isPickList == other.isIsPickList() &&
            ((this.picklistValues==null && other.getPicklistValues()==null) || 
             (this.picklistValues!=null &&
              java.util.Arrays.equals(this.picklistValues, other.getPicklistValues()))) &&
            ((this.picklistParentValueField==null && other.getPicklistParentValueField()==null) || 
             (this.picklistParentValueField!=null &&
              this.picklistParentValueField.equals(other.getPicklistParentValueField()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += getLength();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isIsRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsReadOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsQueryable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsReference() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReferenceEntityType() != null) {
            _hashCode += getReferenceEntityType().hashCode();
        }
        _hashCode += (isIsPickList() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPicklistValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPicklistValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPicklistValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPicklistParentValueField() != null) {
            _hashCode += getPicklistParentValueField().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Field.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Field"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReadOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsReadOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isQueryable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsQueryable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceEntityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReferenceEntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPickList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsPickList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PicklistValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PickListValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PickListValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklistParentValueField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PicklistParentValueField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DefaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
