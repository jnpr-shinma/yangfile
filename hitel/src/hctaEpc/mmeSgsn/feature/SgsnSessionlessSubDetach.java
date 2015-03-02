/* 
 * @(#)SgsnSessionlessSubDetach.java        1.0 09/12/14
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
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/feature/sgsn-sessionless-sub-detach"
 * <p>
 * See line 439 in
 * featuresConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class SgsnSessionlessSubDetach extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty SgsnSessionlessSubDetach object.
     */
    public SgsnSessionlessSubDetach() {
        super(Epc.NAMESPACE, "sgsn-sessionless-sub-detach");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public SgsnSessionlessSubDetach clone() {
        return (SgsnSessionlessSubDetach)cloneContent(new SgsnSessionlessSubDetach());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public SgsnSessionlessSubDetach cloneShallow() {
        return (SgsnSessionlessSubDetach)cloneShallowContent(new SgsnSessionlessSubDetach());
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
            "cause-code",
            "apn-ni-list",
        };
    }

    /* Access methods for optional leaf child: "cause-code". */

    /**
     * Gets the value for child leaf "cause-code".
     * @return The value of the leaf.
     */
    public YangString getCauseCodeValue() throws JNCException {
        YangString causeCode = (YangString)getValue("cause-code");
        if (causeCode == null) {
            causeCode = new YangString("no-detach-msg");  // default
        }
        return causeCode;
    }

    /**
     * Sets the value for child leaf "cause-code",
     * using instance of generated typedef class.
     * @param causeCodeValue The value to set.
     * @param causeCodeValue used during instantiation.
     */
    public void setCauseCodeValue(YangString causeCodeValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "cause-code",
            causeCodeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "cause-code",
     * using a String value.
     * @param causeCodeValue used during instantiation.
     */
    public void setCauseCodeValue(String causeCodeValue) throws JNCException {
        setCauseCodeValue(new YangString(causeCodeValue));
    }

    /**
     * Unsets the value for child leaf "cause-code".
     */
    public void unsetCauseCodeValue() throws JNCException {
        delete("cause-code");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "cause-code" leaf will not have a value.
     */
    public void addCauseCode() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "cause-code",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "cause-code" with operation "replace".
     */
    public void markCauseCodeReplace() throws JNCException {
        markLeafReplace("causeCode");
    }

    /**
     * Marks the leaf "cause-code" with operation "merge".
     */
    public void markCauseCodeMerge() throws JNCException {
        markLeafMerge("causeCode");
    }

    /**
     * Marks the leaf "cause-code" with operation "create".
     */
    public void markCauseCodeCreate() throws JNCException {
        markLeafCreate("causeCode");
    }

    /**
     * Marks the leaf "cause-code" with operation "delete".
     */
    public void markCauseCodeDelete() throws JNCException {
        markLeafDelete("causeCode");
    }

    /* Access methods for optional leaf child: "apn-ni-list". */

    /**
     * Gets the value for child leaf "apn-ni-list".
     * @return The value of the leaf.
     */
    public YangString getApnNiListValue() throws JNCException {
        YangString apnNiList = (YangString)getValue("apn-ni-list");
        if (apnNiList == null) {
            apnNiList = new YangString("none");  // default
        }
        return apnNiList;
    }

    /**
     * Sets the value for child leaf "apn-ni-list",
     * using instance of generated typedef class.
     * @param apnNiListValue The value to set.
     * @param apnNiListValue used during instantiation.
     */
    public void setApnNiListValue(YangString apnNiListValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "apn-ni-list",
            apnNiListValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "apn-ni-list",
     * using a String value.
     * @param apnNiListValue used during instantiation.
     */
    public void setApnNiListValue(String apnNiListValue) throws JNCException {
        setApnNiListValue(new YangString(apnNiListValue));
    }

    /**
     * Unsets the value for child leaf "apn-ni-list".
     */
    public void unsetApnNiListValue() throws JNCException {
        delete("apn-ni-list");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "apn-ni-list" leaf will not have a value.
     */
    public void addApnNiList() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "apn-ni-list",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "apn-ni-list" with operation "replace".
     */
    public void markApnNiListReplace() throws JNCException {
        markLeafReplace("apnNiList");
    }

    /**
     * Marks the leaf "apn-ni-list" with operation "merge".
     */
    public void markApnNiListMerge() throws JNCException {
        markLeafMerge("apnNiList");
    }

    /**
     * Marks the leaf "apn-ni-list" with operation "create".
     */
    public void markApnNiListCreate() throws JNCException {
        markLeafCreate("apnNiList");
    }

    /**
     * Marks the leaf "apn-ni-list" with operation "delete".
     */
    public void markApnNiListDelete() throws JNCException {
        markLeafDelete("apnNiList");
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
