/**
 * Tax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Tax  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object taxRegionID;

    private java.lang.Object taxCategoryID;

    private java.lang.Object taxName;

    private java.lang.Object taxRate;

    private java.lang.Object isCompounded;

    public Tax() {
    }

    public Tax(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object taxRegionID,
           java.lang.Object taxCategoryID,
           java.lang.Object taxName,
           java.lang.Object taxRate,
           java.lang.Object isCompounded) {
        super(
            fields,
            id,
            userDefinedFields);
        this.taxRegionID = taxRegionID;
        this.taxCategoryID = taxCategoryID;
        this.taxName = taxName;
        this.taxRate = taxRate;
        this.isCompounded = isCompounded;
    }


    /**
     * Gets the taxRegionID value for this Tax.
     * 
     * @return taxRegionID
     */
    public java.lang.Object getTaxRegionID() {
        return taxRegionID;
    }


    /**
     * Sets the taxRegionID value for this Tax.
     * 
     * @param taxRegionID
     */
    public void setTaxRegionID(java.lang.Object taxRegionID) {
        this.taxRegionID = taxRegionID;
    }


    /**
     * Gets the taxCategoryID value for this Tax.
     * 
     * @return taxCategoryID
     */
    public java.lang.Object getTaxCategoryID() {
        return taxCategoryID;
    }


    /**
     * Sets the taxCategoryID value for this Tax.
     * 
     * @param taxCategoryID
     */
    public void setTaxCategoryID(java.lang.Object taxCategoryID) {
        this.taxCategoryID = taxCategoryID;
    }


    /**
     * Gets the taxName value for this Tax.
     * 
     * @return taxName
     */
    public java.lang.Object getTaxName() {
        return taxName;
    }


    /**
     * Sets the taxName value for this Tax.
     * 
     * @param taxName
     */
    public void setTaxName(java.lang.Object taxName) {
        this.taxName = taxName;
    }


    /**
     * Gets the taxRate value for this Tax.
     * 
     * @return taxRate
     */
    public java.lang.Object getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this Tax.
     * 
     * @param taxRate
     */
    public void setTaxRate(java.lang.Object taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the isCompounded value for this Tax.
     * 
     * @return isCompounded
     */
    public java.lang.Object getIsCompounded() {
        return isCompounded;
    }


    /**
     * Sets the isCompounded value for this Tax.
     * 
     * @param isCompounded
     */
    public void setIsCompounded(java.lang.Object isCompounded) {
        this.isCompounded = isCompounded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tax)) return false;
        Tax other = (Tax) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.taxRegionID==null && other.getTaxRegionID()==null) || 
             (this.taxRegionID!=null &&
              this.taxRegionID.equals(other.getTaxRegionID()))) &&
            ((this.taxCategoryID==null && other.getTaxCategoryID()==null) || 
             (this.taxCategoryID!=null &&
              this.taxCategoryID.equals(other.getTaxCategoryID()))) &&
            ((this.taxName==null && other.getTaxName()==null) || 
             (this.taxName!=null &&
              this.taxName.equals(other.getTaxName()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.isCompounded==null && other.getIsCompounded()==null) || 
             (this.isCompounded!=null &&
              this.isCompounded.equals(other.getIsCompounded())));
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
        if (getTaxRegionID() != null) {
            _hashCode += getTaxRegionID().hashCode();
        }
        if (getTaxCategoryID() != null) {
            _hashCode += getTaxCategoryID().hashCode();
        }
        if (getTaxName() != null) {
            _hashCode += getTaxName().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getIsCompounded() != null) {
            _hashCode += getIsCompounded().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Tax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaxRegionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCategoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaxCategoryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaxName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCompounded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsCompounded"));
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
