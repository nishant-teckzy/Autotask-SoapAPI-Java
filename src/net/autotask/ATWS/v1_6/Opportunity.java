/**
 * Opportunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class Opportunity  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object accountID;

    private java.lang.Object advancedField1;

    private java.lang.Object advancedField2;

    private java.lang.Object advancedField3;

    private java.lang.Object advancedField4;

    private java.lang.Object advancedField5;

    private java.lang.Object amount;

    private java.lang.Object assessmentScore;

    private java.lang.Object barriers;

    private java.lang.Object closedDate;

    private java.lang.Object contactID;

    private java.lang.Object cost;

    private java.lang.Object createDate;

    private java.lang.Object dateStamp;

    private java.lang.Object helpNeeded;

    private java.lang.Object lastActivity;

    private java.lang.Object leadReferral;

    private java.lang.Object lossReason;

    private java.lang.Object lossReasonDetail;

    private java.lang.Object market;

    private java.lang.Object nextStep;

    private java.lang.Object ownerResourceID;

    private java.lang.Object primaryCompetitor;

    private java.lang.Object probability;

    private java.lang.Object productID;

    private java.lang.Object projectedCloseDate;

    private java.lang.Object projectedLiveDate;

    private java.lang.Object promotionName;

    private java.lang.Object rating;

    private java.lang.Object relationshipAssessmentScore;

    private java.lang.Object revenueSpread;

    private java.lang.Object revenueSpreadUnit;

    private java.lang.Object salesOrderID;

    private java.lang.Object salesProcessPercentComplete;

    private java.lang.Object stage;

    private java.lang.Object status;

    private java.lang.Object technicalAssessmentScore;

    private java.lang.Object throughDate;

    private java.lang.Object title;

    private java.lang.Object totalAmountMonths;

    private java.lang.Object useQuoteTotals;

    private java.lang.Object winReason;

    private java.lang.Object winReasonDetail;

    private java.lang.Object onetimeCost;

    private java.lang.Object onetimeRevenue;

    private java.lang.Object monthlyCost;

    private java.lang.Object monthlyRevenue;

    private java.lang.Object quarterlyCost;

    private java.lang.Object quarterlyRevenue;

    private java.lang.Object yearlyCost;

    private java.lang.Object yearlyRevenue;

    private java.lang.Object semiannualCost;

    private java.lang.Object semiannualRevenue;

    private java.lang.Object businessDivisionSubdivisionID;

    private java.lang.Object opportunityCategoryID;

    private java.lang.Object lostDate;

    public Opportunity() {
    }

    public Opportunity(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object accountID,
           java.lang.Object advancedField1,
           java.lang.Object advancedField2,
           java.lang.Object advancedField3,
           java.lang.Object advancedField4,
           java.lang.Object advancedField5,
           java.lang.Object amount,
           java.lang.Object assessmentScore,
           java.lang.Object barriers,
           java.lang.Object closedDate,
           java.lang.Object contactID,
           java.lang.Object cost,
           java.lang.Object createDate,
           java.lang.Object dateStamp,
           java.lang.Object helpNeeded,
           java.lang.Object lastActivity,
           java.lang.Object leadReferral,
           java.lang.Object lossReason,
           java.lang.Object lossReasonDetail,
           java.lang.Object market,
           java.lang.Object nextStep,
           java.lang.Object ownerResourceID,
           java.lang.Object primaryCompetitor,
           java.lang.Object probability,
           java.lang.Object productID,
           java.lang.Object projectedCloseDate,
           java.lang.Object projectedLiveDate,
           java.lang.Object promotionName,
           java.lang.Object rating,
           java.lang.Object relationshipAssessmentScore,
           java.lang.Object revenueSpread,
           java.lang.Object revenueSpreadUnit,
           java.lang.Object salesOrderID,
           java.lang.Object salesProcessPercentComplete,
           java.lang.Object stage,
           java.lang.Object status,
           java.lang.Object technicalAssessmentScore,
           java.lang.Object throughDate,
           java.lang.Object title,
           java.lang.Object totalAmountMonths,
           java.lang.Object useQuoteTotals,
           java.lang.Object winReason,
           java.lang.Object winReasonDetail,
           java.lang.Object onetimeCost,
           java.lang.Object onetimeRevenue,
           java.lang.Object monthlyCost,
           java.lang.Object monthlyRevenue,
           java.lang.Object quarterlyCost,
           java.lang.Object quarterlyRevenue,
           java.lang.Object yearlyCost,
           java.lang.Object yearlyRevenue,
           java.lang.Object semiannualCost,
           java.lang.Object semiannualRevenue,
           java.lang.Object businessDivisionSubdivisionID,
           java.lang.Object opportunityCategoryID,
           java.lang.Object lostDate) {
        super(
            fields,
            id,
            userDefinedFields);
        this.accountID = accountID;
        this.advancedField1 = advancedField1;
        this.advancedField2 = advancedField2;
        this.advancedField3 = advancedField3;
        this.advancedField4 = advancedField4;
        this.advancedField5 = advancedField5;
        this.amount = amount;
        this.assessmentScore = assessmentScore;
        this.barriers = barriers;
        this.closedDate = closedDate;
        this.contactID = contactID;
        this.cost = cost;
        this.createDate = createDate;
        this.dateStamp = dateStamp;
        this.helpNeeded = helpNeeded;
        this.lastActivity = lastActivity;
        this.leadReferral = leadReferral;
        this.lossReason = lossReason;
        this.lossReasonDetail = lossReasonDetail;
        this.market = market;
        this.nextStep = nextStep;
        this.ownerResourceID = ownerResourceID;
        this.primaryCompetitor = primaryCompetitor;
        this.probability = probability;
        this.productID = productID;
        this.projectedCloseDate = projectedCloseDate;
        this.projectedLiveDate = projectedLiveDate;
        this.promotionName = promotionName;
        this.rating = rating;
        this.relationshipAssessmentScore = relationshipAssessmentScore;
        this.revenueSpread = revenueSpread;
        this.revenueSpreadUnit = revenueSpreadUnit;
        this.salesOrderID = salesOrderID;
        this.salesProcessPercentComplete = salesProcessPercentComplete;
        this.stage = stage;
        this.status = status;
        this.technicalAssessmentScore = technicalAssessmentScore;
        this.throughDate = throughDate;
        this.title = title;
        this.totalAmountMonths = totalAmountMonths;
        this.useQuoteTotals = useQuoteTotals;
        this.winReason = winReason;
        this.winReasonDetail = winReasonDetail;
        this.onetimeCost = onetimeCost;
        this.onetimeRevenue = onetimeRevenue;
        this.monthlyCost = monthlyCost;
        this.monthlyRevenue = monthlyRevenue;
        this.quarterlyCost = quarterlyCost;
        this.quarterlyRevenue = quarterlyRevenue;
        this.yearlyCost = yearlyCost;
        this.yearlyRevenue = yearlyRevenue;
        this.semiannualCost = semiannualCost;
        this.semiannualRevenue = semiannualRevenue;
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
        this.opportunityCategoryID = opportunityCategoryID;
        this.lostDate = lostDate;
    }


    /**
     * Gets the accountID value for this Opportunity.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this Opportunity.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the advancedField1 value for this Opportunity.
     * 
     * @return advancedField1
     */
    public java.lang.Object getAdvancedField1() {
        return advancedField1;
    }


    /**
     * Sets the advancedField1 value for this Opportunity.
     * 
     * @param advancedField1
     */
    public void setAdvancedField1(java.lang.Object advancedField1) {
        this.advancedField1 = advancedField1;
    }


    /**
     * Gets the advancedField2 value for this Opportunity.
     * 
     * @return advancedField2
     */
    public java.lang.Object getAdvancedField2() {
        return advancedField2;
    }


    /**
     * Sets the advancedField2 value for this Opportunity.
     * 
     * @param advancedField2
     */
    public void setAdvancedField2(java.lang.Object advancedField2) {
        this.advancedField2 = advancedField2;
    }


    /**
     * Gets the advancedField3 value for this Opportunity.
     * 
     * @return advancedField3
     */
    public java.lang.Object getAdvancedField3() {
        return advancedField3;
    }


    /**
     * Sets the advancedField3 value for this Opportunity.
     * 
     * @param advancedField3
     */
    public void setAdvancedField3(java.lang.Object advancedField3) {
        this.advancedField3 = advancedField3;
    }


    /**
     * Gets the advancedField4 value for this Opportunity.
     * 
     * @return advancedField4
     */
    public java.lang.Object getAdvancedField4() {
        return advancedField4;
    }


    /**
     * Sets the advancedField4 value for this Opportunity.
     * 
     * @param advancedField4
     */
    public void setAdvancedField4(java.lang.Object advancedField4) {
        this.advancedField4 = advancedField4;
    }


    /**
     * Gets the advancedField5 value for this Opportunity.
     * 
     * @return advancedField5
     */
    public java.lang.Object getAdvancedField5() {
        return advancedField5;
    }


    /**
     * Sets the advancedField5 value for this Opportunity.
     * 
     * @param advancedField5
     */
    public void setAdvancedField5(java.lang.Object advancedField5) {
        this.advancedField5 = advancedField5;
    }


    /**
     * Gets the amount value for this Opportunity.
     * 
     * @return amount
     */
    public java.lang.Object getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Opportunity.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Object amount) {
        this.amount = amount;
    }


    /**
     * Gets the assessmentScore value for this Opportunity.
     * 
     * @return assessmentScore
     */
    public java.lang.Object getAssessmentScore() {
        return assessmentScore;
    }


    /**
     * Sets the assessmentScore value for this Opportunity.
     * 
     * @param assessmentScore
     */
    public void setAssessmentScore(java.lang.Object assessmentScore) {
        this.assessmentScore = assessmentScore;
    }


    /**
     * Gets the barriers value for this Opportunity.
     * 
     * @return barriers
     */
    public java.lang.Object getBarriers() {
        return barriers;
    }


    /**
     * Sets the barriers value for this Opportunity.
     * 
     * @param barriers
     */
    public void setBarriers(java.lang.Object barriers) {
        this.barriers = barriers;
    }


    /**
     * Gets the closedDate value for this Opportunity.
     * 
     * @return closedDate
     */
    public java.lang.Object getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this Opportunity.
     * 
     * @param closedDate
     */
    public void setClosedDate(java.lang.Object closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the contactID value for this Opportunity.
     * 
     * @return contactID
     */
    public java.lang.Object getContactID() {
        return contactID;
    }


    /**
     * Sets the contactID value for this Opportunity.
     * 
     * @param contactID
     */
    public void setContactID(java.lang.Object contactID) {
        this.contactID = contactID;
    }


    /**
     * Gets the cost value for this Opportunity.
     * 
     * @return cost
     */
    public java.lang.Object getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this Opportunity.
     * 
     * @param cost
     */
    public void setCost(java.lang.Object cost) {
        this.cost = cost;
    }


    /**
     * Gets the createDate value for this Opportunity.
     * 
     * @return createDate
     */
    public java.lang.Object getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this Opportunity.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.Object createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the dateStamp value for this Opportunity.
     * 
     * @return dateStamp
     */
    public java.lang.Object getDateStamp() {
        return dateStamp;
    }


    /**
     * Sets the dateStamp value for this Opportunity.
     * 
     * @param dateStamp
     */
    public void setDateStamp(java.lang.Object dateStamp) {
        this.dateStamp = dateStamp;
    }


    /**
     * Gets the helpNeeded value for this Opportunity.
     * 
     * @return helpNeeded
     */
    public java.lang.Object getHelpNeeded() {
        return helpNeeded;
    }


    /**
     * Sets the helpNeeded value for this Opportunity.
     * 
     * @param helpNeeded
     */
    public void setHelpNeeded(java.lang.Object helpNeeded) {
        this.helpNeeded = helpNeeded;
    }


    /**
     * Gets the lastActivity value for this Opportunity.
     * 
     * @return lastActivity
     */
    public java.lang.Object getLastActivity() {
        return lastActivity;
    }


    /**
     * Sets the lastActivity value for this Opportunity.
     * 
     * @param lastActivity
     */
    public void setLastActivity(java.lang.Object lastActivity) {
        this.lastActivity = lastActivity;
    }


    /**
     * Gets the leadReferral value for this Opportunity.
     * 
     * @return leadReferral
     */
    public java.lang.Object getLeadReferral() {
        return leadReferral;
    }


    /**
     * Sets the leadReferral value for this Opportunity.
     * 
     * @param leadReferral
     */
    public void setLeadReferral(java.lang.Object leadReferral) {
        this.leadReferral = leadReferral;
    }


    /**
     * Gets the lossReason value for this Opportunity.
     * 
     * @return lossReason
     */
    public java.lang.Object getLossReason() {
        return lossReason;
    }


    /**
     * Sets the lossReason value for this Opportunity.
     * 
     * @param lossReason
     */
    public void setLossReason(java.lang.Object lossReason) {
        this.lossReason = lossReason;
    }


    /**
     * Gets the lossReasonDetail value for this Opportunity.
     * 
     * @return lossReasonDetail
     */
    public java.lang.Object getLossReasonDetail() {
        return lossReasonDetail;
    }


    /**
     * Sets the lossReasonDetail value for this Opportunity.
     * 
     * @param lossReasonDetail
     */
    public void setLossReasonDetail(java.lang.Object lossReasonDetail) {
        this.lossReasonDetail = lossReasonDetail;
    }


    /**
     * Gets the market value for this Opportunity.
     * 
     * @return market
     */
    public java.lang.Object getMarket() {
        return market;
    }


    /**
     * Sets the market value for this Opportunity.
     * 
     * @param market
     */
    public void setMarket(java.lang.Object market) {
        this.market = market;
    }


    /**
     * Gets the nextStep value for this Opportunity.
     * 
     * @return nextStep
     */
    public java.lang.Object getNextStep() {
        return nextStep;
    }


    /**
     * Sets the nextStep value for this Opportunity.
     * 
     * @param nextStep
     */
    public void setNextStep(java.lang.Object nextStep) {
        this.nextStep = nextStep;
    }


    /**
     * Gets the ownerResourceID value for this Opportunity.
     * 
     * @return ownerResourceID
     */
    public java.lang.Object getOwnerResourceID() {
        return ownerResourceID;
    }


    /**
     * Sets the ownerResourceID value for this Opportunity.
     * 
     * @param ownerResourceID
     */
    public void setOwnerResourceID(java.lang.Object ownerResourceID) {
        this.ownerResourceID = ownerResourceID;
    }


    /**
     * Gets the primaryCompetitor value for this Opportunity.
     * 
     * @return primaryCompetitor
     */
    public java.lang.Object getPrimaryCompetitor() {
        return primaryCompetitor;
    }


    /**
     * Sets the primaryCompetitor value for this Opportunity.
     * 
     * @param primaryCompetitor
     */
    public void setPrimaryCompetitor(java.lang.Object primaryCompetitor) {
        this.primaryCompetitor = primaryCompetitor;
    }


    /**
     * Gets the probability value for this Opportunity.
     * 
     * @return probability
     */
    public java.lang.Object getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this Opportunity.
     * 
     * @param probability
     */
    public void setProbability(java.lang.Object probability) {
        this.probability = probability;
    }


    /**
     * Gets the productID value for this Opportunity.
     * 
     * @return productID
     */
    public java.lang.Object getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this Opportunity.
     * 
     * @param productID
     */
    public void setProductID(java.lang.Object productID) {
        this.productID = productID;
    }


    /**
     * Gets the projectedCloseDate value for this Opportunity.
     * 
     * @return projectedCloseDate
     */
    public java.lang.Object getProjectedCloseDate() {
        return projectedCloseDate;
    }


    /**
     * Sets the projectedCloseDate value for this Opportunity.
     * 
     * @param projectedCloseDate
     */
    public void setProjectedCloseDate(java.lang.Object projectedCloseDate) {
        this.projectedCloseDate = projectedCloseDate;
    }


    /**
     * Gets the projectedLiveDate value for this Opportunity.
     * 
     * @return projectedLiveDate
     */
    public java.lang.Object getProjectedLiveDate() {
        return projectedLiveDate;
    }


    /**
     * Sets the projectedLiveDate value for this Opportunity.
     * 
     * @param projectedLiveDate
     */
    public void setProjectedLiveDate(java.lang.Object projectedLiveDate) {
        this.projectedLiveDate = projectedLiveDate;
    }


    /**
     * Gets the promotionName value for this Opportunity.
     * 
     * @return promotionName
     */
    public java.lang.Object getPromotionName() {
        return promotionName;
    }


    /**
     * Sets the promotionName value for this Opportunity.
     * 
     * @param promotionName
     */
    public void setPromotionName(java.lang.Object promotionName) {
        this.promotionName = promotionName;
    }


    /**
     * Gets the rating value for this Opportunity.
     * 
     * @return rating
     */
    public java.lang.Object getRating() {
        return rating;
    }


    /**
     * Sets the rating value for this Opportunity.
     * 
     * @param rating
     */
    public void setRating(java.lang.Object rating) {
        this.rating = rating;
    }


    /**
     * Gets the relationshipAssessmentScore value for this Opportunity.
     * 
     * @return relationshipAssessmentScore
     */
    public java.lang.Object getRelationshipAssessmentScore() {
        return relationshipAssessmentScore;
    }


    /**
     * Sets the relationshipAssessmentScore value for this Opportunity.
     * 
     * @param relationshipAssessmentScore
     */
    public void setRelationshipAssessmentScore(java.lang.Object relationshipAssessmentScore) {
        this.relationshipAssessmentScore = relationshipAssessmentScore;
    }


    /**
     * Gets the revenueSpread value for this Opportunity.
     * 
     * @return revenueSpread
     */
    public java.lang.Object getRevenueSpread() {
        return revenueSpread;
    }


    /**
     * Sets the revenueSpread value for this Opportunity.
     * 
     * @param revenueSpread
     */
    public void setRevenueSpread(java.lang.Object revenueSpread) {
        this.revenueSpread = revenueSpread;
    }


    /**
     * Gets the revenueSpreadUnit value for this Opportunity.
     * 
     * @return revenueSpreadUnit
     */
    public java.lang.Object getRevenueSpreadUnit() {
        return revenueSpreadUnit;
    }


    /**
     * Sets the revenueSpreadUnit value for this Opportunity.
     * 
     * @param revenueSpreadUnit
     */
    public void setRevenueSpreadUnit(java.lang.Object revenueSpreadUnit) {
        this.revenueSpreadUnit = revenueSpreadUnit;
    }


    /**
     * Gets the salesOrderID value for this Opportunity.
     * 
     * @return salesOrderID
     */
    public java.lang.Object getSalesOrderID() {
        return salesOrderID;
    }


    /**
     * Sets the salesOrderID value for this Opportunity.
     * 
     * @param salesOrderID
     */
    public void setSalesOrderID(java.lang.Object salesOrderID) {
        this.salesOrderID = salesOrderID;
    }


    /**
     * Gets the salesProcessPercentComplete value for this Opportunity.
     * 
     * @return salesProcessPercentComplete
     */
    public java.lang.Object getSalesProcessPercentComplete() {
        return salesProcessPercentComplete;
    }


    /**
     * Sets the salesProcessPercentComplete value for this Opportunity.
     * 
     * @param salesProcessPercentComplete
     */
    public void setSalesProcessPercentComplete(java.lang.Object salesProcessPercentComplete) {
        this.salesProcessPercentComplete = salesProcessPercentComplete;
    }


    /**
     * Gets the stage value for this Opportunity.
     * 
     * @return stage
     */
    public java.lang.Object getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this Opportunity.
     * 
     * @param stage
     */
    public void setStage(java.lang.Object stage) {
        this.stage = stage;
    }


    /**
     * Gets the status value for this Opportunity.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Opportunity.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the technicalAssessmentScore value for this Opportunity.
     * 
     * @return technicalAssessmentScore
     */
    public java.lang.Object getTechnicalAssessmentScore() {
        return technicalAssessmentScore;
    }


    /**
     * Sets the technicalAssessmentScore value for this Opportunity.
     * 
     * @param technicalAssessmentScore
     */
    public void setTechnicalAssessmentScore(java.lang.Object technicalAssessmentScore) {
        this.technicalAssessmentScore = technicalAssessmentScore;
    }


    /**
     * Gets the throughDate value for this Opportunity.
     * 
     * @return throughDate
     */
    public java.lang.Object getThroughDate() {
        return throughDate;
    }


    /**
     * Sets the throughDate value for this Opportunity.
     * 
     * @param throughDate
     */
    public void setThroughDate(java.lang.Object throughDate) {
        this.throughDate = throughDate;
    }


    /**
     * Gets the title value for this Opportunity.
     * 
     * @return title
     */
    public java.lang.Object getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Opportunity.
     * 
     * @param title
     */
    public void setTitle(java.lang.Object title) {
        this.title = title;
    }


    /**
     * Gets the totalAmountMonths value for this Opportunity.
     * 
     * @return totalAmountMonths
     */
    public java.lang.Object getTotalAmountMonths() {
        return totalAmountMonths;
    }


    /**
     * Sets the totalAmountMonths value for this Opportunity.
     * 
     * @param totalAmountMonths
     */
    public void setTotalAmountMonths(java.lang.Object totalAmountMonths) {
        this.totalAmountMonths = totalAmountMonths;
    }


    /**
     * Gets the useQuoteTotals value for this Opportunity.
     * 
     * @return useQuoteTotals
     */
    public java.lang.Object getUseQuoteTotals() {
        return useQuoteTotals;
    }


    /**
     * Sets the useQuoteTotals value for this Opportunity.
     * 
     * @param useQuoteTotals
     */
    public void setUseQuoteTotals(java.lang.Object useQuoteTotals) {
        this.useQuoteTotals = useQuoteTotals;
    }


    /**
     * Gets the winReason value for this Opportunity.
     * 
     * @return winReason
     */
    public java.lang.Object getWinReason() {
        return winReason;
    }


    /**
     * Sets the winReason value for this Opportunity.
     * 
     * @param winReason
     */
    public void setWinReason(java.lang.Object winReason) {
        this.winReason = winReason;
    }


    /**
     * Gets the winReasonDetail value for this Opportunity.
     * 
     * @return winReasonDetail
     */
    public java.lang.Object getWinReasonDetail() {
        return winReasonDetail;
    }


    /**
     * Sets the winReasonDetail value for this Opportunity.
     * 
     * @param winReasonDetail
     */
    public void setWinReasonDetail(java.lang.Object winReasonDetail) {
        this.winReasonDetail = winReasonDetail;
    }


    /**
     * Gets the onetimeCost value for this Opportunity.
     * 
     * @return onetimeCost
     */
    public java.lang.Object getOnetimeCost() {
        return onetimeCost;
    }


    /**
     * Sets the onetimeCost value for this Opportunity.
     * 
     * @param onetimeCost
     */
    public void setOnetimeCost(java.lang.Object onetimeCost) {
        this.onetimeCost = onetimeCost;
    }


    /**
     * Gets the onetimeRevenue value for this Opportunity.
     * 
     * @return onetimeRevenue
     */
    public java.lang.Object getOnetimeRevenue() {
        return onetimeRevenue;
    }


    /**
     * Sets the onetimeRevenue value for this Opportunity.
     * 
     * @param onetimeRevenue
     */
    public void setOnetimeRevenue(java.lang.Object onetimeRevenue) {
        this.onetimeRevenue = onetimeRevenue;
    }


    /**
     * Gets the monthlyCost value for this Opportunity.
     * 
     * @return monthlyCost
     */
    public java.lang.Object getMonthlyCost() {
        return monthlyCost;
    }


    /**
     * Sets the monthlyCost value for this Opportunity.
     * 
     * @param monthlyCost
     */
    public void setMonthlyCost(java.lang.Object monthlyCost) {
        this.monthlyCost = monthlyCost;
    }


    /**
     * Gets the monthlyRevenue value for this Opportunity.
     * 
     * @return monthlyRevenue
     */
    public java.lang.Object getMonthlyRevenue() {
        return monthlyRevenue;
    }


    /**
     * Sets the monthlyRevenue value for this Opportunity.
     * 
     * @param monthlyRevenue
     */
    public void setMonthlyRevenue(java.lang.Object monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }


    /**
     * Gets the quarterlyCost value for this Opportunity.
     * 
     * @return quarterlyCost
     */
    public java.lang.Object getQuarterlyCost() {
        return quarterlyCost;
    }


    /**
     * Sets the quarterlyCost value for this Opportunity.
     * 
     * @param quarterlyCost
     */
    public void setQuarterlyCost(java.lang.Object quarterlyCost) {
        this.quarterlyCost = quarterlyCost;
    }


    /**
     * Gets the quarterlyRevenue value for this Opportunity.
     * 
     * @return quarterlyRevenue
     */
    public java.lang.Object getQuarterlyRevenue() {
        return quarterlyRevenue;
    }


    /**
     * Sets the quarterlyRevenue value for this Opportunity.
     * 
     * @param quarterlyRevenue
     */
    public void setQuarterlyRevenue(java.lang.Object quarterlyRevenue) {
        this.quarterlyRevenue = quarterlyRevenue;
    }


    /**
     * Gets the yearlyCost value for this Opportunity.
     * 
     * @return yearlyCost
     */
    public java.lang.Object getYearlyCost() {
        return yearlyCost;
    }


    /**
     * Sets the yearlyCost value for this Opportunity.
     * 
     * @param yearlyCost
     */
    public void setYearlyCost(java.lang.Object yearlyCost) {
        this.yearlyCost = yearlyCost;
    }


    /**
     * Gets the yearlyRevenue value for this Opportunity.
     * 
     * @return yearlyRevenue
     */
    public java.lang.Object getYearlyRevenue() {
        return yearlyRevenue;
    }


    /**
     * Sets the yearlyRevenue value for this Opportunity.
     * 
     * @param yearlyRevenue
     */
    public void setYearlyRevenue(java.lang.Object yearlyRevenue) {
        this.yearlyRevenue = yearlyRevenue;
    }


    /**
     * Gets the semiannualCost value for this Opportunity.
     * 
     * @return semiannualCost
     */
    public java.lang.Object getSemiannualCost() {
        return semiannualCost;
    }


    /**
     * Sets the semiannualCost value for this Opportunity.
     * 
     * @param semiannualCost
     */
    public void setSemiannualCost(java.lang.Object semiannualCost) {
        this.semiannualCost = semiannualCost;
    }


    /**
     * Gets the semiannualRevenue value for this Opportunity.
     * 
     * @return semiannualRevenue
     */
    public java.lang.Object getSemiannualRevenue() {
        return semiannualRevenue;
    }


    /**
     * Sets the semiannualRevenue value for this Opportunity.
     * 
     * @param semiannualRevenue
     */
    public void setSemiannualRevenue(java.lang.Object semiannualRevenue) {
        this.semiannualRevenue = semiannualRevenue;
    }


    /**
     * Gets the businessDivisionSubdivisionID value for this Opportunity.
     * 
     * @return businessDivisionSubdivisionID
     */
    public java.lang.Object getBusinessDivisionSubdivisionID() {
        return businessDivisionSubdivisionID;
    }


    /**
     * Sets the businessDivisionSubdivisionID value for this Opportunity.
     * 
     * @param businessDivisionSubdivisionID
     */
    public void setBusinessDivisionSubdivisionID(java.lang.Object businessDivisionSubdivisionID) {
        this.businessDivisionSubdivisionID = businessDivisionSubdivisionID;
    }


    /**
     * Gets the opportunityCategoryID value for this Opportunity.
     * 
     * @return opportunityCategoryID
     */
    public java.lang.Object getOpportunityCategoryID() {
        return opportunityCategoryID;
    }


    /**
     * Sets the opportunityCategoryID value for this Opportunity.
     * 
     * @param opportunityCategoryID
     */
    public void setOpportunityCategoryID(java.lang.Object opportunityCategoryID) {
        this.opportunityCategoryID = opportunityCategoryID;
    }


    /**
     * Gets the lostDate value for this Opportunity.
     * 
     * @return lostDate
     */
    public java.lang.Object getLostDate() {
        return lostDate;
    }


    /**
     * Sets the lostDate value for this Opportunity.
     * 
     * @param lostDate
     */
    public void setLostDate(java.lang.Object lostDate) {
        this.lostDate = lostDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Opportunity)) return false;
        Opportunity other = (Opportunity) obj;
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
            ((this.advancedField1==null && other.getAdvancedField1()==null) || 
             (this.advancedField1!=null &&
              this.advancedField1.equals(other.getAdvancedField1()))) &&
            ((this.advancedField2==null && other.getAdvancedField2()==null) || 
             (this.advancedField2!=null &&
              this.advancedField2.equals(other.getAdvancedField2()))) &&
            ((this.advancedField3==null && other.getAdvancedField3()==null) || 
             (this.advancedField3!=null &&
              this.advancedField3.equals(other.getAdvancedField3()))) &&
            ((this.advancedField4==null && other.getAdvancedField4()==null) || 
             (this.advancedField4!=null &&
              this.advancedField4.equals(other.getAdvancedField4()))) &&
            ((this.advancedField5==null && other.getAdvancedField5()==null) || 
             (this.advancedField5!=null &&
              this.advancedField5.equals(other.getAdvancedField5()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.assessmentScore==null && other.getAssessmentScore()==null) || 
             (this.assessmentScore!=null &&
              this.assessmentScore.equals(other.getAssessmentScore()))) &&
            ((this.barriers==null && other.getBarriers()==null) || 
             (this.barriers!=null &&
              this.barriers.equals(other.getBarriers()))) &&
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              this.closedDate.equals(other.getClosedDate()))) &&
            ((this.contactID==null && other.getContactID()==null) || 
             (this.contactID!=null &&
              this.contactID.equals(other.getContactID()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.dateStamp==null && other.getDateStamp()==null) || 
             (this.dateStamp!=null &&
              this.dateStamp.equals(other.getDateStamp()))) &&
            ((this.helpNeeded==null && other.getHelpNeeded()==null) || 
             (this.helpNeeded!=null &&
              this.helpNeeded.equals(other.getHelpNeeded()))) &&
            ((this.lastActivity==null && other.getLastActivity()==null) || 
             (this.lastActivity!=null &&
              this.lastActivity.equals(other.getLastActivity()))) &&
            ((this.leadReferral==null && other.getLeadReferral()==null) || 
             (this.leadReferral!=null &&
              this.leadReferral.equals(other.getLeadReferral()))) &&
            ((this.lossReason==null && other.getLossReason()==null) || 
             (this.lossReason!=null &&
              this.lossReason.equals(other.getLossReason()))) &&
            ((this.lossReasonDetail==null && other.getLossReasonDetail()==null) || 
             (this.lossReasonDetail!=null &&
              this.lossReasonDetail.equals(other.getLossReasonDetail()))) &&
            ((this.market==null && other.getMarket()==null) || 
             (this.market!=null &&
              this.market.equals(other.getMarket()))) &&
            ((this.nextStep==null && other.getNextStep()==null) || 
             (this.nextStep!=null &&
              this.nextStep.equals(other.getNextStep()))) &&
            ((this.ownerResourceID==null && other.getOwnerResourceID()==null) || 
             (this.ownerResourceID!=null &&
              this.ownerResourceID.equals(other.getOwnerResourceID()))) &&
            ((this.primaryCompetitor==null && other.getPrimaryCompetitor()==null) || 
             (this.primaryCompetitor!=null &&
              this.primaryCompetitor.equals(other.getPrimaryCompetitor()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.projectedCloseDate==null && other.getProjectedCloseDate()==null) || 
             (this.projectedCloseDate!=null &&
              this.projectedCloseDate.equals(other.getProjectedCloseDate()))) &&
            ((this.projectedLiveDate==null && other.getProjectedLiveDate()==null) || 
             (this.projectedLiveDate!=null &&
              this.projectedLiveDate.equals(other.getProjectedLiveDate()))) &&
            ((this.promotionName==null && other.getPromotionName()==null) || 
             (this.promotionName!=null &&
              this.promotionName.equals(other.getPromotionName()))) &&
            ((this.rating==null && other.getRating()==null) || 
             (this.rating!=null &&
              this.rating.equals(other.getRating()))) &&
            ((this.relationshipAssessmentScore==null && other.getRelationshipAssessmentScore()==null) || 
             (this.relationshipAssessmentScore!=null &&
              this.relationshipAssessmentScore.equals(other.getRelationshipAssessmentScore()))) &&
            ((this.revenueSpread==null && other.getRevenueSpread()==null) || 
             (this.revenueSpread!=null &&
              this.revenueSpread.equals(other.getRevenueSpread()))) &&
            ((this.revenueSpreadUnit==null && other.getRevenueSpreadUnit()==null) || 
             (this.revenueSpreadUnit!=null &&
              this.revenueSpreadUnit.equals(other.getRevenueSpreadUnit()))) &&
            ((this.salesOrderID==null && other.getSalesOrderID()==null) || 
             (this.salesOrderID!=null &&
              this.salesOrderID.equals(other.getSalesOrderID()))) &&
            ((this.salesProcessPercentComplete==null && other.getSalesProcessPercentComplete()==null) || 
             (this.salesProcessPercentComplete!=null &&
              this.salesProcessPercentComplete.equals(other.getSalesProcessPercentComplete()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              this.stage.equals(other.getStage()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.technicalAssessmentScore==null && other.getTechnicalAssessmentScore()==null) || 
             (this.technicalAssessmentScore!=null &&
              this.technicalAssessmentScore.equals(other.getTechnicalAssessmentScore()))) &&
            ((this.throughDate==null && other.getThroughDate()==null) || 
             (this.throughDate!=null &&
              this.throughDate.equals(other.getThroughDate()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.totalAmountMonths==null && other.getTotalAmountMonths()==null) || 
             (this.totalAmountMonths!=null &&
              this.totalAmountMonths.equals(other.getTotalAmountMonths()))) &&
            ((this.useQuoteTotals==null && other.getUseQuoteTotals()==null) || 
             (this.useQuoteTotals!=null &&
              this.useQuoteTotals.equals(other.getUseQuoteTotals()))) &&
            ((this.winReason==null && other.getWinReason()==null) || 
             (this.winReason!=null &&
              this.winReason.equals(other.getWinReason()))) &&
            ((this.winReasonDetail==null && other.getWinReasonDetail()==null) || 
             (this.winReasonDetail!=null &&
              this.winReasonDetail.equals(other.getWinReasonDetail()))) &&
            ((this.onetimeCost==null && other.getOnetimeCost()==null) || 
             (this.onetimeCost!=null &&
              this.onetimeCost.equals(other.getOnetimeCost()))) &&
            ((this.onetimeRevenue==null && other.getOnetimeRevenue()==null) || 
             (this.onetimeRevenue!=null &&
              this.onetimeRevenue.equals(other.getOnetimeRevenue()))) &&
            ((this.monthlyCost==null && other.getMonthlyCost()==null) || 
             (this.monthlyCost!=null &&
              this.monthlyCost.equals(other.getMonthlyCost()))) &&
            ((this.monthlyRevenue==null && other.getMonthlyRevenue()==null) || 
             (this.monthlyRevenue!=null &&
              this.monthlyRevenue.equals(other.getMonthlyRevenue()))) &&
            ((this.quarterlyCost==null && other.getQuarterlyCost()==null) || 
             (this.quarterlyCost!=null &&
              this.quarterlyCost.equals(other.getQuarterlyCost()))) &&
            ((this.quarterlyRevenue==null && other.getQuarterlyRevenue()==null) || 
             (this.quarterlyRevenue!=null &&
              this.quarterlyRevenue.equals(other.getQuarterlyRevenue()))) &&
            ((this.yearlyCost==null && other.getYearlyCost()==null) || 
             (this.yearlyCost!=null &&
              this.yearlyCost.equals(other.getYearlyCost()))) &&
            ((this.yearlyRevenue==null && other.getYearlyRevenue()==null) || 
             (this.yearlyRevenue!=null &&
              this.yearlyRevenue.equals(other.getYearlyRevenue()))) &&
            ((this.semiannualCost==null && other.getSemiannualCost()==null) || 
             (this.semiannualCost!=null &&
              this.semiannualCost.equals(other.getSemiannualCost()))) &&
            ((this.semiannualRevenue==null && other.getSemiannualRevenue()==null) || 
             (this.semiannualRevenue!=null &&
              this.semiannualRevenue.equals(other.getSemiannualRevenue()))) &&
            ((this.businessDivisionSubdivisionID==null && other.getBusinessDivisionSubdivisionID()==null) || 
             (this.businessDivisionSubdivisionID!=null &&
              this.businessDivisionSubdivisionID.equals(other.getBusinessDivisionSubdivisionID()))) &&
            ((this.opportunityCategoryID==null && other.getOpportunityCategoryID()==null) || 
             (this.opportunityCategoryID!=null &&
              this.opportunityCategoryID.equals(other.getOpportunityCategoryID()))) &&
            ((this.lostDate==null && other.getLostDate()==null) || 
             (this.lostDate!=null &&
              this.lostDate.equals(other.getLostDate())));
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
        if (getAdvancedField1() != null) {
            _hashCode += getAdvancedField1().hashCode();
        }
        if (getAdvancedField2() != null) {
            _hashCode += getAdvancedField2().hashCode();
        }
        if (getAdvancedField3() != null) {
            _hashCode += getAdvancedField3().hashCode();
        }
        if (getAdvancedField4() != null) {
            _hashCode += getAdvancedField4().hashCode();
        }
        if (getAdvancedField5() != null) {
            _hashCode += getAdvancedField5().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAssessmentScore() != null) {
            _hashCode += getAssessmentScore().hashCode();
        }
        if (getBarriers() != null) {
            _hashCode += getBarriers().hashCode();
        }
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
        }
        if (getContactID() != null) {
            _hashCode += getContactID().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getDateStamp() != null) {
            _hashCode += getDateStamp().hashCode();
        }
        if (getHelpNeeded() != null) {
            _hashCode += getHelpNeeded().hashCode();
        }
        if (getLastActivity() != null) {
            _hashCode += getLastActivity().hashCode();
        }
        if (getLeadReferral() != null) {
            _hashCode += getLeadReferral().hashCode();
        }
        if (getLossReason() != null) {
            _hashCode += getLossReason().hashCode();
        }
        if (getLossReasonDetail() != null) {
            _hashCode += getLossReasonDetail().hashCode();
        }
        if (getMarket() != null) {
            _hashCode += getMarket().hashCode();
        }
        if (getNextStep() != null) {
            _hashCode += getNextStep().hashCode();
        }
        if (getOwnerResourceID() != null) {
            _hashCode += getOwnerResourceID().hashCode();
        }
        if (getPrimaryCompetitor() != null) {
            _hashCode += getPrimaryCompetitor().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getProjectedCloseDate() != null) {
            _hashCode += getProjectedCloseDate().hashCode();
        }
        if (getProjectedLiveDate() != null) {
            _hashCode += getProjectedLiveDate().hashCode();
        }
        if (getPromotionName() != null) {
            _hashCode += getPromotionName().hashCode();
        }
        if (getRating() != null) {
            _hashCode += getRating().hashCode();
        }
        if (getRelationshipAssessmentScore() != null) {
            _hashCode += getRelationshipAssessmentScore().hashCode();
        }
        if (getRevenueSpread() != null) {
            _hashCode += getRevenueSpread().hashCode();
        }
        if (getRevenueSpreadUnit() != null) {
            _hashCode += getRevenueSpreadUnit().hashCode();
        }
        if (getSalesOrderID() != null) {
            _hashCode += getSalesOrderID().hashCode();
        }
        if (getSalesProcessPercentComplete() != null) {
            _hashCode += getSalesProcessPercentComplete().hashCode();
        }
        if (getStage() != null) {
            _hashCode += getStage().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTechnicalAssessmentScore() != null) {
            _hashCode += getTechnicalAssessmentScore().hashCode();
        }
        if (getThroughDate() != null) {
            _hashCode += getThroughDate().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTotalAmountMonths() != null) {
            _hashCode += getTotalAmountMonths().hashCode();
        }
        if (getUseQuoteTotals() != null) {
            _hashCode += getUseQuoteTotals().hashCode();
        }
        if (getWinReason() != null) {
            _hashCode += getWinReason().hashCode();
        }
        if (getWinReasonDetail() != null) {
            _hashCode += getWinReasonDetail().hashCode();
        }
        if (getOnetimeCost() != null) {
            _hashCode += getOnetimeCost().hashCode();
        }
        if (getOnetimeRevenue() != null) {
            _hashCode += getOnetimeRevenue().hashCode();
        }
        if (getMonthlyCost() != null) {
            _hashCode += getMonthlyCost().hashCode();
        }
        if (getMonthlyRevenue() != null) {
            _hashCode += getMonthlyRevenue().hashCode();
        }
        if (getQuarterlyCost() != null) {
            _hashCode += getQuarterlyCost().hashCode();
        }
        if (getQuarterlyRevenue() != null) {
            _hashCode += getQuarterlyRevenue().hashCode();
        }
        if (getYearlyCost() != null) {
            _hashCode += getYearlyCost().hashCode();
        }
        if (getYearlyRevenue() != null) {
            _hashCode += getYearlyRevenue().hashCode();
        }
        if (getSemiannualCost() != null) {
            _hashCode += getSemiannualCost().hashCode();
        }
        if (getSemiannualRevenue() != null) {
            _hashCode += getSemiannualRevenue().hashCode();
        }
        if (getBusinessDivisionSubdivisionID() != null) {
            _hashCode += getBusinessDivisionSubdivisionID().hashCode();
        }
        if (getOpportunityCategoryID() != null) {
            _hashCode += getOpportunityCategoryID().hashCode();
        }
        if (getLostDate() != null) {
            _hashCode += getLostDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Opportunity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Opportunity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancedField1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdvancedField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancedField2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdvancedField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancedField3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdvancedField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancedField4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdvancedField4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancedField5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AdvancedField5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessmentScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "AssessmentScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barriers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Barriers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ClosedDate"));
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
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Cost"));
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
        elemField.setFieldName("dateStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DateStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpNeeded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HelpNeeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadReferral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LeadReferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LossReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossReasonDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LossReasonDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("market");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Market"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextStep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NextStep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OwnerResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryCompetitor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PrimaryCompetitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Probability"));
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
        elemField.setFieldName("projectedCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectedCloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedLiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ProjectedLiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PromotionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipAssessmentScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RelationshipAssessmentScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueSpread");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RevenueSpread"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueSpreadUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RevenueSpreadUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SalesOrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesProcessPercentComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SalesProcessPercentComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Stage"));
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
        elemField.setFieldName("technicalAssessmentScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TechnicalAssessmentScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throughDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ThroughDate"));
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
        elemField.setFieldName("totalAmountMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "TotalAmountMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useQuoteTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "UseQuoteTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("winReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WinReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("winReasonDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WinReasonDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onetimeCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OnetimeCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onetimeRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OnetimeRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MonthlyCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "MonthlyRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quarterlyCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuarterlyCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quarterlyRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "QuarterlyRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearlyCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "YearlyCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearlyRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "YearlyRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("semiannualCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SemiannualCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("semiannualRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SemiannualRevenue"));
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
        elemField.setFieldName("opportunityCategoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "OpportunityCategoryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lostDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LostDate"));
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
