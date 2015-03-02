/* 
 * @(#)AesCfb128EncryptedString.java        1.0 09/12/14
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
 * generated to "src/tailfCommon/aes-cfb-128-encrypted-string"
 * <p>
 * See line 562 in
 * tailf-common.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class AesCfb128EncryptedString extends YangString {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for AesCfb128EncryptedString object from a string.
     * @param value Value to construct the AesCfb128EncryptedString from.
     */
    public AesCfb128EncryptedString(String value) throws YangException {
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