/**
 * Subscription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Subscription  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object subscriptionName;

    private java.lang.Object description;

    private java.lang.Object periodType;

    private java.lang.Object effectiveDate;

    private java.lang.Object expirationDate;

    private java.lang.Object periodPrice;

    private java.lang.Object totalPrice;

    private java.lang.Object materialCodeID;

    private java.lang.Object purchaseOrderNumber;

    private java.lang.Object periodCost;

    private java.lang.Object totalCost;

    private java.lang.Object status;

    private java.lang.Object installedProductID;

    private java.lang.Object vendorID;

    private java.lang.Object businessDivisionSubdivisionID;

    public Subscription() {
    }

    public Subscription(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object subscriptionName,
           java.lang.Object description,
           java.lang.Object periodType,
           java.lang.Object effectiveDate,
           java.lang.Object expirationDate,
           java.lang.Object periodPrice,
           java.lang.Object totalPrice,
           java.lang.Object materialCodeID,
           java.lang.Object purchaseOrderNumber,
           java.lang.Object periodCost,
           java.lang.Object totalCost,
           java.lang.Object status,
           java.lang.Object installedProductID,
           java.lang.Object vendorID,
           java.lang.Object businessDivisionSubdivisionID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.subscriptionName = subscriptionName;
        this.description = description;
        this.periodType = periodType;
        this.effectiveDate = effectiveDate;
        this.expirationDate = expirationDate;
        this.periodPrice = periodPrice;
        this.totalPrice = totalPrice;
        this.materialCodeID = materialCodeID;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.periodCost = periodCost;
        this.totalCost = totalCost;
        this.status = status;
        this.installedProductID = installedProductID;
        this.vendorID = vendorID;
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }


    /**
     * Gets the subscriptionName value for this Subscription.
     * 
     * @return subscriptionName
     */
    public java.lang.Object getSubscriptionName() {
        return subscriptionName;
    }


    /**
     * Sets the subscriptionName value for this Subscription.
     * 
     * @param subscriptionName
     */
    public void setSubscriptionName(java.lang.Object subscriptionName) {
        this.subscriptionName = subscriptionName;
    }


    /**
     * Gets the description value for this Subscription.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Subscription.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the periodType value for this Subscription.
     * 
     * @return periodType
     */
    public java.lang.Object getPeriodType() {
        return periodType;
    }


    /**
     * Sets the periodType value for this Subscription.
     * 
     * @param periodType
     */
    public void setPeriodType(java.lang.Object periodType) {
        this.periodType = periodType;
    }


    /**
     * Gets the effectiveDate value for this Subscription.
     * 
     * @return effectiveDate
     */
    public java.lang.Object getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this Subscription.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.Object effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expirationDate value for this Subscription.
     * 
     * @return expirationDate
     */
    public java.lang.Object getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this Subscription.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.Object expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the periodPrice value for this Subscription.
     * 
     * @return periodPrice
     */
    public java.lang.Object getPeriodPrice() {
        return periodPrice;
    }


    /**
     * Sets the periodPrice value for this Subscription.
     * 
     * @param periodPrice
     */
    public void setPeriodPrice(java.lang.Object periodPrice) {
        this.periodPrice = periodPrice;
    }


    /**
     * Gets the totalPrice value for this Subscription.
     * 
     * @return totalPrice
     */
    public java.lang.Object getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this Subscription.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(java.lang.Object totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the materialCodeID value for this Subscription.
     * 
     * @return materialCodeID
     */
    public java.lang.Object getMaterialCodeID() {
        return materialCodeID;
    }


    /**
     * Sets the materialCodeID value for this Subscription.
     * 
     * @param materialCodeID
     */
    public void setMaterialCodeID(java.lang.Object materialCodeID) {
        this.materialCodeID = materialCodeID;
    }


    /**
     * Gets the purchaseOrderNumber value for this Subscription.
     * 
     * @return purchaseOrderNumber
     */
    public java.lang.Object getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }


    /**
     * Sets the purchaseOrderNumber value for this Subscription.
     * 
     * @param purchaseOrderNumber
     */
    public void setPurchaseOrderNumber(java.lang.Object purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }


    /**
     * Gets the periodCost value for this Subscription.
     * 
     * @return periodCost
     */
    public java.lang.Object getPeriodCost() {
        return periodCost;
    }


    /**
     * Sets the periodCost value for this Subscription.
     * 
     * @param periodCost
     */
    public void setPeriodCost(java.lang.Object periodCost) {
        this.periodCost = periodCost;
    }


    /**
     * Gets the totalCost value for this Subscription.
     * 
     * @return totalCost
     */
    public java.lang.Object getTotalCost() {
        return totalCost;
    }


    /**
     * Sets the totalCost value for this Subscription.
     * 
     * @param totalCost
     */
    public void setTotalCost(java.lang.Object totalCost) {
        this.totalCost = totalCost;
    }


    /**
     * Gets the status value for this Subscription.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Subscription.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the installedProductID value for this Subscription.
     * 
     * @return installedProductID
     */
    public java.lang.Object getInstalledProductID() {
        return installedProductID;
    }


    /**
     * Sets the installedProductID value for this Subscription.
     * 
     * @param installedProductID
     */
    public void setInstalledProductID(java.lang.Object installedProductID) {
        this.installedProductID = installedProductID;
    }


    /**
     * Gets the vendorID value for this Subscription.
     * 
     * @return vendorID
     */
    public java.lang.Object getVendorID() {
        return vendorID;
    }


    /**
     * Sets the vendorID value for this Subscription.
     * 
     * @param vendorID
     */
    public void setVendorID(java.lang.Object vendorID) {
        this.vendorID = vendorID;
    }


    /**
     * Gets the businessDivisionSubdivisionID value for this Subscription.
     * 
     * @return businessDivisionSubdivisionID
     */
    public java.lang.Object getBusinessDivisionSubdivisionID() {
        return businessDivisionSubdivisionID;
    }


    /**
     * Sets the businessDivisionSubdivisionID value for this Subscription.
     * 
     * @param businessDivisionSubdivisionID
     */
    public void setBusinessDivisionSubdivisionID(java.lang.Object businessDivisionSubdivisionID) {
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subscription)) return false;
        Subscription other = (Subscription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriptionName==null && other.getSubscriptionName()==null) || 
             (this.subscriptionName!=null &&
              this.subscriptionName.equals(other.getSubscriptionName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.periodType==null && other.getPeriodType()==null) || 
             (this.periodType!=null &&
              this.periodType.equals(other.getPeriodType()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.periodPrice==null && other.getPeriodPrice()==null) || 
             (this.periodPrice!=null &&
              this.periodPrice.equals(other.getPeriodPrice()))) &&
            ((this.totalPrice==null && other.getTotalPrice()==null) || 
             (this.totalPrice!=null &&
              this.totalPrice.equals(other.getTotalPrice()))) &&
            ((this.materialCodeID==null && other.getMaterialCodeID()==null) || 
             (this.materialCodeID!=null &&
              this.materialCodeID.equals(other.getMaterialCodeID()))) &&
            ((this.purchaseOrderNumber==null && other.getPurchaseOrderNumber()==null) || 
             (this.purchaseOrderNumber!=null &&
              this.purchaseOrderNumber.equals(other.getPurchaseOrderNumber()))) &&
            ((this.periodCost==null && other.getPeriodCost()==null) || 
             (this.periodCost!=null &&
              this.periodCost.equals(other.getPeriodCost()))) &&
            ((this.totalCost==null && other.getTotalCost()==null) || 
             (this.totalCost!=null &&
              this.totalCost.equals(other.getTotalCost()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.installedProductID==null && other.getInstalledProductID()==null) || 
             (this.installedProductID!=null &&
              this.installedProductID.equals(other.getInstalledProductID()))) &&
            ((this.vendorID==null && other.getVendorID()==null) || 
             (this.vendorID!=null &&
              this.vendorID.equals(other.getVendorID()))) &&
            ((this.businessDivisionSubdivisionID==null && other.getBusinessDivisionSubdivisionID()==null) || 
             (this.businessDivisionSubdivisionID!=null &&
              this.businessDivisionSubdivisionID.equals(other.getBusinessDivisionSubdivisionID())));
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
        if (getSubscriptionName() != null) {
            _hashCode += getSubscriptionName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPeriodType() != null) {
            _hashCode += getPeriodType().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getPeriodPrice() != null) {
            _hashCode += getPeriodPrice().hashCode();
        }
        if (getTotalPrice() != null) {
            _hashCode += getTotalPrice().hashCode();
        }
        if (getMaterialCodeID() != null) {
            _hashCode += getMaterialCodeID().hashCode();
        }
        if (getPurchaseOrderNumber() != null) {
            _hashCode += getPurchaseOrderNumber().hashCode();
        }
        if (getPeriodCost() != null) {
            _hashCode += getPeriodCost().hashCode();
        }
        if (getTotalCost() != null) {
            _hashCode += getTotalCost().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getInstalledProductID() != null) {
            _hashCode += getInstalledProductID().hashCode();
        }
        if (getVendorID() != null) {
            _hashCode += getVendorID().hashCode();
        }
        if (getBusinessDivisionSubdivisionID() != null) {
            _hashCode += getBusinessDivisionSubdivisionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subscription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Subscription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SubscriptionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PeriodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpirationDate"));
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
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TotalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MaterialCodeID"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PeriodCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TotalCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installedProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InstalledProductID"));
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
        elemField.setFieldName("businessDivisionSubdivisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BusinessDivisionSubdivisionID"));
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
