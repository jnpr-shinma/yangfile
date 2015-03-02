/* 
 * @(#)MmeGmmCauseMapping.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.nas;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangEnumeration;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUnion;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/nas/mme-gmm-cause-mapping"
 * <p>
 * See line 570 in
 * sgsnScConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeGmmCauseMapping extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeGmmCauseMapping object.
     */
    public MmeGmmCauseMapping() {
        super(Epc.NAMESPACE, "mme-gmm-cause-mapping");
    }

    /**
     * Constructor for an initialized MmeGmmCauseMapping object,
     * 
     * @param errorValue Key argument of child.
     */
    public MmeGmmCauseMapping(YangEnumeration errorValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-gmm-cause-mapping");
        Leaf error = new Leaf(Epc.NAMESPACE, "error");
        error.setValue(errorValue);
        insertChild(error, childrenNames());
    }

    /**
     * Constructor for an initialized MmeGmmCauseMapping object,
     * with String keys.
     * @param errorValue Key argument of child.
     */
    public MmeGmmCauseMapping(String errorValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-gmm-cause-mapping");
        Leaf error = new Leaf(Epc.NAMESPACE, "error");
        error.setValue(new YangEnumeration(errorValue, new String [] {"system-failure", "data-missing", "unexpected-data-value", "unknown-subscriber", "unknown-scptn-no-gprs-data", "unknown-scptn-gprs-data", "unidentified-subscriber", "roaming-not-allowed-odb-vplmn", "roaming-not-allowed-odb-hplmn", "roaming-not-allowed-odb-all-apn", "roaming-not-allowed", "plmn-roaming-not-allowed", "operator-determined-barring", "illegal-subscriber", "illegal-equipment", "resource-limitation", "resource-unavailable", "provider-resource-limitation", "unknown-hlr-hss", "roaming-restricted-in-sgsn", "no-ipaddress-list-returned", "ptmsi-collision-attach-reject", "ptmsi-collision-rau-reject", "access-restriction-data", "user-unknown", "rat-not-allowed", "unable-to-comply", "authorization-rejected", "invalid-avp-value", "application-unsupported", "command-unsupported", "out-of-space", "too-busy", "unknown-serving-node", "roaming-restricted-in-mme-due-to-unsupported-feature", }));
        insertChild(error, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeGmmCauseMapping clone() {
        MmeGmmCauseMapping copy;
        try {
            copy = new MmeGmmCauseMapping(getErrorValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeGmmCauseMapping)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeGmmCauseMapping cloneShallow() {
        MmeGmmCauseMapping copy;
        try {
            copy = new MmeGmmCauseMapping(getErrorValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeGmmCauseMapping)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "error",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "error",
            "cause-code",
        };
    }

    /* Access methods for leaf child: "error". */

    /**
     * Gets the value for child leaf "error".
     * @return The value of the leaf.
     */
    public YangEnumeration getErrorValue() throws JNCException {
        return (YangEnumeration)getValue("error");
    }

    /**
     * Sets the value for child leaf "error",
     * using instance of generated typedef class.
     * @param errorValue The value to set.
     * @param errorValue used during instantiation.
     */
    public void setErrorValue(YangEnumeration errorValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "error",
            errorValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "error",
     * using a String value.
     * @param errorValue used during instantiation.
     */
    public void setErrorValue(String errorValue) throws JNCException {
        setErrorValue(new YangEnumeration(errorValue, new String[] {
             "system-failure",
             "data-missing",
             "unexpected-data-value",
             "unknown-subscriber",
             "unknown-scptn-no-gprs-data",
             "unknown-scptn-gprs-data",
             "unidentified-subscriber",
             "roaming-not-allowed-odb-vplmn",
             "roaming-not-allowed-odb-hplmn",
             "roaming-not-allowed-odb-all-apn",
             "roaming-not-allowed",
             "plmn-roaming-not-allowed",
             "operator-determined-barring",
             "illegal-subscriber",
             "illegal-equipment",
             "resource-limitation",
             "resource-unavailable",
             "provider-resource-limitation",
             "unknown-hlr-hss",
             "roaming-restricted-in-sgsn",
             "no-ipaddress-list-returned",
             "ptmsi-collision-attach-reject",
             "ptmsi-collision-rau-reject",
             "access-restriction-data",
             "user-unknown",
             "rat-not-allowed",
             "unable-to-comply",
             "authorization-rejected",
             "invalid-avp-value",
             "application-unsupported",
             "command-unsupported",
             "out-of-space",
             "too-busy",
             "unknown-serving-node",
             "roaming-restricted-in-mme-due-to-unsupported-feature",
        }));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "error" leaf will not have a value.
     */
    public void addError() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "error",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "cause-code". */

    /**
     * Gets the value for child leaf "cause-code".
     * @return The value of the leaf.
     */
    public YangUnion getCauseCodeValue() throws JNCException {
        return (YangUnion)getValue("cause-code");
    }

    /**
     * Sets the value for child leaf "cause-code",
     * using instance of generated typedef class.
     * @param causeCodeValue The value to set.
     * @param causeCodeValue used during instantiation.
     */
    public void setCauseCodeValue(YangUnion causeCodeValue) throws JNCException {
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
        setCauseCodeValue(new YangUnion(causeCodeValue, new String[] {
             "com.tailf.jnc.YangString",
             "com.tailf.jnc.YangEnumeration",
        }));
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
