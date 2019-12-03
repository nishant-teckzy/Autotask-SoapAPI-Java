/**
 * SubscriptionPeriod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class SubscriptionPeriod  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object subscriptionID;

    private java.lang.Object periodDate;

    private java.lang.Object periodPrice;

    private java.lang.Object periodCost;

    private java.lang.Object postedDate;

    private java.lang.Object purchaseOrderNumber;

    public SubscriptionPeriod() {
    }

    public SubscriptionPeriod(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object subscriptionID,
           java.lang.Object periodDate,
           java.lang.Object periodPrice,
           java.lang.Object periodCost,
           java.lang.Object postedDate,
           java.lang.Object purchaseOrderNumber) {
        super(
            fields,
            id,
            userDefinedFields);
        this.subscriptionID = subscriptionID;
        this.periodDate = periodDate;
        this.periodPrice = periodPrice;
        this.periodCost = periodCost;
        this.postedDate = postedDate;
        this.purchaseOrderNumber = purchaseOrderNumber;
    }


    /**
     * Gets the subscriptionID value for this SubscriptionPeriod.
     * 
     * @return subscriptionID
     */
    public java.lang.Object getSubscriptionID() {
        return subscriptionID;
    }


    /**
     * Sets the subscriptionID value for this SubscriptionPeriod.
     * 
     * @param subscriptionID
     */
    public void setSubscriptionID(java.lang.Object subscriptionID) {
        this.subscriptionID = subscriptionID;
    }


    /**
     * Gets the periodDate value for this SubscriptionPeriod.
     * 
     * @return periodDate
     */
    public java.lang.Object getPeriodDate() {
        return periodDate;
    }


    /**
     * Sets the periodDate value for this SubscriptionPeriod.
     * 
     * @param periodDate
     */
    public void setPeriodDate(java.lang.Object periodDate) {
        this.periodDate = periodDate;
    }


    /**
     * Gets the periodPrice value for this SubscriptionPeriod.
     * 
     * @return periodPrice
     */
    public java.lang.Object getPeriodPrice() {
        return periodPrice;
    }


    /**
     * Sets the periodPrice value for this SubscriptionPeriod.
     * 
     * @param periodPrice
     */
    public void setPeriodPrice(java.lang.Object periodPrice) {
        this.periodPrice = periodPrice;
    }


    /**
     * Gets the periodCost value for this SubscriptionPeriod.
     * 
     * @return periodCost
     */
    public java.lang.Object getPeriodCost() {
        return periodCost;
    }


    /**
     * Sets the periodCost value for this SubscriptionPeriod.
     * 
     * @param periodCost
     */
    public void setPeriodCost(java.lang.Object periodCost) {
        this.periodCost = periodCost;
    }


    /**
     * Gets the postedDate value for this SubscriptionPeriod.
     * 
     * @return postedDate
     */
    public java.lang.Object getPostedDate() {
        return postedDate;
    }


    /**
     * Sets the postedDate value for this SubscriptionPeriod.
     * 
     * @param postedDate
     */
    public void setPostedDate(java.lang.Object postedDate) {
        this.postedDate = postedDate;
    }


    /**
     * Gets the purchaseOrderNumber value for this SubscriptionPeriod.
     * 
     * @return purchaseOrderNumber
     */
    public java.lang.Object getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }


    /**
     * Sets the purchaseOrderNumber value for this SubscriptionPeriod.
     * 
     * @param purchaseOrderNumber
     */
    public void setPurchaseOrderNumber(java.lang.Object purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriptionPeriod)) return false;
        SubscriptionPeriod other = (SubscriptionPeriod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriptionID==null && other.getSubscriptionID()==null) || 
             (this.subscriptionID!=null &&
              this.subscriptionID.equals(other.getSubscriptionID()))) &&
            ((this.periodDate==null && other.getPeriodDate()==null) || 
             (this.periodDate!=null &&
              this.periodDate.equals(other.getPeriodDate()))) &&
            ((this.periodPrice==null && other.getPeriodPrice()==null) || 
             (this.periodPrice!=null &&
              this.periodPrice.equals(other.getPeriodPrice()))) &&
            ((this.periodCost==null && other.getPeriodCost()==null) || 
             (this.periodCost!=null &&
              this.periodCost.equals(other.getPeriodCost()))) &&
            ((this.postedDate==null && other.getPostedDate()==null) || 
             (this.postedDate!=null &&
              this.postedDate.equals(other.getPostedDate()))) &&
            ((this.purchaseOrderNumber==null && other.getPurchaseOrderNumber()==null) || 
             (this.purchaseOrderNumber!=null &&
              this.purchaseOrderNumber.equals(other.getPurchaseOrderNumber())));
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
        if (getSubscriptionID() != null) {
            _hashCode += getSubscriptionID().hashCode();
        }
        if (getPeriodDate() != null) {
            _hashCode += getPeriodDate().hashCode();
        }
        if (getPeriodPrice() != null) {
            _hashCode += getPeriodPrice().hashCode();
        }
        if (getPeriodCost() != null) {
            _hashCode += getPeriodCost().hashCode();
        }
        if (getPostedDate() != null) {
            _hashCode += getPostedDate().hashCode();
        }
        if (getPurchaseOrderNumber() != null) {
            _hashCode += getPurchaseOrderNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriptionPeriod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SubscriptionPeriod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SubscriptionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PeriodDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PeriodPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PeriodCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PostedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PurchaseOrderNumber"));
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
