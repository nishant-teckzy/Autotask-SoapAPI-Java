/**
 * AutotaskIntegrations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class AutotaskIntegrations  implements java.io.Serializable {
    private java.lang.String partnerID;

    private java.lang.String integrationCode;

    private java.lang.Integer impersonateAsResourceID;

    public AutotaskIntegrations() {
    }

    public AutotaskIntegrations(
           java.lang.String partnerID,
           java.lang.String integrationCode,
           java.lang.Integer impersonateAsResourceID) {
           this.partnerID = partnerID;
           this.integrationCode = integrationCode;
           this.impersonateAsResourceID = impersonateAsResourceID;
    }


    /**
     * Gets the partnerID value for this AutotaskIntegrations.
     * 
     * @return partnerID
     */
    public java.lang.String getPartnerID() {
        return partnerID;
    }


    /**
     * Sets the partnerID value for this AutotaskIntegrations.
     * 
     * @param partnerID
     */
    public void setPartnerID(java.lang.String partnerID) {
        this.partnerID = partnerID;
    }


    /**
     * Gets the integrationCode value for this AutotaskIntegrations.
     * 
     * @return integrationCode
     */
    public java.lang.String getIntegrationCode() {
        return integrationCode;
    }


    /**
     * Sets the integrationCode value for this AutotaskIntegrations.
     * 
     * @param integrationCode
     */
    public void setIntegrationCode(java.lang.String integrationCode) {
        this.integrationCode = integrationCode;
    }


    /**
     * Gets the impersonateAsResourceID value for this AutotaskIntegrations.
     * 
     * @return impersonateAsResourceID
     */
    public java.lang.Integer getImpersonateAsResourceID() {
        return impersonateAsResourceID;
    }


    /**
     * Sets the impersonateAsResourceID value for this AutotaskIntegrations.
     * 
     * @param impersonateAsResourceID
     */
    public void setImpersonateAsResourceID(java.lang.Integer impersonateAsResourceID) {
        this.impersonateAsResourceID = impersonateAsResourceID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutotaskIntegrations)) return false;
        AutotaskIntegrations other = (AutotaskIntegrations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partnerID==null && other.getPartnerID()==null) || 
             (this.partnerID!=null &&
              this.partnerID.equals(other.getPartnerID()))) &&
            ((this.integrationCode==null && other.getIntegrationCode()==null) || 
             (this.integrationCode!=null &&
              this.integrationCode.equals(other.getIntegrationCode()))) &&
            ((this.impersonateAsResourceID==null && other.getImpersonateAsResourceID()==null) || 
             (this.impersonateAsResourceID!=null &&
              this.impersonateAsResourceID.equals(other.getImpersonateAsResourceID())));
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
        if (getPartnerID() != null) {
            _hashCode += getPartnerID().hashCode();
        }
        if (getIntegrationCode() != null) {
            _hashCode += getIntegrationCode().hashCode();
        }
        if (getImpersonateAsResourceID() != null) {
            _hashCode += getImpersonateAsResourceID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutotaskIntegrations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AutotaskIntegrations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PartnerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IntegrationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impersonateAsResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ImpersonateAsResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
