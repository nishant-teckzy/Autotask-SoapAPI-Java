/**
 * PurchaseOrderReceive.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class PurchaseOrderReceive  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object purchaseOrderItemID;

    private java.lang.Object quantityPreviouslyReceived;

    private java.lang.Object quantityNowReceiving;

    private java.lang.Object receiveDate;

    private java.lang.Object quantityBackOrdered;

    private java.lang.Object receivedByResourceID;

    private java.lang.Object serialNumber;

    public PurchaseOrderReceive() {
    }

    public PurchaseOrderReceive(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object purchaseOrderItemID,
           java.lang.Object quantityPreviouslyReceived,
           java.lang.Object quantityNowReceiving,
           java.lang.Object receiveDate,
           java.lang.Object quantityBackOrdered,
           java.lang.Object receivedByResourceID,
           java.lang.Object serialNumber) {
        super(
            fields,
            id,
            userDefinedFields);
        this.purchaseOrderItemID = purchaseOrderItemID;
        this.quantityPreviouslyReceived = quantityPreviouslyReceived;
        this.quantityNowReceiving = quantityNowReceiving;
        this.receiveDate = receiveDate;
        this.quantityBackOrdered = quantityBackOrdered;
        this.receivedByResourceID = receivedByResourceID;
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the purchaseOrderItemID value for this PurchaseOrderReceive.
     * 
     * @return purchaseOrderItemID
     */
    public java.lang.Object getPurchaseOrderItemID() {
        return purchaseOrderItemID;
    }


    /**
     * Sets the purchaseOrderItemID value for this PurchaseOrderReceive.
     * 
     * @param purchaseOrderItemID
     */
    public void setPurchaseOrderItemID(java.lang.Object purchaseOrderItemID) {
        this.purchaseOrderItemID = purchaseOrderItemID;
    }


    /**
     * Gets the quantityPreviouslyReceived value for this PurchaseOrderReceive.
     * 
     * @return quantityPreviouslyReceived
     */
    public java.lang.Object getQuantityPreviouslyReceived() {
        return quantityPreviouslyReceived;
    }


    /**
     * Sets the quantityPreviouslyReceived value for this PurchaseOrderReceive.
     * 
     * @param quantityPreviouslyReceived
     */
    public void setQuantityPreviouslyReceived(java.lang.Object quantityPreviouslyReceived) {
        this.quantityPreviouslyReceived = quantityPreviouslyReceived;
    }


    /**
     * Gets the quantityNowReceiving value for this PurchaseOrderReceive.
     * 
     * @return quantityNowReceiving
     */
    public java.lang.Object getQuantityNowReceiving() {
        return quantityNowReceiving;
    }


    /**
     * Sets the quantityNowReceiving value for this PurchaseOrderReceive.
     * 
     * @param quantityNowReceiving
     */
    public void setQuantityNowReceiving(java.lang.Object quantityNowReceiving) {
        this.quantityNowReceiving = quantityNowReceiving;
    }


    /**
     * Gets the receiveDate value for this PurchaseOrderReceive.
     * 
     * @return receiveDate
     */
    public java.lang.Object getReceiveDate() {
        return receiveDate;
    }


    /**
     * Sets the receiveDate value for this PurchaseOrderReceive.
     * 
     * @param receiveDate
     */
    public void setReceiveDate(java.lang.Object receiveDate) {
        this.receiveDate = receiveDate;
    }


    /**
     * Gets the quantityBackOrdered value for this PurchaseOrderReceive.
     * 
     * @return quantityBackOrdered
     */
    public java.lang.Object getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this PurchaseOrderReceive.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(java.lang.Object quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }


    /**
     * Gets the receivedByResourceID value for this PurchaseOrderReceive.
     * 
     * @return receivedByResourceID
     */
    public java.lang.Object getReceivedByResourceID() {
        return receivedByResourceID;
    }


    /**
     * Sets the receivedByResourceID value for this PurchaseOrderReceive.
     * 
     * @param receivedByResourceID
     */
    public void setReceivedByResourceID(java.lang.Object receivedByResourceID) {
        this.receivedByResourceID = receivedByResourceID;
    }


    /**
     * Gets the serialNumber value for this PurchaseOrderReceive.
     * 
     * @return serialNumber
     */
    public java.lang.Object getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this PurchaseOrderReceive.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.Object serialNumber) {
        this.serialNumber = serialNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderReceive)) return false;
        PurchaseOrderReceive other = (PurchaseOrderReceive) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.purchaseOrderItemID==null && other.getPurchaseOrderItemID()==null) || 
             (this.purchaseOrderItemID!=null &&
              this.purchaseOrderItemID.equals(other.getPurchaseOrderItemID()))) &&
            ((this.quantityPreviouslyReceived==null && other.getQuantityPreviouslyReceived()==null) || 
             (this.quantityPreviouslyReceived!=null &&
              this.quantityPreviouslyReceived.equals(other.getQuantityPreviouslyReceived()))) &&
            ((this.quantityNowReceiving==null && other.getQuantityNowReceiving()==null) || 
             (this.quantityNowReceiving!=null &&
              this.quantityNowReceiving.equals(other.getQuantityNowReceiving()))) &&
            ((this.receiveDate==null && other.getReceiveDate()==null) || 
             (this.receiveDate!=null &&
              this.receiveDate.equals(other.getReceiveDate()))) &&
            ((this.quantityBackOrdered==null && other.getQuantityBackOrdered()==null) || 
             (this.quantityBackOrdered!=null &&
              this.quantityBackOrdered.equals(other.getQuantityBackOrdered()))) &&
            ((this.receivedByResourceID==null && other.getReceivedByResourceID()==null) || 
             (this.receivedByResourceID!=null &&
              this.receivedByResourceID.equals(other.getReceivedByResourceID()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber())));
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
        if (getPurchaseOrderItemID() != null) {
            _hashCode += getPurchaseOrderItemID().hashCode();
        }
        if (getQuantityPreviouslyReceived() != null) {
            _hashCode += getQuantityPreviouslyReceived().hashCode();
        }
        if (getQuantityNowReceiving() != null) {
            _hashCode += getQuantityNowReceiving().hashCode();
        }
        if (getReceiveDate() != null) {
            _hashCode += getReceiveDate().hashCode();
        }
        if (getQuantityBackOrdered() != null) {
            _hashCode += getQuantityBackOrdered().hashCode();
        }
        if (getReceivedByResourceID() != null) {
            _hashCode += getReceivedByResourceID().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderReceive.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PurchaseOrderReceive"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PurchaseOrderItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPreviouslyReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuantityPreviouslyReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityNowReceiving");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuantityNowReceiving"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReceiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivedByResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReceivedByResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SerialNumber"));
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
