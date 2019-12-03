/**
 * ProductTier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ProductTier  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object productID;

    private java.lang.Object upToUnitCount;

    private java.lang.Object unitCost;

    private java.lang.Object unitPrice;

    public ProductTier() {
    }

    public ProductTier(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object productID,
           java.lang.Object upToUnitCount,
           java.lang.Object unitCost,
           java.lang.Object unitPrice) {
        super(
            fields,
            id,
            userDefinedFields);
        this.productID = productID;
        this.upToUnitCount = upToUnitCount;
        this.unitCost = unitCost;
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the productID value for this ProductTier.
     * 
     * @return productID
     */
    public java.lang.Object getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this ProductTier.
     * 
     * @param productID
     */
    public void setProductID(java.lang.Object productID) {
        this.productID = productID;
    }


    /**
     * Gets the upToUnitCount value for this ProductTier.
     * 
     * @return upToUnitCount
     */
    public java.lang.Object getUpToUnitCount() {
        return upToUnitCount;
    }


    /**
     * Sets the upToUnitCount value for this ProductTier.
     * 
     * @param upToUnitCount
     */
    public void setUpToUnitCount(java.lang.Object upToUnitCount) {
        this.upToUnitCount = upToUnitCount;
    }


    /**
     * Gets the unitCost value for this ProductTier.
     * 
     * @return unitCost
     */
    public java.lang.Object getUnitCost() {
        return unitCost;
    }


    /**
     * Sets the unitCost value for this ProductTier.
     * 
     * @param unitCost
     */
    public void setUnitCost(java.lang.Object unitCost) {
        this.unitCost = unitCost;
    }


    /**
     * Gets the unitPrice value for this ProductTier.
     * 
     * @return unitPrice
     */
    public java.lang.Object getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this ProductTier.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.lang.Object unitPrice) {
        this.unitPrice = unitPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductTier)) return false;
        ProductTier other = (ProductTier) obj;
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
            ((this.upToUnitCount==null && other.getUpToUnitCount()==null) || 
             (this.upToUnitCount!=null &&
              this.upToUnitCount.equals(other.getUpToUnitCount()))) &&
            ((this.unitCost==null && other.getUnitCost()==null) || 
             (this.unitCost!=null &&
              this.unitCost.equals(other.getUnitCost()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice())));
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
        if (getUpToUnitCount() != null) {
            _hashCode += getUpToUnitCount().hashCode();
        }
        if (getUnitCost() != null) {
            _hashCode += getUnitCost().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductTier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProductTier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upToUnitCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UpToUnitCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UnitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UnitPrice"));
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
