/**
 * EntityReturnInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class EntityReturnInfo  implements java.io.Serializable {
    private long entityId;

    private net.autotask.ATWS.v1_6.EntityReturnInfoDatabaseAction databaseAction;

    private net.autotask.ATWS.v1_6.EntityDuplicateStatus duplicateStatus;

    private java.lang.String message;

    public EntityReturnInfo() {
    }

    public EntityReturnInfo(
           long entityId,
           net.autotask.ATWS.v1_6.EntityReturnInfoDatabaseAction databaseAction,
           net.autotask.ATWS.v1_6.EntityDuplicateStatus duplicateStatus,
           java.lang.String message) {
           this.entityId = entityId;
           this.databaseAction = databaseAction;
           this.duplicateStatus = duplicateStatus;
           this.message = message;
    }


    /**
     * Gets the entityId value for this EntityReturnInfo.
     * 
     * @return entityId
     */
    public long getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this EntityReturnInfo.
     * 
     * @param entityId
     */
    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the databaseAction value for this EntityReturnInfo.
     * 
     * @return databaseAction
     */
    public net.autotask.ATWS.v1_6.EntityReturnInfoDatabaseAction getDatabaseAction() {
        return databaseAction;
    }


    /**
     * Sets the databaseAction value for this EntityReturnInfo.
     * 
     * @param databaseAction
     */
    public void setDatabaseAction(net.autotask.ATWS.v1_6.EntityReturnInfoDatabaseAction databaseAction) {
        this.databaseAction = databaseAction;
    }


    /**
     * Gets the duplicateStatus value for this EntityReturnInfo.
     * 
     * @return duplicateStatus
     */
    public net.autotask.ATWS.v1_6.EntityDuplicateStatus getDuplicateStatus() {
        return duplicateStatus;
    }


    /**
     * Sets the duplicateStatus value for this EntityReturnInfo.
     * 
     * @param duplicateStatus
     */
    public void setDuplicateStatus(net.autotask.ATWS.v1_6.EntityDuplicateStatus duplicateStatus) {
        this.duplicateStatus = duplicateStatus;
    }


    /**
     * Gets the message value for this EntityReturnInfo.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this EntityReturnInfo.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityReturnInfo)) return false;
        EntityReturnInfo other = (EntityReturnInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.entityId == other.getEntityId() &&
            ((this.databaseAction==null && other.getDatabaseAction()==null) || 
             (this.databaseAction!=null &&
              this.databaseAction.equals(other.getDatabaseAction()))) &&
            ((this.duplicateStatus==null && other.getDuplicateStatus()==null) || 
             (this.duplicateStatus!=null &&
              this.duplicateStatus.equals(other.getDuplicateStatus()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        _hashCode += new Long(getEntityId()).hashCode();
        if (getDatabaseAction() != null) {
            _hashCode += getDatabaseAction().hashCode();
        }
        if (getDuplicateStatus() != null) {
            _hashCode += getDuplicateStatus().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityReturnInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityReturnInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databaseAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DatabaseAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityReturnInfoDatabaseAction"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DuplicateStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityDuplicateStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Message"));
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
