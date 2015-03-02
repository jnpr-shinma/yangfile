/* 
 * @(#)MmeS4Sgsn.java        1.0 09/12/14
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

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/feature/mme-s4-sgsn"
 * <p>
 * See line 590 in
 * featuresConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeS4Sgsn extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeS4Sgsn object.
     */
    public MmeS4Sgsn() {
        super(Epc.NAMESPACE, "mme-s4-sgsn");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeS4Sgsn clone() {
        return (MmeS4Sgsn)cloneContent(new MmeS4Sgsn());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeS4Sgsn cloneShallow() {
        return (MmeS4Sgsn)cloneShallowContent(new MmeS4Sgsn());
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
            "non-epc-aware-ue-activation",
            "data-plane",
        };
    }

    /* Access methods for optional leaf child: "non-epc-aware-ue-activation". */

    /**
     * Gets the value for child leaf "non-epc-aware-ue-activation".
     * @return The value of the leaf.
     */
    public YangEnumeration getNonEpcAwareUeActivationValue()
            throws JNCException {
        YangEnumeration nonEpcAwareUeActivation = (YangEnumeration)getValue("non-epc-aware-ue-activation");
        if (nonEpcAwareUeActivation == null) {
            nonEpcAwareUeActivation = new YangEnumeration("gn", new String[] {  // default
                "gn",
                "s4",
            });
        }
        return nonEpcAwareUeActivation;
    }

    /**
     * Sets the value for child leaf "non-epc-aware-ue-activation",
     * using instance of generated typedef class.
     * @param nonEpcAwareUeActivationValue The value to set.
     * @param nonEpcAwareUeActivationValue used during instantiation.
     */
    public void setNonEpcAwareUeActivationValue(YangEnumeration nonEpcAwareUeActivationValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "non-epc-aware-ue-activation",
            nonEpcAwareUeActivationValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "non-epc-aware-ue-activation",
     * using a String value.
     * @param nonEpcAwareUeActivationValue used during instantiation.
     */
    public void setNonEpcAwareUeActivationValue(String nonEpcAwareUeActivationValue)
            throws JNCException {
        setNonEpcAwareUeActivationValue(new YangEnumeration(nonEpcAwareUeActivationValue, new String[] {
             "gn",
             "s4",
        }));
    }

    /**
     * Unsets the value for child leaf "non-epc-aware-ue-activation".
     */
    public void unsetNonEpcAwareUeActivationValue() throws JNCException {
        delete("non-epc-aware-ue-activation");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "non-epc-aware-ue-activation" leaf will not have a value.
     */
    public void addNonEpcAwareUeActivation() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "non-epc-aware-ue-activation",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "non-epc-aware-ue-activation" with operation "replace".
     */
    public void markNonEpcAwareUeActivationReplace() throws JNCException {
        markLeafReplace("nonEpcAwareUeActivation");
    }

    /**
     * Marks the leaf "non-epc-aware-ue-activation" with operation "merge".
     */
    public void markNonEpcAwareUeActivationMerge() throws JNCException {
        markLeafMerge("nonEpcAwareUeActivation");
    }

    /**
     * Marks the leaf "non-epc-aware-ue-activation" with operation "create".
     */
    public void markNonEpcAwareUeActivationCreate() throws JNCException {
        markLeafCreate("nonEpcAwareUeActivation");
    }

    /**
     * Marks the leaf "non-epc-aware-ue-activation" with operation "delete".
     */
    public void markNonEpcAwareUeActivationDelete() throws JNCException {
        markLeafDelete("nonEpcAwareUeActivation");
    }

    /* Access methods for optional leaf child: "data-plane". */

    /**
     * Gets the value for child leaf "data-plane".
     * @return The value of the leaf.
     */
    public YangEnumeration getDataPlaneValue() throws JNCException {
        YangEnumeration dataPlane = (YangEnumeration)getValue("data-plane");
        if (dataPlane == null) {
            dataPlane = new YangEnumeration("never", new String[] {  // default
                "never",
                "always",
            });
        }
        return dataPlane;
    }

    /**
     * Sets the value for child leaf "data-plane",
     * using instance of generated typedef class.
     * @param dataPlaneValue The value to set.
     * @param dataPlaneValue used during instantiation.
     */
    public void setDataPlaneValue(YangEnumeration dataPlaneValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "data-plane",
            dataPlaneValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "data-plane",
     * using a String value.
     * @param dataPlaneValue used during instantiation.
     */
    public void setDataPlaneValue(String dataPlaneValue) throws JNCException {
        setDataPlaneValue(new YangEnumeration(dataPlaneValue, new String[] {
             "never",
             "always",
        }));
    }

    /**
     * Unsets the value for child leaf "data-plane".
     */
    public void unsetDataPlaneValue() throws JNCException {
        delete("data-plane");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "data-plane" leaf will not have a value.
     */
    public void addDataPlane() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "data-plane",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "data-plane" with operation "replace".
     */
    public void markDataPlaneReplace() throws JNCException {
        markLeafReplace("dataPlane");
    }

    /**
     * Marks the leaf "data-plane" with operation "merge".
     */
    public void markDataPlaneMerge() throws JNCException {
        markLeafMerge("dataPlane");
    }

    /**
     * Marks the leaf "data-plane" with operation "create".
     */
    public void markDataPlaneCreate() throws JNCException {
        markLeafCreate("dataPlane");
    }

    /**
     * Marks the leaf "data-plane" with operation "delete".
     */
    public void markDataPlaneDelete() throws JNCException {
        markLeafDelete("dataPlane");
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
