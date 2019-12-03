/**
 * EntityDuplicateStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class EntityDuplicateStatus  implements java.io.Serializable {
    private boolean found;

    private java.lang.String matchInfo;

    private boolean ignored;

    public EntityDuplicateStatus() {
    }

    public EntityDuplicateStatus(
           boolean found,
           java.lang.String matchInfo,
           boolean ignored) {
           this.found = found;
           this.matchInfo = matchInfo;
           this.ignored = ignored;
    }


    /**
     * Gets the found value for this EntityDuplicateStatus.
     * 
     * @return found
     */
    public boolean isFound() {
        return found;
    }


    /**
     * Sets the found value for this EntityDuplicateStatus.
     * 
     * @param found
     */
    public void setFound(boolean found) {
        this.found = found;
    }


    /**
     * Gets the matchInfo value for this EntityDuplicateStatus.
     * 
     * @return matchInfo
     */
    public java.lang.String getMatchInfo() {
        return matchInfo;
    }


    /**
     * Sets the matchInfo value for this EntityDuplicateStatus.
     * 
     * @param matchInfo
     */
    public void setMatchInfo(java.lang.String matchInfo) {
        this.matchInfo = matchInfo;
    }


    /**
     * Gets the ignored value for this EntityDuplicateStatus.
     * 
     * @return ignored
     */
    public boolean isIgnored() {
        return ignored;
    }


    /**
     * Sets the ignored value for this EntityDuplicateStatus.
     * 
     * @param ignored
     */
    public void setIgnored(boolean ignored) {
        this.ignored = ignored;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityDuplicateStatus)) return false;
        EntityDuplicateStatus other = (EntityDuplicateStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.found == other.isFound() &&
            ((this.matchInfo==null && other.getMatchInfo()==null) || 
             (this.matchInfo!=null &&
              this.matchInfo.equals(other.getMatchInfo()))) &&
            this.ignored == other.isIgnored();
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
        _hashCode += (isFound() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMatchInfo() != null) {
            _hashCode += getMatchInfo().hashCode();
        }
        _hashCode += (isIgnored() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityDuplicateStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntityDuplicateStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("found");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Found"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MatchInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignored");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Ignored"));
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
