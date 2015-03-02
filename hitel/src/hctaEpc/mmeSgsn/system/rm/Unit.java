/* 
 * @(#)Unit.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.system.rm;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangUInt16;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/system/rm/unit"
 * <p>
 * See line 424 in
 * mmeSgsnConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Unit extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Unit object.
     */
    public Unit() {
        super(Epc.NAMESPACE, "unit");
    }

    /**
     * Constructor for an initialized Unit object,
     * 
     * @param unitIdValue Key argument of child.
     */
    public Unit(YangUInt16 unitIdValue) throws JNCException {
        super(Epc.NAMESPACE, "unit");
        Leaf unitId = new Leaf(Epc.NAMESPACE, "unit-id");
        unitId.setValue(unitIdValue);
        insertChild(unitId, childrenNames());
    }

    /**
     * Constructor for an initialized Unit object,
     * with String keys.
     * @param unitIdValue Key argument of child.
     */
    public Unit(String unitIdValue) throws JNCException {
        super(Epc.NAMESPACE, "unit");
        Leaf unitId = new Leaf(Epc.NAMESPACE, "unit-id");
        unitId.setValue(new YangUInt16(unitIdValue));
        insertChild(unitId, childrenNames());
    }

    /**
     * Constructor for an initialized Unit object,
     * with keys of built in Java types.
     * @param unitIdValue Key argument of child.
     */
    public Unit(int unitIdValue) throws JNCException {
        super(Epc.NAMESPACE, "unit");
        Leaf unitId = new Leaf(Epc.NAMESPACE, "unit-id");
        unitId.setValue(new YangUInt16(unitIdValue));
        insertChild(unitId, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Unit clone() {
        Unit copy;
        try {
            copy = new Unit(getUnitIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Unit)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Unit cloneShallow() {
        Unit copy;
        try {
            copy = new Unit(getUnitIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Unit)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "unit-id",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "unit-id",
            "vm-instance",
        };
    }

    /* Access methods for leaf child: "unit-id". */

    /**
     * Gets the value for child leaf "unit-id".
     * @return The value of the leaf.
     */
    public YangUInt16 getUnitIdValue() throws JNCException {
        return (YangUInt16)getValue("unit-id");
    }

    /**
     * Sets the value for child leaf "unit-id",
     * using instance of generated typedef class.
     * @param unitIdValue The value to set.
     * @param unitIdValue used during instantiation.
     */
    public void setUnitIdValue(YangUInt16 unitIdValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "unit-id",
            unitIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "unit-id",
     * using Java primitive values.
     * @param unitIdValue used during instantiation.
     */
    public void setUnitIdValue(int unitIdValue) throws JNCException {
        setUnitIdValue(new YangUInt16(unitIdValue));
    }

    /**
     * Sets the value for child leaf "unit-id",
     * using a String value.
     * @param unitIdValue used during instantiation.
     */
    public void setUnitIdValue(String unitIdValue) throws JNCException {
        setUnitIdValue(new YangUInt16(unitIdValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "unit-id" leaf will not have a value.
     */
    public void addUnitId() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "unit-id",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "vm-instance". */

    /**
     * Gets the value for child leaf "vm-instance".
     * @return The value of the leaf.
     */
    public YangString getVmInstanceValue() throws JNCException {
        return (YangString)getValue("vm-instance");
    }

    /**
     * Sets the value for child leaf "vm-instance",
     * using instance of generated typedef class.
     * @param vmInstanceValue The value to set.
     * @param vmInstanceValue used during instantiation.
     */
    public void setVmInstanceValue(YangString vmInstanceValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "vm-instance",
            vmInstanceValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "vm-instance",
     * using a String value.
     * @param vmInstanceValue used during instantiation.
     */
    public void setVmInstanceValue(String vmInstanceValue) throws JNCException {
        setVmInstanceValue(new YangString(vmInstanceValue));
    }

    /**
     * Unsets the value for child leaf "vm-instance".
     */
    public void unsetVmInstanceValue() throws JNCException {
        delete("vm-instance");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "vm-instance" leaf will not have a value.
     */
    public void addVmInstance() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "vm-instance",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "vm-instance" with operation "replace".
     */
    public void markVmInstanceReplace() throws JNCException {
        markLeafReplace("vmInstance");
    }

    /**
     * Marks the leaf "vm-instance" with operation "merge".
     */
    public void markVmInstanceMerge() throws JNCException {
        markLeafMerge("vmInstance");
    }

    /**
     * Marks the leaf "vm-instance" with operation "create".
     */
    public void markVmInstanceCreate() throws JNCException {
        markLeafCreate("vmInstance");
    }

    /**
     * Marks the leaf "vm-instance" with operation "delete".
     */
    public void markVmInstanceDelete() throws JNCException {
        markLeafDelete("vmInstance");
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
