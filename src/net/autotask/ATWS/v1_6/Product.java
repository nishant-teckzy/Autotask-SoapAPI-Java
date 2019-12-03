/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Product  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object name;

    private java.lang.Object description;

    private java.lang.Object SKU;

    private java.lang.Object link;

    private java.lang.Object productCategory;

    private java.lang.Object externalProductID;

    private java.lang.Object unitCost;

    private java.lang.Object markupRate;

    private java.lang.Object unitPrice;

    private java.lang.Object MSRP;

    private java.lang.Object defaultVendorID;

    private java.lang.Object vendorProductNumber;

    private java.lang.Object manufacturerName;

    private java.lang.Object manufacturerProductName;

    private java.lang.Object active;

    private java.lang.Object periodType;

    private java.lang.Object productAllocationCodeID;

    private java.lang.Object serialized;

    private java.lang.Object costAllocationCodeID;

    private java.lang.Object doesNotRequireProcurement;

    private java.lang.Object internalProductID;

    private java.lang.Object billingType;

    private java.lang.Object priceCostMethod;

    public Product() {
    }

    public Product(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object name,
           java.lang.Object description,
           java.lang.Object SKU,
           java.lang.Object link,
           java.lang.Object productCategory,
           java.lang.Object externalProductID,
           java.lang.Object unitCost,
           java.lang.Object markupRate,
           java.lang.Object unitPrice,
           java.lang.Object MSRP,
           java.lang.Object defaultVendorID,
           java.lang.Object vendorProductNumber,
           java.lang.Object manufacturerName,
           java.lang.Object manufacturerProductName,
           java.lang.Object active,
           java.lang.Object periodType,
           java.lang.Object productAllocationCodeID,
           java.lang.Object serialized,
           java.lang.Object costAllocationCodeID,
           java.lang.Object doesNotRequireProcurement,
           java.lang.Object internalProductID,
           java.lang.Object billingType,
           java.lang.Object priceCostMethod) {
        super(
            fields,
            id,
            userDefinedFields);
        this.name = name;
        this.description = description;
        this.SKU = SKU;
        this.link = link;
        this.productCategory = productCategory;
        this.externalProductID = externalProductID;
        this.unitCost = unitCost;
        this.markupRate = markupRate;
        this.unitPrice = unitPrice;
        this.MSRP = MSRP;
        this.defaultVendorID = defaultVendorID;
        this.vendorProductNumber = vendorProductNumber;
        this.manufacturerName = manufacturerName;
        this.manufacturerProductName = manufacturerProductName;
        this.active = active;
        this.periodType = periodType;
        this.productAllocationCodeID = productAllocationCodeID;
        this.serialized = serialized;
        this.costAllocationCodeID = costAllocationCodeID;
        this.doesNotRequireProcurement = doesNotRequireProcurement;
        this.internalProductID = internalProductID;
        this.billingType = billingType;
        this.priceCostMethod = priceCostMethod;
    }


    /**
     * Gets the name value for this Product.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this Product.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the description value for this Product.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Product.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the SKU value for this Product.
     * 
     * @return SKU
     */
    public java.lang.Object getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this Product.
     * 
     * @param SKU
     */
    public void setSKU(java.lang.Object SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the link value for this Product.
     * 
     * @return link
     */
    public java.lang.Object getLink() {
        return link;
    }


    /**
     * Sets the link value for this Product.
     * 
     * @param link
     */
    public void setLink(java.lang.Object link) {
        this.link = link;
    }


    /**
     * Gets the productCategory value for this Product.
     * 
     * @return productCategory
     */
    public java.lang.Object getProductCategory() {
        return productCategory;
    }


    /**
     * Sets the productCategory value for this Product.
     * 
     * @param productCategory
     */
    public void setProductCategory(java.lang.Object productCategory) {
        this.productCategory = productCategory;
    }


    /**
     * Gets the externalProductID value for this Product.
     * 
     * @return externalProductID
     */
    public java.lang.Object getExternalProductID() {
        return externalProductID;
    }


    /**
     * Sets the externalProductID value for this Product.
     * 
     * @param externalProductID
     */
    public void setExternalProductID(java.lang.Object externalProductID) {
        this.externalProductID = externalProductID;
    }


    /**
     * Gets the unitCost value for this Product.
     * 
     * @return unitCost
     */
    public java.lang.Object getUnitCost() {
        return unitCost;
    }


    /**
     * Sets the unitCost value for this Product.
     * 
     * @param unitCost
     */
    public void setUnitCost(java.lang.Object unitCost) {
        this.unitCost = unitCost;
    }


    /**
     * Gets the markupRate value for this Product.
     * 
     * @return markupRate
     */
    public java.lang.Object getMarkupRate() {
        return markupRate;
    }


    /**
     * Sets the markupRate value for this Product.
     * 
     * @param markupRate
     */
    public void setMarkupRate(java.lang.Object markupRate) {
        this.markupRate = markupRate;
    }


    /**
     * Gets the unitPrice value for this Product.
     * 
     * @return unitPrice
     */
    public java.lang.Object getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this Product.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.lang.Object unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the MSRP value for this Product.
     * 
     * @return MSRP
     */
    public java.lang.Object getMSRP() {
        return MSRP;
    }


    /**
     * Sets the MSRP value for this Product.
     * 
     * @param MSRP
     */
    public void setMSRP(java.lang.Object MSRP) {
        this.MSRP = MSRP;
    }


    /**
     * Gets the defaultVendorID value for this Product.
     * 
     * @return defaultVendorID
     */
    public java.lang.Object getDefaultVendorID() {
        return defaultVendorID;
    }


    /**
     * Sets the defaultVendorID value for this Product.
     * 
     * @param defaultVendorID
     */
    public void setDefaultVendorID(java.lang.Object defaultVendorID) {
        this.defaultVendorID = defaultVendorID;
    }


    /**
     * Gets the vendorProductNumber value for this Product.
     * 
     * @return vendorProductNumber
     */
    public java.lang.Object getVendorProductNumber() {
        return vendorProductNumber;
    }


    /**
     * Sets the vendorProductNumber value for this Product.
     * 
     * @param vendorProductNumber
     */
    public void setVendorProductNumber(java.lang.Object vendorProductNumber) {
        this.vendorProductNumber = vendorProductNumber;
    }


    /**
     * Gets the manufacturerName value for this Product.
     * 
     * @return manufacturerName
     */
    public java.lang.Object getManufacturerName() {
        return manufacturerName;
    }


    /**
     * Sets the manufacturerName value for this Product.
     * 
     * @param manufacturerName
     */
    public void setManufacturerName(java.lang.Object manufacturerName) {
        this.manufacturerName = manufacturerName;
    }


    /**
     * Gets the manufacturerProductName value for this Product.
     * 
     * @return manufacturerProductName
     */
    public java.lang.Object getManufacturerProductName() {
        return manufacturerProductName;
    }


    /**
     * Sets the manufacturerProductName value for this Product.
     * 
     * @param manufacturerProductName
     */
    public void setManufacturerProductName(java.lang.Object manufacturerProductName) {
        this.manufacturerProductName = manufacturerProductName;
    }


    /**
     * Gets the active value for this Product.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this Product.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the periodType value for this Product.
     * 
     * @return periodType
     */
    public java.lang.Object getPeriodType() {
        return periodType;
    }


    /**
     * Sets the periodType value for this Product.
     * 
     * @param periodType
     */
    public void setPeriodType(java.lang.Object periodType) {
        this.periodType = periodType;
    }


    /**
     * Gets the productAllocationCodeID value for this Product.
     * 
     * @return productAllocationCodeID
     */
    public java.lang.Object getProductAllocationCodeID() {
        return productAllocationCodeID;
    }


    /**
     * Sets the productAllocationCodeID value for this Product.
     * 
     * @param productAllocationCodeID
     */
    public void setProductAllocationCodeID(java.lang.Object productAllocationCodeID) {
        this.productAllocationCodeID = productAllocationCodeID;
    }


    /**
     * Gets the serialized value for this Product.
     * 
     * @return serialized
     */
    public java.lang.Object getSerialized() {
        return serialized;
    }


    /**
     * Sets the serialized value for this Product.
     * 
     * @param serialized
     */
    public void setSerialized(java.lang.Object serialized) {
        this.serialized = serialized;
    }


    /**
     * Gets the costAllocationCodeID value for this Product.
     * 
     * @return costAllocationCodeID
     */
    public java.lang.Object getCostAllocationCodeID() {
        return costAllocationCodeID;
    }


    /**
     * Sets the costAllocationCodeID value for this Product.
     * 
     * @param costAllocationCodeID
     */
    public void setCostAllocationCodeID(java.lang.Object costAllocationCodeID) {
        this.costAllocationCodeID = costAllocationCodeID;
    }


    /**
     * Gets the doesNotRequireProcurement value for this Product.
     * 
     * @return doesNotRequireProcurement
     */
    public java.lang.Object getDoesNotRequireProcurement() {
        return doesNotRequireProcurement;
    }


    /**
     * Sets the doesNotRequireProcurement value for this Product.
     * 
     * @param doesNotRequireProcurement
     */
    public void setDoesNotRequireProcurement(java.lang.Object doesNotRequireProcurement) {
        this.doesNotRequireProcurement = doesNotRequireProcurement;
    }


    /**
     * Gets the internalProductID value for this Product.
     * 
     * @return internalProductID
     */
    public java.lang.Object getInternalProductID() {
        return internalProductID;
    }


    /**
     * Sets the internalProductID value for this Product.
     * 
     * @param internalProductID
     */
    public void setInternalProductID(java.lang.Object internalProductID) {
        this.internalProductID = internalProductID;
    }


    /**
     * Gets the billingType value for this Product.
     * 
     * @return billingType
     */
    public java.lang.Object getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this Product.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.Object billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the priceCostMethod value for this Product.
     * 
     * @return priceCostMethod
     */
    public java.lang.Object getPriceCostMethod() {
        return priceCostMethod;
    }


    /**
     * Sets the priceCostMethod value for this Product.
     * 
     * @param priceCostMethod
     */
    public void setPriceCostMethod(java.lang.Object priceCostMethod) {
        this.priceCostMethod = priceCostMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.SKU==null && other.getSKU()==null) || 
             (this.SKU!=null &&
              this.SKU.equals(other.getSKU()))) &&
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              this.link.equals(other.getLink()))) &&
            ((this.productCategory==null && other.getProductCategory()==null) || 
             (this.productCategory!=null &&
              this.productCategory.equals(other.getProductCategory()))) &&
            ((this.externalProductID==null && other.getExternalProductID()==null) || 
             (this.externalProductID!=null &&
              this.externalProductID.equals(other.getExternalProductID()))) &&
            ((this.unitCost==null && other.getUnitCost()==null) || 
             (this.unitCost!=null &&
              this.unitCost.equals(other.getUnitCost()))) &&
            ((this.markupRate==null && other.getMarkupRate()==null) || 
             (this.markupRate!=null &&
              this.markupRate.equals(other.getMarkupRate()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.MSRP==null && other.getMSRP()==null) || 
             (this.MSRP!=null &&
              this.MSRP.equals(other.getMSRP()))) &&
            ((this.defaultVendorID==null && other.getDefaultVendorID()==null) || 
             (this.defaultVendorID!=null &&
              this.defaultVendorID.equals(other.getDefaultVendorID()))) &&
            ((this.vendorProductNumber==null && other.getVendorProductNumber()==null) || 
             (this.vendorProductNumber!=null &&
              this.vendorProductNumber.equals(other.getVendorProductNumber()))) &&
            ((this.manufacturerName==null && other.getManufacturerName()==null) || 
             (this.manufacturerName!=null &&
              this.manufacturerName.equals(other.getManufacturerName()))) &&
            ((this.manufacturerProductName==null && other.getManufacturerProductName()==null) || 
             (this.manufacturerProductName!=null &&
              this.manufacturerProductName.equals(other.getManufacturerProductName()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.periodType==null && other.getPeriodType()==null) || 
             (this.periodType!=null &&
              this.periodType.equals(other.getPeriodType()))) &&
            ((this.productAllocationCodeID==null && other.getProductAllocationCodeID()==null) || 
             (this.productAllocationCodeID!=null &&
              this.productAllocationCodeID.equals(other.getProductAllocationCodeID()))) &&
            ((this.serialized==null && other.getSerialized()==null) || 
             (this.serialized!=null &&
              this.serialized.equals(other.getSerialized()))) &&
            ((this.costAllocationCodeID==null && other.getCostAllocationCodeID()==null) || 
             (this.costAllocationCodeID!=null &&
              this.costAllocationCodeID.equals(other.getCostAllocationCodeID()))) &&
            ((this.doesNotRequireProcurement==null && other.getDoesNotRequireProcurement()==null) || 
             (this.doesNotRequireProcurement!=null &&
              this.doesNotRequireProcurement.equals(other.getDoesNotRequireProcurement()))) &&
            ((this.internalProductID==null && other.getInternalProductID()==null) || 
             (this.internalProductID!=null &&
              this.internalProductID.equals(other.getInternalProductID()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.priceCostMethod==null && other.getPriceCostMethod()==null) || 
             (this.priceCostMethod!=null &&
              this.priceCostMethod.equals(other.getPriceCostMethod())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSKU() != null) {
            _hashCode += getSKU().hashCode();
        }
        if (getLink() != null) {
            _hashCode += getLink().hashCode();
        }
        if (getProductCategory() != null) {
            _hashCode += getProductCategory().hashCode();
        }
        if (getExternalProductID() != null) {
            _hashCode += getExternalProductID().hashCode();
        }
        if (getUnitCost() != null) {
            _hashCode += getUnitCost().hashCode();
        }
        if (getMarkupRate() != null) {
            _hashCode += getMarkupRate().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getMSRP() != null) {
            _hashCode += getMSRP().hashCode();
        }
        if (getDefaultVendorID() != null) {
            _hashCode += getDefaultVendorID().hashCode();
        }
        if (getVendorProductNumber() != null) {
            _hashCode += getVendorProductNumber().hashCode();
        }
        if (getManufacturerName() != null) {
            _hashCode += getManufacturerName().hashCode();
        }
        if (getManufacturerProductName() != null) {
            _hashCode += getManufacturerProductName().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getPeriodType() != null) {
            _hashCode += getPeriodType().hashCode();
        }
        if (getProductAllocationCodeID() != null) {
            _hashCode += getProductAllocationCodeID().hashCode();
        }
        if (getSerialized() != null) {
            _hashCode += getSerialized().hashCode();
        }
        if (getCostAllocationCodeID() != null) {
            _hashCode += getCostAllocationCodeID().hashCode();
        }
        if (getDoesNotRequireProcurement() != null) {
            _hashCode += getDoesNotRequireProcurement().hashCode();
        }
        if (getInternalProductID() != null) {
            _hashCode += getInternalProductID().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getPriceCostMethod() != null) {
            _hashCode += getPriceCostMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
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
        elemField.setFieldName("SKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProductCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExternalProductID"));
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
        elemField.setFieldName("markupRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MarkupRate"));
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
        elemField.setFieldName("MSRP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MSRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultVendorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DefaultVendorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorProductNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "VendorProductNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ManufacturerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerProductName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ManufacturerProductName"));
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
        elemField.setFieldName("periodType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PeriodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productAllocationCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProductAllocationCodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialized");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Serialized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costAllocationCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CostAllocationCodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doesNotRequireProcurement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DoesNotRequireProcurement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceCostMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PriceCostMethod"));
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
