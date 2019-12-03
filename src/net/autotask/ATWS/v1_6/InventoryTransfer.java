/**
 * InventoryTransfer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class InventoryTransfer  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object productID;

    private java.lang.Object fromLocationID;

    private java.lang.Object toLocationID;

    private java.lang.Object quantityTransferred;

    private java.lang.Object transferByResourceID;

    private java.lang.Object transferDate;

    private java.lang.Object notes;

    private java.lang.Object serialNumber;

    private java.lang.Object updateNote;

    public InventoryTransfer() {
    }

    public InventoryTransfer(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object productID,
           java.lang.Object fromLocationID,
           java.lang.Object toLocationID,
           java.lang.Object quantityTransferred,
           java.lang.Object transferByResourceID,
           java.lang.Object transferDate,
           java.lang.Object notes,
           java.lang.Object serialNumber,
           java.lang.Object updateNote) {
        super(
            fields,
            id,
            userDefinedFields);
        this.productID = productID;
        this.fromLocationID = fromLocationID;
        this.toLocationID = toLocationID;
        this.quantityTransferred = quantityTransferred;
        this.transferByResourceID = transferByResourceID;
        this.transferDate = transferDate;
        this.notes = notes;
        this.serialNumber = serialNumber;
        this.updateNote = updateNote;
    }


    /**
     * Gets the productID value for this InventoryTransfer.
     * 
     * @return productID
     */
    public java.lang.Object getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this InventoryTransfer.
     * 
     * @param productID
     */
    public void setProductID(java.lang.Object productID) {
        this.productID = productID;
    }


    /**
     * Gets the fromLocationID value for this InventoryTransfer.
     * 
     * @return fromLocationID
     */
    public java.lang.Object getFromLocationID() {
        return fromLocationID;
    }


    /**
     * Sets the fromLocationID value for this InventoryTransfer.
     * 
     * @param fromLocationID
     */
    public void setFromLocationID(java.lang.Object fromLocationID) {
        this.fromLocationID = fromLocationID;
    }


    /**
     * Gets the toLocationID value for this InventoryTransfer.
     * 
     * @return toLocationID
     */
    public java.lang.Object getToLocationID() {
        return toLocationID;
    }


    /**
     * Sets the toLocationID value for this InventoryTransfer.
     * 
     * @param toLocationID
     */
    public void setToLocationID(java.lang.Object toLocationID) {
        this.toLocationID = toLocationID;
    }


    /**
     * Gets the quantityTransferred value for this InventoryTransfer.
     * 
     * @return quantityTransferred
     */
    public java.lang.Object getQuantityTransferred() {
        return quantityTransferred;
    }


    /**
     * Sets the quantityTransferred value for this InventoryTransfer.
     * 
     * @param quantityTransferred
     */
    public void setQuantityTransferred(java.lang.Object quantityTransferred) {
        this.quantityTransferred = quantityTransferred;
    }


    /**
     * Gets the transferByResourceID value for this InventoryTransfer.
     * 
     * @return transferByResourceID
     */
    public java.lang.Object getTransferByResourceID() {
        return transferByResourceID;
    }


    /**
     * Sets the transferByResourceID value for this InventoryTransfer.
     * 
     * @param transferByResourceID
     */
    public void setTransferByResourceID(java.lang.Object transferByResourceID) {
        this.transferByResourceID = transferByResourceID;
    }


    /**
     * Gets the transferDate value for this InventoryTransfer.
     * 
     * @return transferDate
     */
    public java.lang.Object getTransferDate() {
        return transferDate;
    }


    /**
     * Sets the transferDate value for this InventoryTransfer.
     * 
     * @param transferDate
     */
    public void setTransferDate(java.lang.Object transferDate) {
        this.transferDate = transferDate;
    }


    /**
     * Gets the notes value for this InventoryTransfer.
     * 
     * @return notes
     */
    public java.lang.Object getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this InventoryTransfer.
     * 
     * @param notes
     */
    public void setNotes(java.lang.Object notes) {
        this.notes = notes;
    }


    /**
     * Gets the serialNumber value for this InventoryTransfer.
     * 
     * @return serialNumber
     */
    public java.lang.Object getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this InventoryTransfer.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.Object serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the updateNote value for this InventoryTransfer.
     * 
     * @return updateNote
     */
    public java.lang.Object getUpdateNote() {
        return updateNote;
    }


    /**
     * Sets the updateNote value for this InventoryTransfer.
     * 
     * @param updateNote
     */
    public void setUpdateNote(java.lang.Object updateNote) {
        this.updateNote = updateNote;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryTransfer)) return false;
        InventoryTransfer other = (InventoryTransfer) obj;
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
            ((this.fromLocationID==null && other.getFromLocationID()==null) || 
             (this.fromLocationID!=null &&
              this.fromLocationID.equals(other.getFromLocationID()))) &&
            ((this.toLocationID==null && other.getToLocationID()==null) || 
             (this.toLocationID!=null &&
              this.toLocationID.equals(other.getToLocationID()))) &&
            ((this.quantityTransferred==null && other.getQuantityTransferred()==null) || 
             (this.quantityTransferred!=null &&
              this.quantityTransferred.equals(other.getQuantityTransferred()))) &&
            ((this.transferByResourceID==null && other.getTransferByResourceID()==null) || 
             (this.transferByResourceID!=null &&
              this.transferByResourceID.equals(other.getTransferByResourceID()))) &&
            ((this.transferDate==null && other.getTransferDate()==null) || 
             (this.transferDate!=null &&
              this.transferDate.equals(other.getTransferDate()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.updateNote==null && other.getUpdateNote()==null) || 
             (this.updateNote!=null &&
              this.updateNote.equals(other.getUpdateNote())));
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
        if (getFromLocationID() != null) {
            _hashCode += getFromLocationID().hashCode();
        }
        if (getToLocationID() != null) {
            _hashCode += getToLocationID().hashCode();
        }
        if (getQuantityTransferred() != null) {
            _hashCode += getQuantityTransferred().hashCode();
        }
        if (getTransferByResourceID() != null) {
            _hashCode += getTransferByResourceID().hashCode();
        }
        if (getTransferDate() != null) {
            _hashCode += getTransferDate().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getUpdateNote() != null) {
            _hashCode += getUpdateNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryTransfer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InventoryTransfer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FromLocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ToLocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityTransferred");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuantityTransferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferByResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TransferByResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TransferDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Notes"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UpdateNote"));
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
