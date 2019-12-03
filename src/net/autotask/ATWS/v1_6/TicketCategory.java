/**
 * TicketCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class TicketCategory  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object name;

    private java.lang.Object nickname;

    private java.lang.Object active;

    private java.lang.Object displayColorRGB;

    private java.lang.Object globalDefault;

    private java.lang.Object apiOnly;

    public TicketCategory() {
    }

    public TicketCategory(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object name,
           java.lang.Object nickname,
           java.lang.Object active,
           java.lang.Object displayColorRGB,
           java.lang.Object globalDefault,
           java.lang.Object apiOnly) {
        super(
            fields,
            id,
            userDefinedFields);
        this.name = name;
        this.nickname = nickname;
        this.active = active;
        this.displayColorRGB = displayColorRGB;
        this.globalDefault = globalDefault;
        this.apiOnly = apiOnly;
    }


    /**
     * Gets the name value for this TicketCategory.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this TicketCategory.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the nickname value for this TicketCategory.
     * 
     * @return nickname
     */
    public java.lang.Object getNickname() {
        return nickname;
    }


    /**
     * Sets the nickname value for this TicketCategory.
     * 
     * @param nickname
     */
    public void setNickname(java.lang.Object nickname) {
        this.nickname = nickname;
    }


    /**
     * Gets the active value for this TicketCategory.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this TicketCategory.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the displayColorRGB value for this TicketCategory.
     * 
     * @return displayColorRGB
     */
    public java.lang.Object getDisplayColorRGB() {
        return displayColorRGB;
    }


    /**
     * Sets the displayColorRGB value for this TicketCategory.
     * 
     * @param displayColorRGB
     */
    public void setDisplayColorRGB(java.lang.Object displayColorRGB) {
        this.displayColorRGB = displayColorRGB;
    }


    /**
     * Gets the globalDefault value for this TicketCategory.
     * 
     * @return globalDefault
     */
    public java.lang.Object getGlobalDefault() {
        return globalDefault;
    }


    /**
     * Sets the globalDefault value for this TicketCategory.
     * 
     * @param globalDefault
     */
    public void setGlobalDefault(java.lang.Object globalDefault) {
        this.globalDefault = globalDefault;
    }


    /**
     * Gets the apiOnly value for this TicketCategory.
     * 
     * @return apiOnly
     */
    public java.lang.Object getApiOnly() {
        return apiOnly;
    }


    /**
     * Sets the apiOnly value for this TicketCategory.
     * 
     * @param apiOnly
     */
    public void setApiOnly(java.lang.Object apiOnly) {
        this.apiOnly = apiOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketCategory)) return false;
        TicketCategory other = (TicketCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nickname==null && other.getNickname()==null) || 
             (this.nickname!=null &&
              this.nickname.equals(other.getNickname()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.displayColorRGB==null && other.getDisplayColorRGB()==null) || 
             (this.displayColorRGB!=null &&
              this.displayColorRGB.equals(other.getDisplayColorRGB()))) &&
            ((this.globalDefault==null && other.getGlobalDefault()==null) || 
             (this.globalDefault!=null &&
              this.globalDefault.equals(other.getGlobalDefault()))) &&
            ((this.apiOnly==null && other.getApiOnly()==null) || 
             (this.apiOnly!=null &&
              this.apiOnly.equals(other.getApiOnly())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNickname() != null) {
            _hashCode += getNickname().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getDisplayColorRGB() != null) {
            _hashCode += getDisplayColorRGB().hashCode();
        }
        if (getGlobalDefault() != null) {
            _hashCode += getGlobalDefault().hashCode();
        }
        if (getApiOnly() != null) {
            _hashCode += getApiOnly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Nickname"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayColorRGB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DisplayColorRGB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "GlobalDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ApiOnly"));
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
