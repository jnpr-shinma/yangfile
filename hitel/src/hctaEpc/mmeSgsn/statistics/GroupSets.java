/* 
 * @(#)GroupSets.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.statistics;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/statistics/group-sets"
 * <p>
 * See line 82 in
 * oamPmServerCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class GroupSets extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty GroupSets object.
     */
    public GroupSets() {
        super(Epc.NAMESPACE, "group-sets");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public GroupSets clone() {
        return (GroupSets)cloneContent(new GroupSets());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public GroupSets cloneShallow() {
        return (GroupSets)cloneShallowContent(new GroupSets());
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
            "group-set",
            "service",
        };
    }

    /* Access methods for optional leaf child: "group-set". */

    /**
     * Gets the value for child leaf "group-set".
     * @return The value of the leaf.
     */
    public YangString getGroupSetValue() throws JNCException {
        return (YangString)getValue("group-set");
    }

    /**
     * Sets the value for child leaf "group-set",
     * using instance of generated typedef class.
     * @param groupSetValue The value to set.
     * @param groupSetValue used during instantiation.
     */
    public void setGroupSetValue(YangString groupSetValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "group-set",
            groupSetValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "group-set",
     * using a String value.
     * @param groupSetValue used during instantiation.
     */
    public void setGroupSetValue(String groupSetValue) throws JNCException {
        setGroupSetValue(new YangString(groupSetValue));
    }

    /**
     * Unsets the value for child leaf "group-set".
     */
    public void unsetGroupSetValue() throws JNCException {
        delete("group-set");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "group-set" leaf will not have a value.
     */
    public void addGroupSet() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "group-set",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "group-set" with operation "replace".
     */
    public void markGroupSetReplace() throws JNCException {
        markLeafReplace("groupSet");
    }

    /**
     * Marks the leaf "group-set" with operation "merge".
     */
    public void markGroupSetMerge() throws JNCException {
        markLeafMerge("groupSet");
    }

    /**
     * Marks the leaf "group-set" with operation "create".
     */
    public void markGroupSetCreate() throws JNCException {
        markLeafCreate("groupSet");
    }

    /**
     * Marks the leaf "group-set" with operation "delete".
     */
    public void markGroupSetDelete() throws JNCException {
        markLeafDelete("groupSet");
    }

    /* Access methods for optional leaf child: "service". */

    /**
     * Gets the value for child leaf "service".
     * @return The value of the leaf.
     */
    public YangString getServiceValue() throws JNCException {
        return (YangString)getValue("service");
    }

    /**
     * Sets the value for child leaf "service",
     * using instance of generated typedef class.
     * @param serviceValue The value to set.
     * @param serviceValue used during instantiation.
     */
    public void setServiceValue(YangString serviceValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "service",
            serviceValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "service",
     * using a String value.
     * @param serviceValue used during instantiation.
     */
    public void setServiceValue(String serviceValue) throws JNCException {
        setServiceValue(new YangString(serviceValue));
    }

    /**
     * Unsets the value for child leaf "service".
     */
    public void unsetServiceValue() throws JNCException {
        delete("service");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "service" leaf will not have a value.
     */
    public void addService() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "service",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "service" with operation "replace".
     */
    public void markServiceReplace() throws JNCException {
        markLeafReplace("service");
    }

    /**
     * Marks the leaf "service" with operation "merge".
     */
    public void markServiceMerge() throws JNCException {
        markLeafMerge("service");
    }

    /**
     * Marks the leaf "service" with operation "create".
     */
    public void markServiceCreate() throws JNCException {
        markLeafCreate("service");
    }

    /**
     * Marks the leaf "service" with operation "delete".
     */
    public void markServiceDelete() throws JNCException {
        markLeafDelete("service");
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