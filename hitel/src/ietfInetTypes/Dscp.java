/* 
 * @(#)Dscp.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "ietf-inet-types", revision: "2013-07-15".
 */

package ietfInetTypes;

import YangException;

import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/ietfInetTypes/dscp"
 * <p>
 * See line 88 in
 * /Users/tjiang/pyang-1.5/modules/ietf-inet-types.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Dscp extends YangUInt8 {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Dscp object from a string.
     * @param value Value to construct the Dscp from.
     */
    public Dscp(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Constructor for Dscp object from a short.
     * @param value Value to construct the Dscp from.
     */
    public Dscp(short value) throws YangException {
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
     * Sets the value using a value of type short.
     * @param value The value to set.
     */
    public void setValue(short value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }

}
