/* 
 * @(#)S1.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.fgw.interface_;

import Element;

import ElementChildrenIterator;

import Enb;

import Epc;

import JNCException;

import MmeFgwS1Interface;

import MmeFgwS1InterfaceProfile;

import MmeS1MmeAssociation;

import MmeS1MmeAssociationProfile;

import MmeS1MmeIf;

import MmeS1MmePeer;

import NodeSet;

import S1MmeAssociationOper;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt16;
import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/fgw/interface_/s1"
 * <p>
 * See line 1252 in
 * s1MasterConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class S1 extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "mme-fgw-s1-interface-profile".
     */
    public MmeFgwS1InterfaceProfile mmeFgwS1InterfaceProfile = null;

    /**
     * Field for child container "mme-s1-mme-if".
     */
    public MmeS1MmeIf mmeS1MmeIf = null;

    /**
     * Constructor for an empty S1 object.
     */
    public S1() {
        super(Epc.NAMESPACE, "s1");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public S1 clone() {
        return (S1)cloneContent(new S1());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public S1 cloneShallow() {
        return (S1)cloneShallowContent(new S1());
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
            "mme-fgw-s1-interface",
            "mme-fgw-s1-interface-profile",
            "mme-s1-mme-if",
            "mme-s1-mme-peer",
            "mme-s1-mme-association",
            "mme-s1-mme-association-profile",
            "s1-mme-association-oper",
            "enb",
        };
    }

    /* Access methods for list child: "mme-fgw-s1-interface". */

    /**
     * Gets list entry "mmeFgwS1Interface", with specified keys.
     * @param callpServiceIdValue Key argument of child.
     */
    public MmeFgwS1Interface getMmeFgwS1Interface(YangUInt16 callpServiceIdValue)
            throws JNCException {
        String path = "mme-fgw-s1-interface[callpServiceId='" + callpServiceIdValue + "']";
        return (MmeFgwS1Interface)searchOne(path);
    }

    /**
     * Gets list entry "mmeFgwS1Interface", with specified keys.
     * The keys are specified as strings.
     * @param callpServiceIdValue Key argument of child.
     */
    public MmeFgwS1Interface getMmeFgwS1Interface(String callpServiceIdValue)
            throws JNCException {
        String path = "mme-fgw-s1-interface[callpServiceId='" + callpServiceIdValue + "']";
        return (MmeFgwS1Interface)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-fgw-s1-interface".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeFgwS1InterfaceIterator() {
        return new ElementChildrenIterator(children, "mme-fgw-s1-interface");
    }

    /**
     * Adds list entry "mmeFgwS1Interface", using an existing object.
     * @param mmeFgwS1Interface The object to add.
     * @return The added child.
     */
    public MmeFgwS1Interface addMmeFgwS1Interface(MmeFgwS1Interface mmeFgwS1Interface)
            throws JNCException {
        insertChild(mmeFgwS1Interface, childrenNames());
        return mmeFgwS1Interface;
    }

    /**
     * Adds list entry "mmeFgwS1Interface", with specified keys.
     * @param callpServiceIdValue Key argument of child.
     * @return The added child.
     */
    public MmeFgwS1Interface addMmeFgwS1Interface(YangUInt16 callpServiceIdValue)
            throws JNCException {
        MmeFgwS1Interface mmeFgwS1Interface = new MmeFgwS1Interface(callpServiceIdValue);
        return addMmeFgwS1Interface(mmeFgwS1Interface);
    }

    /**
     * Adds list entry "mmeFgwS1Interface", with specified keys.
     * The keys are specified as strings.
     * @param callpServiceIdValue Key argument of child.
     * @return The added child.
     */
    public MmeFgwS1Interface addMmeFgwS1Interface(String callpServiceIdValue)
            throws JNCException {
        MmeFgwS1Interface mmeFgwS1Interface = new MmeFgwS1Interface(callpServiceIdValue);
        return addMmeFgwS1Interface(mmeFgwS1Interface);
    }

    /**
     * Adds list entry "mmeFgwS1Interface".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeFgwS1Interface addMmeFgwS1Interface() throws JNCException {
        MmeFgwS1Interface mmeFgwS1Interface = new MmeFgwS1Interface();
        insertChild(mmeFgwS1Interface, childrenNames());
        return mmeFgwS1Interface;
    }

    /**
     * Deletes list entry "mmeFgwS1Interface", with specified keys.
     * @param callpServiceIdValue Key argument of child.
     */
    public void deleteMmeFgwS1Interface(YangUInt16 callpServiceIdValue)
            throws JNCException {
        String path = "mme-fgw-s1-interface[callpServiceId='" + callpServiceIdValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeFgwS1Interface", with specified keys.
     * The keys are specified as strings.
     * @param callpServiceIdValue Key argument of child.
     */
    public void deleteMmeFgwS1Interface(String callpServiceIdValue)
            throws JNCException {
        String path = "mme-fgw-s1-interface[callpServiceId='" + callpServiceIdValue + "']";
        delete(path);
    }

    /* Access methods for container child: "mme-fgw-s1-interface-profile". */

    /**
     * Adds container entry "mmeFgwS1InterfaceProfile", using an existing object.
     * @param mmeFgwS1InterfaceProfile The object to add.
     * @return The added child.
     */
    public MmeFgwS1InterfaceProfile addMmeFgwS1InterfaceProfile(MmeFgwS1InterfaceProfile mmeFgwS1InterfaceProfile)
            throws JNCException {
        this.mmeFgwS1InterfaceProfile = mmeFgwS1InterfaceProfile;
        insertChild(mmeFgwS1InterfaceProfile, childrenNames());
        return mmeFgwS1InterfaceProfile;
    }

    /**
     * Adds container entry "mmeFgwS1InterfaceProfile".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeFgwS1InterfaceProfile addMmeFgwS1InterfaceProfile()
            throws JNCException {
        MmeFgwS1InterfaceProfile mmeFgwS1InterfaceProfile = new MmeFgwS1InterfaceProfile();
        this.mmeFgwS1InterfaceProfile = mmeFgwS1InterfaceProfile;
        insertChild(mmeFgwS1InterfaceProfile, childrenNames());
        return mmeFgwS1InterfaceProfile;
    }

    /**
     * Deletes container entry "mmeFgwS1InterfaceProfile".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeFgwS1InterfaceProfile() throws JNCException {
        this.mmeFgwS1InterfaceProfile = null;
        String path = "mme-fgw-s1-interface-profile";
        return delete(path);
    }

    /* Access methods for container child: "mme-s1-mme-if". */

    /**
     * Adds container entry "mmeS1MmeIf", using an existing object.
     * @param mmeS1MmeIf The object to add.
     * @return The added child.
     */
    public MmeS1MmeIf addMmeS1MmeIf(MmeS1MmeIf mmeS1MmeIf) throws JNCException {
        this.mmeS1MmeIf = mmeS1MmeIf;
        insertChild(mmeS1MmeIf, childrenNames());
        return mmeS1MmeIf;
    }

    /**
     * Adds container entry "mmeS1MmeIf".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeS1MmeIf addMmeS1MmeIf() throws JNCException {
        MmeS1MmeIf mmeS1MmeIf = new MmeS1MmeIf();
        this.mmeS1MmeIf = mmeS1MmeIf;
        insertChild(mmeS1MmeIf, childrenNames());
        return mmeS1MmeIf;
    }

    /**
     * Deletes container entry "mmeS1MmeIf".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeS1MmeIf() throws JNCException {
        this.mmeS1MmeIf = null;
        String path = "mme-s1-mme-if";
        return delete(path);
    }

    /* Access methods for list child: "mme-s1-mme-peer". */

    /**
     * Gets list entry "mmeS1MmePeer", with specified keys.
     * @param indexValue Key argument of child.
     */
    public MmeS1MmePeer getMmeS1MmePeer(YangUInt8 indexValue)
            throws JNCException {
        String path = "mme-s1-mme-peer[index='" + indexValue + "']";
        return (MmeS1MmePeer)searchOne(path);
    }

    /**
     * Gets list entry "mmeS1MmePeer", with specified keys.
     * The keys are specified as strings.
     * @param indexValue Key argument of child.
     */
    public MmeS1MmePeer getMmeS1MmePeer(String indexValue) throws JNCException {
        String path = "mme-s1-mme-peer[index='" + indexValue + "']";
        return (MmeS1MmePeer)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-s1-mme-peer".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeS1MmePeerIterator() {
        return new ElementChildrenIterator(children, "mme-s1-mme-peer");
    }

    /**
     * Adds list entry "mmeS1MmePeer", using an existing object.
     * @param mmeS1MmePeer The object to add.
     * @return The added child.
     */
    public MmeS1MmePeer addMmeS1MmePeer(MmeS1MmePeer mmeS1MmePeer)
            throws JNCException {
        insertChild(mmeS1MmePeer, childrenNames());
        return mmeS1MmePeer;
    }

    /**
     * Adds list entry "mmeS1MmePeer", with specified keys.
     * @param indexValue Key argument of child.
     * @return The added child.
     */
    public MmeS1MmePeer addMmeS1MmePeer(YangUInt8 indexValue)
            throws JNCException {
        MmeS1MmePeer mmeS1MmePeer = new MmeS1MmePeer(indexValue);
        return addMmeS1MmePeer(mmeS1MmePeer);
    }

    /**
     * Adds list entry "mmeS1MmePeer", with specified keys.
     * The keys are specified as strings.
     * @param indexValue Key argument of child.
     * @return The added child.
     */
    public MmeS1MmePeer addMmeS1MmePeer(String indexValue) throws JNCException {
        MmeS1MmePeer mmeS1MmePeer = new MmeS1MmePeer(indexValue);
        return addMmeS1MmePeer(mmeS1MmePeer);
    }

    /**
     * Adds list entry "mmeS1MmePeer".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeS1MmePeer addMmeS1MmePeer() throws JNCException {
        MmeS1MmePeer mmeS1MmePeer = new MmeS1MmePeer();
        insertChild(mmeS1MmePeer, childrenNames());
        return mmeS1MmePeer;
    }

    /**
     * Deletes list entry "mmeS1MmePeer", with specified keys.
     * @param indexValue Key argument of child.
     */
    public void deleteMmeS1MmePeer(YangUInt8 indexValue) throws JNCException {
        String path = "mme-s1-mme-peer[index='" + indexValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeS1MmePeer", with specified keys.
     * The keys are specified as strings.
     * @param indexValue Key argument of child.
     */
    public void deleteMmeS1MmePeer(String indexValue) throws JNCException {
        String path = "mme-s1-mme-peer[index='" + indexValue + "']";
        delete(path);
    }

    /* Access methods for list child: "mme-s1-mme-association". */

    /**
     * Gets list entry "mmeS1MmeAssociation", with specified keys.
     * @param indexValue Key argument of child.
     */
    public MmeS1MmeAssociation getMmeS1MmeAssociation(YangUInt16 indexValue)
            throws JNCException {
        String path = "mme-s1-mme-association[index='" + indexValue + "']";
        return (MmeS1MmeAssociation)searchOne(path);
    }

    /**
     * Gets list entry "mmeS1MmeAssociation", with specified keys.
     * The keys are specified as strings.
     * @param indexValue Key argument of child.
     */
    public MmeS1MmeAssociation getMmeS1MmeAssociation(String indexValue)
            throws JNCException {
        String path = "mme-s1-mme-association[index='" + indexValue + "']";
        return (MmeS1MmeAssociation)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-s1-mme-association".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeS1MmeAssociationIterator() {
        return new ElementChildrenIterator(children, "mme-s1-mme-association");
    }

    /**
     * Adds list entry "mmeS1MmeAssociation", using an existing object.
     * @param mmeS1MmeAssociation The object to add.
     * @return The added child.
     */
    public MmeS1MmeAssociation addMmeS1MmeAssociation(MmeS1MmeAssociation mmeS1MmeAssociation)
            throws JNCException {
        insertChild(mmeS1MmeAssociation, childrenNames());
        return mmeS1MmeAssociation;
    }

    /**
     * Adds list entry "mmeS1MmeAssociation", with specified keys.
     * @param indexValue Key argument of child.
     * @return The added child.
     */
    public MmeS1MmeAssociation addMmeS1MmeAssociation(YangUInt16 indexValue)
            throws JNCException {
        MmeS1MmeAssociation mmeS1MmeAssociation = new MmeS1MmeAssociation(indexValue);
        return addMmeS1MmeAssociation(mmeS1MmeAssociation);
    }

    /**
     * Adds list entry "mmeS1MmeAssociation", with specified keys.
     * The keys are specified as strings.
     * @param indexValue Key argument of child.
     * @return The added child.
     */
    public MmeS1MmeAssociation addMmeS1MmeAssociation(String indexValue)
            throws JNCException {
        MmeS1MmeAssociation mmeS1MmeAssociation = new MmeS1MmeAssociation(indexValue);
        return addMmeS1MmeAssociation(mmeS1MmeAssociation);
    }

    /**
     * Adds list entry "mmeS1MmeAssociation".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeS1MmeAssociation addMmeS1MmeAssociation() throws JNCException {
        MmeS1MmeAssociation mmeS1MmeAssociation = new MmeS1MmeAssociation();
        insertChild(mmeS1MmeAssociation, childrenNames());
        return mmeS1MmeAssociation;
    }

    /**
     * Deletes list entry "mmeS1MmeAssociation", with specified keys.
     * @param indexValue Key argument of child.
     */
    public void deleteMmeS1MmeAssociation(YangUInt16 indexValue)
            throws JNCException {
        String path = "mme-s1-mme-association[index='" + indexValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeS1MmeAssociation", with specified keys.
     * The keys are specified as strings.
     * @param indexValue Key argument of child.
     */
    public void deleteMmeS1MmeAssociation(String indexValue)
            throws JNCException {
        String path = "mme-s1-mme-association[index='" + indexValue + "']";
        delete(path);
    }

    /* Access methods for list child: "mme-s1-mme-association-profile". */

    /**
     * Gets list entry "mmeS1MmeAssociationProfile", with specified keys.
     * @param indexValue Key argument of child.
     */
    public MmeS1MmeAssociationProfile getMmeS1MmeAssociationProfile(YangUInt8 indexValue)
            throws JNCException {
        String path = "mme-s1-mme-association-profile[index='" + indexValue + "']";
        return (MmeS1MmeAssociationProfile)searchOne(path);
    }

    /**
     * Gets list entry "mmeS1MmeAssociationProfile", with specified keys.
     * The keys are specified as strings.
     * @param indexValue Key argument of child.
     */
    public MmeS1MmeAssociationProfile getMmeS1MmeAssociationProfile(String indexValue)
            throws JNCException {
        String path = "mme-s1-mme-association-profile[index='" + indexValue + "']";
        return (MmeS1MmeAssociationProfile)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-s1-mme-association-profile".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeS1MmeAssociationProfileIterator() {
        return new ElementChildrenIterator(children, "mme-s1-mme-association-profile");
    }

    /**
     * Adds list entry "mmeS1MmeAssociationProfile", using an existing object.
     * @param mmeS1MmeAssociationProfile The object to add.
     * @return The added child.
     */
    public MmeS1MmeAssociationProfile addMmeS1MmeAssociationProfile(MmeS1MmeAssociationProfile mmeS1MmeAssociationProfile)
            throws JNCException {
        insertChild(mmeS1MmeAssociationProfile, childrenNames());
        return mmeS1MmeAssociationProfile;
    }

    /**
     * Adds list entry "mmeS1MmeAssociationProfile", with specified keys.
     * @param indexValue Key argument of child.
     * @return The added child.
     */
    public MmeS1MmeAssociationProfile addMmeS1MmeAssociationProfile(YangUInt8 indexValue)
            throws JNCException {
        MmeS1MmeAssociationProfile mmeS1MmeAssociationProfile = new MmeS1MmeAssociationProfile(indexValue);
        return addMmeS1MmeAssociationProfile(mmeS1MmeAssociationProfile);
    }

    /**
     * Adds list entry "mmeS1MmeAssociationProfile", with specified keys.
     * The keys are specified as strings.
     * @param indexValue Key argument of child.
     * @return The added child.
     */
    public MmeS1MmeAssociationProfile addMmeS1MmeAssociationProfile(String indexValue)
            throws JNCException {
        MmeS1MmeAssociationProfile mmeS1MmeAssociationProfile = new MmeS1MmeAssociationProfile(indexValue);
        return addMmeS1MmeAssociationProfile(mmeS1MmeAssociationProfile);
    }

    /**
     * Adds list entry "mmeS1MmeAssociationProfile".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeS1MmeAssociationProfile addMmeS1MmeAssociationProfile()
            throws JNCException {
        MmeS1MmeAssociationProfile mmeS1MmeAssociationProfile = new MmeS1MmeAssociationProfile();
        insertChild(mmeS1MmeAssociationProfile, childrenNames());
        return mmeS1MmeAssociationProfile;
    }

    /**
     * Deletes list entry "mmeS1MmeAssociationProfile", with specified keys.
     * @param indexValue Key argument of child.
     */
    public void deleteMmeS1MmeAssociationProfile(YangUInt8 indexValue)
            throws JNCException {
        String path = "mme-s1-mme-association-profile[index='" + indexValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeS1MmeAssociationProfile", with specified keys.
     * The keys are specified as strings.
     * @param indexValue Key argument of child.
     */
    public void deleteMmeS1MmeAssociationProfile(String indexValue)
            throws JNCException {
        String path = "mme-s1-mme-association-profile[index='" + indexValue + "']";
        delete(path);
    }

    /* Access methods for list child: "s1-mme-association-oper". */

    /**
     * Gets list entry "s1MmeAssociationOper", with specified keys.
     */
    public S1MmeAssociationOper getS1MmeAssociationOper() throws JNCException {
        String path = "s1-mme-association-oper";
        return (S1MmeAssociationOper)searchOne(path);
    }

    /**
     * Iterator method for the list "s1-mme-association-oper".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator s1MmeAssociationOperIterator() {
        return new ElementChildrenIterator(children, "s1-mme-association-oper");
    }

    /**
     * Adds list entry "s1MmeAssociationOper", using an existing object.
     * @param s1MmeAssociationOper The object to add.
     * @return The added child.
     */
    public S1MmeAssociationOper addS1MmeAssociationOper(S1MmeAssociationOper s1MmeAssociationOper)
            throws JNCException {
        insertChild(s1MmeAssociationOper, childrenNames());
        return s1MmeAssociationOper;
    }

    /**
     * Adds list entry "s1MmeAssociationOper".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public S1MmeAssociationOper addS1MmeAssociationOper() throws JNCException {
        S1MmeAssociationOper s1MmeAssociationOper = new S1MmeAssociationOper();
        insertChild(s1MmeAssociationOper, childrenNames());
        return s1MmeAssociationOper;
    }

    /**
     * Deletes list entry "s1MmeAssociationOper", with specified keys.
     */
    public void deleteS1MmeAssociationOper() throws JNCException {
        String path = "s1-mme-association-oper";
        delete(path);
    }

    /* Access methods for list child: "enb". */

    /**
     * Gets list entry "enb", with specified keys.
     */
    public Enb getEnb() throws JNCException {
        String path = "enb";
        return (Enb)searchOne(path);
    }

    /**
     * Iterator method for the list "enb".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator enbIterator() {
        return new ElementChildrenIterator(children, "enb");
    }

    /**
     * Adds list entry "enb", using an existing object.
     * @param enb The object to add.
     * @return The added child.
     */
    public Enb addEnb(Enb enb) throws JNCException {
        insertChild(enb, childrenNames());
        return enb;
    }

    /**
     * Adds list entry "enb".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Enb addEnb() throws JNCException {
        Enb enb = new Enb();
        insertChild(enb, childrenNames());
        return enb;
    }

    /**
     * Deletes list entry "enb", with specified keys.
     */
    public void deleteEnb() throws JNCException {
        String path = "enb";
        delete(path);
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof MmeFgwS1InterfaceProfile) mmeFgwS1InterfaceProfile = (MmeFgwS1InterfaceProfile)child;
        else if (child instanceof MmeS1MmeIf) mmeS1MmeIf = (MmeS1MmeIf)child;
    }

}