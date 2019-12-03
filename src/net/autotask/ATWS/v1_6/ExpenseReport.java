/**
 * ExpenseReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ExpenseReport  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object name;

    private java.lang.Object status;

    private java.lang.Object submit;

    private java.lang.Object submitDate;

    private java.lang.Object submitterID;

    private java.lang.Object approverID;

    private java.lang.Object weekEnding;

    private java.lang.Object expenseTotal;

    private java.lang.Object cashAdvanceAmount;

    private java.lang.Object rejectionReason;

    private java.lang.Object amountDue;

    private java.lang.Object departmentNumber;

    private java.lang.Object quickBooksReferenceNumber;

    private java.lang.Object approvedDate;

    private java.lang.Object reimbursementCurrencyID;

    private java.lang.Object reimbursementCurrencyCashAdvanceAmount;

    private java.lang.Object reimbursementCurrencyAmountDue;

    private java.lang.Object businessDivisionSubdivisionID;

    public ExpenseReport() {
    }

    public ExpenseReport(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object name,
           java.lang.Object status,
           java.lang.Object submit,
           java.lang.Object submitDate,
           java.lang.Object submitterID,
           java.lang.Object approverID,
           java.lang.Object weekEnding,
           java.lang.Object expenseTotal,
           java.lang.Object cashAdvanceAmount,
           java.lang.Object rejectionReason,
           java.lang.Object amountDue,
           java.lang.Object departmentNumber,
           java.lang.Object quickBooksReferenceNumber,
           java.lang.Object approvedDate,
           java.lang.Object reimbursementCurrencyID,
           java.lang.Object reimbursementCurrencyCashAdvanceAmount,
           java.lang.Object reimbursementCurrencyAmountDue,
           java.lang.Object businessDivisionSubdivisionID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.name = name;
        this.status = status;
        this.submit = submit;
        this.submitDate = submitDate;
        this.submitterID = submitterID;
        this.approverID = approverID;
        this.weekEnding = weekEnding;
        this.expenseTotal = expenseTotal;
        this.cashAdvanceAmount = cashAdvanceAmount;
        this.rejectionReason = rejectionReason;
        this.amountDue = amountDue;
        this.departmentNumber = departmentNumber;
        this.quickBooksReferenceNumber = quickBooksReferenceNumber;
        this.approvedDate = approvedDate;
        this.reimbursementCurrencyID = reimbursementCurrencyID;
        this.reimbursementCurrencyCashAdvanceAmount = reimbursementCurrencyCashAdvanceAmount;
        this.reimbursementCurrencyAmountDue = reimbursementCurrencyAmountDue;
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }


    /**
     * Gets the name value for this ExpenseReport.
     * 
     * @return name
     */
    public java.lang.Object getName() {
        return name;
    }


    /**
     * Sets the name value for this ExpenseReport.
     * 
     * @param name
     */
    public void setName(java.lang.Object name) {
        this.name = name;
    }


    /**
     * Gets the status value for this ExpenseReport.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ExpenseReport.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the submit value for this ExpenseReport.
     * 
     * @return submit
     */
    public java.lang.Object getSubmit() {
        return submit;
    }


    /**
     * Sets the submit value for this ExpenseReport.
     * 
     * @param submit
     */
    public void setSubmit(java.lang.Object submit) {
        this.submit = submit;
    }


    /**
     * Gets the submitDate value for this ExpenseReport.
     * 
     * @return submitDate
     */
    public java.lang.Object getSubmitDate() {
        return submitDate;
    }


    /**
     * Sets the submitDate value for this ExpenseReport.
     * 
     * @param submitDate
     */
    public void setSubmitDate(java.lang.Object submitDate) {
        this.submitDate = submitDate;
    }


    /**
     * Gets the submitterID value for this ExpenseReport.
     * 
     * @return submitterID
     */
    public java.lang.Object getSubmitterID() {
        return submitterID;
    }


    /**
     * Sets the submitterID value for this ExpenseReport.
     * 
     * @param submitterID
     */
    public void setSubmitterID(java.lang.Object submitterID) {
        this.submitterID = submitterID;
    }


    /**
     * Gets the approverID value for this ExpenseReport.
     * 
     * @return approverID
     */
    public java.lang.Object getApproverID() {
        return approverID;
    }


    /**
     * Sets the approverID value for this ExpenseReport.
     * 
     * @param approverID
     */
    public void setApproverID(java.lang.Object approverID) {
        this.approverID = approverID;
    }


    /**
     * Gets the weekEnding value for this ExpenseReport.
     * 
     * @return weekEnding
     */
    public java.lang.Object getWeekEnding() {
        return weekEnding;
    }


    /**
     * Sets the weekEnding value for this ExpenseReport.
     * 
     * @param weekEnding
     */
    public void setWeekEnding(java.lang.Object weekEnding) {
        this.weekEnding = weekEnding;
    }


    /**
     * Gets the expenseTotal value for this ExpenseReport.
     * 
     * @return expenseTotal
     */
    public java.lang.Object getExpenseTotal() {
        return expenseTotal;
    }


    /**
     * Sets the expenseTotal value for this ExpenseReport.
     * 
     * @param expenseTotal
     */
    public void setExpenseTotal(java.lang.Object expenseTotal) {
        this.expenseTotal = expenseTotal;
    }


    /**
     * Gets the cashAdvanceAmount value for this ExpenseReport.
     * 
     * @return cashAdvanceAmount
     */
    public java.lang.Object getCashAdvanceAmount() {
        return cashAdvanceAmount;
    }


    /**
     * Sets the cashAdvanceAmount value for this ExpenseReport.
     * 
     * @param cashAdvanceAmount
     */
    public void setCashAdvanceAmount(java.lang.Object cashAdvanceAmount) {
        this.cashAdvanceAmount = cashAdvanceAmount;
    }


    /**
     * Gets the rejectionReason value for this ExpenseReport.
     * 
     * @return rejectionReason
     */
    public java.lang.Object getRejectionReason() {
        return rejectionReason;
    }


    /**
     * Sets the rejectionReason value for this ExpenseReport.
     * 
     * @param rejectionReason
     */
    public void setRejectionReason(java.lang.Object rejectionReason) {
        this.rejectionReason = rejectionReason;
    }


    /**
     * Gets the amountDue value for this ExpenseReport.
     * 
     * @return amountDue
     */
    public java.lang.Object getAmountDue() {
        return amountDue;
    }


    /**
     * Sets the amountDue value for this ExpenseReport.
     * 
     * @param amountDue
     */
    public void setAmountDue(java.lang.Object amountDue) {
        this.amountDue = amountDue;
    }


    /**
     * Gets the departmentNumber value for this ExpenseReport.
     * 
     * @return departmentNumber
     */
    public java.lang.Object getDepartmentNumber() {
        return departmentNumber;
    }


    /**
     * Sets the departmentNumber value for this ExpenseReport.
     * 
     * @param departmentNumber
     */
    public void setDepartmentNumber(java.lang.Object departmentNumber) {
        this.departmentNumber = departmentNumber;
    }


    /**
     * Gets the quickBooksReferenceNumber value for this ExpenseReport.
     * 
     * @return quickBooksReferenceNumber
     */
    public java.lang.Object getQuickBooksReferenceNumber() {
        return quickBooksReferenceNumber;
    }


    /**
     * Sets the quickBooksReferenceNumber value for this ExpenseReport.
     * 
     * @param quickBooksReferenceNumber
     */
    public void setQuickBooksReferenceNumber(java.lang.Object quickBooksReferenceNumber) {
        this.quickBooksReferenceNumber = quickBooksReferenceNumber;
    }


    /**
     * Gets the approvedDate value for this ExpenseReport.
     * 
     * @return approvedDate
     */
    public java.lang.Object getApprovedDate() {
        return approvedDate;
    }


    /**
     * Sets the approvedDate value for this ExpenseReport.
     * 
     * @param approvedDate
     */
    public void setApprovedDate(java.lang.Object approvedDate) {
        this.approvedDate = approvedDate;
    }


    /**
     * Gets the reimbursementCurrencyID value for this ExpenseReport.
     * 
     * @return reimbursementCurrencyID
     */
    public java.lang.Object getReimbursementCurrencyID() {
        return reimbursementCurrencyID;
    }


    /**
     * Sets the reimbursementCurrencyID value for this ExpenseReport.
     * 
     * @param reimbursementCurrencyID
     */
    public void setReimbursementCurrencyID(java.lang.Object reimbursementCurrencyID) {
        this.reimbursementCurrencyID = reimbursementCurrencyID;
    }


    /**
     * Gets the reimbursementCurrencyCashAdvanceAmount value for this ExpenseReport.
     * 
     * @return reimbursementCurrencyCashAdvanceAmount
     */
    public java.lang.Object getReimbursementCurrencyCashAdvanceAmount() {
        return reimbursementCurrencyCashAdvanceAmount;
    }


    /**
     * Sets the reimbursementCurrencyCashAdvanceAmount value for this ExpenseReport.
     * 
     * @param reimbursementCurrencyCashAdvanceAmount
     */
    public void setReimbursementCurrencyCashAdvanceAmount(java.lang.Object reimbursementCurrencyCashAdvanceAmount) {
        this.reimbursementCurrencyCashAdvanceAmount = reimbursementCurrencyCashAdvanceAmount;
    }


    /**
     * Gets the reimbursementCurrencyAmountDue value for this ExpenseReport.
     * 
     * @return reimbursementCurrencyAmountDue
     */
    public java.lang.Object getReimbursementCurrencyAmountDue() {
        return reimbursementCurrencyAmountDue;
    }


    /**
     * Sets the reimbursementCurrencyAmountDue value for this ExpenseReport.
     * 
     * @param reimbursementCurrencyAmountDue
     */
    public void setReimbursementCurrencyAmountDue(java.lang.Object reimbursementCurrencyAmountDue) {
        this.reimbursementCurrencyAmountDue = reimbursementCurrencyAmountDue;
    }


    /**
     * Gets the businessDivisionSubdivisionID value for this ExpenseReport.
     * 
     * @return businessDivisionSubdivisionID
     */
    public java.lang.Object getBusinessDivisionSubdivisionID() {
        return businessDivisionSubdivisionID;
    }


    /**
     * Sets the businessDivisionSubdivisionID value for this ExpenseReport.
     * 
     * @param businessDivisionSubdivisionID
     */
    public void setBusinessDivisionSubdivisionID(java.lang.Object businessDivisionSubdivisionID) {
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpenseReport)) return false;
        ExpenseReport other = (ExpenseReport) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.submit==null && other.getSubmit()==null) || 
             (this.submit!=null &&
              this.submit.equals(other.getSubmit()))) &&
            ((this.submitDate==null && other.getSubmitDate()==null) || 
             (this.submitDate!=null &&
              this.submitDate.equals(other.getSubmitDate()))) &&
            ((this.submitterID==null && other.getSubmitterID()==null) || 
             (this.submitterID!=null &&
              this.submitterID.equals(other.getSubmitterID()))) &&
            ((this.approverID==null && other.getApproverID()==null) || 
             (this.approverID!=null &&
              this.approverID.equals(other.getApproverID()))) &&
            ((this.weekEnding==null && other.getWeekEnding()==null) || 
             (this.weekEnding!=null &&
              this.weekEnding.equals(other.getWeekEnding()))) &&
            ((this.expenseTotal==null && other.getExpenseTotal()==null) || 
             (this.expenseTotal!=null &&
              this.expenseTotal.equals(other.getExpenseTotal()))) &&
            ((this.cashAdvanceAmount==null && other.getCashAdvanceAmount()==null) || 
             (this.cashAdvanceAmount!=null &&
              this.cashAdvanceAmount.equals(other.getCashAdvanceAmount()))) &&
            ((this.rejectionReason==null && other.getRejectionReason()==null) || 
             (this.rejectionReason!=null &&
              this.rejectionReason.equals(other.getRejectionReason()))) &&
            ((this.amountDue==null && other.getAmountDue()==null) || 
             (this.amountDue!=null &&
              this.amountDue.equals(other.getAmountDue()))) &&
            ((this.departmentNumber==null && other.getDepartmentNumber()==null) || 
             (this.departmentNumber!=null &&
              this.departmentNumber.equals(other.getDepartmentNumber()))) &&
            ((this.quickBooksReferenceNumber==null && other.getQuickBooksReferenceNumber()==null) || 
             (this.quickBooksReferenceNumber!=null &&
              this.quickBooksReferenceNumber.equals(other.getQuickBooksReferenceNumber()))) &&
            ((this.approvedDate==null && other.getApprovedDate()==null) || 
             (this.approvedDate!=null &&
              this.approvedDate.equals(other.getApprovedDate()))) &&
            ((this.reimbursementCurrencyID==null && other.getReimbursementCurrencyID()==null) || 
             (this.reimbursementCurrencyID!=null &&
              this.reimbursementCurrencyID.equals(other.getReimbursementCurrencyID()))) &&
            ((this.reimbursementCurrencyCashAdvanceAmount==null && other.getReimbursementCurrencyCashAdvanceAmount()==null) || 
             (this.reimbursementCurrencyCashAdvanceAmount!=null &&
              this.reimbursementCurrencyCashAdvanceAmount.equals(other.getReimbursementCurrencyCashAdvanceAmount()))) &&
            ((this.reimbursementCurrencyAmountDue==null && other.getReimbursementCurrencyAmountDue()==null) || 
             (this.reimbursementCurrencyAmountDue!=null &&
              this.reimbursementCurrencyAmountDue.equals(other.getReimbursementCurrencyAmountDue()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubmit() != null) {
            _hashCode += getSubmit().hashCode();
        }
        if (getSubmitDate() != null) {
            _hashCode += getSubmitDate().hashCode();
        }
        if (getSubmitterID() != null) {
            _hashCode += getSubmitterID().hashCode();
        }
        if (getApproverID() != null) {
            _hashCode += getApproverID().hashCode();
        }
        if (getWeekEnding() != null) {
            _hashCode += getWeekEnding().hashCode();
        }
        if (getExpenseTotal() != null) {
            _hashCode += getExpenseTotal().hashCode();
        }
        if (getCashAdvanceAmount() != null) {
            _hashCode += getCashAdvanceAmount().hashCode();
        }
        if (getRejectionReason() != null) {
            _hashCode += getRejectionReason().hashCode();
        }
        if (getAmountDue() != null) {
            _hashCode += getAmountDue().hashCode();
        }
        if (getDepartmentNumber() != null) {
            _hashCode += getDepartmentNumber().hashCode();
        }
        if (getQuickBooksReferenceNumber() != null) {
            _hashCode += getQuickBooksReferenceNumber().hashCode();
        }
        if (getApprovedDate() != null) {
            _hashCode += getApprovedDate().hashCode();
        }
        if (getReimbursementCurrencyID() != null) {
            _hashCode += getReimbursementCurrencyID().hashCode();
        }
        if (getReimbursementCurrencyCashAdvanceAmount() != null) {
            _hashCode += getReimbursementCurrencyCashAdvanceAmount().hashCode();
        }
        if (getReimbursementCurrencyAmountDue() != null) {
            _hashCode += getReimbursementCurrencyAmountDue().hashCode();
        }
        if (getBusinessDivisionSubdivisionID() != null) {
            _hashCode += getBusinessDivisionSubdivisionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpenseReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpenseReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Name"));
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
        elemField.setFieldName("submit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Submit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SubmitDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitterID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SubmitterID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approverID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ApproverID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekEnding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WeekEnding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpenseTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashAdvanceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CashAdvanceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectionReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RejectionReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountDue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AmountDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DepartmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickBooksReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuickBooksReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ApprovedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reimbursementCurrencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReimbursementCurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reimbursementCurrencyCashAdvanceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReimbursementCurrencyCashAdvanceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reimbursementCurrencyAmountDue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReimbursementCurrencyAmountDue"));
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
