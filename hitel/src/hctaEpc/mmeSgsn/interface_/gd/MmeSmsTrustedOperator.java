/* 
 * @(#)MmeSmsTrustedOperator.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.gd;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangString;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/gd/mme-sms-trusted-operator"
 * <p>
 * See line 93 in
 * sgsnScConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeSmsTrustedOperator extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeSmsTrustedOperator object.
     */
    public MmeSmsTrustedOperator() {
        super(Epc.NAMESPACE, "mme-sms-trusted-operator");
    }

    /**
     * Constructor for an initialized MmeSmsTrustedOperator object,
     * 
     * @param nodeAddressValue Key argument of child.
     */
    public MmeSmsTrustedOperator(YangString nodeAddressValue)
            throws JNCException {
        super(Epc.NAMESPACE, "mme-sms-trusted-operator");
        Leaf nodeAddress = new Leaf(Epc.NAMESPACE, "node-address");
        nodeAddress.setValue(nodeAddressValue);
        insertChild(nodeAddress, childrenNames());
    }

    /**
     * Constructor for an initialized MmeSmsTrustedOperator object,
     * with String keys.
     * @param nodeAddressValue Key argument of child.
     */
    public MmeSmsTrustedOperator(String nodeAddressValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-sms-trusted-operator");
        Leaf nodeAddress = new Leaf(Epc.NAMESPACE, "node-address");
        nodeAddress.setValue(new YangString(nodeAddressValue));
        insertChild(nodeAddress, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeSmsTrustedOperator clone() {
        MmeSmsTrustedOperator copy;
        try {
            copy = new MmeSmsTrustedOperator(getNodeAddressValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeSmsTrustedOperator)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeSmsTrustedOperator cloneShallow() {
        MmeSmsTrustedOperator copy;
        try {
            copy = new MmeSmsTrustedOperator(getNodeAddressValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeSmsTrustedOperator)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "node-address",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "node-address",
            "number-of-digits",
        };
    }

    /* Access methods for leaf child: "node-address". */

    /**
     * Gets the value for child leaf "node-address".
     * @return The value of the leaf.
     */
    public YangString getNodeAddressValue() throws JNCException {
        return (YangString)getValue("node-address");
    }

    /**
     * Sets the value for child leaf "node-address",
     * using instance of generated typedef class.
     * @param nodeAddressValue The value to set.
     * @param nodeAddressValue used during instantiation.
     */
    public void setNodeAddressValue(YangString nodeAddressValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "node-address",
            nodeAddressValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "node-address",
     * using a String value.
     * @param nodeAddressValue used during instantiation.
     */
    public void setNodeAddressValue(String nodeAddressValue)
            throws JNCException {
        setNodeAddressValue(new YangString(nodeAddressValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "node-address" leaf will not have a value.
     */
    public void addNodeAddress() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "node-address",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "number-of-digits". */

    /**
     * Gets the value for child leaf "number-of-digits".
     * @return The value of the leaf.
     */
    public YangUInt8 getNumberOfDigitsValue() throws JNCException {
        return (YangUInt8)getValue("number-of-digits");
    }

    /**
     * Sets the value for child leaf "number-of-digits",
     * using instance of generated typedef class.
     * @param numberOfDigitsValue The value to set.
     * @param numberOfDigitsValue used during instantiation.
     */
    public void setNumberOfDigitsValue(YangUInt8 numberOfDigitsValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "number-of-digits",
            numberOfDigitsValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "number-of-digits",
     * using Java primitive values.
     * @param numberOfDigitsValue used during instantiation.
     */
    public void setNumberOfDigitsValue(short numberOfDigitsValue)
            throws JNCException {
        setNumberOfDigitsValue(new YangUInt8(numberOfDigitsValue));
    }

    /**
     * Sets the value for child leaf "number-of-digits",
     * using a String value.
     * @param numberOfDigitsValue used during instantiation.
     */
    public void setNumberOfDigitsValue(String numberOfDigitsValue)
            throws JNCException {
        setNumberOfDigitsValue(new YangUInt8(numberOfDigitsValue));
    }

    /**
     * Unsets the value for child leaf "number-of-digits".
     */
    public void unsetNumberOfDigitsValue() throws JNCException {
        delete("number-of-digits");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "number-of-digits" leaf will not have a value.
     */
    public void addNumberOfDigits() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "number-of-digits",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "number-of-digits" with operation "replace".
     */
    public void markNumberOfDigitsReplace() throws JNCException {
        markLeafReplace("numberOfDigits");
    }

    /**
     * Marks the leaf "number-of-digits" with operation "merge".
     */
    public void markNumberOfDigitsMerge() throws JNCException {
        markLeafMerge("numberOfDigits");
    }

    /**
     * Marks the leaf "number-of-digits" with operation "create".
     */
    public void markNumberOfDigitsCreate() throws JNCException {
        markLeafCreate("numberOfDigits");
    }

    /**
     * Marks the leaf "number-of-digits" with operation "delete".
     */
    public void markNumberOfDigitsDelete() throws JNCException {
        markLeafDelete("numberOfDigits");
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