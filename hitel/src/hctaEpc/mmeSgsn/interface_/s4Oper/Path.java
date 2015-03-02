/* 
 * @(#)Path.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_.s4Oper;
import .ietfInetTypes.IpAddress;

import Element;

import Epc;

import JNCException;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/s4Oper/path"
 * <p>
 * See line 462 in
 * upmCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Path extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Path object.
     */
    public Path() {
        super(Epc.NAMESPACE, "path");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Path clone() {
        return (Path)cloneContent(new Path());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Path cloneShallow() {
        return (Path)cloneShallowContent(new Path());
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
            "ip-address",
            "routing-instance",
            "status",
            "location",
            "service",
            "path-version",
        };
    }

    /* Access methods for optional leaf child: "ip-address". */

    /**
     * Gets the value for child leaf "ip-address".
     * @return The value of the leaf.
     */
    public IpAddress getIpAddressValue() throws JNCException {
        return (IpAddress)getValue("ip-address");
    }

    /**
     * Sets the value for child leaf "ip-address",
     * using a JNC type value.
     * @param ipAddressValue The value to set.
     * @param ipAddressValue used during instantiation.
     */
    public void setIpAddressValue(IpAddress ipAddressValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address",
            ipAddressValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ip-address",
     * using a String value.
     * @param ipAddressValue used during instantiation.
     */
    public void setIpAddressValue(String ipAddressValue) throws JNCException {
        setIpAddressValue(new IpAddress(ipAddressValue));
    }

    /**
     * Unsets the value for child leaf "ip-address".
     */
    public void unsetIpAddressValue() throws JNCException {
        delete("ip-address");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ip-address" leaf will not have a value.
     */
    public void addIpAddress() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "ip-address",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ip-address" with operation "replace".
     */
    public void markIpAddressReplace() throws JNCException {
        markLeafReplace("ipAddress");
    }

    /**
     * Marks the leaf "ip-address" with operation "merge".
     */
    public void markIpAddressMerge() throws JNCException {
        markLeafMerge("ipAddress");
    }

    /**
     * Marks the leaf "ip-address" with operation "create".
     */
    public void markIpAddressCreate() throws JNCException {
        markLeafCreate("ipAddress");
    }

    /**
     * Marks the leaf "ip-address" with operation "delete".
     */
    public void markIpAddressDelete() throws JNCException {
        markLeafDelete("ipAddress");
    }

    /* Access methods for optional leaf child: "routing-instance". */

    /**
     * Gets the value for child leaf "routing-instance".
     * @return The value of the leaf.
     */
    public YangString getRoutingInstanceValue() throws JNCException {
        return (YangString)getValue("routing-instance");
    }

    /**
     * Sets the value for child leaf "routing-instance",
     * using instance of generated typedef class.
     * @param routingInstanceValue The value to set.
     * @param routingInstanceValue used during instantiation.
     */
    public void setRoutingInstanceValue(YangString routingInstanceValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "routing-instance",
            routingInstanceValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "routing-instance",
     * using a String value.
     * @param routingInstanceValue used during instantiation.
     */
    public void setRoutingInstanceValue(String routingInstanceValue)
            throws JNCException {
        setRoutingInstanceValue(new YangString(routingInstanceValue));
    }

    /**
     * Unsets the value for child leaf "routing-instance".
     */
    public void unsetRoutingInstanceValue() throws JNCException {
        delete("routing-instance");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "routing-instance" leaf will not have a value.
     */
    public void addRoutingInstance() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "routing-instance",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "routing-instance" with operation "replace".
     */
    public void markRoutingInstanceReplace() throws JNCException {
        markLeafReplace("routingInstance");
    }

    /**
     * Marks the leaf "routing-instance" with operation "merge".
     */
    public void markRoutingInstanceMerge() throws JNCException {
        markLeafMerge("routingInstance");
    }

    /**
     * Marks the leaf "routing-instance" with operation "create".
     */
    public void markRoutingInstanceCreate() throws JNCException {
        markLeafCreate("routingInstance");
    }

    /**
     * Marks the leaf "routing-instance" with operation "delete".
     */
    public void markRoutingInstanceDelete() throws JNCException {
        markLeafDelete("routingInstance");
    }

    /* Access methods for optional leaf child: "status". */

    /**
     * Gets the value for child leaf "status".
     * @return The value of the leaf.
     */
    public YangString getStatusValue() throws JNCException {
        return (YangString)getValue("status");
    }

    /**
     * Sets the value for child leaf "status",
     * using instance of generated typedef class.
     * @param statusValue The value to set.
     * @param statusValue used during instantiation.
     */
    public void setStatusValue(YangString statusValue) throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "status",
            statusValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "status",
     * using a String value.
     * @param statusValue used during instantiation.
     */
    public void setStatusValue(String statusValue) throws JNCException {
        setStatusValue(new YangString(statusValue));
    }

    /**
     * Unsets the value for child leaf "status".
     */
    public void unsetStatusValue() throws JNCException {
        delete("status");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "status" leaf will not have a value.
     */
    public void addStatus() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "status",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "status" with operation "replace".
     */
    public void markStatusReplace() throws JNCException {
        markLeafReplace("status");
    }

    /**
     * Marks the leaf "status" with operation "merge".
     */
    public void markStatusMerge() throws JNCException {
        markLeafMerge("status");
    }

    /**
     * Marks the leaf "status" with operation "create".
     */
    public void markStatusCreate() throws JNCException {
        markLeafCreate("status");
    }

    /**
     * Marks the leaf "status" with operation "delete".
     */
    public void markStatusDelete() throws JNCException {
        markLeafDelete("status");
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

    /* Access methods for optional leaf child: "path-version". */

    /**
     * Gets the value for child leaf "path-version".
     * @return The value of the leaf.
     */
    public YangString getPathVersionValue() throws JNCException {
        return (YangString)getValue("path-version");
    }

    /**
     * Sets the value for child leaf "path-version",
     * using instance of generated typedef class.
     * @param pathVersionValue The value to set.
     * @param pathVersionValue used during instantiation.
     */
    public void setPathVersionValue(YangString pathVersionValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "path-version",
            pathVersionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "path-version",
     * using a String value.
     * @param pathVersionValue used during instantiation.
     */
    public void setPathVersionValue(String pathVersionValue)
            throws JNCException {
        setPathVersionValue(new YangString(pathVersionValue));
    }

    /**
     * Unsets the value for child leaf "path-version".
     */
    public void unsetPathVersionValue() throws JNCException {
        delete("path-version");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "path-version" leaf will not have a value.
     */
    public void addPathVersion() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "path-version",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "path-version" with operation "replace".
     */
    public void markPathVersionReplace() throws JNCException {
        markLeafReplace("pathVersion");
    }

    /**
     * Marks the leaf "path-version" with operation "merge".
     */
    public void markPathVersionMerge() throws JNCException {
        markLeafMerge("pathVersion");
    }

    /**
     * Marks the leaf "path-version" with operation "create".
     */
    public void markPathVersionCreate() throws JNCException {
        markLeafCreate("pathVersion");
    }

    /**
     * Marks the leaf "path-version" with operation "delete".
     */
    public void markPathVersionDelete() throws JNCException {
        markLeafDelete("pathVersion");
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
