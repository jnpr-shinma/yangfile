/* 
 * @(#)MmeFgwScEngineering.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.fgw.engineering;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/fgw/engineering/mme-fgw-sc-engineering"
 * <p>
 * See line 1184 in
 * s1MasterConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeFgwScEngineering extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeFgwScEngineering object.
     */
    public MmeFgwScEngineering() {
        super(Epc.NAMESPACE, "mme-fgw-sc-engineering");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeFgwScEngineering clone() {
        return (MmeFgwScEngineering)cloneContent(new MmeFgwScEngineering());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeFgwScEngineering cloneShallow() {
        return (MmeFgwScEngineering)cloneShallowContent(new MmeFgwScEngineering());
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
            "bearer-average",
        };
    }

    /* Access methods for optional leaf child: "bearer-average". */

    /**
     * Gets the value for child leaf "bearer-average".
     * @return The value of the leaf.
     */
    public YangUInt16 getBearerAverageValue() throws JNCException {
        YangUInt16 bearerAverage = (YangUInt16)getValue("bearer-average");
        if (bearerAverage == null) {
            bearerAverage = new YangUInt16("300");  // default
        }
        return bearerAverage;
    }

    /**
     * Sets the value for child leaf "bearer-average",
     * using instance of generated typedef class.
     * @param bearerAverageValue The value to set.
     * @param bearerAverageValue used during instantiation.
     */
    public void setBearerAverageValue(YangUInt16 bearerAverageValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "bearer-average",
            bearerAverageValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "bearer-average",
     * using Java primitive values.
     * @param bearerAverageValue used during instantiation.
     */
    public void setBearerAverageValue(int bearerAverageValue)
            throws JNCException {
        setBearerAverageValue(new YangUInt16(bearerAverageValue));
    }

    /**
     * Sets the value for child leaf "bearer-average",
     * using a String value.
     * @param bearerAverageValue used during instantiation.
     */
    public void setBearerAverageValue(String bearerAverageValue)
            throws JNCException {
        setBearerAverageValue(new YangUInt16(bearerAverageValue));
    }

    /**
     * Unsets the value for child leaf "bearer-average".
     */
    public void unsetBearerAverageValue() throws JNCException {
        delete("bearer-average");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "bearer-average" leaf will not have a value.
     */
    public void addBearerAverage() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "bearer-average",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "bearer-average" with operation "replace".
     */
    public void markBearerAverageReplace() throws JNCException {
        markLeafReplace("bearerAverage");
    }

    /**
     * Marks the leaf "bearer-average" with operation "merge".
     */
    public void markBearerAverageMerge() throws JNCException {
        markLeafMerge("bearerAverage");
    }

    /**
     * Marks the leaf "bearer-average" with operation "create".
     */
    public void markBearerAverageCreate() throws JNCException {
        markLeafCreate("bearerAverage");
    }

    /**
     * Marks the leaf "bearer-average" with operation "delete".
     */
    public void markBearerAverageDelete() throws JNCException {
        markLeafDelete("bearerAverage");
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
