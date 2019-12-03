/**
 * Ticket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Ticket  extends Entity  implements java.io.Serializable {
    private java.lang.Object accountID;

    private java.lang.Object allocationCodeID;

    private java.lang.Object completedDate;

    private java.lang.Object contactID;

    private java.lang.Object contractID;

    private java.lang.Object createDate;

    private java.lang.Object creatorResourceID;

    private java.lang.Object description;

    private java.lang.Object dueDateTime;

    private java.lang.Object estimatedHours;

    private java.lang.Object installedProductID;

    private java.lang.Object issueType;

    private java.lang.Object lastActivityDate;

    private java.lang.Object priority;

    private java.lang.Object queueID;

    private java.lang.Object assignedResourceID;

    private java.lang.Object assignedResourceRoleID;

    private java.lang.Object source;

    private java.lang.Object status;

    private java.lang.Object subIssueType;

    private java.lang.Object ticketNumber;

    private java.lang.Object title;

    private java.lang.Object firstResponseDateTime;

    private java.lang.Object resolutionPlanDateTime;

    private java.lang.Object resolvedDateTime;

    private java.lang.Object firstResponseDueDateTime;

    private java.lang.Object resolutionPlanDueDateTime;

    private java.lang.Object resolvedDueDateTime;

    private java.lang.Object serviceLevelAgreementID;

    private java.lang.Object serviceLevelAgreementHasBeenMet;

    private java.lang.Object resolution;

    private java.lang.Object purchaseOrderNumber;

    private java.lang.Object ticketType;

    private java.lang.Object problemTicketId;

    private java.lang.Object opportunityId;

    private java.lang.Object changeApprovalBoard;

    private java.lang.Object changeApprovalType;

    private java.lang.Object changeApprovalStatus;

    private java.lang.Object changeInfoField1;

    private java.lang.Object changeInfoField2;

    private java.lang.Object changeInfoField3;

    private java.lang.Object changeInfoField4;

    private java.lang.Object changeInfoField5;

    private java.lang.Object lastCustomerNotificationDateTime;

    private java.lang.Object lastCustomerVisibleActivityDateTime;

    private java.lang.Object contractServiceID;

    private java.lang.Object contractServiceBundleID;

    private java.lang.Object hoursToBeScheduled;

    private java.lang.Object monitorTypeID;

    private java.lang.Object monitorID;

    private java.lang.Object AEMAlertID;

    private java.lang.Object ticketCategory;

    private java.lang.Object externalID;

    private java.lang.Object firstResponseInitiatingResourceID;

    private java.lang.Object firstResponseAssignedResourceID;

    private java.lang.Object projectID;

    private java.lang.Object businessDivisionSubdivisionID;

    private java.lang.Object creatorType;

    private java.lang.Object completedByResourceID;

    private java.lang.Object accountPhysicalLocationID;

    private java.lang.Object lastActivityPersonType;

    private java.lang.Object lastActivityResourceID;

    private java.lang.Object serviceLevelAgreementPausedNextEventHours;

    private java.lang.Object currentServiceThermometerRating;

    private java.lang.Object previousServiceThermometerRating;

    private java.lang.Object serviceThermometerTemperature;

    private java.lang.Object apiVendorID;

    public Ticket() {super();
    }

    public Ticket(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountID,
           java.lang.Object allocationCodeID,
           java.lang.Object completedDate,
           java.lang.Object contactID,
           java.lang.Object contractID,
           java.lang.Object createDate,
           java.lang.Object creatorResourceID,
           java.lang.Object description,
           java.lang.Object dueDateTime,
           java.lang.Object estimatedHours,
           java.lang.Object installedProductID,
           java.lang.Object issueType,
           java.lang.Object lastActivityDate,
           java.lang.Object priority,
           java.lang.Object queueID,
           java.lang.Object assignedResourceID,
           java.lang.Object assignedResourceRoleID,
           java.lang.Object source,
           java.lang.Object status,
           java.lang.Object subIssueType,
           java.lang.Object ticketNumber,
           java.lang.Object title,
           java.lang.Object firstResponseDateTime,
           java.lang.Object resolutionPlanDateTime,
           java.lang.Object resolvedDateTime,
           java.lang.Object firstResponseDueDateTime,
           java.lang.Object resolutionPlanDueDateTime,
           java.lang.Object resolvedDueDateTime,
           java.lang.Object serviceLevelAgreementID,
           java.lang.Object serviceLevelAgreementHasBeenMet,
           java.lang.Object resolution,
           java.lang.Object purchaseOrderNumber,
           java.lang.Object ticketType,
           java.lang.Object problemTicketId,
           java.lang.Object opportunityId,
           java.lang.Object changeApprovalBoard,
           java.lang.Object changeApprovalType,
           java.lang.Object changeApprovalStatus,
           java.lang.Object changeInfoField1,
           java.lang.Object changeInfoField2,
           java.lang.Object changeInfoField3,
           java.lang.Object changeInfoField4,
           java.lang.Object changeInfoField5,
           java.lang.Object lastCustomerNotificationDateTime,
           java.lang.Object lastCustomerVisibleActivityDateTime,
           java.lang.Object contractServiceID,
           java.lang.Object contractServiceBundleID,
           java.lang.Object hoursToBeScheduled,
           java.lang.Object monitorTypeID,
           java.lang.Object monitorID,
           java.lang.Object AEMAlertID,
           java.lang.Object ticketCategory,
           java.lang.Object externalID,
           java.lang.Object firstResponseInitiatingResourceID,
           java.lang.Object firstResponseAssignedResourceID,
           java.lang.Object projectID,
           java.lang.Object businessDivisionSubdivisionID,
           java.lang.Object creatorType,
           java.lang.Object completedByResourceID,
           java.lang.Object accountPhysicalLocationID,
           java.lang.Object lastActivityPersonType,
           java.lang.Object lastActivityResourceID,
           java.lang.Object serviceLevelAgreementPausedNextEventHours,
           java.lang.Object currentServiceThermometerRating,
           java.lang.Object previousServiceThermometerRating,
           java.lang.Object serviceThermometerTemperature,
           java.lang.Object apiVendorID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountID = accountID;
        this.allocationCodeID = allocationCodeID;
        this.completedDate = completedDate;
        this.contactID = contactID;
        this.contractID = contractID;
        this.createDate = createDate;
        this.creatorResourceID = creatorResourceID;
        this.description = description;
        this.dueDateTime = dueDateTime;
        this.estimatedHours = estimatedHours;
        this.installedProductID = installedProductID;
        this.issueType = issueType;
        this.lastActivityDate = lastActivityDate;
        this.priority = priority;
        this.queueID = queueID;
        this.assignedResourceID = assignedResourceID;
        this.assignedResourceRoleID = assignedResourceRoleID;
        this.source = source;
        this.status = status;
        this.subIssueType = subIssueType;
        this.ticketNumber = ticketNumber;
        this.title = title;
        this.firstResponseDateTime = firstResponseDateTime;
        this.resolutionPlanDateTime = resolutionPlanDateTime;
        this.resolvedDateTime = resolvedDateTime;
        this.firstResponseDueDateTime = firstResponseDueDateTime;
        this.resolutionPlanDueDateTime = resolutionPlanDueDateTime;
        this.resolvedDueDateTime = resolvedDueDateTime;
        this.serviceLevelAgreementID = serviceLevelAgreementID;
        this.serviceLevelAgreementHasBeenMet = serviceLevelAgreementHasBeenMet;
        this.resolution = resolution;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.ticketType = ticketType;
        this.problemTicketId = problemTicketId;
        this.opportunityId = opportunityId;
        this.changeApprovalBoard = changeApprovalBoard;
        this.changeApprovalType = changeApprovalType;
        this.changeApprovalStatus = changeApprovalStatus;
        this.changeInfoField1 = changeInfoField1;
        this.changeInfoField2 = changeInfoField2;
        this.changeInfoField3 = changeInfoField3;
        this.changeInfoField4 = changeInfoField4;
        this.changeInfoField5 = changeInfoField5;
        this.lastCustomerNotificationDateTime = lastCustomerNotificationDateTime;
        this.lastCustomerVisibleActivityDateTime = lastCustomerVisibleActivityDateTime;
        this.contractServiceID = contractServiceID;
        this.contractServiceBundleID = contractServiceBundleID;
        this.hoursToBeScheduled = hoursToBeScheduled;
        this.monitorTypeID = monitorTypeID;
        this.monitorID = monitorID;
        this.AEMAlertID = AEMAlertID;
        this.ticketCategory = ticketCategory;
        this.externalID = externalID;
        this.firstResponseInitiatingResourceID = firstResponseInitiatingResourceID;
        this.firstResponseAssignedResourceID = firstResponseAssignedResourceID;
        this.projectID = projectID;
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
        this.creatorType = creatorType;
        this.completedByResourceID = completedByResourceID;
        this.accountPhysicalLocationID = accountPhysicalLocationID;
        this.lastActivityPersonType = lastActivityPersonType;
        this.lastActivityResourceID = lastActivityResourceID;
        this.serviceLevelAgreementPausedNextEventHours = serviceLevelAgreementPausedNextEventHours;
        this.currentServiceThermometerRating = currentServiceThermometerRating;
        this.previousServiceThermometerRating = previousServiceThermometerRating;
        this.serviceThermometerTemperature = serviceThermometerTemperature;
        this.apiVendorID = apiVendorID;
    }


    /**
     * Gets the accountID value for this Ticket.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this Ticket.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the allocationCodeID value for this Ticket.
     * 
     * @return allocationCodeID
     */
    public java.lang.Object getAllocationCodeID() {
        return allocationCodeID;
    }


    /**
     * Sets the allocationCodeID value for this Ticket.
     * 
     * @param allocationCodeID
     */
    public void setAllocationCodeID(java.lang.Object allocationCodeID) {
        this.allocationCodeID = allocationCodeID;
    }


    /**
     * Gets the completedDate value for this Ticket.
     * 
     * @return completedDate
     */
    public java.lang.Object getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this Ticket.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.lang.Object completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the contactID value for this Ticket.
     * 
     * @return contactID
     */
    public java.lang.Object getContactID() {
        return contactID;
    }


    /**
     * Sets the contactID value for this Ticket.
     * 
     * @param contactID
     */
    public void setContactID(java.lang.Object contactID) {
        this.contactID = contactID;
    }


    /**
     * Gets the contractID value for this Ticket.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this Ticket.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the createDate value for this Ticket.
     * 
     * @return createDate
     */
    public java.lang.Object getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this Ticket.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.Object createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the creatorResourceID value for this Ticket.
     * 
     * @return creatorResourceID
     */
    public java.lang.Object getCreatorResourceID() {
        return creatorResourceID;
    }


    /**
     * Sets the creatorResourceID value for this Ticket.
     * 
     * @param creatorResourceID
     */
    public void setCreatorResourceID(java.lang.Object creatorResourceID) {
        this.creatorResourceID = creatorResourceID;
    }


    /**
     * Gets the description value for this Ticket.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Ticket.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the dueDateTime value for this Ticket.
     * 
     * @return dueDateTime
     */
    public java.lang.Object getDueDateTime() {
        return dueDateTime;
    }


    /**
     * Sets the dueDateTime value for this Ticket.
     * 
     * @param dueDateTime
     */
    public void setDueDateTime(java.lang.Object dueDateTime) {
        this.dueDateTime = dueDateTime;
    }


    /**
     * Gets the estimatedHours value for this Ticket.
     * 
     * @return estimatedHours
     */
    public java.lang.Object getEstimatedHours() {
        return estimatedHours;
    }


    /**
     * Sets the estimatedHours value for this Ticket.
     * 
     * @param estimatedHours
     */
    public void setEstimatedHours(java.lang.Object estimatedHours) {
        this.estimatedHours = estimatedHours;
    }


    /**
     * Gets the installedProductID value for this Ticket.
     * 
     * @return installedProductID
     */
    public java.lang.Object getInstalledProductID() {
        return installedProductID;
    }


    /**
     * Sets the installedProductID value for this Ticket.
     * 
     * @param installedProductID
     */
    public void setInstalledProductID(java.lang.Object installedProductID) {
        this.installedProductID = installedProductID;
    }


    /**
     * Gets the issueType value for this Ticket.
     * 
     * @return issueType
     */
    public java.lang.Object getIssueType() {
        return issueType;
    }


    /**
     * Sets the issueType value for this Ticket.
     * 
     * @param issueType
     */
    public void setIssueType(java.lang.Object issueType) {
        this.issueType = issueType;
    }


    /**
     * Gets the lastActivityDate value for this Ticket.
     * 
     * @return lastActivityDate
     */
    public java.lang.Object getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Ticket.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.lang.Object lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the priority value for this Ticket.
     * 
     * @return priority
     */
    public java.lang.Object getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Ticket.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Object priority) {
        this.priority = priority;
    }


    /**
     * Gets the queueID value for this Ticket.
     * 
     * @return queueID
     */
    public java.lang.Object getQueueID() {
        return queueID;
    }


    /**
     * Sets the queueID value for this Ticket.
     * 
     * @param queueID
     */
    public void setQueueID(java.lang.Object queueID) {
        this.queueID = queueID;
    }


    /**
     * Gets the assignedResourceID value for this Ticket.
     * 
     * @return assignedResourceID
     */
    public java.lang.Object getAssignedResourceID() {
        return assignedResourceID;
    }


    /**
     * Sets the assignedResourceID value for this Ticket.
     * 
     * @param assignedResourceID
     */
    public void setAssignedResourceID(java.lang.Object assignedResourceID) {
        this.assignedResourceID = assignedResourceID;
    }


    /**
     * Gets the assignedResourceRoleID value for this Ticket.
     * 
     * @return assignedResourceRoleID
     */
    public java.lang.Object getAssignedResourceRoleID() {
        return assignedResourceRoleID;
    }


    /**
     * Sets the assignedResourceRoleID value for this Ticket.
     * 
     * @param assignedResourceRoleID
     */
    public void setAssignedResourceRoleID(java.lang.Object assignedResourceRoleID) {
        this.assignedResourceRoleID = assignedResourceRoleID;
    }


    /**
     * Gets the source value for this Ticket.
     * 
     * @return source
     */
    public java.lang.Object getSource() {
        return source;
    }


    /**
     * Sets the source value for this Ticket.
     * 
     * @param source
     */
    public void setSource(java.lang.Object source) {
        this.source = source;
    }


    /**
     * Gets the status value for this Ticket.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Ticket.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the subIssueType value for this Ticket.
     * 
     * @return subIssueType
     */
    public java.lang.Object getSubIssueType() {
        return subIssueType;
    }


    /**
     * Sets the subIssueType value for this Ticket.
     * 
     * @param subIssueType
     */
    public void setSubIssueType(java.lang.Object subIssueType) {
        this.subIssueType = subIssueType;
    }


    /**
     * Gets the ticketNumber value for this Ticket.
     * 
     * @return ticketNumber
     */
    public java.lang.Object getTicketNumber() {
        return ticketNumber;
    }


    /**
     * Sets the ticketNumber value for this Ticket.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(java.lang.Object ticketNumber) {
        this.ticketNumber = ticketNumber;
    }


    /**
     * Gets the title value for this Ticket.
     * 
     * @return title
     */
    public java.lang.Object getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Ticket.
     * 
     * @param title
     */
    public void setTitle(java.lang.Object title) {
        this.title = title;
    }


    /**
     * Gets the firstResponseDateTime value for this Ticket.
     * 
     * @return firstResponseDateTime
     */
    public java.lang.Object getFirstResponseDateTime() {
        return firstResponseDateTime;
    }


    /**
     * Sets the firstResponseDateTime value for this Ticket.
     * 
     * @param firstResponseDateTime
     */
    public void setFirstResponseDateTime(java.lang.Object firstResponseDateTime) {
        this.firstResponseDateTime = firstResponseDateTime;
    }


    /**
     * Gets the resolutionPlanDateTime value for this Ticket.
     * 
     * @return resolutionPlanDateTime
     */
    public java.lang.Object getResolutionPlanDateTime() {
        return resolutionPlanDateTime;
    }


    /**
     * Sets the resolutionPlanDateTime value for this Ticket.
     * 
     * @param resolutionPlanDateTime
     */
    public void setResolutionPlanDateTime(java.lang.Object resolutionPlanDateTime) {
        this.resolutionPlanDateTime = resolutionPlanDateTime;
    }


    /**
     * Gets the resolvedDateTime value for this Ticket.
     * 
     * @return resolvedDateTime
     */
    public java.lang.Object getResolvedDateTime() {
        return resolvedDateTime;
    }


    /**
     * Sets the resolvedDateTime value for this Ticket.
     * 
     * @param resolvedDateTime
     */
    public void setResolvedDateTime(java.lang.Object resolvedDateTime) {
        this.resolvedDateTime = resolvedDateTime;
    }


    /**
     * Gets the firstResponseDueDateTime value for this Ticket.
     * 
     * @return firstResponseDueDateTime
     */
    public java.lang.Object getFirstResponseDueDateTime() {
        return firstResponseDueDateTime;
    }


    /**
     * Sets the firstResponseDueDateTime value for this Ticket.
     * 
     * @param firstResponseDueDateTime
     */
    public void setFirstResponseDueDateTime(java.lang.Object firstResponseDueDateTime) {
        this.firstResponseDueDateTime = firstResponseDueDateTime;
    }


    /**
     * Gets the resolutionPlanDueDateTime value for this Ticket.
     * 
     * @return resolutionPlanDueDateTime
     */
    public java.lang.Object getResolutionPlanDueDateTime() {
        return resolutionPlanDueDateTime;
    }


    /**
     * Sets the resolutionPlanDueDateTime value for this Ticket.
     * 
     * @param resolutionPlanDueDateTime
     */
    public void setResolutionPlanDueDateTime(java.lang.Object resolutionPlanDueDateTime) {
        this.resolutionPlanDueDateTime = resolutionPlanDueDateTime;
    }


    /**
     * Gets the resolvedDueDateTime value for this Ticket.
     * 
     * @return resolvedDueDateTime
     */
    public java.lang.Object getResolvedDueDateTime() {
        return resolvedDueDateTime;
    }


    /**
     * Sets the resolvedDueDateTime value for this Ticket.
     * 
     * @param resolvedDueDateTime
     */
    public void setResolvedDueDateTime(java.lang.Object resolvedDueDateTime) {
        this.resolvedDueDateTime = resolvedDueDateTime;
    }


    /**
     * Gets the serviceLevelAgreementID value for this Ticket.
     * 
     * @return serviceLevelAgreementID
     */
    public java.lang.Object getServiceLevelAgreementID() {
        return serviceLevelAgreementID;
    }


    /**
     * Sets the serviceLevelAgreementID value for this Ticket.
     * 
     * @param serviceLevelAgreementID
     */
    public void setServiceLevelAgreementID(java.lang.Object serviceLevelAgreementID) {
        this.serviceLevelAgreementID = serviceLevelAgreementID;
    }


    /**
     * Gets the serviceLevelAgreementHasBeenMet value for this Ticket.
     * 
     * @return serviceLevelAgreementHasBeenMet
     */
    public java.lang.Object getServiceLevelAgreementHasBeenMet() {
        return serviceLevelAgreementHasBeenMet;
    }


    /**
     * Sets the serviceLevelAgreementHasBeenMet value for this Ticket.
     * 
     * @param serviceLevelAgreementHasBeenMet
     */
    public void setServiceLevelAgreementHasBeenMet(java.lang.Object serviceLevelAgreementHasBeenMet) {
        this.serviceLevelAgreementHasBeenMet = serviceLevelAgreementHasBeenMet;
    }


    /**
     * Gets the resolution value for this Ticket.
     * 
     * @return resolution
     */
    public java.lang.Object getResolution() {
        return resolution;
    }


    /**
     * Sets the resolution value for this Ticket.
     * 
     * @param resolution
     */
    public void setResolution(java.lang.Object resolution) {
        this.resolution = resolution;
    }


    /**
     * Gets the purchaseOrderNumber value for this Ticket.
     * 
     * @return purchaseOrderNumber
     */
    public java.lang.Object getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }


    /**
     * Sets the purchaseOrderNumber value for this Ticket.
     * 
     * @param purchaseOrderNumber
     */
    public void setPurchaseOrderNumber(java.lang.Object purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }


    /**
     * Gets the ticketType value for this Ticket.
     * 
     * @return ticketType
     */
    public java.lang.Object getTicketType() {
        return ticketType;
    }


    /**
     * Sets the ticketType value for this Ticket.
     * 
     * @param ticketType
     */
    public void setTicketType(java.lang.Object ticketType) {
        this.ticketType = ticketType;
    }


    /**
     * Gets the problemTicketId value for this Ticket.
     * 
     * @return problemTicketId
     */
    public java.lang.Object getProblemTicketId() {
        return problemTicketId;
    }


    /**
     * Sets the problemTicketId value for this Ticket.
     * 
     * @param problemTicketId
     */
    public void setProblemTicketId(java.lang.Object problemTicketId) {
        this.problemTicketId = problemTicketId;
    }


    /**
     * Gets the opportunityId value for this Ticket.
     * 
     * @return opportunityId
     */
    public java.lang.Object getOpportunityId() {
        return opportunityId;
    }


    /**
     * Sets the opportunityId value for this Ticket.
     * 
     * @param opportunityId
     */
    public void setOpportunityId(java.lang.Object opportunityId) {
        this.opportunityId = opportunityId;
    }


    /**
     * Gets the changeApprovalBoard value for this Ticket.
     * 
     * @return changeApprovalBoard
     */
    public java.lang.Object getChangeApprovalBoard() {
        return changeApprovalBoard;
    }


    /**
     * Sets the changeApprovalBoard value for this Ticket.
     * 
     * @param changeApprovalBoard
     */
    public void setChangeApprovalBoard(java.lang.Object changeApprovalBoard) {
        this.changeApprovalBoard = changeApprovalBoard;
    }


    /**
     * Gets the changeApprovalType value for this Ticket.
     * 
     * @return changeApprovalType
     */
    public java.lang.Object getChangeApprovalType() {
        return changeApprovalType;
    }


    /**
     * Sets the changeApprovalType value for this Ticket.
     * 
     * @param changeApprovalType
     */
    public void setChangeApprovalType(java.lang.Object changeApprovalType) {
        this.changeApprovalType = changeApprovalType;
    }


    /**
     * Gets the changeApprovalStatus value for this Ticket.
     * 
     * @return changeApprovalStatus
     */
    public java.lang.Object getChangeApprovalStatus() {
        return changeApprovalStatus;
    }


    /**
     * Sets the changeApprovalStatus value for this Ticket.
     * 
     * @param changeApprovalStatus
     */
    public void setChangeApprovalStatus(java.lang.Object changeApprovalStatus) {
        this.changeApprovalStatus = changeApprovalStatus;
    }


    /**
     * Gets the changeInfoField1 value for this Ticket.
     * 
     * @return changeInfoField1
     */
    public java.lang.Object getChangeInfoField1() {
        return changeInfoField1;
    }


    /**
     * Sets the changeInfoField1 value for this Ticket.
     * 
     * @param changeInfoField1
     */
    public void setChangeInfoField1(java.lang.Object changeInfoField1) {
        this.changeInfoField1 = changeInfoField1;
    }


    /**
     * Gets the changeInfoField2 value for this Ticket.
     * 
     * @return changeInfoField2
     */
    public java.lang.Object getChangeInfoField2() {
        return changeInfoField2;
    }


    /**
     * Sets the changeInfoField2 value for this Ticket.
     * 
     * @param changeInfoField2
     */
    public void setChangeInfoField2(java.lang.Object changeInfoField2) {
        this.changeInfoField2 = changeInfoField2;
    }


    /**
     * Gets the changeInfoField3 value for this Ticket.
     * 
     * @return changeInfoField3
     */
    public java.lang.Object getChangeInfoField3() {
        return changeInfoField3;
    }


    /**
     * Sets the changeInfoField3 value for this Ticket.
     * 
     * @param changeInfoField3
     */
    public void setChangeInfoField3(java.lang.Object changeInfoField3) {
        this.changeInfoField3 = changeInfoField3;
    }


    /**
     * Gets the changeInfoField4 value for this Ticket.
     * 
     * @return changeInfoField4
     */
    public java.lang.Object getChangeInfoField4() {
        return changeInfoField4;
    }


    /**
     * Sets the changeInfoField4 value for this Ticket.
     * 
     * @param changeInfoField4
     */
    public void setChangeInfoField4(java.lang.Object changeInfoField4) {
        this.changeInfoField4 = changeInfoField4;
    }


    /**
     * Gets the changeInfoField5 value for this Ticket.
     * 
     * @return changeInfoField5
     */
    public java.lang.Object getChangeInfoField5() {
        return changeInfoField5;
    }


    /**
     * Sets the changeInfoField5 value for this Ticket.
     * 
     * @param changeInfoField5
     */
    public void setChangeInfoField5(java.lang.Object changeInfoField5) {
        this.changeInfoField5 = changeInfoField5;
    }


    /**
     * Gets the lastCustomerNotificationDateTime value for this Ticket.
     * 
     * @return lastCustomerNotificationDateTime
     */
    public java.lang.Object getLastCustomerNotificationDateTime() {
        return lastCustomerNotificationDateTime;
    }


    /**
     * Sets the lastCustomerNotificationDateTime value for this Ticket.
     * 
     * @param lastCustomerNotificationDateTime
     */
    public void setLastCustomerNotificationDateTime(java.lang.Object lastCustomerNotificationDateTime) {
        this.lastCustomerNotificationDateTime = lastCustomerNotificationDateTime;
    }


    /**
     * Gets the lastCustomerVisibleActivityDateTime value for this Ticket.
     * 
     * @return lastCustomerVisibleActivityDateTime
     */
    public java.lang.Object getLastCustomerVisibleActivityDateTime() {
        return lastCustomerVisibleActivityDateTime;
    }


    /**
     * Sets the lastCustomerVisibleActivityDateTime value for this Ticket.
     * 
     * @param lastCustomerVisibleActivityDateTime
     */
    public void setLastCustomerVisibleActivityDateTime(java.lang.Object lastCustomerVisibleActivityDateTime) {
        this.lastCustomerVisibleActivityDateTime = lastCustomerVisibleActivityDateTime;
    }


    /**
     * Gets the contractServiceID value for this Ticket.
     * 
     * @return contractServiceID
     */
    public java.lang.Object getContractServiceID() {
        return contractServiceID;
    }


    /**
     * Sets the contractServiceID value for this Ticket.
     * 
     * @param contractServiceID
     */
    public void setContractServiceID(java.lang.Object contractServiceID) {
        this.contractServiceID = contractServiceID;
    }


    /**
     * Gets the contractServiceBundleID value for this Ticket.
     * 
     * @return contractServiceBundleID
     */
    public java.lang.Object getContractServiceBundleID() {
        return contractServiceBundleID;
    }


    /**
     * Sets the contractServiceBundleID value for this Ticket.
     * 
     * @param contractServiceBundleID
     */
    public void setContractServiceBundleID(java.lang.Object contractServiceBundleID) {
        this.contractServiceBundleID = contractServiceBundleID;
    }


    /**
     * Gets the hoursToBeScheduled value for this Ticket.
     * 
     * @return hoursToBeScheduled
     */
    public java.lang.Object getHoursToBeScheduled() {
        return hoursToBeScheduled;
    }


    /**
     * Sets the hoursToBeScheduled value for this Ticket.
     * 
     * @param hoursToBeScheduled
     */
    public void setHoursToBeScheduled(java.lang.Object hoursToBeScheduled) {
        this.hoursToBeScheduled = hoursToBeScheduled;
    }


    /**
     * Gets the monitorTypeID value for this Ticket.
     * 
     * @return monitorTypeID
     */
    public java.lang.Object getMonitorTypeID() {
        return monitorTypeID;
    }


    /**
     * Sets the monitorTypeID value for this Ticket.
     * 
     * @param monitorTypeID
     */
    public void setMonitorTypeID(java.lang.Object monitorTypeID) {
        this.monitorTypeID = monitorTypeID;
    }


    /**
     * Gets the monitorID value for this Ticket.
     * 
     * @return monitorID
     */
    public java.lang.Object getMonitorID() {
        return monitorID;
    }


    /**
     * Sets the monitorID value for this Ticket.
     * 
     * @param monitorID
     */
    public void setMonitorID(java.lang.Object monitorID) {
        this.monitorID = monitorID;
    }


    /**
     * Gets the AEMAlertID value for this Ticket.
     * 
     * @return AEMAlertID
     */
    public java.lang.Object getAEMAlertID() {
        return AEMAlertID;
    }


    /**
     * Sets the AEMAlertID value for this Ticket.
     * 
     * @param AEMAlertID
     */
    public void setAEMAlertID(java.lang.Object AEMAlertID) {
        this.AEMAlertID = AEMAlertID;
    }


    /**
     * Gets the ticketCategory value for this Ticket.
     * 
     * @return ticketCategory
     */
    public java.lang.Object getTicketCategory() {
        return ticketCategory;
    }


    /**
     * Sets the ticketCategory value for this Ticket.
     * 
     * @param ticketCategory
     */
    public void setTicketCategory(java.lang.Object ticketCategory) {
        this.ticketCategory = ticketCategory;
    }


    /**
     * Gets the externalID value for this Ticket.
     * 
     * @return externalID
     */
    public java.lang.Object getExternalID() {
        return externalID;
    }


    /**
     * Sets the externalID value for this Ticket.
     * 
     * @param externalID
     */
    public void setExternalID(java.lang.Object externalID) {
        this.externalID = externalID;
    }


    /**
     * Gets the firstResponseInitiatingResourceID value for this Ticket.
     * 
     * @return firstResponseInitiatingResourceID
     */
    public java.lang.Object getFirstResponseInitiatingResourceID() {
        return firstResponseInitiatingResourceID;
    }


    /**
     * Sets the firstResponseInitiatingResourceID value for this Ticket.
     * 
     * @param firstResponseInitiatingResourceID
     */
    public void setFirstResponseInitiatingResourceID(java.lang.Object firstResponseInitiatingResourceID) {
        this.firstResponseInitiatingResourceID = firstResponseInitiatingResourceID;
    }


    /**
     * Gets the firstResponseAssignedResourceID value for this Ticket.
     * 
     * @return firstResponseAssignedResourceID
     */
    public java.lang.Object getFirstResponseAssignedResourceID() {
        return firstResponseAssignedResourceID;
    }


    /**
     * Sets the firstResponseAssignedResourceID value for this Ticket.
     * 
     * @param firstResponseAssignedResourceID
     */
    public void setFirstResponseAssignedResourceID(java.lang.Object firstResponseAssignedResourceID) {
        this.firstResponseAssignedResourceID = firstResponseAssignedResourceID;
    }


    /**
     * Gets the projectID value for this Ticket.
     * 
     * @return projectID
     */
    public java.lang.Object getProjectID() {
        return projectID;
    }


    /**
     * Sets the projectID value for this Ticket.
     * 
     * @param projectID
     */
    public void setProjectID(java.lang.Object projectID) {
        this.projectID = projectID;
    }


    /**
     * Gets the businessDivisionSubdivisionID value for this Ticket.
     * 
     * @return businessDivisionSubdivisionID
     */
    public java.lang.Object getBusinessDivisionSubdivisionID() {
        return businessDivisionSubdivisionID;
    }


    /**
     * Sets the businessDivisionSubdivisionID value for this Ticket.
     * 
     * @param businessDivisionSubdivisionID
     */
    public void setBusinessDivisionSubdivisionID(java.lang.Object businessDivisionSubdivisionID) {
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }


    /**
     * Gets the creatorType value for this Ticket.
     * 
     * @return creatorType
     */
    public java.lang.Object getCreatorType() {
        return creatorType;
    }


    /**
     * Sets the creatorType value for this Ticket.
     * 
     * @param creatorType
     */
    public void setCreatorType(java.lang.Object creatorType) {
        this.creatorType = creatorType;
    }


    /**
     * Gets the completedByResourceID value for this Ticket.
     * 
     * @return completedByResourceID
     */
    public java.lang.Object getCompletedByResourceID() {
        return completedByResourceID;
    }


    /**
     * Sets the completedByResourceID value for this Ticket.
     * 
     * @param completedByResourceID
     */
    public void setCompletedByResourceID(java.lang.Object completedByResourceID) {
        this.completedByResourceID = completedByResourceID;
    }


    /**
     * Gets the accountPhysicalLocationID value for this Ticket.
     * 
     * @return accountPhysicalLocationID
     */
    public java.lang.Object getAccountPhysicalLocationID() {
        return accountPhysicalLocationID;
    }


    /**
     * Sets the accountPhysicalLocationID value for this Ticket.
     * 
     * @param accountPhysicalLocationID
     */
    public void setAccountPhysicalLocationID(java.lang.Object accountPhysicalLocationID) {
        this.accountPhysicalLocationID = accountPhysicalLocationID;
    }


    /**
     * Gets the lastActivityPersonType value for this Ticket.
     * 
     * @return lastActivityPersonType
     */
    public java.lang.Object getLastActivityPersonType() {
        return lastActivityPersonType;
    }


    /**
     * Sets the lastActivityPersonType value for this Ticket.
     * 
     * @param lastActivityPersonType
     */
    public void setLastActivityPersonType(java.lang.Object lastActivityPersonType) {
        this.lastActivityPersonType = lastActivityPersonType;
    }


    /**
     * Gets the lastActivityResourceID value for this Ticket.
     * 
     * @return lastActivityResourceID
     */
    public java.lang.Object getLastActivityResourceID() {
        return lastActivityResourceID;
    }


    /**
     * Sets the lastActivityResourceID value for this Ticket.
     * 
     * @param lastActivityResourceID
     */
    public void setLastActivityResourceID(java.lang.Object lastActivityResourceID) {
        this.lastActivityResourceID = lastActivityResourceID;
    }


    /**
     * Gets the serviceLevelAgreementPausedNextEventHours value for this Ticket.
     * 
     * @return serviceLevelAgreementPausedNextEventHours
     */
    public java.lang.Object getServiceLevelAgreementPausedNextEventHours() {
        return serviceLevelAgreementPausedNextEventHours;
    }


    /**
     * Sets the serviceLevelAgreementPausedNextEventHours value for this Ticket.
     * 
     * @param serviceLevelAgreementPausedNextEventHours
     */
    public void setServiceLevelAgreementPausedNextEventHours(java.lang.Object serviceLevelAgreementPausedNextEventHours) {
        this.serviceLevelAgreementPausedNextEventHours = serviceLevelAgreementPausedNextEventHours;
    }


    /**
     * Gets the currentServiceThermometerRating value for this Ticket.
     * 
     * @return currentServiceThermometerRating
     */
    public java.lang.Object getCurrentServiceThermometerRating() {
        return currentServiceThermometerRating;
    }


    /**
     * Sets the currentServiceThermometerRating value for this Ticket.
     * 
     * @param currentServiceThermometerRating
     */
    public void setCurrentServiceThermometerRating(java.lang.Object currentServiceThermometerRating) {
        this.currentServiceThermometerRating = currentServiceThermometerRating;
    }


    /**
     * Gets the previousServiceThermometerRating value for this Ticket.
     * 
     * @return previousServiceThermometerRating
     */
    public java.lang.Object getPreviousServiceThermometerRating() {
        return previousServiceThermometerRating;
    }


    /**
     * Sets the previousServiceThermometerRating value for this Ticket.
     * 
     * @param previousServiceThermometerRating
     */
    public void setPreviousServiceThermometerRating(java.lang.Object previousServiceThermometerRating) {
        this.previousServiceThermometerRating = previousServiceThermometerRating;
    }


    /**
     * Gets the serviceThermometerTemperature value for this Ticket.
     * 
     * @return serviceThermometerTemperature
     */
    public java.lang.Object getServiceThermometerTemperature() {
        return serviceThermometerTemperature;
    }


    /**
     * Sets the serviceThermometerTemperature value for this Ticket.
     * 
     * @param serviceThermometerTemperature
     */
    public void setServiceThermometerTemperature(java.lang.Object serviceThermometerTemperature) {
        this.serviceThermometerTemperature = serviceThermometerTemperature;
    }


    /**
     * Gets the apiVendorID value for this Ticket.
     * 
     * @return apiVendorID
     */
    public java.lang.Object getApiVendorID() {
        return apiVendorID;
    }


    /**
     * Sets the apiVendorID value for this Ticket.
     * 
     * @param apiVendorID
     */
    public void setApiVendorID(java.lang.Object apiVendorID) {
        this.apiVendorID = apiVendorID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ticket)) return false;
        Ticket other = (Ticket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.allocationCodeID==null && other.getAllocationCodeID()==null) || 
             (this.allocationCodeID!=null &&
              this.allocationCodeID.equals(other.getAllocationCodeID()))) &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate()))) &&
            ((this.contactID==null && other.getContactID()==null) || 
             (this.contactID!=null &&
              this.contactID.equals(other.getContactID()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.creatorResourceID==null && other.getCreatorResourceID()==null) || 
             (this.creatorResourceID!=null &&
              this.creatorResourceID.equals(other.getCreatorResourceID()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dueDateTime==null && other.getDueDateTime()==null) || 
             (this.dueDateTime!=null &&
              this.dueDateTime.equals(other.getDueDateTime()))) &&
            ((this.estimatedHours==null && other.getEstimatedHours()==null) || 
             (this.estimatedHours!=null &&
              this.estimatedHours.equals(other.getEstimatedHours()))) &&
            ((this.installedProductID==null && other.getInstalledProductID()==null) || 
             (this.installedProductID!=null &&
              this.installedProductID.equals(other.getInstalledProductID()))) &&
            ((this.issueType==null && other.getIssueType()==null) || 
             (this.issueType!=null &&
              this.issueType.equals(other.getIssueType()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.queueID==null && other.getQueueID()==null) || 
             (this.queueID!=null &&
              this.queueID.equals(other.getQueueID()))) &&
            ((this.assignedResourceID==null && other.getAssignedResourceID()==null) || 
             (this.assignedResourceID!=null &&
              this.assignedResourceID.equals(other.getAssignedResourceID()))) &&
            ((this.assignedResourceRoleID==null && other.getAssignedResourceRoleID()==null) || 
             (this.assignedResourceRoleID!=null &&
              this.assignedResourceRoleID.equals(other.getAssignedResourceRoleID()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subIssueType==null && other.getSubIssueType()==null) || 
             (this.subIssueType!=null &&
              this.subIssueType.equals(other.getSubIssueType()))) &&
            ((this.ticketNumber==null && other.getTicketNumber()==null) || 
             (this.ticketNumber!=null &&
              this.ticketNumber.equals(other.getTicketNumber()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.firstResponseDateTime==null && other.getFirstResponseDateTime()==null) || 
             (this.firstResponseDateTime!=null &&
              this.firstResponseDateTime.equals(other.getFirstResponseDateTime()))) &&
            ((this.resolutionPlanDateTime==null && other.getResolutionPlanDateTime()==null) || 
             (this.resolutionPlanDateTime!=null &&
              this.resolutionPlanDateTime.equals(other.getResolutionPlanDateTime()))) &&
            ((this.resolvedDateTime==null && other.getResolvedDateTime()==null) || 
             (this.resolvedDateTime!=null &&
              this.resolvedDateTime.equals(other.getResolvedDateTime()))) &&
            ((this.firstResponseDueDateTime==null && other.getFirstResponseDueDateTime()==null) || 
             (this.firstResponseDueDateTime!=null &&
              this.firstResponseDueDateTime.equals(other.getFirstResponseDueDateTime()))) &&
            ((this.resolutionPlanDueDateTime==null && other.getResolutionPlanDueDateTime()==null) || 
             (this.resolutionPlanDueDateTime!=null &&
              this.resolutionPlanDueDateTime.equals(other.getResolutionPlanDueDateTime()))) &&
            ((this.resolvedDueDateTime==null && other.getResolvedDueDateTime()==null) || 
             (this.resolvedDueDateTime!=null &&
              this.resolvedDueDateTime.equals(other.getResolvedDueDateTime()))) &&
            ((this.serviceLevelAgreementID==null && other.getServiceLevelAgreementID()==null) || 
             (this.serviceLevelAgreementID!=null &&
              this.serviceLevelAgreementID.equals(other.getServiceLevelAgreementID()))) &&
            ((this.serviceLevelAgreementHasBeenMet==null && other.getServiceLevelAgreementHasBeenMet()==null) || 
             (this.serviceLevelAgreementHasBeenMet!=null &&
              this.serviceLevelAgreementHasBeenMet.equals(other.getServiceLevelAgreementHasBeenMet()))) &&
            ((this.resolution==null && other.getResolution()==null) || 
             (this.resolution!=null &&
              this.resolution.equals(other.getResolution()))) &&
            ((this.purchaseOrderNumber==null && other.getPurchaseOrderNumber()==null) || 
             (this.purchaseOrderNumber!=null &&
              this.purchaseOrderNumber.equals(other.getPurchaseOrderNumber()))) &&
            ((this.ticketType==null && other.getTicketType()==null) || 
             (this.ticketType!=null &&
              this.ticketType.equals(other.getTicketType()))) &&
            ((this.problemTicketId==null && other.getProblemTicketId()==null) || 
             (this.problemTicketId!=null &&
              this.problemTicketId.equals(other.getProblemTicketId()))) &&
            ((this.opportunityId==null && other.getOpportunityId()==null) || 
             (this.opportunityId!=null &&
              this.opportunityId.equals(other.getOpportunityId()))) &&
            ((this.changeApprovalBoard==null && other.getChangeApprovalBoard()==null) || 
             (this.changeApprovalBoard!=null &&
              this.changeApprovalBoard.equals(other.getChangeApprovalBoard()))) &&
            ((this.changeApprovalType==null && other.getChangeApprovalType()==null) || 
             (this.changeApprovalType!=null &&
              this.changeApprovalType.equals(other.getChangeApprovalType()))) &&
            ((this.changeApprovalStatus==null && other.getChangeApprovalStatus()==null) || 
             (this.changeApprovalStatus!=null &&
              this.changeApprovalStatus.equals(other.getChangeApprovalStatus()))) &&
            ((this.changeInfoField1==null && other.getChangeInfoField1()==null) || 
             (this.changeInfoField1!=null &&
              this.changeInfoField1.equals(other.getChangeInfoField1()))) &&
            ((this.changeInfoField2==null && other.getChangeInfoField2()==null) || 
             (this.changeInfoField2!=null &&
              this.changeInfoField2.equals(other.getChangeInfoField2()))) &&
            ((this.changeInfoField3==null && other.getChangeInfoField3()==null) || 
             (this.changeInfoField3!=null &&
              this.changeInfoField3.equals(other.getChangeInfoField3()))) &&
            ((this.changeInfoField4==null && other.getChangeInfoField4()==null) || 
             (this.changeInfoField4!=null &&
              this.changeInfoField4.equals(other.getChangeInfoField4()))) &&
            ((this.changeInfoField5==null && other.getChangeInfoField5()==null) || 
             (this.changeInfoField5!=null &&
              this.changeInfoField5.equals(other.getChangeInfoField5()))) &&
            ((this.lastCustomerNotificationDateTime==null && other.getLastCustomerNotificationDateTime()==null) || 
             (this.lastCustomerNotificationDateTime!=null &&
              this.lastCustomerNotificationDateTime.equals(other.getLastCustomerNotificationDateTime()))) &&
            ((this.lastCustomerVisibleActivityDateTime==null && other.getLastCustomerVisibleActivityDateTime()==null) || 
             (this.lastCustomerVisibleActivityDateTime!=null &&
              this.lastCustomerVisibleActivityDateTime.equals(other.getLastCustomerVisibleActivityDateTime()))) &&
            ((this.contractServiceID==null && other.getContractServiceID()==null) || 
             (this.contractServiceID!=null &&
              this.contractServiceID.equals(other.getContractServiceID()))) &&
            ((this.contractServiceBundleID==null && other.getContractServiceBundleID()==null) || 
             (this.contractServiceBundleID!=null &&
              this.contractServiceBundleID.equals(other.getContractServiceBundleID()))) &&
            ((this.hoursToBeScheduled==null && other.getHoursToBeScheduled()==null) || 
             (this.hoursToBeScheduled!=null &&
              this.hoursToBeScheduled.equals(other.getHoursToBeScheduled()))) &&
            ((this.monitorTypeID==null && other.getMonitorTypeID()==null) || 
             (this.monitorTypeID!=null &&
              this.monitorTypeID.equals(other.getMonitorTypeID()))) &&
            ((this.monitorID==null && other.getMonitorID()==null) || 
             (this.monitorID!=null &&
              this.monitorID.equals(other.getMonitorID()))) &&
            ((this.AEMAlertID==null && other.getAEMAlertID()==null) || 
             (this.AEMAlertID!=null &&
              this.AEMAlertID.equals(other.getAEMAlertID()))) &&
            ((this.ticketCategory==null && other.getTicketCategory()==null) || 
             (this.ticketCategory!=null &&
              this.ticketCategory.equals(other.getTicketCategory()))) &&
            ((this.externalID==null && other.getExternalID()==null) || 
             (this.externalID!=null &&
              this.externalID.equals(other.getExternalID()))) &&
            ((this.firstResponseInitiatingResourceID==null && other.getFirstResponseInitiatingResourceID()==null) || 
             (this.firstResponseInitiatingResourceID!=null &&
              this.firstResponseInitiatingResourceID.equals(other.getFirstResponseInitiatingResourceID()))) &&
            ((this.firstResponseAssignedResourceID==null && other.getFirstResponseAssignedResourceID()==null) || 
             (this.firstResponseAssignedResourceID!=null &&
              this.firstResponseAssignedResourceID.equals(other.getFirstResponseAssignedResourceID()))) &&
            ((this.projectID==null && other.getProjectID()==null) || 
             (this.projectID!=null &&
              this.projectID.equals(other.getProjectID()))) &&
            ((this.businessDivisionSubdivisionID==null && other.getBusinessDivisionSubdivisionID()==null) || 
             (this.businessDivisionSubdivisionID!=null &&
              this.businessDivisionSubdivisionID.equals(other.getBusinessDivisionSubdivisionID()))) &&
            ((this.creatorType==null && other.getCreatorType()==null) || 
             (this.creatorType!=null &&
              this.creatorType.equals(other.getCreatorType()))) &&
            ((this.completedByResourceID==null && other.getCompletedByResourceID()==null) || 
             (this.completedByResourceID!=null &&
              this.completedByResourceID.equals(other.getCompletedByResourceID()))) &&
            ((this.accountPhysicalLocationID==null && other.getAccountPhysicalLocationID()==null) || 
             (this.accountPhysicalLocationID!=null &&
              this.accountPhysicalLocationID.equals(other.getAccountPhysicalLocationID()))) &&
            ((this.lastActivityPersonType==null && other.getLastActivityPersonType()==null) || 
             (this.lastActivityPersonType!=null &&
              this.lastActivityPersonType.equals(other.getLastActivityPersonType()))) &&
            ((this.lastActivityResourceID==null && other.getLastActivityResourceID()==null) || 
             (this.lastActivityResourceID!=null &&
              this.lastActivityResourceID.equals(other.getLastActivityResourceID()))) &&
            ((this.serviceLevelAgreementPausedNextEventHours==null && other.getServiceLevelAgreementPausedNextEventHours()==null) || 
             (this.serviceLevelAgreementPausedNextEventHours!=null &&
              this.serviceLevelAgreementPausedNextEventHours.equals(other.getServiceLevelAgreementPausedNextEventHours()))) &&
            ((this.currentServiceThermometerRating==null && other.getCurrentServiceThermometerRating()==null) || 
             (this.currentServiceThermometerRating!=null &&
              this.currentServiceThermometerRating.equals(other.getCurrentServiceThermometerRating()))) &&
            ((this.previousServiceThermometerRating==null && other.getPreviousServiceThermometerRating()==null) || 
             (this.previousServiceThermometerRating!=null &&
              this.previousServiceThermometerRating.equals(other.getPreviousServiceThermometerRating()))) &&
            ((this.serviceThermometerTemperature==null && other.getServiceThermometerTemperature()==null) || 
             (this.serviceThermometerTemperature!=null &&
              this.serviceThermometerTemperature.equals(other.getServiceThermometerTemperature()))) &&
            ((this.apiVendorID==null && other.getApiVendorID()==null) || 
             (this.apiVendorID!=null &&
              this.apiVendorID.equals(other.getApiVendorID())));
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
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getAllocationCodeID() != null) {
            _hashCode += getAllocationCodeID().hashCode();
        }
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
        }
        if (getContactID() != null) {
            _hashCode += getContactID().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getCreatorResourceID() != null) {
            _hashCode += getCreatorResourceID().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDueDateTime() != null) {
            _hashCode += getDueDateTime().hashCode();
        }
        if (getEstimatedHours() != null) {
            _hashCode += getEstimatedHours().hashCode();
        }
        if (getInstalledProductID() != null) {
            _hashCode += getInstalledProductID().hashCode();
        }
        if (getIssueType() != null) {
            _hashCode += getIssueType().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getQueueID() != null) {
            _hashCode += getQueueID().hashCode();
        }
        if (getAssignedResourceID() != null) {
            _hashCode += getAssignedResourceID().hashCode();
        }
        if (getAssignedResourceRoleID() != null) {
            _hashCode += getAssignedResourceRoleID().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubIssueType() != null) {
            _hashCode += getSubIssueType().hashCode();
        }
        if (getTicketNumber() != null) {
            _hashCode += getTicketNumber().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getFirstResponseDateTime() != null) {
            _hashCode += getFirstResponseDateTime().hashCode();
        }
        if (getResolutionPlanDateTime() != null) {
            _hashCode += getResolutionPlanDateTime().hashCode();
        }
        if (getResolvedDateTime() != null) {
            _hashCode += getResolvedDateTime().hashCode();
        }
        if (getFirstResponseDueDateTime() != null) {
            _hashCode += getFirstResponseDueDateTime().hashCode();
        }
        if (getResolutionPlanDueDateTime() != null) {
            _hashCode += getResolutionPlanDueDateTime().hashCode();
        }
        if (getResolvedDueDateTime() != null) {
            _hashCode += getResolvedDueDateTime().hashCode();
        }
        if (getServiceLevelAgreementID() != null) {
            _hashCode += getServiceLevelAgreementID().hashCode();
        }
        if (getServiceLevelAgreementHasBeenMet() != null) {
            _hashCode += getServiceLevelAgreementHasBeenMet().hashCode();
        }
        if (getResolution() != null) {
            _hashCode += getResolution().hashCode();
        }
        if (getPurchaseOrderNumber() != null) {
            _hashCode += getPurchaseOrderNumber().hashCode();
        }
        if (getTicketType() != null) {
            _hashCode += getTicketType().hashCode();
        }
        if (getProblemTicketId() != null) {
            _hashCode += getProblemTicketId().hashCode();
        }
        if (getOpportunityId() != null) {
            _hashCode += getOpportunityId().hashCode();
        }
        if (getChangeApprovalBoard() != null) {
            _hashCode += getChangeApprovalBoard().hashCode();
        }
        if (getChangeApprovalType() != null) {
            _hashCode += getChangeApprovalType().hashCode();
        }
        if (getChangeApprovalStatus() != null) {
            _hashCode += getChangeApprovalStatus().hashCode();
        }
        if (getChangeInfoField1() != null) {
            _hashCode += getChangeInfoField1().hashCode();
        }
        if (getChangeInfoField2() != null) {
            _hashCode += getChangeInfoField2().hashCode();
        }
        if (getChangeInfoField3() != null) {
            _hashCode += getChangeInfoField3().hashCode();
        }
        if (getChangeInfoField4() != null) {
            _hashCode += getChangeInfoField4().hashCode();
        }
        if (getChangeInfoField5() != null) {
            _hashCode += getChangeInfoField5().hashCode();
        }
        if (getLastCustomerNotificationDateTime() != null) {
            _hashCode += getLastCustomerNotificationDateTime().hashCode();
        }
        if (getLastCustomerVisibleActivityDateTime() != null) {
            _hashCode += getLastCustomerVisibleActivityDateTime().hashCode();
        }
        if (getContractServiceID() != null) {
            _hashCode += getContractServiceID().hashCode();
        }
        if (getContractServiceBundleID() != null) {
            _hashCode += getContractServiceBundleID().hashCode();
        }
        if (getHoursToBeScheduled() != null) {
            _hashCode += getHoursToBeScheduled().hashCode();
        }
        if (getMonitorTypeID() != null) {
            _hashCode += getMonitorTypeID().hashCode();
        }
        if (getMonitorID() != null) {
            _hashCode += getMonitorID().hashCode();
        }
        if (getAEMAlertID() != null) {
            _hashCode += getAEMAlertID().hashCode();
        }
        if (getTicketCategory() != null) {
            _hashCode += getTicketCategory().hashCode();
        }
        if (getExternalID() != null) {
            _hashCode += getExternalID().hashCode();
        }
        if (getFirstResponseInitiatingResourceID() != null) {
            _hashCode += getFirstResponseInitiatingResourceID().hashCode();
        }
        if (getFirstResponseAssignedResourceID() != null) {
            _hashCode += getFirstResponseAssignedResourceID().hashCode();
        }
        if (getProjectID() != null) {
            _hashCode += getProjectID().hashCode();
        }
        if (getBusinessDivisionSubdivisionID() != null) {
            _hashCode += getBusinessDivisionSubdivisionID().hashCode();
        }
        if (getCreatorType() != null) {
            _hashCode += getCreatorType().hashCode();
        }
        if (getCompletedByResourceID() != null) {
            _hashCode += getCompletedByResourceID().hashCode();
        }
        if (getAccountPhysicalLocationID() != null) {
            _hashCode += getAccountPhysicalLocationID().hashCode();
        }
        if (getLastActivityPersonType() != null) {
            _hashCode += getLastActivityPersonType().hashCode();
        }
        if (getLastActivityResourceID() != null) {
            _hashCode += getLastActivityResourceID().hashCode();
        }
        if (getServiceLevelAgreementPausedNextEventHours() != null) {
            _hashCode += getServiceLevelAgreementPausedNextEventHours().hashCode();
        }
        if (getCurrentServiceThermometerRating() != null) {
            _hashCode += getCurrentServiceThermometerRating().hashCode();
        }
        if (getPreviousServiceThermometerRating() != null) {
            _hashCode += getPreviousServiceThermometerRating().hashCode();
        }
        if (getServiceThermometerTemperature() != null) {
            _hashCode += getServiceThermometerTemperature().hashCode();
        }
        if (getApiVendorID() != null) {
            _hashCode += getApiVendorID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ticket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Ticket"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
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
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompletedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContactID"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DueDateTime"));
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
        elemField.setFieldName("installedProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InstalledProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "IssueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastActivityDate"));
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
        elemField.setFieldName("queueID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QueueID"));
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
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Source"));
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
        elemField.setFieldName("subIssueType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SubIssueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketNumber"));
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
        elemField.setFieldName("firstResponseDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FirstResponseDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolutionPlanDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ResolutionPlanDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolvedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ResolvedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstResponseDueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FirstResponseDueDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolutionPlanDueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ResolutionPlanDueDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolvedDueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ResolvedDueDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLevelAgreementID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceLevelAgreementID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLevelAgreementHasBeenMet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceLevelAgreementHasBeenMet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Resolution"));
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
        elemField.setFieldName("ticketType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemTicketId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProblemTicketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OpportunityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeApprovalBoard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChangeApprovalBoard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeApprovalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChangeApprovalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeApprovalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChangeApprovalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeInfoField1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChangeInfoField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeInfoField2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChangeInfoField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeInfoField3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChangeInfoField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeInfoField4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChangeInfoField4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeInfoField5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChangeInfoField5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCustomerNotificationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastCustomerNotificationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCustomerVisibleActivityDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastCustomerVisibleActivityDateTime"));
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
        elemField.setFieldName("hoursToBeScheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HoursToBeScheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MonitorTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MonitorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AEMAlertID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AEMAlertID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TicketCategory"));
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
        elemField.setFieldName("firstResponseInitiatingResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FirstResponseInitiatingResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstResponseAssignedResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "FirstResponseAssignedResourceID"));
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
        elemField.setFieldName("businessDivisionSubdivisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BusinessDivisionSubdivisionID"));
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
        elemField.setFieldName("accountPhysicalLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountPhysicalLocationID"));
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
        elemField.setFieldName("lastActivityResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastActivityResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLevelAgreementPausedNextEventHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceLevelAgreementPausedNextEventHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentServiceThermometerRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CurrentServiceThermometerRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousServiceThermometerRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PreviousServiceThermometerRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceThermometerTemperature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceThermometerTemperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVendorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ApiVendorID"));
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
