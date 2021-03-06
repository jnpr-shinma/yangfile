/* 
 * @(#)MmeScEngineering.java        1.0 09/12/14
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
 * generated to "src/hctaEpc/mmeSgsn/engineering/mme-sc-engineering"
 * <p>
 * See line 636 in
 * scConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeScEngineering extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeScEngineering object.
     */
    public MmeScEngineering() {
        super(Epc.NAMESPACE, "mme-sc-engineering");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeScEngineering clone() {
        return (MmeScEngineering)cloneContent(new MmeScEngineering());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeScEngineering cloneShallow() {
        return (MmeScEngineering)cloneShallowContent(new MmeScEngineering());
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
            "pdn-average",
            "dedicated-bearer-average",
            "apn-average",
            "csg-average",
        };
    }

    /* Access methods for optional leaf child: "pdn-average". */

    /**
     * Gets the value for child leaf "pdn-average".
     * @return The value of the leaf.
     */
    public YangUInt16 getPdnAverageValue() throws JNCException {
        YangUInt16 pdnAverage = (YangUInt16)getValue("pdn-average");
        if (pdnAverage == null) {
            pdnAverage = new YangUInt16("105");  // default
        }
        return pdnAverage;
    }

    /**
     * Sets the value for child leaf "pdn-average",
     * using instance of generated typedef class.
     * @param pdnAverageValue The value to set.
     * @param pdnAverageValue used during instantiation.
     */
    public void setPdnAverageValue(YangUInt16 pdnAverageValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "pdn-average",
            pdnAverageValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "pdn-average",
     * using Java primitive values.
     * @param pdnAverageValue used during instantiation.
     */
    public void setPdnAverageValue(int pdnAverageValue) throws JNCException {
        setPdnAverageValue(new YangUInt16(pdnAverageValue));
    }

    /**
     * Sets the value for child leaf "pdn-average",
     * using a String value.
     * @param pdnAverageValue used during instantiation.
     */
    public void setPdnAverageValue(String pdnAverageValue) throws JNCException {
        setPdnAverageValue(new YangUInt16(pdnAverageValue));
    }

    /**
     * Unsets the value for child leaf "pdn-average".
     */
    public void unsetPdnAverageValue() throws JNCException {
        delete("pdn-average");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "pdn-average" leaf will not have a value.
     */
    public void addPdnAverage() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "pdn-average",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "pdn-average" with operation "replace".
     */
    public void markPdnAverageReplace() throws JNCException {
        markLeafReplace("pdnAverage");
    }

    /**
     * Marks the leaf "pdn-average" with operation "merge".
     */
    public void markPdnAverageMerge() throws JNCException {
        markLeafMerge("pdnAverage");
    }

    /**
     * Marks the leaf "pdn-average" with operation "create".
     */
    public void markPdnAverageCreate() throws JNCException {
        markLeafCreate("pdnAverage");
    }

    /**
     * Marks the leaf "pdn-average" with operation "delete".
     */
    public void markPdnAverageDelete() throws JNCException {
        markLeafDelete("pdnAverage");
    }

    /* Access methods for optional leaf child: "dedicated-bearer-average". */

    /**
     * Gets the value for child leaf "dedicated-bearer-average".
     * @return The value of the leaf.
     */
    public YangUInt16 getDedicatedBearerAverageValue() throws JNCException {
        YangUInt16 dedicatedBearerAverage = (YangUInt16)getValue("dedicated-bearer-average");
        if (dedicatedBearerAverage == null) {
            dedicatedBearerAverage = new YangUInt16("200");  // default
        }
        return dedicatedBearerAverage;
    }

    /**
     * Sets the value for child leaf "dedicated-bearer-average",
     * using instance of generated typedef class.
     * @param dedicatedBearerAverageValue The value to set.
     * @param dedicatedBearerAverageValue used during instantiation.
     */
    public void setDedicatedBearerAverageValue(YangUInt16 dedicatedBearerAverageValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "dedicated-bearer-average",
            dedicatedBearerAverageValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "dedicated-bearer-average",
     * using Java primitive values.
     * @param dedicatedBearerAverageValue used during instantiation.
     */
    public void setDedicatedBearerAverageValue(int dedicatedBearerAverageValue)
            throws JNCException {
        setDedicatedBearerAverageValue(new YangUInt16(dedicatedBearerAverageValue));
    }

    /**
     * Sets the value for child leaf "dedicated-bearer-average",
     * using a String value.
     * @param dedicatedBearerAverageValue used during instantiation.
     */
    public void setDedicatedBearerAverageValue(String dedicatedBearerAverageValue)
            throws JNCException {
        setDedicatedBearerAverageValue(new YangUInt16(dedicatedBearerAverageValue));
    }

    /**
     * Unsets the value for child leaf "dedicated-bearer-average".
     */
    public void unsetDedicatedBearerAverageValue() throws JNCException {
        delete("dedicated-bearer-average");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "dedicated-bearer-average" leaf will not have a value.
     */
    public void addDedicatedBearerAverage() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "dedicated-bearer-average",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "dedicated-bearer-average" with operation "replace".
     */
    public void markDedicatedBearerAverageReplace() throws JNCException {
        markLeafReplace("dedicatedBearerAverage");
    }

    /**
     * Marks the leaf "dedicated-bearer-average" with operation "merge".
     */
    public void markDedicatedBearerAverageMerge() throws JNCException {
        markLeafMerge("dedicatedBearerAverage");
    }

    /**
     * Marks the leaf "dedicated-bearer-average" with operation "create".
     */
    public void markDedicatedBearerAverageCreate() throws JNCException {
        markLeafCreate("dedicatedBearerAverage");
    }

    /**
     * Marks the leaf "dedicated-bearer-average" with operation "delete".
     */
    public void markDedicatedBearerAverageDelete() throws JNCException {
        markLeafDelete("dedicatedBearerAverage");
    }

    /* Access methods for optional leaf child: "apn-average". */

    /**
     * Gets the value for child leaf "apn-average".
     * @return The value of the leaf.
     */
    public YangUInt16 getApnAverageValue() throws JNCException {
        YangUInt16 apnAverage = (YangUInt16)getValue("apn-average");
        if (apnAverage == null) {
            apnAverage = new YangUInt16("200");  // default
        }
        return apnAverage;
    }

    /**
     * Sets the value for child leaf "apn-average",
     * using instance of generated typedef class.
     * @param apnAverageValue The value to set.
     * @param apnAverageValue used during instantiation.
     */
    public void setApnAverageValue(YangUInt16 apnAverageValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "apn-average",
            apnAverageValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "apn-average",
     * using Java primitive values.
     * @param apnAverageValue used during instantiation.
     */
    public void setApnAverageValue(int apnAverageValue) throws JNCException {
        setApnAverageValue(new YangUInt16(apnAverageValue));
    }

    /**
     * Sets the value for child leaf "apn-average",
     * using a String value.
     * @param apnAverageValue used during instantiation.
     */
    public void setApnAverageValue(String apnAverageValue) throws JNCException {
        setApnAverageValue(new YangUInt16(apnAverageValue));
    }

    /**
     * Unsets the value for child leaf "apn-average".
     */
    public void unsetApnAverageValue() throws JNCException {
        delete("apn-average");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "apn-average" leaf will not have a value.
     */
    public void addApnAverage() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "apn-average",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "apn-average" with operation "replace".
     */
    public void markApnAverageReplace() throws JNCException {
        markLeafReplace("apnAverage");
    }

    /**
     * Marks the leaf "apn-average" with operation "merge".
     */
    public void markApnAverageMerge() throws JNCException {
        markLeafMerge("apnAverage");
    }

    /**
     * Marks the leaf "apn-average" with operation "create".
     */
    public void markApnAverageCreate() throws JNCException {
        markLeafCreate("apnAverage");
    }

    /**
     * Marks the leaf "apn-average" with operation "delete".
     */
    public void markApnAverageDelete() throws JNCException {
        markLeafDelete("apnAverage");
    }

    /* Access methods for optional leaf child: "csg-average". */

    /**
     * Gets the value for child leaf "csg-average".
     * @return The value of the leaf.
     */
    public YangUInt16 getCsgAverageValue() throws JNCException {
        YangUInt16 csgAverage = (YangUInt16)getValue("csg-average");
        if (csgAverage == null) {
            csgAverage = new YangUInt16("200");  // default
        }
        return csgAverage;
    }

    /**
     * Sets the value for child leaf "csg-average",
     * using instance of generated typedef class.
     * @param csgAverageValue The value to set.
     * @param csgAverageValue used during instantiation.
     */
    public void setCsgAverageValue(YangUInt16 csgAverageValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "csg-average",
            csgAverageValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "csg-average",
     * using Java primitive values.
     * @param csgAverageValue used during instantiation.
     */
    public void setCsgAverageValue(int csgAverageValue) throws JNCException {
        setCsgAverageValue(new YangUInt16(csgAverageValue));
    }

    /**
     * Sets the value for child leaf "csg-average",
     * using a String value.
     * @param csgAverageValue used during instantiation.
     */
    public void setCsgAverageValue(String csgAverageValue) throws JNCException {
        setCsgAverageValue(new YangUInt16(csgAverageValue));
    }

    /**
     * Unsets the value for child leaf "csg-average".
     */
    public void unsetCsgAverageValue() throws JNCException {
        delete("csg-average");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "csg-average" leaf will not have a value.
     */
    public void addCsgAverage() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "csg-average",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "csg-average" with operation "replace".
     */
    public void markCsgAverageReplace() throws JNCException {
        markLeafReplace("csgAverage");
    }

    /**
     * Marks the leaf "csg-average" with operation "merge".
     */
    public void markCsgAverageMerge() throws JNCException {
        markLeafMerge("csgAverage");
    }

    /**
     * Marks the leaf "csg-average" with operation "create".
     */
    public void markCsgAverageCreate() throws JNCException {
        markLeafCreate("csgAverage");
    }

    /**
     * Marks the leaf "csg-average" with operation "delete".
     */
    public void markCsgAverageDelete() throws JNCException {
        markLeafDelete("csgAverage");
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
