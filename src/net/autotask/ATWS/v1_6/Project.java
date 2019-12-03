/**
 * Project.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Project  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object projectName;

    private java.lang.Object accountID;

    private java.lang.Object type;

    private java.lang.Object extProjectType;

    private java.lang.Object extPNumber;

    private java.lang.Object projectNumber;

    private java.lang.Object description;

    private java.lang.Object createDateTime;

    private java.lang.Object creatorResourceID;

    private java.lang.Object startDateTime;

    private java.lang.Object endDateTime;

    private java.lang.Object duration;

    private java.lang.Object actualHours;

    private java.lang.Object actualBilledHours;

    private java.lang.Object estimatedTime;

    private java.lang.Object laborEstimatedRevenue;

    private java.lang.Object laborEstimatedCosts;

    private java.lang.Object laborEstimatedMarginPercentage;

    private java.lang.Object projectCostsRevenue;

    private java.lang.Object projectCostsBudget;

    private java.lang.Object projectCostEstimatedMarginPercentage;

    private java.lang.Object changeOrdersRevenue;

    private java.lang.Object changeOrdersBudget;

    private java.lang.Object SGDA;

    private java.lang.Object originalEstimatedRevenue;

    private java.lang.Object estimatedSalesCost;

    private java.lang.Object status;

    private java.lang.Object contractID;

    private java.lang.Object projectLeadResourceID;

    private java.lang.Object companyOwnerResourceID;

    private java.lang.Object completedPercentage;

    private java.lang.Object completedDateTime;

    private java.lang.Object statusDetail;

    private java.lang.Object statusDateTime;

    private java.lang.Object department;

    private java.lang.Object lineOfBusiness;

    private java.lang.Object purchaseOrderNumber;

    private java.lang.Object businessDivisionSubdivisionID;

    private java.lang.Object lastActivityResourceID;

    private java.lang.Object lastActivityDateTime;

    private java.lang.Object lastActivityPersonType;

    public Project() {
    }

    public Project(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object projectName,
           java.lang.Object accountID,
           java.lang.Object type,
           java.lang.Object extProjectType,
           java.lang.Object extPNumber,
           java.lang.Object projectNumber,
           java.lang.Object description,
           java.lang.Object createDateTime,
           java.lang.Object creatorResourceID,
           java.lang.Object startDateTime,
           java.lang.Object endDateTime,
           java.lang.Object duration,
           java.lang.Object actualHours,
           java.lang.Object actualBilledHours,
           java.lang.Object estimatedTime,
           java.lang.Object laborEstimatedRevenue,
           java.lang.Object laborEstimatedCosts,
           java.lang.Object laborEstimatedMarginPercentage,
           java.lang.Object projectCostsRevenue,
           java.lang.Object projectCostsBudget,
           java.lang.Object projectCostEstimatedMarginPercentage,
           java.lang.Object changeOrdersRevenue,
           java.lang.Object changeOrdersBudget,
           java.lang.Object SGDA,
           java.lang.Object originalEstimatedRevenue,
           java.lang.Object estimatedSalesCost,
           java.lang.Object status,
           java.lang.Object contractID,
           java.lang.Object projectLeadResourceID,
           java.lang.Object companyOwnerResourceID,
           java.lang.Object completedPercentage,
           java.lang.Object completedDateTime,
           java.lang.Object statusDetail,
           java.lang.Object statusDateTime,
           java.lang.Object department,
           java.lang.Object lineOfBusiness,
           java.lang.Object purchaseOrderNumber,
           java.lang.Object businessDivisionSubdivisionID,
           java.lang.Object lastActivityResourceID,
           java.lang.Object lastActivityDateTime,
           java.lang.Object lastActivityPersonType) {
        super(
            fields,
            id,
            userDefinedFields);
        this.projectName = projectName;
        this.accountID = accountID;
        this.type = type;
        this.extProjectType = extProjectType;
        this.extPNumber = extPNumber;
        this.projectNumber = projectNumber;
        this.description = description;
        this.createDateTime = createDateTime;
        this.creatorResourceID = creatorResourceID;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.duration = duration;
        this.actualHours = actualHours;
        this.actualBilledHours = actualBilledHours;
        this.estimatedTime = estimatedTime;
        this.laborEstimatedRevenue = laborEstimatedRevenue;
        this.laborEstimatedCosts = laborEstimatedCosts;
        this.laborEstimatedMarginPercentage = laborEstimatedMarginPercentage;
        this.projectCostsRevenue = projectCostsRevenue;
        this.projectCostsBudget = projectCostsBudget;
        this.projectCostEstimatedMarginPercentage = projectCostEstimatedMarginPercentage;
        this.changeOrdersRevenue = changeOrdersRevenue;
        this.changeOrdersBudget = changeOrdersBudget;
        this.SGDA = SGDA;
        this.originalEstimatedRevenue = originalEstimatedRevenue;
        this.estimatedSalesCost = estimatedSalesCost;
        this.status = status;
        this.contractID = contractID;
        this.projectLeadResourceID = projectLeadResourceID;
        this.companyOwnerResourceID = companyOwnerResourceID;
        this.completedPercentage = completedPercentage;
        this.completedDateTime = completedDateTime;
        this.statusDetail = statusDetail;
        this.statusDateTime = statusDateTime;
        this.department = department;
        this.lineOfBusiness = lineOfBusiness;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
        this.lastActivityResourceID = lastActivityResourceID;
        this.lastActivityDateTime = lastActivityDateTime;
        this.lastActivityPersonType = lastActivityPersonType;
    }


    /**
     * Gets the projectName value for this Project.
     * 
     * @return projectName
     */
    public java.lang.Object getProjectName() {
        return projectName;
    }


    /**
     * Sets the projectName value for this Project.
     * 
     * @param projectName
     */
    public void setProjectName(java.lang.Object projectName) {
        this.projectName = projectName;
    }


    /**
     * Gets the accountID value for this Project.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this Project.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the type value for this Project.
     * 
     * @return type
     */
    public java.lang.Object getType() {
        return type;
    }


    /**
     * Sets the type value for this Project.
     * 
     * @param type
     */
    public void setType(java.lang.Object type) {
        this.type = type;
    }


    /**
     * Gets the extProjectType value for this Project.
     * 
     * @return extProjectType
     */
    public java.lang.Object getExtProjectType() {
        return extProjectType;
    }


    /**
     * Sets the extProjectType value for this Project.
     * 
     * @param extProjectType
     */
    public void setExtProjectType(java.lang.Object extProjectType) {
        this.extProjectType = extProjectType;
    }


    /**
     * Gets the extPNumber value for this Project.
     * 
     * @return extPNumber
     */
    public java.lang.Object getExtPNumber() {
        return extPNumber;
    }


    /**
     * Sets the extPNumber value for this Project.
     * 
     * @param extPNumber
     */
    public void setExtPNumber(java.lang.Object extPNumber) {
        this.extPNumber = extPNumber;
    }


    /**
     * Gets the projectNumber value for this Project.
     * 
     * @return projectNumber
     */
    public java.lang.Object getProjectNumber() {
        return projectNumber;
    }


    /**
     * Sets the projectNumber value for this Project.
     * 
     * @param projectNumber
     */
    public void setProjectNumber(java.lang.Object projectNumber) {
        this.projectNumber = projectNumber;
    }


    /**
     * Gets the description value for this Project.
     * 
     * @return description
     */
    public java.lang.Object getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Project.
     * 
     * @param description
     */
    public void setDescription(java.lang.Object description) {
        this.description = description;
    }


    /**
     * Gets the createDateTime value for this Project.
     * 
     * @return createDateTime
     */
    public java.lang.Object getCreateDateTime() {
        return createDateTime;
    }


    /**
     * Sets the createDateTime value for this Project.
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(java.lang.Object createDateTime) {
        this.createDateTime = createDateTime;
    }


    /**
     * Gets the creatorResourceID value for this Project.
     * 
     * @return creatorResourceID
     */
    public java.lang.Object getCreatorResourceID() {
        return creatorResourceID;
    }


    /**
     * Sets the creatorResourceID value for this Project.
     * 
     * @param creatorResourceID
     */
    public void setCreatorResourceID(java.lang.Object creatorResourceID) {
        this.creatorResourceID = creatorResourceID;
    }


    /**
     * Gets the startDateTime value for this Project.
     * 
     * @return startDateTime
     */
    public java.lang.Object getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this Project.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.Object startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this Project.
     * 
     * @return endDateTime
     */
    public java.lang.Object getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this Project.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.lang.Object endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the duration value for this Project.
     * 
     * @return duration
     */
    public java.lang.Object getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this Project.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Object duration) {
        this.duration = duration;
    }


    /**
     * Gets the actualHours value for this Project.
     * 
     * @return actualHours
     */
    public java.lang.Object getActualHours() {
        return actualHours;
    }


    /**
     * Sets the actualHours value for this Project.
     * 
     * @param actualHours
     */
    public void setActualHours(java.lang.Object actualHours) {
        this.actualHours = actualHours;
    }


    /**
     * Gets the actualBilledHours value for this Project.
     * 
     * @return actualBilledHours
     */
    public java.lang.Object getActualBilledHours() {
        return actualBilledHours;
    }


    /**
     * Sets the actualBilledHours value for this Project.
     * 
     * @param actualBilledHours
     */
    public void setActualBilledHours(java.lang.Object actualBilledHours) {
        this.actualBilledHours = actualBilledHours;
    }


    /**
     * Gets the estimatedTime value for this Project.
     * 
     * @return estimatedTime
     */
    public java.lang.Object getEstimatedTime() {
        return estimatedTime;
    }


    /**
     * Sets the estimatedTime value for this Project.
     * 
     * @param estimatedTime
     */
    public void setEstimatedTime(java.lang.Object estimatedTime) {
        this.estimatedTime = estimatedTime;
    }


    /**
     * Gets the laborEstimatedRevenue value for this Project.
     * 
     * @return laborEstimatedRevenue
     */
    public java.lang.Object getLaborEstimatedRevenue() {
        return laborEstimatedRevenue;
    }


    /**
     * Sets the laborEstimatedRevenue value for this Project.
     * 
     * @param laborEstimatedRevenue
     */
    public void setLaborEstimatedRevenue(java.lang.Object laborEstimatedRevenue) {
        this.laborEstimatedRevenue = laborEstimatedRevenue;
    }


    /**
     * Gets the laborEstimatedCosts value for this Project.
     * 
     * @return laborEstimatedCosts
     */
    public java.lang.Object getLaborEstimatedCosts() {
        return laborEstimatedCosts;
    }


    /**
     * Sets the laborEstimatedCosts value for this Project.
     * 
     * @param laborEstimatedCosts
     */
    public void setLaborEstimatedCosts(java.lang.Object laborEstimatedCosts) {
        this.laborEstimatedCosts = laborEstimatedCosts;
    }


    /**
     * Gets the laborEstimatedMarginPercentage value for this Project.
     * 
     * @return laborEstimatedMarginPercentage
     */
    public java.lang.Object getLaborEstimatedMarginPercentage() {
        return laborEstimatedMarginPercentage;
    }


    /**
     * Sets the laborEstimatedMarginPercentage value for this Project.
     * 
     * @param laborEstimatedMarginPercentage
     */
    public void setLaborEstimatedMarginPercentage(java.lang.Object laborEstimatedMarginPercentage) {
        this.laborEstimatedMarginPercentage = laborEstimatedMarginPercentage;
    }


    /**
     * Gets the projectCostsRevenue value for this Project.
     * 
     * @return projectCostsRevenue
     */
    public java.lang.Object getProjectCostsRevenue() {
        return projectCostsRevenue;
    }


    /**
     * Sets the projectCostsRevenue value for this Project.
     * 
     * @param projectCostsRevenue
     */
    public void setProjectCostsRevenue(java.lang.Object projectCostsRevenue) {
        this.projectCostsRevenue = projectCostsRevenue;
    }


    /**
     * Gets the projectCostsBudget value for this Project.
     * 
     * @return projectCostsBudget
     */
    public java.lang.Object getProjectCostsBudget() {
        return projectCostsBudget;
    }


    /**
     * Sets the projectCostsBudget value for this Project.
     * 
     * @param projectCostsBudget
     */
    public void setProjectCostsBudget(java.lang.Object projectCostsBudget) {
        this.projectCostsBudget = projectCostsBudget;
    }


    /**
     * Gets the projectCostEstimatedMarginPercentage value for this Project.
     * 
     * @return projectCostEstimatedMarginPercentage
     */
    public java.lang.Object getProjectCostEstimatedMarginPercentage() {
        return projectCostEstimatedMarginPercentage;
    }


    /**
     * Sets the projectCostEstimatedMarginPercentage value for this Project.
     * 
     * @param projectCostEstimatedMarginPercentage
     */
    public void setProjectCostEstimatedMarginPercentage(java.lang.Object projectCostEstimatedMarginPercentage) {
        this.projectCostEstimatedMarginPercentage = projectCostEstimatedMarginPercentage;
    }


    /**
     * Gets the changeOrdersRevenue value for this Project.
     * 
     * @return changeOrdersRevenue
     */
    public java.lang.Object getChangeOrdersRevenue() {
        return changeOrdersRevenue;
    }


    /**
     * Sets the changeOrdersRevenue value for this Project.
     * 
     * @param changeOrdersRevenue
     */
    public void setChangeOrdersRevenue(java.lang.Object changeOrdersRevenue) {
        this.changeOrdersRevenue = changeOrdersRevenue;
    }


    /**
     * Gets the changeOrdersBudget value for this Project.
     * 
     * @return changeOrdersBudget
     */
    public java.lang.Object getChangeOrdersBudget() {
        return changeOrdersBudget;
    }


    /**
     * Sets the changeOrdersBudget value for this Project.
     * 
     * @param changeOrdersBudget
     */
    public void setChangeOrdersBudget(java.lang.Object changeOrdersBudget) {
        this.changeOrdersBudget = changeOrdersBudget;
    }


    /**
     * Gets the SGDA value for this Project.
     * 
     * @return SGDA
     */
    public java.lang.Object getSGDA() {
        return SGDA;
    }


    /**
     * Sets the SGDA value for this Project.
     * 
     * @param SGDA
     */
    public void setSGDA(java.lang.Object SGDA) {
        this.SGDA = SGDA;
    }


    /**
     * Gets the originalEstimatedRevenue value for this Project.
     * 
     * @return originalEstimatedRevenue
     */
    public java.lang.Object getOriginalEstimatedRevenue() {
        return originalEstimatedRevenue;
    }


    /**
     * Sets the originalEstimatedRevenue value for this Project.
     * 
     * @param originalEstimatedRevenue
     */
    public void setOriginalEstimatedRevenue(java.lang.Object originalEstimatedRevenue) {
        this.originalEstimatedRevenue = originalEstimatedRevenue;
    }


    /**
     * Gets the estimatedSalesCost value for this Project.
     * 
     * @return estimatedSalesCost
     */
    public java.lang.Object getEstimatedSalesCost() {
        return estimatedSalesCost;
    }


    /**
     * Sets the estimatedSalesCost value for this Project.
     * 
     * @param estimatedSalesCost
     */
    public void setEstimatedSalesCost(java.lang.Object estimatedSalesCost) {
        this.estimatedSalesCost = estimatedSalesCost;
    }


    /**
     * Gets the status value for this Project.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Project.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the contractID value for this Project.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this Project.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the projectLeadResourceID value for this Project.
     * 
     * @return projectLeadResourceID
     */
    public java.lang.Object getProjectLeadResourceID() {
        return projectLeadResourceID;
    }


    /**
     * Sets the projectLeadResourceID value for this Project.
     * 
     * @param projectLeadResourceID
     */
    public void setProjectLeadResourceID(java.lang.Object projectLeadResourceID) {
        this.projectLeadResourceID = projectLeadResourceID;
    }


    /**
     * Gets the companyOwnerResourceID value for this Project.
     * 
     * @return companyOwnerResourceID
     */
    public java.lang.Object getCompanyOwnerResourceID() {
        return companyOwnerResourceID;
    }


    /**
     * Sets the companyOwnerResourceID value for this Project.
     * 
     * @param companyOwnerResourceID
     */
    public void setCompanyOwnerResourceID(java.lang.Object companyOwnerResourceID) {
        this.companyOwnerResourceID = companyOwnerResourceID;
    }


    /**
     * Gets the completedPercentage value for this Project.
     * 
     * @return completedPercentage
     */
    public java.lang.Object getCompletedPercentage() {
        return completedPercentage;
    }


    /**
     * Sets the completedPercentage value for this Project.
     * 
     * @param completedPercentage
     */
    public void setCompletedPercentage(java.lang.Object completedPercentage) {
        this.completedPercentage = completedPercentage;
    }


    /**
     * Gets the completedDateTime value for this Project.
     * 
     * @return completedDateTime
     */
    public java.lang.Object getCompletedDateTime() {
        return completedDateTime;
    }


    /**
     * Sets the completedDateTime value for this Project.
     * 
     * @param completedDateTime
     */
    public void setCompletedDateTime(java.lang.Object completedDateTime) {
        this.completedDateTime = completedDateTime;
    }


    /**
     * Gets the statusDetail value for this Project.
     * 
     * @return statusDetail
     */
    public java.lang.Object getStatusDetail() {
        return statusDetail;
    }


    /**
     * Sets the statusDetail value for this Project.
     * 
     * @param statusDetail
     */
    public void setStatusDetail(java.lang.Object statusDetail) {
        this.statusDetail = statusDetail;
    }


    /**
     * Gets the statusDateTime value for this Project.
     * 
     * @return statusDateTime
     */
    public java.lang.Object getStatusDateTime() {
        return statusDateTime;
    }


    /**
     * Sets the statusDateTime value for this Project.
     * 
     * @param statusDateTime
     */
    public void setStatusDateTime(java.lang.Object statusDateTime) {
        this.statusDateTime = statusDateTime;
    }


    /**
     * Gets the department value for this Project.
     * 
     * @return department
     */
    public java.lang.Object getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Project.
     * 
     * @param department
     */
    public void setDepartment(java.lang.Object department) {
        this.department = department;
    }


    /**
     * Gets the lineOfBusiness value for this Project.
     * 
     * @return lineOfBusiness
     */
    public java.lang.Object getLineOfBusiness() {
        return lineOfBusiness;
    }


    /**
     * Sets the lineOfBusiness value for this Project.
     * 
     * @param lineOfBusiness
     */
    public void setLineOfBusiness(java.lang.Object lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }


    /**
     * Gets the purchaseOrderNumber value for this Project.
     * 
     * @return purchaseOrderNumber
     */
    public java.lang.Object getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }


    /**
     * Sets the purchaseOrderNumber value for this Project.
     * 
     * @param purchaseOrderNumber
     */
    public void setPurchaseOrderNumber(java.lang.Object purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }


    /**
     * Gets the businessDivisionSubdivisionID value for this Project.
     * 
     * @return businessDivisionSubdivisionID
     */
    public java.lang.Object getBusinessDivisionSubdivisionID() {
        return businessDivisionSubdivisionID;
    }


    /**
     * Sets the businessDivisionSubdivisionID value for this Project.
     * 
     * @param businessDivisionSubdivisionID
     */
    public void setBusinessDivisionSubdivisionID(java.lang.Object businessDivisionSubdivisionID) {
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }


    /**
     * Gets the lastActivityResourceID value for this Project.
     * 
     * @return lastActivityResourceID
     */
    public java.lang.Object getLastActivityResourceID() {
        return lastActivityResourceID;
    }


    /**
     * Sets the lastActivityResourceID value for this Project.
     * 
     * @param lastActivityResourceID
     */
    public void setLastActivityResourceID(java.lang.Object lastActivityResourceID) {
        this.lastActivityResourceID = lastActivityResourceID;
    }


    /**
     * Gets the lastActivityDateTime value for this Project.
     * 
     * @return lastActivityDateTime
     */
    public java.lang.Object getLastActivityDateTime() {
        return lastActivityDateTime;
    }


    /**
     * Sets the lastActivityDateTime value for this Project.
     * 
     * @param lastActivityDateTime
     */
    public void setLastActivityDateTime(java.lang.Object lastActivityDateTime) {
        this.lastActivityDateTime = lastActivityDateTime;
    }


    /**
     * Gets the lastActivityPersonType value for this Project.
     * 
     * @return lastActivityPersonType
     */
    public java.lang.Object getLastActivityPersonType() {
        return lastActivityPersonType;
    }


    /**
     * Sets the lastActivityPersonType value for this Project.
     * 
     * @param lastActivityPersonType
     */
    public void setLastActivityPersonType(java.lang.Object lastActivityPersonType) {
        this.lastActivityPersonType = lastActivityPersonType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Project)) return false;
        Project other = (Project) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.projectName==null && other.getProjectName()==null) || 
             (this.projectName!=null &&
              this.projectName.equals(other.getProjectName()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.extProjectType==null && other.getExtProjectType()==null) || 
             (this.extProjectType!=null &&
              this.extProjectType.equals(other.getExtProjectType()))) &&
            ((this.extPNumber==null && other.getExtPNumber()==null) || 
             (this.extPNumber!=null &&
              this.extPNumber.equals(other.getExtPNumber()))) &&
            ((this.projectNumber==null && other.getProjectNumber()==null) || 
             (this.projectNumber!=null &&
              this.projectNumber.equals(other.getProjectNumber()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.createDateTime==null && other.getCreateDateTime()==null) || 
             (this.createDateTime!=null &&
              this.createDateTime.equals(other.getCreateDateTime()))) &&
            ((this.creatorResourceID==null && other.getCreatorResourceID()==null) || 
             (this.creatorResourceID!=null &&
              this.creatorResourceID.equals(other.getCreatorResourceID()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.actualHours==null && other.getActualHours()==null) || 
             (this.actualHours!=null &&
              this.actualHours.equals(other.getActualHours()))) &&
            ((this.actualBilledHours==null && other.getActualBilledHours()==null) || 
             (this.actualBilledHours!=null &&
              this.actualBilledHours.equals(other.getActualBilledHours()))) &&
            ((this.estimatedTime==null && other.getEstimatedTime()==null) || 
             (this.estimatedTime!=null &&
              this.estimatedTime.equals(other.getEstimatedTime()))) &&
            ((this.laborEstimatedRevenue==null && other.getLaborEstimatedRevenue()==null) || 
             (this.laborEstimatedRevenue!=null &&
              this.laborEstimatedRevenue.equals(other.getLaborEstimatedRevenue()))) &&
            ((this.laborEstimatedCosts==null && other.getLaborEstimatedCosts()==null) || 
             (this.laborEstimatedCosts!=null &&
              this.laborEstimatedCosts.equals(other.getLaborEstimatedCosts()))) &&
            ((this.laborEstimatedMarginPercentage==null && other.getLaborEstimatedMarginPercentage()==null) || 
             (this.laborEstimatedMarginPercentage!=null &&
              this.laborEstimatedMarginPercentage.equals(other.getLaborEstimatedMarginPercentage()))) &&
            ((this.projectCostsRevenue==null && other.getProjectCostsRevenue()==null) || 
             (this.projectCostsRevenue!=null &&
              this.projectCostsRevenue.equals(other.getProjectCostsRevenue()))) &&
            ((this.projectCostsBudget==null && other.getProjectCostsBudget()==null) || 
             (this.projectCostsBudget!=null &&
              this.projectCostsBudget.equals(other.getProjectCostsBudget()))) &&
            ((this.projectCostEstimatedMarginPercentage==null && other.getProjectCostEstimatedMarginPercentage()==null) || 
             (this.projectCostEstimatedMarginPercentage!=null &&
              this.projectCostEstimatedMarginPercentage.equals(other.getProjectCostEstimatedMarginPercentage()))) &&
            ((this.changeOrdersRevenue==null && other.getChangeOrdersRevenue()==null) || 
             (this.changeOrdersRevenue!=null &&
              this.changeOrdersRevenue.equals(other.getChangeOrdersRevenue()))) &&
            ((this.changeOrdersBudget==null && other.getChangeOrdersBudget()==null) || 
             (this.changeOrdersBudget!=null &&
              this.changeOrdersBudget.equals(other.getChangeOrdersBudget()))) &&
            ((this.SGDA==null && other.getSGDA()==null) || 
             (this.SGDA!=null &&
              this.SGDA.equals(other.getSGDA()))) &&
            ((this.originalEstimatedRevenue==null && other.getOriginalEstimatedRevenue()==null) || 
             (this.originalEstimatedRevenue!=null &&
              this.originalEstimatedRevenue.equals(other.getOriginalEstimatedRevenue()))) &&
            ((this.estimatedSalesCost==null && other.getEstimatedSalesCost()==null) || 
             (this.estimatedSalesCost!=null &&
              this.estimatedSalesCost.equals(other.getEstimatedSalesCost()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.projectLeadResourceID==null && other.getProjectLeadResourceID()==null) || 
             (this.projectLeadResourceID!=null &&
              this.projectLeadResourceID.equals(other.getProjectLeadResourceID()))) &&
            ((this.companyOwnerResourceID==null && other.getCompanyOwnerResourceID()==null) || 
             (this.companyOwnerResourceID!=null &&
              this.companyOwnerResourceID.equals(other.getCompanyOwnerResourceID()))) &&
            ((this.completedPercentage==null && other.getCompletedPercentage()==null) || 
             (this.completedPercentage!=null &&
              this.completedPercentage.equals(other.getCompletedPercentage()))) &&
            ((this.completedDateTime==null && other.getCompletedDateTime()==null) || 
             (this.completedDateTime!=null &&
              this.completedDateTime.equals(other.getCompletedDateTime()))) &&
            ((this.statusDetail==null && other.getStatusDetail()==null) || 
             (this.statusDetail!=null &&
              this.statusDetail.equals(other.getStatusDetail()))) &&
            ((this.statusDateTime==null && other.getStatusDateTime()==null) || 
             (this.statusDateTime!=null &&
              this.statusDateTime.equals(other.getStatusDateTime()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.lineOfBusiness==null && other.getLineOfBusiness()==null) || 
             (this.lineOfBusiness!=null &&
              this.lineOfBusiness.equals(other.getLineOfBusiness()))) &&
            ((this.purchaseOrderNumber==null && other.getPurchaseOrderNumber()==null) || 
             (this.purchaseOrderNumber!=null &&
              this.purchaseOrderNumber.equals(other.getPurchaseOrderNumber()))) &&
            ((this.businessDivisionSubdivisionID==null && other.getBusinessDivisionSubdivisionID()==null) || 
             (this.businessDivisionSubdivisionID!=null &&
              this.businessDivisionSubdivisionID.equals(other.getBusinessDivisionSubdivisionID()))) &&
            ((this.lastActivityResourceID==null && other.getLastActivityResourceID()==null) || 
             (this.lastActivityResourceID!=null &&
              this.lastActivityResourceID.equals(other.getLastActivityResourceID()))) &&
            ((this.lastActivityDateTime==null && other.getLastActivityDateTime()==null) || 
             (this.lastActivityDateTime!=null &&
              this.lastActivityDateTime.equals(other.getLastActivityDateTime()))) &&
            ((this.lastActivityPersonType==null && other.getLastActivityPersonType()==null) || 
             (this.lastActivityPersonType!=null &&
              this.lastActivityPersonType.equals(other.getLastActivityPersonType())));
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
        if (getProjectName() != null) {
            _hashCode += getProjectName().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getExtProjectType() != null) {
            _hashCode += getExtProjectType().hashCode();
        }
        if (getExtPNumber() != null) {
            _hashCode += getExtPNumber().hashCode();
        }
        if (getProjectNumber() != null) {
            _hashCode += getProjectNumber().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCreateDateTime() != null) {
            _hashCode += getCreateDateTime().hashCode();
        }
        if (getCreatorResourceID() != null) {
            _hashCode += getCreatorResourceID().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getActualHours() != null) {
            _hashCode += getActualHours().hashCode();
        }
        if (getActualBilledHours() != null) {
            _hashCode += getActualBilledHours().hashCode();
        }
        if (getEstimatedTime() != null) {
            _hashCode += getEstimatedTime().hashCode();
        }
        if (getLaborEstimatedRevenue() != null) {
            _hashCode += getLaborEstimatedRevenue().hashCode();
        }
        if (getLaborEstimatedCosts() != null) {
            _hashCode += getLaborEstimatedCosts().hashCode();
        }
        if (getLaborEstimatedMarginPercentage() != null) {
            _hashCode += getLaborEstimatedMarginPercentage().hashCode();
        }
        if (getProjectCostsRevenue() != null) {
            _hashCode += getProjectCostsRevenue().hashCode();
        }
        if (getProjectCostsBudget() != null) {
            _hashCode += getProjectCostsBudget().hashCode();
        }
        if (getProjectCostEstimatedMarginPercentage() != null) {
            _hashCode += getProjectCostEstimatedMarginPercentage().hashCode();
        }
        if (getChangeOrdersRevenue() != null) {
            _hashCode += getChangeOrdersRevenue().hashCode();
        }
        if (getChangeOrdersBudget() != null) {
            _hashCode += getChangeOrdersBudget().hashCode();
        }
        if (getSGDA() != null) {
            _hashCode += getSGDA().hashCode();
        }
        if (getOriginalEstimatedRevenue() != null) {
            _hashCode += getOriginalEstimatedRevenue().hashCode();
        }
        if (getEstimatedSalesCost() != null) {
            _hashCode += getEstimatedSalesCost().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getProjectLeadResourceID() != null) {
            _hashCode += getProjectLeadResourceID().hashCode();
        }
        if (getCompanyOwnerResourceID() != null) {
            _hashCode += getCompanyOwnerResourceID().hashCode();
        }
        if (getCompletedPercentage() != null) {
            _hashCode += getCompletedPercentage().hashCode();
        }
        if (getCompletedDateTime() != null) {
            _hashCode += getCompletedDateTime().hashCode();
        }
        if (getStatusDetail() != null) {
            _hashCode += getStatusDetail().hashCode();
        }
        if (getStatusDateTime() != null) {
            _hashCode += getStatusDateTime().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getLineOfBusiness() != null) {
            _hashCode += getLineOfBusiness().hashCode();
        }
        if (getPurchaseOrderNumber() != null) {
            _hashCode += getPurchaseOrderNumber().hashCode();
        }
        if (getBusinessDivisionSubdivisionID() != null) {
            _hashCode += getBusinessDivisionSubdivisionID().hashCode();
        }
        if (getLastActivityResourceID() != null) {
            _hashCode += getLastActivityResourceID().hashCode();
        }
        if (getLastActivityDateTime() != null) {
            _hashCode += getLastActivityDateTime().hashCode();
        }
        if (getLastActivityPersonType() != null) {
            _hashCode += getLastActivityPersonType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Project.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Project"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectName"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extProjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExtProjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extPNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ExtPNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectNumber"));
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
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ActualHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualBilledHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ActualBilledHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EstimatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborEstimatedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LaborEstimatedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborEstimatedCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LaborEstimatedCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborEstimatedMarginPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LaborEstimatedMarginPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectCostsRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectCostsRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectCostsBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectCostsBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectCostEstimatedMarginPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectCostEstimatedMarginPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeOrdersRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChangeOrdersRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeOrdersBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ChangeOrdersBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGDA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SGDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalEstimatedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OriginalEstimatedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedSalesCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "EstimatedSalesCost"));
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
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectLeadResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectLeadResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyOwnerResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompanyOwnerResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CompletedPercentage"));
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
        elemField.setFieldName("statusDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "StatusDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "StatusDateTime"));
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
        elemField.setFieldName("lineOfBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LineOfBusiness"));
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
        elemField.setFieldName("businessDivisionSubdivisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "BusinessDivisionSubdivisionID"));
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
        elemField.setFieldName("lastActivityDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastActivityDateTime"));
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
