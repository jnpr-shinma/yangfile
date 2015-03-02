/* 
 * @(#)IpAddressAndPrefixLength.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "tailf-common", revision: "2014-06-30".
 */

package tailfCommon;

import YangException;

import com.tailf.jnc.YangUnion;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/tailfCommon/ip-address-and-prefix-length"
 * <p>
 * See line 602 in
 * tailf-common.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class IpAddressAndPrefixLength extends YangUnion {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for IpAddressAndPrefixLength object from a string.
     * @param value Value to construct the IpAddressAndPrefixLength from.
     */
    public IpAddressAndPrefixLength(String value) throws YangException {
        super(value,
            new String[] {
                ".tailfCommon.Ipv4AddressAndPrefixLength",
                ".tailfCommon.Ipv6AddressAndPrefixLength",
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