/* 
 * @(#)S1MmeAssociationOper.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.fgw.interface_.s1;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt32;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/fgw/interface_/s1/s1-mme-association-oper"
 * <p>
 * See line 42 in
 * fgwS1MmeCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class S1MmeAssociationOper extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty S1MmeAssociationOper object.
     */
    public S1MmeAssociationOper() {
        super(Epc.NAMESPACE, "s1-mme-association-oper");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public S1MmeAssociationOper clone() {
        return (S1MmeAssociationOper)cloneContent(new S1MmeAssociationOper());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public S1MmeAssociationOper cloneShallow() {
        return (S1MmeAssociationOper)cloneShallowContent(new S1MmeAssociationOper());
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
            "mme-name",
            "location",
            "process-pid",
            "overload-state",
            "relative-capacity",
            "gummei-plmn-list",
            "gummei-group-id-list",
            "gummei-mme-code-list",
            "status-str",
        };
    }

    /* Access methods for optional leaf child: "mme-name". */

    /**
     * Gets the value for child leaf "mme-name".
     * @return The value of the leaf.
     */
    public YangString getMmeNameValue() throws JNCException {
        return (YangString)getValue("mme-name");
    }

    /**
     * Sets the value for child leaf "mme-name",
     * using instance of generated typedef class.
     * @param mmeNameValue The value to set.
     * @param mmeNameValue used during instantiation.
     */
    public void setMmeNameValue(YangString mmeNameValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "mme-name",
            mmeNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "mme-name",
     * using a String value.
     * @param mmeNameValue used during instantiation.
     */
    public void setMmeNameValue(String mmeNameValue) throws JNCException {
        setMmeNameValue(new YangString(mmeNameValue));
    }

    /**
     * Unsets the value for child leaf "mme-name".
     */
    public void unsetMmeNameValue() throws JNCException {
        delete("mme-name");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "mme-name" leaf will not have a value.
     */
    public void addMmeName() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "mme-name",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "mme-name" with operation "replace".
     */
    public void markMmeNameReplace() throws JNCException {
        markLeafReplace("mmeName");
    }

    /**
     * Marks the leaf "mme-name" with operation "merge".
     */
    public void markMmeNameMerge() throws JNCException {
        markLeafMerge("mmeName");
    }

    /**
     * Marks the leaf "mme-name" with operation "create".
     */
    public void markMmeNameCreate() throws JNCException {
        markLeafCreate("mmeName");
    }

    /**
     * Marks the leaf "mme-name" with operation "delete".
     */
    public void markMmeNameDelete() throws JNCException {
        markLeafDelete("mmeName");
    }

    /* Access methods for optional leaf child: "location". */

    /**
     * Gets the value for child leaf "location".
     * @return The value of the leaf.
     */
    public YangString getLocationValue() throws JNCException {
        return (YangString)getValue("location");
    }

    /**
     * Sets the value for child leaf "location",
     * using instance of generated typedef class.
     * @param locationValue The value to set.
     * @param locationValue used during instantiation.
     */
    public void setLocationValue(YangString locationValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "location",
            locationValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "location",
     * using a String value.
     * @param locationValue used during instantiation.
     */
    public void setLocationValue(String locationValue) throws JNCException {
        setLocationValue(new YangString(locationValue));
    }

    /**
     * Unsets the value for child leaf "location".
     */
    public void unsetLocationValue() throws JNCException {
        delete("location");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "location" leaf will not have a value.
     */
    public void addLocation() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "location",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "location" with operation "replace".
     */
    public void markLocationReplace() throws JNCException {
        markLeafReplace("location");
    }

    /**
     * Marks the leaf "location" with operation "merge".
     */
    public void markLocationMerge() throws JNCException {
        markLeafMerge("location");
    }

    /**
     * Marks the leaf "location" with operation "create".
     */
    public void markLocationCreate() throws JNCException {
        markLeafCreate("location");
    }

    /**
     * Marks the leaf "location" with operation "delete".
     */
    public void markLocationDelete() throws JNCException {
        markLeafDelete("location");
    }

    /* Access methods for optional leaf child: "process-pid". */

    /**
     * Gets the value for child leaf "process-pid".
     * @return The value of the leaf.
     */
    public YangUInt32 getProcessPidValue() throws JNCException {
        return (YangUInt32)getValue("process-pid");
    }

    /**
     * Sets the value for child leaf "process-pid",
     * using instance of generated typedef class.
     * @param processPidValue The value to set.
     * @param processPidValue used during instantiation.
     */
    public void setProcessPidValue(YangUInt32 processPidValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "process-pid",
            processPidValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "process-pid",
     * using Java primitive values.
     * @param processPidValue used during instantiation.
     */
    public void setProcessPidValue(long processPidValue) throws JNCException {
        setProcessPidValue(new YangUInt32(processPidValue));
    }

    /**
     * Sets the value for child leaf "process-pid",
     * using a String value.
     * @param processPidValue used during instantiation.
     */
    public void setProcessPidValue(String processPidValue) throws JNCException {
        setProcessPidValue(new YangUInt32(processPidValue));
    }

    /**
     * Unsets the value for child leaf "process-pid".
     */
    public void unsetProcessPidValue() throws JNCException {
        delete("process-pid");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "process-pid" leaf will not have a value.
     */
    public void addProcessPid() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "process-pid",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "process-pid" with operation "replace".
     */
    public void markProcessPidReplace() throws JNCException {
        markLeafReplace("processPid");
    }

    /**
     * Marks the leaf "process-pid" with operation "merge".
     */
    public void markProcessPidMerge() throws JNCException {
        markLeafMerge("processPid");
    }

    /**
     * Marks the leaf "process-pid" with operation "create".
     */
    public void markProcessPidCreate() throws JNCException {
        markLeafCreate("processPid");
    }

    /**
     * Marks the leaf "process-pid" with operation "delete".
     */
    public void markProcessPidDelete() throws JNCException {
        markLeafDelete("processPid");
    }

    /* Access methods for optional leaf child: "overload-state". */

    /**
     * Gets the value for child leaf "overload-state".
     * @return The value of the leaf.
     */
    public YangString getOverloadStateValue() throws JNCException {
        return (YangString)getValue("overload-state");
    }

    /**
     * Sets the value for child leaf "overload-state",
     * using instance of generated typedef class.
     * @param overloadStateValue The value to set.
     * @param overloadStateValue used during instantiation.
     */
    public void setOverloadStateValue(YangString overloadStateValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "overload-state",
            overloadStateValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "overload-state",
     * using a String value.
     * @param overloadStateValue used during instantiation.
     */
    public void setOverloadStateValue(String overloadStateValue)
            throws JNCException {
        setOverloadStateValue(new YangString(overloadStateValue));
    }

    /**
     * Unsets the value for child leaf "overload-state".
     */
    public void unsetOverloadStateValue() throws JNCException {
        delete("overload-state");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "overload-state" leaf will not have a value.
     */
    public void addOverloadState() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "overload-state",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "overload-state" with operation "replace".
     */
    public void markOverloadStateReplace() throws JNCException {
        markLeafReplace("overloadState");
    }

    /**
     * Marks the leaf "overload-state" with operation "merge".
     */
    public void markOverloadStateMerge() throws JNCException {
        markLeafMerge("overloadState");
    }

    /**
     * Marks the leaf "overload-state" with operation "create".
     */
    public void markOverloadStateCreate() throws JNCException {
        markLeafCreate("overloadState");
    }

    /**
     * Marks the leaf "overload-state" with operation "delete".
     */
    public void markOverloadStateDelete() throws JNCException {
        markLeafDelete("overloadState");
    }

    /* Access methods for optional leaf child: "relative-capacity". */

    /**
     * Gets the value for child leaf "relative-capacity".
     * @return The value of the leaf.
     */
    public YangUInt32 getRelativeCapacityValue() throws JNCException {
        return (YangUInt32)getValue("relative-capacity");
    }

    /**
     * Sets the value for child leaf "relative-capacity",
     * using instance of generated typedef class.
     * @param relativeCapacityValue The value to set.
     * @param relativeCapacityValue used during instantiation.
     */
    public void setRelativeCapacityValue(YangUInt32 relativeCapacityValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "relative-capacity",
            relativeCapacityValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "relative-capacity",
     * using Java primitive values.
     * @param relativeCapacityValue used during instantiation.
     */
    public void setRelativeCapacityValue(long relativeCapacityValue)
            throws JNCException {
        setRelativeCapacityValue(new YangUInt32(relativeCapacityValue));
    }

    /**
     * Sets the value for child leaf "relative-capacity",
     * using a String value.
     * @param relativeCapacityValue used during instantiation.
     */
    public void setRelativeCapacityValue(String relativeCapacityValue)
            throws JNCException {
        setRelativeCapacityValue(new YangUInt32(relativeCapacityValue));
    }

    /**
     * Unsets the value for child leaf "relative-capacity".
     */
    public void unsetRelativeCapacityValue() throws JNCException {
        delete("relative-capacity");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "relative-capacity" leaf will not have a value.
     */
    public void addRelativeCapacity() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "relative-capacity",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "relative-capacity" with operation "replace".
     */
    public void markRelativeCapacityReplace() throws JNCException {
        markLeafReplace("relativeCapacity");
    }

    /**
     * Marks the leaf "relative-capacity" with operation "merge".
     */
    public void markRelativeCapacityMerge() throws JNCException {
        markLeafMerge("relativeCapacity");
    }

    /**
     * Marks the leaf "relative-capacity" with operation "create".
     */
    public void markRelativeCapacityCreate() throws JNCException {
        markLeafCreate("relativeCapacity");
    }

    /**
     * Marks the leaf "relative-capacity" with operation "delete".
     */
    public void markRelativeCapacityDelete() throws JNCException {
        markLeafDelete("relativeCapacity");
    }

    /* Access methods for optional leaf child: "gummei-plmn-list". */

    /**
     * Gets the value for child leaf "gummei-plmn-list".
     * @return The value of the leaf.
     */
    public YangString getGummeiPlmnListValue() throws JNCException {
        return (YangString)getValue("gummei-plmn-list");
    }

    /**
     * Sets the value for child leaf "gummei-plmn-list",
     * using instance of generated typedef class.
     * @param gummeiPlmnListValue The value to set.
     * @param gummeiPlmnListValue used during instantiation.
     */
    public void setGummeiPlmnListValue(YangString gummeiPlmnListValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "gummei-plmn-list",
            gummeiPlmnListValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "gummei-plmn-list",
     * using a String value.
     * @param gummeiPlmnListValue used during instantiation.
     */
    public void setGummeiPlmnListValue(String gummeiPlmnListValue)
            throws JNCException {
        setGummeiPlmnListValue(new YangString(gummeiPlmnListValue));
    }

    /**
     * Unsets the value for child leaf "gummei-plmn-list".
     */
    public void unsetGummeiPlmnListValue() throws JNCException {
        delete("gummei-plmn-list");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "gummei-plmn-list" leaf will not have a value.
     */
    public void addGummeiPlmnList() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "gummei-plmn-list",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "gummei-plmn-list" with operation "replace".
     */
    public void markGummeiPlmnListReplace() throws JNCException {
        markLeafReplace("gummeiPlmnList");
    }

    /**
     * Marks the leaf "gummei-plmn-list" with operation "merge".
     */
    public void markGummeiPlmnListMerge() throws JNCException {
        markLeafMerge("gummeiPlmnList");
    }

    /**
     * Marks the leaf "gummei-plmn-list" with operation "create".
     */
    public void markGummeiPlmnListCreate() throws JNCException {
        markLeafCreate("gummeiPlmnList");
    }

    /**
     * Marks the leaf "gummei-plmn-list" with operation "delete".
     */
    public void markGummeiPlmnListDelete() throws JNCException {
        markLeafDelete("gummeiPlmnList");
    }

    /* Access methods for optional leaf child: "gummei-group-id-list". */

    /**
     * Gets the value for child leaf "gummei-group-id-list".
     * @return The value of the leaf.
     */
    public YangString getGummeiGroupIdListValue() throws JNCException {
        return (YangString)getValue("gummei-group-id-list");
    }

    /**
     * Sets the value for child leaf "gummei-group-id-list",
     * using instance of generated typedef class.
     * @param gummeiGroupIdListValue The value to set.
     * @param gummeiGroupIdListValue used during instantiation.
     */
    public void setGummeiGroupIdListValue(YangString gummeiGroupIdListValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "gummei-group-id-list",
            gummeiGroupIdListValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "gummei-group-id-list",
     * using a String value.
     * @param gummeiGroupIdListValue used during instantiation.
     */
    public void setGummeiGroupIdListValue(String gummeiGroupIdListValue)
            throws JNCException {
        setGummeiGroupIdListValue(new YangString(gummeiGroupIdListValue));
    }

    /**
     * Unsets the value for child leaf "gummei-group-id-list".
     */
    public void unsetGummeiGroupIdListValue() throws JNCException {
        delete("gummei-group-id-list");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "gummei-group-id-list" leaf will not have a value.
     */
    public void addGummeiGroupIdList() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "gummei-group-id-list",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "gummei-group-id-list" with operation "replace".
     */
    public void markGummeiGroupIdListReplace() throws JNCException {
        markLeafReplace("gummeiGroupIdList");
    }

    /**
     * Marks the leaf "gummei-group-id-list" with operation "merge".
     */
    public void markGummeiGroupIdListMerge() throws JNCException {
        markLeafMerge("gummeiGroupIdList");
    }

    /**
     * Marks the leaf "gummei-group-id-list" with operation "create".
     */
    public void markGummeiGroupIdListCreate() throws JNCException {
        markLeafCreate("gummeiGroupIdList");
    }

    /**
     * Marks the leaf "gummei-group-id-list" with operation "delete".
     */
    public void markGummeiGroupIdListDelete() throws JNCException {
        markLeafDelete("gummeiGroupIdList");
    }

    /* Access methods for optional leaf child: "gummei-mme-code-list". */

    /**
     * Gets the value for child leaf "gummei-mme-code-list".
     * @return The value of the leaf.
     */
    public YangString getGummeiMmeCodeListValue() throws JNCException {
        return (YangString)getValue("gummei-mme-code-list");
    }

    /**
     * Sets the value for child leaf "gummei-mme-code-list",
     * using instance of generated typedef class.
     * @param gummeiMmeCodeListValue The value to set.
     * @param gummeiMmeCodeListValue used during instantiation.
     */
    public void setGummeiMmeCodeListValue(YangString gummeiMmeCodeListValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "gummei-mme-code-list",
            gummeiMmeCodeListValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "gummei-mme-code-list",
     * using a String value.
     * @param gummeiMmeCodeListValue used during instantiation.
     */
    public void setGummeiMmeCodeListValue(String gummeiMmeCodeListValue)
            throws JNCException {
        setGummeiMmeCodeListValue(new YangString(gummeiMmeCodeListValue));
    }

    /**
     * Unsets the value for child leaf "gummei-mme-code-list".
     */
    public void unsetGummeiMmeCodeListValue() throws JNCException {
        delete("gummei-mme-code-list");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "gummei-mme-code-list" leaf will not have a value.
     */
    public void addGummeiMmeCodeList() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "gummei-mme-code-list",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "gummei-mme-code-list" with operation "replace".
     */
    public void markGummeiMmeCodeListReplace() throws JNCException {
        markLeafReplace("gummeiMmeCodeList");
    }

    /**
     * Marks the leaf "gummei-mme-code-list" with operation "merge".
     */
    public void markGummeiMmeCodeListMerge() throws JNCException {
        markLeafMerge("gummeiMmeCodeList");
    }

    /**
     * Marks the leaf "gummei-mme-code-list" with operation "create".
     */
    public void markGummeiMmeCodeListCreate() throws JNCException {
        markLeafCreate("gummeiMmeCodeList");
    }

    /**
     * Marks the leaf "gummei-mme-code-list" with operation "delete".
     */
    public void markGummeiMmeCodeListDelete() throws JNCException {
        markLeafDelete("gummeiMmeCodeList");
    }

    /* Access methods for optional leaf child: "status-str". */

    /**
     * Gets the value for child leaf "status-str".
     * @return The value of the leaf.
     */
    public YangString getStatusStrValue() throws JNCException {
        return (YangString)getValue("status-str");
    }

    /**
     * Sets the value for child leaf "status-str",
     * using instance of generated typedef class.
     * @param statusStrValue The value to set.
     * @param statusStrValue used during instantiation.
     */
    public void setStatusStrValue(YangString statusStrValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "status-str",
            statusStrValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "status-str",
     * using a String value.
     * @param statusStrValue used during instantiation.
     */
    public void setStatusStrValue(String statusStrValue) throws JNCException {
        setStatusStrValue(new YangString(statusStrValue));
    }

    /**
     * Unsets the value for child leaf "status-str".
     */
    public void unsetStatusStrValue() throws JNCException {
        delete("status-str");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "status-str" leaf will not have a value.
     */
    public void addStatusStr() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "status-str",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "status-str" with operation "replace".
     */
    public void markStatusStrReplace() throws JNCException {
        markLeafReplace("statusStr");
    }

    /**
     * Marks the leaf "status-str" with operation "merge".
     */
    public void markStatusStrMerge() throws JNCException {
        markLeafMerge("statusStr");
    }

    /**
     * Marks the leaf "status-str" with operation "create".
     */
    public void markStatusStrCreate() throws JNCException {
        markLeafCreate("statusStr");
    }

    /**
     * Marks the leaf "status-str" with operation "delete".
     */
    public void markStatusStrDelete() throws JNCException {
        markLeafDelete("statusStr");
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
