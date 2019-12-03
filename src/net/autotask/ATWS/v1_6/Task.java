/**
 * Task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Task  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object allocationCodeID;

    private java.lang.Object assignedResourceID;

    private java.lang.Object assignedResourceRoleID;

    private java.lang.Object canClientPortalUserCompleteTask;

    private java.lang.Object completedDateTime;

    private java.lang.Object createDateTime;

    private java.lang.Object creatorResourceID;

    private java.lang.Object departmentID;

    private java.lang.Object description;

    private java.lang.Object endDateTime;

    private java.lang.Object estimatedHours;

    private java.lang.Object externalID;

    private java.lang.Object hoursToBeScheduled;

    private java.lang.Object isVisibleInClientPortal;

    private java.lang.Object lastActivityDateTime;

    private java.lang.Object phaseID;

    private java.lang.Object priority;

    private java.lang.Object projectID;

    private java.lang.Object purchaseOrderNumber;

    private java.lang.Object remainingHours;

    private java.lang.Object startDateTime;

    private java.lang.Object status;

    private java.lang.Object taskIsBillable;

    private java.lang.Object taskNumber;

    private java.lang.Object taskType;

    private java.lang.Object title;

    private java.lang.Object priorityLabel;

    private java.lang.Object creatorType;

    private java.lang.Object completedByResourceID;

    private java.lang.Object completedByType;

    private java.lang.Object lastActivityResourceID;

    private java.lang.Object lastActivityPersonType;

    private java.lang.Object accountPhysicalLocationID;

    public Task() {
    }

    public Task(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object allocationCodeID,
           java.lang.Object assignedResourceID,
           java.lang.Object assignedResourceRoleID,
           java.lang.Object canClientPortalUserCompleteTask,
           java.lang.Object completedDateTime,
           java.lang.Object createDateTime,
           java.lang.Object creatorResourceID,
           java.lang.Object departmentID,
           java.lang.Object description,
           java.lang.Object endDateTime,
           java.lang.Object estimatedHours,
           java.lang.Object externalID,
           java.lang.Object hoursToBeScheduled,
           java.lang.Object isVisibleInClientPortal,
           java.lang.Object lastActivityDateTime,
           java.lang.Object phaseID,
           java.lang.Object priority,
           java.lang.Object projectID,
           java.lang.Object purchaseOrderNumber,
           java.lang.Object remainingHours,
           java.lang.Object startDateTime,
           java.lang.Object status,
           java.lang.Object taskIsBillable,
           java.lang.Object taskNumber,
           java.lang.Object taskType,
           java.lang.Object title,
           java.lang.Object priorityLabel,
           java.lang.Object creatorType,
           java.lang.Object completedByResourceID,
           java.lang.Object completedByType,
           java.lang.Object lastActivityResourceID,
           java.lang.Object lastActivityPersonType,
           java.lang.Object accountPhysicalLocationID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.allocationCodeID = allocationCodeID;
        this.assignedResourceID = assignedResourceID;
        this.assignedResourceRoleID = assignedResourceRoleID;
        this.canClientPortalUserCompleteTask = canClientPortalUserCompleteTask;
        this.completedDateTime = completedDateTime;
        this.createDateTime = createDateTime;
        this.creatorResourceID = creatorResourceID;
        this.departmentID = departmentID;
        this.description = description;
        this.endDateTime = endDateTime;
        this.estimatedHours = estimatedHours;
        this.externalID = externalID;
        this.hoursToBeScheduled = hoursToBeScheduled;
        this.isVisibleInClientPortal = isVisibleInClientPortal;
        this.lastActivityDateTime = lastActivityDateTime;
        this.phaseID = phaseID;
        this.priority = priority;
        this.projectID = projectID;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.remainingHours = remainingHours;
        this.startDateTime = startDateTime;
        this.status = status;
        this.taskIsBillable = taskIsBillable;
        this.taskNumber = taskNumber;
        this.taskType = taskType;
        this.title = title;
        this.priorityLabel = priorityLabel;
        this.creatorType = creatorType;
        this.completedByResourceID = completedByResourceID;
        this.completedByType = completedByType;
        this.lastActivityResourceID = lastActivityResourceID;
        this.lastActivityPersonType = lastActivityPersonType;
        this.accountPhysicalLocationID = accountPhysicalLocationID;
    }


    /**
     * Gets the allocationCodeID value for this Task.
     * 
     * @return allocationCodeID
     */
    public java.lang.Object getAllocationCodeID() {
        return allocationCodeID;
    }


    /**
     * Sets the allocationCodeID value for this Task.
     * 
     * @param allocationCodeID
     */
    public void setAllocationCodeID(java.lang.Object allocationCodeID) {
        this.allocationCodeID = allocationCodeID;
    }


    /**
     * Gets the assignedResourceID value for this Task.
     * 
     * @return assignedResourceID
     */
    public java.lang.Object getAssignedResourceID() {
        return assignedResourceID;
    }


    /**
     * Sets the assignedResourceID value for this Task.
     * 
     * @param assignedResourceID
     */
    public void setAssignedResourceID(java.lang.Object assignedResourceID) {
        this.assignedResourceID = assignedResourceID;
    }


    /**
     * Gets the assignedResourceRoleID value for this Task.
     * 
     * @return assignedResourceRoleID
     */
    public java.lang.Object getAssignedResourceRoleID() {
        return assignedResourceRoleID;
    }


    /**
     * Sets the assignedResourceRoleID value for this Task.
     * 
     * @param assignedResourceRoleID
     */
    public void setAssignedResourceRoleID(java.lang.Object assignedResourceRoleID) {
        this.assignedResourceRoleID = assignedResourceRoleID;
    }


    /**
     * Gets the canClientPortalUserCompleteTask value for this Task.
     * 
     * @return canClientPortalUserCompleteTask
     */
    public java.lang.Object getCanClientPortalUserCompleteTask() {
        return canClientPortalUserCompleteTask;
    }


    /**
     * Sets the canClientPortalUserCompleteTask value for this Task.
     * 
     * @param canClientPortalUserCompleteTask
     */
    public void setCanClientPortalUserCompleteTask(java.lang.Object canClientPortalUserCompleteTask) {
        this.canClientPortalUserCompleteTask = canClientPortalUserCompleteTask;
    }


    /**
     * Gets the completedDateTime value for this Task.
     * 
     * @return completedDateTime
     */
    public java.lang.Object getCompletedDateTime() {
        return completedDateTime;
    }


    /**
     * Sets the completedDateTime value for this Task.
     * 
     * @param completedDateTime
     */
    public void setCompletedDateTime(java.lang.Object completedDateTime) {
        this.completedDateTime = completedDateTime;
    }


    /**
     * Gets the createDateTime value for this Task.
     * 
     * @return createDateTime
     */
    public java.lang.Object getCreateDateTime() {
        return createDateTime;
    }


    /**
     * Sets the createDateTime value for this Task.
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(java.lang.Object createDateTime) {
        this.createDateTime = createDateTime;
    }


    /**
     * Gets the creatorResourceID value for this Task.
     * 
     * @return creatorResourceID
     */
    public java.lang.Object getCreatorResourceID() {
        return creatorResourceID;
    }


    /**
     * Sets the creatorResourceID value for this Task.
     * 
     * @param creatorResourceID
     */
    public void setCreatorResourceID(java.lang.Object creatorResourceID) {
        this.creatorResourceID = creatorResourceID;
    }


    /**
     * Gets the departmentID value for this Task.
     * 
     * @return departmentID
     */
    public java.lang.Object getDepartmentID() {
        return departmentID;
    }


    /**
     * Sets the departmentID value for this Task.
     * 
     * @param departmentID
     */
    public void setDepartmentID(java.lang.Object departmentID) {
        this.departmentID = departmentID;
    }


    /**
     * Gets the description value for this Task.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Task.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the endDateTime value for this Task.
     * 
     * @return endDateTime
     */
    public java.lang.Object getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this Task.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.lang.Object endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the estimatedHours value for this Task.
     * 
     * @return estimatedHours
     */
    public java.lang.Object getEstimatedHours() {
        return estimatedHours;
    }


    /**
     * Sets the estimatedHours value for this Task.
     * 
     * @param estimatedHours
     */
    public void setEstimatedHours(java.lang.Object estimatedHours) {
        this.estimatedHours = estimatedHours;
    }


    /**
     * Gets the externalID value for this Task.
     * 
     * @return externalID
     */
    public java.lang.Object getExternalID() {
        return externalID;
    }


    /**
     * Sets the externalID value for this Task.
     * 
     * @param externalID
     */
    public void setExternalID(java.lang.Object externalID) {
        this.externalID = externalID;
    }


    /**
     * Gets the hoursToBeScheduled value for this Task.
     * 
     * @return hoursToBeScheduled
     */
    public java.lang.Object getHoursToBeScheduled() {
        return hoursToBeScheduled;
    }


    /**
     * Sets the hoursToBeScheduled value for this Task.
     * 
     * @param hoursToBeScheduled
     */
    public void setHoursToBeScheduled(java.lang.Object hoursToBeScheduled) {
        this.hoursToBeScheduled = hoursToBeScheduled;
    }


    /**
     * Gets the isVisibleInClientPortal value for this Task.
     * 
     * @return isVisibleInClientPortal
     */
    public java.lang.Object getIsVisibleInClientPortal() {
        return isVisibleInClientPortal;
    }


    /**
     * Sets the isVisibleInClientPortal value for this Task.
     * 
     * @param isVisibleInClientPortal
     */
    public void setIsVisibleInClientPortal(java.lang.Object isVisibleInClientPortal) {
        this.isVisibleInClientPortal = isVisibleInClientPortal;
    }


    /**
     * Gets the lastActivityDateTime value for this Task.
     * 
     * @return lastActivityDateTime
     */
    public java.lang.Object getLastActivityDateTime() {
        return lastActivityDateTime;
    }


    /**
     * Sets the lastActivityDateTime value for this Task.
     * 
     * @param lastActivityDateTime
     */
    public void setLastActivityDateTime(java.lang.Object lastActivityDateTime) {
        this.lastActivityDateTime = lastActivityDateTime;
    }


    /**
     * Gets the phaseID value for this Task.
     * 
     * @return phaseID
     */
    public java.lang.Object getPhaseID() {
        return phaseID;
    }


    /**
     * Sets the phaseID value for this Task.
     * 
     * @param phaseID
     */
    public void setPhaseID(java.lang.Object phaseID) {
        this.phaseID = phaseID;
    }


    /**
     * Gets the priority value for this Task.
     * 
     * @return priority
     */
    public java.lang.Object getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Task.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Object priority) {
        this.priority = priority;
    }


    /**
     * Gets the projectID value for this Task.
     * 
     * @return projectID
     */
    public java.lang.Object getProjectID() {
        return projectID;
    }


    /**
     * Sets the projectID value for this Task.
     * 
     * @param projectID
     */
    public void setProjectID(java.lang.Object projectID) {
        this.projectID = projectID;
    }


    /**
     * Gets the purchaseOrderNumber value for this Task.
     * 
     * @return purchaseOrderNumber
     */
    public java.lang.Object getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }


    /**
     * Sets the purchaseOrderNumber value for this Task.
     * 
     * @param purchaseOrderNumber
     */
    public void setPurchaseOrderNumber(java.lang.Object purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }


    /**
     * Gets the remainingHours value for this Task.
     * 
     * @return remainingHours
     */
    public java.lang.Object getRemainingHours() {
        return remainingHours;
    }


    /**
     * Sets the remainingHours value for this Task.
     * 
     * @param remainingHours
     */
    public void setRemainingHours(java.lang.Object remainingHours) {
        this.remainingHours = remainingHours;
    }


    /**
     * Gets the startDateTime value for this Task.
     * 
     * @return startDateTime
     */
    public java.lang.Object getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this Task.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.Object startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the status value for this Task.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Task.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the taskIsBillable value for this Task.
     * 
     * @return taskIsBillable
     */
    public java.lang.Object getTaskIsBillable() {
        return taskIsBillable;
    }


    /**
     * Sets the taskIsBillable value for this Task.
     * 
     * @param taskIsBillable
     */
    public void setTaskIsBillable(java.lang.Object taskIsBillable) {
        this.taskIsBillable = taskIsBillable;
    }


    /**
     * Gets the taskNumber value for this Task.
     * 
     * @return taskNumber
     */
    public java.lang.Object getTaskNumber() {
        return taskNumber;
    }


    /**
     * Sets the taskNumber value for this Task.
     * 
     * @param taskNumber
     */
    public void setTaskNumber(java.lang.Object taskNumber) {
        this.taskNumber = taskNumber;
    }


    /**
     * Gets the taskType value for this Task.
     * 
     * @return taskType
     */
    public java.lang.Object getTaskType() {
        return taskType;
    }


    /**
     * Sets the taskType value for this Task.
     * 
     * @param taskType
     */
    public void setTaskType(java.lang.Object taskType) {
        this.taskType = taskType;
    }


    /**
     * Gets the title value for this Task.
     * 
     * @return title
     */
    public java.lang.Object getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Task.
     * 
     * @param title
     */
    public void setTitle(java.lang.Object title) {
        this.title = title;
    }


    /**
     * Gets the priorityLabel value for this Task.
     * 
     * @return priorityLabel
     */
    public java.lang.Object getPriorityLabel() {
        return priorityLabel;
    }


    /**
     * Sets the priorityLabel value for this Task.
     * 
     * @param priorityLabel
     */
    public void setPriorityLabel(java.lang.Object priorityLabel) {
        this.priorityLabel = priorityLabel;
    }


    /**
     * Gets the creatorType value for this Task.
     * 
     * @return creatorType
     */
    public java.lang.Object getCreatorType() {
        return creatorType;
    }


    /**
     * Sets the creatorType value for this Task.
     * 
     * @param creatorType
     */
    public void setCreatorType(java.lang.Object creatorType) {
        this.creatorType = creatorType;
    }


    /**
     * Gets the completedByResourceID value for this Task.
     * 
     * @return completedByResourceID
     */
    public java.lang.Object getCompletedByResourceID() {
        return completedByResourceID;
    }


    /**
     * Sets the completedByResourceID value for this Task.
     * 
     * @param completedByResourceID
     */
    public void setCompletedByResourceID(java.lang.Object completedByResourceID) {
        this.completedByResourceID = completedByResourceID;
    }


    /**
     * Gets the completedByType value for this Task.
     * 
     * @return completedByType
     */
    public java.lang.Object getCompletedByType() {
        return completedByType;
    }


    /**
     * Sets the completedByType value for this Task.
     * 
     * @param completedByType
     */
    public void setCompletedByType(java.lang.Object completedByType) {
        this.completedByType = completedByType;
    }


    /**
     * Gets the lastActivityResourceID value for this Task.
     * 
     * @return lastActivityResourceID
     */
    public java.lang.Object getLastActivityResourceID() {
        return lastActivityResourceID;
    }


    /**
     * Sets the lastActivityResourceID value for this Task.
     * 
     * @param lastActivityResourceID
     */
    public void setLastActivityResourceID(java.lang.Object lastActivityResourceID) {
        this.lastActivityResourceID = lastActivityResourceID;
    }


    /**
     * Gets the lastActivityPersonType value for this Task.
     * 
     * @return lastActivityPersonType
     */
    public java.lang.Object getLastActivityPersonType() {
        return lastActivityPersonType;
    }


    /**
     * Sets the lastActivityPersonType value for this Task.
     * 
     * @param lastActivityPersonType
     */
    public void setLastActivityPersonType(java.lang.Object lastActivityPersonType) {
        this.lastActivityPersonType = lastActivityPersonType;
    }


    /**
     * Gets the accountPhysicalLocationID value for this Task.
     * 
     * @return accountPhysicalLocationID
     */
    public java.lang.Object getAccountPhysicalLocationID() {
        return accountPhysicalLocationID;
    }


    /**
     * Sets the accountPhysicalLocationID value for this Task.
     * 
     * @param accountPhysicalLocationID
     */
    public void setAccountPhysicalLocationID(java.lang.Object accountPhysicalLocationID) {
        this.accountPhysicalLocationID = accountPhysicalLocationID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Task)) return false;
        Task other = (Task) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allocationCodeID==null && other.getAllocationCodeID()==null) || 
             (this.allocationCodeID!=null &&
              this.allocationCodeID.equals(other.getAllocationCodeID()))) &&
            ((this.assignedResourceID==null && other.getAssignedResourceID()==null) || 
             (this.assignedResourceID!=null &&
              this.assignedResourceID.equals(other.getAssignedResourceID()))) &&
            ((this.assignedResourceRoleID==null && other.getAssignedResourceRoleID()==null) || 
             (this.assignedResourceRoleID!=null &&
              this.assignedResourceRoleID.equals(other.getAssignedResourceRoleID()))) &&
            ((this.canClientPortalUserCompleteTask==null && other.getCanClientPortalUserCompleteTask()==null) || 
             (this.canClientPortalUserCompleteTask!=null &&
              this.canClientPortalUserCompleteTask.equals(other.getCanClientPortalUserCompleteTask()))) &&
            ((this.completedDateTime==null && other.getCompletedDateTime()==null) || 
             (this.completedDateTime!=null &&
              this.completedDateTime.equals(other.getCompletedDateTime()))) &&
            ((this.createDateTime==null && other.getCreateDateTime()==null) || 
             (this.createDateTime!=null &&
              this.createDateTime.equals(other.getCreateDateTime()))) &&
            ((this.creatorResourceID==null && other.getCreatorResourceID()==null) || 
             (this.creatorResourceID!=null &&
              this.creatorResourceID.equals(other.getCreatorResourceID()))) &&
            ((this.departmentID==null && other.getDepartmentID()==null) || 
             (this.departmentID!=null &&
              this.departmentID.equals(other.getDepartmentID()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.estimatedHours==null && other.getEstimatedHours()==null) || 
             (this.estimatedHours!=null &&
              this.estimatedHours.equals(other.getEstimatedHours()))) &&
            ((this.externalID==null && other.getExternalID()==null) || 
             (this.externalID!=null &&
              this.externalID.equals(other.getExternalID()))) &&
            ((this.hoursToBeScheduled==null && other.getHoursToBeScheduled()==null) || 
             (this.hoursToBeScheduled!=null &&
              this.hoursToBeScheduled.equals(other.getHoursToBeScheduled()))) &&
            ((this.isVisibleInClientPortal==null && other.getIsVisibleInClientPortal()==null) || 
             (this.isVisibleInClientPortal!=null &&
              this.isVisibleInClientPortal.equals(other.getIsVisibleInClientPortal()))) &&
            ((this.lastActivityDateTime==null && other.getLastActivityDateTime()==null) || 
             (this.lastActivityDateTime!=null &&
              this.lastActivityDateTime.equals(other.getLastActivityDateTime()))) &&
            ((this.phaseID==null && other.getPhaseID()==null) || 
             (this.phaseID!=null &&
              this.phaseID.equals(other.getPhaseID()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.projectID==null && other.getProjectID()==null) || 
             (this.projectID!=null &&
              this.projectID.equals(other.getProjectID()))) &&
            ((this.purchaseOrderNumber==null && other.getPurchaseOrderNumber()==null) || 
             (this.purchaseOrderNumber!=null &&
              this.purchaseOrderNumber.equals(other.getPurchaseOrderNumber()))) &&
            ((this.remainingHours==null && other.getRemainingHours()==null) || 
             (this.remainingHours!=null &&
              this.remainingHours.equals(other.getRemainingHours()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.taskIsBillable==null && other.getTaskIsBillable()==null) || 
             (this.taskIsBillable!=null &&
              this.taskIsBillable.equals(other.getTaskIsBillable()))) &&
            ((this.taskNumber==null && other.getTaskNumber()==null) || 
             (this.taskNumber!=null &&
              this.taskNumber.equals(other.getTaskNumber()))) &&
            ((this.taskType==null && other.getTaskType()==null) || 
             (this.taskType!=null &&
              this.taskType.equals(other.getTaskType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.priorityLabel==null && other.getPriorityLabel()==null) || 
             (this.priorityLabel!=null &&
              this.priorityLabel.equals(other.getPriorityLabel()))) &&
            ((this.creatorType==null && other.getCreatorType()==null) || 
             (this.creatorType!=null &&
              this.creatorType.equals(other.getCreatorType()))) &&
            ((this.completedByResourceID==null && other.getCompletedByResourceID()==null) || 
             (this.completedByResourceID!=null &&
              this.completedByResourceID.equals(other.getCompletedByResourceID()))) &&
            ((this.completedByType==null && other.getCompletedByType()==null) || 
             (this.completedByType!=null &&
              this.completedByType.equals(other.getCompletedByType()))) &&
            ((this.lastActivityResourceID==null && other.getLastActivityResourceID()==null) || 
             (this.lastActivityResourceID!=null &&
              this.lastActivityResourceID.equals(other.getLastActivityResourceID()))) &&
            ((this.lastActivityPersonType==null && other.getLastActivityPersonType()==null) || 
             (this.lastActivityPersonType!=null &&
              this.lastActivityPersonType.equals(other.getLastActivityPersonType()))) &&
            ((this.accountPhysicalLocationID==null && other.getAccountPhysicalLocationID()==null) || 
             (this.accountPhysicalLocationID!=null &&
              this.accountPhysicalLocationID.equals(other.getAccountPhysicalLocationID())));
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
        if (getAllocationCodeID() != null) {
            _hashCode += getAllocationCodeID().hashCode();
        }
        if (getAssignedResourceID() != null) {
            _hashCode += getAssignedResourceID().hashCode();
        }
        if (getAssignedResourceRoleID() != null) {
            _hashCode += getAssignedResourceRoleID().hashCode();
        }
        if (getCanClientPortalUserCompleteTask() != null) {
            _hashCode += getCanClientPortalUserCompleteTask().hashCode();
        }
        if (getCompletedDateTime() != null) {
            _hashCode += getCompletedDateTime().hashCode();
        }
        if (getCreateDateTime() != null) {
            _hashCode += getCreateDateTime().hashCode();
        }
        if (getCreatorResourceID() != null) {
            _hashCode += getCreatorResourceID().hashCode();
        }
        if (getDepartmentID() != null) {
            _hashCode += getDepartmentID().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getEstimatedHours() != null) {
            _hashCode += getEstimatedHours().hashCode();
        }
        if (getExternalID() != null) {
            _hashCode += getExternalID().hashCode();
        }
        if (getHoursToBeScheduled() != null) {
            _hashCode += getHoursToBeScheduled().hashCode();
        }
        if (getIsVisibleInClientPortal() != null) {
            _hashCode += getIsVisibleInClientPortal().hashCode();
        }
        if (getLastActivityDateTime() != null) {
            _hashCode += getLastActivityDateTime().hashCode();
        }
        if (getPhaseID() != null) {
            _hashCode += getPhaseID().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getProjectID() != null) {
            _hashCode += getProjectID().hashCode();
        }
        if (getPurchaseOrderNumber() != null) {
            _hashCode += getPurchaseOrderNumber().hashCode();
        }
        if (getRemainingHours() != null) {
            _hashCode += getRemainingHours().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTaskIsBillable() != null) {
            _hashCode += getTaskIsBillable().hashCode();
        }
        if (getTaskNumber() != null) {
            _hashCode += getTaskNumber().hashCode();
        }
        if (getTaskType() != null) {
            _hashCode += getTaskType().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getPriorityLabel() != null) {
            _hashCode += getPriorityLabel().hashCode();
        }
        if (getCreatorType() != null) {
            _hashCode += getCreatorType().hashCode();
        }
        if (getCompletedByResourceID() != null) {
            _hashCode += getCompletedByResourceID().hashCode();
        }
        if (getCompletedByType() != null) {
            _hashCode += getCompletedByType().hashCode();
        }
        if (getLastActivityResourceID() != null) {
            _hashCode += getLastActivityResourceID().hashCode();
        }
        if (getLastActivityPersonType() != null) {
            _hashCode += getLastActivityPersonType().hashCode();
        }
        if (getAccountPhysicalLocationID() != null) {
            _hashCode += getAccountPhysicalLocationID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Task.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Task"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AllocationCodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AssignedResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedResourceRoleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AssignedResourceRoleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canClientPortalUserCompleteTask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CanClientPortalUserCompleteTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompletedDateTime"));
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
        elemField.setFieldName("creatorResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreatorResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DepartmentID"));
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
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EstimatedHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExternalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursToBeScheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HoursToBeScheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisibleInClientPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IsVisibleInClientPortal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivityDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastActivityDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phaseID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PhaseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Priority"));
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
        elemField.setFieldName("purchaseOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PurchaseOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RemainingHours"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskIsBillable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaskIsBillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaskNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TaskType"));
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
        elemField.setFieldName("priorityLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PriorityLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreatorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedByResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompletedByResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedByType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompletedByType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivityResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastActivityResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivityPersonType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastActivityPersonType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountPhysicalLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountPhysicalLocationID"));
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
