/**
 * PurchaseOrderItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class PurchaseOrderItem  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object orderID;

    private java.lang.Object productID;

    private java.lang.Object inventoryLocationID;

    private java.lang.Object quantity;

    private java.lang.Object memo;

    private java.lang.Object unitCost;

    private java.lang.Object salesOrderID;

    private java.lang.Object estimatedArrivalDate;

    private java.lang.Object costID;

    private java.lang.Object contractID;

    private java.lang.Object projectID;

    private java.lang.Object ticketID;

    private java.lang.Object internalCurrencyUnitCost;

    public PurchaseOrderItem() {
    }

    public PurchaseOrderItem(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object orderID,
           java.lang.Object productID,
           java.lang.Object inventoryLocationID,
           java.lang.Object quantity,
           java.lang.Object memo,
           java.lang.Object unitCost,
           java.lang.Object salesOrderID,
           java.lang.Object estimatedArrivalDate,
           java.lang.Object costID,
           java.lang.Object contractID,
           java.lang.Object projectID,
           java.lang.Object ticketID,
           java.lang.Object internalCurrencyUnitCost) {
        super(
            fields,
            id,
            userDefinedFields);
        this.orderID = orderID;
        this.productID = productID;
        this.inventoryLocationID = inventoryLocationID;
        this.quantity = quantity;
        this.memo = memo;
        this.unitCost = unitCost;
        this.salesOrderID = salesOrderID;
        this.estimatedArrivalDate = estimatedArrivalDate;
        this.costID = costID;
        this.contractID = contractID;
        this.projectID = projectID;
        this.ticketID = ticketID;
        this.internalCurrencyUnitCost = internalCurrencyUnitCost;
    }


    /**
     * Gets the orderID value for this PurchaseOrderItem.
     * 
     * @return orderID
     */
    public java.lang.Object getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this PurchaseOrderItem.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.Object orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the productID value for this PurchaseOrderItem.
     * 
     * @return productID
     */
    public java.lang.Object getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this PurchaseOrderItem.
     * 
     * @param productID
     */
    public void setProductID(java.lang.Object productID) {
        this.productID = productID;
    }


    /**
     * Gets the inventoryLocationID value for this PurchaseOrderItem.
     * 
     * @return inventoryLocationID
     */
    public java.lang.Object getInventoryLocationID() {
        return inventoryLocationID;
    }


    /**
     * Sets the inventoryLocationID value for this PurchaseOrderItem.
     * 
     * @param inventoryLocationID
     */
    public void setInventoryLocationID(java.lang.Object inventoryLocationID) {
        this.inventoryLocationID = inventoryLocationID;
    }


    /**
     * Gets the quantity value for this PurchaseOrderItem.
     * 
     * @return quantity
     */
    public java.lang.Object getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this PurchaseOrderItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Object quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the memo value for this PurchaseOrderItem.
     * 
     * @return memo
     */
    public java.lang.Object getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this PurchaseOrderItem.
     * 
     * @param memo
     */
    public void setMemo(java.lang.Object memo) {
        this.memo = memo;
    }


    /**
     * Gets the unitCost value for this PurchaseOrderItem.
     * 
     * @return unitCost
     */
    public java.lang.Object getUnitCost() {
        return unitCost;
    }


    /**
     * Sets the unitCost value for this PurchaseOrderItem.
     * 
     * @param unitCost
     */
    public void setUnitCost(java.lang.Object unitCost) {
        this.unitCost = unitCost;
    }


    /**
     * Gets the salesOrderID value for this PurchaseOrderItem.
     * 
     * @return salesOrderID
     */
    public java.lang.Object getSalesOrderID() {
        return salesOrderID;
    }


    /**
     * Sets the salesOrderID value for this PurchaseOrderItem.
     * 
     * @param salesOrderID
     */
    public void setSalesOrderID(java.lang.Object salesOrderID) {
        this.salesOrderID = salesOrderID;
    }


    /**
     * Gets the estimatedArrivalDate value for this PurchaseOrderItem.
     * 
     * @return estimatedArrivalDate
     */
    public java.lang.Object getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }


    /**
     * Sets the estimatedArrivalDate value for this PurchaseOrderItem.
     * 
     * @param estimatedArrivalDate
     */
    public void setEstimatedArrivalDate(java.lang.Object estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }


    /**
     * Gets the costID value for this PurchaseOrderItem.
     * 
     * @return costID
     */
    public java.lang.Object getCostID() {
        return costID;
    }


    /**
     * Sets the costID value for this PurchaseOrderItem.
     * 
     * @param costID
     */
    public void setCostID(java.lang.Object costID) {
        this.costID = costID;
    }


    /**
     * Gets the contractID value for this PurchaseOrderItem.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this PurchaseOrderItem.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the projectID value for this PurchaseOrderItem.
     * 
     * @return projectID
     */
    public java.lang.Object getProjectID() {
        return projectID;
    }


    /**
     * Sets the projectID value for this PurchaseOrderItem.
     * 
     * @param projectID
     */
    public void setProjectID(java.lang.Object projectID) {
        this.projectID = projectID;
    }


    /**
     * Gets the ticketID value for this PurchaseOrderItem.
     * 
     * @return ticketID
     */
    public java.lang.Object getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this PurchaseOrderItem.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Object ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the internalCurrencyUnitCost value for this PurchaseOrderItem.
     * 
     * @return internalCurrencyUnitCost
     */
    public java.lang.Object getInternalCurrencyUnitCost() {
        return internalCurrencyUnitCost;
    }


    /**
     * Sets the internalCurrencyUnitCost value for this PurchaseOrderItem.
     * 
     * @param internalCurrencyUnitCost
     */
    public void setInternalCurrencyUnitCost(java.lang.Object internalCurrencyUnitCost) {
        this.internalCurrencyUnitCost = internalCurrencyUnitCost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderItem)) return false;
        PurchaseOrderItem other = (PurchaseOrderItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.inventoryLocationID==null && other.getInventoryLocationID()==null) || 
             (this.inventoryLocationID!=null &&
              this.inventoryLocationID.equals(other.getInventoryLocationID()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.unitCost==null && other.getUnitCost()==null) || 
             (this.unitCost!=null &&
              this.unitCost.equals(other.getUnitCost()))) &&
            ((this.salesOrderID==null && other.getSalesOrderID()==null) || 
             (this.salesOrderID!=null &&
              this.salesOrderID.equals(other.getSalesOrderID()))) &&
            ((this.estimatedArrivalDate==null && other.getEstimatedArrivalDate()==null) || 
             (this.estimatedArrivalDate!=null &&
              this.estimatedArrivalDate.equals(other.getEstimatedArrivalDate()))) &&
            ((this.costID==null && other.getCostID()==null) || 
             (this.costID!=null &&
              this.costID.equals(other.getCostID()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.projectID==null && other.getProjectID()==null) || 
             (this.projectID!=null &&
              this.projectID.equals(other.getProjectID()))) &&
            ((this.ticketID==null && other.getTicketID()==null) || 
             (this.ticketID!=null &&
              this.ticketID.equals(other.getTicketID()))) &&
            ((this.internalCurrencyUnitCost==null && other.getInternalCurrencyUnitCost()==null) || 
             (this.internalCurrencyUnitCost!=null &&
              this.internalCurrencyUnitCost.equals(other.getInternalCurrencyUnitCost())));
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
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getInventoryLocationID() != null) {
            _hashCode += getInventoryLocationID().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getUnitCost() != null) {
            _hashCode += getUnitCost().hashCode();
        }
        if (getSalesOrderID() != null) {
            _hashCode += getSalesOrderID().hashCode();
        }
        if (getEstimatedArrivalDate() != null) {
            _hashCode += getEstimatedArrivalDate().hashCode();
        }
        if (getCostID() != null) {
            _hashCode += getCostID().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getProjectID() != null) {
            _hashCode += getProjectID().hashCode();
        }
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
        }
        if (getInternalCurrencyUnitCost() != null) {
            _hashCode += getInternalCurrencyUnitCost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PurchaseOrderItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Memo"));
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
        elemField.setFieldName("salesOrderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SalesOrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedArrivalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EstimatedArrivalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CostID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyUnitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyUnitCost"));
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
