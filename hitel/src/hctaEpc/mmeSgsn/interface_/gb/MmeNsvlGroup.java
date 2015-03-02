/* 
 * @(#)MmeNsvlGroup.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.gb;

import Element;

import ElementChildrenIterator;

import Epc;

import JNCException;

import Leaf;

import Nsvl;

import YangUInt16;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/gb/mme-nsvl-group"
 * <p>
 * See line 481 in
 * gtlConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeNsvlGroup extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeNsvlGroup object.
     */
    public MmeNsvlGroup() {
        super(Epc.NAMESPACE, "mme-nsvl-group");
    }

    /**
     * Constructor for an initialized MmeNsvlGroup object,
     * 
     * @param nsvlGroupInstanceValue Key argument of child.
     */
    public MmeNsvlGroup(YangUInt16 nsvlGroupInstanceValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-nsvl-group");
        Leaf nsvlGroupInstance = new Leaf(Epc.NAMESPACE, "nsvl-group-instance");
        nsvlGroupInstance.setValue(nsvlGroupInstanceValue);
        insertChild(nsvlGroupInstance, childrenNames());
    }

    /**
     * Constructor for an initialized MmeNsvlGroup object,
     * with String keys.
     * @param nsvlGroupInstanceValue Key argument of child.
     */
    public MmeNsvlGroup(String nsvlGroupInstanceValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-nsvl-group");
        Leaf nsvlGroupInstance = new Leaf(Epc.NAMESPACE, "nsvl-group-instance");
        nsvlGroupInstance.setValue(new YangUInt16(nsvlGroupInstanceValue));
        insertChild(nsvlGroupInstance, childrenNames());
    }

    /**
     * Constructor for an initialized MmeNsvlGroup object,
     * with keys of built in Java types.
     * @param nsvlGroupInstanceValue Key argument of child.
     */
    public MmeNsvlGroup(int nsvlGroupInstanceValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-nsvl-group");
        Leaf nsvlGroupInstance = new Leaf(Epc.NAMESPACE, "nsvl-group-instance");
        nsvlGroupInstance.setValue(new YangUInt16(nsvlGroupInstanceValue));
        insertChild(nsvlGroupInstance, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeNsvlGroup clone() {
        MmeNsvlGroup copy;
        try {
            copy = new MmeNsvlGroup(getNsvlGroupInstanceValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeNsvlGroup)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeNsvlGroup cloneShallow() {
        MmeNsvlGroup copy;
        try {
            copy = new MmeNsvlGroup(getNsvlGroupInstanceValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeNsvlGroup)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "nsvl-group-instance",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "nsvl-group-instance",
            "nsvl",
        };
    }

    /* Access methods for leaf child: "nsvl-group-instance". */

    /**
     * Gets the value for child leaf "nsvl-group-instance".
     * @return The value of the leaf.
     */
    public YangUInt16 getNsvlGroupInstanceValue() throws JNCException {
        return (YangUInt16)getValue("nsvl-group-instance");
    }

    /**
     * Sets the value for child leaf "nsvl-group-instance",
     * using instance of generated typedef class.
     * @param nsvlGroupInstanceValue The value to set.
     * @param nsvlGroupInstanceValue used during instantiation.
     */
    public void setNsvlGroupInstanceValue(YangUInt16 nsvlGroupInstanceValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "nsvl-group-instance",
            nsvlGroupInstanceValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "nsvl-group-instance",
     * using Java primitive values.
     * @param nsvlGroupInstanceValue used during instantiation.
     */
    public void setNsvlGroupInstanceValue(int nsvlGroupInstanceValue)
            throws JNCException {
        setNsvlGroupInstanceValue(new YangUInt16(nsvlGroupInstanceValue));
    }

    /**
     * Sets the value for child leaf "nsvl-group-instance",
     * using a String value.
     * @param nsvlGroupInstanceValue used during instantiation.
     */
    public void setNsvlGroupInstanceValue(String nsvlGroupInstanceValue)
            throws JNCException {
        setNsvlGroupInstanceValue(new YangUInt16(nsvlGroupInstanceValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "nsvl-group-instance" leaf will not have a value.
     */
    public void addNsvlGroupInstance() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "nsvl-group-instance",
            null,
            childrenNames());
    }

    /* Access methods for list child: "nsvl". */

    /**
     * Gets list entry "nsvl", with specified keys.
     * @param nsvlIdValue Key argument of child.
     */
    public Nsvl getNsvl(YangUInt16 nsvlIdValue) throws JNCException {
        String path = "nsvl[nsvlId='" + nsvlIdValue + "']";
        return (Nsvl)searchOne(path);
    }

    /**
     * Gets list entry "nsvl", with specified keys.
     * The keys are specified as strings.
     * @param nsvlIdValue Key argument of child.
     */
    public Nsvl getNsvl(String nsvlIdValue) throws JNCException {
        String path = "nsvl[nsvlId='" + nsvlIdValue + "']";
        return (Nsvl)searchOne(path);
    }

    /**
     * Iterator method for the list "nsvl".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator nsvlIterator() {
        return new ElementChildrenIterator(children, "nsvl");
    }

    /**
     * Adds list entry "nsvl", using an existing object.
     * @param nsvl The object to add.
     * @return The added child.
     */
    public Nsvl addNsvl(Nsvl nsvl) throws JNCException {
        insertChild(nsvl, childrenNames());
        return nsvl;
    }

    /**
     * Adds list entry "nsvl", with specified keys.
     * @param nsvlIdValue Key argument of child.
     * @return The added child.
     */
    public Nsvl addNsvl(YangUInt16 nsvlIdValue) throws JNCException {
        Nsvl nsvl = new Nsvl(nsvlIdValue);
        return addNsvl(nsvl);
    }

    /**
     * Adds list entry "nsvl", with specified keys.
     * The keys are specified as strings.
     * @param nsvlIdValue Key argument of child.
     * @return The added child.
     */
    public Nsvl addNsvl(String nsvlIdValue) throws JNCException {
        Nsvl nsvl = new Nsvl(nsvlIdValue);
        return addNsvl(nsvl);
    }

    /**
     * Adds list entry "nsvl".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Nsvl addNsvl() throws JNCException {
        Nsvl nsvl = new Nsvl();
        insertChild(nsvl, childrenNames());
        return nsvl;
    }

    /**
     * Deletes list entry "nsvl", with specified keys.
     * @param nsvlIdValue Key argument of child.
     */
    public void deleteNsvl(YangUInt16 nsvlIdValue) throws JNCException {
        String path = "nsvl[nsvlId='" + nsvlIdValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "nsvl", with specified keys.
     * The keys are specified as strings.
     * @param nsvlIdValue Key argument of child.
     */
    public void deleteNsvl(String nsvlIdValue) throws JNCException {
        String path = "nsvl[nsvlId='" + nsvlIdValue + "']";
        delete(path);
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
