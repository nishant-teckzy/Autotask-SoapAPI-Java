/**
 * ProductVendor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ProductVendor  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object productID;

    private java.lang.Object vendorID;

    private java.lang.Object vendorCost;

    private java.lang.Object vendorPartNumber;

    private java.lang.Object active;

    private java.lang.Object isDefault;

    public ProductVendor() {
    }

    public ProductVendor(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object productID,
           java.lang.Object vendorID,
           java.lang.Object vendorCost,
           java.lang.Object vendorPartNumber,
           java.lang.Object active,
           java.lang.Object isDefault) {
        super(
            fields,
            id,
            userDefinedFields);
        this.productID = productID;
        this.vendorID = vendorID;
        this.vendorCost = vendorCost;
        this.vendorPartNumber = vendorPartNumber;
        this.active = active;
        this.isDefault = isDefault;
    }


    /**
     * Gets the productID value for this ProductVendor.
     * 
     * @return productID
     */
    public java.lang.Object getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this ProductVendor.
     * 
     * @param productID
     */
    public void setProductID(java.lang.Object productID) {
        this.productID = productID;
    }


    /**
     * Gets the vendorID value for this ProductVendor.
     * 
     * @return vendorID
     */
    public java.lang.Object getVendorID() {
        return vendorID;
    }


    /**
     * Sets the vendorID value for this ProductVendor.
     * 
     * @param vendorID
     */
    public void setVendorID(java.lang.Object vendorID) {
        this.vendorID = vendorID;
    }


    /**
     * Gets the vendorCost value for this ProductVendor.
     * 
     * @return vendorCost
     */
    public java.lang.Object getVendorCost() {
        return vendorCost;
    }


    /**
     * Sets the vendorCost value for this ProductVendor.
     * 
     * @param vendorCost
     */
    public void setVendorCost(java.lang.Object vendorCost) {
        this.vendorCost = vendorCost;
    }


    /**
     * Gets the vendorPartNumber value for this ProductVendor.
     * 
     * @return vendorPartNumber
     */
    public java.lang.Object getVendorPartNumber() {
        return vendorPartNumber;
    }


    /**
     * Sets the vendorPartNumber value for this ProductVendor.
     * 
     * @param vendorPartNumber
     */
    public void setVendorPartNumber(java.lang.Object vendorPartNumber) {
        this.vendorPartNumber = vendorPartNumber;
    }


    /**
     * Gets the active value for this ProductVendor.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this ProductVendor.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the isDefault value for this ProductVendor.
     * 
     * @return isDefault
     */
    public java.lang.Object getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this ProductVendor.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Object isDefault) {
        this.isDefault = isDefault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductVendor)) return false;
        ProductVendor other = (ProductVendor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.vendorID==null && other.getVendorID()==null) || 
             (this.vendorID!=null &&
              this.vendorID.equals(other.getVendorID()))) &&
            ((this.vendorCost==null && other.getVendorCost()==null) || 
             (this.vendorCost!=null &&
              this.vendorCost.equals(other.getVendorCost()))) &&
            ((this.vendorPartNumber==null && other.getVendorPartNumber()==null) || 
             (this.vendorPartNumber!=null &&
              this.vendorPartNumber.equals(other.getVendorPartNumber()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
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
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getVendorID() != null) {
            _hashCode += getVendorID().hashCode();
        }
        if (getVendorCost() != null) {
            _hashCode += getVendorCost().hashCode();
        }
        if (getVendorPartNumber() != null) {
            _hashCode += getVendorPartNumber().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductVendor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProductVendor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "VendorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "VendorCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorPartNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "VendorPartNumber"));
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
