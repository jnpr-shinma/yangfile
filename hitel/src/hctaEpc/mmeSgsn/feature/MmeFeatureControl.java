/* 
 * @(#)MmeFeatureControl.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.feature;

import Element;

import Epc;

import JNCException;

import Leaf;

import YangEnumeration;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/feature/mme-feature-control"
 * <p>
 * See line 47 in
 * featuresConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeFeatureControl extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeFeatureControl object.
     */
    public MmeFeatureControl() {
        super(Epc.NAMESPACE, "mme-feature-control");
    }

    /**
     * Constructor for an initialized MmeFeatureControl object,
     * 
     * @param nameValue Key argument of child.
     */
    public MmeFeatureControl(YangEnumeration nameValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-feature-control");
        Leaf name = new Leaf(Epc.NAMESPACE, "name");
        name.setValue(nameValue);
        insertChild(name, childrenNames());
    }

    /**
     * Constructor for an initialized MmeFeatureControl object,
     * with String keys.
     * @param nameValue Key argument of child.
     */
    public MmeFeatureControl(String nameValue) throws JNCException {
        super(Epc.NAMESPACE, "mme-feature-control");
        Leaf name = new Leaf(Epc.NAMESPACE, "name");
        name.setValue(new YangEnumeration(nameValue, new String [] {"advanced-ta-mgmt", "direct-tunnel", "equip-id-check", "femto-cell-support", "fxa", "ge", "gs", "hspa-plus", "hss-npli", "ims-emergency", "lawful-intercept", "lcs", "local-eps-qos-control", "multimedia-priority-service", "mvno-pgw-type", "pcc-npli", "per-enb-stats", "per-fxa-peer-stats", "per-gtp-path-stats", "plmn-based-reporting-and-control", "ran-admission-control", "ran-info-management", "s101", "s102", "s4-sgsn", "sbc", "seamless-national-roaming", "sgs", "sgsn-sessionless-sub-detach", "srvcc", "trace", "traffic-shaping", "ue-purge", "ue-reachability", }));
        insertChild(name, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeFeatureControl clone() {
        MmeFeatureControl copy;
        try {
            copy = new MmeFeatureControl(getNameValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeFeatureControl)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeFeatureControl cloneShallow() {
        MmeFeatureControl copy;
        try {
            copy = new MmeFeatureControl(getNameValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (MmeFeatureControl)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "name",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "name",
            "status-field",
        };
    }

    /* Access methods for leaf child: "name". */

    /**
     * Gets the value for child leaf "name".
     * @return The value of the leaf.
     */
    public YangEnumeration getNameValue() throws JNCException {
        return (YangEnumeration)getValue("name");
    }

    /**
     * Sets the value for child leaf "name",
     * using instance of generated typedef class.
     * @param nameValue The value to set.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(YangEnumeration nameValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "name",
            nameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "name",
     * using a String value.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(String nameValue) throws JNCException {
        setNameValue(new YangEnumeration(nameValue, new String[] {
             "advanced-ta-mgmt",
             "direct-tunnel",
             "equip-id-check",
             "femto-cell-support",
             "fxa",
             "ge",
             "gs",
             "hspa-plus",
             "hss-npli",
             "ims-emergency",
             "lawful-intercept",
             "lcs",
             "local-eps-qos-control",
             "multimedia-priority-service",
             "mvno-pgw-type",
             "pcc-npli",
             "per-enb-stats",
             "per-fxa-peer-stats",
             "per-gtp-path-stats",
             "plmn-based-reporting-and-control",
             "ran-admission-control",
             "ran-info-management",
             "s101",
             "s102",
             "s4-sgsn",
             "sbc",
             "seamless-national-roaming",
             "sgs",
             "sgsn-sessionless-sub-detach",
             "srvcc",
             "trace",
             "traffic-shaping",
             "ue-purge",
             "ue-reachability",
        }));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "name" leaf will not have a value.
     */
    public void addName() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "name",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "status-field". */

    /**
     * Gets the value for child leaf "status-field".
     * @return The value of the leaf.
     */
    public YangEnumeration getStatusFieldValue() throws JNCException {
        YangEnumeration statusField = (YangEnumeration)getValue("status-field");
        if (statusField == null) {
            statusField = new YangEnumeration("off", new String[] {  // default
                "on",
                "off",
            });
        }
        return statusField;
    }

    /**
     * Sets the value for child leaf "status-field",
     * using instance of generated typedef class.
     * @param statusFieldValue The value to set.
     * @param statusFieldValue used during instantiation.
     */
    public void setStatusFieldValue(YangEnumeration statusFieldValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "status-field",
            statusFieldValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "status-field",
     * using a String value.
     * @param statusFieldValue used during instantiation.
     */
    public void setStatusFieldValue(String statusFieldValue)
            throws JNCException {
        setStatusFieldValue(new YangEnumeration(statusFieldValue, new String[] {
             "on",
             "off",
        }));
    }

    /**
     * Unsets the value for child leaf "status-field".
     */
    public void unsetStatusFieldValue() throws JNCException {
        delete("status-field");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "status-field" leaf will not have a value.
     */
    public void addStatusField() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "status-field",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "status-field" with operation "replace".
     */
    public void markStatusFieldReplace() throws JNCException {
        markLeafReplace("statusField");
    }

    /**
     * Marks the leaf "status-field" with operation "merge".
     */
    public void markStatusFieldMerge() throws JNCException {
        markLeafMerge("statusField");
    }

    /**
     * Marks the leaf "status-field" with operation "create".
     */
    public void markStatusFieldCreate() throws JNCException {
        markLeafCreate("statusField");
    }

    /**
     * Marks the leaf "status-field" with operation "delete".
     */
    public void markStatusFieldDelete() throws JNCException {
        markLeafDelete("statusField");
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
