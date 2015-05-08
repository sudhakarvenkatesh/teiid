
package com.sforce.soap.partner;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.12
 * Thu Sep 01 08:54:15 CDT 2011
 * Generated source version: 2.2.12
 * 
 */

@WebFault(name = "InvalidSObjectFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class InvalidSObjectFault extends Exception {
    public static final long serialVersionUID = 20110901085415L;
    
    private com.sforce.soap.partner.fault.InvalidSObjectFault invalidSObjectFault;

    public InvalidSObjectFault() {
        super();
    }
    
    public InvalidSObjectFault(String message) {
        super(message);
    }
    
    public InvalidSObjectFault(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSObjectFault(String message, com.sforce.soap.partner.fault.InvalidSObjectFault invalidSObjectFault) {
        super(message);
        this.invalidSObjectFault = invalidSObjectFault;
    }

    public InvalidSObjectFault(String message, com.sforce.soap.partner.fault.InvalidSObjectFault invalidSObjectFault, Throwable cause) {
        super(message, cause);
        this.invalidSObjectFault = invalidSObjectFault;
    }

    public com.sforce.soap.partner.fault.InvalidSObjectFault getFaultInfo() {
        return this.invalidSObjectFault;
    }
}