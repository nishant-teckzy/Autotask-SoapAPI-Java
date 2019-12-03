/**
 * ResourceRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ResourceRole  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object departmentID;

    private java.lang.Object queueID;

    private java.lang.Object resourceID;

    private java.lang.Object roleID;

    private java.lang.Object active;

    public ResourceRole() {
    }

    public ResourceRole(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object departmentID,
           java.lang.Object queueID,
           java.lang.Object resourceID,
           java.lang.Object roleID,
           java.lang.Object active) {
        super(
            fields,
            id,
            userDefinedFields);
        this.departmentID = departmentID;
        this.queueID = queueID;
        this.resourceID = resourceID;
        this.roleID = roleID;
        this.active = active;
    }


    /**
     * Gets the departmentID value for this ResourceRole.
     * 
     * @return departmentID
     */
    public java.lang.Object getDepartmentID() {
        return departmentID;
    }


    /**
     * Sets the departmentID value for this ResourceRole.
     * 
     * @param departmentID
     */
    public void setDepartmentID(java.lang.Object departmentID) {
        this.departmentID = departmentID;
    }


    /**
     * Gets the queueID value for this ResourceRole.
     * 
     * @return queueID
     */
    public java.lang.Object getQueueID() {
        return queueID;
    }


    /**
     * Sets the queueID value for this ResourceRole.
     * 
     * @param queueID
     */
    public void setQueueID(java.lang.Object queueID) {
        this.queueID = queueID;
    }


    /**
     * Gets the resourceID value for this ResourceRole.
     * 
     * @return resourceID
     */
    public java.lang.Object getResourceID() {
        return resourceID;
    }


    /**
     * Sets the resourceID value for this ResourceRole.
     * 
     * @param resourceID
     */
    public void setResourceID(java.lang.Object resourceID) {
        this.resourceID = resourceID;
    }


    /**
     * Gets the roleID value for this ResourceRole.
     * 
     * @return roleID
     */
    public java.lang.Object getRoleID() {
        return roleID;
    }


    /**
     * Sets the roleID value for this ResourceRole.
     * 
     * @param roleID
     */
    public void setRoleID(java.lang.Object roleID) {
        this.roleID = roleID;
    }


    /**
     * Gets the active value for this ResourceRole.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this ResourceRole.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceRole)) return false;
        ResourceRole other = (ResourceRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.departmentID==null && other.getDepartmentID()==null) || 
             (this.departmentID!=null &&
              this.departmentID.equals(other.getDepartmentID()))) &&
            ((this.queueID==null && other.getQueueID()==null) || 
             (this.queueID!=null &&
              this.queueID.equals(other.getQueueID()))) &&
            ((this.resourceID==null && other.getResourceID()==null) || 
             (this.resourceID!=null &&
              this.resourceID.equals(other.getResourceID()))) &&
            ((this.roleID==null && other.getRoleID()==null) || 
             (this.roleID!=null &&
              this.roleID.equals(other.getRoleID()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive())));
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
        if (getDepartmentID() != null) {
            _hashCode += getDepartmentID().hashCode();
        }
        if (getQueueID() != null) {
            _hashCode += getQueueID().hashCode();
        }
        if (getResourceID() != null) {
            _hashCode += getResourceID().hashCode();
        }
        if (getRoleID() != null) {
            _hashCode += getRoleID().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ResourceRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DepartmentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QueueID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RoleID"));
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
