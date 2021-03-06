/* 
 * @(#)ImeisvT.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc;

import YangException;

import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/hctaEpc/imeisv-t"
 * <p>
 * See line 75 in
 * cmdCommonHcta.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class ImeisvT extends YangString {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for ImeisvT object from a string.
     * @param value Value to construct the ImeisvT from.
     */
    public ImeisvT(String value) throws YangException {
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
