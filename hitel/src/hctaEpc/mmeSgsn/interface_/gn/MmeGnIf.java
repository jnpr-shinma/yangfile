/* 
 * @(#)MmeGnIf.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.gn;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/gn/mme-gn-if"
 * <p>
 * See line 248 in
 * upmConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class MmeGnIf extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty MmeGnIf object.
     */
    public MmeGnIf() {
        super(Epc.NAMESPACE, "mme-gn-if");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MmeGnIf clone() {
        return (MmeGnIf)cloneContent(new MmeGnIf());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MmeGnIf cloneShallow() {
        return (MmeGnIf)cloneShallowContent(new MmeGnIf());
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
            "gn-tunnel-profile",
            "pdp-downselect-version",
        };
    }

    /* Access methods for optional leaf child: "gn-tunnel-profile". */

    /**
     * Gets the value for child leaf "gn-tunnel-profile".
     * @return The value of the leaf.
     */
    public YangString getGnTunnelProfileValue() throws JNCException {
        return (YangString)getValue("gn-tunnel-profile");
    }

    /**
     * Sets the value for child leaf "gn-tunnel-profile",
     * using instance of generated typedef class.
     * @param gnTunnelProfileValue The value to set.
     * @param gnTunnelProfileValue used during instantiation.
     */
    public void setGnTunnelProfileValue(YangString gnTunnelProfileValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "gn-tunnel-profile",
            gnTunnelProfileValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "gn-tunnel-profile",
     * using a String value.
     * @param gnTunnelProfileValue used during instantiation.
     */
    public void setGnTunnelProfileValue(String gnTunnelProfileValue)
            throws JNCException {
        setGnTunnelProfileValue(new YangString(gnTunnelProfileValue));
    }

    /**
     * Unsets the value for child leaf "gn-tunnel-profile".
     */
    public void unsetGnTunnelProfileValue() throws JNCException {
        delete("gn-tunnel-profile");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "gn-tunnel-profile" leaf will not have a value.
     */
    public void addGnTunnelProfile() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "gn-tunnel-profile",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "gn-tunnel-profile" with operation "replace".
     */
    public void markGnTunnelProfileReplace() throws JNCException {
        markLeafReplace("gnTunnelProfile");
    }

    /**
     * Marks the leaf "gn-tunnel-profile" with operation "merge".
     */
    public void markGnTunnelProfileMerge() throws JNCException {
        markLeafMerge("gnTunnelProfile");
    }

    /**
     * Marks the leaf "gn-tunnel-profile" with operation "create".
     */
    public void markGnTunnelProfileCreate() throws JNCException {
        markLeafCreate("gnTunnelProfile");
    }

    /**
     * Marks the leaf "gn-tunnel-profile" with operation "delete".
     */
    public void markGnTunnelProfileDelete() throws JNCException {
        markLeafDelete("gnTunnelProfile");
    }

    /* Access methods for optional leaf child: "pdp-downselect-version". */

    /**
     * Gets the value for child leaf "pdp-downselect-version".
     * @return The value of the leaf.
     */
    public YangEnumeration getPdpDownselectVersionValue() throws JNCException {
        YangEnumeration pdpDownselectVersion = (YangEnumeration)getValue("pdp-downselect-version");
        if (pdpDownselectVersion == null) {
            pdpDownselectVersion = new YangEnumeration("ipv4", new String[] {  // default
                "ipv4",
                "ipv6",
                "ue-selected",
            });
        }
        return pdpDownselectVersion;
    }

    /**
     * Sets the value for child leaf "pdp-downselect-version",
     * using instance of generated typedef class.
     * @param pdpDownselectVersionValue The value to set.
     * @param pdpDownselectVersionValue used during instantiation.
     */
    public void setPdpDownselectVersionValue(YangEnumeration pdpDownselectVersionValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "pdp-downselect-version",
            pdpDownselectVersionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "pdp-downselect-version",
     * using a String value.
     * @param pdpDownselectVersionValue used during instantiation.
     */
    public void setPdpDownselectVersionValue(String pdpDownselectVersionValue)
            throws JNCException {
        setPdpDownselectVersionValue(new YangEnumeration(pdpDownselectVersionValue, new String[] {
             "ipv4",
             "ipv6",
             "ue-selected",
        }));
    }

    /**
     * Unsets the value for child leaf "pdp-downselect-version".
     */
    public void unsetPdpDownselectVersionValue() throws JNCException {
        delete("pdp-downselect-version");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "pdp-downselect-version" leaf will not have a value.
     */
    public void addPdpDownselectVersion() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "pdp-downselect-version",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "pdp-downselect-version" with operation "replace".
     */
    public void markPdpDownselectVersionReplace() throws JNCException {
        markLeafReplace("pdpDownselectVersion");
    }

    /**
     * Marks the leaf "pdp-downselect-version" with operation "merge".
     */
    public void markPdpDownselectVersionMerge() throws JNCException {
        markLeafMerge("pdpDownselectVersion");
    }

    /**
     * Marks the leaf "pdp-downselect-version" with operation "create".
     */
    public void markPdpDownselectVersionCreate() throws JNCException {
        markLeafCreate("pdpDownselectVersion");
    }

    /**
     * Marks the leaf "pdp-downselect-version" with operation "delete".
     */
    public void markPdpDownselectVersionDelete() throws JNCException {
        markLeafDelete("pdpDownselectVersion");
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
