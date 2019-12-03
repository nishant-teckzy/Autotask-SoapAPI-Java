/**
 * InvoiceTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class InvoiceTemplate  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object displayTaxCategory;

    private java.lang.Object displayTaxCategorySuperscripts;

    private java.lang.Object displaySeparateLineItemForEachTax;

    private java.lang.Object groupBy;

    private java.lang.Object itemizeItemsInEachGroup;

    private java.lang.Object sortBy;

    private java.lang.Object itemizeServicesAndBundles;

    private java.lang.Object displayZeroAmountRecurringServicesAndBundles;

    private java.lang.Object displayRecurringServiceContractLabor;

    private java.lang.Object displayFixedPriceContractLabor;

    private java.lang.Object rateCostExpression;

    private java.lang.Object coveredByRecurringServiceFixedPricePerTicketContractLabel;

    private java.lang.Object coveredByBlockRetainerContractLabel;

    private java.lang.Object nonBillableLaborLabel;

    private java.lang.Object pageLayout;

    private java.lang.Object paymentTerms;

    private java.lang.Object pageNumberFormat;

    private java.lang.Object dateFormat;

    private java.lang.Object numberFormat;

    private java.lang.Object timeFormat;

    private java.lang.Object name;

    private java.lang.Object showGridHeader;

    private java.lang.Object showVerticalGridLines;

    private java.lang.Object currencyPositiveFormat;

    private java.lang.Object currencyNegativeFormat;

    public InvoiceTemplate() {
    }

    public InvoiceTemplate(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object displayTaxCategory,
           java.lang.Object displayTaxCategorySuperscripts,
           java.lang.Object displaySeparateLineItemForEachTax,
           java.lang.Object groupBy,
           java.lang.Object itemizeItemsInEachGroup,
           java.lang.Object sortBy,
           java.lang.Object itemizeServicesAndBundles,
           java.lang.Object displayZeroAmountRecurringServicesAndBundles,
           java.lang.Object displayRecurringServiceContractLabor,
           java.lang.Object displayFixedPriceContractLabor,
           java.lang.Object rateCostExpression,
           java.lang.Object coveredByRecurringServiceFixedPricePerTicketContractLabel,
           java.lang.Object coveredByBlockRetainerContractLabel,
           java.lang.Object nonBillableLaborLabel,
           java.lang.Object pageLayout,
           java.lang.Object paymentTerms,
           java.lang.Object pageNumberFormat,
           java.lang.Object dateFormat,
           java.lang.Object numberFormat,
           java.lang.Object timeFormat,
           java.lang.Object name,
           java.lang.Object showGridHeader,
           java.lang.Object showVerticalGridLines,
           java.lang.Object currencyPositiveFormat,
           java.lang.Object currencyNegativeFormat) {
        super(
            fields,
            id,
            userDefinedFields);
        this.displayTaxCategory = displayTaxCategory;
        this.displayTaxCategorySuperscripts = displayTaxCategorySuperscripts;
        this.displaySeparateLineItemForEachTax = displaySeparateLineItemForEachTax;
        this.groupBy = groupBy;
        this.itemizeItemsInEachGroup = itemizeItemsInEachGroup;
        this.sortBy = sortBy;
        this.itemizeServicesAndBundles = itemizeServicesAndBundles;
        this.displayZeroAmountRecurringServicesAndBundles = displayZeroAmountRecurringServicesAndBundles;
        this.displayRecurringServiceContractLabor = displayRecurringServiceContractLabor;
        this.displayFixedPriceContractLabor = displayFixedPriceContractLabor;
        this.rateCostExpression = rateCostExpression;
        this.coveredByRecurringServiceFixedPricePerTicketContractLabel = coveredByRecurringServiceFixedPricePerTicketContractLabel;
        this.coveredByBlockRetainerContractLabel = coveredByBlockRetainerContractLabel;
        this.nonBillableLaborLabel = nonBillableLaborLabel;
        this.pageLayout = pageLayout;
        this.paymentTerms = paymentTerms;
        this.pageNumberFormat = pageNumberFormat;
        this.dateFormat = dateFormat;
        this.numberFormat = numberFormat;
        this.timeFormat = timeFormat;
        this.name = name;
        this.showGridHeader = showGridHeader;
        this.showVerticalGridLines = showVerticalGridLines;
        this.currencyPositiveFormat = currencyPositiveFormat;
        this.currencyNegativeFormat = currencyNegativeFormat;
    }


    /**
     * Gets the displayTaxCategory value for this InvoiceTemplate.
     * 
     * @return displayTaxCategory
     */
    public java.lang.Object getDisplayTaxCategory() {
        return displayTaxCategory;
    }


    /**
     * Sets the displayTaxCategory value for this InvoiceTemplate.
     * 
     * @param displayTaxCategory
     */
    public void setDisplayTaxCategory(java.lang.Object displayTaxCategory) {
        this.displayTaxCategory = displayTaxCategory;
    }


    /**
     * Gets the displayTaxCategorySuperscripts value for this InvoiceTemplate.
     * 
     * @return displayTaxCategorySuperscripts
     */
    public java.lang.Object getDisplayTaxCategorySuperscripts() {
        return displayTaxCategorySuperscripts;
    }


    /**
     * Sets the displayTaxCategorySuperscripts value for this InvoiceTemplate.
     * 
     * @param displayTaxCategorySuperscripts
     */
    public void setDisplayTaxCategorySuperscripts(java.lang.Object displayTaxCategorySuperscripts) {
        this.displayTaxCategorySuperscripts = displayTaxCategorySuperscripts;
    }


    /**
     * Gets the displaySeparateLineItemForEachTax value for this InvoiceTemplate.
     * 
     * @return displaySeparateLineItemForEachTax
     */
    public java.lang.Object getDisplaySeparateLineItemForEachTax() {
        return displaySeparateLineItemForEachTax;
    }


    /**
     * Sets the displaySeparateLineItemForEachTax value for this InvoiceTemplate.
     * 
     * @param displaySeparateLineItemForEachTax
     */
    public void setDisplaySeparateLineItemForEachTax(java.lang.Object displaySeparateLineItemForEachTax) {
        this.displaySeparateLineItemForEachTax = displaySeparateLineItemForEachTax;
    }


    /**
     * Gets the groupBy value for this InvoiceTemplate.
     * 
     * @return groupBy
     */
    public java.lang.Object getGroupBy() {
        return groupBy;
    }


    /**
     * Sets the groupBy value for this InvoiceTemplate.
     * 
     * @param groupBy
     */
    public void setGroupBy(java.lang.Object groupBy) {
        this.groupBy = groupBy;
    }


    /**
     * Gets the itemizeItemsInEachGroup value for this InvoiceTemplate.
     * 
     * @return itemizeItemsInEachGroup
     */
    public java.lang.Object getItemizeItemsInEachGroup() {
        return itemizeItemsInEachGroup;
    }


    /**
     * Sets the itemizeItemsInEachGroup value for this InvoiceTemplate.
     * 
     * @param itemizeItemsInEachGroup
     */
    public void setItemizeItemsInEachGroup(java.lang.Object itemizeItemsInEachGroup) {
        this.itemizeItemsInEachGroup = itemizeItemsInEachGroup;
    }


    /**
     * Gets the sortBy value for this InvoiceTemplate.
     * 
     * @return sortBy
     */
    public java.lang.Object getSortBy() {
        return sortBy;
    }


    /**
     * Sets the sortBy value for this InvoiceTemplate.
     * 
     * @param sortBy
     */
    public void setSortBy(java.lang.Object sortBy) {
        this.sortBy = sortBy;
    }


    /**
     * Gets the itemizeServicesAndBundles value for this InvoiceTemplate.
     * 
     * @return itemizeServicesAndBundles
     */
    public java.lang.Object getItemizeServicesAndBundles() {
        return itemizeServicesAndBundles;
    }


    /**
     * Sets the itemizeServicesAndBundles value for this InvoiceTemplate.
     * 
     * @param itemizeServicesAndBundles
     */
    public void setItemizeServicesAndBundles(java.lang.Object itemizeServicesAndBundles) {
        this.itemizeServicesAndBundles = itemizeServicesAndBundles;
    }


    /**
     * Gets the displayZeroAmountRecurringServicesAndBundles value for this InvoiceTemplate.
     * 
     * @return displayZeroAmountRecurringServicesAndBundles
     */
    public java.lang.Object getDisplayZeroAmountRecurringServicesAndBundles() {
        return displayZeroAmountRecurringServicesAndBundles;
    }


    /**
     * Sets the displayZeroAmountRecurringServicesAndBundles value for this InvoiceTemplate.
     * 
     * @param displayZeroAmountRecurringServicesAndBundles
     */
    public void setDisplayZeroAmountRecurringServicesAndBundles(java.lang.Object displayZeroAmountRecurringServicesAndBundles) {
        this.displayZeroAmountRecurringServicesAndBundles = displayZeroAmountRecurringServicesAndBundles;
    }


    /**
     * Gets the displayRecurringServiceContractLabor value for this InvoiceTemplate.
     * 
     * @return displayRecurringServiceContractLabor
     */
    public java.lang.Object getDisplayRecurringServiceContractLabor() {
        return displayRecurringServiceContractLabor;
    }


    /**
     * Sets the displayRecurringServiceContractLabor value for this InvoiceTemplate.
     * 
     * @param displayRecurringServiceContractLabor
     */
    public void setDisplayRecurringServiceContractLabor(java.lang.Object displayRecurringServiceContractLabor) {
        this.displayRecurringServiceContractLabor = displayRecurringServiceContractLabor;
    }


    /**
     * Gets the displayFixedPriceContractLabor value for this InvoiceTemplate.
     * 
     * @return displayFixedPriceContractLabor
     */
    public java.lang.Object getDisplayFixedPriceContractLabor() {
        return displayFixedPriceContractLabor;
    }


    /**
     * Sets the displayFixedPriceContractLabor value for this InvoiceTemplate.
     * 
     * @param displayFixedPriceContractLabor
     */
    public void setDisplayFixedPriceContractLabor(java.lang.Object displayFixedPriceContractLabor) {
        this.displayFixedPriceContractLabor = displayFixedPriceContractLabor;
    }


    /**
     * Gets the rateCostExpression value for this InvoiceTemplate.
     * 
     * @return rateCostExpression
     */
    public java.lang.Object getRateCostExpression() {
        return rateCostExpression;
    }


    /**
     * Sets the rateCostExpression value for this InvoiceTemplate.
     * 
     * @param rateCostExpression
     */
    public void setRateCostExpression(java.lang.Object rateCostExpression) {
        this.rateCostExpression = rateCostExpression;
    }


    /**
     * Gets the coveredByRecurringServiceFixedPricePerTicketContractLabel value for this InvoiceTemplate.
     * 
     * @return coveredByRecurringServiceFixedPricePerTicketContractLabel
     */
    public java.lang.Object getCoveredByRecurringServiceFixedPricePerTicketContractLabel() {
        return coveredByRecurringServiceFixedPricePerTicketContractLabel;
    }


    /**
     * Sets the coveredByRecurringServiceFixedPricePerTicketContractLabel value for this InvoiceTemplate.
     * 
     * @param coveredByRecurringServiceFixedPricePerTicketContractLabel
     */
    public void setCoveredByRecurringServiceFixedPricePerTicketContractLabel(java.lang.Object coveredByRecurringServiceFixedPricePerTicketContractLabel) {
        this.coveredByRecurringServiceFixedPricePerTicketContractLabel = coveredByRecurringServiceFixedPricePerTicketContractLabel;
    }


    /**
     * Gets the coveredByBlockRetainerContractLabel value for this InvoiceTemplate.
     * 
     * @return coveredByBlockRetainerContractLabel
     */
    public java.lang.Object getCoveredByBlockRetainerContractLabel() {
        return coveredByBlockRetainerContractLabel;
    }


    /**
     * Sets the coveredByBlockRetainerContractLabel value for this InvoiceTemplate.
     * 
     * @param coveredByBlockRetainerContractLabel
     */
    public void setCoveredByBlockRetainerContractLabel(java.lang.Object coveredByBlockRetainerContractLabel) {
        this.coveredByBlockRetainerContractLabel = coveredByBlockRetainerContractLabel;
    }


    /**
     * Gets the nonBillableLaborLabel value for this InvoiceTemplate.
     * 
     * @return nonBillableLaborLabel
     */
    public java.lang.Object getNonBillableLaborLabel() {
        return nonBillableLaborLabel;
    }


    /**
     * Sets the nonBillableLaborLabel value for this InvoiceTemplate.
     * 
     * @param nonBillableLaborLabel
     */
    public void setNonBillableLaborLabel(java.lang.Object nonBillableLaborLabel) {
        this.nonBillableLaborLabel = nonBillableLaborLabel;
    }


    /**
     * Gets the pageLayout value for this InvoiceTemplate.
     * 
     * @return pageLayout
     */
    public java.lang.Object getPageLayout() {
        return pageLayout;
    }


    /**
     * Sets the pageLayout value for this InvoiceTemplate.
     * 
     * @param pageLayout
     */
    public void setPageLayout(java.lang.Object pageLayout) {
        this.pageLayout = pageLayout;
    }


    /**
     * Gets the paymentTerms value for this InvoiceTemplate.
     * 
     * @return paymentTerms
     */
    public java.lang.Object getPaymentTerms() {
        return paymentTerms;
    }


    /**
     * Sets the paymentTerms value for this InvoiceTemplate.
     * 
     * @param paymentTerms
     */
    public void setPaymentTerms(java.lang.Object paymentTerms) {
        this.paymentTerms = paymentTerms;
    }


    /**
     * Gets the pageNumberFormat value for this InvoiceTemplate.
     * 
     * @return pageNumberFormat
     */
    public java.lang.Object getPageNumberFormat() {
        return pageNumberFormat;
    }


    /**
     * Sets the pageNumberFormat value for this InvoiceTemplate.
     * 
     * @param pageNumberFormat
     */
    public void setPageNumberFormat(java.lang.Object pageNumberFormat) {
        this.pageNumberFormat = pageNumberFormat;
    }


    /**
     * Gets the dateFormat value for this InvoiceTemplate.
     * 
     * @return dateFormat
     */
    public java.lang.Object getDateFormat() {
        return dateFormat;
    }


    /**
     * Sets the dateFormat value for this InvoiceTemplate.
     * 
     * @param dateFormat
     */
    public void setDateFormat(java.lang.Object dateFormat) {
        this.dateFormat = dateFormat;
    }


    /**
     * Gets the numberFormat value for this InvoiceTemplate.
     * 
     * @return numberFormat
     */
    public java.lang.Object getNumberFormat() {
        return numberFormat;
    }


    /**
     * Sets the numberFormat value for this InvoiceTemplate.
     * 
     * @param numberFormat
     */
    public void setNumberFormat(java.lang.Object numberFormat) {
        this.numberFormat = numberFormat;
    }


    /**
     * Gets the timeFormat value for this InvoiceTemplate.
     * 
     * @return timeFormat
     */
    public java.lang.Object getTimeFormat() {
        return timeFormat;
    }


    /**
     * Sets the timeFormat value for this InvoiceTemplate.
     * 
     * @param timeFormat
     */
    public void setTimeFormat(java.lang.Object timeFormat) {
        this.timeFormat = timeFormat;
    }


    /**
     * Gets the name value for this InvoiceTemplate.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this InvoiceTemplate.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the showGridHeader value for this InvoiceTemplate.
     * 
     * @return showGridHeader
     */
    public java.lang.Object getShowGridHeader() {
        return showGridHeader;
    }


    /**
     * Sets the showGridHeader value for this InvoiceTemplate.
     * 
     * @param showGridHeader
     */
    public void setShowGridHeader(java.lang.Object showGridHeader) {
        this.showGridHeader = showGridHeader;
    }


    /**
     * Gets the showVerticalGridLines value for this InvoiceTemplate.
     * 
     * @return showVerticalGridLines
     */
    public java.lang.Object getShowVerticalGridLines() {
        return showVerticalGridLines;
    }


    /**
     * Sets the showVerticalGridLines value for this InvoiceTemplate.
     * 
     * @param showVerticalGridLines
     */
    public void setShowVerticalGridLines(java.lang.Object showVerticalGridLines) {
        this.showVerticalGridLines = showVerticalGridLines;
    }


    /**
     * Gets the currencyPositiveFormat value for this InvoiceTemplate.
     * 
     * @return currencyPositiveFormat
     */
    public java.lang.Object getCurrencyPositiveFormat() {
        return currencyPositiveFormat;
    }


    /**
     * Sets the currencyPositiveFormat value for this InvoiceTemplate.
     * 
     * @param currencyPositiveFormat
     */
    public void setCurrencyPositiveFormat(java.lang.Object currencyPositiveFormat) {
        this.currencyPositiveFormat = currencyPositiveFormat;
    }


    /**
     * Gets the currencyNegativeFormat value for this InvoiceTemplate.
     * 
     * @return currencyNegativeFormat
     */
    public java.lang.Object getCurrencyNegativeFormat() {
        return currencyNegativeFormat;
    }


    /**
     * Sets the currencyNegativeFormat value for this InvoiceTemplate.
     * 
     * @param currencyNegativeFormat
     */
    public void setCurrencyNegativeFormat(java.lang.Object currencyNegativeFormat) {
        this.currencyNegativeFormat = currencyNegativeFormat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceTemplate)) return false;
        InvoiceTemplate other = (InvoiceTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.displayTaxCategory==null && other.getDisplayTaxCategory()==null) || 
             (this.displayTaxCategory!=null &&
              this.displayTaxCategory.equals(other.getDisplayTaxCategory()))) &&
            ((this.displayTaxCategorySuperscripts==null && other.getDisplayTaxCategorySuperscripts()==null) || 
             (this.displayTaxCategorySuperscripts!=null &&
              this.displayTaxCategorySuperscripts.equals(other.getDisplayTaxCategorySuperscripts()))) &&
            ((this.displaySeparateLineItemForEachTax==null && other.getDisplaySeparateLineItemForEachTax()==null) || 
             (this.displaySeparateLineItemForEachTax!=null &&
              this.displaySeparateLineItemForEachTax.equals(other.getDisplaySeparateLineItemForEachTax()))) &&
            ((this.groupBy==null && other.getGroupBy()==null) || 
             (this.groupBy!=null &&
              this.groupBy.equals(other.getGroupBy()))) &&
            ((this.itemizeItemsInEachGroup==null && other.getItemizeItemsInEachGroup()==null) || 
             (this.itemizeItemsInEachGroup!=null &&
              this.itemizeItemsInEachGroup.equals(other.getItemizeItemsInEachGroup()))) &&
            ((this.sortBy==null && other.getSortBy()==null) || 
             (this.sortBy!=null &&
              this.sortBy.equals(other.getSortBy()))) &&
            ((this.itemizeServicesAndBundles==null && other.getItemizeServicesAndBundles()==null) || 
             (this.itemizeServicesAndBundles!=null &&
              this.itemizeServicesAndBundles.equals(other.getItemizeServicesAndBundles()))) &&
            ((this.displayZeroAmountRecurringServicesAndBundles==null && other.getDisplayZeroAmountRecurringServicesAndBundles()==null) || 
             (this.displayZeroAmountRecurringServicesAndBundles!=null &&
              this.displayZeroAmountRecurringServicesAndBundles.equals(other.getDisplayZeroAmountRecurringServicesAndBundles()))) &&
            ((this.displayRecurringServiceContractLabor==null && other.getDisplayRecurringServiceContractLabor()==null) || 
             (this.displayRecurringServiceContractLabor!=null &&
              this.displayRecurringServiceContractLabor.equals(other.getDisplayRecurringServiceContractLabor()))) &&
            ((this.displayFixedPriceContractLabor==null && other.getDisplayFixedPriceContractLabor()==null) || 
             (this.displayFixedPriceContractLabor!=null &&
              this.displayFixedPriceContractLabor.equals(other.getDisplayFixedPriceContractLabor()))) &&
            ((this.rateCostExpression==null && other.getRateCostExpression()==null) || 
             (this.rateCostExpression!=null &&
              this.rateCostExpression.equals(other.getRateCostExpression()))) &&
            ((this.coveredByRecurringServiceFixedPricePerTicketContractLabel==null && other.getCoveredByRecurringServiceFixedPricePerTicketContractLabel()==null) || 
             (this.coveredByRecurringServiceFixedPricePerTicketContractLabel!=null &&
              this.coveredByRecurringServiceFixedPricePerTicketContractLabel.equals(other.getCoveredByRecurringServiceFixedPricePerTicketContractLabel()))) &&
            ((this.coveredByBlockRetainerContractLabel==null && other.getCoveredByBlockRetainerContractLabel()==null) || 
             (this.coveredByBlockRetainerContractLabel!=null &&
              this.coveredByBlockRetainerContractLabel.equals(other.getCoveredByBlockRetainerContractLabel()))) &&
            ((this.nonBillableLaborLabel==null && other.getNonBillableLaborLabel()==null) || 
             (this.nonBillableLaborLabel!=null &&
              this.nonBillableLaborLabel.equals(other.getNonBillableLaborLabel()))) &&
            ((this.pageLayout==null && other.getPageLayout()==null) || 
             (this.pageLayout!=null &&
              this.pageLayout.equals(other.getPageLayout()))) &&
            ((this.paymentTerms==null && other.getPaymentTerms()==null) || 
             (this.paymentTerms!=null &&
              this.paymentTerms.equals(other.getPaymentTerms()))) &&
            ((this.pageNumberFormat==null && other.getPageNumberFormat()==null) || 
             (this.pageNumberFormat!=null &&
              this.pageNumberFormat.equals(other.getPageNumberFormat()))) &&
            ((this.dateFormat==null && other.getDateFormat()==null) || 
             (this.dateFormat!=null &&
              this.dateFormat.equals(other.getDateFormat()))) &&
            ((this.numberFormat==null && other.getNumberFormat()==null) || 
             (this.numberFormat!=null &&
              this.numberFormat.equals(other.getNumberFormat()))) &&
            ((this.timeFormat==null && other.getTimeFormat()==null) || 
             (this.timeFormat!=null &&
              this.timeFormat.equals(other.getTimeFormat()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.showGridHeader==null && other.getShowGridHeader()==null) || 
             (this.showGridHeader!=null &&
              this.showGridHeader.equals(other.getShowGridHeader()))) &&
            ((this.showVerticalGridLines==null && other.getShowVerticalGridLines()==null) || 
             (this.showVerticalGridLines!=null &&
              this.showVerticalGridLines.equals(other.getShowVerticalGridLines()))) &&
            ((this.currencyPositiveFormat==null && other.getCurrencyPositiveFormat()==null) || 
             (this.currencyPositiveFormat!=null &&
              this.currencyPositiveFormat.equals(other.getCurrencyPositiveFormat()))) &&
            ((this.currencyNegativeFormat==null && other.getCurrencyNegativeFormat()==null) || 
             (this.currencyNegativeFormat!=null &&
              this.currencyNegativeFormat.equals(other.getCurrencyNegativeFormat())));
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
        if (getDisplayTaxCategory() != null) {
            _hashCode += getDisplayTaxCategory().hashCode();
        }
        if (getDisplayTaxCategorySuperscripts() != null) {
            _hashCode += getDisplayTaxCategorySuperscripts().hashCode();
        }
        if (getDisplaySeparateLineItemForEachTax() != null) {
            _hashCode += getDisplaySeparateLineItemForEachTax().hashCode();
        }
        if (getGroupBy() != null) {
            _hashCode += getGroupBy().hashCode();
        }
        if (getItemizeItemsInEachGroup() != null) {
            _hashCode += getItemizeItemsInEachGroup().hashCode();
        }
        if (getSortBy() != null) {
            _hashCode += getSortBy().hashCode();
        }
        if (getItemizeServicesAndBundles() != null) {
            _hashCode += getItemizeServicesAndBundles().hashCode();
        }
        if (getDisplayZeroAmountRecurringServicesAndBundles() != null) {
            _hashCode += getDisplayZeroAmountRecurringServicesAndBundles().hashCode();
        }
        if (getDisplayRecurringServiceContractLabor() != null) {
            _hashCode += getDisplayRecurringServiceContractLabor().hashCode();
        }
        if (getDisplayFixedPriceContractLabor() != null) {
            _hashCode += getDisplayFixedPriceContractLabor().hashCode();
        }
        if (getRateCostExpression() != null) {
            _hashCode += getRateCostExpression().hashCode();
        }
        if (getCoveredByRecurringServiceFixedPricePerTicketContractLabel() != null) {
            _hashCode += getCoveredByRecurringServiceFixedPricePerTicketContractLabel().hashCode();
        }
        if (getCoveredByBlockRetainerContractLabel() != null) {
            _hashCode += getCoveredByBlockRetainerContractLabel().hashCode();
        }
        if (getNonBillableLaborLabel() != null) {
            _hashCode += getNonBillableLaborLabel().hashCode();
        }
        if (getPageLayout() != null) {
            _hashCode += getPageLayout().hashCode();
        }
        if (getPaymentTerms() != null) {
            _hashCode += getPaymentTerms().hashCode();
        }
        if (getPageNumberFormat() != null) {
            _hashCode += getPageNumberFormat().hashCode();
        }
        if (getDateFormat() != null) {
            _hashCode += getDateFormat().hashCode();
        }
        if (getNumberFormat() != null) {
            _hashCode += getNumberFormat().hashCode();
        }
        if (getTimeFormat() != null) {
            _hashCode += getTimeFormat().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getShowGridHeader() != null) {
            _hashCode += getShowGridHeader().hashCode();
        }
        if (getShowVerticalGridLines() != null) {
            _hashCode += getShowVerticalGridLines().hashCode();
        }
        if (getCurrencyPositiveFormat() != null) {
            _hashCode += getCurrencyPositiveFormat().hashCode();
        }
        if (getCurrencyNegativeFormat() != null) {
            _hashCode += getCurrencyNegativeFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InvoiceTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayTaxCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DisplayTaxCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayTaxCategorySuperscripts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DisplayTaxCategorySuperscripts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displaySeparateLineItemForEachTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DisplaySeparateLineItemForEachTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "GroupBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemizeItemsInEachGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ItemizeItemsInEachGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SortBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemizeServicesAndBundles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ItemizeServicesAndBundles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayZeroAmountRecurringServicesAndBundles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DisplayZeroAmountRecurringServicesAndBundles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayRecurringServiceContractLabor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DisplayRecurringServiceContractLabor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayFixedPriceContractLabor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DisplayFixedPriceContractLabor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCostExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RateCostExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coveredByRecurringServiceFixedPricePerTicketContractLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CoveredByRecurringServiceFixedPricePerTicketContractLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coveredByBlockRetainerContractLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CoveredByBlockRetainerContractLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonBillableLaborLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NonBillableLaborLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PageLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PaymentTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumberFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PageNumberFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DateFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NumberFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TimeFormat"));
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
        elemField.setFieldName("showGridHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShowGridHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showVerticalGridLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShowVerticalGridLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyPositiveFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CurrencyPositiveFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyNegativeFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CurrencyNegativeFormat"));
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
