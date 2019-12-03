/**
 * InternalLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class InternalLocation  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object name;

    private java.lang.Object address1;

    private java.lang.Object address2;

    private java.lang.Object city;

    private java.lang.Object state;

    private java.lang.Object postalCode;

    private java.lang.Object country;

    private java.lang.Object additionalAddressInfo;

    private java.lang.Object timeZone;

    private java.lang.Object holidaySetId;

    private java.lang.Object isDefault;

    public InternalLocation() {
    }

    public InternalLocation(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object name,
           java.lang.Object address1,
           java.lang.Object address2,
           java.lang.Object city,
           java.lang.Object state,
           java.lang.Object postalCode,
           java.lang.Object country,
           java.lang.Object additionalAddressInfo,
           java.lang.Object timeZone,
           java.lang.Object holidaySetId,
           java.lang.Object isDefault) {
        super(
            fields,
            id,
            userDefinedFields);
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.additionalAddressInfo = additionalAddressInfo;
        this.timeZone = timeZone;
        this.holidaySetId = holidaySetId;
        this.isDefault = isDefault;
    }


    /**
     * Gets the name value for this InternalLocation.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this InternalLocation.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the address1 value for this InternalLocation.
     * 
     * @return address1
     */
    public java.lang.Object getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this InternalLocation.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.Object address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this InternalLocation.
     * 
     * @return address2
     */
    public java.lang.Object getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this InternalLocation.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.Object address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this InternalLocation.
     * 
     * @return city
     */
    public java.lang.Object getCity() {
        return city;
    }


    /**
     * Sets the city value for this InternalLocation.
     * 
     * @param city
     */
    public void setCity(java.lang.Object city) {
        this.city = city;
    }


    /**
     * Gets the state value for this InternalLocation.
     * 
     * @return state
     */
    public java.lang.Object getState() {
        return state;
    }


    /**
     * Sets the state value for this InternalLocation.
     * 
     * @param state
     */
    public void setState(java.lang.Object state) {
        this.state = state;
    }


    /**
     * Gets the postalCode value for this InternalLocation.
     * 
     * @return postalCode
     */
    public java.lang.Object getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this InternalLocation.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.Object postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the country value for this InternalLocation.
     * 
     * @return country
     */
    public java.lang.Object getCountry() {
        return country;
    }


    /**
     * Sets the country value for this InternalLocation.
     * 
     * @param country
     */
    public void setCountry(java.lang.Object country) {
        this.country = country;
    }


    /**
     * Gets the additionalAddressInfo value for this InternalLocation.
     * 
     * @return additionalAddressInfo
     */
    public java.lang.Object getAdditionalAddressInfo() {
        return additionalAddressInfo;
    }


    /**
     * Sets the additionalAddressInfo value for this InternalLocation.
     * 
     * @param additionalAddressInfo
     */
    public void setAdditionalAddressInfo(java.lang.Object additionalAddressInfo) {
        this.additionalAddressInfo = additionalAddressInfo;
    }


    /**
     * Gets the timeZone value for this InternalLocation.
     * 
     * @return timeZone
     */
    public java.lang.Object getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this InternalLocation.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.Object timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the holidaySetId value for this InternalLocation.
     * 
     * @return holidaySetId
     */
    public java.lang.Object getHolidaySetId() {
        return holidaySetId;
    }


    /**
     * Sets the holidaySetId value for this InternalLocation.
     * 
     * @param holidaySetId
     */
    public void setHolidaySetId(java.lang.Object holidaySetId) {
        this.holidaySetId = holidaySetId;
    }


    /**
     * Gets the isDefault value for this InternalLocation.
     * 
     * @return isDefault
     */
    public java.lang.Object getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this InternalLocation.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Object isDefault) {
        this.isDefault = isDefault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternalLocation)) return false;
        InternalLocation other = (InternalLocation) obj;
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
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.additionalAddressInfo==null && other.getAdditionalAddressInfo()==null) || 
             (this.additionalAddressInfo!=null &&
              this.additionalAddressInfo.equals(other.getAdditionalAddressInfo()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.holidaySetId==null && other.getHolidaySetId()==null) || 
             (this.holidaySetId!=null &&
              this.holidaySetId.equals(other.getHolidaySetId()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault())));
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
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getAdditionalAddressInfo() != null) {
            _hashCode += getAdditionalAddressInfo().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getHolidaySetId() != null) {
            _hashCode += getHolidaySetId().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternalLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalAddressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdditionalAddressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidaySetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HolidaySetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsDefault"));
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
