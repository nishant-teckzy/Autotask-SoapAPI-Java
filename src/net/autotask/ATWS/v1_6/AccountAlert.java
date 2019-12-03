/**
 * AccountAlert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class AccountAlert  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object accountID;

    private java.lang.Object alertTypeID;

    private java.lang.Object alertText;

    public AccountAlert() {
    }

    public AccountAlert(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountID,
           java.lang.Object alertTypeID,
           java.lang.Object alertText) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountID = accountID;
        this.alertTypeID = alertTypeID;
        this.alertText = alertText;
    }


    /**
     * Gets the accountID value for this AccountAlert.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this AccountAlert.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the alertTypeID value for this AccountAlert.
     * 
     * @return alertTypeID
     */
    public java.lang.Object getAlertTypeID() {
        return alertTypeID;
    }


    /**
     * Sets the alertTypeID value for this AccountAlert.
     * 
     * @param alertTypeID
     */
    public void setAlertTypeID(java.lang.Object alertTypeID) {
        this.alertTypeID = alertTypeID;
    }


    /**
     * Gets the alertText value for this AccountAlert.
     * 
     * @return alertText
     */
    public java.lang.Object getAlertText() {
        return alertText;
    }


    /**
     * Sets the alertText value for this AccountAlert.
     * 
     * @param alertText
     */
    public void setAlertText(java.lang.Object alertText) {
        this.alertText = alertText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountAlert)) return false;
        AccountAlert other = (AccountAlert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.alertTypeID==null && other.getAlertTypeID()==null) || 
             (this.alertTypeID!=null &&
              this.alertTypeID.equals(other.getAlertTypeID()))) &&
            ((this.alertText==null && other.getAlertText()==null) || 
             (this.alertText!=null &&
              this.alertText.equals(other.getAlertText())));
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
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getAlertTypeID() != null) {
            _hashCode += getAlertTypeID().hashCode();
        }
        if (getAlertText() != null) {
            _hashCode += getAlertText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountAlert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountAlert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AlertTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AlertText"));
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
