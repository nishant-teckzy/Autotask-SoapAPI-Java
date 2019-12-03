/**
 * ContractMilestone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ContractMilestone  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object createDate;

    private java.lang.Object creatorResourceID;

    private java.lang.Object status;

    private java.lang.Object dateDue;

    private java.lang.Object amount;

    private java.lang.Object title;

    private java.lang.Object description;

    private java.lang.Object contractID;

    private java.lang.Object isInitialPayment;

    private java.lang.Object allocationCodeID;

    private java.lang.Object internalCurrencyAmount;

    private java.lang.Object businessDivisionSubdivisionID;

    public ContractMilestone() {
    }

    public ContractMilestone(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object createDate,
           java.lang.Object creatorResourceID,
           java.lang.Object status,
           java.lang.Object dateDue,
           java.lang.Object amount,
           java.lang.Object title,
           java.lang.Object description,
           java.lang.Object contractID,
           java.lang.Object isInitialPayment,
           java.lang.Object allocationCodeID,
           java.lang.Object internalCurrencyAmount,
           java.lang.Object businessDivisionSubdivisionID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.createDate = createDate;
        this.creatorResourceID = creatorResourceID;
        this.status = status;
        this.dateDue = dateDue;
        this.amount = amount;
        this.title = title;
        this.description = description;
        this.contractID = contractID;
        this.isInitialPayment = isInitialPayment;
        this.allocationCodeID = allocationCodeID;
        this.internalCurrencyAmount = internalCurrencyAmount;
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }


    /**
     * Gets the createDate value for this ContractMilestone.
     * 
     * @return createDate
     */
    public java.lang.Object getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this ContractMilestone.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.Object createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the creatorResourceID value for this ContractMilestone.
     * 
     * @return creatorResourceID
     */
    public java.lang.Object getCreatorResourceID() {
        return creatorResourceID;
    }


    /**
     * Sets the creatorResourceID value for this ContractMilestone.
     * 
     * @param creatorResourceID
     */
    public void setCreatorResourceID(java.lang.Object creatorResourceID) {
        this.creatorResourceID = creatorResourceID;
    }


    /**
     * Gets the status value for this ContractMilestone.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ContractMilestone.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the dateDue value for this ContractMilestone.
     * 
     * @return dateDue
     */
    public java.lang.Object getDateDue() {
        return dateDue;
    }


    /**
     * Sets the dateDue value for this ContractMilestone.
     * 
     * @param dateDue
     */
    public void setDateDue(java.lang.Object dateDue) {
        this.dateDue = dateDue;
    }


    /**
     * Gets the amount value for this ContractMilestone.
     * 
     * @return amount
     */
    public java.lang.Object getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ContractMilestone.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Object amount) {
        this.amount = amount;
    }


    /**
     * Gets the title value for this ContractMilestone.
     * 
     * @return title
     */
    public java.lang.Object getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ContractMilestone.
     * 
     * @param title
     */
    public void setTitle(java.lang.Object title) {
        this.title = title;
    }


    /**
     * Gets the description value for this ContractMilestone.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ContractMilestone.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the contractID value for this ContractMilestone.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this ContractMilestone.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the isInitialPayment value for this ContractMilestone.
     * 
     * @return isInitialPayment
     */
    public java.lang.Object getIsInitialPayment() {
        return isInitialPayment;
    }


    /**
     * Sets the isInitialPayment value for this ContractMilestone.
     * 
     * @param isInitialPayment
     */
    public void setIsInitialPayment(java.lang.Object isInitialPayment) {
        this.isInitialPayment = isInitialPayment;
    }


    /**
     * Gets the allocationCodeID value for this ContractMilestone.
     * 
     * @return allocationCodeID
     */
    public java.lang.Object getAllocationCodeID() {
        return allocationCodeID;
    }


    /**
     * Sets the allocationCodeID value for this ContractMilestone.
     * 
     * @param allocationCodeID
     */
    public void setAllocationCodeID(java.lang.Object allocationCodeID) {
        this.allocationCodeID = allocationCodeID;
    }


    /**
     * Gets the internalCurrencyAmount value for this ContractMilestone.
     * 
     * @return internalCurrencyAmount
     */
    public java.lang.Object getInternalCurrencyAmount() {
        return internalCurrencyAmount;
    }


    /**
     * Sets the internalCurrencyAmount value for this ContractMilestone.
     * 
     * @param internalCurrencyAmount
     */
    public void setInternalCurrencyAmount(java.lang.Object internalCurrencyAmount) {
        this.internalCurrencyAmount = internalCurrencyAmount;
    }


    /**
     * Gets the businessDivisionSubdivisionID value for this ContractMilestone.
     * 
     * @return businessDivisionSubdivisionID
     */
    public java.lang.Object getBusinessDivisionSubdivisionID() {
        return businessDivisionSubdivisionID;
    }


    /**
     * Sets the businessDivisionSubdivisionID value for this ContractMilestone.
     * 
     * @param businessDivisionSubdivisionID
     */
    public void setBusinessDivisionSubdivisionID(java.lang.Object businessDivisionSubdivisionID) {
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractMilestone)) return false;
        ContractMilestone other = (ContractMilestone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.creatorResourceID==null && other.getCreatorResourceID()==null) || 
             (this.creatorResourceID!=null &&
              this.creatorResourceID.equals(other.getCreatorResourceID()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.dateDue==null && other.getDateDue()==null) || 
             (this.dateDue!=null &&
              this.dateDue.equals(other.getDateDue()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.isInitialPayment==null && other.getIsInitialPayment()==null) || 
             (this.isInitialPayment!=null &&
              this.isInitialPayment.equals(other.getIsInitialPayment()))) &&
            ((this.allocationCodeID==null && other.getAllocationCodeID()==null) || 
             (this.allocationCodeID!=null &&
              this.allocationCodeID.equals(other.getAllocationCodeID()))) &&
            ((this.internalCurrencyAmount==null && other.getInternalCurrencyAmount()==null) || 
             (this.internalCurrencyAmount!=null &&
              this.internalCurrencyAmount.equals(other.getInternalCurrencyAmount()))) &&
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
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getCreatorResourceID() != null) {
            _hashCode += getCreatorResourceID().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDateDue() != null) {
            _hashCode += getDateDue().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getIsInitialPayment() != null) {
            _hashCode += getIsInitialPayment().hashCode();
        }
        if (getAllocationCodeID() != null) {
            _hashCode += getAllocationCodeID().hashCode();
        }
        if (getInternalCurrencyAmount() != null) {
            _hashCode += getInternalCurrencyAmount().hashCode();
        }
        if (getBusinessDivisionSubdivisionID() != null) {
            _hashCode += getBusinessDivisionSubdivisionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractMilestone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractMilestone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreatorResourceID"));
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
        elemField.setFieldName("dateDue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DateDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Title"));
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
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInitialPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsInitialPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AllocationCodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyAmount"));
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
