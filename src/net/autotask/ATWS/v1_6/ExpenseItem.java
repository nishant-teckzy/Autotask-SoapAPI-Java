/**
 * ExpenseItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ExpenseItem  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object expenseReportID;

    private java.lang.Object description;

    private java.lang.Object expenseDate;

    private java.lang.Object expenseCategory;

    private java.lang.Object GLCode;

    private java.lang.Object workType;

    private java.lang.Object expenseAmount;

    private java.lang.Object paymentType;

    private java.lang.Object reimbursable;

    private java.lang.Object haveReceipt;

    private java.lang.Object billableToAccount;

    private java.lang.Object accountID;

    private java.lang.Object projectID;

    private java.lang.Object taskID;

    private java.lang.Object ticketID;

    private java.lang.Object entertainmentLocation;

    private java.lang.Object miles;

    private java.lang.Object origin;

    private java.lang.Object destination;

    private java.lang.Object rejected;

    private java.lang.Object purchaseOrderNumber;

    private java.lang.Object odometerStart;

    private java.lang.Object odometerEnd;

    private java.lang.Object expenseCurrencyID;

    private java.lang.Object receiptAmount;

    private java.lang.Object reimbursementAmount;

    private java.lang.Object reimbursementCurrencyReimbursementAmount;

    public ExpenseItem() {
    }

    public ExpenseItem(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object expenseReportID,
           java.lang.Object description,
           java.lang.Object expenseDate,
           java.lang.Object expenseCategory,
           java.lang.Object GLCode,
           java.lang.Object workType,
           java.lang.Object expenseAmount,
           java.lang.Object paymentType,
           java.lang.Object reimbursable,
           java.lang.Object haveReceipt,
           java.lang.Object billableToAccount,
           java.lang.Object accountID,
           java.lang.Object projectID,
           java.lang.Object taskID,
           java.lang.Object ticketID,
           java.lang.Object entertainmentLocation,
           java.lang.Object miles,
           java.lang.Object origin,
           java.lang.Object destination,
           java.lang.Object rejected,
           java.lang.Object purchaseOrderNumber,
           java.lang.Object odometerStart,
           java.lang.Object odometerEnd,
           java.lang.Object expenseCurrencyID,
           java.lang.Object receiptAmount,
           java.lang.Object reimbursementAmount,
           java.lang.Object reimbursementCurrencyReimbursementAmount) {
        super(
            fields,
            id,
            userDefinedFields);
        this.expenseReportID = expenseReportID;
        this.description = description;
        this.expenseDate = expenseDate;
        this.expenseCategory = expenseCategory;
        this.GLCode = GLCode;
        this.workType = workType;
        this.expenseAmount = expenseAmount;
        this.paymentType = paymentType;
        this.reimbursable = reimbursable;
        this.haveReceipt = haveReceipt;
        this.billableToAccount = billableToAccount;
        this.accountID = accountID;
        this.projectID = projectID;
        this.taskID = taskID;
        this.ticketID = ticketID;
        this.entertainmentLocation = entertainmentLocation;
        this.miles = miles;
        this.origin = origin;
        this.destination = destination;
        this.rejected = rejected;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.odometerStart = odometerStart;
        this.odometerEnd = odometerEnd;
        this.expenseCurrencyID = expenseCurrencyID;
        this.receiptAmount = receiptAmount;
        this.reimbursementAmount = reimbursementAmount;
        this.reimbursementCurrencyReimbursementAmount = reimbursementCurrencyReimbursementAmount;
    }


    /**
     * Gets the expenseReportID value for this ExpenseItem.
     * 
     * @return expenseReportID
     */
    public java.lang.Object getExpenseReportID() {
        return expenseReportID;
    }


    /**
     * Sets the expenseReportID value for this ExpenseItem.
     * 
     * @param expenseReportID
     */
    public void setExpenseReportID(java.lang.Object expenseReportID) {
        this.expenseReportID = expenseReportID;
    }


    /**
     * Gets the description value for this ExpenseItem.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ExpenseItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the expenseDate value for this ExpenseItem.
     * 
     * @return expenseDate
     */
    public java.lang.Object getExpenseDate() {
        return expenseDate;
    }


    /**
     * Sets the expenseDate value for this ExpenseItem.
     * 
     * @param expenseDate
     */
    public void setExpenseDate(java.lang.Object expenseDate) {
        this.expenseDate = expenseDate;
    }


    /**
     * Gets the expenseCategory value for this ExpenseItem.
     * 
     * @return expenseCategory
     */
    public java.lang.Object getExpenseCategory() {
        return expenseCategory;
    }


    /**
     * Sets the expenseCategory value for this ExpenseItem.
     * 
     * @param expenseCategory
     */
    public void setExpenseCategory(java.lang.Object expenseCategory) {
        this.expenseCategory = expenseCategory;
    }


    /**
     * Gets the GLCode value for this ExpenseItem.
     * 
     * @return GLCode
     */
    public java.lang.Object getGLCode() {
        return GLCode;
    }


    /**
     * Sets the GLCode value for this ExpenseItem.
     * 
     * @param GLCode
     */
    public void setGLCode(java.lang.Object GLCode) {
        this.GLCode = GLCode;
    }


    /**
     * Gets the workType value for this ExpenseItem.
     * 
     * @return workType
     */
    public java.lang.Object getWorkType() {
        return workType;
    }


    /**
     * Sets the workType value for this ExpenseItem.
     * 
     * @param workType
     */
    public void setWorkType(java.lang.Object workType) {
        this.workType = workType;
    }


    /**
     * Gets the expenseAmount value for this ExpenseItem.
     * 
     * @return expenseAmount
     */
    public java.lang.Object getExpenseAmount() {
        return expenseAmount;
    }


    /**
     * Sets the expenseAmount value for this ExpenseItem.
     * 
     * @param expenseAmount
     */
    public void setExpenseAmount(java.lang.Object expenseAmount) {
        this.expenseAmount = expenseAmount;
    }


    /**
     * Gets the paymentType value for this ExpenseItem.
     * 
     * @return paymentType
     */
    public java.lang.Object getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this ExpenseItem.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.Object paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the reimbursable value for this ExpenseItem.
     * 
     * @return reimbursable
     */
    public java.lang.Object getReimbursable() {
        return reimbursable;
    }


    /**
     * Sets the reimbursable value for this ExpenseItem.
     * 
     * @param reimbursable
     */
    public void setReimbursable(java.lang.Object reimbursable) {
        this.reimbursable = reimbursable;
    }


    /**
     * Gets the haveReceipt value for this ExpenseItem.
     * 
     * @return haveReceipt
     */
    public java.lang.Object getHaveReceipt() {
        return haveReceipt;
    }


    /**
     * Sets the haveReceipt value for this ExpenseItem.
     * 
     * @param haveReceipt
     */
    public void setHaveReceipt(java.lang.Object haveReceipt) {
        this.haveReceipt = haveReceipt;
    }


    /**
     * Gets the billableToAccount value for this ExpenseItem.
     * 
     * @return billableToAccount
     */
    public java.lang.Object getBillableToAccount() {
        return billableToAccount;
    }


    /**
     * Sets the billableToAccount value for this ExpenseItem.
     * 
     * @param billableToAccount
     */
    public void setBillableToAccount(java.lang.Object billableToAccount) {
        this.billableToAccount = billableToAccount;
    }


    /**
     * Gets the accountID value for this ExpenseItem.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this ExpenseItem.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the projectID value for this ExpenseItem.
     * 
     * @return projectID
     */
    public java.lang.Object getProjectID() {
        return projectID;
    }


    /**
     * Sets the projectID value for this ExpenseItem.
     * 
     * @param projectID
     */
    public void setProjectID(java.lang.Object projectID) {
        this.projectID = projectID;
    }


    /**
     * Gets the taskID value for this ExpenseItem.
     * 
     * @return taskID
     */
    public java.lang.Object getTaskID() {
        return taskID;
    }


    /**
     * Sets the taskID value for this ExpenseItem.
     * 
     * @param taskID
     */
    public void setTaskID(java.lang.Object taskID) {
        this.taskID = taskID;
    }


    /**
     * Gets the ticketID value for this ExpenseItem.
     * 
     * @return ticketID
     */
    public java.lang.Object getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this ExpenseItem.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Object ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the entertainmentLocation value for this ExpenseItem.
     * 
     * @return entertainmentLocation
     */
    public java.lang.Object getEntertainmentLocation() {
        return entertainmentLocation;
    }


    /**
     * Sets the entertainmentLocation value for this ExpenseItem.
     * 
     * @param entertainmentLocation
     */
    public void setEntertainmentLocation(java.lang.Object entertainmentLocation) {
        this.entertainmentLocation = entertainmentLocation;
    }


    /**
     * Gets the miles value for this ExpenseItem.
     * 
     * @return miles
     */
    public java.lang.Object getMiles() {
        return miles;
    }


    /**
     * Sets the miles value for this ExpenseItem.
     * 
     * @param miles
     */
    public void setMiles(java.lang.Object miles) {
        this.miles = miles;
    }


    /**
     * Gets the origin value for this ExpenseItem.
     * 
     * @return origin
     */
    public java.lang.Object getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this ExpenseItem.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.Object origin) {
        this.origin = origin;
    }


    /**
     * Gets the destination value for this ExpenseItem.
     * 
     * @return destination
     */
    public java.lang.Object getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this ExpenseItem.
     * 
     * @param destination
     */
    public void setDestination(java.lang.Object destination) {
        this.destination = destination;
    }


    /**
     * Gets the rejected value for this ExpenseItem.
     * 
     * @return rejected
     */
    public java.lang.Object getRejected() {
        return rejected;
    }


    /**
     * Sets the rejected value for this ExpenseItem.
     * 
     * @param rejected
     */
    public void setRejected(java.lang.Object rejected) {
        this.rejected = rejected;
    }


    /**
     * Gets the purchaseOrderNumber value for this ExpenseItem.
     * 
     * @return purchaseOrderNumber
     */
    public java.lang.Object getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }


    /**
     * Sets the purchaseOrderNumber value for this ExpenseItem.
     * 
     * @param purchaseOrderNumber
     */
    public void setPurchaseOrderNumber(java.lang.Object purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }


    /**
     * Gets the odometerStart value for this ExpenseItem.
     * 
     * @return odometerStart
     */
    public java.lang.Object getOdometerStart() {
        return odometerStart;
    }


    /**
     * Sets the odometerStart value for this ExpenseItem.
     * 
     * @param odometerStart
     */
    public void setOdometerStart(java.lang.Object odometerStart) {
        this.odometerStart = odometerStart;
    }


    /**
     * Gets the odometerEnd value for this ExpenseItem.
     * 
     * @return odometerEnd
     */
    public java.lang.Object getOdometerEnd() {
        return odometerEnd;
    }


    /**
     * Sets the odometerEnd value for this ExpenseItem.
     * 
     * @param odometerEnd
     */
    public void setOdometerEnd(java.lang.Object odometerEnd) {
        this.odometerEnd = odometerEnd;
    }


    /**
     * Gets the expenseCurrencyID value for this ExpenseItem.
     * 
     * @return expenseCurrencyID
     */
    public java.lang.Object getExpenseCurrencyID() {
        return expenseCurrencyID;
    }


    /**
     * Sets the expenseCurrencyID value for this ExpenseItem.
     * 
     * @param expenseCurrencyID
     */
    public void setExpenseCurrencyID(java.lang.Object expenseCurrencyID) {
        this.expenseCurrencyID = expenseCurrencyID;
    }


    /**
     * Gets the receiptAmount value for this ExpenseItem.
     * 
     * @return receiptAmount
     */
    public java.lang.Object getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this ExpenseItem.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(java.lang.Object receiptAmount) {
        this.receiptAmount = receiptAmount;
    }


    /**
     * Gets the reimbursementAmount value for this ExpenseItem.
     * 
     * @return reimbursementAmount
     */
    public java.lang.Object getReimbursementAmount() {
        return reimbursementAmount;
    }


    /**
     * Sets the reimbursementAmount value for this ExpenseItem.
     * 
     * @param reimbursementAmount
     */
    public void setReimbursementAmount(java.lang.Object reimbursementAmount) {
        this.reimbursementAmount = reimbursementAmount;
    }


    /**
     * Gets the reimbursementCurrencyReimbursementAmount value for this ExpenseItem.
     * 
     * @return reimbursementCurrencyReimbursementAmount
     */
    public java.lang.Object getReimbursementCurrencyReimbursementAmount() {
        return reimbursementCurrencyReimbursementAmount;
    }


    /**
     * Sets the reimbursementCurrencyReimbursementAmount value for this ExpenseItem.
     * 
     * @param reimbursementCurrencyReimbursementAmount
     */
    public void setReimbursementCurrencyReimbursementAmount(java.lang.Object reimbursementCurrencyReimbursementAmount) {
        this.reimbursementCurrencyReimbursementAmount = reimbursementCurrencyReimbursementAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpenseItem)) return false;
        ExpenseItem other = (ExpenseItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expenseReportID==null && other.getExpenseReportID()==null) || 
             (this.expenseReportID!=null &&
              this.expenseReportID.equals(other.getExpenseReportID()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.expenseDate==null && other.getExpenseDate()==null) || 
             (this.expenseDate!=null &&
              this.expenseDate.equals(other.getExpenseDate()))) &&
            ((this.expenseCategory==null && other.getExpenseCategory()==null) || 
             (this.expenseCategory!=null &&
              this.expenseCategory.equals(other.getExpenseCategory()))) &&
            ((this.GLCode==null && other.getGLCode()==null) || 
             (this.GLCode!=null &&
              this.GLCode.equals(other.getGLCode()))) &&
            ((this.workType==null && other.getWorkType()==null) || 
             (this.workType!=null &&
              this.workType.equals(other.getWorkType()))) &&
            ((this.expenseAmount==null && other.getExpenseAmount()==null) || 
             (this.expenseAmount!=null &&
              this.expenseAmount.equals(other.getExpenseAmount()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.reimbursable==null && other.getReimbursable()==null) || 
             (this.reimbursable!=null &&
              this.reimbursable.equals(other.getReimbursable()))) &&
            ((this.haveReceipt==null && other.getHaveReceipt()==null) || 
             (this.haveReceipt!=null &&
              this.haveReceipt.equals(other.getHaveReceipt()))) &&
            ((this.billableToAccount==null && other.getBillableToAccount()==null) || 
             (this.billableToAccount!=null &&
              this.billableToAccount.equals(other.getBillableToAccount()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.projectID==null && other.getProjectID()==null) || 
             (this.projectID!=null &&
              this.projectID.equals(other.getProjectID()))) &&
            ((this.taskID==null && other.getTaskID()==null) || 
             (this.taskID!=null &&
              this.taskID.equals(other.getTaskID()))) &&
            ((this.ticketID==null && other.getTicketID()==null) || 
             (this.ticketID!=null &&
              this.ticketID.equals(other.getTicketID()))) &&
            ((this.entertainmentLocation==null && other.getEntertainmentLocation()==null) || 
             (this.entertainmentLocation!=null &&
              this.entertainmentLocation.equals(other.getEntertainmentLocation()))) &&
            ((this.miles==null && other.getMiles()==null) || 
             (this.miles!=null &&
              this.miles.equals(other.getMiles()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.rejected==null && other.getRejected()==null) || 
             (this.rejected!=null &&
              this.rejected.equals(other.getRejected()))) &&
            ((this.purchaseOrderNumber==null && other.getPurchaseOrderNumber()==null) || 
             (this.purchaseOrderNumber!=null &&
              this.purchaseOrderNumber.equals(other.getPurchaseOrderNumber()))) &&
            ((this.odometerStart==null && other.getOdometerStart()==null) || 
             (this.odometerStart!=null &&
              this.odometerStart.equals(other.getOdometerStart()))) &&
            ((this.odometerEnd==null && other.getOdometerEnd()==null) || 
             (this.odometerEnd!=null &&
              this.odometerEnd.equals(other.getOdometerEnd()))) &&
            ((this.expenseCurrencyID==null && other.getExpenseCurrencyID()==null) || 
             (this.expenseCurrencyID!=null &&
              this.expenseCurrencyID.equals(other.getExpenseCurrencyID()))) &&
            ((this.receiptAmount==null && other.getReceiptAmount()==null) || 
             (this.receiptAmount!=null &&
              this.receiptAmount.equals(other.getReceiptAmount()))) &&
            ((this.reimbursementAmount==null && other.getReimbursementAmount()==null) || 
             (this.reimbursementAmount!=null &&
              this.reimbursementAmount.equals(other.getReimbursementAmount()))) &&
            ((this.reimbursementCurrencyReimbursementAmount==null && other.getReimbursementCurrencyReimbursementAmount()==null) || 
             (this.reimbursementCurrencyReimbursementAmount!=null &&
              this.reimbursementCurrencyReimbursementAmount.equals(other.getReimbursementCurrencyReimbursementAmount())));
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
        if (getExpenseReportID() != null) {
            _hashCode += getExpenseReportID().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExpenseDate() != null) {
            _hashCode += getExpenseDate().hashCode();
        }
        if (getExpenseCategory() != null) {
            _hashCode += getExpenseCategory().hashCode();
        }
        if (getGLCode() != null) {
            _hashCode += getGLCode().hashCode();
        }
        if (getWorkType() != null) {
            _hashCode += getWorkType().hashCode();
        }
        if (getExpenseAmount() != null) {
            _hashCode += getExpenseAmount().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getReimbursable() != null) {
            _hashCode += getReimbursable().hashCode();
        }
        if (getHaveReceipt() != null) {
            _hashCode += getHaveReceipt().hashCode();
        }
        if (getBillableToAccount() != null) {
            _hashCode += getBillableToAccount().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getProjectID() != null) {
            _hashCode += getProjectID().hashCode();
        }
        if (getTaskID() != null) {
            _hashCode += getTaskID().hashCode();
        }
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
        }
        if (getEntertainmentLocation() != null) {
            _hashCode += getEntertainmentLocation().hashCode();
        }
        if (getMiles() != null) {
            _hashCode += getMiles().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getRejected() != null) {
            _hashCode += getRejected().hashCode();
        }
        if (getPurchaseOrderNumber() != null) {
            _hashCode += getPurchaseOrderNumber().hashCode();
        }
        if (getOdometerStart() != null) {
            _hashCode += getOdometerStart().hashCode();
        }
        if (getOdometerEnd() != null) {
            _hashCode += getOdometerEnd().hashCode();
        }
        if (getExpenseCurrencyID() != null) {
            _hashCode += getExpenseCurrencyID().hashCode();
        }
        if (getReceiptAmount() != null) {
            _hashCode += getReceiptAmount().hashCode();
        }
        if (getReimbursementAmount() != null) {
            _hashCode += getReimbursementAmount().hashCode();
        }
        if (getReimbursementCurrencyReimbursementAmount() != null) {
            _hashCode += getReimbursementCurrencyReimbursementAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpenseItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpenseItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseReportID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpenseReportID"));
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
        elemField.setFieldName("expenseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpenseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpenseCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "GLCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WorkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpenseAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reimbursable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Reimbursable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("haveReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HaveReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billableToAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillableToAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
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
        elemField.setFieldName("taskID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaskID"));
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
        elemField.setFieldName("entertainmentLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EntertainmentLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Miles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejected");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Rejected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PurchaseOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("odometerStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OdometerStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("odometerEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OdometerEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseCurrencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExpenseCurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReceiptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reimbursementAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReimbursementAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reimbursementCurrencyReimbursementAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReimbursementCurrencyReimbursementAmount"));
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
