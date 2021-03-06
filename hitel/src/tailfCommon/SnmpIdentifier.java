/* 
 * @(#)SnmpIdentifier.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "tailf-common", revision: "2014-06-30".
 */

package tailfCommon;

import YangException;

import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/tailfCommon/snmp-identifier"
 * <p>
 * See line 41 in
 * tailf-meta-extensions.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class SnmpIdentifier extends YangString {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for SnmpIdentifier object from a string.
     * @param value Value to construct the SnmpIdentifier from.
     */
    public SnmpIdentifier(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Sets the value using a string value.
     * @param value The value to set.
     */
    public void setValue(String value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }

}
