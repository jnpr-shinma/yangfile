/* 
 * @(#)Status.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn;

import Combo;

import Element;

import ElementChildrenIterator;

import Epc;

import Gprs;

import JNCException;

import Lte;

import MmeHealthProfile;

import MmeSgsnStorage;

import MmeSgsnSystem;

import MmeSgsnVersion;

import NodeSet;

import Umts;

import UpmLoadStatus;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/status"
 * <p>
 * See line 105 in
 * mmeSgsnConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Status extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "mme-health-profile".
     */
    public MmeHealthProfile mmeHealthProfile = null;

    /**
     * Constructor for an empty Status object.
     */
    public Status() {
        super(Epc.NAMESPACE, "status");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Status clone() {
        return (Status)cloneContent(new Status());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Status cloneShallow() {
        return (Status)cloneShallowContent(new Status());
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
            "mme-health-profile",
            "mme-sgsn-system",
            "combo",
            "lte",
            "gprs",
            "umts",
            "mme-sgsn-storage",
            "mme-sgsn-version",
            "upm-load-status",
        };
    }

    /* Access methods for container child: "mme-health-profile". */

    /**
     * Adds container entry "mmeHealthProfile", using an existing object.
     * @param mmeHealthProfile The object to add.
     * @return The added child.
     */
    public MmeHealthProfile addMmeHealthProfile(MmeHealthProfile mmeHealthProfile)
            throws JNCException {
        this.mmeHealthProfile = mmeHealthProfile;
        insertChild(mmeHealthProfile, childrenNames());
        return mmeHealthProfile;
    }

    /**
     * Adds container entry "mmeHealthProfile".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeHealthProfile addMmeHealthProfile() throws JNCException {
        MmeHealthProfile mmeHealthProfile = new MmeHealthProfile();
        this.mmeHealthProfile = mmeHealthProfile;
        insertChild(mmeHealthProfile, childrenNames());
        return mmeHealthProfile;
    }

    /**
     * Deletes container entry "mmeHealthProfile".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeHealthProfile() throws JNCException {
        this.mmeHealthProfile = null;
        String path = "mme-health-profile";
        return delete(path);
    }

    /* Access methods for list child: "mme-sgsn-system". */

    /**
     * Gets list entry "mmeSgsnSystem", with specified keys.
     */
    public MmeSgsnSystem getMmeSgsnSystem() throws JNCException {
        String path = "mme-sgsn-system";
        return (MmeSgsnSystem)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-sgsn-system".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeSgsnSystemIterator() {
        return new ElementChildrenIterator(children, "mme-sgsn-system");
    }

    /**
     * Adds list entry "mmeSgsnSystem", using an existing object.
     * @param mmeSgsnSystem The object to add.
     * @return The added child.
     */
    public MmeSgsnSystem addMmeSgsnSystem(MmeSgsnSystem mmeSgsnSystem)
            throws JNCException {
        insertChild(mmeSgsnSystem, childrenNames());
        return mmeSgsnSystem;
    }

    /**
     * Adds list entry "mmeSgsnSystem".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeSgsnSystem addMmeSgsnSystem() throws JNCException {
        MmeSgsnSystem mmeSgsnSystem = new MmeSgsnSystem();
        insertChild(mmeSgsnSystem, childrenNames());
        return mmeSgsnSystem;
    }

    /**
     * Deletes list entry "mmeSgsnSystem", with specified keys.
     */
    public void deleteMmeSgsnSystem() throws JNCException {
        String path = "mme-sgsn-system";
        delete(path);
    }

    /* Access methods for list child: "combo". */

    /**
     * Gets list entry "combo", with specified keys.
     */
    public Combo getCombo() throws JNCException {
        String path = "combo";
        return (Combo)searchOne(path);
    }

    /**
     * Iterator method for the list "combo".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator comboIterator() {
        return new ElementChildrenIterator(children, "combo");
    }

    /**
     * Adds list entry "combo", using an existing object.
     * @param combo The object to add.
     * @return The added child.
     */
    public Combo addCombo(Combo combo) throws JNCException {
        insertChild(combo, childrenNames());
        return combo;
    }

    /**
     * Adds list entry "combo".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Combo addCombo() throws JNCException {
        Combo combo = new Combo();
        insertChild(combo, childrenNames());
        return combo;
    }

    /**
     * Deletes list entry "combo", with specified keys.
     */
    public void deleteCombo() throws JNCException {
        String path = "combo";
        delete(path);
    }

    /* Access methods for list child: "lte". */

    /**
     * Gets list entry "lte", with specified keys.
     */
    public Lte getLte() throws JNCException {
        String path = "lte";
        return (Lte)searchOne(path);
    }

    /**
     * Iterator method for the list "lte".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator lteIterator() {
        return new ElementChildrenIterator(children, "lte");
    }

    /**
     * Adds list entry "lte", using an existing object.
     * @param lte The object to add.
     * @return The added child.
     */
    public Lte addLte(Lte lte) throws JNCException {
        insertChild(lte, childrenNames());
        return lte;
    }

    /**
     * Adds list entry "lte".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Lte addLte() throws JNCException {
        Lte lte = new Lte();
        insertChild(lte, childrenNames());
        return lte;
    }

    /**
     * Deletes list entry "lte", with specified keys.
     */
    public void deleteLte() throws JNCException {
        String path = "lte";
        delete(path);
    }

    /* Access methods for list child: "gprs". */

    /**
     * Gets list entry "gprs", with specified keys.
     */
    public Gprs getGprs() throws JNCException {
        String path = "gprs";
        return (Gprs)searchOne(path);
    }

    /**
     * Iterator method for the list "gprs".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator gprsIterator() {
        return new ElementChildrenIterator(children, "gprs");
    }

    /**
     * Adds list entry "gprs", using an existing object.
     * @param gprs The object to add.
     * @return The added child.
     */
    public Gprs addGprs(Gprs gprs) throws JNCException {
        insertChild(gprs, childrenNames());
        return gprs;
    }

    /**
     * Adds list entry "gprs".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Gprs addGprs() throws JNCException {
        Gprs gprs = new Gprs();
        insertChild(gprs, childrenNames());
        return gprs;
    }

    /**
     * Deletes list entry "gprs", with specified keys.
     */
    public void deleteGprs() throws JNCException {
        String path = "gprs";
        delete(path);
    }

    /* Access methods for list child: "umts". */

    /**
     * Gets list entry "umts", with specified keys.
     */
    public Umts getUmts() throws JNCException {
        String path = "umts";
        return (Umts)searchOne(path);
    }

    /**
     * Iterator method for the list "umts".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator umtsIterator() {
        return new ElementChildrenIterator(children, "umts");
    }

    /**
     * Adds list entry "umts", using an existing object.
     * @param umts The object to add.
     * @return The added child.
     */
    public Umts addUmts(Umts umts) throws JNCException {
        insertChild(umts, childrenNames());
        return umts;
    }

    /**
     * Adds list entry "umts".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Umts addUmts() throws JNCException {
        Umts umts = new Umts();
        insertChild(umts, childrenNames());
        return umts;
    }

    /**
     * Deletes list entry "umts", with specified keys.
     */
    public void deleteUmts() throws JNCException {
        String path = "umts";
        delete(path);
    }

    /* Access methods for list child: "mme-sgsn-storage". */

    /**
     * Gets list entry "mmeSgsnStorage", with specified keys.
     */
    public MmeSgsnStorage getMmeSgsnStorage() throws JNCException {
        String path = "mme-sgsn-storage";
        return (MmeSgsnStorage)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-sgsn-storage".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeSgsnStorageIterator() {
        return new ElementChildrenIterator(children, "mme-sgsn-storage");
    }

    /**
     * Adds list entry "mmeSgsnStorage", using an existing object.
     * @param mmeSgsnStorage The object to add.
     * @return The added child.
     */
    public MmeSgsnStorage addMmeSgsnStorage(MmeSgsnStorage mmeSgsnStorage)
            throws JNCException {
        insertChild(mmeSgsnStorage, childrenNames());
        return mmeSgsnStorage;
    }

    /**
     * Adds list entry "mmeSgsnStorage".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeSgsnStorage addMmeSgsnStorage() throws JNCException {
        MmeSgsnStorage mmeSgsnStorage = new MmeSgsnStorage();
        insertChild(mmeSgsnStorage, childrenNames());
        return mmeSgsnStorage;
    }

    /**
     * Deletes list entry "mmeSgsnStorage", with specified keys.
     */
    public void deleteMmeSgsnStorage() throws JNCException {
        String path = "mme-sgsn-storage";
        delete(path);
    }

    /* Access methods for list child: "mme-sgsn-version". */

    /**
     * Gets list entry "mmeSgsnVersion", with specified keys.
     */
    public MmeSgsnVersion getMmeSgsnVersion() throws JNCException {
        String path = "mme-sgsn-version";
        return (MmeSgsnVersion)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-sgsn-version".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeSgsnVersionIterator() {
        return new ElementChildrenIterator(children, "mme-sgsn-version");
    }

    /**
     * Adds list entry "mmeSgsnVersion", using an existing object.
     * @param mmeSgsnVersion The object to add.
     * @return The added child.
     */
    public MmeSgsnVersion addMmeSgsnVersion(MmeSgsnVersion mmeSgsnVersion)
            throws JNCException {
        insertChild(mmeSgsnVersion, childrenNames());
        return mmeSgsnVersion;
    }

    /**
     * Adds list entry "mmeSgsnVersion".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeSgsnVersion addMmeSgsnVersion() throws JNCException {
        MmeSgsnVersion mmeSgsnVersion = new MmeSgsnVersion();
        insertChild(mmeSgsnVersion, childrenNames());
        return mmeSgsnVersion;
    }

    /**
     * Deletes list entry "mmeSgsnVersion", with specified keys.
     */
    public void deleteMmeSgsnVersion() throws JNCException {
        String path = "mme-sgsn-version";
        delete(path);
    }

    /* Access methods for list child: "upm-load-status". */

    /**
     * Gets list entry "upmLoadStatus", with specified keys.
     */
    public UpmLoadStatus getUpmLoadStatus() throws JNCException {
        String path = "upm-load-status";
        return (UpmLoadStatus)searchOne(path);
    }

    /**
     * Iterator method for the list "upm-load-status".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator upmLoadStatusIterator() {
        return new ElementChildrenIterator(children, "upm-load-status");
    }

    /**
     * Adds list entry "upmLoadStatus", using an existing object.
     * @param upmLoadStatus The object to add.
     * @return The added child.
     */
    public UpmLoadStatus addUpmLoadStatus(UpmLoadStatus upmLoadStatus)
            throws JNCException {
        insertChild(upmLoadStatus, childrenNames());
        return upmLoadStatus;
    }

    /**
     * Adds list entry "upmLoadStatus".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public UpmLoadStatus addUpmLoadStatus() throws JNCException {
        UpmLoadStatus upmLoadStatus = new UpmLoadStatus();
        insertChild(upmLoadStatus, childrenNames());
        return upmLoadStatus;
    }

    /**
     * Deletes list entry "upmLoadStatus", with specified keys.
     */
    public void deleteUpmLoadStatus() throws JNCException {
        String path = "upm-load-status";
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
        if (child instanceof MmeHealthProfile) mmeHealthProfile = (MmeHealthProfile)child;
    }

}