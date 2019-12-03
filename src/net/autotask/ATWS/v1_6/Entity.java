/**
 * Entity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Entity implements java.io.Serializable {
 

	private net.autotask.ATWS.v1_6.Field[] fields;

    private long id;

    private net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields;


    public Entity() {
	}


	public Entity(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields) {
           this.fields = fields;
           this.id = id;
           this.userDefinedFields = userDefinedFields;
    }


    /**
     * Gets the fields value for this Entity.
     * 
     * @return fields
     */
    public net.autotask.ATWS.v1_6.Field[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this Entity.
     * 
     * @param fields
     */
    public void setFields(net.autotask.ATWS.v1_6.Field[] fields) {
        this.fields = fields;
    }


    /**
     * Gets the id value for this Entity.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Entity.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the userDefinedFields value for this Entity.
     * 
     * @return userDefinedFields
     */
    public net.autotask.ATWS.v1_6.UserDefinedField[] getUserDefinedFields() {
        return userDefinedFields;
    }


    /**
     * Sets the userDefinedFields value for this Entity.
     * 
     * @param userDefinedFields
     */
    public void setUserDefinedFields(net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields) {
        this.userDefinedFields = userDefinedFields;
    }

    private java.lang.Object __equalsCalculator = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entity)) return false;
        Entity other = (Entity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalculator != null) {
            return (__equalsCalculator == obj);
        }
        __equalsCalculator = obj;
        boolean _equals;
        _equals = true && 
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            this.id == other.getId() &&
            ((this.userDefinedFields==null && other.getUserDefinedFields()==null) || 
             (this.userDefinedFields!=null &&
              java.util.Arrays.equals(this.userDefinedFields, other.getUserDefinedFields())));
        __equalsCalculator = null;
        return _equals;
    }

    private boolean __hashCodeCalculator = false;
    public synchronized int hashCode() {
        if (__hashCodeCalculator) {
            return 0;
        }
        __hashCodeCalculator = true;
        int _hashCode = 1;
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getId()).hashCode();
        if (getUserDefinedFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserDefinedFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserDefinedFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalculator = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDescr =
        new org.apache.axis.description.TypeDesc(Entity.class, true);

    static {
    	typeDescr.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Entity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Field"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Field"));
        typeDescr.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDescr.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UserDefinedFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UserDefinedField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UserDefinedField"));
        typeDescr.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDescr;
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
            _javaType, _xmlType, typeDescr);
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
            _javaType, _xmlType, typeDescr);
    }

}
