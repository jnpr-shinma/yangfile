/* 
 * @(#)MmeGttEntry.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.ss7;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangUInt16;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/ss7/mme-gtt-entry"
 * <p>
 * See line 148 in
 * sigtranConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeGttEntry extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeGttEntry object.
     */
    public MmeGttEntry() {
        super(Epc.NAMESPACE, "mme-gtt-entry");
    }

    /**
     * Constructor for an initialized MmeGttEntry object,
     * 
     * @param instanceValue Key argument of child.
     */
    public MmeGttEntry(YangUInt16 instanceValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-gtt-entry");
        Leaf instance = new Leaf(Epc.NAMESPACE, "instance");
        instance.setValue(instanceValue);
        insertChild(instance, childrenNames());
    }

    /**
     * Constructor for an initialized MmeGttEntry object,
     * with String keys.
     * @param instanceValue Key argument of child.
     */
    public MmeGttEntry(String instanceValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-gtt-entry");
        Leaf instance = new Leaf(Epc.NAMESPACE, "instance");
        instance.setValue(new YangUInt16(instanceValue));
        insertChild(instance, childrenNames());
    }

    /**
     * Constructor for an initialized MmeGttEntry object,
     * with keys of built in Java types.
     * @param instanceValue Key argument of child.
     */
    public MmeGttEntry(int instanceValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-gtt-entry");
        Leaf instance = new Leaf(Epc.NAMESPACE, "instance");
        instance.setValue(new YangUInt16(instanceValue));
        insertChild(instance, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeGttEntry clone() {
        MmeGttEntry copy;
        try {
            copy = new MmeGttEntry(getInstanceValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeGttEntry)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeGttEntry cloneShallow() {
        MmeGttEntry copy;
        try {
            copy = new MmeGttEntry(getInstanceValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeGttEntry)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "instance",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "instance",
            "lower-gtai",
            "upper-gtai",
            "primary-result",
            "secondary-result",
            "global-title-indicator",
            "translation-type",
            "numbering-plan",
            "nature-of-addr-indicator",
        };
    }

    /* Access methods for leaf child: "instance". */

    /**
     * Gets the value for child leaf "instance".
     * @return The value of the leaf.
     */
    public YangUInt16 getInstanceValue() throws JNCException {
        return (YangUInt16)getValue("instance");
    }

    /**
     * Sets the value for child leaf "instance",
     * using instance of generated typedef class.
     * @param instanceValue The value to set.
     * @param instanceValue used during instantiation.
     */
    public void setInstanceValue(YangUInt16 instanceValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "instance",
            instanceValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "instance",
     * using Java primitive values.
     * @param instanceValue used during instantiation.
     */
    public void setInstanceValue(int instanceValue) throws JNCException {
        setInstanceValue(new YangUInt16(instanceValue));
    }

    /**
     * Sets the value for child leaf "instance",
     * using a String value.
     * @param instanceValue used during instantiation.
     */
    public void setInstanceValue(String instanceValue) throws JNCException {
        setInstanceValue(new YangUInt16(instanceValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "instance" leaf will not have a value.
     */
    public void addInstance() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "instance",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "lower-gtai". */

    /**
     * Gets the value for child leaf "lower-gtai".
     * @return The value of the leaf.
     */
    public YangString getLowerGtaiValue() throws JNCException {
        return (YangString)getValue("lower-gtai");
    }

    /**
     * Sets the value for child leaf "lower-gtai",
     * using instance of generated typedef class.
     * @param lowerGtaiValue The value to set.
     * @param lowerGtaiValue used during instantiation.
     */
    public void setLowerGtaiValue(YangString lowerGtaiValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "lower-gtai",
            lowerGtaiValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "lower-gtai",
     * using a String value.
     * @param lowerGtaiValue used during instantiation.
     */
    public void setLowerGtaiValue(String lowerGtaiValue) throws JNCException {
        setLowerGtaiValue(new YangString(lowerGtaiValue));
    }

    /**
     * Unsets the value for child leaf "lower-gtai".
     */
    public void unsetLowerGtaiValue() throws JNCException {
        delete("lower-gtai");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "lower-gtai" leaf will not have a value.
     */
    public void addLowerGtai() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "lower-gtai",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "lower-gtai" with operation "replace".
     */
    public void markLowerGtaiReplace() throws JNCException {
        markLeafReplace("lowerGtai");
    }

    /**
     * Marks the leaf "lower-gtai" with operation "merge".
     */
    public void markLowerGtaiMerge() throws JNCException {
        markLeafMerge("lowerGtai");
    }

    /**
     * Marks the leaf "lower-gtai" with operation "create".
     */
    public void markLowerGtaiCreate() throws JNCException {
        markLeafCreate("lowerGtai");
    }

    /**
     * Marks the leaf "lower-gtai" with operation "delete".
     */
    public void markLowerGtaiDelete() throws JNCException {
        markLeafDelete("lowerGtai");
    }

    /* Access methods for optional leaf child: "upper-gtai". */

    /**
     * Gets the value for child leaf "upper-gtai".
     * @return The value of the leaf.
     */
    public YangString getUpperGtaiValue() throws JNCException {
        return (YangString)getValue("upper-gtai");
    }

    /**
     * Sets the value for child leaf "upper-gtai",
     * using instance of generated typedef class.
     * @param upperGtaiValue The value to set.
     * @param upperGtaiValue used during instantiation.
     */
    public void setUpperGtaiValue(YangString upperGtaiValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "upper-gtai",
            upperGtaiValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "upper-gtai",
     * using a String value.
     * @param upperGtaiValue used during instantiation.
     */
    public void setUpperGtaiValue(String upperGtaiValue) throws JNCException {
        setUpperGtaiValue(new YangString(upperGtaiValue));
    }

    /**
     * Unsets the value for child leaf "upper-gtai".
     */
    public void unsetUpperGtaiValue() throws JNCException {
        delete("upper-gtai");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "upper-gtai" leaf will not have a value.
     */
    public void addUpperGtai() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "upper-gtai",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "upper-gtai" with operation "replace".
     */
    public void markUpperGtaiReplace() throws JNCException {
        markLeafReplace("upperGtai");
    }

    /**
     * Marks the leaf "upper-gtai" with operation "merge".
     */
    public void markUpperGtaiMerge() throws JNCException {
        markLeafMerge("upperGtai");
    }

    /**
     * Marks the leaf "upper-gtai" with operation "create".
     */
    public void markUpperGtaiCreate() throws JNCException {
        markLeafCreate("upperGtai");
    }

    /**
     * Marks the leaf "upper-gtai" with operation "delete".
     */
    public void markUpperGtaiDelete() throws JNCException {
        markLeafDelete("upperGtai");
    }

    /* Access methods for optional leaf child: "primary-result". */

    /**
     * Gets the value for child leaf "primary-result".
     * @return The value of the leaf.
     */
    public YangUInt16 getPrimaryResultValue() throws JNCException {
        return (YangUInt16)getValue("primary-result");
    }

    /**
     * Sets the value for child leaf "primary-result",
     * using instance of generated typedef class.
     * @param primaryResultValue The value to set.
     * @param primaryResultValue used during instantiation.
     */
    public void setPrimaryResultValue(YangUInt16 primaryResultValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "primary-result",
            primaryResultValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "primary-result",
     * using Java primitive values.
     * @param primaryResultValue used during instantiation.
     */
    public void setPrimaryResultValue(int primaryResultValue)
            throws JNCException {
        setPrimaryResultValue(new YangUInt16(primaryResultValue));
    }

    /**
     * Sets the value for child leaf "primary-result",
     * using a String value.
     * @param primaryResultValue used during instantiation.
     */
    public void setPrimaryResultValue(String primaryResultValue)
            throws JNCException {
        setPrimaryResultValue(new YangUInt16(primaryResultValue));
    }

    /**
     * Unsets the value for child leaf "primary-result".
     */
    public void unsetPrimaryResultValue() throws JNCException {
        delete("primary-result");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "primary-result" leaf will not have a value.
     */
    public void addPrimaryResult() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "primary-result",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "primary-result" with operation "replace".
     */
    public void markPrimaryResultReplace() throws JNCException {
        markLeafReplace("primaryResult");
    }

    /**
     * Marks the leaf "primary-result" with operation "merge".
     */
    public void markPrimaryResultMerge() throws JNCException {
        markLeafMerge("primaryResult");
    }

    /**
     * Marks the leaf "primary-result" with operation "create".
     */
    public void markPrimaryResultCreate() throws JNCException {
        markLeafCreate("primaryResult");
    }

    /**
     * Marks the leaf "primary-result" with operation "delete".
     */
    public void markPrimaryResultDelete() throws JNCException {
        markLeafDelete("primaryResult");
    }

    /* Access methods for optional leaf child: "secondary-result". */

    /**
     * Gets the value for child leaf "secondary-result".
     * @return The value of the leaf.
     */
    public YangUInt16 getSecondaryResultValue() throws JNCException {
        return (YangUInt16)getValue("secondary-result");
    }

    /**
     * Sets the value for child leaf "secondary-result",
     * using instance of generated typedef class.
     * @param secondaryResultValue The value to set.
     * @param secondaryResultValue used during instantiation.
     */
    public void setSecondaryResultValue(YangUInt16 secondaryResultValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "secondary-result",
            secondaryResultValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "secondary-result",
     * using Java primitive values.
     * @param secondaryResultValue used during instantiation.
     */
    public void setSecondaryResultValue(int secondaryResultValue)
            throws JNCException {
        setSecondaryResultValue(new YangUInt16(secondaryResultValue));
    }

    /**
     * Sets the value for child leaf "secondary-result",
     * using a String value.
     * @param secondaryResultValue used during instantiation.
     */
    public void setSecondaryResultValue(String secondaryResultValue)
            throws JNCException {
        setSecondaryResultValue(new YangUInt16(secondaryResultValue));
    }

    /**
     * Unsets the value for child leaf "secondary-result".
     */
    public void unsetSecondaryResultValue() throws JNCException {
        delete("secondary-result");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "secondary-result" leaf will not have a value.
     */
    public void addSecondaryResult() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "secondary-result",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "secondary-result" with operation "replace".
     */
    public void markSecondaryResultReplace() throws JNCException {
        markLeafReplace("secondaryResult");
    }

    /**
     * Marks the leaf "secondary-result" with operation "merge".
     */
    public void markSecondaryResultMerge() throws JNCException {
        markLeafMerge("secondaryResult");
    }

    /**
     * Marks the leaf "secondary-result" with operation "create".
     */
    public void markSecondaryResultCreate() throws JNCException {
        markLeafCreate("secondaryResult");
    }

    /**
     * Marks the leaf "secondary-result" with operation "delete".
     */
    public void markSecondaryResultDelete() throws JNCException {
        markLeafDelete("secondaryResult");
    }

    /* Access methods for optional leaf child: "global-title-indicator". */

    /**
     * Gets the value for child leaf "global-title-indicator".
     * @return The value of the leaf.
     */
    public YangEnumeration getGlobalTitleIndicatorValue() throws JNCException {
        YangEnumeration globalTitleIndicator = (YangEnumeration)getValue("global-title-indicator");
        if (globalTitleIndicator == null) {
            globalTitleIndicator = new YangEnumeration("gti0", new String[] {  // default
                "gti0",
                "gti1",
                "gti2",
                "gti3",
                "gti4",
            });
        }
        return globalTitleIndicator;
    }

    /**
     * Sets the value for child leaf "global-title-indicator",
     * using instance of generated typedef class.
     * @param globalTitleIndicatorValue The value to set.
     * @param globalTitleIndicatorValue used during instantiation.
     */
    public void setGlobalTitleIndicatorValue(YangEnumeration globalTitleIndicatorValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "global-title-indicator",
            globalTitleIndicatorValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "global-title-indicator",
     * using a String value.
     * @param globalTitleIndicatorValue used during instantiation.
     */
    public void setGlobalTitleIndicatorValue(String globalTitleIndicatorValue)
            throws JNCException {
        setGlobalTitleIndicatorValue(new YangEnumeration(globalTitleIndicatorValue, new String[] {
             "gti0",
             "gti1",
             "gti2",
             "gti3",
             "gti4",
        }));
    }

    /**
     * Unsets the value for child leaf "global-title-indicator".
     */
    public void unsetGlobalTitleIndicatorValue() throws JNCException {
        delete("global-title-indicator");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "global-title-indicator" leaf will not have a value.
     */
    public void addGlobalTitleIndicator() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "global-title-indicator",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "global-title-indicator" with operation "replace".
     */
    public void markGlobalTitleIndicatorReplace() throws JNCException {
        markLeafReplace("globalTitleIndicator");
    }

    /**
     * Marks the leaf "global-title-indicator" with operation "merge".
     */
    public void markGlobalTitleIndicatorMerge() throws JNCException {
        markLeafMerge("globalTitleIndicator");
    }

    /**
     * Marks the leaf "global-title-indicator" with operation "create".
     */
    public void markGlobalTitleIndicatorCreate() throws JNCException {
        markLeafCreate("globalTitleIndicator");
    }

    /**
     * Marks the leaf "global-title-indicator" with operation "delete".
     */
    public void markGlobalTitleIndicatorDelete() throws JNCException {
        markLeafDelete("globalTitleIndicator");
    }

    /* Access methods for optional leaf child: "translation-type". */

    /**
     * Gets the value for child leaf "translation-type".
     * @return The value of the leaf.
     */
    public YangUInt8 getTranslationTypeValue() throws JNCException {
        YangUInt8 translationType = (YangUInt8)getValue("translation-type");
        if (translationType == null) {
            translationType = new YangUInt8("0");  // default
        }
        return translationType;
    }

    /**
     * Sets the value for child leaf "translation-type",
     * using instance of generated typedef class.
     * @param translationTypeValue The value to set.
     * @param translationTypeValue used during instantiation.
     */
    public void setTranslationTypeValue(YangUInt8 translationTypeValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "translation-type",
            translationTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "translation-type",
     * using Java primitive values.
     * @param translationTypeValue used during instantiation.
     */
    public void setTranslationTypeValue(short translationTypeValue)
            throws JNCException {
        setTranslationTypeValue(new YangUInt8(translationTypeValue));
    }

    /**
     * Sets the value for child leaf "translation-type",
     * using a String value.
     * @param translationTypeValue used during instantiation.
     */
    public void setTranslationTypeValue(String translationTypeValue)
            throws JNCException {
        setTranslationTypeValue(new YangUInt8(translationTypeValue));
    }

    /**
     * Unsets the value for child leaf "translation-type".
     */
    public void unsetTranslationTypeValue() throws JNCException {
        delete("translation-type");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "translation-type" leaf will not have a value.
     */
    public void addTranslationType() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "translation-type",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "translation-type" with operation "replace".
     */
    public void markTranslationTypeReplace() throws JNCException {
        markLeafReplace("translationType");
    }

    /**
     * Marks the leaf "translation-type" with operation "merge".
     */
    public void markTranslationTypeMerge() throws JNCException {
        markLeafMerge("translationType");
    }

    /**
     * Marks the leaf "translation-type" with operation "create".
     */
    public void markTranslationTypeCreate() throws JNCException {
        markLeafCreate("translationType");
    }

    /**
     * Marks the leaf "translation-type" with operation "delete".
     */
    public void markTranslationTypeDelete() throws JNCException {
        markLeafDelete("translationType");
    }

    /* Access methods for optional leaf child: "numbering-plan". */

    /**
     * Gets the value for child leaf "numbering-plan".
     * @return The value of the leaf.
     */
    public YangUInt8 getNumberingPlanValue() throws JNCException {
        YangUInt8 numberingPlan = (YangUInt8)getValue("numbering-plan");
        if (numberingPlan == null) {
            numberingPlan = new YangUInt8("0");  // default
        }
        return numberingPlan;
    }

    /**
     * Sets the value for child leaf "numbering-plan",
     * using instance of generated typedef class.
     * @param numberingPlanValue The value to set.
     * @param numberingPlanValue used during instantiation.
     */
    public void setNumberingPlanValue(YangUInt8 numberingPlanValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "numbering-plan",
            numberingPlanValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "numbering-plan",
     * using Java primitive values.
     * @param numberingPlanValue used during instantiation.
     */
    public void setNumberingPlanValue(short numberingPlanValue)
            throws JNCException {
        setNumberingPlanValue(new YangUInt8(numberingPlanValue));
    }

    /**
     * Sets the value for child leaf "numbering-plan",
     * using a String value.
     * @param numberingPlanValue used during instantiation.
     */
    public void setNumberingPlanValue(String numberingPlanValue)
            throws JNCException {
        setNumberingPlanValue(new YangUInt8(numberingPlanValue));
    }

    /**
     * Unsets the value for child leaf "numbering-plan".
     */
    public void unsetNumberingPlanValue() throws JNCException {
        delete("numbering-plan");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "numbering-plan" leaf will not have a value.
     */
    public void addNumberingPlan() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "numbering-plan",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "numbering-plan" with operation "replace".
     */
    public void markNumberingPlanReplace() throws JNCException {
        markLeafReplace("numberingPlan");
    }

    /**
     * Marks the leaf "numbering-plan" with operation "merge".
     */
    public void markNumberingPlanMerge() throws JNCException {
        markLeafMerge("numberingPlan");
    }

    /**
     * Marks the leaf "numbering-plan" with operation "create".
     */
    public void markNumberingPlanCreate() throws JNCException {
        markLeafCreate("numberingPlan");
    }

    /**
     * Marks the leaf "numbering-plan" with operation "delete".
     */
    public void markNumberingPlanDelete() throws JNCException {
        markLeafDelete("numberingPlan");
    }

    /* Access methods for optional leaf child: "nature-of-addr-indicator". */

    /**
     * Gets the value for child leaf "nature-of-addr-indicator".
     * @return The value of the leaf.
     */
    public YangUInt8 getNatureOfAddrIndicatorValue() throws JNCException {
        YangUInt8 natureOfAddrIndicator = (YangUInt8)getValue("nature-of-addr-indicator");
        if (natureOfAddrIndicator == null) {
            natureOfAddrIndicator = new YangUInt8("0");  // default
        }
        return natureOfAddrIndicator;
    }

    /**
     * Sets the value for child leaf "nature-of-addr-indicator",
     * using instance of generated typedef class.
     * @param natureOfAddrIndicatorValue The value to set.
     * @param natureOfAddrIndicatorValue used during instantiation.
     */
    public void setNatureOfAddrIndicatorValue(YangUInt8 natureOfAddrIndicatorValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "nature-of-addr-indicator",
            natureOfAddrIndicatorValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "nature-of-addr-indicator",
     * using Java primitive values.
     * @param natureOfAddrIndicatorValue used during instantiation.
     */
    public void setNatureOfAddrIndicatorValue(short natureOfAddrIndicatorValue)
            throws JNCException {
        setNatureOfAddrIndicatorValue(new YangUInt8(natureOfAddrIndicatorValue));
    }

    /**
     * Sets the value for child leaf "nature-of-addr-indicator",
     * using a String value.
     * @param natureOfAddrIndicatorValue used during instantiation.
     */
    public void setNatureOfAddrIndicatorValue(String natureOfAddrIndicatorValue)
            throws JNCException {
        setNatureOfAddrIndicatorValue(new YangUInt8(natureOfAddrIndicatorValue));
    }

    /**
     * Unsets the value for child leaf "nature-of-addr-indicator".
     */
    public void unsetNatureOfAddrIndicatorValue() throws JNCException {
        delete("nature-of-addr-indicator");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "nature-of-addr-indicator" leaf will not have a value.
     */
    public void addNatureOfAddrIndicator() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "nature-of-addr-indicator",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "nature-of-addr-indicator" with operation "replace".
     */
    public void markNatureOfAddrIndicatorReplace() throws JNCException {
        markLeafReplace("natureOfAddrIndicator");
    }

    /**
     * Marks the leaf "nature-of-addr-indicator" with operation "merge".
     */
    public void markNatureOfAddrIndicatorMerge() throws JNCException {
        markLeafMerge("natureOfAddrIndicator");
    }

    /**
     * Marks the leaf "nature-of-addr-indicator" with operation "create".
     */
    public void markNatureOfAddrIndicatorCreate() throws JNCException {
        markLeafCreate("natureOfAddrIndicator");
    }

    /**
     * Marks the leaf "nature-of-addr-indicator" with operation "delete".
     */
    public void markNatureOfAddrIndicatorDelete() throws JNCException {
        markLeafDelete("natureOfAddrIndicator");
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