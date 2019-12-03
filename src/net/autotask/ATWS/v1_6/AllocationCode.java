/**
 * AllocationCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class AllocationCode  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object generalLedgerCode;

    private java.lang.Object department;

    private java.lang.Object name;

    private java.lang.Object type;

    private java.lang.Object useType;

    private java.lang.Object description;

    private java.lang.Object active;

    private java.lang.Object unitCost;

    private java.lang.Object unitPrice;

    private java.lang.Object allocationCodeType;

    private java.lang.Object taxable;

    private java.lang.Object externalNumber;

    private java.lang.Object taxCategoryID;

    private java.lang.Object markupRate;

    private java.lang.Object isExcludedFromNewContracts;

    public AllocationCode() {
    }

    public AllocationCode(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object generalLedgerCode,
           java.lang.Object department,
           java.lang.Object name,
           java.lang.Object type,
           java.lang.Object useType,
           java.lang.Object description,
           java.lang.Object active,
           java.lang.Object unitCost,
           java.lang.Object unitPrice,
           java.lang.Object allocationCodeType,
           java.lang.Object taxable,
           java.lang.Object externalNumber,
           java.lang.Object taxCategoryID,
           java.lang.Object markupRate,
           java.lang.Object isExcludedFromNewContracts) {
        super(
            fields,
            id,
            userDefinedFields);
        this.generalLedgerCode = generalLedgerCode;
        this.department = department;
        this.name = name;
        this.type = type;
        this.useType = useType;
        this.description = description;
        this.active = active;
        this.unitCost = unitCost;
        this.unitPrice = unitPrice;
        this.allocationCodeType = allocationCodeType;
        this.taxable = taxable;
        this.externalNumber = externalNumber;
        this.taxCategoryID = taxCategoryID;
        this.markupRate = markupRate;
        this.isExcludedFromNewContracts = isExcludedFromNewContracts;
    }


    /**
     * Gets the generalLedgerCode value for this AllocationCode.
     * 
     * @return generalLedgerCode
     */
    public java.lang.Object getGeneralLedgerCode() {
        return generalLedgerCode;
    }


    /**
     * Sets the generalLedgerCode value for this AllocationCode.
     * 
     * @param generalLedgerCode
     */
    public void setGeneralLedgerCode(java.lang.Object generalLedgerCode) {
        this.generalLedgerCode = generalLedgerCode;
    }


    /**
     * Gets the department value for this AllocationCode.
     * 
     * @return department
     */
    public java.lang.Object getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this AllocationCode.
     * 
     * @param department
     */
    public void setDepartment(java.lang.Object department) {
        this.department = department;
    }


    /**
     * Gets the name value for this AllocationCode.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this AllocationCode.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the type value for this AllocationCode.
     * 
     * @return type
     */
    public java.lang.Object getType() {
        return type;
    }


    /**
     * Sets the type value for this AllocationCode.
     * 
     * @param type
     */
    public void setType(java.lang.Object type) {
        this.type = type;
    }


    /**
     * Gets the useType value for this AllocationCode.
     * 
     * @return useType
     */
    public java.lang.Object getUseType() {
        return useType;
    }


    /**
     * Sets the useType value for this AllocationCode.
     * 
     * @param useType
     */
    public void setUseType(java.lang.Object useType) {
        this.useType = useType;
    }


    /**
     * Gets the description value for this AllocationCode.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AllocationCode.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the active value for this AllocationCode.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this AllocationCode.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the unitCost value for this AllocationCode.
     * 
     * @return unitCost
     */
    public java.lang.Object getUnitCost() {
        return unitCost;
    }


    /**
     * Sets the unitCost value for this AllocationCode.
     * 
     * @param unitCost
     */
    public void setUnitCost(java.lang.Object unitCost) {
        this.unitCost = unitCost;
    }


    /**
     * Gets the unitPrice value for this AllocationCode.
     * 
     * @return unitPrice
     */
    public java.lang.Object getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this AllocationCode.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.lang.Object unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the allocationCodeType value for this AllocationCode.
     * 
     * @return allocationCodeType
     */
    public java.lang.Object getAllocationCodeType() {
        return allocationCodeType;
    }


    /**
     * Sets the allocationCodeType value for this AllocationCode.
     * 
     * @param allocationCodeType
     */
    public void setAllocationCodeType(java.lang.Object allocationCodeType) {
        this.allocationCodeType = allocationCodeType;
    }


    /**
     * Gets the taxable value for this AllocationCode.
     * 
     * @return taxable
     */
    public java.lang.Object getTaxable() {
        return taxable;
    }


    /**
     * Sets the taxable value for this AllocationCode.
     * 
     * @param taxable
     */
    public void setTaxable(java.lang.Object taxable) {
        this.taxable = taxable;
    }


    /**
     * Gets the externalNumber value for this AllocationCode.
     * 
     * @return externalNumber
     */
    public java.lang.Object getExternalNumber() {
        return externalNumber;
    }


    /**
     * Sets the externalNumber value for this AllocationCode.
     * 
     * @param externalNumber
     */
    public void setExternalNumber(java.lang.Object externalNumber) {
        this.externalNumber = externalNumber;
    }


    /**
     * Gets the taxCategoryID value for this AllocationCode.
     * 
     * @return taxCategoryID
     */
    public java.lang.Object getTaxCategoryID() {
        return taxCategoryID;
    }


    /**
     * Sets the taxCategoryID value for this AllocationCode.
     * 
     * @param taxCategoryID
     */
    public void setTaxCategoryID(java.lang.Object taxCategoryID) {
        this.taxCategoryID = taxCategoryID;
    }


    /**
     * Gets the markupRate value for this AllocationCode.
     * 
     * @return markupRate
     */
    public java.lang.Object getMarkupRate() {
        return markupRate;
    }


    /**
     * Sets the markupRate value for this AllocationCode.
     * 
     * @param markupRate
     */
    public void setMarkupRate(java.lang.Object markupRate) {
        this.markupRate = markupRate;
    }


    /**
     * Gets the isExcludedFromNewContracts value for this AllocationCode.
     * 
     * @return isExcludedFromNewContracts
     */
    public java.lang.Object getIsExcludedFromNewContracts() {
        return isExcludedFromNewContracts;
    }


    /**
     * Sets the isExcludedFromNewContracts value for this AllocationCode.
     * 
     * @param isExcludedFromNewContracts
     */
    public void setIsExcludedFromNewContracts(java.lang.Object isExcludedFromNewContracts) {
        this.isExcludedFromNewContracts = isExcludedFromNewContracts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllocationCode)) return false;
        AllocationCode other = (AllocationCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.generalLedgerCode==null && other.getGeneralLedgerCode()==null) || 
             (this.generalLedgerCode!=null &&
              this.generalLedgerCode.equals(other.getGeneralLedgerCode()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.useType==null && other.getUseType()==null) || 
             (this.useType!=null &&
              this.useType.equals(other.getUseType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.unitCost==null && other.getUnitCost()==null) || 
             (this.unitCost!=null &&
              this.unitCost.equals(other.getUnitCost()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.allocationCodeType==null && other.getAllocationCodeType()==null) || 
             (this.allocationCodeType!=null &&
              this.allocationCodeType.equals(other.getAllocationCodeType()))) &&
            ((this.taxable==null && other.getTaxable()==null) || 
             (this.taxable!=null &&
              this.taxable.equals(other.getTaxable()))) &&
            ((this.externalNumber==null && other.getExternalNumber()==null) || 
             (this.externalNumber!=null &&
              this.externalNumber.equals(other.getExternalNumber()))) &&
            ((this.taxCategoryID==null && other.getTaxCategoryID()==null) || 
             (this.taxCategoryID!=null &&
              this.taxCategoryID.equals(other.getTaxCategoryID()))) &&
            ((this.markupRate==null && other.getMarkupRate()==null) || 
             (this.markupRate!=null &&
              this.markupRate.equals(other.getMarkupRate()))) &&
            ((this.isExcludedFromNewContracts==null && other.getIsExcludedFromNewContracts()==null) || 
             (this.isExcludedFromNewContracts!=null &&
              this.isExcludedFromNewContracts.equals(other.getIsExcludedFromNewContracts())));
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
        if (getGeneralLedgerCode() != null) {
            _hashCode += getGeneralLedgerCode().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUseType() != null) {
            _hashCode += getUseType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getUnitCost() != null) {
            _hashCode += getUnitCost().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getAllocationCodeType() != null) {
            _hashCode += getAllocationCodeType().hashCode();
        }
        if (getTaxable() != null) {
            _hashCode += getTaxable().hashCode();
        }
        if (getExternalNumber() != null) {
            _hashCode += getExternalNumber().hashCode();
        }
        if (getTaxCategoryID() != null) {
            _hashCode += getTaxCategoryID().hashCode();
        }
        if (getMarkupRate() != null) {
            _hashCode += getMarkupRate().hashCode();
        }
        if (getIsExcludedFromNewContracts() != null) {
            _hashCode += getIsExcludedFromNewContracts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AllocationCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AllocationCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalLedgerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "GeneralLedgerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UseType"));
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
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Active"));
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
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationCodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AllocationCodeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Taxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExternalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCategoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaxCategoryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markupRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MarkupRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExcludedFromNewContracts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsExcludedFromNewContracts"));
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
