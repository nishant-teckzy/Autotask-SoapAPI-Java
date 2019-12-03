/**
 * ClientPortalUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ClientPortalUser  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object securityLevel;

    private java.lang.Object contactID;

    private java.lang.Object dateFormat;

    private java.lang.Object timeFormat;

    private java.lang.Object numberFormat;

    private java.lang.Object userName;

    private java.lang.Object password;

    private java.lang.Object clientPortalActive;

    public ClientPortalUser() {
    }

    public ClientPortalUser(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object securityLevel,
           java.lang.Object contactID,
           java.lang.Object dateFormat,
           java.lang.Object timeFormat,
           java.lang.Object numberFormat,
           java.lang.Object userName,
           java.lang.Object password,
           java.lang.Object clientPortalActive) {
        super(
            fields,
            id,
            userDefinedFields);
        this.securityLevel = securityLevel;
        this.contactID = contactID;
        this.dateFormat = dateFormat;
        this.timeFormat = timeFormat;
        this.numberFormat = numberFormat;
        this.userName = userName;
        this.password = password;
        this.clientPortalActive = clientPortalActive;
    }


    /**
     * Gets the securityLevel value for this ClientPortalUser.
     * 
     * @return securityLevel
     */
    public java.lang.Object getSecurityLevel() {
        return securityLevel;
    }


    /**
     * Sets the securityLevel value for this ClientPortalUser.
     * 
     * @param securityLevel
     */
    public void setSecurityLevel(java.lang.Object securityLevel) {
        this.securityLevel = securityLevel;
    }


    /**
     * Gets the contactID value for this ClientPortalUser.
     * 
     * @return contactID
     */
    public java.lang.Object getContactID() {
        return contactID;
    }


    /**
     * Sets the contactID value for this ClientPortalUser.
     * 
     * @param contactID
     */
    public void setContactID(java.lang.Object contactID) {
        this.contactID = contactID;
    }


    /**
     * Gets the dateFormat value for this ClientPortalUser.
     * 
     * @return dateFormat
     */
    public java.lang.Object getDateFormat() {
        return dateFormat;
    }


    /**
     * Sets the dateFormat value for this ClientPortalUser.
     * 
     * @param dateFormat
     */
    public void setDateFormat(java.lang.Object dateFormat) {
        this.dateFormat = dateFormat;
    }


    /**
     * Gets the timeFormat value for this ClientPortalUser.
     * 
     * @return timeFormat
     */
    public java.lang.Object getTimeFormat() {
        return timeFormat;
    }


    /**
     * Sets the timeFormat value for this ClientPortalUser.
     * 
     * @param timeFormat
     */
    public void setTimeFormat(java.lang.Object timeFormat) {
        this.timeFormat = timeFormat;
    }


    /**
     * Gets the numberFormat value for this ClientPortalUser.
     * 
     * @return numberFormat
     */
    public java.lang.Object getNumberFormat() {
        return numberFormat;
    }


    /**
     * Sets the numberFormat value for this ClientPortalUser.
     * 
     * @param numberFormat
     */
    public void setNumberFormat(java.lang.Object numberFormat) {
        this.numberFormat = numberFormat;
    }


    /**
     * Gets the userName value for this ClientPortalUser.
     * 
     * @return userName
     */
    public java.lang.Object getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ClientPortalUser.
     * 
     * @param userName
     */
    public void setUserName(java.lang.Object userName) {
        this.userName = userName;
    }


    /**
     * Gets the password value for this ClientPortalUser.
     * 
     * @return password
     */
    public java.lang.Object getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ClientPortalUser.
     * 
     * @param password
     */
    public void setPassword(java.lang.Object password) {
        this.password = password;
    }


    /**
     * Gets the clientPortalActive value for this ClientPortalUser.
     * 
     * @return clientPortalActive
     */
    public java.lang.Object getClientPortalActive() {
        return clientPortalActive;
    }


    /**
     * Sets the clientPortalActive value for this ClientPortalUser.
     * 
     * @param clientPortalActive
     */
    public void setClientPortalActive(java.lang.Object clientPortalActive) {
        this.clientPortalActive = clientPortalActive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientPortalUser)) return false;
        ClientPortalUser other = (ClientPortalUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.securityLevel==null && other.getSecurityLevel()==null) || 
             (this.securityLevel!=null &&
              this.securityLevel.equals(other.getSecurityLevel()))) &&
            ((this.contactID==null && other.getContactID()==null) || 
             (this.contactID!=null &&
              this.contactID.equals(other.getContactID()))) &&
            ((this.dateFormat==null && other.getDateFormat()==null) || 
             (this.dateFormat!=null &&
              this.dateFormat.equals(other.getDateFormat()))) &&
            ((this.timeFormat==null && other.getTimeFormat()==null) || 
             (this.timeFormat!=null &&
              this.timeFormat.equals(other.getTimeFormat()))) &&
            ((this.numberFormat==null && other.getNumberFormat()==null) || 
             (this.numberFormat!=null &&
              this.numberFormat.equals(other.getNumberFormat()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.clientPortalActive==null && other.getClientPortalActive()==null) || 
             (this.clientPortalActive!=null &&
              this.clientPortalActive.equals(other.getClientPortalActive())));
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
        if (getSecurityLevel() != null) {
            _hashCode += getSecurityLevel().hashCode();
        }
        if (getContactID() != null) {
            _hashCode += getContactID().hashCode();
        }
        if (getDateFormat() != null) {
            _hashCode += getDateFormat().hashCode();
        }
        if (getTimeFormat() != null) {
            _hashCode += getTimeFormat().hashCode();
        }
        if (getNumberFormat() != null) {
            _hashCode += getNumberFormat().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getClientPortalActive() != null) {
            _hashCode += getClientPortalActive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClientPortalUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ClientPortalUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SecurityLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContactID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DateFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TimeFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NumberFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientPortalActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ClientPortalActive"));
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
