/* 
 * @(#)MmeAdvancedTaMgmt.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.feature;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/feature/mme-advanced-ta-mgmt"
 * <p>
 * See line 295 in
 * featuresConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeAdvancedTaMgmt extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeAdvancedTaMgmt object.
     */
    public MmeAdvancedTaMgmt() {
        super(Epc.NAMESPACE, "mme-advanced-ta-mgmt");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeAdvancedTaMgmt clone() {
        return (MmeAdvancedTaMgmt)cloneContent(new MmeAdvancedTaMgmt());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeAdvancedTaMgmt cloneShallow() {
        return (MmeAdvancedTaMgmt)cloneShallowContent(new MmeAdvancedTaMgmt());
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
            "relative-tau-page-ratio",
            "tai-list-generation",
        };
    }

    /* Access methods for optional leaf child: "relative-tau-page-ratio". */

    /**
     * Gets the value for child leaf "relative-tau-page-ratio".
     * @return The value of the leaf.
     */
    public YangUInt8 getRelativeTauPageRatioValue() throws JNCException {
        YangUInt8 relativeTauPageRatio = (YangUInt8)getValue("relative-tau-page-ratio");
        if (relativeTauPageRatio == null) {
            relativeTauPageRatio = new YangUInt8("25");  // default
        }
        return relativeTauPageRatio;
    }

    /**
     * Sets the value for child leaf "relative-tau-page-ratio",
     * using instance of generated typedef class.
     * @param relativeTauPageRatioValue The value to set.
     * @param relativeTauPageRatioValue used during instantiation.
     */
    public void setRelativeTauPageRatioValue(YangUInt8 relativeTauPageRatioValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "relative-tau-page-ratio",
            relativeTauPageRatioValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "relative-tau-page-ratio",
     * using Java primitive values.
     * @param relativeTauPageRatioValue used during instantiation.
     */
    public void setRelativeTauPageRatioValue(short relativeTauPageRatioValue)
            throws JNCException {
        setRelativeTauPageRatioValue(new YangUInt8(relativeTauPageRatioValue));
    }

    /**
     * Sets the value for child leaf "relative-tau-page-ratio",
     * using a String value.
     * @param relativeTauPageRatioValue used during instantiation.
     */
    public void setRelativeTauPageRatioValue(String relativeTauPageRatioValue)
            throws JNCException {
        setRelativeTauPageRatioValue(new YangUInt8(relativeTauPageRatioValue));
    }

    /**
     * Unsets the value for child leaf "relative-tau-page-ratio".
     */
    public void unsetRelativeTauPageRatioValue() throws JNCException {
        delete("relative-tau-page-ratio");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "relative-tau-page-ratio" leaf will not have a value.
     */
    public void addRelativeTauPageRatio() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "relative-tau-page-ratio",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "relative-tau-page-ratio" with operation "replace".
     */
    public void markRelativeTauPageRatioReplace() throws JNCException {
        markLeafReplace("relativeTauPageRatio");
    }

    /**
     * Marks the leaf "relative-tau-page-ratio" with operation "merge".
     */
    public void markRelativeTauPageRatioMerge() throws JNCException {
        markLeafMerge("relativeTauPageRatio");
    }

    /**
     * Marks the leaf "relative-tau-page-ratio" with operation "create".
     */
    public void markRelativeTauPageRatioCreate() throws JNCException {
        markLeafCreate("relativeTauPageRatio");
    }

    /**
     * Marks the leaf "relative-tau-page-ratio" with operation "delete".
     */
    public void markRelativeTauPageRatioDelete() throws JNCException {
        markLeafDelete("relativeTauPageRatio");
    }

    /* Access methods for optional leaf child: "tai-list-generation". */

    /**
     * Gets the value for child leaf "tai-list-generation".
     * @return The value of the leaf.
     */
    public YangEnumeration getTaiListGenerationValue() throws JNCException {
        YangEnumeration taiListGeneration = (YangEnumeration)getValue("tai-list-generation");
        if (taiListGeneration == null) {
            taiListGeneration = new YangEnumeration("disable", new String[] {  // default
                "enable",
                "disable",
            });
        }
        return taiListGeneration;
    }

    /**
     * Sets the value for child leaf "tai-list-generation",
     * using instance of generated typedef class.
     * @param taiListGenerationValue The value to set.
     * @param taiListGenerationValue used during instantiation.
     */
    public void setTaiListGenerationValue(YangEnumeration taiListGenerationValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "tai-list-generation",
            taiListGenerationValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "tai-list-generation",
     * using a String value.
     * @param taiListGenerationValue used during instantiation.
     */
    public void setTaiListGenerationValue(String taiListGenerationValue)
            throws JNCException {
        setTaiListGenerationValue(new YangEnumeration(taiListGenerationValue, new String[] {
             "enable",
             "disable",
        }));
    }

    /**
     * Unsets the value for child leaf "tai-list-generation".
     */
    public void unsetTaiListGenerationValue() throws JNCException {
        delete("tai-list-generation");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "tai-list-generation" leaf will not have a value.
     */
    public void addTaiListGeneration() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "tai-list-generation",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "tai-list-generation" with operation "replace".
     */
    public void markTaiListGenerationReplace() throws JNCException {
        markLeafReplace("taiListGeneration");
    }

    /**
     * Marks the leaf "tai-list-generation" with operation "merge".
     */
    public void markTaiListGenerationMerge() throws JNCException {
        markLeafMerge("taiListGeneration");
    }

    /**
     * Marks the leaf "tai-list-generation" with operation "create".
     */
    public void markTaiListGenerationCreate() throws JNCException {
        markLeafCreate("taiListGeneration");
    }

    /**
     * Marks the leaf "tai-list-generation" with operation "delete".
     */
    public void markTaiListGenerationDelete() throws JNCException {
        markLeafDelete("taiListGeneration");
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
