/* 
 * @(#)Gprs.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.status;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt32;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/status/gprs"
 * <p>
 * See line 44 in
 * sgsnScCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Gprs extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Gprs object.
     */
    public Gprs() {
        super(Epc.NAMESPACE, "gprs");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Gprs clone() {
        return (Gprs)cloneContent(new Gprs());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Gprs cloneShallow() {
        return (Gprs)cloneShallowContent(new Gprs());
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
            "service",
            "location",
            "current-subscribers",
            "current-pdp-contexts",
            "attach-success-rate-nwk",
            "attach-success-rate-nodal",
            "session-act-success-rate-nwk",
            "session-act-success-rate-nodal",
            "pdp-retainability-nwk",
            "rau-success-rate-nwk",
            "irau-success-rate-nwk",
        };
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

    /* Access methods for optional leaf child: "current-subscribers". */

    /**
     * Gets the value for child leaf "current-subscribers".
     * @return The value of the leaf.
     */
    public YangUInt32 getCurrentSubscribersValue() throws JNCException {
        return (YangUInt32)getValue("current-subscribers");
    }

    /**
     * Sets the value for child leaf "current-subscribers",
     * using instance of generated typedef class.
     * @param currentSubscribersValue The value to set.
     * @param currentSubscribersValue used during instantiation.
     */
    public void setCurrentSubscribersValue(YangUInt32 currentSubscribersValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "current-subscribers",
            currentSubscribersValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "current-subscribers",
     * using Java primitive values.
     * @param currentSubscribersValue used during instantiation.
     */
    public void setCurrentSubscribersValue(long currentSubscribersValue)
            throws JNCException {
        setCurrentSubscribersValue(new YangUInt32(currentSubscribersValue));
    }

    /**
     * Sets the value for child leaf "current-subscribers",
     * using a String value.
     * @param currentSubscribersValue used during instantiation.
     */
    public void setCurrentSubscribersValue(String currentSubscribersValue)
            throws JNCException {
        setCurrentSubscribersValue(new YangUInt32(currentSubscribersValue));
    }

    /**
     * Unsets the value for child leaf "current-subscribers".
     */
    public void unsetCurrentSubscribersValue() throws JNCException {
        delete("current-subscribers");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "current-subscribers" leaf will not have a value.
     */
    public void addCurrentSubscribers() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "current-subscribers",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "current-subscribers" with operation "replace".
     */
    public void markCurrentSubscribersReplace() throws JNCException {
        markLeafReplace("currentSubscribers");
    }

    /**
     * Marks the leaf "current-subscribers" with operation "merge".
     */
    public void markCurrentSubscribersMerge() throws JNCException {
        markLeafMerge("currentSubscribers");
    }

    /**
     * Marks the leaf "current-subscribers" with operation "create".
     */
    public void markCurrentSubscribersCreate() throws JNCException {
        markLeafCreate("currentSubscribers");
    }

    /**
     * Marks the leaf "current-subscribers" with operation "delete".
     */
    public void markCurrentSubscribersDelete() throws JNCException {
        markLeafDelete("currentSubscribers");
    }

    /* Access methods for optional leaf child: "current-pdp-contexts". */

    /**
     * Gets the value for child leaf "current-pdp-contexts".
     * @return The value of the leaf.
     */
    public YangUInt32 getCurrentPdpContextsValue() throws JNCException {
        return (YangUInt32)getValue("current-pdp-contexts");
    }

    /**
     * Sets the value for child leaf "current-pdp-contexts",
     * using instance of generated typedef class.
     * @param currentPdpContextsValue The value to set.
     * @param currentPdpContextsValue used during instantiation.
     */
    public void setCurrentPdpContextsValue(YangUInt32 currentPdpContextsValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "current-pdp-contexts",
            currentPdpContextsValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "current-pdp-contexts",
     * using Java primitive values.
     * @param currentPdpContextsValue used during instantiation.
     */
    public void setCurrentPdpContextsValue(long currentPdpContextsValue)
            throws JNCException {
        setCurrentPdpContextsValue(new YangUInt32(currentPdpContextsValue));
    }

    /**
     * Sets the value for child leaf "current-pdp-contexts",
     * using a String value.
     * @param currentPdpContextsValue used during instantiation.
     */
    public void setCurrentPdpContextsValue(String currentPdpContextsValue)
            throws JNCException {
        setCurrentPdpContextsValue(new YangUInt32(currentPdpContextsValue));
    }

    /**
     * Unsets the value for child leaf "current-pdp-contexts".
     */
    public void unsetCurrentPdpContextsValue() throws JNCException {
        delete("current-pdp-contexts");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "current-pdp-contexts" leaf will not have a value.
     */
    public void addCurrentPdpContexts() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "current-pdp-contexts",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "current-pdp-contexts" with operation "replace".
     */
    public void markCurrentPdpContextsReplace() throws JNCException {
        markLeafReplace("currentPdpContexts");
    }

    /**
     * Marks the leaf "current-pdp-contexts" with operation "merge".
     */
    public void markCurrentPdpContextsMerge() throws JNCException {
        markLeafMerge("currentPdpContexts");
    }

    /**
     * Marks the leaf "current-pdp-contexts" with operation "create".
     */
    public void markCurrentPdpContextsCreate() throws JNCException {
        markLeafCreate("currentPdpContexts");
    }

    /**
     * Marks the leaf "current-pdp-contexts" with operation "delete".
     */
    public void markCurrentPdpContextsDelete() throws JNCException {
        markLeafDelete("currentPdpContexts");
    }

    /* Access methods for optional leaf child: "attach-success-rate-nwk". */

    /**
     * Gets the value for child leaf "attach-success-rate-nwk".
     * @return The value of the leaf.
     */
    public YangUInt32 getAttachSuccessRateNwkValue() throws JNCException {
        return (YangUInt32)getValue("attach-success-rate-nwk");
    }

    /**
     * Sets the value for child leaf "attach-success-rate-nwk",
     * using instance of generated typedef class.
     * @param attachSuccessRateNwkValue The value to set.
     * @param attachSuccessRateNwkValue used during instantiation.
     */
    public void setAttachSuccessRateNwkValue(YangUInt32 attachSuccessRateNwkValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "attach-success-rate-nwk",
            attachSuccessRateNwkValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "attach-success-rate-nwk",
     * using Java primitive values.
     * @param attachSuccessRateNwkValue used during instantiation.
     */
    public void setAttachSuccessRateNwkValue(long attachSuccessRateNwkValue)
            throws JNCException {
        setAttachSuccessRateNwkValue(new YangUInt32(attachSuccessRateNwkValue));
    }

    /**
     * Sets the value for child leaf "attach-success-rate-nwk",
     * using a String value.
     * @param attachSuccessRateNwkValue used during instantiation.
     */
    public void setAttachSuccessRateNwkValue(String attachSuccessRateNwkValue)
            throws JNCException {
        setAttachSuccessRateNwkValue(new YangUInt32(attachSuccessRateNwkValue));
    }

    /**
     * Unsets the value for child leaf "attach-success-rate-nwk".
     */
    public void unsetAttachSuccessRateNwkValue() throws JNCException {
        delete("attach-success-rate-nwk");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "attach-success-rate-nwk" leaf will not have a value.
     */
    public void addAttachSuccessRateNwk() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "attach-success-rate-nwk",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "attach-success-rate-nwk" with operation "replace".
     */
    public void markAttachSuccessRateNwkReplace() throws JNCException {
        markLeafReplace("attachSuccessRateNwk");
    }

    /**
     * Marks the leaf "attach-success-rate-nwk" with operation "merge".
     */
    public void markAttachSuccessRateNwkMerge() throws JNCException {
        markLeafMerge("attachSuccessRateNwk");
    }

    /**
     * Marks the leaf "attach-success-rate-nwk" with operation "create".
     */
    public void markAttachSuccessRateNwkCreate() throws JNCException {
        markLeafCreate("attachSuccessRateNwk");
    }

    /**
     * Marks the leaf "attach-success-rate-nwk" with operation "delete".
     */
    public void markAttachSuccessRateNwkDelete() throws JNCException {
        markLeafDelete("attachSuccessRateNwk");
    }

    /* Access methods for optional leaf child: "attach-success-rate-nodal". */

    /**
     * Gets the value for child leaf "attach-success-rate-nodal".
     * @return The value of the leaf.
     */
    public YangUInt32 getAttachSuccessRateNodalValue() throws JNCException {
        return (YangUInt32)getValue("attach-success-rate-nodal");
    }

    /**
     * Sets the value for child leaf "attach-success-rate-nodal",
     * using instance of generated typedef class.
     * @param attachSuccessRateNodalValue The value to set.
     * @param attachSuccessRateNodalValue used during instantiation.
     */
    public void setAttachSuccessRateNodalValue(YangUInt32 attachSuccessRateNodalValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "attach-success-rate-nodal",
            attachSuccessRateNodalValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "attach-success-rate-nodal",
     * using Java primitive values.
     * @param attachSuccessRateNodalValue used during instantiation.
     */
    public void setAttachSuccessRateNodalValue(long attachSuccessRateNodalValue)
            throws JNCException {
        setAttachSuccessRateNodalValue(new YangUInt32(attachSuccessRateNodalValue));
    }

    /**
     * Sets the value for child leaf "attach-success-rate-nodal",
     * using a String value.
     * @param attachSuccessRateNodalValue used during instantiation.
     */
    public void setAttachSuccessRateNodalValue(String attachSuccessRateNodalValue)
            throws JNCException {
        setAttachSuccessRateNodalValue(new YangUInt32(attachSuccessRateNodalValue));
    }

    /**
     * Unsets the value for child leaf "attach-success-rate-nodal".
     */
    public void unsetAttachSuccessRateNodalValue() throws JNCException {
        delete("attach-success-rate-nodal");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "attach-success-rate-nodal" leaf will not have a value.
     */
    public void addAttachSuccessRateNodal() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "attach-success-rate-nodal",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "attach-success-rate-nodal" with operation "replace".
     */
    public void markAttachSuccessRateNodalReplace() throws JNCException {
        markLeafReplace("attachSuccessRateNodal");
    }

    /**
     * Marks the leaf "attach-success-rate-nodal" with operation "merge".
     */
    public void markAttachSuccessRateNodalMerge() throws JNCException {
        markLeafMerge("attachSuccessRateNodal");
    }

    /**
     * Marks the leaf "attach-success-rate-nodal" with operation "create".
     */
    public void markAttachSuccessRateNodalCreate() throws JNCException {
        markLeafCreate("attachSuccessRateNodal");
    }

    /**
     * Marks the leaf "attach-success-rate-nodal" with operation "delete".
     */
    public void markAttachSuccessRateNodalDelete() throws JNCException {
        markLeafDelete("attachSuccessRateNodal");
    }

    /* Access methods for optional leaf child: "session-act-success-rate-nwk". */

    /**
     * Gets the value for child leaf "session-act-success-rate-nwk".
     * @return The value of the leaf.
     */
    public YangUInt32 getSessionActSuccessRateNwkValue() throws JNCException {
        return (YangUInt32)getValue("session-act-success-rate-nwk");
    }

    /**
     * Sets the value for child leaf "session-act-success-rate-nwk",
     * using instance of generated typedef class.
     * @param sessionActSuccessRateNwkValue The value to set.
     * @param sessionActSuccessRateNwkValue used during instantiation.
     */
    public void setSessionActSuccessRateNwkValue(YangUInt32 sessionActSuccessRateNwkValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "session-act-success-rate-nwk",
            sessionActSuccessRateNwkValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "session-act-success-rate-nwk",
     * using Java primitive values.
     * @param sessionActSuccessRateNwkValue used during instantiation.
     */
    public void setSessionActSuccessRateNwkValue(long sessionActSuccessRateNwkValue)
            throws JNCException {
        setSessionActSuccessRateNwkValue(new YangUInt32(sessionActSuccessRateNwkValue));
    }

    /**
     * Sets the value for child leaf "session-act-success-rate-nwk",
     * using a String value.
     * @param sessionActSuccessRateNwkValue used during instantiation.
     */
    public void setSessionActSuccessRateNwkValue(String sessionActSuccessRateNwkValue)
            throws JNCException {
        setSessionActSuccessRateNwkValue(new YangUInt32(sessionActSuccessRateNwkValue));
    }

    /**
     * Unsets the value for child leaf "session-act-success-rate-nwk".
     */
    public void unsetSessionActSuccessRateNwkValue() throws JNCException {
        delete("session-act-success-rate-nwk");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "session-act-success-rate-nwk" leaf will not have a value.
     */
    public void addSessionActSuccessRateNwk() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "session-act-success-rate-nwk",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "session-act-success-rate-nwk" with operation "replace".
     */
    public void markSessionActSuccessRateNwkReplace() throws JNCException {
        markLeafReplace("sessionActSuccessRateNwk");
    }

    /**
     * Marks the leaf "session-act-success-rate-nwk" with operation "merge".
     */
    public void markSessionActSuccessRateNwkMerge() throws JNCException {
        markLeafMerge("sessionActSuccessRateNwk");
    }

    /**
     * Marks the leaf "session-act-success-rate-nwk" with operation "create".
     */
    public void markSessionActSuccessRateNwkCreate() throws JNCException {
        markLeafCreate("sessionActSuccessRateNwk");
    }

    /**
     * Marks the leaf "session-act-success-rate-nwk" with operation "delete".
     */
    public void markSessionActSuccessRateNwkDelete() throws JNCException {
        markLeafDelete("sessionActSuccessRateNwk");
    }

    /* Access methods for optional leaf child: "session-act-success-rate-nodal". */

    /**
     * Gets the value for child leaf "session-act-success-rate-nodal".
     * @return The value of the leaf.
     */
    public YangUInt32 getSessionActSuccessRateNodalValue() throws JNCException {
        return (YangUInt32)getValue("session-act-success-rate-nodal");
    }

    /**
     * Sets the value for child leaf "session-act-success-rate-nodal",
     * using instance of generated typedef class.
     * @param sessionActSuccessRateNodalValue The value to set.
     * @param sessionActSuccessRateNodalValue used during instantiation.
     */
    public void setSessionActSuccessRateNodalValue(YangUInt32 sessionActSuccessRateNodalValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "session-act-success-rate-nodal",
            sessionActSuccessRateNodalValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "session-act-success-rate-nodal",
     * using Java primitive values.
     * @param sessionActSuccessRateNodalValue used during instantiation.
     */
    public void setSessionActSuccessRateNodalValue(long sessionActSuccessRateNodalValue)
            throws JNCException {
        setSessionActSuccessRateNodalValue(new YangUInt32(sessionActSuccessRateNodalValue));
    }

    /**
     * Sets the value for child leaf "session-act-success-rate-nodal",
     * using a String value.
     * @param sessionActSuccessRateNodalValue used during instantiation.
     */
    public void setSessionActSuccessRateNodalValue(String sessionActSuccessRateNodalValue)
            throws JNCException {
        setSessionActSuccessRateNodalValue(new YangUInt32(sessionActSuccessRateNodalValue));
    }

    /**
     * Unsets the value for child leaf "session-act-success-rate-nodal".
     */
    public void unsetSessionActSuccessRateNodalValue() throws JNCException {
        delete("session-act-success-rate-nodal");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "session-act-success-rate-nodal" leaf will not have a value.
     */
    public void addSessionActSuccessRateNodal() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "session-act-success-rate-nodal",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "session-act-success-rate-nodal" with operation "replace".
     */
    public void markSessionActSuccessRateNodalReplace() throws JNCException {
        markLeafReplace("sessionActSuccessRateNodal");
    }

    /**
     * Marks the leaf "session-act-success-rate-nodal" with operation "merge".
     */
    public void markSessionActSuccessRateNodalMerge() throws JNCException {
        markLeafMerge("sessionActSuccessRateNodal");
    }

    /**
     * Marks the leaf "session-act-success-rate-nodal" with operation "create".
     */
    public void markSessionActSuccessRateNodalCreate() throws JNCException {
        markLeafCreate("sessionActSuccessRateNodal");
    }

    /**
     * Marks the leaf "session-act-success-rate-nodal" with operation "delete".
     */
    public void markSessionActSuccessRateNodalDelete() throws JNCException {
        markLeafDelete("sessionActSuccessRateNodal");
    }

    /* Access methods for optional leaf child: "pdp-retainability-nwk". */

    /**
     * Gets the value for child leaf "pdp-retainability-nwk".
     * @return The value of the leaf.
     */
    public YangUInt32 getPdpRetainabilityNwkValue() throws JNCException {
        return (YangUInt32)getValue("pdp-retainability-nwk");
    }

    /**
     * Sets the value for child leaf "pdp-retainability-nwk",
     * using instance of generated typedef class.
     * @param pdpRetainabilityNwkValue The value to set.
     * @param pdpRetainabilityNwkValue used during instantiation.
     */
    public void setPdpRetainabilityNwkValue(YangUInt32 pdpRetainabilityNwkValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "pdp-retainability-nwk",
            pdpRetainabilityNwkValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "pdp-retainability-nwk",
     * using Java primitive values.
     * @param pdpRetainabilityNwkValue used during instantiation.
     */
    public void setPdpRetainabilityNwkValue(long pdpRetainabilityNwkValue)
            throws JNCException {
        setPdpRetainabilityNwkValue(new YangUInt32(pdpRetainabilityNwkValue));
    }

    /**
     * Sets the value for child leaf "pdp-retainability-nwk",
     * using a String value.
     * @param pdpRetainabilityNwkValue used during instantiation.
     */
    public void setPdpRetainabilityNwkValue(String pdpRetainabilityNwkValue)
            throws JNCException {
        setPdpRetainabilityNwkValue(new YangUInt32(pdpRetainabilityNwkValue));
    }

    /**
     * Unsets the value for child leaf "pdp-retainability-nwk".
     */
    public void unsetPdpRetainabilityNwkValue() throws JNCException {
        delete("pdp-retainability-nwk");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "pdp-retainability-nwk" leaf will not have a value.
     */
    public void addPdpRetainabilityNwk() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "pdp-retainability-nwk",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "pdp-retainability-nwk" with operation "replace".
     */
    public void markPdpRetainabilityNwkReplace() throws JNCException {
        markLeafReplace("pdpRetainabilityNwk");
    }

    /**
     * Marks the leaf "pdp-retainability-nwk" with operation "merge".
     */
    public void markPdpRetainabilityNwkMerge() throws JNCException {
        markLeafMerge("pdpRetainabilityNwk");
    }

    /**
     * Marks the leaf "pdp-retainability-nwk" with operation "create".
     */
    public void markPdpRetainabilityNwkCreate() throws JNCException {
        markLeafCreate("pdpRetainabilityNwk");
    }

    /**
     * Marks the leaf "pdp-retainability-nwk" with operation "delete".
     */
    public void markPdpRetainabilityNwkDelete() throws JNCException {
        markLeafDelete("pdpRetainabilityNwk");
    }

    /* Access methods for optional leaf child: "rau-success-rate-nwk". */

    /**
     * Gets the value for child leaf "rau-success-rate-nwk".
     * @return The value of the leaf.
     */
    public YangUInt32 getRauSuccessRateNwkValue() throws JNCException {
        return (YangUInt32)getValue("rau-success-rate-nwk");
    }

    /**
     * Sets the value for child leaf "rau-success-rate-nwk",
     * using instance of generated typedef class.
     * @param rauSuccessRateNwkValue The value to set.
     * @param rauSuccessRateNwkValue used during instantiation.
     */
    public void setRauSuccessRateNwkValue(YangUInt32 rauSuccessRateNwkValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "rau-success-rate-nwk",
            rauSuccessRateNwkValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "rau-success-rate-nwk",
     * using Java primitive values.
     * @param rauSuccessRateNwkValue used during instantiation.
     */
    public void setRauSuccessRateNwkValue(long rauSuccessRateNwkValue)
            throws JNCException {
        setRauSuccessRateNwkValue(new YangUInt32(rauSuccessRateNwkValue));
    }

    /**
     * Sets the value for child leaf "rau-success-rate-nwk",
     * using a String value.
     * @param rauSuccessRateNwkValue used during instantiation.
     */
    public void setRauSuccessRateNwkValue(String rauSuccessRateNwkValue)
            throws JNCException {
        setRauSuccessRateNwkValue(new YangUInt32(rauSuccessRateNwkValue));
    }

    /**
     * Unsets the value for child leaf "rau-success-rate-nwk".
     */
    public void unsetRauSuccessRateNwkValue() throws JNCException {
        delete("rau-success-rate-nwk");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "rau-success-rate-nwk" leaf will not have a value.
     */
    public void addRauSuccessRateNwk() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "rau-success-rate-nwk",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "rau-success-rate-nwk" with operation "replace".
     */
    public void markRauSuccessRateNwkReplace() throws JNCException {
        markLeafReplace("rauSuccessRateNwk");
    }

    /**
     * Marks the leaf "rau-success-rate-nwk" with operation "merge".
     */
    public void markRauSuccessRateNwkMerge() throws JNCException {
        markLeafMerge("rauSuccessRateNwk");
    }

    /**
     * Marks the leaf "rau-success-rate-nwk" with operation "create".
     */
    public void markRauSuccessRateNwkCreate() throws JNCException {
        markLeafCreate("rauSuccessRateNwk");
    }

    /**
     * Marks the leaf "rau-success-rate-nwk" with operation "delete".
     */
    public void markRauSuccessRateNwkDelete() throws JNCException {
        markLeafDelete("rauSuccessRateNwk");
    }

    /* Access methods for optional leaf child: "irau-success-rate-nwk". */

    /**
     * Gets the value for child leaf "irau-success-rate-nwk".
     * @return The value of the leaf.
     */
    public YangUInt32 getIrauSuccessRateNwkValue() throws JNCException {
        return (YangUInt32)getValue("irau-success-rate-nwk");
    }

    /**
     * Sets the value for child leaf "irau-success-rate-nwk",
     * using instance of generated typedef class.
     * @param irauSuccessRateNwkValue The value to set.
     * @param irauSuccessRateNwkValue used during instantiation.
     */
    public void setIrauSuccessRateNwkValue(YangUInt32 irauSuccessRateNwkValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "irau-success-rate-nwk",
            irauSuccessRateNwkValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "irau-success-rate-nwk",
     * using Java primitive values.
     * @param irauSuccessRateNwkValue used during instantiation.
     */
    public void setIrauSuccessRateNwkValue(long irauSuccessRateNwkValue)
            throws JNCException {
        setIrauSuccessRateNwkValue(new YangUInt32(irauSuccessRateNwkValue));
    }

    /**
     * Sets the value for child leaf "irau-success-rate-nwk",
     * using a String value.
     * @param irauSuccessRateNwkValue used during instantiation.
     */
    public void setIrauSuccessRateNwkValue(String irauSuccessRateNwkValue)
            throws JNCException {
        setIrauSuccessRateNwkValue(new YangUInt32(irauSuccessRateNwkValue));
    }

    /**
     * Unsets the value for child leaf "irau-success-rate-nwk".
     */
    public void unsetIrauSuccessRateNwkValue() throws JNCException {
        delete("irau-success-rate-nwk");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "irau-success-rate-nwk" leaf will not have a value.
     */
    public void addIrauSuccessRateNwk() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "irau-success-rate-nwk",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "irau-success-rate-nwk" with operation "replace".
     */
    public void markIrauSuccessRateNwkReplace() throws JNCException {
        markLeafReplace("irauSuccessRateNwk");
    }

    /**
     * Marks the leaf "irau-success-rate-nwk" with operation "merge".
     */
    public void markIrauSuccessRateNwkMerge() throws JNCException {
        markLeafMerge("irauSuccessRateNwk");
    }

    /**
     * Marks the leaf "irau-success-rate-nwk" with operation "create".
     */
    public void markIrauSuccessRateNwkCreate() throws JNCException {
        markLeafCreate("irauSuccessRateNwk");
    }

    /**
     * Marks the leaf "irau-success-rate-nwk" with operation "delete".
     */
    public void markIrauSuccessRateNwkDelete() throws JNCException {
        markLeafDelete("irauSuccessRateNwk");
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
