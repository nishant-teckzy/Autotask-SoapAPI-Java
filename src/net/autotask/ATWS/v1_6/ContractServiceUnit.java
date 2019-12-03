/**
 * ContractServiceUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractServiceUnit  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object contractID;

    private java.lang.Object serviceID;

    private java.lang.Object startDate;

    private java.lang.Object endDate;

    private java.lang.Object units;

    private java.lang.Object price;

    private java.lang.Object cost;

    private java.lang.Object vendorAccountID;

    private java.lang.Object approveAndPostDate;

    private java.lang.Object contractServiceID;

    private java.lang.Object internalCurrencyPrice;

    private java.lang.Object businessDivisionSubdivisionID;

    public ContractServiceUnit() {
    }

    public ContractServiceUnit(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object contractID,
           java.lang.Object serviceID,
           java.lang.Object startDate,
           java.lang.Object endDate,
           java.lang.Object units,
           java.lang.Object price,
           java.lang.Object cost,
           java.lang.Object vendorAccountID,
           java.lang.Object approveAndPostDate,
           java.lang.Object contractServiceID,
           java.lang.Object internalCurrencyPrice,
           java.lang.Object businessDivisionSubdivisionID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.contractID = contractID;
        this.serviceID = serviceID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.units = units;
        this.price = price;
        this.cost = cost;
        this.vendorAccountID = vendorAccountID;
        this.approveAndPostDate = approveAndPostDate;
        this.contractServiceID = contractServiceID;
        this.internalCurrencyPrice = internalCurrencyPrice;
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }


    /**
     * Gets the contractID value for this ContractServiceUnit.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ContractServiceUnit.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the serviceID value for this ContractServiceUnit.
     * 
     * @return serviceID
     */
    public java.lang.Object getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this ContractServiceUnit.
     * 
     * @param serviceID
     */
    public void setServiceID(java.lang.Object serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the startDate value for this ContractServiceUnit.
     * 
     * @return startDate
     */
    public java.lang.Object getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ContractServiceUnit.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.Object startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ContractServiceUnit.
     * 
     * @return endDate
     */
    public java.lang.Object getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ContractServiceUnit.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.Object endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the units value for this ContractServiceUnit.
     * 
     * @return units
     */
    public java.lang.Object getUnits() {
        return units;
    }


    /**
     * Sets the units value for this ContractServiceUnit.
     * 
     * @param units
     */
    public void setUnits(java.lang.Object units) {
        this.units = units;
    }


    /**
     * Gets the price value for this ContractServiceUnit.
     * 
     * @return price
     */
    public java.lang.Object getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ContractServiceUnit.
     * 
     * @param price
     */
    public void setPrice(java.lang.Object price) {
        this.price = price;
    }


    /**
     * Gets the cost value for this ContractServiceUnit.
     * 
     * @return cost
     */
    public java.lang.Object getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ContractServiceUnit.
     * 
     * @param cost
     */
    public void setCost(java.lang.Object cost) {
        this.cost = cost;
    }


    /**
     * Gets the vendorAccountID value for this ContractServiceUnit.
     * 
     * @return vendorAccountID
     */
    public java.lang.Object getVendorAccountID() {
        return vendorAccountID;
    }


    /**
     * Sets the vendorAccountID value for this ContractServiceUnit.
     * 
     * @param vendorAccountID
     */
    public void setVendorAccountID(java.lang.Object vendorAccountID) {
        this.vendorAccountID = vendorAccountID;
    }


    /**
     * Gets the approveAndPostDate value for this ContractServiceUnit.
     * 
     * @return approveAndPostDate
     */
    public java.lang.Object getApproveAndPostDate() {
        return approveAndPostDate;
    }


    /**
     * Sets the approveAndPostDate value for this ContractServiceUnit.
     * 
     * @param approveAndPostDate
     */
    public void setApproveAndPostDate(java.lang.Object approveAndPostDate) {
        this.approveAndPostDate = approveAndPostDate;
    }


    /**
     * Gets the contractServiceID value for this ContractServiceUnit.
     * 
     * @return contractServiceID
     */
    public java.lang.Object getContractServiceID() {
        return contractServiceID;
    }


    /**
     * Sets the contractServiceID value for this ContractServiceUnit.
     * 
     * @param contractServiceID
     */
    public void setContractServiceID(java.lang.Object contractServiceID) {
        this.contractServiceID = contractServiceID;
    }


    /**
     * Gets the internalCurrencyPrice value for this ContractServiceUnit.
     * 
     * @return internalCurrencyPrice
     */
    public java.lang.Object getInternalCurrencyPrice() {
        return internalCurrencyPrice;
    }


    /**
     * Sets the internalCurrencyPrice value for this ContractServiceUnit.
     * 
     * @param internalCurrencyPrice
     */
    public void setInternalCurrencyPrice(java.lang.Object internalCurrencyPrice) {
        this.internalCurrencyPrice = internalCurrencyPrice;
    }


    /**
     * Gets the businessDivisionSubdivisionID value for this ContractServiceUnit.
     * 
     * @return businessDivisionSubdivisionID
     */
    public java.lang.Object getBusinessDivisionSubdivisionID() {
        return businessDivisionSubdivisionID;
    }


    /**
     * Sets the businessDivisionSubdivisionID value for this ContractServiceUnit.
     * 
     * @param businessDivisionSubdivisionID
     */
    public void setBusinessDivisionSubdivisionID(java.lang.Object businessDivisionSubdivisionID) {
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractServiceUnit)) return false;
        ContractServiceUnit other = (ContractServiceUnit) obj;
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
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.vendorAccountID==null && other.getVendorAccountID()==null) || 
             (this.vendorAccountID!=null &&
              this.vendorAccountID.equals(other.getVendorAccountID()))) &&
            ((this.approveAndPostDate==null && other.getApproveAndPostDate()==null) || 
             (this.approveAndPostDate!=null &&
              this.approveAndPostDate.equals(other.getApproveAndPostDate()))) &&
            ((this.contractServiceID==null && other.getContractServiceID()==null) || 
             (this.contractServiceID!=null &&
              this.contractServiceID.equals(other.getContractServiceID()))) &&
            ((this.internalCurrencyPrice==null && other.getInternalCurrencyPrice()==null) || 
             (this.internalCurrencyPrice!=null &&
              this.internalCurrencyPrice.equals(other.getInternalCurrencyPrice()))) &&
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
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getVendorAccountID() != null) {
            _hashCode += getVendorAccountID().hashCode();
        }
        if (getApproveAndPostDate() != null) {
            _hashCode += getApproveAndPostDate().hashCode();
        }
        if (getContractServiceID() != null) {
            _hashCode += getContractServiceID().hashCode();
        }
        if (getInternalCurrencyPrice() != null) {
            _hashCode += getInternalCurrencyPrice().hashCode();
        }
        if (getBusinessDivisionSubdivisionID() != null) {
            _hashCode += getBusinessDivisionSubdivisionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractServiceUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractServiceUnit"));
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
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "VendorAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approveAndPostDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ApproveAndPostDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractServiceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractServiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyPrice"));
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
