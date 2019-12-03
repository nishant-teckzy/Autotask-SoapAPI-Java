/**
 * ContractBillingRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractBillingRule  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object invoiceDescription;

    private java.lang.Object contractID;

    private java.lang.Object productID;

    private java.lang.Object active;

    private java.lang.Object startDate;

    private java.lang.Object endDate;

    private java.lang.Object determineUnits;

    private java.lang.Object minimumUnits;

    private java.lang.Object maximumUnits;

    private java.lang.Object createChargesAsBillable;

    private java.lang.Object includeItemsInChargeDescription;

    private java.lang.Object enableDailyProrating;

    private java.lang.Object dailyProratedCost;

    private java.lang.Object dailyProratedPrice;

    public ContractBillingRule() {
    }

    public ContractBillingRule(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object invoiceDescription,
           java.lang.Object contractID,
           java.lang.Object productID,
           java.lang.Object active,
           java.lang.Object startDate,
           java.lang.Object endDate,
           java.lang.Object determineUnits,
           java.lang.Object minimumUnits,
           java.lang.Object maximumUnits,
           java.lang.Object createChargesAsBillable,
           java.lang.Object includeItemsInChargeDescription,
           java.lang.Object enableDailyProrating,
           java.lang.Object dailyProratedCost,
           java.lang.Object dailyProratedPrice) {
        super(
            fields,
            id,
            userDefinedFields);
        this.invoiceDescription = invoiceDescription;
        this.contractID = contractID;
        this.productID = productID;
        this.active = active;
        this.startDate = startDate;
        this.endDate = endDate;
        this.determineUnits = determineUnits;
        this.minimumUnits = minimumUnits;
        this.maximumUnits = maximumUnits;
        this.createChargesAsBillable = createChargesAsBillable;
        this.includeItemsInChargeDescription = includeItemsInChargeDescription;
        this.enableDailyProrating = enableDailyProrating;
        this.dailyProratedCost = dailyProratedCost;
        this.dailyProratedPrice = dailyProratedPrice;
    }


    /**
     * Gets the invoiceDescription value for this ContractBillingRule.
     * 
     * @return invoiceDescription
     */
    public java.lang.Object getInvoiceDescription() {
        return invoiceDescription;
    }


    /**
     * Sets the invoiceDescription value for this ContractBillingRule.
     * 
     * @param invoiceDescription
     */
    public void setInvoiceDescription(java.lang.Object invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }


    /**
     * Gets the contractID value for this ContractBillingRule.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ContractBillingRule.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the productID value for this ContractBillingRule.
     * 
     * @return productID
     */
    public java.lang.Object getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this ContractBillingRule.
     * 
     * @param productID
     */
    public void setProductID(java.lang.Object productID) {
        this.productID = productID;
    }


    /**
     * Gets the active value for this ContractBillingRule.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this ContractBillingRule.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the startDate value for this ContractBillingRule.
     * 
     * @return startDate
     */
    public java.lang.Object getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ContractBillingRule.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.Object startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ContractBillingRule.
     * 
     * @return endDate
     */
    public java.lang.Object getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ContractBillingRule.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.Object endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the determineUnits value for this ContractBillingRule.
     * 
     * @return determineUnits
     */
    public java.lang.Object getDetermineUnits() {
        return determineUnits;
    }


    /**
     * Sets the determineUnits value for this ContractBillingRule.
     * 
     * @param determineUnits
     */
    public void setDetermineUnits(java.lang.Object determineUnits) {
        this.determineUnits = determineUnits;
    }


    /**
     * Gets the minimumUnits value for this ContractBillingRule.
     * 
     * @return minimumUnits
     */
    public java.lang.Object getMinimumUnits() {
        return minimumUnits;
    }


    /**
     * Sets the minimumUnits value for this ContractBillingRule.
     * 
     * @param minimumUnits
     */
    public void setMinimumUnits(java.lang.Object minimumUnits) {
        this.minimumUnits = minimumUnits;
    }


    /**
     * Gets the maximumUnits value for this ContractBillingRule.
     * 
     * @return maximumUnits
     */
    public java.lang.Object getMaximumUnits() {
        return maximumUnits;
    }


    /**
     * Sets the maximumUnits value for this ContractBillingRule.
     * 
     * @param maximumUnits
     */
    public void setMaximumUnits(java.lang.Object maximumUnits) {
        this.maximumUnits = maximumUnits;
    }


    /**
     * Gets the createChargesAsBillable value for this ContractBillingRule.
     * 
     * @return createChargesAsBillable
     */
    public java.lang.Object getCreateChargesAsBillable() {
        return createChargesAsBillable;
    }


    /**
     * Sets the createChargesAsBillable value for this ContractBillingRule.
     * 
     * @param createChargesAsBillable
     */
    public void setCreateChargesAsBillable(java.lang.Object createChargesAsBillable) {
        this.createChargesAsBillable = createChargesAsBillable;
    }


    /**
     * Gets the includeItemsInChargeDescription value for this ContractBillingRule.
     * 
     * @return includeItemsInChargeDescription
     */
    public java.lang.Object getIncludeItemsInChargeDescription() {
        return includeItemsInChargeDescription;
    }


    /**
     * Sets the includeItemsInChargeDescription value for this ContractBillingRule.
     * 
     * @param includeItemsInChargeDescription
     */
    public void setIncludeItemsInChargeDescription(java.lang.Object includeItemsInChargeDescription) {
        this.includeItemsInChargeDescription = includeItemsInChargeDescription;
    }


    /**
     * Gets the enableDailyProrating value for this ContractBillingRule.
     * 
     * @return enableDailyProrating
     */
    public java.lang.Object getEnableDailyProrating() {
        return enableDailyProrating;
    }


    /**
     * Sets the enableDailyProrating value for this ContractBillingRule.
     * 
     * @param enableDailyProrating
     */
    public void setEnableDailyProrating(java.lang.Object enableDailyProrating) {
        this.enableDailyProrating = enableDailyProrating;
    }


    /**
     * Gets the dailyProratedCost value for this ContractBillingRule.
     * 
     * @return dailyProratedCost
     */
    public java.lang.Object getDailyProratedCost() {
        return dailyProratedCost;
    }


    /**
     * Sets the dailyProratedCost value for this ContractBillingRule.
     * 
     * @param dailyProratedCost
     */
    public void setDailyProratedCost(java.lang.Object dailyProratedCost) {
        this.dailyProratedCost = dailyProratedCost;
    }


    /**
     * Gets the dailyProratedPrice value for this ContractBillingRule.
     * 
     * @return dailyProratedPrice
     */
    public java.lang.Object getDailyProratedPrice() {
        return dailyProratedPrice;
    }


    /**
     * Sets the dailyProratedPrice value for this ContractBillingRule.
     * 
     * @param dailyProratedPrice
     */
    public void setDailyProratedPrice(java.lang.Object dailyProratedPrice) {
        this.dailyProratedPrice = dailyProratedPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractBillingRule)) return false;
        ContractBillingRule other = (ContractBillingRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.invoiceDescription==null && other.getInvoiceDescription()==null) || 
             (this.invoiceDescription!=null &&
              this.invoiceDescription.equals(other.getInvoiceDescription()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.determineUnits==null && other.getDetermineUnits()==null) || 
             (this.determineUnits!=null &&
              this.determineUnits.equals(other.getDetermineUnits()))) &&
            ((this.minimumUnits==null && other.getMinimumUnits()==null) || 
             (this.minimumUnits!=null &&
              this.minimumUnits.equals(other.getMinimumUnits()))) &&
            ((this.maximumUnits==null && other.getMaximumUnits()==null) || 
             (this.maximumUnits!=null &&
              this.maximumUnits.equals(other.getMaximumUnits()))) &&
            ((this.createChargesAsBillable==null && other.getCreateChargesAsBillable()==null) || 
             (this.createChargesAsBillable!=null &&
              this.createChargesAsBillable.equals(other.getCreateChargesAsBillable()))) &&
            ((this.includeItemsInChargeDescription==null && other.getIncludeItemsInChargeDescription()==null) || 
             (this.includeItemsInChargeDescription!=null &&
              this.includeItemsInChargeDescription.equals(other.getIncludeItemsInChargeDescription()))) &&
            ((this.enableDailyProrating==null && other.getEnableDailyProrating()==null) || 
             (this.enableDailyProrating!=null &&
              this.enableDailyProrating.equals(other.getEnableDailyProrating()))) &&
            ((this.dailyProratedCost==null && other.getDailyProratedCost()==null) || 
             (this.dailyProratedCost!=null &&
              this.dailyProratedCost.equals(other.getDailyProratedCost()))) &&
            ((this.dailyProratedPrice==null && other.getDailyProratedPrice()==null) || 
             (this.dailyProratedPrice!=null &&
              this.dailyProratedPrice.equals(other.getDailyProratedPrice())));
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
        if (getInvoiceDescription() != null) {
            _hashCode += getInvoiceDescription().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getDetermineUnits() != null) {
            _hashCode += getDetermineUnits().hashCode();
        }
        if (getMinimumUnits() != null) {
            _hashCode += getMinimumUnits().hashCode();
        }
        if (getMaximumUnits() != null) {
            _hashCode += getMaximumUnits().hashCode();
        }
        if (getCreateChargesAsBillable() != null) {
            _hashCode += getCreateChargesAsBillable().hashCode();
        }
        if (getIncludeItemsInChargeDescription() != null) {
            _hashCode += getIncludeItemsInChargeDescription().hashCode();
        }
        if (getEnableDailyProrating() != null) {
            _hashCode += getEnableDailyProrating().hashCode();
        }
        if (getDailyProratedCost() != null) {
            _hashCode += getDailyProratedCost().hashCode();
        }
        if (getDailyProratedPrice() != null) {
            _hashCode += getDailyProratedPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractBillingRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractBillingRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceDescription"));
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
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProductID"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("determineUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DetermineUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MinimumUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MaximumUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createChargesAsBillable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateChargesAsBillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeItemsInChargeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IncludeItemsInChargeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableDailyProrating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EnableDailyProrating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyProratedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DailyProratedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyProratedPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DailyProratedPrice"));
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
