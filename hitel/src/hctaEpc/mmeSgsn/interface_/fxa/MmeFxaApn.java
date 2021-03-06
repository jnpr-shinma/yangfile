/* 
 * @(#)MmeFxaApn.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.fxa;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangString;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/fxa/mme-fxa-apn"
 * <p>
 * See line 82 in
 * upsmConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeFxaApn extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeFxaApn object.
     */
    public MmeFxaApn() {
        super(Epc.NAMESPACE, "mme-fxa-apn");
    }

    /**
     * Constructor for an initialized MmeFxaApn object,
     * 
     * @param apnNameValue Key argument of child.
     */
    public MmeFxaApn(YangString apnNameValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-fxa-apn");
        Leaf apnName = new Leaf(Epc.NAMESPACE, "apn-name");
        apnName.setValue(apnNameValue);
        insertChild(apnName, childrenNames());
    }

    /**
     * Constructor for an initialized MmeFxaApn object,
     * with String keys.
     * @param apnNameValue Key argument of child.
     */
    public MmeFxaApn(String apnNameValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-fxa-apn");
        Leaf apnName = new Leaf(Epc.NAMESPACE, "apn-name");
        apnName.setValue(new YangString(apnNameValue));
        insertChild(apnName, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeFxaApn clone() {
        MmeFxaApn copy;
        try {
            copy = new MmeFxaApn(getApnNameValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeFxaApn)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeFxaApn cloneShallow() {
        MmeFxaApn copy;
        try {
            copy = new MmeFxaApn(getApnNameValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeFxaApn)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "apn-name",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "apn-name",
        };
    }

    /* Access methods for leaf child: "apn-name". */

    /**
     * Gets the value for child leaf "apn-name".
     * @return The value of the leaf.
     */
    public YangString getApnNameValue() throws JNCException {
        return (YangString)getValue("apn-name");
    }

    /**
     * Sets the value for child leaf "apn-name",
     * using instance of generated typedef class.
     * @param apnNameValue The value to set.
     * @param apnNameValue used during instantiation.
     */
    public void setApnNameValue(YangString apnNameValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "apn-name",
            apnNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "apn-name",
     * using a String value.
     * @param apnNameValue used during instantiation.
     */
    public void setApnNameValue(String apnNameValue) throws JNCException {
        setApnNameValue(new YangString(apnNameValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "apn-name" leaf will not have a value.
     */
    public void addApnName() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "apn-name",
            null,
            childrenNames());
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
    }

}
