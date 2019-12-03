/**
 * TimeEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class TimeEntry  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object taskID;

    private java.lang.Object ticketID;

    private java.lang.Object internalAllocationCodeID;

    private java.lang.Object type;

    private java.lang.Object dateWorked;

    private java.lang.Object startDateTime;

    private java.lang.Object endDateTime;

    private java.lang.Object hoursWorked;

    private java.lang.Object hoursToBill;

    private java.lang.Object offsetHours;

    private java.lang.Object summaryNotes;

    private java.lang.Object internalNotes;

    private java.lang.Object roleID;

    private java.lang.Object createDateTime;

    private java.lang.Object resourceID;

    private java.lang.Object creatorUserID;

    private java.lang.Object lastModifiedUserID;

    private java.lang.Object lastModifiedDateTime;

    private java.lang.Object allocationCodeID;

    private java.lang.Object contractID;

    private java.lang.Object showOnInvoice;

    private java.lang.Object nonBillable;

    private java.lang.Object billingApprovalLevelMostRecent;

    private java.lang.Object billingApprovalResourceID;

    private java.lang.Object billingApprovalDateTime;

    private java.lang.Object contractServiceID;

    private java.lang.Object contractServiceBundleID;

    private java.lang.Object impersonatorCreatorResourceID;

    private java.lang.Object impersonatorUpdaterResourceID;

    public TimeEntry() {
    }

    public TimeEntry(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object taskID,
           java.lang.Object ticketID,
           java.lang.Object internalAllocationCodeID,
           java.lang.Object type,
           java.lang.Object dateWorked,
           java.lang.Object startDateTime,
           java.lang.Object endDateTime,
           java.lang.Object hoursWorked,
           java.lang.Object hoursToBill,
           java.lang.Object offsetHours,
           java.lang.Object summaryNotes,
           java.lang.Object internalNotes,
           java.lang.Object roleID,
           java.lang.Object createDateTime,
           java.lang.Object resourceID,
           java.lang.Object creatorUserID,
           java.lang.Object lastModifiedUserID,
           java.lang.Object lastModifiedDateTime,
           java.lang.Object allocationCodeID,
           java.lang.Object contractID,
           java.lang.Object showOnInvoice,
           java.lang.Object nonBillable,
           java.lang.Object billingApprovalLevelMostRecent,
           java.lang.Object billingApprovalResourceID,
           java.lang.Object billingApprovalDateTime,
           java.lang.Object contractServiceID,
           java.lang.Object contractServiceBundleID,
           java.lang.Object impersonatorCreatorResourceID,
           java.lang.Object impersonatorUpdaterResourceID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.taskID = taskID;
        this.ticketID = ticketID;
        this.internalAllocationCodeID = internalAllocationCodeID;
        this.type = type;
        this.dateWorked = dateWorked;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.hoursWorked = hoursWorked;
        this.hoursToBill = hoursToBill;
        this.offsetHours = offsetHours;
        this.summaryNotes = summaryNotes;
        this.internalNotes = internalNotes;
        this.roleID = roleID;
        this.createDateTime = createDateTime;
        this.resourceID = resourceID;
        this.creatorUserID = creatorUserID;
        this.lastModifiedUserID = lastModifiedUserID;
        this.lastModifiedDateTime = lastModifiedDateTime;
        this.allocationCodeID = allocationCodeID;
        this.contractID = contractID;
        this.showOnInvoice = showOnInvoice;
        this.nonBillable = nonBillable;
        this.billingApprovalLevelMostRecent = billingApprovalLevelMostRecent;
        this.billingApprovalResourceID = billingApprovalResourceID;
        this.billingApprovalDateTime = billingApprovalDateTime;
        this.contractServiceID = contractServiceID;
        this.contractServiceBundleID = contractServiceBundleID;
        this.impersonatorCreatorResourceID = impersonatorCreatorResourceID;
        this.impersonatorUpdaterResourceID = impersonatorUpdaterResourceID;
    }


    /**
     * Gets the taskID value for this TimeEntry.
     * 
     * @return taskID
     */
    public java.lang.Object getTaskID() {
        return taskID;
    }


    /**
     * Sets the taskID value for this TimeEntry.
     * 
     * @param taskID
     */
    public void setTaskID(java.lang.Object taskID) {
        this.taskID = taskID;
    }


    /**
     * Gets the ticketID value for this TimeEntry.
     * 
     * @return ticketID
     */
    public java.lang.Object getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this TimeEntry.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Object ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the internalAllocationCodeID value for this TimeEntry.
     * 
     * @return internalAllocationCodeID
     */
    public java.lang.Object getInternalAllocationCodeID() {
        return internalAllocationCodeID;
    }


    /**
     * Sets the internalAllocationCodeID value for this TimeEntry.
     * 
     * @param internalAllocationCodeID
     */
    public void setInternalAllocationCodeID(java.lang.Object internalAllocationCodeID) {
        this.internalAllocationCodeID = internalAllocationCodeID;
    }


    /**
     * Gets the type value for this TimeEntry.
     * 
     * @return type
     */
    public java.lang.Object getType() {
        return type;
    }


    /**
     * Sets the type value for this TimeEntry.
     * 
     * @param type
     */
    public void setType(java.lang.Object type) {
        this.type = type;
    }


    /**
     * Gets the dateWorked value for this TimeEntry.
     * 
     * @return dateWorked
     */
    public java.lang.Object getDateWorked() {
        return dateWorked;
    }


    /**
     * Sets the dateWorked value for this TimeEntry.
     * 
     * @param dateWorked
     */
    public void setDateWorked(java.lang.Object dateWorked) {
        this.dateWorked = dateWorked;
    }


    /**
     * Gets the startDateTime value for this TimeEntry.
     * 
     * @return startDateTime
     */
    public java.lang.Object getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this TimeEntry.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.Object startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this TimeEntry.
     * 
     * @return endDateTime
     */
    public java.lang.Object getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this TimeEntry.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.lang.Object endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the hoursWorked value for this TimeEntry.
     * 
     * @return hoursWorked
     */
    public java.lang.Object getHoursWorked() {
        return hoursWorked;
    }


    /**
     * Sets the hoursWorked value for this TimeEntry.
     * 
     * @param hoursWorked
     */
    public void setHoursWorked(java.lang.Object hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    /**
     * Gets the hoursToBill value for this TimeEntry.
     * 
     * @return hoursToBill
     */
    public java.lang.Object getHoursToBill() {
        return hoursToBill;
    }


    /**
     * Sets the hoursToBill value for this TimeEntry.
     * 
     * @param hoursToBill
     */
    public void setHoursToBill(java.lang.Object hoursToBill) {
        this.hoursToBill = hoursToBill;
    }


    /**
     * Gets the offsetHours value for this TimeEntry.
     * 
     * @return offsetHours
     */
    public java.lang.Object getOffsetHours() {
        return offsetHours;
    }


    /**
     * Sets the offsetHours value for this TimeEntry.
     * 
     * @param offsetHours
     */
    public void setOffsetHours(java.lang.Object offsetHours) {
        this.offsetHours = offsetHours;
    }


    /**
     * Gets the summaryNotes value for this TimeEntry.
     * 
     * @return summaryNotes
     */
    public java.lang.Object getSummaryNotes() {
        return summaryNotes;
    }


    /**
     * Sets the summaryNotes value for this TimeEntry.
     * 
     * @param summaryNotes
     */
    public void setSummaryNotes(java.lang.Object summaryNotes) {
        this.summaryNotes = summaryNotes;
    }


    /**
     * Gets the internalNotes value for this TimeEntry.
     * 
     * @return internalNotes
     */
    public java.lang.Object getInternalNotes() {
        return internalNotes;
    }


    /**
     * Sets the internalNotes value for this TimeEntry.
     * 
     * @param internalNotes
     */
    public void setInternalNotes(java.lang.Object internalNotes) {
        this.internalNotes = internalNotes;
    }


    /**
     * Gets the roleID value for this TimeEntry.
     * 
     * @return roleID
     */
    public java.lang.Object getRoleID() {
        return roleID;
    }


    /**
     * Sets the roleID value for this TimeEntry.
     * 
     * @param roleID
     */
    public void setRoleID(java.lang.Object roleID) {
        this.roleID = roleID;
    }


    /**
     * Gets the createDateTime value for this TimeEntry.
     * 
     * @return createDateTime
     */
    public java.lang.Object getCreateDateTime() {
        return createDateTime;
    }


    /**
     * Sets the createDateTime value for this TimeEntry.
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(java.lang.Object createDateTime) {
        this.createDateTime = createDateTime;
    }


    /**
     * Gets the resourceID value for this TimeEntry.
     * 
     * @return resourceID
     */
    public java.lang.Object getResourceID() {
        return resourceID;
    }


    /**
     * Sets the resourceID value for this TimeEntry.
     * 
     * @param resourceID
     */
    public void setResourceID(java.lang.Object resourceID) {
        this.resourceID = resourceID;
    }


    /**
     * Gets the creatorUserID value for this TimeEntry.
     * 
     * @return creatorUserID
     */
    public java.lang.Object getCreatorUserID() {
        return creatorUserID;
    }


    /**
     * Sets the creatorUserID value for this TimeEntry.
     * 
     * @param creatorUserID
     */
    public void setCreatorUserID(java.lang.Object creatorUserID) {
        this.creatorUserID = creatorUserID;
    }


    /**
     * Gets the lastModifiedUserID value for this TimeEntry.
     * 
     * @return lastModifiedUserID
     */
    public java.lang.Object getLastModifiedUserID() {
        return lastModifiedUserID;
    }


    /**
     * Sets the lastModifiedUserID value for this TimeEntry.
     * 
     * @param lastModifiedUserID
     */
    public void setLastModifiedUserID(java.lang.Object lastModifiedUserID) {
        this.lastModifiedUserID = lastModifiedUserID;
    }


    /**
     * Gets the lastModifiedDateTime value for this TimeEntry.
     * 
     * @return lastModifiedDateTime
     */
    public java.lang.Object getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this TimeEntry.
     * 
     * @param lastModifiedDateTime
     */
    public void setLastModifiedDateTime(java.lang.Object lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the allocationCodeID value for this TimeEntry.
     * 
     * @return allocationCodeID
     */
    public java.lang.Object getAllocationCodeID() {
        return allocationCodeID;
    }


    /**
     * Sets the allocationCodeID value for this TimeEntry.
     * 
     * @param allocationCodeID
     */
    public void setAllocationCodeID(java.lang.Object allocationCodeID) {
        this.allocationCodeID = allocationCodeID;
    }


    /**
     * Gets the contractID value for this TimeEntry.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this TimeEntry.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the showOnInvoice value for this TimeEntry.
     * 
     * @return showOnInvoice
     */
    public java.lang.Object getShowOnInvoice() {
        return showOnInvoice;
    }


    /**
     * Sets the showOnInvoice value for this TimeEntry.
     * 
     * @param showOnInvoice
     */
    public void setShowOnInvoice(java.lang.Object showOnInvoice) {
        this.showOnInvoice = showOnInvoice;
    }


    /**
     * Gets the nonBillable value for this TimeEntry.
     * 
     * @return nonBillable
     */
    public java.lang.Object getNonBillable() {
        return nonBillable;
    }


    /**
     * Sets the nonBillable value for this TimeEntry.
     * 
     * @param nonBillable
     */
    public void setNonBillable(java.lang.Object nonBillable) {
        this.nonBillable = nonBillable;
    }


    /**
     * Gets the billingApprovalLevelMostRecent value for this TimeEntry.
     * 
     * @return billingApprovalLevelMostRecent
     */
    public java.lang.Object getBillingApprovalLevelMostRecent() {
        return billingApprovalLevelMostRecent;
    }


    /**
     * Sets the billingApprovalLevelMostRecent value for this TimeEntry.
     * 
     * @param billingApprovalLevelMostRecent
     */
    public void setBillingApprovalLevelMostRecent(java.lang.Object billingApprovalLevelMostRecent) {
        this.billingApprovalLevelMostRecent = billingApprovalLevelMostRecent;
    }


    /**
     * Gets the billingApprovalResourceID value for this TimeEntry.
     * 
     * @return billingApprovalResourceID
     */
    public java.lang.Object getBillingApprovalResourceID() {
        return billingApprovalResourceID;
    }


    /**
     * Sets the billingApprovalResourceID value for this TimeEntry.
     * 
     * @param billingApprovalResourceID
     */
    public void setBillingApprovalResourceID(java.lang.Object billingApprovalResourceID) {
        this.billingApprovalResourceID = billingApprovalResourceID;
    }


    /**
     * Gets the billingApprovalDateTime value for this TimeEntry.
     * 
     * @return billingApprovalDateTime
     */
    public java.lang.Object getBillingApprovalDateTime() {
        return billingApprovalDateTime;
    }


    /**
     * Sets the billingApprovalDateTime value for this TimeEntry.
     * 
     * @param billingApprovalDateTime
     */
    public void setBillingApprovalDateTime(java.lang.Object billingApprovalDateTime) {
        this.billingApprovalDateTime = billingApprovalDateTime;
    }


    /**
     * Gets the contractServiceID value for this TimeEntry.
     * 
     * @return contractServiceID
     */
    public java.lang.Object getContractServiceID() {
        return contractServiceID;
    }


    /**
     * Sets the contractServiceID value for this TimeEntry.
     * 
     * @param contractServiceID
     */
    public void setContractServiceID(java.lang.Object contractServiceID) {
        this.contractServiceID = contractServiceID;
    }


    /**
     * Gets the contractServiceBundleID value for this TimeEntry.
     * 
     * @return contractServiceBundleID
     */
    public java.lang.Object getContractServiceBundleID() {
        return contractServiceBundleID;
    }


    /**
     * Sets the contractServiceBundleID value for this TimeEntry.
     * 
     * @param contractServiceBundleID
     */
    public void setContractServiceBundleID(java.lang.Object contractServiceBundleID) {
        this.contractServiceBundleID = contractServiceBundleID;
    }


    /**
     * Gets the impersonatorCreatorResourceID value for this TimeEntry.
     * 
     * @return impersonatorCreatorResourceID
     */
    public java.lang.Object getImpersonatorCreatorResourceID() {
        return impersonatorCreatorResourceID;
    }


    /**
     * Sets the impersonatorCreatorResourceID value for this TimeEntry.
     * 
     * @param impersonatorCreatorResourceID
     */
    public void setImpersonatorCreatorResourceID(java.lang.Object impersonatorCreatorResourceID) {
        this.impersonatorCreatorResourceID = impersonatorCreatorResourceID;
    }


    /**
     * Gets the impersonatorUpdaterResourceID value for this TimeEntry.
     * 
     * @return impersonatorUpdaterResourceID
     */
    public java.lang.Object getImpersonatorUpdaterResourceID() {
        return impersonatorUpdaterResourceID;
    }


    /**
     * Sets the impersonatorUpdaterResourceID value for this TimeEntry.
     * 
     * @param impersonatorUpdaterResourceID
     */
    public void setImpersonatorUpdaterResourceID(java.lang.Object impersonatorUpdaterResourceID) {
        this.impersonatorUpdaterResourceID = impersonatorUpdaterResourceID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeEntry)) return false;
        TimeEntry other = (TimeEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.taskID==null && other.getTaskID()==null) || 
             (this.taskID!=null &&
              this.taskID.equals(other.getTaskID()))) &&
            ((this.ticketID==null && other.getTicketID()==null) || 
             (this.ticketID!=null &&
              this.ticketID.equals(other.getTicketID()))) &&
            ((this.internalAllocationCodeID==null && other.getInternalAllocationCodeID()==null) || 
             (this.internalAllocationCodeID!=null &&
              this.internalAllocationCodeID.equals(other.getInternalAllocationCodeID()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.dateWorked==null && other.getDateWorked()==null) || 
             (this.dateWorked!=null &&
              this.dateWorked.equals(other.getDateWorked()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.hoursWorked==null && other.getHoursWorked()==null) || 
             (this.hoursWorked!=null &&
              this.hoursWorked.equals(other.getHoursWorked()))) &&
            ((this.hoursToBill==null && other.getHoursToBill()==null) || 
             (this.hoursToBill!=null &&
              this.hoursToBill.equals(other.getHoursToBill()))) &&
            ((this.offsetHours==null && other.getOffsetHours()==null) || 
             (this.offsetHours!=null &&
              this.offsetHours.equals(other.getOffsetHours()))) &&
            ((this.summaryNotes==null && other.getSummaryNotes()==null) || 
             (this.summaryNotes!=null &&
              this.summaryNotes.equals(other.getSummaryNotes()))) &&
            ((this.internalNotes==null && other.getInternalNotes()==null) || 
             (this.internalNotes!=null &&
              this.internalNotes.equals(other.getInternalNotes()))) &&
            ((this.roleID==null && other.getRoleID()==null) || 
             (this.roleID!=null &&
              this.roleID.equals(other.getRoleID()))) &&
            ((this.createDateTime==null && other.getCreateDateTime()==null) || 
             (this.createDateTime!=null &&
              this.createDateTime.equals(other.getCreateDateTime()))) &&
            ((this.resourceID==null && other.getResourceID()==null) || 
             (this.resourceID!=null &&
              this.resourceID.equals(other.getResourceID()))) &&
            ((this.creatorUserID==null && other.getCreatorUserID()==null) || 
             (this.creatorUserID!=null &&
              this.creatorUserID.equals(other.getCreatorUserID()))) &&
            ((this.lastModifiedUserID==null && other.getLastModifiedUserID()==null) || 
             (this.lastModifiedUserID!=null &&
              this.lastModifiedUserID.equals(other.getLastModifiedUserID()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.allocationCodeID==null && other.getAllocationCodeID()==null) || 
             (this.allocationCodeID!=null &&
              this.allocationCodeID.equals(other.getAllocationCodeID()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.showOnInvoice==null && other.getShowOnInvoice()==null) || 
             (this.showOnInvoice!=null &&
              this.showOnInvoice.equals(other.getShowOnInvoice()))) &&
            ((this.nonBillable==null && other.getNonBillable()==null) || 
             (this.nonBillable!=null &&
              this.nonBillable.equals(other.getNonBillable()))) &&
            ((this.billingApprovalLevelMostRecent==null && other.getBillingApprovalLevelMostRecent()==null) || 
             (this.billingApprovalLevelMostRecent!=null &&
              this.billingApprovalLevelMostRecent.equals(other.getBillingApprovalLevelMostRecent()))) &&
            ((this.billingApprovalResourceID==null && other.getBillingApprovalResourceID()==null) || 
             (this.billingApprovalResourceID!=null &&
              this.billingApprovalResourceID.equals(other.getBillingApprovalResourceID()))) &&
            ((this.billingApprovalDateTime==null && other.getBillingApprovalDateTime()==null) || 
             (this.billingApprovalDateTime!=null &&
              this.billingApprovalDateTime.equals(other.getBillingApprovalDateTime()))) &&
            ((this.contractServiceID==null && other.getContractServiceID()==null) || 
             (this.contractServiceID!=null &&
              this.contractServiceID.equals(other.getContractServiceID()))) &&
            ((this.contractServiceBundleID==null && other.getContractServiceBundleID()==null) || 
             (this.contractServiceBundleID!=null &&
              this.contractServiceBundleID.equals(other.getContractServiceBundleID()))) &&
            ((this.impersonatorCreatorResourceID==null && other.getImpersonatorCreatorResourceID()==null) || 
             (this.impersonatorCreatorResourceID!=null &&
              this.impersonatorCreatorResourceID.equals(other.getImpersonatorCreatorResourceID()))) &&
            ((this.impersonatorUpdaterResourceID==null && other.getImpersonatorUpdaterResourceID()==null) || 
             (this.impersonatorUpdaterResourceID!=null &&
              this.impersonatorUpdaterResourceID.equals(other.getImpersonatorUpdaterResourceID())));
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
        if (getTaskID() != null) {
            _hashCode += getTaskID().hashCode();
        }
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
        }
        if (getInternalAllocationCodeID() != null) {
            _hashCode += getInternalAllocationCodeID().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDateWorked() != null) {
            _hashCode += getDateWorked().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getHoursWorked() != null) {
            _hashCode += getHoursWorked().hashCode();
        }
        if (getHoursToBill() != null) {
            _hashCode += getHoursToBill().hashCode();
        }
        if (getOffsetHours() != null) {
            _hashCode += getOffsetHours().hashCode();
        }
        if (getSummaryNotes() != null) {
            _hashCode += getSummaryNotes().hashCode();
        }
        if (getInternalNotes() != null) {
            _hashCode += getInternalNotes().hashCode();
        }
        if (getRoleID() != null) {
            _hashCode += getRoleID().hashCode();
        }
        if (getCreateDateTime() != null) {
            _hashCode += getCreateDateTime().hashCode();
        }
        if (getResourceID() != null) {
            _hashCode += getResourceID().hashCode();
        }
        if (getCreatorUserID() != null) {
            _hashCode += getCreatorUserID().hashCode();
        }
        if (getLastModifiedUserID() != null) {
            _hashCode += getLastModifiedUserID().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getAllocationCodeID() != null) {
            _hashCode += getAllocationCodeID().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getShowOnInvoice() != null) {
            _hashCode += getShowOnInvoice().hashCode();
        }
        if (getNonBillable() != null) {
            _hashCode += getNonBillable().hashCode();
        }
        if (getBillingApprovalLevelMostRecent() != null) {
            _hashCode += getBillingApprovalLevelMostRecent().hashCode();
        }
        if (getBillingApprovalResourceID() != null) {
            _hashCode += getBillingApprovalResourceID().hashCode();
        }
        if (getBillingApprovalDateTime() != null) {
            _hashCode += getBillingApprovalDateTime().hashCode();
        }
        if (getContractServiceID() != null) {
            _hashCode += getContractServiceID().hashCode();
        }
        if (getContractServiceBundleID() != null) {
            _hashCode += getContractServiceBundleID().hashCode();
        }
        if (getImpersonatorCreatorResourceID() != null) {
            _hashCode += getImpersonatorCreatorResourceID().hashCode();
        }
        if (getImpersonatorUpdaterResourceID() != null) {
            _hashCode += getImpersonatorUpdaterResourceID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TimeEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("internalAllocationCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalAllocationCodeID"));
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
        elemField.setFieldName("dateWorked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DateWorked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "StartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursWorked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HoursWorked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursToBill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HoursToBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offsetHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OffsetHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SummaryNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InternalNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RoleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreatorUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastModifiedUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastModifiedDateTime"));
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
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showOnInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ShowOnInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonBillable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NonBillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingApprovalLevelMostRecent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillingApprovalLevelMostRecent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingApprovalResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillingApprovalResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingApprovalDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BillingApprovalDateTime"));
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
        elemField.setFieldName("contractServiceBundleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractServiceBundleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impersonatorCreatorResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ImpersonatorCreatorResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impersonatorUpdaterResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ImpersonatorUpdaterResourceID"));
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
