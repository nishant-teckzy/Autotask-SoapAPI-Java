/**
 * InstalledProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class InstalledProduct  extends net.autotask.ATWS.v1_6.Entity  implements java.io.Serializable {
    private java.lang.Object createDate;

    private java.lang.Object accountID;

    private java.lang.Object active;

    private java.lang.Object dailyCost;

    private java.lang.Object hourlyCost;

    private java.lang.Object installDate;

    private java.lang.Object monthlyCost;

    private java.lang.Object notes;

    private java.lang.Object numberOfUsers;

    private java.lang.Object perUseCost;

    private java.lang.Object productID;

    private java.lang.Object referenceNumber;

    private java.lang.Object referenceTitle;

    private java.lang.Object serialNumber;

    private java.lang.Object setupFee;

    private java.lang.Object warrantyExpirationDate;

    private java.lang.Object contractID;

    private java.lang.Object serviceID;

    private java.lang.Object serviceBundleID;

    private java.lang.Object type;

    private java.lang.Object location;

    private java.lang.Object contactID;

    private java.lang.Object vendorID;

    private java.lang.Object installedByID;

    private java.lang.Object installedByContactID;

    private java.lang.Object parentInstalledProductID;

    private java.lang.Object lastModifiedTime;

    private java.lang.Object contractServiceID;

    private java.lang.Object contractServiceBundleID;

    private java.lang.Object serviceLevelAgreementID;

    private java.lang.Object accountPhysicalLocationID;

    private java.lang.Object RMMDeviceID;

    private java.lang.Object RMMDeviceUID;

    private java.lang.Object RMMDeviceAuditArchitectureID;

    private java.lang.Object RMMDeviceAuditDescription;

    private java.lang.Object RMMDeviceAuditDisplayAdaptorID;

    private java.lang.Object RMMDeviceAuditDomainID;

    private java.lang.Object RMMDeviceAuditExternalIPAddress;

    private java.lang.Object RMMDeviceAuditHostname;

    private java.lang.Object RMMDeviceAuditIPAddress;

    private java.lang.Object RMMDeviceAuditMacAddress;

    private java.lang.Object RMMDeviceAuditManufacturerID;

    private java.lang.Object RMMDeviceAuditMemoryBytes;

    private java.lang.Object RMMDeviceAuditModelID;

    private java.lang.Object RMMDeviceAuditMotherboardID;

    private java.lang.Object RMMDeviceAuditOperatingSystem;

    private java.lang.Object RMMDeviceAuditProcessorID;

    private java.lang.Object RMMDeviceAuditServicePackID;

    private java.lang.Object RMMDeviceAuditStorageBytes;

    private java.lang.Object RMMDeviceAuditDeviceTypeID;

    private java.lang.Object RMMDeviceAuditSNMPLocation;

    private java.lang.Object RMMDeviceAuditSNMPName;

    private java.lang.Object RMMDeviceAuditSNMPContact;

    private java.lang.Object RMMDeviceAuditMobileNetworkOperatorID;

    private java.lang.Object RMMDeviceAuditMobileNumber;

    private java.lang.Object RMMDeviceAuditMissingPatchCount;

    private java.lang.Object RMMOpenAlertCount;

    private java.lang.Object RMMDeviceAuditLastUser;

    private java.lang.Object dattoSerialNumber;

    private java.lang.Object dattoInternalIP;

    private java.lang.Object dattoRemoteIP;

    private java.lang.Object dattoHostname;

    private java.lang.Object dattoProtectedKilobytes;

    private java.lang.Object dattoUsedKilobytes;

    private java.lang.Object dattoAvailableKilobytes;

    private java.lang.Object dattoPercentageUsed;

    private java.lang.Object dattoOffsiteUsedBytes;

    private java.lang.Object dattoOSVersionID;

    private java.lang.Object dattoZFSVersionID;

    private java.lang.Object dattoKernelVersionID;

    private java.lang.Object dattoNICSpeedKilobitsPerSecond;

    private java.lang.Object dattoDeviceMemoryMegabytes;

    private java.lang.Object dattoUptimeSeconds;

    private java.lang.Object dattoNumberOfAgents;

    private java.lang.Object dattoNumberOfDrives;

    private java.lang.Object dattoDrivesErrors;

    private java.lang.Object dattoNumberOfVolumes;

    private java.lang.Object dattoLastCheckInDateTime;

    private java.lang.Object RMMDeviceAuditAntivirusStatusID;

    private java.lang.Object RMMDeviceAuditBackupStatusID;

    private java.lang.Object RMMDeviceAuditPatchStatusID;

    private java.lang.Object RMMDeviceAuditSoftwareStatusID;

    private java.lang.Object lastActivityPersonID;

    private java.lang.Object lastActivityPersonType;

    private java.lang.Object createdByPersonID;

    private java.lang.Object apiVendorID;

    private java.lang.Object deviceNetworkingID;

    public InstalledProduct() {
    }

    public InstalledProduct(
           net.autotask.ATWS.v1_6.Field[] fields,
           long id,
           net.autotask.ATWS.v1_6.UserDefinedField[] userDefinedFields,
           java.lang.Object createDate,
           java.lang.Object accountID,
           java.lang.Object active,
           java.lang.Object dailyCost,
           java.lang.Object hourlyCost,
           java.lang.Object installDate,
           java.lang.Object monthlyCost,
           java.lang.Object notes,
           java.lang.Object numberOfUsers,
           java.lang.Object perUseCost,
           java.lang.Object productID,
           java.lang.Object referenceNumber,
           java.lang.Object referenceTitle,
           java.lang.Object serialNumber,
           java.lang.Object setupFee,
           java.lang.Object warrantyExpirationDate,
           java.lang.Object contractID,
           java.lang.Object serviceID,
           java.lang.Object serviceBundleID,
           java.lang.Object type,
           java.lang.Object location,
           java.lang.Object contactID,
           java.lang.Object vendorID,
           java.lang.Object installedByID,
           java.lang.Object installedByContactID,
           java.lang.Object parentInstalledProductID,
           java.lang.Object lastModifiedTime,
           java.lang.Object contractServiceID,
           java.lang.Object contractServiceBundleID,
           java.lang.Object serviceLevelAgreementID,
           java.lang.Object accountPhysicalLocationID,
           java.lang.Object RMMDeviceID,
           java.lang.Object RMMDeviceUID,
           java.lang.Object RMMDeviceAuditArchitectureID,
           java.lang.Object RMMDeviceAuditDescription,
           java.lang.Object RMMDeviceAuditDisplayAdaptorID,
           java.lang.Object RMMDeviceAuditDomainID,
           java.lang.Object RMMDeviceAuditExternalIPAddress,
           java.lang.Object RMMDeviceAuditHostname,
           java.lang.Object RMMDeviceAuditIPAddress,
           java.lang.Object RMMDeviceAuditMacAddress,
           java.lang.Object RMMDeviceAuditManufacturerID,
           java.lang.Object RMMDeviceAuditMemoryBytes,
           java.lang.Object RMMDeviceAuditModelID,
           java.lang.Object RMMDeviceAuditMotherboardID,
           java.lang.Object RMMDeviceAuditOperatingSystem,
           java.lang.Object RMMDeviceAuditProcessorID,
           java.lang.Object RMMDeviceAuditServicePackID,
           java.lang.Object RMMDeviceAuditStorageBytes,
           java.lang.Object RMMDeviceAuditDeviceTypeID,
           java.lang.Object RMMDeviceAuditSNMPLocation,
           java.lang.Object RMMDeviceAuditSNMPName,
           java.lang.Object RMMDeviceAuditSNMPContact,
           java.lang.Object RMMDeviceAuditMobileNetworkOperatorID,
           java.lang.Object RMMDeviceAuditMobileNumber,
           java.lang.Object RMMDeviceAuditMissingPatchCount,
           java.lang.Object RMMOpenAlertCount,
           java.lang.Object RMMDeviceAuditLastUser,
           java.lang.Object dattoSerialNumber,
           java.lang.Object dattoInternalIP,
           java.lang.Object dattoRemoteIP,
           java.lang.Object dattoHostname,
           java.lang.Object dattoProtectedKilobytes,
           java.lang.Object dattoUsedKilobytes,
           java.lang.Object dattoAvailableKilobytes,
           java.lang.Object dattoPercentageUsed,
           java.lang.Object dattoOffsiteUsedBytes,
           java.lang.Object dattoOSVersionID,
           java.lang.Object dattoZFSVersionID,
           java.lang.Object dattoKernelVersionID,
           java.lang.Object dattoNICSpeedKilobitsPerSecond,
           java.lang.Object dattoDeviceMemoryMegabytes,
           java.lang.Object dattoUptimeSeconds,
           java.lang.Object dattoNumberOfAgents,
           java.lang.Object dattoNumberOfDrives,
           java.lang.Object dattoDrivesErrors,
           java.lang.Object dattoNumberOfVolumes,
           java.lang.Object dattoLastCheckInDateTime,
           java.lang.Object RMMDeviceAuditAntivirusStatusID,
           java.lang.Object RMMDeviceAuditBackupStatusID,
           java.lang.Object RMMDeviceAuditPatchStatusID,
           java.lang.Object RMMDeviceAuditSoftwareStatusID,
           java.lang.Object lastActivityPersonID,
           java.lang.Object lastActivityPersonType,
           java.lang.Object createdByPersonID,
           java.lang.Object apiVendorID,
           java.lang.Object deviceNetworkingID) {
        super(
            fields,
            id,
            userDefinedFields);
        this.createDate = createDate;
        this.accountID = accountID;
        this.active = active;
        this.dailyCost = dailyCost;
        this.hourlyCost = hourlyCost;
        this.installDate = installDate;
        this.monthlyCost = monthlyCost;
        this.notes = notes;
        this.numberOfUsers = numberOfUsers;
        this.perUseCost = perUseCost;
        this.productID = productID;
        this.referenceNumber = referenceNumber;
        this.referenceTitle = referenceTitle;
        this.serialNumber = serialNumber;
        this.setupFee = setupFee;
        this.warrantyExpirationDate = warrantyExpirationDate;
        this.contractID = contractID;
        this.serviceID = serviceID;
        this.serviceBundleID = serviceBundleID;
        this.type = type;
        this.location = location;
        this.contactID = contactID;
        this.vendorID = vendorID;
        this.installedByID = installedByID;
        this.installedByContactID = installedByContactID;
        this.parentInstalledProductID = parentInstalledProductID;
        this.lastModifiedTime = lastModifiedTime;
        this.contractServiceID = contractServiceID;
        this.contractServiceBundleID = contractServiceBundleID;
        this.serviceLevelAgreementID = serviceLevelAgreementID;
        this.accountPhysicalLocationID = accountPhysicalLocationID;
        this.RMMDeviceID = RMMDeviceID;
        this.RMMDeviceUID = RMMDeviceUID;
        this.RMMDeviceAuditArchitectureID = RMMDeviceAuditArchitectureID;
        this.RMMDeviceAuditDescription = RMMDeviceAuditDescription;
        this.RMMDeviceAuditDisplayAdaptorID = RMMDeviceAuditDisplayAdaptorID;
        this.RMMDeviceAuditDomainID = RMMDeviceAuditDomainID;
        this.RMMDeviceAuditExternalIPAddress = RMMDeviceAuditExternalIPAddress;
        this.RMMDeviceAuditHostname = RMMDeviceAuditHostname;
        this.RMMDeviceAuditIPAddress = RMMDeviceAuditIPAddress;
        this.RMMDeviceAuditMacAddress = RMMDeviceAuditMacAddress;
        this.RMMDeviceAuditManufacturerID = RMMDeviceAuditManufacturerID;
        this.RMMDeviceAuditMemoryBytes = RMMDeviceAuditMemoryBytes;
        this.RMMDeviceAuditModelID = RMMDeviceAuditModelID;
        this.RMMDeviceAuditMotherboardID = RMMDeviceAuditMotherboardID;
        this.RMMDeviceAuditOperatingSystem = RMMDeviceAuditOperatingSystem;
        this.RMMDeviceAuditProcessorID = RMMDeviceAuditProcessorID;
        this.RMMDeviceAuditServicePackID = RMMDeviceAuditServicePackID;
        this.RMMDeviceAuditStorageBytes = RMMDeviceAuditStorageBytes;
        this.RMMDeviceAuditDeviceTypeID = RMMDeviceAuditDeviceTypeID;
        this.RMMDeviceAuditSNMPLocation = RMMDeviceAuditSNMPLocation;
        this.RMMDeviceAuditSNMPName = RMMDeviceAuditSNMPName;
        this.RMMDeviceAuditSNMPContact = RMMDeviceAuditSNMPContact;
        this.RMMDeviceAuditMobileNetworkOperatorID = RMMDeviceAuditMobileNetworkOperatorID;
        this.RMMDeviceAuditMobileNumber = RMMDeviceAuditMobileNumber;
        this.RMMDeviceAuditMissingPatchCount = RMMDeviceAuditMissingPatchCount;
        this.RMMOpenAlertCount = RMMOpenAlertCount;
        this.RMMDeviceAuditLastUser = RMMDeviceAuditLastUser;
        this.dattoSerialNumber = dattoSerialNumber;
        this.dattoInternalIP = dattoInternalIP;
        this.dattoRemoteIP = dattoRemoteIP;
        this.dattoHostname = dattoHostname;
        this.dattoProtectedKilobytes = dattoProtectedKilobytes;
        this.dattoUsedKilobytes = dattoUsedKilobytes;
        this.dattoAvailableKilobytes = dattoAvailableKilobytes;
        this.dattoPercentageUsed = dattoPercentageUsed;
        this.dattoOffsiteUsedBytes = dattoOffsiteUsedBytes;
        this.dattoOSVersionID = dattoOSVersionID;
        this.dattoZFSVersionID = dattoZFSVersionID;
        this.dattoKernelVersionID = dattoKernelVersionID;
        this.dattoNICSpeedKilobitsPerSecond = dattoNICSpeedKilobitsPerSecond;
        this.dattoDeviceMemoryMegabytes = dattoDeviceMemoryMegabytes;
        this.dattoUptimeSeconds = dattoUptimeSeconds;
        this.dattoNumberOfAgents = dattoNumberOfAgents;
        this.dattoNumberOfDrives = dattoNumberOfDrives;
        this.dattoDrivesErrors = dattoDrivesErrors;
        this.dattoNumberOfVolumes = dattoNumberOfVolumes;
        this.dattoLastCheckInDateTime = dattoLastCheckInDateTime;
        this.RMMDeviceAuditAntivirusStatusID = RMMDeviceAuditAntivirusStatusID;
        this.RMMDeviceAuditBackupStatusID = RMMDeviceAuditBackupStatusID;
        this.RMMDeviceAuditPatchStatusID = RMMDeviceAuditPatchStatusID;
        this.RMMDeviceAuditSoftwareStatusID = RMMDeviceAuditSoftwareStatusID;
        this.lastActivityPersonID = lastActivityPersonID;
        this.lastActivityPersonType = lastActivityPersonType;
        this.createdByPersonID = createdByPersonID;
        this.apiVendorID = apiVendorID;
        this.deviceNetworkingID = deviceNetworkingID;
    }


    /**
     * Gets the createDate value for this InstalledProduct.
     * 
     * @return createDate
     */
    public java.lang.Object getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this InstalledProduct.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.Object createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the accountID value for this InstalledProduct.
     * 
     * @return accountID
     */
    public java.lang.Object getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this InstalledProduct.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Object accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the active value for this InstalledProduct.
     * 
     * @return active
     */
    public java.lang.Object getActive() {
        return active;
    }


    /**
     * Sets the active value for this InstalledProduct.
     * 
     * @param active
     */
    public void setActive(java.lang.Object active) {
        this.active = active;
    }


    /**
     * Gets the dailyCost value for this InstalledProduct.
     * 
     * @return dailyCost
     */
    public java.lang.Object getDailyCost() {
        return dailyCost;
    }


    /**
     * Sets the dailyCost value for this InstalledProduct.
     * 
     * @param dailyCost
     */
    public void setDailyCost(java.lang.Object dailyCost) {
        this.dailyCost = dailyCost;
    }


    /**
     * Gets the hourlyCost value for this InstalledProduct.
     * 
     * @return hourlyCost
     */
    public java.lang.Object getHourlyCost() {
        return hourlyCost;
    }


    /**
     * Sets the hourlyCost value for this InstalledProduct.
     * 
     * @param hourlyCost
     */
    public void setHourlyCost(java.lang.Object hourlyCost) {
        this.hourlyCost = hourlyCost;
    }


    /**
     * Gets the installDate value for this InstalledProduct.
     * 
     * @return installDate
     */
    public java.lang.Object getInstallDate() {
        return installDate;
    }


    /**
     * Sets the installDate value for this InstalledProduct.
     * 
     * @param installDate
     */
    public void setInstallDate(java.lang.Object installDate) {
        this.installDate = installDate;
    }


    /**
     * Gets the monthlyCost value for this InstalledProduct.
     * 
     * @return monthlyCost
     */
    public java.lang.Object getMonthlyCost() {
        return monthlyCost;
    }


    /**
     * Sets the monthlyCost value for this InstalledProduct.
     * 
     * @param monthlyCost
     */
    public void setMonthlyCost(java.lang.Object monthlyCost) {
        this.monthlyCost = monthlyCost;
    }


    /**
     * Gets the notes value for this InstalledProduct.
     * 
     * @return notes
     */
    public java.lang.Object getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this InstalledProduct.
     * 
     * @param notes
     */
    public void setNotes(java.lang.Object notes) {
        this.notes = notes;
    }


    /**
     * Gets the numberOfUsers value for this InstalledProduct.
     * 
     * @return numberOfUsers
     */
    public java.lang.Object getNumberOfUsers() {
        return numberOfUsers;
    }


    /**
     * Sets the numberOfUsers value for this InstalledProduct.
     * 
     * @param numberOfUsers
     */
    public void setNumberOfUsers(java.lang.Object numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }


    /**
     * Gets the perUseCost value for this InstalledProduct.
     * 
     * @return perUseCost
     */
    public java.lang.Object getPerUseCost() {
        return perUseCost;
    }


    /**
     * Sets the perUseCost value for this InstalledProduct.
     * 
     * @param perUseCost
     */
    public void setPerUseCost(java.lang.Object perUseCost) {
        this.perUseCost = perUseCost;
    }


    /**
     * Gets the productID value for this InstalledProduct.
     * 
     * @return productID
     */
    public java.lang.Object getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this InstalledProduct.
     * 
     * @param productID
     */
    public void setProductID(java.lang.Object productID) {
        this.productID = productID;
    }


    /**
     * Gets the referenceNumber value for this InstalledProduct.
     * 
     * @return referenceNumber
     */
    public java.lang.Object getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this InstalledProduct.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.Object referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the referenceTitle value for this InstalledProduct.
     * 
     * @return referenceTitle
     */
    public java.lang.Object getReferenceTitle() {
        return referenceTitle;
    }


    /**
     * Sets the referenceTitle value for this InstalledProduct.
     * 
     * @param referenceTitle
     */
    public void setReferenceTitle(java.lang.Object referenceTitle) {
        this.referenceTitle = referenceTitle;
    }


    /**
     * Gets the serialNumber value for this InstalledProduct.
     * 
     * @return serialNumber
     */
    public java.lang.Object getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this InstalledProduct.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.Object serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the setupFee value for this InstalledProduct.
     * 
     * @return setupFee
     */
    public java.lang.Object getSetupFee() {
        return setupFee;
    }


    /**
     * Sets the setupFee value for this InstalledProduct.
     * 
     * @param setupFee
     */
    public void setSetupFee(java.lang.Object setupFee) {
        this.setupFee = setupFee;
    }


    /**
     * Gets the warrantyExpirationDate value for this InstalledProduct.
     * 
     * @return warrantyExpirationDate
     */
    public java.lang.Object getWarrantyExpirationDate() {
        return warrantyExpirationDate;
    }


    /**
     * Sets the warrantyExpirationDate value for this InstalledProduct.
     * 
     * @param warrantyExpirationDate
     */
    public void setWarrantyExpirationDate(java.lang.Object warrantyExpirationDate) {
        this.warrantyExpirationDate = warrantyExpirationDate;
    }


    /**
     * Gets the contractID value for this InstalledProduct.
     * 
     * @return contractID
     */
    public java.lang.Object getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this InstalledProduct.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Object contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the serviceID value for this InstalledProduct.
     * 
     * @return serviceID
     */
    public java.lang.Object getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this InstalledProduct.
     * 
     * @param serviceID
     */
    public void setServiceID(java.lang.Object serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the serviceBundleID value for this InstalledProduct.
     * 
     * @return serviceBundleID
     */
    public java.lang.Object getServiceBundleID() {
        return serviceBundleID;
    }


    /**
     * Sets the serviceBundleID value for this InstalledProduct.
     * 
     * @param serviceBundleID
     */
    public void setServiceBundleID(java.lang.Object serviceBundleID) {
        this.serviceBundleID = serviceBundleID;
    }


    /**
     * Gets the type value for this InstalledProduct.
     * 
     * @return type
     */
    public java.lang.Object getType() {
        return type;
    }


    /**
     * Sets the type value for this InstalledProduct.
     * 
     * @param type
     */
    public void setType(java.lang.Object type) {
        this.type = type;
    }


    /**
     * Gets the location value for this InstalledProduct.
     * 
     * @return location
     */
    public java.lang.Object getLocation() {
        return location;
    }


    /**
     * Sets the location value for this InstalledProduct.
     * 
     * @param location
     */
    public void setLocation(java.lang.Object location) {
        this.location = location;
    }


    /**
     * Gets the contactID value for this InstalledProduct.
     * 
     * @return contactID
     */
    public java.lang.Object getContactID() {
        return contactID;
    }


    /**
     * Sets the contactID value for this InstalledProduct.
     * 
     * @param contactID
     */
    public void setContactID(java.lang.Object contactID) {
        this.contactID = contactID;
    }


    /**
     * Gets the vendorID value for this InstalledProduct.
     * 
     * @return vendorID
     */
    public java.lang.Object getVendorID() {
        return vendorID;
    }


    /**
     * Sets the vendorID value for this InstalledProduct.
     * 
     * @param vendorID
     */
    public void setVendorID(java.lang.Object vendorID) {
        this.vendorID = vendorID;
    }


    /**
     * Gets the installedByID value for this InstalledProduct.
     * 
     * @return installedByID
     */
    public java.lang.Object getInstalledByID() {
        return installedByID;
    }


    /**
     * Sets the installedByID value for this InstalledProduct.
     * 
     * @param installedByID
     */
    public void setInstalledByID(java.lang.Object installedByID) {
        this.installedByID = installedByID;
    }


    /**
     * Gets the installedByContactID value for this InstalledProduct.
     * 
     * @return installedByContactID
     */
    public java.lang.Object getInstalledByContactID() {
        return installedByContactID;
    }


    /**
     * Sets the installedByContactID value for this InstalledProduct.
     * 
     * @param installedByContactID
     */
    public void setInstalledByContactID(java.lang.Object installedByContactID) {
        this.installedByContactID = installedByContactID;
    }


    /**
     * Gets the parentInstalledProductID value for this InstalledProduct.
     * 
     * @return parentInstalledProductID
     */
    public java.lang.Object getParentInstalledProductID() {
        return parentInstalledProductID;
    }


    /**
     * Sets the parentInstalledProductID value for this InstalledProduct.
     * 
     * @param parentInstalledProductID
     */
    public void setParentInstalledProductID(java.lang.Object parentInstalledProductID) {
        this.parentInstalledProductID = parentInstalledProductID;
    }


    /**
     * Gets the lastModifiedTime value for this InstalledProduct.
     * 
     * @return lastModifiedTime
     */
    public java.lang.Object getLastModifiedTime() {
        return lastModifiedTime;
    }


    /**
     * Sets the lastModifiedTime value for this InstalledProduct.
     * 
     * @param lastModifiedTime
     */
    public void setLastModifiedTime(java.lang.Object lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }


    /**
     * Gets the contractServiceID value for this InstalledProduct.
     * 
     * @return contractServiceID
     */
    public java.lang.Object getContractServiceID() {
        return contractServiceID;
    }


    /**
     * Sets the contractServiceID value for this InstalledProduct.
     * 
     * @param contractServiceID
     */
    public void setContractServiceID(java.lang.Object contractServiceID) {
        this.contractServiceID = contractServiceID;
    }


    /**
     * Gets the contractServiceBundleID value for this InstalledProduct.
     * 
     * @return contractServiceBundleID
     */
    public java.lang.Object getContractServiceBundleID() {
        return contractServiceBundleID;
    }


    /**
     * Sets the contractServiceBundleID value for this InstalledProduct.
     * 
     * @param contractServiceBundleID
     */
    public void setContractServiceBundleID(java.lang.Object contractServiceBundleID) {
        this.contractServiceBundleID = contractServiceBundleID;
    }


    /**
     * Gets the serviceLevelAgreementID value for this InstalledProduct.
     * 
     * @return serviceLevelAgreementID
     */
    public java.lang.Object getServiceLevelAgreementID() {
        return serviceLevelAgreementID;
    }


    /**
     * Sets the serviceLevelAgreementID value for this InstalledProduct.
     * 
     * @param serviceLevelAgreementID
     */
    public void setServiceLevelAgreementID(java.lang.Object serviceLevelAgreementID) {
        this.serviceLevelAgreementID = serviceLevelAgreementID;
    }


    /**
     * Gets the accountPhysicalLocationID value for this InstalledProduct.
     * 
     * @return accountPhysicalLocationID
     */
    public java.lang.Object getAccountPhysicalLocationID() {
        return accountPhysicalLocationID;
    }


    /**
     * Sets the accountPhysicalLocationID value for this InstalledProduct.
     * 
     * @param accountPhysicalLocationID
     */
    public void setAccountPhysicalLocationID(java.lang.Object accountPhysicalLocationID) {
        this.accountPhysicalLocationID = accountPhysicalLocationID;
    }


    /**
     * Gets the RMMDeviceID value for this InstalledProduct.
     * 
     * @return RMMDeviceID
     */
    public java.lang.Object getRMMDeviceID() {
        return RMMDeviceID;
    }


    /**
     * Sets the RMMDeviceID value for this InstalledProduct.
     * 
     * @param RMMDeviceID
     */
    public void setRMMDeviceID(java.lang.Object RMMDeviceID) {
        this.RMMDeviceID = RMMDeviceID;
    }


    /**
     * Gets the RMMDeviceUID value for this InstalledProduct.
     * 
     * @return RMMDeviceUID
     */
    public java.lang.Object getRMMDeviceUID() {
        return RMMDeviceUID;
    }


    /**
     * Sets the RMMDeviceUID value for this InstalledProduct.
     * 
     * @param RMMDeviceUID
     */
    public void setRMMDeviceUID(java.lang.Object RMMDeviceUID) {
        this.RMMDeviceUID = RMMDeviceUID;
    }


    /**
     * Gets the RMMDeviceAuditArchitectureID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditArchitectureID
     */
    public java.lang.Object getRMMDeviceAuditArchitectureID() {
        return RMMDeviceAuditArchitectureID;
    }


    /**
     * Sets the RMMDeviceAuditArchitectureID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditArchitectureID
     */
    public void setRMMDeviceAuditArchitectureID(java.lang.Object RMMDeviceAuditArchitectureID) {
        this.RMMDeviceAuditArchitectureID = RMMDeviceAuditArchitectureID;
    }


    /**
     * Gets the RMMDeviceAuditDescription value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditDescription
     */
    public java.lang.Object getRMMDeviceAuditDescription() {
        return RMMDeviceAuditDescription;
    }


    /**
     * Sets the RMMDeviceAuditDescription value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditDescription
     */
    public void setRMMDeviceAuditDescription(java.lang.Object RMMDeviceAuditDescription) {
        this.RMMDeviceAuditDescription = RMMDeviceAuditDescription;
    }


    /**
     * Gets the RMMDeviceAuditDisplayAdaptorID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditDisplayAdaptorID
     */
    public java.lang.Object getRMMDeviceAuditDisplayAdaptorID() {
        return RMMDeviceAuditDisplayAdaptorID;
    }


    /**
     * Sets the RMMDeviceAuditDisplayAdaptorID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditDisplayAdaptorID
     */
    public void setRMMDeviceAuditDisplayAdaptorID(java.lang.Object RMMDeviceAuditDisplayAdaptorID) {
        this.RMMDeviceAuditDisplayAdaptorID = RMMDeviceAuditDisplayAdaptorID;
    }


    /**
     * Gets the RMMDeviceAuditDomainID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditDomainID
     */
    public java.lang.Object getRMMDeviceAuditDomainID() {
        return RMMDeviceAuditDomainID;
    }


    /**
     * Sets the RMMDeviceAuditDomainID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditDomainID
     */
    public void setRMMDeviceAuditDomainID(java.lang.Object RMMDeviceAuditDomainID) {
        this.RMMDeviceAuditDomainID = RMMDeviceAuditDomainID;
    }


    /**
     * Gets the RMMDeviceAuditExternalIPAddress value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditExternalIPAddress
     */
    public java.lang.Object getRMMDeviceAuditExternalIPAddress() {
        return RMMDeviceAuditExternalIPAddress;
    }


    /**
     * Sets the RMMDeviceAuditExternalIPAddress value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditExternalIPAddress
     */
    public void setRMMDeviceAuditExternalIPAddress(java.lang.Object RMMDeviceAuditExternalIPAddress) {
        this.RMMDeviceAuditExternalIPAddress = RMMDeviceAuditExternalIPAddress;
    }


    /**
     * Gets the RMMDeviceAuditHostname value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditHostname
     */
    public java.lang.Object getRMMDeviceAuditHostname() {
        return RMMDeviceAuditHostname;
    }


    /**
     * Sets the RMMDeviceAuditHostname value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditHostname
     */
    public void setRMMDeviceAuditHostname(java.lang.Object RMMDeviceAuditHostname) {
        this.RMMDeviceAuditHostname = RMMDeviceAuditHostname;
    }


    /**
     * Gets the RMMDeviceAuditIPAddress value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditIPAddress
     */
    public java.lang.Object getRMMDeviceAuditIPAddress() {
        return RMMDeviceAuditIPAddress;
    }


    /**
     * Sets the RMMDeviceAuditIPAddress value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditIPAddress
     */
    public void setRMMDeviceAuditIPAddress(java.lang.Object RMMDeviceAuditIPAddress) {
        this.RMMDeviceAuditIPAddress = RMMDeviceAuditIPAddress;
    }


    /**
     * Gets the RMMDeviceAuditMacAddress value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditMacAddress
     */
    public java.lang.Object getRMMDeviceAuditMacAddress() {
        return RMMDeviceAuditMacAddress;
    }


    /**
     * Sets the RMMDeviceAuditMacAddress value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditMacAddress
     */
    public void setRMMDeviceAuditMacAddress(java.lang.Object RMMDeviceAuditMacAddress) {
        this.RMMDeviceAuditMacAddress = RMMDeviceAuditMacAddress;
    }


    /**
     * Gets the RMMDeviceAuditManufacturerID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditManufacturerID
     */
    public java.lang.Object getRMMDeviceAuditManufacturerID() {
        return RMMDeviceAuditManufacturerID;
    }


    /**
     * Sets the RMMDeviceAuditManufacturerID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditManufacturerID
     */
    public void setRMMDeviceAuditManufacturerID(java.lang.Object RMMDeviceAuditManufacturerID) {
        this.RMMDeviceAuditManufacturerID = RMMDeviceAuditManufacturerID;
    }


    /**
     * Gets the RMMDeviceAuditMemoryBytes value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditMemoryBytes
     */
    public java.lang.Object getRMMDeviceAuditMemoryBytes() {
        return RMMDeviceAuditMemoryBytes;
    }


    /**
     * Sets the RMMDeviceAuditMemoryBytes value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditMemoryBytes
     */
    public void setRMMDeviceAuditMemoryBytes(java.lang.Object RMMDeviceAuditMemoryBytes) {
        this.RMMDeviceAuditMemoryBytes = RMMDeviceAuditMemoryBytes;
    }


    /**
     * Gets the RMMDeviceAuditModelID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditModelID
     */
    public java.lang.Object getRMMDeviceAuditModelID() {
        return RMMDeviceAuditModelID;
    }


    /**
     * Sets the RMMDeviceAuditModelID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditModelID
     */
    public void setRMMDeviceAuditModelID(java.lang.Object RMMDeviceAuditModelID) {
        this.RMMDeviceAuditModelID = RMMDeviceAuditModelID;
    }


    /**
     * Gets the RMMDeviceAuditMotherboardID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditMotherboardID
     */
    public java.lang.Object getRMMDeviceAuditMotherboardID() {
        return RMMDeviceAuditMotherboardID;
    }


    /**
     * Sets the RMMDeviceAuditMotherboardID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditMotherboardID
     */
    public void setRMMDeviceAuditMotherboardID(java.lang.Object RMMDeviceAuditMotherboardID) {
        this.RMMDeviceAuditMotherboardID = RMMDeviceAuditMotherboardID;
    }


    /**
     * Gets the RMMDeviceAuditOperatingSystem value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditOperatingSystem
     */
    public java.lang.Object getRMMDeviceAuditOperatingSystem() {
        return RMMDeviceAuditOperatingSystem;
    }


    /**
     * Sets the RMMDeviceAuditOperatingSystem value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditOperatingSystem
     */
    public void setRMMDeviceAuditOperatingSystem(java.lang.Object RMMDeviceAuditOperatingSystem) {
        this.RMMDeviceAuditOperatingSystem = RMMDeviceAuditOperatingSystem;
    }


    /**
     * Gets the RMMDeviceAuditProcessorID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditProcessorID
     */
    public java.lang.Object getRMMDeviceAuditProcessorID() {
        return RMMDeviceAuditProcessorID;
    }


    /**
     * Sets the RMMDeviceAuditProcessorID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditProcessorID
     */
    public void setRMMDeviceAuditProcessorID(java.lang.Object RMMDeviceAuditProcessorID) {
        this.RMMDeviceAuditProcessorID = RMMDeviceAuditProcessorID;
    }


    /**
     * Gets the RMMDeviceAuditServicePackID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditServicePackID
     */
    public java.lang.Object getRMMDeviceAuditServicePackID() {
        return RMMDeviceAuditServicePackID;
    }


    /**
     * Sets the RMMDeviceAuditServicePackID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditServicePackID
     */
    public void setRMMDeviceAuditServicePackID(java.lang.Object RMMDeviceAuditServicePackID) {
        this.RMMDeviceAuditServicePackID = RMMDeviceAuditServicePackID;
    }


    /**
     * Gets the RMMDeviceAuditStorageBytes value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditStorageBytes
     */
    public java.lang.Object getRMMDeviceAuditStorageBytes() {
        return RMMDeviceAuditStorageBytes;
    }


    /**
     * Sets the RMMDeviceAuditStorageBytes value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditStorageBytes
     */
    public void setRMMDeviceAuditStorageBytes(java.lang.Object RMMDeviceAuditStorageBytes) {
        this.RMMDeviceAuditStorageBytes = RMMDeviceAuditStorageBytes;
    }


    /**
     * Gets the RMMDeviceAuditDeviceTypeID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditDeviceTypeID
     */
    public java.lang.Object getRMMDeviceAuditDeviceTypeID() {
        return RMMDeviceAuditDeviceTypeID;
    }


    /**
     * Sets the RMMDeviceAuditDeviceTypeID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditDeviceTypeID
     */
    public void setRMMDeviceAuditDeviceTypeID(java.lang.Object RMMDeviceAuditDeviceTypeID) {
        this.RMMDeviceAuditDeviceTypeID = RMMDeviceAuditDeviceTypeID;
    }


    /**
     * Gets the RMMDeviceAuditSNMPLocation value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditSNMPLocation
     */
    public java.lang.Object getRMMDeviceAuditSNMPLocation() {
        return RMMDeviceAuditSNMPLocation;
    }


    /**
     * Sets the RMMDeviceAuditSNMPLocation value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditSNMPLocation
     */
    public void setRMMDeviceAuditSNMPLocation(java.lang.Object RMMDeviceAuditSNMPLocation) {
        this.RMMDeviceAuditSNMPLocation = RMMDeviceAuditSNMPLocation;
    }


    /**
     * Gets the RMMDeviceAuditSNMPName value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditSNMPName
     */
    public java.lang.Object getRMMDeviceAuditSNMPName() {
        return RMMDeviceAuditSNMPName;
    }


    /**
     * Sets the RMMDeviceAuditSNMPName value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditSNMPName
     */
    public void setRMMDeviceAuditSNMPName(java.lang.Object RMMDeviceAuditSNMPName) {
        this.RMMDeviceAuditSNMPName = RMMDeviceAuditSNMPName;
    }


    /**
     * Gets the RMMDeviceAuditSNMPContact value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditSNMPContact
     */
    public java.lang.Object getRMMDeviceAuditSNMPContact() {
        return RMMDeviceAuditSNMPContact;
    }


    /**
     * Sets the RMMDeviceAuditSNMPContact value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditSNMPContact
     */
    public void setRMMDeviceAuditSNMPContact(java.lang.Object RMMDeviceAuditSNMPContact) {
        this.RMMDeviceAuditSNMPContact = RMMDeviceAuditSNMPContact;
    }


    /**
     * Gets the RMMDeviceAuditMobileNetworkOperatorID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditMobileNetworkOperatorID
     */
    public java.lang.Object getRMMDeviceAuditMobileNetworkOperatorID() {
        return RMMDeviceAuditMobileNetworkOperatorID;
    }


    /**
     * Sets the RMMDeviceAuditMobileNetworkOperatorID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditMobileNetworkOperatorID
     */
    public void setRMMDeviceAuditMobileNetworkOperatorID(java.lang.Object RMMDeviceAuditMobileNetworkOperatorID) {
        this.RMMDeviceAuditMobileNetworkOperatorID = RMMDeviceAuditMobileNetworkOperatorID;
    }


    /**
     * Gets the RMMDeviceAuditMobileNumber value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditMobileNumber
     */
    public java.lang.Object getRMMDeviceAuditMobileNumber() {
        return RMMDeviceAuditMobileNumber;
    }


    /**
     * Sets the RMMDeviceAuditMobileNumber value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditMobileNumber
     */
    public void setRMMDeviceAuditMobileNumber(java.lang.Object RMMDeviceAuditMobileNumber) {
        this.RMMDeviceAuditMobileNumber = RMMDeviceAuditMobileNumber;
    }


    /**
     * Gets the RMMDeviceAuditMissingPatchCount value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditMissingPatchCount
     */
    public java.lang.Object getRMMDeviceAuditMissingPatchCount() {
        return RMMDeviceAuditMissingPatchCount;
    }


    /**
     * Sets the RMMDeviceAuditMissingPatchCount value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditMissingPatchCount
     */
    public void setRMMDeviceAuditMissingPatchCount(java.lang.Object RMMDeviceAuditMissingPatchCount) {
        this.RMMDeviceAuditMissingPatchCount = RMMDeviceAuditMissingPatchCount;
    }


    /**
     * Gets the RMMOpenAlertCount value for this InstalledProduct.
     * 
     * @return RMMOpenAlertCount
     */
    public java.lang.Object getRMMOpenAlertCount() {
        return RMMOpenAlertCount;
    }


    /**
     * Sets the RMMOpenAlertCount value for this InstalledProduct.
     * 
     * @param RMMOpenAlertCount
     */
    public void setRMMOpenAlertCount(java.lang.Object RMMOpenAlertCount) {
        this.RMMOpenAlertCount = RMMOpenAlertCount;
    }


    /**
     * Gets the RMMDeviceAuditLastUser value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditLastUser
     */
    public java.lang.Object getRMMDeviceAuditLastUser() {
        return RMMDeviceAuditLastUser;
    }


    /**
     * Sets the RMMDeviceAuditLastUser value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditLastUser
     */
    public void setRMMDeviceAuditLastUser(java.lang.Object RMMDeviceAuditLastUser) {
        this.RMMDeviceAuditLastUser = RMMDeviceAuditLastUser;
    }


    /**
     * Gets the dattoSerialNumber value for this InstalledProduct.
     * 
     * @return dattoSerialNumber
     */
    public java.lang.Object getDattoSerialNumber() {
        return dattoSerialNumber;
    }


    /**
     * Sets the dattoSerialNumber value for this InstalledProduct.
     * 
     * @param dattoSerialNumber
     */
    public void setDattoSerialNumber(java.lang.Object dattoSerialNumber) {
        this.dattoSerialNumber = dattoSerialNumber;
    }


    /**
     * Gets the dattoInternalIP value for this InstalledProduct.
     * 
     * @return dattoInternalIP
     */
    public java.lang.Object getDattoInternalIP() {
        return dattoInternalIP;
    }


    /**
     * Sets the dattoInternalIP value for this InstalledProduct.
     * 
     * @param dattoInternalIP
     */
    public void setDattoInternalIP(java.lang.Object dattoInternalIP) {
        this.dattoInternalIP = dattoInternalIP;
    }


    /**
     * Gets the dattoRemoteIP value for this InstalledProduct.
     * 
     * @return dattoRemoteIP
     */
    public java.lang.Object getDattoRemoteIP() {
        return dattoRemoteIP;
    }


    /**
     * Sets the dattoRemoteIP value for this InstalledProduct.
     * 
     * @param dattoRemoteIP
     */
    public void setDattoRemoteIP(java.lang.Object dattoRemoteIP) {
        this.dattoRemoteIP = dattoRemoteIP;
    }


    /**
     * Gets the dattoHostname value for this InstalledProduct.
     * 
     * @return dattoHostname
     */
    public java.lang.Object getDattoHostname() {
        return dattoHostname;
    }


    /**
     * Sets the dattoHostname value for this InstalledProduct.
     * 
     * @param dattoHostname
     */
    public void setDattoHostname(java.lang.Object dattoHostname) {
        this.dattoHostname = dattoHostname;
    }


    /**
     * Gets the dattoProtectedKilobytes value for this InstalledProduct.
     * 
     * @return dattoProtectedKilobytes
     */
    public java.lang.Object getDattoProtectedKilobytes() {
        return dattoProtectedKilobytes;
    }


    /**
     * Sets the dattoProtectedKilobytes value for this InstalledProduct.
     * 
     * @param dattoProtectedKilobytes
     */
    public void setDattoProtectedKilobytes(java.lang.Object dattoProtectedKilobytes) {
        this.dattoProtectedKilobytes = dattoProtectedKilobytes;
    }


    /**
     * Gets the dattoUsedKilobytes value for this InstalledProduct.
     * 
     * @return dattoUsedKilobytes
     */
    public java.lang.Object getDattoUsedKilobytes() {
        return dattoUsedKilobytes;
    }


    /**
     * Sets the dattoUsedKilobytes value for this InstalledProduct.
     * 
     * @param dattoUsedKilobytes
     */
    public void setDattoUsedKilobytes(java.lang.Object dattoUsedKilobytes) {
        this.dattoUsedKilobytes = dattoUsedKilobytes;
    }


    /**
     * Gets the dattoAvailableKilobytes value for this InstalledProduct.
     * 
     * @return dattoAvailableKilobytes
     */
    public java.lang.Object getDattoAvailableKilobytes() {
        return dattoAvailableKilobytes;
    }


    /**
     * Sets the dattoAvailableKilobytes value for this InstalledProduct.
     * 
     * @param dattoAvailableKilobytes
     */
    public void setDattoAvailableKilobytes(java.lang.Object dattoAvailableKilobytes) {
        this.dattoAvailableKilobytes = dattoAvailableKilobytes;
    }


    /**
     * Gets the dattoPercentageUsed value for this InstalledProduct.
     * 
     * @return dattoPercentageUsed
     */
    public java.lang.Object getDattoPercentageUsed() {
        return dattoPercentageUsed;
    }


    /**
     * Sets the dattoPercentageUsed value for this InstalledProduct.
     * 
     * @param dattoPercentageUsed
     */
    public void setDattoPercentageUsed(java.lang.Object dattoPercentageUsed) {
        this.dattoPercentageUsed = dattoPercentageUsed;
    }


    /**
     * Gets the dattoOffsiteUsedBytes value for this InstalledProduct.
     * 
     * @return dattoOffsiteUsedBytes
     */
    public java.lang.Object getDattoOffsiteUsedBytes() {
        return dattoOffsiteUsedBytes;
    }


    /**
     * Sets the dattoOffsiteUsedBytes value for this InstalledProduct.
     * 
     * @param dattoOffsiteUsedBytes
     */
    public void setDattoOffsiteUsedBytes(java.lang.Object dattoOffsiteUsedBytes) {
        this.dattoOffsiteUsedBytes = dattoOffsiteUsedBytes;
    }


    /**
     * Gets the dattoOSVersionID value for this InstalledProduct.
     * 
     * @return dattoOSVersionID
     */
    public java.lang.Object getDattoOSVersionID() {
        return dattoOSVersionID;
    }


    /**
     * Sets the dattoOSVersionID value for this InstalledProduct.
     * 
     * @param dattoOSVersionID
     */
    public void setDattoOSVersionID(java.lang.Object dattoOSVersionID) {
        this.dattoOSVersionID = dattoOSVersionID;
    }


    /**
     * Gets the dattoZFSVersionID value for this InstalledProduct.
     * 
     * @return dattoZFSVersionID
     */
    public java.lang.Object getDattoZFSVersionID() {
        return dattoZFSVersionID;
    }


    /**
     * Sets the dattoZFSVersionID value for this InstalledProduct.
     * 
     * @param dattoZFSVersionID
     */
    public void setDattoZFSVersionID(java.lang.Object dattoZFSVersionID) {
        this.dattoZFSVersionID = dattoZFSVersionID;
    }


    /**
     * Gets the dattoKernelVersionID value for this InstalledProduct.
     * 
     * @return dattoKernelVersionID
     */
    public java.lang.Object getDattoKernelVersionID() {
        return dattoKernelVersionID;
    }


    /**
     * Sets the dattoKernelVersionID value for this InstalledProduct.
     * 
     * @param dattoKernelVersionID
     */
    public void setDattoKernelVersionID(java.lang.Object dattoKernelVersionID) {
        this.dattoKernelVersionID = dattoKernelVersionID;
    }


    /**
     * Gets the dattoNICSpeedKilobitsPerSecond value for this InstalledProduct.
     * 
     * @return dattoNICSpeedKilobitsPerSecond
     */
    public java.lang.Object getDattoNICSpeedKilobitsPerSecond() {
        return dattoNICSpeedKilobitsPerSecond;
    }


    /**
     * Sets the dattoNICSpeedKilobitsPerSecond value for this InstalledProduct.
     * 
     * @param dattoNICSpeedKilobitsPerSecond
     */
    public void setDattoNICSpeedKilobitsPerSecond(java.lang.Object dattoNICSpeedKilobitsPerSecond) {
        this.dattoNICSpeedKilobitsPerSecond = dattoNICSpeedKilobitsPerSecond;
    }


    /**
     * Gets the dattoDeviceMemoryMegabytes value for this InstalledProduct.
     * 
     * @return dattoDeviceMemoryMegabytes
     */
    public java.lang.Object getDattoDeviceMemoryMegabytes() {
        return dattoDeviceMemoryMegabytes;
    }


    /**
     * Sets the dattoDeviceMemoryMegabytes value for this InstalledProduct.
     * 
     * @param dattoDeviceMemoryMegabytes
     */
    public void setDattoDeviceMemoryMegabytes(java.lang.Object dattoDeviceMemoryMegabytes) {
        this.dattoDeviceMemoryMegabytes = dattoDeviceMemoryMegabytes;
    }


    /**
     * Gets the dattoUptimeSeconds value for this InstalledProduct.
     * 
     * @return dattoUptimeSeconds
     */
    public java.lang.Object getDattoUptimeSeconds() {
        return dattoUptimeSeconds;
    }


    /**
     * Sets the dattoUptimeSeconds value for this InstalledProduct.
     * 
     * @param dattoUptimeSeconds
     */
    public void setDattoUptimeSeconds(java.lang.Object dattoUptimeSeconds) {
        this.dattoUptimeSeconds = dattoUptimeSeconds;
    }


    /**
     * Gets the dattoNumberOfAgents value for this InstalledProduct.
     * 
     * @return dattoNumberOfAgents
     */
    public java.lang.Object getDattoNumberOfAgents() {
        return dattoNumberOfAgents;
    }


    /**
     * Sets the dattoNumberOfAgents value for this InstalledProduct.
     * 
     * @param dattoNumberOfAgents
     */
    public void setDattoNumberOfAgents(java.lang.Object dattoNumberOfAgents) {
        this.dattoNumberOfAgents = dattoNumberOfAgents;
    }


    /**
     * Gets the dattoNumberOfDrives value for this InstalledProduct.
     * 
     * @return dattoNumberOfDrives
     */
    public java.lang.Object getDattoNumberOfDrives() {
        return dattoNumberOfDrives;
    }


    /**
     * Sets the dattoNumberOfDrives value for this InstalledProduct.
     * 
     * @param dattoNumberOfDrives
     */
    public void setDattoNumberOfDrives(java.lang.Object dattoNumberOfDrives) {
        this.dattoNumberOfDrives = dattoNumberOfDrives;
    }


    /**
     * Gets the dattoDrivesErrors value for this InstalledProduct.
     * 
     * @return dattoDrivesErrors
     */
    public java.lang.Object getDattoDrivesErrors() {
        return dattoDrivesErrors;
    }


    /**
     * Sets the dattoDrivesErrors value for this InstalledProduct.
     * 
     * @param dattoDrivesErrors
     */
    public void setDattoDrivesErrors(java.lang.Object dattoDrivesErrors) {
        this.dattoDrivesErrors = dattoDrivesErrors;
    }


    /**
     * Gets the dattoNumberOfVolumes value for this InstalledProduct.
     * 
     * @return dattoNumberOfVolumes
     */
    public java.lang.Object getDattoNumberOfVolumes() {
        return dattoNumberOfVolumes;
    }


    /**
     * Sets the dattoNumberOfVolumes value for this InstalledProduct.
     * 
     * @param dattoNumberOfVolumes
     */
    public void setDattoNumberOfVolumes(java.lang.Object dattoNumberOfVolumes) {
        this.dattoNumberOfVolumes = dattoNumberOfVolumes;
    }


    /**
     * Gets the dattoLastCheckInDateTime value for this InstalledProduct.
     * 
     * @return dattoLastCheckInDateTime
     */
    public java.lang.Object getDattoLastCheckInDateTime() {
        return dattoLastCheckInDateTime;
    }


    /**
     * Sets the dattoLastCheckInDateTime value for this InstalledProduct.
     * 
     * @param dattoLastCheckInDateTime
     */
    public void setDattoLastCheckInDateTime(java.lang.Object dattoLastCheckInDateTime) {
        this.dattoLastCheckInDateTime = dattoLastCheckInDateTime;
    }


    /**
     * Gets the RMMDeviceAuditAntivirusStatusID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditAntivirusStatusID
     */
    public java.lang.Object getRMMDeviceAuditAntivirusStatusID() {
        return RMMDeviceAuditAntivirusStatusID;
    }


    /**
     * Sets the RMMDeviceAuditAntivirusStatusID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditAntivirusStatusID
     */
    public void setRMMDeviceAuditAntivirusStatusID(java.lang.Object RMMDeviceAuditAntivirusStatusID) {
        this.RMMDeviceAuditAntivirusStatusID = RMMDeviceAuditAntivirusStatusID;
    }


    /**
     * Gets the RMMDeviceAuditBackupStatusID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditBackupStatusID
     */
    public java.lang.Object getRMMDeviceAuditBackupStatusID() {
        return RMMDeviceAuditBackupStatusID;
    }


    /**
     * Sets the RMMDeviceAuditBackupStatusID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditBackupStatusID
     */
    public void setRMMDeviceAuditBackupStatusID(java.lang.Object RMMDeviceAuditBackupStatusID) {
        this.RMMDeviceAuditBackupStatusID = RMMDeviceAuditBackupStatusID;
    }


    /**
     * Gets the RMMDeviceAuditPatchStatusID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditPatchStatusID
     */
    public java.lang.Object getRMMDeviceAuditPatchStatusID() {
        return RMMDeviceAuditPatchStatusID;
    }


    /**
     * Sets the RMMDeviceAuditPatchStatusID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditPatchStatusID
     */
    public void setRMMDeviceAuditPatchStatusID(java.lang.Object RMMDeviceAuditPatchStatusID) {
        this.RMMDeviceAuditPatchStatusID = RMMDeviceAuditPatchStatusID;
    }


    /**
     * Gets the RMMDeviceAuditSoftwareStatusID value for this InstalledProduct.
     * 
     * @return RMMDeviceAuditSoftwareStatusID
     */
    public java.lang.Object getRMMDeviceAuditSoftwareStatusID() {
        return RMMDeviceAuditSoftwareStatusID;
    }


    /**
     * Sets the RMMDeviceAuditSoftwareStatusID value for this InstalledProduct.
     * 
     * @param RMMDeviceAuditSoftwareStatusID
     */
    public void setRMMDeviceAuditSoftwareStatusID(java.lang.Object RMMDeviceAuditSoftwareStatusID) {
        this.RMMDeviceAuditSoftwareStatusID = RMMDeviceAuditSoftwareStatusID;
    }


    /**
     * Gets the lastActivityPersonID value for this InstalledProduct.
     * 
     * @return lastActivityPersonID
     */
    public java.lang.Object getLastActivityPersonID() {
        return lastActivityPersonID;
    }


    /**
     * Sets the lastActivityPersonID value for this InstalledProduct.
     * 
     * @param lastActivityPersonID
     */
    public void setLastActivityPersonID(java.lang.Object lastActivityPersonID) {
        this.lastActivityPersonID = lastActivityPersonID;
    }


    /**
     * Gets the lastActivityPersonType value for this InstalledProduct.
     * 
     * @return lastActivityPersonType
     */
    public java.lang.Object getLastActivityPersonType() {
        return lastActivityPersonType;
    }


    /**
     * Sets the lastActivityPersonType value for this InstalledProduct.
     * 
     * @param lastActivityPersonType
     */
    public void setLastActivityPersonType(java.lang.Object lastActivityPersonType) {
        this.lastActivityPersonType = lastActivityPersonType;
    }


    /**
     * Gets the createdByPersonID value for this InstalledProduct.
     * 
     * @return createdByPersonID
     */
    public java.lang.Object getCreatedByPersonID() {
        return createdByPersonID;
    }


    /**
     * Sets the createdByPersonID value for this InstalledProduct.
     * 
     * @param createdByPersonID
     */
    public void setCreatedByPersonID(java.lang.Object createdByPersonID) {
        this.createdByPersonID = createdByPersonID;
    }


    /**
     * Gets the apiVendorID value for this InstalledProduct.
     * 
     * @return apiVendorID
     */
    public java.lang.Object getApiVendorID() {
        return apiVendorID;
    }


    /**
     * Sets the apiVendorID value for this InstalledProduct.
     * 
     * @param apiVendorID
     */
    public void setApiVendorID(java.lang.Object apiVendorID) {
        this.apiVendorID = apiVendorID;
    }


    /**
     * Gets the deviceNetworkingID value for this InstalledProduct.
     * 
     * @return deviceNetworkingID
     */
    public java.lang.Object getDeviceNetworkingID() {
        return deviceNetworkingID;
    }


    /**
     * Sets the deviceNetworkingID value for this InstalledProduct.
     * 
     * @param deviceNetworkingID
     */
    public void setDeviceNetworkingID(java.lang.Object deviceNetworkingID) {
        this.deviceNetworkingID = deviceNetworkingID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstalledProduct)) return false;
        InstalledProduct other = (InstalledProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.dailyCost==null && other.getDailyCost()==null) || 
             (this.dailyCost!=null &&
              this.dailyCost.equals(other.getDailyCost()))) &&
            ((this.hourlyCost==null && other.getHourlyCost()==null) || 
             (this.hourlyCost!=null &&
              this.hourlyCost.equals(other.getHourlyCost()))) &&
            ((this.installDate==null && other.getInstallDate()==null) || 
             (this.installDate!=null &&
              this.installDate.equals(other.getInstallDate()))) &&
            ((this.monthlyCost==null && other.getMonthlyCost()==null) || 
             (this.monthlyCost!=null &&
              this.monthlyCost.equals(other.getMonthlyCost()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.numberOfUsers==null && other.getNumberOfUsers()==null) || 
             (this.numberOfUsers!=null &&
              this.numberOfUsers.equals(other.getNumberOfUsers()))) &&
            ((this.perUseCost==null && other.getPerUseCost()==null) || 
             (this.perUseCost!=null &&
              this.perUseCost.equals(other.getPerUseCost()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.referenceTitle==null && other.getReferenceTitle()==null) || 
             (this.referenceTitle!=null &&
              this.referenceTitle.equals(other.getReferenceTitle()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.setupFee==null && other.getSetupFee()==null) || 
             (this.setupFee!=null &&
              this.setupFee.equals(other.getSetupFee()))) &&
            ((this.warrantyExpirationDate==null && other.getWarrantyExpirationDate()==null) || 
             (this.warrantyExpirationDate!=null &&
              this.warrantyExpirationDate.equals(other.getWarrantyExpirationDate()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.serviceBundleID==null && other.getServiceBundleID()==null) || 
             (this.serviceBundleID!=null &&
              this.serviceBundleID.equals(other.getServiceBundleID()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.contactID==null && other.getContactID()==null) || 
             (this.contactID!=null &&
              this.contactID.equals(other.getContactID()))) &&
            ((this.vendorID==null && other.getVendorID()==null) || 
             (this.vendorID!=null &&
              this.vendorID.equals(other.getVendorID()))) &&
            ((this.installedByID==null && other.getInstalledByID()==null) || 
             (this.installedByID!=null &&
              this.installedByID.equals(other.getInstalledByID()))) &&
            ((this.installedByContactID==null && other.getInstalledByContactID()==null) || 
             (this.installedByContactID!=null &&
              this.installedByContactID.equals(other.getInstalledByContactID()))) &&
            ((this.parentInstalledProductID==null && other.getParentInstalledProductID()==null) || 
             (this.parentInstalledProductID!=null &&
              this.parentInstalledProductID.equals(other.getParentInstalledProductID()))) &&
            ((this.lastModifiedTime==null && other.getLastModifiedTime()==null) || 
             (this.lastModifiedTime!=null &&
              this.lastModifiedTime.equals(other.getLastModifiedTime()))) &&
            ((this.contractServiceID==null && other.getContractServiceID()==null) || 
             (this.contractServiceID!=null &&
              this.contractServiceID.equals(other.getContractServiceID()))) &&
            ((this.contractServiceBundleID==null && other.getContractServiceBundleID()==null) || 
             (this.contractServiceBundleID!=null &&
              this.contractServiceBundleID.equals(other.getContractServiceBundleID()))) &&
            ((this.serviceLevelAgreementID==null && other.getServiceLevelAgreementID()==null) || 
             (this.serviceLevelAgreementID!=null &&
              this.serviceLevelAgreementID.equals(other.getServiceLevelAgreementID()))) &&
            ((this.accountPhysicalLocationID==null && other.getAccountPhysicalLocationID()==null) || 
             (this.accountPhysicalLocationID!=null &&
              this.accountPhysicalLocationID.equals(other.getAccountPhysicalLocationID()))) &&
            ((this.RMMDeviceID==null && other.getRMMDeviceID()==null) || 
             (this.RMMDeviceID!=null &&
              this.RMMDeviceID.equals(other.getRMMDeviceID()))) &&
            ((this.RMMDeviceUID==null && other.getRMMDeviceUID()==null) || 
             (this.RMMDeviceUID!=null &&
              this.RMMDeviceUID.equals(other.getRMMDeviceUID()))) &&
            ((this.RMMDeviceAuditArchitectureID==null && other.getRMMDeviceAuditArchitectureID()==null) || 
             (this.RMMDeviceAuditArchitectureID!=null &&
              this.RMMDeviceAuditArchitectureID.equals(other.getRMMDeviceAuditArchitectureID()))) &&
            ((this.RMMDeviceAuditDescription==null && other.getRMMDeviceAuditDescription()==null) || 
             (this.RMMDeviceAuditDescription!=null &&
              this.RMMDeviceAuditDescription.equals(other.getRMMDeviceAuditDescription()))) &&
            ((this.RMMDeviceAuditDisplayAdaptorID==null && other.getRMMDeviceAuditDisplayAdaptorID()==null) || 
             (this.RMMDeviceAuditDisplayAdaptorID!=null &&
              this.RMMDeviceAuditDisplayAdaptorID.equals(other.getRMMDeviceAuditDisplayAdaptorID()))) &&
            ((this.RMMDeviceAuditDomainID==null && other.getRMMDeviceAuditDomainID()==null) || 
             (this.RMMDeviceAuditDomainID!=null &&
              this.RMMDeviceAuditDomainID.equals(other.getRMMDeviceAuditDomainID()))) &&
            ((this.RMMDeviceAuditExternalIPAddress==null && other.getRMMDeviceAuditExternalIPAddress()==null) || 
             (this.RMMDeviceAuditExternalIPAddress!=null &&
              this.RMMDeviceAuditExternalIPAddress.equals(other.getRMMDeviceAuditExternalIPAddress()))) &&
            ((this.RMMDeviceAuditHostname==null && other.getRMMDeviceAuditHostname()==null) || 
             (this.RMMDeviceAuditHostname!=null &&
              this.RMMDeviceAuditHostname.equals(other.getRMMDeviceAuditHostname()))) &&
            ((this.RMMDeviceAuditIPAddress==null && other.getRMMDeviceAuditIPAddress()==null) || 
             (this.RMMDeviceAuditIPAddress!=null &&
              this.RMMDeviceAuditIPAddress.equals(other.getRMMDeviceAuditIPAddress()))) &&
            ((this.RMMDeviceAuditMacAddress==null && other.getRMMDeviceAuditMacAddress()==null) || 
             (this.RMMDeviceAuditMacAddress!=null &&
              this.RMMDeviceAuditMacAddress.equals(other.getRMMDeviceAuditMacAddress()))) &&
            ((this.RMMDeviceAuditManufacturerID==null && other.getRMMDeviceAuditManufacturerID()==null) || 
             (this.RMMDeviceAuditManufacturerID!=null &&
              this.RMMDeviceAuditManufacturerID.equals(other.getRMMDeviceAuditManufacturerID()))) &&
            ((this.RMMDeviceAuditMemoryBytes==null && other.getRMMDeviceAuditMemoryBytes()==null) || 
             (this.RMMDeviceAuditMemoryBytes!=null &&
              this.RMMDeviceAuditMemoryBytes.equals(other.getRMMDeviceAuditMemoryBytes()))) &&
            ((this.RMMDeviceAuditModelID==null && other.getRMMDeviceAuditModelID()==null) || 
             (this.RMMDeviceAuditModelID!=null &&
              this.RMMDeviceAuditModelID.equals(other.getRMMDeviceAuditModelID()))) &&
            ((this.RMMDeviceAuditMotherboardID==null && other.getRMMDeviceAuditMotherboardID()==null) || 
             (this.RMMDeviceAuditMotherboardID!=null &&
              this.RMMDeviceAuditMotherboardID.equals(other.getRMMDeviceAuditMotherboardID()))) &&
            ((this.RMMDeviceAuditOperatingSystem==null && other.getRMMDeviceAuditOperatingSystem()==null) || 
             (this.RMMDeviceAuditOperatingSystem!=null &&
              this.RMMDeviceAuditOperatingSystem.equals(other.getRMMDeviceAuditOperatingSystem()))) &&
            ((this.RMMDeviceAuditProcessorID==null && other.getRMMDeviceAuditProcessorID()==null) || 
             (this.RMMDeviceAuditProcessorID!=null &&
              this.RMMDeviceAuditProcessorID.equals(other.getRMMDeviceAuditProcessorID()))) &&
            ((this.RMMDeviceAuditServicePackID==null && other.getRMMDeviceAuditServicePackID()==null) || 
             (this.RMMDeviceAuditServicePackID!=null &&
              this.RMMDeviceAuditServicePackID.equals(other.getRMMDeviceAuditServicePackID()))) &&
            ((this.RMMDeviceAuditStorageBytes==null && other.getRMMDeviceAuditStorageBytes()==null) || 
             (this.RMMDeviceAuditStorageBytes!=null &&
              this.RMMDeviceAuditStorageBytes.equals(other.getRMMDeviceAuditStorageBytes()))) &&
            ((this.RMMDeviceAuditDeviceTypeID==null && other.getRMMDeviceAuditDeviceTypeID()==null) || 
             (this.RMMDeviceAuditDeviceTypeID!=null &&
              this.RMMDeviceAuditDeviceTypeID.equals(other.getRMMDeviceAuditDeviceTypeID()))) &&
            ((this.RMMDeviceAuditSNMPLocation==null && other.getRMMDeviceAuditSNMPLocation()==null) || 
             (this.RMMDeviceAuditSNMPLocation!=null &&
              this.RMMDeviceAuditSNMPLocation.equals(other.getRMMDeviceAuditSNMPLocation()))) &&
            ((this.RMMDeviceAuditSNMPName==null && other.getRMMDeviceAuditSNMPName()==null) || 
             (this.RMMDeviceAuditSNMPName!=null &&
              this.RMMDeviceAuditSNMPName.equals(other.getRMMDeviceAuditSNMPName()))) &&
            ((this.RMMDeviceAuditSNMPContact==null && other.getRMMDeviceAuditSNMPContact()==null) || 
             (this.RMMDeviceAuditSNMPContact!=null &&
              this.RMMDeviceAuditSNMPContact.equals(other.getRMMDeviceAuditSNMPContact()))) &&
            ((this.RMMDeviceAuditMobileNetworkOperatorID==null && other.getRMMDeviceAuditMobileNetworkOperatorID()==null) || 
             (this.RMMDeviceAuditMobileNetworkOperatorID!=null &&
              this.RMMDeviceAuditMobileNetworkOperatorID.equals(other.getRMMDeviceAuditMobileNetworkOperatorID()))) &&
            ((this.RMMDeviceAuditMobileNumber==null && other.getRMMDeviceAuditMobileNumber()==null) || 
             (this.RMMDeviceAuditMobileNumber!=null &&
              this.RMMDeviceAuditMobileNumber.equals(other.getRMMDeviceAuditMobileNumber()))) &&
            ((this.RMMDeviceAuditMissingPatchCount==null && other.getRMMDeviceAuditMissingPatchCount()==null) || 
             (this.RMMDeviceAuditMissingPatchCount!=null &&
              this.RMMDeviceAuditMissingPatchCount.equals(other.getRMMDeviceAuditMissingPatchCount()))) &&
            ((this.RMMOpenAlertCount==null && other.getRMMOpenAlertCount()==null) || 
             (this.RMMOpenAlertCount!=null &&
              this.RMMOpenAlertCount.equals(other.getRMMOpenAlertCount()))) &&
            ((this.RMMDeviceAuditLastUser==null && other.getRMMDeviceAuditLastUser()==null) || 
             (this.RMMDeviceAuditLastUser!=null &&
              this.RMMDeviceAuditLastUser.equals(other.getRMMDeviceAuditLastUser()))) &&
            ((this.dattoSerialNumber==null && other.getDattoSerialNumber()==null) || 
             (this.dattoSerialNumber!=null &&
              this.dattoSerialNumber.equals(other.getDattoSerialNumber()))) &&
            ((this.dattoInternalIP==null && other.getDattoInternalIP()==null) || 
             (this.dattoInternalIP!=null &&
              this.dattoInternalIP.equals(other.getDattoInternalIP()))) &&
            ((this.dattoRemoteIP==null && other.getDattoRemoteIP()==null) || 
             (this.dattoRemoteIP!=null &&
              this.dattoRemoteIP.equals(other.getDattoRemoteIP()))) &&
            ((this.dattoHostname==null && other.getDattoHostname()==null) || 
             (this.dattoHostname!=null &&
              this.dattoHostname.equals(other.getDattoHostname()))) &&
            ((this.dattoProtectedKilobytes==null && other.getDattoProtectedKilobytes()==null) || 
             (this.dattoProtectedKilobytes!=null &&
              this.dattoProtectedKilobytes.equals(other.getDattoProtectedKilobytes()))) &&
            ((this.dattoUsedKilobytes==null && other.getDattoUsedKilobytes()==null) || 
             (this.dattoUsedKilobytes!=null &&
              this.dattoUsedKilobytes.equals(other.getDattoUsedKilobytes()))) &&
            ((this.dattoAvailableKilobytes==null && other.getDattoAvailableKilobytes()==null) || 
             (this.dattoAvailableKilobytes!=null &&
              this.dattoAvailableKilobytes.equals(other.getDattoAvailableKilobytes()))) &&
            ((this.dattoPercentageUsed==null && other.getDattoPercentageUsed()==null) || 
             (this.dattoPercentageUsed!=null &&
              this.dattoPercentageUsed.equals(other.getDattoPercentageUsed()))) &&
            ((this.dattoOffsiteUsedBytes==null && other.getDattoOffsiteUsedBytes()==null) || 
             (this.dattoOffsiteUsedBytes!=null &&
              this.dattoOffsiteUsedBytes.equals(other.getDattoOffsiteUsedBytes()))) &&
            ((this.dattoOSVersionID==null && other.getDattoOSVersionID()==null) || 
             (this.dattoOSVersionID!=null &&
              this.dattoOSVersionID.equals(other.getDattoOSVersionID()))) &&
            ((this.dattoZFSVersionID==null && other.getDattoZFSVersionID()==null) || 
             (this.dattoZFSVersionID!=null &&
              this.dattoZFSVersionID.equals(other.getDattoZFSVersionID()))) &&
            ((this.dattoKernelVersionID==null && other.getDattoKernelVersionID()==null) || 
             (this.dattoKernelVersionID!=null &&
              this.dattoKernelVersionID.equals(other.getDattoKernelVersionID()))) &&
            ((this.dattoNICSpeedKilobitsPerSecond==null && other.getDattoNICSpeedKilobitsPerSecond()==null) || 
             (this.dattoNICSpeedKilobitsPerSecond!=null &&
              this.dattoNICSpeedKilobitsPerSecond.equals(other.getDattoNICSpeedKilobitsPerSecond()))) &&
            ((this.dattoDeviceMemoryMegabytes==null && other.getDattoDeviceMemoryMegabytes()==null) || 
             (this.dattoDeviceMemoryMegabytes!=null &&
              this.dattoDeviceMemoryMegabytes.equals(other.getDattoDeviceMemoryMegabytes()))) &&
            ((this.dattoUptimeSeconds==null && other.getDattoUptimeSeconds()==null) || 
             (this.dattoUptimeSeconds!=null &&
              this.dattoUptimeSeconds.equals(other.getDattoUptimeSeconds()))) &&
            ((this.dattoNumberOfAgents==null && other.getDattoNumberOfAgents()==null) || 
             (this.dattoNumberOfAgents!=null &&
              this.dattoNumberOfAgents.equals(other.getDattoNumberOfAgents()))) &&
            ((this.dattoNumberOfDrives==null && other.getDattoNumberOfDrives()==null) || 
             (this.dattoNumberOfDrives!=null &&
              this.dattoNumberOfDrives.equals(other.getDattoNumberOfDrives()))) &&
            ((this.dattoDrivesErrors==null && other.getDattoDrivesErrors()==null) || 
             (this.dattoDrivesErrors!=null &&
              this.dattoDrivesErrors.equals(other.getDattoDrivesErrors()))) &&
            ((this.dattoNumberOfVolumes==null && other.getDattoNumberOfVolumes()==null) || 
             (this.dattoNumberOfVolumes!=null &&
              this.dattoNumberOfVolumes.equals(other.getDattoNumberOfVolumes()))) &&
            ((this.dattoLastCheckInDateTime==null && other.getDattoLastCheckInDateTime()==null) || 
             (this.dattoLastCheckInDateTime!=null &&
              this.dattoLastCheckInDateTime.equals(other.getDattoLastCheckInDateTime()))) &&
            ((this.RMMDeviceAuditAntivirusStatusID==null && other.getRMMDeviceAuditAntivirusStatusID()==null) || 
             (this.RMMDeviceAuditAntivirusStatusID!=null &&
              this.RMMDeviceAuditAntivirusStatusID.equals(other.getRMMDeviceAuditAntivirusStatusID()))) &&
            ((this.RMMDeviceAuditBackupStatusID==null && other.getRMMDeviceAuditBackupStatusID()==null) || 
             (this.RMMDeviceAuditBackupStatusID!=null &&
              this.RMMDeviceAuditBackupStatusID.equals(other.getRMMDeviceAuditBackupStatusID()))) &&
            ((this.RMMDeviceAuditPatchStatusID==null && other.getRMMDeviceAuditPatchStatusID()==null) || 
             (this.RMMDeviceAuditPatchStatusID!=null &&
              this.RMMDeviceAuditPatchStatusID.equals(other.getRMMDeviceAuditPatchStatusID()))) &&
            ((this.RMMDeviceAuditSoftwareStatusID==null && other.getRMMDeviceAuditSoftwareStatusID()==null) || 
             (this.RMMDeviceAuditSoftwareStatusID!=null &&
              this.RMMDeviceAuditSoftwareStatusID.equals(other.getRMMDeviceAuditSoftwareStatusID()))) &&
            ((this.lastActivityPersonID==null && other.getLastActivityPersonID()==null) || 
             (this.lastActivityPersonID!=null &&
              this.lastActivityPersonID.equals(other.getLastActivityPersonID()))) &&
            ((this.lastActivityPersonType==null && other.getLastActivityPersonType()==null) || 
             (this.lastActivityPersonType!=null &&
              this.lastActivityPersonType.equals(other.getLastActivityPersonType()))) &&
            ((this.createdByPersonID==null && other.getCreatedByPersonID()==null) || 
             (this.createdByPersonID!=null &&
              this.createdByPersonID.equals(other.getCreatedByPersonID()))) &&
            ((this.apiVendorID==null && other.getApiVendorID()==null) || 
             (this.apiVendorID!=null &&
              this.apiVendorID.equals(other.getApiVendorID()))) &&
            ((this.deviceNetworkingID==null && other.getDeviceNetworkingID()==null) || 
             (this.deviceNetworkingID!=null &&
              this.deviceNetworkingID.equals(other.getDeviceNetworkingID())));
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
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getDailyCost() != null) {
            _hashCode += getDailyCost().hashCode();
        }
        if (getHourlyCost() != null) {
            _hashCode += getHourlyCost().hashCode();
        }
        if (getInstallDate() != null) {
            _hashCode += getInstallDate().hashCode();
        }
        if (getMonthlyCost() != null) {
            _hashCode += getMonthlyCost().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNumberOfUsers() != null) {
            _hashCode += getNumberOfUsers().hashCode();
        }
        if (getPerUseCost() != null) {
            _hashCode += getPerUseCost().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getReferenceTitle() != null) {
            _hashCode += getReferenceTitle().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getSetupFee() != null) {
            _hashCode += getSetupFee().hashCode();
        }
        if (getWarrantyExpirationDate() != null) {
            _hashCode += getWarrantyExpirationDate().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getServiceBundleID() != null) {
            _hashCode += getServiceBundleID().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getContactID() != null) {
            _hashCode += getContactID().hashCode();
        }
        if (getVendorID() != null) {
            _hashCode += getVendorID().hashCode();
        }
        if (getInstalledByID() != null) {
            _hashCode += getInstalledByID().hashCode();
        }
        if (getInstalledByContactID() != null) {
            _hashCode += getInstalledByContactID().hashCode();
        }
        if (getParentInstalledProductID() != null) {
            _hashCode += getParentInstalledProductID().hashCode();
        }
        if (getLastModifiedTime() != null) {
            _hashCode += getLastModifiedTime().hashCode();
        }
        if (getContractServiceID() != null) {
            _hashCode += getContractServiceID().hashCode();
        }
        if (getContractServiceBundleID() != null) {
            _hashCode += getContractServiceBundleID().hashCode();
        }
        if (getServiceLevelAgreementID() != null) {
            _hashCode += getServiceLevelAgreementID().hashCode();
        }
        if (getAccountPhysicalLocationID() != null) {
            _hashCode += getAccountPhysicalLocationID().hashCode();
        }
        if (getRMMDeviceID() != null) {
            _hashCode += getRMMDeviceID().hashCode();
        }
        if (getRMMDeviceUID() != null) {
            _hashCode += getRMMDeviceUID().hashCode();
        }
        if (getRMMDeviceAuditArchitectureID() != null) {
            _hashCode += getRMMDeviceAuditArchitectureID().hashCode();
        }
        if (getRMMDeviceAuditDescription() != null) {
            _hashCode += getRMMDeviceAuditDescription().hashCode();
        }
        if (getRMMDeviceAuditDisplayAdaptorID() != null) {
            _hashCode += getRMMDeviceAuditDisplayAdaptorID().hashCode();
        }
        if (getRMMDeviceAuditDomainID() != null) {
            _hashCode += getRMMDeviceAuditDomainID().hashCode();
        }
        if (getRMMDeviceAuditExternalIPAddress() != null) {
            _hashCode += getRMMDeviceAuditExternalIPAddress().hashCode();
        }
        if (getRMMDeviceAuditHostname() != null) {
            _hashCode += getRMMDeviceAuditHostname().hashCode();
        }
        if (getRMMDeviceAuditIPAddress() != null) {
            _hashCode += getRMMDeviceAuditIPAddress().hashCode();
        }
        if (getRMMDeviceAuditMacAddress() != null) {
            _hashCode += getRMMDeviceAuditMacAddress().hashCode();
        }
        if (getRMMDeviceAuditManufacturerID() != null) {
            _hashCode += getRMMDeviceAuditManufacturerID().hashCode();
        }
        if (getRMMDeviceAuditMemoryBytes() != null) {
            _hashCode += getRMMDeviceAuditMemoryBytes().hashCode();
        }
        if (getRMMDeviceAuditModelID() != null) {
            _hashCode += getRMMDeviceAuditModelID().hashCode();
        }
        if (getRMMDeviceAuditMotherboardID() != null) {
            _hashCode += getRMMDeviceAuditMotherboardID().hashCode();
        }
        if (getRMMDeviceAuditOperatingSystem() != null) {
            _hashCode += getRMMDeviceAuditOperatingSystem().hashCode();
        }
        if (getRMMDeviceAuditProcessorID() != null) {
            _hashCode += getRMMDeviceAuditProcessorID().hashCode();
        }
        if (getRMMDeviceAuditServicePackID() != null) {
            _hashCode += getRMMDeviceAuditServicePackID().hashCode();
        }
        if (getRMMDeviceAuditStorageBytes() != null) {
            _hashCode += getRMMDeviceAuditStorageBytes().hashCode();
        }
        if (getRMMDeviceAuditDeviceTypeID() != null) {
            _hashCode += getRMMDeviceAuditDeviceTypeID().hashCode();
        }
        if (getRMMDeviceAuditSNMPLocation() != null) {
            _hashCode += getRMMDeviceAuditSNMPLocation().hashCode();
        }
        if (getRMMDeviceAuditSNMPName() != null) {
            _hashCode += getRMMDeviceAuditSNMPName().hashCode();
        }
        if (getRMMDeviceAuditSNMPContact() != null) {
            _hashCode += getRMMDeviceAuditSNMPContact().hashCode();
        }
        if (getRMMDeviceAuditMobileNetworkOperatorID() != null) {
            _hashCode += getRMMDeviceAuditMobileNetworkOperatorID().hashCode();
        }
        if (getRMMDeviceAuditMobileNumber() != null) {
            _hashCode += getRMMDeviceAuditMobileNumber().hashCode();
        }
        if (getRMMDeviceAuditMissingPatchCount() != null) {
            _hashCode += getRMMDeviceAuditMissingPatchCount().hashCode();
        }
        if (getRMMOpenAlertCount() != null) {
            _hashCode += getRMMOpenAlertCount().hashCode();
        }
        if (getRMMDeviceAuditLastUser() != null) {
            _hashCode += getRMMDeviceAuditLastUser().hashCode();
        }
        if (getDattoSerialNumber() != null) {
            _hashCode += getDattoSerialNumber().hashCode();
        }
        if (getDattoInternalIP() != null) {
            _hashCode += getDattoInternalIP().hashCode();
        }
        if (getDattoRemoteIP() != null) {
            _hashCode += getDattoRemoteIP().hashCode();
        }
        if (getDattoHostname() != null) {
            _hashCode += getDattoHostname().hashCode();
        }
        if (getDattoProtectedKilobytes() != null) {
            _hashCode += getDattoProtectedKilobytes().hashCode();
        }
        if (getDattoUsedKilobytes() != null) {
            _hashCode += getDattoUsedKilobytes().hashCode();
        }
        if (getDattoAvailableKilobytes() != null) {
            _hashCode += getDattoAvailableKilobytes().hashCode();
        }
        if (getDattoPercentageUsed() != null) {
            _hashCode += getDattoPercentageUsed().hashCode();
        }
        if (getDattoOffsiteUsedBytes() != null) {
            _hashCode += getDattoOffsiteUsedBytes().hashCode();
        }
        if (getDattoOSVersionID() != null) {
            _hashCode += getDattoOSVersionID().hashCode();
        }
        if (getDattoZFSVersionID() != null) {
            _hashCode += getDattoZFSVersionID().hashCode();
        }
        if (getDattoKernelVersionID() != null) {
            _hashCode += getDattoKernelVersionID().hashCode();
        }
        if (getDattoNICSpeedKilobitsPerSecond() != null) {
            _hashCode += getDattoNICSpeedKilobitsPerSecond().hashCode();
        }
        if (getDattoDeviceMemoryMegabytes() != null) {
            _hashCode += getDattoDeviceMemoryMegabytes().hashCode();
        }
        if (getDattoUptimeSeconds() != null) {
            _hashCode += getDattoUptimeSeconds().hashCode();
        }
        if (getDattoNumberOfAgents() != null) {
            _hashCode += getDattoNumberOfAgents().hashCode();
        }
        if (getDattoNumberOfDrives() != null) {
            _hashCode += getDattoNumberOfDrives().hashCode();
        }
        if (getDattoDrivesErrors() != null) {
            _hashCode += getDattoDrivesErrors().hashCode();
        }
        if (getDattoNumberOfVolumes() != null) {
            _hashCode += getDattoNumberOfVolumes().hashCode();
        }
        if (getDattoLastCheckInDateTime() != null) {
            _hashCode += getDattoLastCheckInDateTime().hashCode();
        }
        if (getRMMDeviceAuditAntivirusStatusID() != null) {
            _hashCode += getRMMDeviceAuditAntivirusStatusID().hashCode();
        }
        if (getRMMDeviceAuditBackupStatusID() != null) {
            _hashCode += getRMMDeviceAuditBackupStatusID().hashCode();
        }
        if (getRMMDeviceAuditPatchStatusID() != null) {
            _hashCode += getRMMDeviceAuditPatchStatusID().hashCode();
        }
        if (getRMMDeviceAuditSoftwareStatusID() != null) {
            _hashCode += getRMMDeviceAuditSoftwareStatusID().hashCode();
        }
        if (getLastActivityPersonID() != null) {
            _hashCode += getLastActivityPersonID().hashCode();
        }
        if (getLastActivityPersonType() != null) {
            _hashCode += getLastActivityPersonType().hashCode();
        }
        if (getCreatedByPersonID() != null) {
            _hashCode += getCreatedByPersonID().hashCode();
        }
        if (getApiVendorID() != null) {
            _hashCode += getApiVendorID().hashCode();
        }
        if (getDeviceNetworkingID() != null) {
            _hashCode += getDeviceNetworkingID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstalledProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InstalledProduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreateDate"));
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
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DailyCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourlyCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "HourlyCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InstallDate"));
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
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "NumberOfUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perUseCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "PerUseCost"));
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
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ReferenceTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "SetupFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warrantyExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "WarrantyExpirationDate"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "Location"));
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
        elemField.setFieldName("vendorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "VendorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installedByID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InstalledByID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installedByContactID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "InstalledByContactID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentInstalledProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ParentInstalledProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastModifiedTime"));
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
        elemField.setFieldName("serviceLevelAgreementID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ServiceLevelAgreementID"));
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
        elemField.setFieldName("RMMDeviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditArchitectureID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditArchitectureID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditDisplayAdaptorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditDisplayAdaptorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditDomainID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditDomainID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditExternalIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditExternalIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditHostname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditHostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditMacAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditMacAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditManufacturerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditManufacturerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditMemoryBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditMemoryBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditModelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditModelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditMotherboardID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditMotherboardID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditOperatingSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditOperatingSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditProcessorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditProcessorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditServicePackID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditServicePackID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditStorageBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditStorageBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditDeviceTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditDeviceTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditSNMPLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditSNMPLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditSNMPName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditSNMPName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditSNMPContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditSNMPContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditMobileNetworkOperatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditMobileNetworkOperatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditMobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditMobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditMissingPatchCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditMissingPatchCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMOpenAlertCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMOpenAlertCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditLastUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditLastUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoInternalIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoInternalIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoRemoteIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoRemoteIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoHostname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoHostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoProtectedKilobytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoProtectedKilobytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoUsedKilobytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoUsedKilobytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoAvailableKilobytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoAvailableKilobytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoPercentageUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoPercentageUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoOffsiteUsedBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoOffsiteUsedBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoOSVersionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoOSVersionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoZFSVersionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoZFSVersionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoKernelVersionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoKernelVersionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoNICSpeedKilobitsPerSecond");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoNICSpeedKilobitsPerSecond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoDeviceMemoryMegabytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoDeviceMemoryMegabytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoUptimeSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoUptimeSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoNumberOfAgents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoNumberOfAgents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoNumberOfDrives");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoNumberOfDrives"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoDrivesErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoDrivesErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoNumberOfVolumes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoNumberOfVolumes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dattoLastCheckInDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DattoLastCheckInDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditAntivirusStatusID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditAntivirusStatusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditBackupStatusID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditBackupStatusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditPatchStatusID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditPatchStatusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMMDeviceAuditSoftwareStatusID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "RMMDeviceAuditSoftwareStatusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivityPersonID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "LastActivityPersonID"));
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
        elemField.setFieldName("createdByPersonID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "CreatedByPersonID"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceNetworkingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "DeviceNetworkingID"));
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
