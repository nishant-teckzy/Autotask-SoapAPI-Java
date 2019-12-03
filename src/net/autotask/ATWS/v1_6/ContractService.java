/**
 * ContractService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractService  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object contractID;

    private java.lang.Object serviceID;

    private java.lang.Object unitPrice;

    private java.lang.Object adjustedPrice;

    private java.lang.Object invoiceDescription;

    private java.lang.Object quoteItemID;

    private java.lang.Object internalCurrencyUnitPrice;

    private java.lang.Object internalCurrencyAdjustedPrice;

    private java.lang.Object internalDescription;

    private java.lang.Object unitCost;

    public ContractService() {
    }

    public ContractService(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object contractID,
           java.lang.Object serviceID,
           java.lang.Object unitPrice,
           java.lang.Object adjustedPrice,
           java.lang.Object invoiceDescription,
           java.lang.Object quoteItemID,
           java.lang.Object internalCurrencyUnitPrice,
           java.lang.Object internalCurrencyAdjustedPrice,
           java.lang.Object internalDescription,
           java.lang.Object unitCost) {
        super(
            fields,
            id,
            userDefinedFields);
        this.contractID = contractID;
        this.serviceID = serviceID;
        this.unitPrice = unitPrice;
        this.adjustedPrice = adjustedPrice;
        this.invoiceDescription = invoiceDescription;
        this.quoteItemID = quoteItemID;
        this.internalCurrencyUnitPrice = internalCurrencyUnitPrice;
        this.internalCurrencyAdjustedPrice = internalCurrencyAdjustedPrice;
        this.internalDescription = internalDescription;
        this.unitCost = unitCost;
    }


    /**
     * Gets the contractID value for this ContractService.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ContractService.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the serviceID value for this ContractService.
     * 
     * @return serviceID
     */
    public java.lang.Object getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this ContractService.
     * 
     * @param serviceID
     */
    public void setServiceID(java.lang.Object serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the unitPrice value for this ContractService.
     * 
     * @return unitPrice
     */
    public java.lang.Object getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this ContractService.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.lang.Object unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the adjustedPrice value for this ContractService.
     * 
     * @return adjustedPrice
     */
    public java.lang.Object getAdjustedPrice() {
        return adjustedPrice;
    }


    /**
     * Sets the adjustedPrice value for this ContractService.
     * 
     * @param adjustedPrice
     */
    public void setAdjustedPrice(java.lang.Object adjustedPrice) {
        this.adjustedPrice = adjustedPrice;
    }


    /**
     * Gets the invoiceDescription value for this ContractService.
     * 
     * @return invoiceDescription
     */
    public java.lang.Object getInvoiceDescription() {
        return invoiceDescription;
    }


    /**
     * Sets the invoiceDescription value for this ContractService.
     * 
     * @param invoiceDescription
     */
    public void setInvoiceDescription(java.lang.Object invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }


    /**
     * Gets the quoteItemID value for this ContractService.
     * 
     * @return quoteItemID
     */
    public java.lang.Object getQuoteItemID() {
        return quoteItemID;
    }


    /**
     * Sets the quoteItemID value for this ContractService.
     * 
     * @param quoteItemID
     */
    public void setQuoteItemID(java.lang.Object quoteItemID) {
        this.quoteItemID = quoteItemID;
    }


    /**
     * Gets the internalCurrencyUnitPrice value for this ContractService.
     * 
     * @return internalCurrencyUnitPrice
     */
    public java.lang.Object getInternalCurrencyUnitPrice() {
        return internalCurrencyUnitPrice;
    }


    /**
     * Sets the internalCurrencyUnitPrice value for this ContractService.
     * 
     * @param internalCurrencyUnitPrice
     */
    public void setInternalCurrencyUnitPrice(java.lang.Object internalCurrencyUnitPrice) {
        this.internalCurrencyUnitPrice = internalCurrencyUnitPrice;
    }


    /**
     * Gets the internalCurrencyAdjustedPrice value for this ContractService.
     * 
     * @return internalCurrencyAdjustedPrice
     */
    public java.lang.Object getInternalCurrencyAdjustedPrice() {
        return internalCurrencyAdjustedPrice;
    }


    /**
     * Sets the internalCurrencyAdjustedPrice value for this ContractService.
     * 
     * @param internalCurrencyAdjustedPrice
     */
    public void setInternalCurrencyAdjustedPrice(java.lang.Object internalCurrencyAdjustedPrice) {
        this.internalCurrencyAdjustedPrice = internalCurrencyAdjustedPrice;
    }


    /**
     * Gets the internalDescription value for this ContractService.
     * 
     * @return internalDescription
     */
    public java.lang.Object getInternalDescription() {
        return internalDescription;
    }


    /**
     * Sets the internalDescription value for this ContractService.
     * 
     * @param internalDescription
     */
    public void setInternalDescription(java.lang.Object internalDescription) {
        this.internalDescription = internalDescription;
    }


    /**
     * Gets the unitCost value for this ContractService.
     * 
     * @return unitCost
     */
    public java.lang.Object getUnitCost() {
        return unitCost;
    }


    /**
     * Sets the unitCost value for this ContractService.
     * 
     * @param unitCost
     */
    public void setUnitCost(java.lang.Object unitCost) {
        this.unitCost = unitCost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractService)) return false;
        ContractService other = (ContractService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.adjustedPrice==null && other.getAdjustedPrice()==null) || 
             (this.adjustedPrice!=null &&
              this.adjustedPrice.equals(other.getAdjustedPrice()))) &&
            ((this.invoiceDescription==null && other.getInvoiceDescription()==null) || 
             (this.invoiceDescription!=null &&
              this.invoiceDescription.equals(other.getInvoiceDescription()))) &&
            ((this.quoteItemID==null && other.getQuoteItemID()==null) || 
             (this.quoteItemID!=null &&
              this.quoteItemID.equals(other.getQuoteItemID()))) &&
            ((this.internalCurrencyUnitPrice==null && other.getInternalCurrencyUnitPrice()==null) || 
             (this.internalCurrencyUnitPrice!=null &&
              this.internalCurrencyUnitPrice.equals(other.getInternalCurrencyUnitPrice()))) &&
            ((this.internalCurrencyAdjustedPrice==null && other.getInternalCurrencyAdjustedPrice()==null) || 
             (this.internalCurrencyAdjustedPrice!=null &&
              this.internalCurrencyAdjustedPrice.equals(other.getInternalCurrencyAdjustedPrice()))) &&
            ((this.internalDescription==null && other.getInternalDescription()==null) || 
             (this.internalDescription!=null &&
              this.internalDescription.equals(other.getInternalDescription()))) &&
            ((this.unitCost==null && other.getUnitCost()==null) || 
             (this.unitCost!=null &&
              this.unitCost.equals(other.getUnitCost())));
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
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getAdjustedPrice() != null) {
            _hashCode += getAdjustedPrice().hashCode();
        }
        if (getInvoiceDescription() != null) {
            _hashCode += getInvoiceDescription().hashCode();
        }
        if (getQuoteItemID() != null) {
            _hashCode += getQuoteItemID().hashCode();
        }
        if (getInternalCurrencyUnitPrice() != null) {
            _hashCode += getInternalCurrencyUnitPrice().hashCode();
        }
        if (getInternalCurrencyAdjustedPrice() != null) {
            _hashCode += getInternalCurrencyAdjustedPrice().hashCode();
        }
        if (getInternalDescription() != null) {
            _hashCode += getInternalDescription().hashCode();
        }
        if (getUnitCost() != null) {
            _hashCode += getUnitCost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceID"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustedPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdjustedPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuoteItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyAdjustedPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyAdjustedPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalDescription"));
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
