/**
 * QuoteItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class QuoteItem  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object averageCost;

    private java.lang.Object costID;

    private java.lang.Object description;

    private java.lang.Object expenseID;

    private java.lang.Object highestCost;

    private java.lang.Object isTaxable;

    private java.lang.Object isOptional;

    private java.lang.Object laborID;

    private java.lang.Object lineDiscount;

    private java.lang.Object markupRate;

    private java.lang.Object name;

    private java.lang.Object percentageDiscount;

    private java.lang.Object periodType;

    private java.lang.Object productID;

    private java.lang.Object quantity;

    private java.lang.Object quoteID;

    private java.lang.Object serviceID;

    private java.lang.Object serviceBundleID;

    private java.lang.Object shippingID;

    private java.lang.Object taxCategoryID;

    private java.lang.Object totalEffectiveTax;

    private java.lang.Object type;

    private java.lang.Object unitCost;

    private java.lang.Object unitDiscount;

    private java.lang.Object unitPrice;

    private java.lang.Object internalCurrencyUnitPrice;

    private java.lang.Object internalCurrencyUnitDiscount;

    private java.lang.Object internalCurrencyLineDiscount;

    public QuoteItem() {
    }

    public QuoteItem(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object averageCost,
           java.lang.Object costID,
           java.lang.Object description,
           java.lang.Object expenseID,
           java.lang.Object highestCost,
           java.lang.Object isTaxable,
           java.lang.Object isOptional,
           java.lang.Object laborID,
           java.lang.Object lineDiscount,
           java.lang.Object markupRate,
           java.lang.Object name,
           java.lang.Object percentageDiscount,
           java.lang.Object periodType,
           java.lang.Object productID,
           java.lang.Object quantity,
           java.lang.Object quoteID,
           java.lang.Object serviceID,
           java.lang.Object serviceBundleID,
           java.lang.Object shippingID,
           java.lang.Object taxCategoryID,
           java.lang.Object totalEffectiveTax,
           java.lang.Object type,
           java.lang.Object unitCost,
           java.lang.Object unitDiscount,
           java.lang.Object unitPrice,
           java.lang.Object internalCurrencyUnitPrice,
           java.lang.Object internalCurrencyUnitDiscount,
           java.lang.Object internalCurrencyLineDiscount) {
        super(
            fields,
            id,
            userDefinedFields);
        this.averageCost = averageCost;
        this.costID = costID;
        this.description = description;
        this.expenseID = expenseID;
        this.highestCost = highestCost;
        this.isTaxable = isTaxable;
        this.isOptional = isOptional;
        this.laborID = laborID;
        this.lineDiscount = lineDiscount;
        this.markupRate = markupRate;
        this.name = name;
        this.percentageDiscount = percentageDiscount;
        this.periodType = periodType;
        this.productID = productID;
        this.quantity = quantity;
        this.quoteID = quoteID;
        this.serviceID = serviceID;
        this.serviceBundleID = serviceBundleID;
        this.shippingID = shippingID;
        this.taxCategoryID = taxCategoryID;
        this.totalEffectiveTax = totalEffectiveTax;
        this.type = type;
        this.unitCost = unitCost;
        this.unitDiscount = unitDiscount;
        this.unitPrice = unitPrice;
        this.internalCurrencyUnitPrice = internalCurrencyUnitPrice;
        this.internalCurrencyUnitDiscount = internalCurrencyUnitDiscount;
        this.internalCurrencyLineDiscount = internalCurrencyLineDiscount;
    }


    /**
     * Gets the averageCost value for this QuoteItem.
     * 
     * @return averageCost
     */
    public java.lang.Object getAverageCost() {
        return averageCost;
    }


    /**
     * Sets the averageCost value for this QuoteItem.
     * 
     * @param averageCost
     */
    public void setAverageCost(java.lang.Object averageCost) {
        this.averageCost = averageCost;
    }


    /**
     * Gets the costID value for this QuoteItem.
     * 
     * @return costID
     */
    public java.lang.Object getCostID() {
        return costID;
    }


    /**
     * Sets the costID value for this QuoteItem.
     * 
     * @param costID
     */
    public void setCostID(java.lang.Object costID) {
        this.costID = costID;
    }


    /**
     * Gets the description value for this QuoteItem.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this QuoteItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the expenseID value for this QuoteItem.
     * 
     * @return expenseID
     */
    public java.lang.Object getExpenseID() {
        return expenseID;
    }


    /**
     * Sets the expenseID value for this QuoteItem.
     * 
     * @param expenseID
     */
    public void setExpenseID(java.lang.Object expenseID) {
        this.expenseID = expenseID;
    }


    /**
     * Gets the highestCost value for this QuoteItem.
     * 
     * @return highestCost
     */
    public java.lang.Object getHighestCost() {
        return highestCost;
    }


    /**
     * Sets the highestCost value for this QuoteItem.
     * 
     * @param highestCost
     */
    public void setHighestCost(java.lang.Object highestCost) {
        this.highestCost = highestCost;
    }


    /**
     * Gets the isTaxable value for this QuoteItem.
     * 
     * @return isTaxable
     */
    public java.lang.Object getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this QuoteItem.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Object isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the isOptional value for this QuoteItem.
     * 
     * @return isOptional
     */
    public java.lang.Object getIsOptional() {
        return isOptional;
    }


    /**
     * Sets the isOptional value for this QuoteItem.
     * 
     * @param isOptional
     */
    public void setIsOptional(java.lang.Object isOptional) {
        this.isOptional = isOptional;
    }


    /**
     * Gets the laborID value for this QuoteItem.
     * 
     * @return laborID
     */
    public java.lang.Object getLaborID() {
        return laborID;
    }


    /**
     * Sets the laborID value for this QuoteItem.
     * 
     * @param laborID
     */
    public void setLaborID(java.lang.Object laborID) {
        this.laborID = laborID;
    }


    /**
     * Gets the lineDiscount value for this QuoteItem.
     * 
     * @return lineDiscount
     */
    public java.lang.Object getLineDiscount() {
        return lineDiscount;
    }


    /**
     * Sets the lineDiscount value for this QuoteItem.
     * 
     * @param lineDiscount
     */
    public void setLineDiscount(java.lang.Object lineDiscount) {
        this.lineDiscount = lineDiscount;
    }


    /**
     * Gets the markupRate value for this QuoteItem.
     * 
     * @return markupRate
     */
    public java.lang.Object getMarkupRate() {
        return markupRate;
    }


    /**
     * Sets the markupRate value for this QuoteItem.
     * 
     * @param markupRate
     */
    public void setMarkupRate(java.lang.Object markupRate) {
        this.markupRate = markupRate;
    }


    /**
     * Gets the name value for this QuoteItem.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this QuoteItem.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the percentageDiscount value for this QuoteItem.
     * 
     * @return percentageDiscount
     */
    public java.lang.Object getPercentageDiscount() {
        return percentageDiscount;
    }


    /**
     * Sets the percentageDiscount value for this QuoteItem.
     * 
     * @param percentageDiscount
     */
    public void setPercentageDiscount(java.lang.Object percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }


    /**
     * Gets the periodType value for this QuoteItem.
     * 
     * @return periodType
     */
    public java.lang.Object getPeriodType() {
        return periodType;
    }


    /**
     * Sets the periodType value for this QuoteItem.
     * 
     * @param periodType
     */
    public void setPeriodType(java.lang.Object periodType) {
        this.periodType = periodType;
    }


    /**
     * Gets the productID value for this QuoteItem.
     * 
     * @return productID
     */
    public java.lang.Object getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this QuoteItem.
     * 
     * @param productID
     */
    public void setProductID(java.lang.Object productID) {
        this.productID = productID;
    }


    /**
     * Gets the quantity value for this QuoteItem.
     * 
     * @return quantity
     */
    public java.lang.Object getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this QuoteItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Object quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the quoteID value for this QuoteItem.
     * 
     * @return quoteID
     */
    public java.lang.Object getQuoteID() {
        return quoteID;
    }


    /**
     * Sets the quoteID value for this QuoteItem.
     * 
     * @param quoteID
     */
    public void setQuoteID(java.lang.Object quoteID) {
        this.quoteID = quoteID;
    }


    /**
     * Gets the serviceID value for this QuoteItem.
     * 
     * @return serviceID
     */
    public java.lang.Object getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this QuoteItem.
     * 
     * @param serviceID
     */
    public void setServiceID(java.lang.Object serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the serviceBundleID value for this QuoteItem.
     * 
     * @return serviceBundleID
     */
    public java.lang.Object getServiceBundleID() {
        return serviceBundleID;
    }


    /**
     * Sets the serviceBundleID value for this QuoteItem.
     * 
     * @param serviceBundleID
     */
    public void setServiceBundleID(java.lang.Object serviceBundleID) {
        this.serviceBundleID = serviceBundleID;
    }


    /**
     * Gets the shippingID value for this QuoteItem.
     * 
     * @return shippingID
     */
    public java.lang.Object getShippingID() {
        return shippingID;
    }


    /**
     * Sets the shippingID value for this QuoteItem.
     * 
     * @param shippingID
     */
    public void setShippingID(java.lang.Object shippingID) {
        this.shippingID = shippingID;
    }


    /**
     * Gets the taxCategoryID value for this QuoteItem.
     * 
     * @return taxCategoryID
     */
    public java.lang.Object getTaxCategoryID() {
        return taxCategoryID;
    }


    /**
     * Sets the taxCategoryID value for this QuoteItem.
     * 
     * @param taxCategoryID
     */
    public void setTaxCategoryID(java.lang.Object taxCategoryID) {
        this.taxCategoryID = taxCategoryID;
    }


    /**
     * Gets the totalEffectiveTax value for this QuoteItem.
     * 
     * @return totalEffectiveTax
     */
    public java.lang.Object getTotalEffectiveTax() {
        return totalEffectiveTax;
    }


    /**
     * Sets the totalEffectiveTax value for this QuoteItem.
     * 
     * @param totalEffectiveTax
     */
    public void setTotalEffectiveTax(java.lang.Object totalEffectiveTax) {
        this.totalEffectiveTax = totalEffectiveTax;
    }


    /**
     * Gets the type value for this QuoteItem.
     * 
     * @return type
     */
    public java.lang.Object getType() {
        return type;
    }


    /**
     * Sets the type value for this QuoteItem.
     * 
     * @param type
     */
    public void setType(java.lang.Object type) {
        this.type = type;
    }


    /**
     * Gets the unitCost value for this QuoteItem.
     * 
     * @return unitCost
     */
    public java.lang.Object getUnitCost() {
        return unitCost;
    }


    /**
     * Sets the unitCost value for this QuoteItem.
     * 
     * @param unitCost
     */
    public void setUnitCost(java.lang.Object unitCost) {
        this.unitCost = unitCost;
    }


    /**
     * Gets the unitDiscount value for this QuoteItem.
     * 
     * @return unitDiscount
     */
    public java.lang.Object getUnitDiscount() {
        return unitDiscount;
    }


    /**
     * Sets the unitDiscount value for this QuoteItem.
     * 
     * @param unitDiscount
     */
    public void setUnitDiscount(java.lang.Object unitDiscount) {
        this.unitDiscount = unitDiscount;
    }


    /**
     * Gets the unitPrice value for this QuoteItem.
     * 
     * @return unitPrice
     */
    public java.lang.Object getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this QuoteItem.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.lang.Object unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the internalCurrencyUnitPrice value for this QuoteItem.
     * 
     * @return internalCurrencyUnitPrice
     */
    public java.lang.Object getInternalCurrencyUnitPrice() {
        return internalCurrencyUnitPrice;
    }


    /**
     * Sets the internalCurrencyUnitPrice value for this QuoteItem.
     * 
     * @param internalCurrencyUnitPrice
     */
    public void setInternalCurrencyUnitPrice(java.lang.Object internalCurrencyUnitPrice) {
        this.internalCurrencyUnitPrice = internalCurrencyUnitPrice;
    }


    /**
     * Gets the internalCurrencyUnitDiscount value for this QuoteItem.
     * 
     * @return internalCurrencyUnitDiscount
     */
    public java.lang.Object getInternalCurrencyUnitDiscount() {
        return internalCurrencyUnitDiscount;
    }


    /**
     * Sets the internalCurrencyUnitDiscount value for this QuoteItem.
     * 
     * @param internalCurrencyUnitDiscount
     */
    public void setInternalCurrencyUnitDiscount(java.lang.Object internalCurrencyUnitDiscount) {
        this.internalCurrencyUnitDiscount = internalCurrencyUnitDiscount;
    }


    /**
     * Gets the internalCurrencyLineDiscount value for this QuoteItem.
     * 
     * @return internalCurrencyLineDiscount
     */
    public java.lang.Object getInternalCurrencyLineDiscount() {
        return internalCurrencyLineDiscount;
    }


    /**
     * Sets the internalCurrencyLineDiscount value for this QuoteItem.
     * 
     * @param internalCurrencyLineDiscount
     */
    public void setInternalCurrencyLineDiscount(java.lang.Object internalCurrencyLineDiscount) {
        this.internalCurrencyLineDiscount = internalCurrencyLineDiscount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuoteItem)) return false;
        QuoteItem other = (QuoteItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.averageCost==null && other.getAverageCost()==null) || 
             (this.averageCost!=null &&
              this.averageCost.equals(other.getAverageCost()))) &&
            ((this.costID==null && other.getCostID()==null) || 
             (this.costID!=null &&
              this.costID.equals(other.getCostID()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.expenseID==null && other.getExpenseID()==null) || 
             (this.expenseID!=null &&
              this.expenseID.equals(other.getExpenseID()))) &&
            ((this.highestCost==null && other.getHighestCost()==null) || 
             (this.highestCost!=null &&
              this.highestCost.equals(other.getHighestCost()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.isOptional==null && other.getIsOptional()==null) || 
             (this.isOptional!=null &&
              this.isOptional.equals(other.getIsOptional()))) &&
            ((this.laborID==null && other.getLaborID()==null) || 
             (this.laborID!=null &&
              this.laborID.equals(other.getLaborID()))) &&
            ((this.lineDiscount==null && other.getLineDiscount()==null) || 
             (this.lineDiscount!=null &&
              this.lineDiscount.equals(other.getLineDiscount()))) &&
            ((this.markupRate==null && other.getMarkupRate()==null) || 
             (this.markupRate!=null &&
              this.markupRate.equals(other.getMarkupRate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.percentageDiscount==null && other.getPercentageDiscount()==null) || 
             (this.percentageDiscount!=null &&
              this.percentageDiscount.equals(other.getPercentageDiscount()))) &&
            ((this.periodType==null && other.getPeriodType()==null) || 
             (this.periodType!=null &&
              this.periodType.equals(other.getPeriodType()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.quoteID==null && other.getQuoteID()==null) || 
             (this.quoteID!=null &&
              this.quoteID.equals(other.getQuoteID()))) &&
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.serviceBundleID==null && other.getServiceBundleID()==null) || 
             (this.serviceBundleID!=null &&
              this.serviceBundleID.equals(other.getServiceBundleID()))) &&
            ((this.shippingID==null && other.getShippingID()==null) || 
             (this.shippingID!=null &&
              this.shippingID.equals(other.getShippingID()))) &&
            ((this.taxCategoryID==null && other.getTaxCategoryID()==null) || 
             (this.taxCategoryID!=null &&
              this.taxCategoryID.equals(other.getTaxCategoryID()))) &&
            ((this.totalEffectiveTax==null && other.getTotalEffectiveTax()==null) || 
             (this.totalEffectiveTax!=null &&
              this.totalEffectiveTax.equals(other.getTotalEffectiveTax()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.unitCost==null && other.getUnitCost()==null) || 
             (this.unitCost!=null &&
              this.unitCost.equals(other.getUnitCost()))) &&
            ((this.unitDiscount==null && other.getUnitDiscount()==null) || 
             (this.unitDiscount!=null &&
              this.unitDiscount.equals(other.getUnitDiscount()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.internalCurrencyUnitPrice==null && other.getInternalCurrencyUnitPrice()==null) || 
             (this.internalCurrencyUnitPrice!=null &&
              this.internalCurrencyUnitPrice.equals(other.getInternalCurrencyUnitPrice()))) &&
            ((this.internalCurrencyUnitDiscount==null && other.getInternalCurrencyUnitDiscount()==null) || 
             (this.internalCurrencyUnitDiscount!=null &&
              this.internalCurrencyUnitDiscount.equals(other.getInternalCurrencyUnitDiscount()))) &&
            ((this.internalCurrencyLineDiscount==null && other.getInternalCurrencyLineDiscount()==null) || 
             (this.internalCurrencyLineDiscount!=null &&
              this.internalCurrencyLineDiscount.equals(other.getInternalCurrencyLineDiscount())));
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
        if (getAverageCost() != null) {
            _hashCode += getAverageCost().hashCode();
        }
        if (getCostID() != null) {
            _hashCode += getCostID().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExpenseID() != null) {
            _hashCode += getExpenseID().hashCode();
        }
        if (getHighestCost() != null) {
            _hashCode += getHighestCost().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getIsOptional() != null) {
            _hashCode += getIsOptional().hashCode();
        }
        if (getLaborID() != null) {
            _hashCode += getLaborID().hashCode();
        }
        if (getLineDiscount() != null) {
            _hashCode += getLineDiscount().hashCode();
        }
        if (getMarkupRate() != null) {
            _hashCode += getMarkupRate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPercentageDiscount() != null) {
            _hashCode += getPercentageDiscount().hashCode();
        }
        if (getPeriodType() != null) {
            _hashCode += getPeriodType().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getQuoteID() != null) {
            _hashCode += getQuoteID().hashCode();
        }
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getServiceBundleID() != null) {
            _hashCode += getServiceBundleID().hashCode();
        }
        if (getShippingID() != null) {
            _hashCode += getShippingID().hashCode();
        }
        if (getTaxCategoryID() != null) {
            _hashCode += getTaxCategoryID().hashCode();
        }
        if (getTotalEffectiveTax() != null) {
            _hashCode += getTotalEffectiveTax().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUnitCost() != null) {
            _hashCode += getUnitCost().hashCode();
        }
        if (getUnitDiscount() != null) {
            _hashCode += getUnitDiscount().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getInternalCurrencyUnitPrice() != null) {
            _hashCode += getInternalCurrencyUnitPrice().hashCode();
        }
        if (getInternalCurrencyUnitDiscount() != null) {
            _hashCode += getInternalCurrencyUnitDiscount().hashCode();
        }
        if (getInternalCurrencyLineDiscount() != null) {
            _hashCode += getInternalCurrencyLineDiscount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuoteItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuoteItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AverageCost"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpenseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HighestCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOptional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsOptional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LaborID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LineDiscount"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentageDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PercentageDiscount"));
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
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProductID"));
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
        elemField.setFieldName("quoteID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuoteID"));
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
        elemField.setFieldName("serviceBundleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceBundleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShippingID"));
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
        elemField.setFieldName("totalEffectiveTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TotalEffectiveTax"));
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
        elemField.setFieldName("unitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UnitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UnitDiscount"));
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
        elemField.setFieldName("internalCurrencyUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyUnitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyUnitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCurrencyLineDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalCurrencyLineDiscount"));
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
