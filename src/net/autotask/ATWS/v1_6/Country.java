/**
 * Country.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Country  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object addressFormatID;

    private java.lang.Object active;

    private java.lang.Object countryCode;

    private java.lang.Object displayName;

    private java.lang.Object invoiceTemplateID;

    private java.lang.Object isDefaultCountry;

    private java.lang.Object name;

    private java.lang.Object quoteTemplateID;

    public Country() {
    }

    public Country(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object addressFormatID,
           java.lang.Object active,
           java.lang.Object countryCode,
           java.lang.Object displayName,
           java.lang.Object invoiceTemplateID,
           java.lang.Object isDefaultCountry,
           java.lang.Object name,
           java.lang.Object quoteTemplateID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.addressFormatID = addressFormatID;
        this.active = active;
        this.countryCode = countryCode;
        this.displayName = displayName;
        this.invoiceTemplateID = invoiceTemplateID;
        this.isDefaultCountry = isDefaultCountry;
        this.name = name;
        this.quoteTemplateID = quoteTemplateID;
    }


    /**
     * Gets the addressFormatID value for this Country.
     * 
     * @return addressFormatID
     */
    public java.lang.Object getAddressFormatID() {
        return addressFormatID;
    }


    /**
     * Sets the addressFormatID value for this Country.
     * 
     * @param addressFormatID
     */
    public void setAddressFormatID(java.lang.Object addressFormatID) {
        this.addressFormatID = addressFormatID;
    }


    /**
     * Gets the active value for this Country.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this Country.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the countryCode value for this Country.
     * 
     * @return countryCode
     */
    public java.lang.Object getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this Country.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.Object countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the displayName value for this Country.
     * 
     * @return displayName
     */
    public java.lang.Object getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this Country.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.Object displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the invoiceTemplateID value for this Country.
     * 
     * @return invoiceTemplateID
     */
    public java.lang.Object getInvoiceTemplateID() {
        return invoiceTemplateID;
    }


    /**
     * Sets the invoiceTemplateID value for this Country.
     * 
     * @param invoiceTemplateID
     */
    public void setInvoiceTemplateID(java.lang.Object invoiceTemplateID) {
        this.invoiceTemplateID = invoiceTemplateID;
    }


    /**
     * Gets the isDefaultCountry value for this Country.
     * 
     * @return isDefaultCountry
     */
    public java.lang.Object getIsDefaultCountry() {
        return isDefaultCountry;
    }


    /**
     * Sets the isDefaultCountry value for this Country.
     * 
     * @param isDefaultCountry
     */
    public void setIsDefaultCountry(java.lang.Object isDefaultCountry) {
        this.isDefaultCountry = isDefaultCountry;
    }


    /**
     * Gets the name value for this Country.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this Country.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the quoteTemplateID value for this Country.
     * 
     * @return quoteTemplateID
     */
    public java.lang.Object getQuoteTemplateID() {
        return quoteTemplateID;
    }


    /**
     * Sets the quoteTemplateID value for this Country.
     * 
     * @param quoteTemplateID
     */
    public void setQuoteTemplateID(java.lang.Object quoteTemplateID) {
        this.quoteTemplateID = quoteTemplateID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Country)) return false;
        Country other = (Country) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addressFormatID==null && other.getAddressFormatID()==null) || 
             (this.addressFormatID!=null &&
              this.addressFormatID.equals(other.getAddressFormatID()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.invoiceTemplateID==null && other.getInvoiceTemplateID()==null) || 
             (this.invoiceTemplateID!=null &&
              this.invoiceTemplateID.equals(other.getInvoiceTemplateID()))) &&
            ((this.isDefaultCountry==null && other.getIsDefaultCountry()==null) || 
             (this.isDefaultCountry!=null &&
              this.isDefaultCountry.equals(other.getIsDefaultCountry()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.quoteTemplateID==null && other.getQuoteTemplateID()==null) || 
             (this.quoteTemplateID!=null &&
              this.quoteTemplateID.equals(other.getQuoteTemplateID())));
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
        if (getAddressFormatID() != null) {
            _hashCode += getAddressFormatID().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getInvoiceTemplateID() != null) {
            _hashCode += getInvoiceTemplateID().hashCode();
        }
        if (getIsDefaultCountry() != null) {
            _hashCode += getIsDefaultCountry().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getQuoteTemplateID() != null) {
            _hashCode += getQuoteTemplateID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Country.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Country"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressFormatID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AddressFormatID"));
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
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceTemplateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceTemplateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsDefaultCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteTemplateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuoteTemplateID"));
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
