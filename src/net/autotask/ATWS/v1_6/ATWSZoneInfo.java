/**
 * ATWSZoneInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ATWSZoneInfo  implements java.io.Serializable {
    private java.lang.String URL;

    private int errorCode;

    private java.lang.String dataBaseType;

    private int CI;

    private java.lang.String webUrl;

    public ATWSZoneInfo() {
    }

    public ATWSZoneInfo(
           java.lang.String URL,
           int errorCode,
           java.lang.String dataBaseType,
           int CI,
           java.lang.String webUrl) {
           this.URL = URL;
           this.errorCode = errorCode;
           this.dataBaseType = dataBaseType;
           this.CI = CI;
           this.webUrl = webUrl;
    }


    /**
     * Gets the URL value for this ATWSZoneInfo.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this ATWSZoneInfo.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the errorCode value for this ATWSZoneInfo.
     * 
     * @return errorCode
     */
    public int getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ATWSZoneInfo.
     * 
     * @param errorCode
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the dataBaseType value for this ATWSZoneInfo.
     * 
     * @return dataBaseType
     */
    public java.lang.String getDataBaseType() {
        return dataBaseType;
    }


    /**
     * Sets the dataBaseType value for this ATWSZoneInfo.
     * 
     * @param dataBaseType
     */
    public void setDataBaseType(java.lang.String dataBaseType) {
        this.dataBaseType = dataBaseType;
    }


    /**
     * Gets the CI value for this ATWSZoneInfo.
     * 
     * @return CI
     */
    public int getCI() {
        return CI;
    }


    /**
     * Sets the CI value for this ATWSZoneInfo.
     * 
     * @param CI
     */
    public void setCI(int CI) {
        this.CI = CI;
    }


    /**
     * Gets the webUrl value for this ATWSZoneInfo.
     * 
     * @return webUrl
     */
    public java.lang.String getWebUrl() {
        return webUrl;
    }


    /**
     * Sets the webUrl value for this ATWSZoneInfo.
     * 
     * @param webUrl
     */
    public void setWebUrl(java.lang.String webUrl) {
        this.webUrl = webUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ATWSZoneInfo)) return false;
        ATWSZoneInfo other = (ATWSZoneInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            this.errorCode == other.getErrorCode() &&
            ((this.dataBaseType==null && other.getDataBaseType()==null) || 
             (this.dataBaseType!=null &&
              this.dataBaseType.equals(other.getDataBaseType()))) &&
            this.CI == other.getCI() &&
            ((this.webUrl==null && other.getWebUrl()==null) || 
             (this.webUrl!=null &&
              this.webUrl.equals(other.getWebUrl())));
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
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        _hashCode += getErrorCode();
        if (getDataBaseType() != null) {
            _hashCode += getDataBaseType().hashCode();
        }
        _hashCode += getCI();
        if (getWebUrl() != null) {
            _hashCode += getWebUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ATWSZoneInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ATWSZoneInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataBaseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DataBaseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WebUrl"));
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
