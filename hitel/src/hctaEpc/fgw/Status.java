/* 
 * @(#)Status.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.fgw;

import Element;

import ElementChildrenIterator;

import Epc;

import FgwStorage;

import FgwSystem;

import JNCException;

import MmeFgwHealthProfile;

import NodeSet;

import Summary;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/fgw/status"
 * <p>
 * See line 98 in
 * fgwConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Status extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "mme-fgw-health-profile".
     */
    public MmeFgwHealthProfile mmeFgwHealthProfile = null;

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
            "mme-fgw-health-profile",
            "fgw-system",
            "fgw-storage",
            "summary",
        };
    }

    /* Access methods for container child: "mme-fgw-health-profile". */

    /**
     * Adds container entry "mmeFgwHealthProfile", using an existing object.
     * @param mmeFgwHealthProfile The object to add.
     * @return The added child.
     */
    public MmeFgwHealthProfile addMmeFgwHealthProfile(MmeFgwHealthProfile mmeFgwHealthProfile)
            throws JNCException {
        this.mmeFgwHealthProfile = mmeFgwHealthProfile;
        insertChild(mmeFgwHealthProfile, childrenNames());
        return mmeFgwHealthProfile;
    }

    /**
     * Adds container entry "mmeFgwHealthProfile".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeFgwHealthProfile addMmeFgwHealthProfile() throws JNCException {
        MmeFgwHealthProfile mmeFgwHealthProfile = new MmeFgwHealthProfile();
        this.mmeFgwHealthProfile = mmeFgwHealthProfile;
        insertChild(mmeFgwHealthProfile, childrenNames());
        return mmeFgwHealthProfile;
    }

    /**
     * Deletes container entry "mmeFgwHealthProfile".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeFgwHealthProfile() throws JNCException {
        this.mmeFgwHealthProfile = null;
        String path = "mme-fgw-health-profile";
        return delete(path);
    }

    /* Access methods for list child: "fgw-system". */

    /**
     * Gets list entry "fgwSystem", with specified keys.
     */
    public FgwSystem getFgwSystem() throws JNCException {
        String path = "fgw-system";
        return (FgwSystem)searchOne(path);
    }

    /**
     * Iterator method for the list "fgw-system".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator fgwSystemIterator() {
        return new ElementChildrenIterator(children, "fgw-system");
    }

    /**
     * Adds list entry "fgwSystem", using an existing object.
     * @param fgwSystem The object to add.
     * @return The added child.
     */
    public FgwSystem addFgwSystem(FgwSystem fgwSystem) throws JNCException {
        insertChild(fgwSystem, childrenNames());
        return fgwSystem;
    }

    /**
     * Adds list entry "fgwSystem".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public FgwSystem addFgwSystem() throws JNCException {
        FgwSystem fgwSystem = new FgwSystem();
        insertChild(fgwSystem, childrenNames());
        return fgwSystem;
    }

    /**
     * Deletes list entry "fgwSystem", with specified keys.
     */
    public void deleteFgwSystem() throws JNCException {
        String path = "fgw-system";
        delete(path);
    }

    /* Access methods for list child: "fgw-storage". */

    /**
     * Gets list entry "fgwStorage", with specified keys.
     */
    public FgwStorage getFgwStorage() throws JNCException {
        String path = "fgw-storage";
        return (FgwStorage)searchOne(path);
    }

    /**
     * Iterator method for the list "fgw-storage".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator fgwStorageIterator() {
        return new ElementChildrenIterator(children, "fgw-storage");
    }

    /**
     * Adds list entry "fgwStorage", using an existing object.
     * @param fgwStorage The object to add.
     * @return The added child.
     */
    public FgwStorage addFgwStorage(FgwStorage fgwStorage) throws JNCException {
        insertChild(fgwStorage, childrenNames());
        return fgwStorage;
    }

    /**
     * Adds list entry "fgwStorage".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public FgwStorage addFgwStorage() throws JNCException {
        FgwStorage fgwStorage = new FgwStorage();
        insertChild(fgwStorage, childrenNames());
        return fgwStorage;
    }

    /**
     * Deletes list entry "fgwStorage", with specified keys.
     */
    public void deleteFgwStorage() throws JNCException {
        String path = "fgw-storage";
        delete(path);
    }

    /* Access methods for list child: "summary". */

    /**
     * Gets list entry "summary", with specified keys.
     */
    public Summary getSummary() throws JNCException {
        String path = "summary";
        return (Summary)searchOne(path);
    }

    /**
     * Iterator method for the list "summary".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator summaryIterator() {
        return new ElementChildrenIterator(children, "summary");
    }

    /**
     * Adds list entry "summary", using an existing object.
     * @param summary The object to add.
     * @return The added child.
     */
    public Summary addSummary(Summary summary) throws JNCException {
        insertChild(summary, childrenNames());
        return summary;
    }

    /**
     * Adds list entry "summary".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Summary addSummary() throws JNCException {
        Summary summary = new Summary();
        insertChild(summary, childrenNames());
        return summary;
    }

    /**
     * Deletes list entry "summary", with specified keys.
     */
    public void deleteSummary() throws JNCException {
        String path = "summary";
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
        if (child instanceof MmeFgwHealthProfile) mmeFgwHealthProfile = (MmeFgwHealthProfile)child;
    }

}
