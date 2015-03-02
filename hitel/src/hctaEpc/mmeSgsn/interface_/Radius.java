/* 
 * @(#)Radius.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_;
import .ietfInetTypes.IpAddress;

import Element;

import ElementChildrenIterator;

import Epc;

import JNCException;

import MmeRadiusPeer;

import MmeRadiusProfile;

import NodeSet;

import PeerAction;

import RadiusPeerOper;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/radius"
 * <p>
 * See line 22 in
 * upsmConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Radius extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "mme-radius-profile".
     */
    public MmeRadiusProfile mmeRadiusProfile = null;

    /**
     * Field for child container "peer-action".
     */
    public PeerAction peerAction = null;

    /**
     * Constructor for an empty Radius object.
     */
    public Radius() {
        super(Epc.NAMESPACE, "radius");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Radius clone() {
        return (Radius)cloneContent(new Radius());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Radius cloneShallow() {
        return (Radius)cloneShallowContent(new Radius());
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
            "mme-radius-profile",
            "mme-radius-peer",
            "radius-peer-oper",
            "peer-action",
        };
    }

    /* Access methods for container child: "mme-radius-profile". */

    /**
     * Adds container entry "mmeRadiusProfile", using an existing object.
     * @param mmeRadiusProfile The object to add.
     * @return The added child.
     */
    public MmeRadiusProfile addMmeRadiusProfile(MmeRadiusProfile mmeRadiusProfile)
            throws JNCException {
        this.mmeRadiusProfile = mmeRadiusProfile;
        insertChild(mmeRadiusProfile, childrenNames());
        return mmeRadiusProfile;
    }

    /**
     * Adds container entry "mmeRadiusProfile".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeRadiusProfile addMmeRadiusProfile() throws JNCException {
        MmeRadiusProfile mmeRadiusProfile = new MmeRadiusProfile();
        this.mmeRadiusProfile = mmeRadiusProfile;
        insertChild(mmeRadiusProfile, childrenNames());
        return mmeRadiusProfile;
    }

    /**
     * Deletes container entry "mmeRadiusProfile".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeRadiusProfile() throws JNCException {
        this.mmeRadiusProfile = null;
        String path = "mme-radius-profile";
        return delete(path);
    }

    /* Access methods for list child: "mme-radius-peer". */

    /**
     * Gets list entry "mmeRadiusPeer", with specified keys.
     * @param ipAddressValue Key argument of child.
     */
    public MmeRadiusPeer getMmeRadiusPeer(IpAddress ipAddressValue)
            throws JNCException {
        String path = "mme-radius-peer[ipAddress='" + ipAddressValue + "']";
        return (MmeRadiusPeer)searchOne(path);
    }

    /**
     * Gets list entry "mmeRadiusPeer", with specified keys.
     * The keys are specified as strings.
     * @param ipAddressValue Key argument of child.
     */
    public MmeRadiusPeer getMmeRadiusPeer(String ipAddressValue)
            throws JNCException {
        String path = "mme-radius-peer[ipAddress='" + ipAddressValue + "']";
        return (MmeRadiusPeer)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-radius-peer".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeRadiusPeerIterator() {
        return new ElementChildrenIterator(children, "mme-radius-peer");
    }

    /**
     * Adds list entry "mmeRadiusPeer", using an existing object.
     * @param mmeRadiusPeer The object to add.
     * @return The added child.
     */
    public MmeRadiusPeer addMmeRadiusPeer(MmeRadiusPeer mmeRadiusPeer)
            throws JNCException {
        insertChild(mmeRadiusPeer, childrenNames());
        return mmeRadiusPeer;
    }

    /**
     * Adds list entry "mmeRadiusPeer", with specified keys.
     * @param ipAddressValue Key argument of child.
     * @return The added child.
     */
    public MmeRadiusPeer addMmeRadiusPeer(IpAddress ipAddressValue)
            throws JNCException {
        MmeRadiusPeer mmeRadiusPeer = new MmeRadiusPeer(ipAddressValue);
        return addMmeRadiusPeer(mmeRadiusPeer);
    }

    /**
     * Adds list entry "mmeRadiusPeer", with specified keys.
     * The keys are specified as strings.
     * @param ipAddressValue Key argument of child.
     * @return The added child.
     */
    public MmeRadiusPeer addMmeRadiusPeer(String ipAddressValue)
            throws JNCException {
        MmeRadiusPeer mmeRadiusPeer = new MmeRadiusPeer(ipAddressValue);
        return addMmeRadiusPeer(mmeRadiusPeer);
    }

    /**
     * Adds list entry "mmeRadiusPeer".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeRadiusPeer addMmeRadiusPeer() throws JNCException {
        MmeRadiusPeer mmeRadiusPeer = new MmeRadiusPeer();
        insertChild(mmeRadiusPeer, childrenNames());
        return mmeRadiusPeer;
    }

    /**
     * Deletes list entry "mmeRadiusPeer", with specified keys.
     * @param ipAddressValue Key argument of child.
     */
    public void deleteMmeRadiusPeer(IpAddress ipAddressValue)
            throws JNCException {
        String path = "mme-radius-peer[ipAddress='" + ipAddressValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeRadiusPeer", with specified keys.
     * The keys are specified as strings.
     * @param ipAddressValue Key argument of child.
     */
    public void deleteMmeRadiusPeer(String ipAddressValue) throws JNCException {
        String path = "mme-radius-peer[ipAddress='" + ipAddressValue + "']";
        delete(path);
    }

    /* Access methods for list child: "radius-peer-oper". */

    /**
     * Gets list entry "radiusPeerOper", with specified keys.
     */
    public RadiusPeerOper getRadiusPeerOper() throws JNCException {
        String path = "radius-peer-oper";
        return (RadiusPeerOper)searchOne(path);
    }

    /**
     * Iterator method for the list "radius-peer-oper".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator radiusPeerOperIterator() {
        return new ElementChildrenIterator(children, "radius-peer-oper");
    }

    /**
     * Adds list entry "radiusPeerOper", using an existing object.
     * @param radiusPeerOper The object to add.
     * @return The added child.
     */
    public RadiusPeerOper addRadiusPeerOper(RadiusPeerOper radiusPeerOper)
            throws JNCException {
        insertChild(radiusPeerOper, childrenNames());
        return radiusPeerOper;
    }

    /**
     * Adds list entry "radiusPeerOper".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public RadiusPeerOper addRadiusPeerOper() throws JNCException {
        RadiusPeerOper radiusPeerOper = new RadiusPeerOper();
        insertChild(radiusPeerOper, childrenNames());
        return radiusPeerOper;
    }

    /**
     * Deletes list entry "radiusPeerOper", with specified keys.
     */
    public void deleteRadiusPeerOper() throws JNCException {
        String path = "radius-peer-oper";
        delete(path);
    }

    /* Access methods for container child: "peer-action". */

    /**
     * Adds container entry "peerAction", using an existing object.
     * @param peerAction The object to add.
     * @return The added child.
     */
    public PeerAction addPeerAction(PeerAction peerAction) throws JNCException {
        this.peerAction = peerAction;
        insertChild(peerAction, childrenNames());
        return peerAction;
    }

    /**
     * Adds container entry "peerAction".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public PeerAction addPeerAction() throws JNCException {
        PeerAction peerAction = new PeerAction();
        this.peerAction = peerAction;
        insertChild(peerAction, childrenNames());
        return peerAction;
    }

    /**
     * Deletes container entry "peerAction".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deletePeerAction() throws JNCException {
        this.peerAction = null;
        String path = "peer-action";
        return delete(path);
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof MmeRadiusProfile) mmeRadiusProfile = (MmeRadiusProfile)child;
        else if (child instanceof PeerAction) peerAction = (PeerAction)child;
    }

}