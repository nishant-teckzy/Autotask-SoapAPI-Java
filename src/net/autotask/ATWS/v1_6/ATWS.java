/**
 * ATWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.autotask.ATWS.v1_6;

public interface ATWS extends javax.xml.rpc.Service {

/**
 * Autotask Web Services Version 1.6
 */
    public java.lang.String getATWSSoapAddress();

    public net.autotask.ATWS.v1_6.ATWSSoap getATWSSoap() throws javax.xml.rpc.ServiceException;

    public net.autotask.ATWS.v1_6.ATWSSoap getATWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
