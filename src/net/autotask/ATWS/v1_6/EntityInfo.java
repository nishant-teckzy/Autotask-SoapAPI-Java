/**
 * EntityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class EntityInfo  implements java.io.Serializable {
    private java.lang.String name;

    private boolean canUpdate;

    private boolean canDelete;

    private boolean canCreate;

    private boolean canQuery;

    private boolean hasUserDefinedFields;

    public EntityInfo() {
    }

    public EntityInfo(
           java.lang.String name,
           boolean canUpdate,
           boolean canDelete,
           boolean canCreate,
           boolean canQuery,
           boolean hasUserDefinedFields) {
           this.name = name;
           this.canUpdate = canUpdate;
           this.canDelete = canDelete;
           this.canCreate = canCreate;
           this.canQuery = canQuery;
           this.hasUserDefinedFields = hasUserDefinedFields;
    }


    /**
     * Gets the name value for this EntityInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this EntityInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the canUpdate value for this EntityInfo.
     * 
     * @return canUpdate
     */
    public boolean isCanUpdate() {
        return canUpdate;
    }


    /**
     * Sets the canUpdate value for this EntityInfo.
     * 
     * @param canUpdate
     */
    public void setCanUpdate(boolean canUpdate) {
        this.canUpdate = canUpdate;
    }


    /**
     * Gets the canDelete value for this EntityInfo.
     * 
     * @return canDelete
     */
    public boolean isCanDelete() {
        return canDelete;
    }


    /**
     * Sets the canDelete value for this EntityInfo.
     * 
     * @param canDelete
     */
    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }


    /**
     * Gets the canCreate value for this EntityInfo.
     * 
     * @return canCreate
     */
    public boolean isCanCreate() {
        return canCreate;
    }


    /**
     * Sets the canCreate value for this EntityInfo.
     * 
     * @param canCreate
     */
    public void setCanCreate(boolean canCreate) {
        this.canCreate = canCreate;
    }


    /**
     * Gets the canQuery value for this EntityInfo.
     * 
     * @return canQuery
     */
    public boolean isCanQuery() {
        return canQuery;
    }


    /**
     * Sets the canQuery value for this EntityInfo.
     * 
     * @param canQuery
     */
    public void setCanQuery(boolean canQuery) {
        this.canQuery = canQuery;
    }


    /**
     * Gets the hasUserDefinedFields value for this EntityInfo.
     * 
     * @return hasUserDefinedFields
     */
    public boolean isHasUserDefinedFields() {
        return hasUserDefinedFields;
    }


    /**
     * Sets the hasUserDefinedFields value for this EntityInfo.
     * 
     * @param hasUserDefinedFields
     */
    public void setHasUserDefinedFields(boolean hasUserDefinedFields) {
        this.hasUserDefinedFields = hasUserDefinedFields;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityInfo)) return false;
        EntityInfo other = (EntityInfo) obj;
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
            this.canUpdate == other.isCanUpdate() &&
            this.canDelete == other.isCanDelete() &&
            this.canCreate == other.isCanCreate() &&
            this.canQuery == other.isCanQuery() &&
            this.hasUserDefinedFields == other.isHasUserDefinedFields();
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
        _hashCode += (isCanUpdate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanDelete() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanCreate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanQuery() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasUserDefinedFields() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CanUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CanDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CanCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CanQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasUserDefinedFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HasUserDefinedFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
