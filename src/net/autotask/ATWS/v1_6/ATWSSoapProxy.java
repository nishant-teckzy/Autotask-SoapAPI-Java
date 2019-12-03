package net.autotask.ATWS.v1_6;

public class ATWSSoapProxy implements net.autotask.ATWS.v1_6.ATWSSoap {
  private String _endpoint = null;
  private net.autotask.ATWS.v1_6.ATWSSoap aTWSSoap = null;
  
  public ATWSSoapProxy() {
    _initATWSSoapProxy();
  }
  
  public ATWSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initATWSSoapProxy();
  }
  
  private void _initATWSSoapProxy() {
    try {
      aTWSSoap = (new net.autotask.ATWS.v1_6.ATWSLocator()).getATWSSoap();
      if (aTWSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aTWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aTWSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aTWSSoap != null)
      ((javax.xml.rpc.Stub)aTWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.autotask.ATWS.v1_6.ATWSSoap getATWSSoap() {
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap;
  }
  
  public net.autotask.ATWS.v1_6.Attachment getAttachment(long attachmentId) throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.getAttachment(attachmentId);
  }
  
  public long createAttachment(net.autotask.ATWS.v1_6.Attachment attachment) throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.createAttachment(attachment);
  }
  
  public java.lang.String deleteAttachment(long attachmentId) throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.deleteAttachment(attachmentId);
  }
  
  public net.autotask.ATWS.v1_6.EntityInfo[] getEntityInfo() throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.getEntityInfo();
  }
  
  public net.autotask.ATWS.v1_6.Field[] getFieldInfo(java.lang.String psObjectType) throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.getFieldInfo(psObjectType);
  }
  
  public net.autotask.ATWS.v1_6.Field[] getUDFInfo(java.lang.String psTable) throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.getUDFInfo(psTable);
  }
  
  public net.autotask.ATWS.v1_6.ATWSResponse query(java.lang.String sXML) throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.query(sXML);
  }
  
  public net.autotask.ATWS.v1_6.ATWSResponse create(net.autotask.ATWS.v1_6.Entity[] entities) throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.create(entities);
  }
  
  public net.autotask.ATWS.v1_6.ATWSResponse update(net.autotask.ATWS.v1_6.Entity[] entities) throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.update(entities);
  }
  
  public net.autotask.ATWS.v1_6.ATWSResponse delete(net.autotask.ATWS.v1_6.Entity[] entities) throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.delete(entities);
  }
  
  public net.autotask.ATWS.v1_6.ATWSZoneInfo getZoneInfo(java.lang.String userName) throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.getZoneInfo(userName);
  }
  
  public net.autotask.ATWS.v1_6.ATWSResponse getThresholdAndUsageInfo() throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.getThresholdAndUsageInfo();
  }
  
  public java.lang.String getWsdlVersion() throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.getWsdlVersion();
  }
  
  public java.lang.String getInvoiceMarkup(int invoiceId, java.lang.String format) throws java.rmi.RemoteException{
    if (aTWSSoap == null)
      _initATWSSoapProxy();
    return aTWSSoap.getInvoiceMarkup(invoiceId, format);
  }
  
  
}