/**
 * ATWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public class ATWSLocator extends org.apache.axis.client.Service implements net.autotask.ATWS.v1_6.ATWS {

/**
 * Autotask Web Services Version 1.6
 */

    public ATWSLocator() {
    }


    public ATWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ATWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ATWSSoap
    private java.lang.String ATWSSoap_address = "https://webservices2.autotask.net/ATServices/1.6/atws.asmx";

    public java.lang.String getATWSSoapAddress() {
        return ATWSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ATWSSoapWSDDServiceName = "ATWSSoap";

    public java.lang.String getATWSSoapWSDDServiceName() {
        return ATWSSoapWSDDServiceName;
    }

    public void setATWSSoapWSDDServiceName(java.lang.String name) {
        ATWSSoapWSDDServiceName = name;
    }

    public net.autotask.ATWS.v1_6.ATWSSoap getATWSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ATWSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getATWSSoap(endpoint);
    }

    public net.autotask.ATWS.v1_6.ATWSSoap getATWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.autotask.ATWS.v1_6.ATWSSoapStub _stub = new net.autotask.ATWS.v1_6.ATWSSoapStub(portAddress, this);
            _stub.setPortName(getATWSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setATWSSoapEndpointAddress(java.lang.String address) {
        ATWSSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.autotask.ATWS.v1_6.ATWSSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                net.autotask.ATWS.v1_6.ATWSSoapStub _stub = new net.autotask.ATWS.v1_6.ATWSSoapStub(new java.net.URL(ATWSSoap_address), this);
                _stub.setPortName(getATWSSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ATWSSoap".equals(inputPortName)) {
            return getATWSSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ATWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://autotask.net/ATWS/v1_6/", "ATWSSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ATWSSoap".equals(portName)) {
            setATWSSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
