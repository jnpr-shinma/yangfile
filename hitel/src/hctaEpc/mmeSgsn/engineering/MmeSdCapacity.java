/* 
 * @(#)MmeSdCapacity.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.engineering;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/engineering/mme-sd-capacity"
 * <p>
 * See line 383 in
 * sdConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeSdCapacity extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeSdCapacity object.
     */
    public MmeSdCapacity() {
        super(Epc.NAMESPACE, "mme-sd-capacity");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeSdCapacity clone() {
        return (MmeSdCapacity)cloneContent(new MmeSdCapacity());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeSdCapacity cloneShallow() {
        return (MmeSdCapacity)cloneShallowContent(new MmeSdCapacity());
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return null;
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "subs-per-su",
        };
    }

    /* Access methods for optional leaf child: "subs-per-su". */

    /**
     * Gets the value for child leaf "subs-per-su".
     * @return The value of the leaf.
     */
    public YangUInt16 getSubsPerSuValue() throws JNCException {
        YangUInt16 subsPerSu = (YangUInt16)getValue("subs-per-su");
        if (subsPerSu == null) {
            subsPerSu = new YangUInt16("1664");  // default
        }
        return subsPerSu;
    }

    /**
     * Sets the value for child leaf "subs-per-su",
     * using instance of generated typedef class.
     * @param subsPerSuValue The value to set.
     * @param subsPerSuValue used during instantiation.
     */
    public void setSubsPerSuValue(YangUInt16 subsPerSuValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "subs-per-su",
            subsPerSuValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "subs-per-su",
     * using Java primitive values.
     * @param subsPerSuValue used during instantiation.
     */
    public void setSubsPerSuValue(int subsPerSuValue) throws JNCException {
        setSubsPerSuValue(new YangUInt16(subsPerSuValue));
    }

    /**
     * Sets the value for child leaf "subs-per-su",
     * using a String value.
     * @param subsPerSuValue used during instantiation.
     */
    public void setSubsPerSuValue(String subsPerSuValue) throws JNCException {
        setSubsPerSuValue(new YangUInt16(subsPerSuValue));
    }

    /**
     * Unsets the value for child leaf "subs-per-su".
     */
    public void unsetSubsPerSuValue() throws JNCException {
        delete("subs-per-su");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "subs-per-su" leaf will not have a value.
     */
    public void addSubsPerSu() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "subs-per-su",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "subs-per-su" with operation "replace".
     */
    public void markSubsPerSuReplace() throws JNCException {
        markLeafReplace("subsPerSu");
    }

    /**
     * Marks the leaf "subs-per-su" with operation "merge".
     */
    public void markSubsPerSuMerge() throws JNCException {
        markLeafMerge("subsPerSu");
    }

    /**
     * Marks the leaf "subs-per-su" with operation "create".
     */
    public void markSubsPerSuCreate() throws JNCException {
        markLeafCreate("subsPerSu");
    }

    /**
     * Marks the leaf "subs-per-su" with operation "delete".
     */
    public void markSubsPerSuDelete() throws JNCException {
        markLeafDelete("subsPerSu");
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
