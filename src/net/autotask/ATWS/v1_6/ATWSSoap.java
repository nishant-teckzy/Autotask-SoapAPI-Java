/**
 * ATWSSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public interface ATWSSoap extends java.rmi.Remote {

    /**
     * Get Attachment function, returns file attachment info for version
     * 1.6
     */
    public net.autotask.ATWS.v1_6.Attachment getAttachment(long attachmentId) throws java.rmi.RemoteException;

    /**
     * Create Attachment function for version 1.6
     */
    public long createAttachment(net.autotask.ATWS.v1_6.Attachment attachment) throws java.rmi.RemoteException;

    /**
     * Delete Attachment function for version 1.6
     */
    public java.lang.String deleteAttachment(long attachmentId) throws java.rmi.RemoteException;

    /**
     * Default EntityInfo function, returns entity info for version
     * 1.6
     */
    public net.autotask.ATWS.v1_6.EntityInfo[] getEntityInfo() throws java.rmi.RemoteException;

    /**
     * Default GetFieldInfo function, returns information for version
     * 1.6
     */
    public net.autotask.ATWS.v1_6.Field[] getFieldInfo(java.lang.String psObjectType) throws java.rmi.RemoteException;

    /**
     * Default GetUDFInfo function, returns information for version
     * 1.6
     */
    public net.autotask.ATWS.v1_6.Field[] getUDFInfo(java.lang.String psTable) throws java.rmi.RemoteException;

    /**
     * query function to extract data, sXML is in QueryXML format.
     */
    public net.autotask.ATWS.v1_6.ATWSResponse query(java.lang.String sXML) throws java.rmi.RemoteException;

    /**
     * create function will insert any new entities into the Autotask
     * system.
     */
    public net.autotask.ATWS.v1_6.ATWSResponse create(net.autotask.ATWS.v1_6.Entity[] entities) throws java.rmi.RemoteException;

    /**
     * update function will update all entities with the new values
     * passed to it.
     */
    public net.autotask.ATWS.v1_6.ATWSResponse update(net.autotask.ATWS.v1_6.Entity[] entities) throws java.rmi.RemoteException;

    /**
     * delete function will delete all the entities passed to it.
     */
    public net.autotask.ATWS.v1_6.ATWSResponse delete(net.autotask.ATWS.v1_6.Entity[] entities) throws java.rmi.RemoteException;

    /**
     * Gets information about what zone/URL the client should use.
     */
    public net.autotask.ATWS.v1_6.ATWSZoneInfo getZoneInfo(java.lang.String userName) throws java.rmi.RemoteException;

    /**
     * getThresholdAndUsageInfo function to get the threshold, timeframe
     * and current number of external request.
     */
    public net.autotask.ATWS.v1_6.ATWSResponse getThresholdAndUsageInfo() throws java.rmi.RemoteException;

    /**
     * GetWsdlVersion function to get the current wsdl version for
     * the zone.
     */
    public java.lang.String getWsdlVersion() throws java.rmi.RemoteException;

    /**
     * Returns the requested markup format for a given invoice.
     */
    public java.lang.String getInvoiceMarkup(int invoiceId, java.lang.String format) throws java.rmi.RemoteException;
}
