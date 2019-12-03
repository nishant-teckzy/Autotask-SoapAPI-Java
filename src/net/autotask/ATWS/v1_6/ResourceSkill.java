/**
 * ResourceSkill.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ResourceSkill  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object resourceID;

    private java.lang.Object skillDescription;

    private java.lang.Object skillID;

    private java.lang.Object skillLevel;

    public ResourceSkill() {
    }

    public ResourceSkill(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object resourceID,
           java.lang.Object skillDescription,
           java.lang.Object skillID,
           java.lang.Object skillLevel) {
        super(
            fields,
            id,
            userDefinedFields);
        this.resourceID = resourceID;
        this.skillDescription = skillDescription;
        this.skillID = skillID;
        this.skillLevel = skillLevel;
    }


    /**
     * Gets the resourceID value for this ResourceSkill.
     * 
     * @return resourceID
     */
    public java.lang.Object getResourceID() {
        return resourceID;
    }


    /**
     * Sets the resourceID value for this ResourceSkill.
     * 
     * @param resourceID
     */
    public void setResourceID(java.lang.Object resourceID) {
        this.resourceID = resourceID;
    }


    /**
     * Gets the skillDescription value for this ResourceSkill.
     * 
     * @return skillDescription
     */
    public java.lang.Object getSkillDescription() {
        return skillDescription;
    }


    /**
     * Sets the skillDescription value for this ResourceSkill.
     * 
     * @param skillDescription
     */
    public void setSkillDescription(java.lang.Object skillDescription) {
        this.skillDescription = skillDescription;
    }


    /**
     * Gets the skillID value for this ResourceSkill.
     * 
     * @return skillID
     */
    public java.lang.Object getSkillID() {
        return skillID;
    }


    /**
     * Sets the skillID value for this ResourceSkill.
     * 
     * @param skillID
     */
    public void setSkillID(java.lang.Object skillID) {
        this.skillID = skillID;
    }


    /**
     * Gets the skillLevel value for this ResourceSkill.
     * 
     * @return skillLevel
     */
    public java.lang.Object getSkillLevel() {
        return skillLevel;
    }


    /**
     * Sets the skillLevel value for this ResourceSkill.
     * 
     * @param skillLevel
     */
    public void setSkillLevel(java.lang.Object skillLevel) {
        this.skillLevel = skillLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceSkill)) return false;
        ResourceSkill other = (ResourceSkill) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.resourceID==null && other.getResourceID()==null) || 
             (this.resourceID!=null &&
              this.resourceID.equals(other.getResourceID()))) &&
            ((this.skillDescription==null && other.getSkillDescription()==null) || 
             (this.skillDescription!=null &&
              this.skillDescription.equals(other.getSkillDescription()))) &&
            ((this.skillID==null && other.getSkillID()==null) || 
             (this.skillID!=null &&
              this.skillID.equals(other.getSkillID()))) &&
            ((this.skillLevel==null && other.getSkillLevel()==null) || 
             (this.skillLevel!=null &&
              this.skillLevel.equals(other.getSkillLevel())));
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
        if (getResourceID() != null) {
            _hashCode += getResourceID().hashCode();
        }
        if (getSkillDescription() != null) {
            _hashCode += getSkillDescription().hashCode();
        }
        if (getSkillID() != null) {
            _hashCode += getSkillID().hashCode();
        }
        if (getSkillLevel() != null) {
            _hashCode += getSkillLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceSkill.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ResourceSkill"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skillDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SkillDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skillID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SkillID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skillLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SkillLevel"));
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
