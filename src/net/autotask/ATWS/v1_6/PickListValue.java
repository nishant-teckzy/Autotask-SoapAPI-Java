/**
 * PickListValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class PickListValue  implements java.io.Serializable {
    private java.lang.String value;

    private java.lang.String label;

    private boolean isDefaultValue;

    private int sortOrder;

    private java.lang.String parentValue;

    private java.lang.Boolean isActive;

    private java.lang.Boolean isSystem;

    public PickListValue() {
    }

    public PickListValue(
           java.lang.String value,
           java.lang.String label,
           boolean isDefaultValue,
           int sortOrder,
           java.lang.String parentValue,
           java.lang.Boolean isActive,
           java.lang.Boolean isSystem) {
           this.value = value;
           this.label = label;
           this.isDefaultValue = isDefaultValue;
           this.sortOrder = sortOrder;
           this.parentValue = parentValue;
           this.isActive = isActive;
           this.isSystem = isSystem;
    }


    /**
     * Gets the value value for this PickListValue.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this PickListValue.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the label value for this PickListValue.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this PickListValue.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the isDefaultValue value for this PickListValue.
     * 
     * @return isDefaultValue
     */
    public boolean isIsDefaultValue() {
        return isDefaultValue;
    }


    /**
     * Sets the isDefaultValue value for this PickListValue.
     * 
     * @param isDefaultValue
     */
    public void setIsDefaultValue(boolean isDefaultValue) {
        this.isDefaultValue = isDefaultValue;
    }


    /**
     * Gets the sortOrder value for this PickListValue.
     * 
     * @return sortOrder
     */
    public int getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this PickListValue.
     * 
     * @param sortOrder
     */
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the parentValue value for this PickListValue.
     * 
     * @return parentValue
     */
    public java.lang.String getParentValue() {
        return parentValue;
    }


    /**
     * Sets the parentValue value for this PickListValue.
     * 
     * @param parentValue
     */
    public void setParentValue(java.lang.String parentValue) {
        this.parentValue = parentValue;
    }


    /**
     * Gets the isActive value for this PickListValue.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this PickListValue.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isSystem value for this PickListValue.
     * 
     * @return isSystem
     */
    public java.lang.Boolean getIsSystem() {
        return isSystem;
    }


    /**
     * Sets the isSystem value for this PickListValue.
     * 
     * @param isSystem
     */
    public void setIsSystem(java.lang.Boolean isSystem) {
        this.isSystem = isSystem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickListValue)) return false;
        PickListValue other = (PickListValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            this.isDefaultValue == other.isIsDefaultValue() &&
            this.sortOrder == other.getSortOrder() &&
            ((this.parentValue==null && other.getParentValue()==null) || 
             (this.parentValue!=null &&
              this.parentValue.equals(other.getParentValue()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.isSystem==null && other.getIsSystem()==null) || 
             (this.isSystem!=null &&
              this.isSystem.equals(other.getIsSystem())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        _hashCode += (isIsDefaultValue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getSortOrder();
        if (getParentValue() != null) {
            _hashCode += getParentValue().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getIsSystem() != null) {
            _hashCode += getIsSystem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickListValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PickListValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Value"));
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
        elemField.setFieldName("isDefaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsDefaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "parentValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
