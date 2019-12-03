/**
 * InventoryItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class InventoryItem  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object productID;

    private java.lang.Object inventoryLocationID;

    private java.lang.Object quantityOnHand;

    private java.lang.Object quantityMinimum;

    private java.lang.Object quantityMaximum;

    private java.lang.Object referenceNumber;

    private java.lang.Object bin;

    private java.lang.Object onOrder;

    private java.lang.Object backOrder;

    private java.lang.Object reserved;

    private java.lang.Object picked;

    public InventoryItem() {
    }

    public InventoryItem(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object productID,
           java.lang.Object inventoryLocationID,
           java.lang.Object quantityOnHand,
           java.lang.Object quantityMinimum,
           java.lang.Object quantityMaximum,
           java.lang.Object referenceNumber,
           java.lang.Object bin,
           java.lang.Object onOrder,
           java.lang.Object backOrder,
           java.lang.Object reserved,
           java.lang.Object picked) {
        super(
            fields,
            id,
            userDefinedFields);
        this.productID = productID;
        this.inventoryLocationID = inventoryLocationID;
        this.quantityOnHand = quantityOnHand;
        this.quantityMinimum = quantityMinimum;
        this.quantityMaximum = quantityMaximum;
        this.referenceNumber = referenceNumber;
        this.bin = bin;
        this.onOrder = onOrder;
        this.backOrder = backOrder;
        this.reserved = reserved;
        this.picked = picked;
    }


    /**
     * Gets the productID value for this InventoryItem.
     * 
     * @return productID
     */
    public java.lang.Object getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this InventoryItem.
     * 
     * @param productID
     */
    public void setProductID(java.lang.Object productID) {
        this.productID = productID;
    }


    /**
     * Gets the inventoryLocationID value for this InventoryItem.
     * 
     * @return inventoryLocationID
     */
    public java.lang.Object getInventoryLocationID() {
        return inventoryLocationID;
    }


    /**
     * Sets the inventoryLocationID value for this InventoryItem.
     * 
     * @param inventoryLocationID
     */
    public void setInventoryLocationID(java.lang.Object inventoryLocationID) {
        this.inventoryLocationID = inventoryLocationID;
    }


    /**
     * Gets the quantityOnHand value for this InventoryItem.
     * 
     * @return quantityOnHand
     */
    public java.lang.Object getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this InventoryItem.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(java.lang.Object quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the quantityMinimum value for this InventoryItem.
     * 
     * @return quantityMinimum
     */
    public java.lang.Object getQuantityMinimum() {
        return quantityMinimum;
    }


    /**
     * Sets the quantityMinimum value for this InventoryItem.
     * 
     * @param quantityMinimum
     */
    public void setQuantityMinimum(java.lang.Object quantityMinimum) {
        this.quantityMinimum = quantityMinimum;
    }


    /**
     * Gets the quantityMaximum value for this InventoryItem.
     * 
     * @return quantityMaximum
     */
    public java.lang.Object getQuantityMaximum() {
        return quantityMaximum;
    }


    /**
     * Sets the quantityMaximum value for this InventoryItem.
     * 
     * @param quantityMaximum
     */
    public void setQuantityMaximum(java.lang.Object quantityMaximum) {
        this.quantityMaximum = quantityMaximum;
    }


    /**
     * Gets the referenceNumber value for this InventoryItem.
     * 
     * @return referenceNumber
     */
    public java.lang.Object getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this InventoryItem.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.Object referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the bin value for this InventoryItem.
     * 
     * @return bin
     */
    public java.lang.Object getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this InventoryItem.
     * 
     * @param bin
     */
    public void setBin(java.lang.Object bin) {
        this.bin = bin;
    }


    /**
     * Gets the onOrder value for this InventoryItem.
     * 
     * @return onOrder
     */
    public java.lang.Object getOnOrder() {
        return onOrder;
    }


    /**
     * Sets the onOrder value for this InventoryItem.
     * 
     * @param onOrder
     */
    public void setOnOrder(java.lang.Object onOrder) {
        this.onOrder = onOrder;
    }


    /**
     * Gets the backOrder value for this InventoryItem.
     * 
     * @return backOrder
     */
    public java.lang.Object getBackOrder() {
        return backOrder;
    }


    /**
     * Sets the backOrder value for this InventoryItem.
     * 
     * @param backOrder
     */
    public void setBackOrder(java.lang.Object backOrder) {
        this.backOrder = backOrder;
    }


    /**
     * Gets the reserved value for this InventoryItem.
     * 
     * @return reserved
     */
    public java.lang.Object getReserved() {
        return reserved;
    }


    /**
     * Sets the reserved value for this InventoryItem.
     * 
     * @param reserved
     */
    public void setReserved(java.lang.Object reserved) {
        this.reserved = reserved;
    }


    /**
     * Gets the picked value for this InventoryItem.
     * 
     * @return picked
     */
    public java.lang.Object getPicked() {
        return picked;
    }


    /**
     * Sets the picked value for this InventoryItem.
     * 
     * @param picked
     */
    public void setPicked(java.lang.Object picked) {
        this.picked = picked;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryItem)) return false;
        InventoryItem other = (InventoryItem) obj;
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
            ((this.inventoryLocationID==null && other.getInventoryLocationID()==null) || 
             (this.inventoryLocationID!=null &&
              this.inventoryLocationID.equals(other.getInventoryLocationID()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.quantityMinimum==null && other.getQuantityMinimum()==null) || 
             (this.quantityMinimum!=null &&
              this.quantityMinimum.equals(other.getQuantityMinimum()))) &&
            ((this.quantityMaximum==null && other.getQuantityMaximum()==null) || 
             (this.quantityMaximum!=null &&
              this.quantityMaximum.equals(other.getQuantityMaximum()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.bin==null && other.getBin()==null) || 
             (this.bin!=null &&
              this.bin.equals(other.getBin()))) &&
            ((this.onOrder==null && other.getOnOrder()==null) || 
             (this.onOrder!=null &&
              this.onOrder.equals(other.getOnOrder()))) &&
            ((this.backOrder==null && other.getBackOrder()==null) || 
             (this.backOrder!=null &&
              this.backOrder.equals(other.getBackOrder()))) &&
            ((this.reserved==null && other.getReserved()==null) || 
             (this.reserved!=null &&
              this.reserved.equals(other.getReserved()))) &&
            ((this.picked==null && other.getPicked()==null) || 
             (this.picked!=null &&
              this.picked.equals(other.getPicked())));
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
        if (getInventoryLocationID() != null) {
            _hashCode += getInventoryLocationID().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getQuantityMinimum() != null) {
            _hashCode += getQuantityMinimum().hashCode();
        }
        if (getQuantityMaximum() != null) {
            _hashCode += getQuantityMaximum().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getBin() != null) {
            _hashCode += getBin().hashCode();
        }
        if (getOnOrder() != null) {
            _hashCode += getOnOrder().hashCode();
        }
        if (getBackOrder() != null) {
            _hashCode += getBackOrder().hashCode();
        }
        if (getReserved() != null) {
            _hashCode += getReserved().hashCode();
        }
        if (getPicked() != null) {
            _hashCode += getPicked().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InventoryItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InventoryLocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityMinimum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuantityMinimum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityMaximum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuantityMaximum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Bin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BackOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Reserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Picked"));
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
