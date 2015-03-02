/* 
 * @(#)Host.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "ietf-inet-types", revision: "2013-07-15".
 */

package ietfInetTypes;

import YangException;

import com.tailf.jnc.YangUnion;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/ietfInetTypes/host"
 * <p>
 * See line 408 in
 * /Users/tjiang/pyang-1.5/modules/ietf-inet-types.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Host extends YangUnion {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Host object from a string.
     * @param value Value to construct the Host from.
     */
    public Host(String value) throws YangException {
        super(value,
            new String[] {
                ".ietfInetTypes.IpAddress",
                ".ietfInetTypes.DomainName",
            }
        );
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
