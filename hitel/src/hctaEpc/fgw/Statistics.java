/* 
 * @(#)Statistics.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.fgw;

import Element;

import Epc;

import FgwBm;

import FgwCm;

import FgwHandover;

import JNCException;

import NodeSet;

import S1MmePeer;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/fgw/statistics"
 * <p>
 * See line 75 in
 * mmeStatisticsConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Statistics extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "fgwBm".
     */
    public FgwBm fgwBm = null;

    /**
     * Field for child container "fgwCm".
     */
    public FgwCm fgwCm = null;

    /**
     * Field for child container "fgwHandover".
     */
    public FgwHandover fgwHandover = null;

    /**
     * Field for child container "s1MmePeer".
     */
    public S1MmePeer s1MmePeer = null;

    /**
     * Constructor for an empty Statistics object.
     */
    public Statistics() {
        super(Epc.NAMESPACE, "statistics");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Statistics clone() {
        return (Statistics)cloneContent(new Statistics());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Statistics cloneShallow() {
        return (Statistics)cloneShallowContent(new Statistics());
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
            "collection-interval",
            "retention-report",
            "retention-archive",
            "fgwBm",
            "fgwCm",
            "fgwHandover",
            "s1MmePeer",
        };
    }

    /* Access methods for optional leaf child: "collection-interval". */

    /**
     * Gets the value for child leaf "collection-interval".
     * @return The value of the leaf.
     */
    public YangEnumeration getCollectionIntervalValue() throws JNCException {
        YangEnumeration collectionInterval = (YangEnumeration)getValue("collection-interval");
        if (collectionInterval == null) {
            collectionInterval = new YangEnumeration("5", new String[] {  // default
                "5",
                "15",
                "30",
            });
        }
        return collectionInterval;
    }

    /**
     * Sets the value for child leaf "collection-interval",
     * using instance of generated typedef class.
     * @param collectionIntervalValue The value to set.
     * @param collectionIntervalValue used during instantiation.
     */
    public void setCollectionIntervalValue(YangEnumeration collectionIntervalValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "collection-interval",
            collectionIntervalValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "collection-interval",
     * using a String value.
     * @param collectionIntervalValue used during instantiation.
     */
    public void setCollectionIntervalValue(String collectionIntervalValue)
            throws JNCException {
        setCollectionIntervalValue(new YangEnumeration(collectionIntervalValue, new String[] {
             "5",
             "15",
             "30",
        }));
    }

    /**
     * Unsets the value for child leaf "collection-interval".
     */
    public void unsetCollectionIntervalValue() throws JNCException {
        delete("collection-interval");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "collection-interval" leaf will not have a value.
     */
    public void addCollectionInterval() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "collection-interval",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "collection-interval" with operation "replace".
     */
    public void markCollectionIntervalReplace() throws JNCException {
        markLeafReplace("collectionInterval");
    }

    /**
     * Marks the leaf "collection-interval" with operation "merge".
     */
    public void markCollectionIntervalMerge() throws JNCException {
        markLeafMerge("collectionInterval");
    }

    /**
     * Marks the leaf "collection-interval" with operation "create".
     */
    public void markCollectionIntervalCreate() throws JNCException {
        markLeafCreate("collectionInterval");
    }

    /**
     * Marks the leaf "collection-interval" with operation "delete".
     */
    public void markCollectionIntervalDelete() throws JNCException {
        markLeafDelete("collectionInterval");
    }

    /* Access methods for optional leaf child: "retention-report". */

    /**
     * Gets the value for child leaf "retention-report".
     * @return The value of the leaf.
     */
    public YangUInt16 getRetentionReportValue() throws JNCException {
        YangUInt16 retentionReport = (YangUInt16)getValue("retention-report");
        if (retentionReport == null) {
            retentionReport = new YangUInt16("288");  // default
        }
        return retentionReport;
    }

    /**
     * Sets the value for child leaf "retention-report",
     * using instance of generated typedef class.
     * @param retentionReportValue The value to set.
     * @param retentionReportValue used during instantiation.
     */
    public void setRetentionReportValue(YangUInt16 retentionReportValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "retention-report",
            retentionReportValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "retention-report",
     * using Java primitive values.
     * @param retentionReportValue used during instantiation.
     */
    public void setRetentionReportValue(int retentionReportValue)
            throws JNCException {
        setRetentionReportValue(new YangUInt16(retentionReportValue));
    }

    /**
     * Sets the value for child leaf "retention-report",
     * using a String value.
     * @param retentionReportValue used during instantiation.
     */
    public void setRetentionReportValue(String retentionReportValue)
            throws JNCException {
        setRetentionReportValue(new YangUInt16(retentionReportValue));
    }

    /**
     * Unsets the value for child leaf "retention-report".
     */
    public void unsetRetentionReportValue() throws JNCException {
        delete("retention-report");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "retention-report" leaf will not have a value.
     */
    public void addRetentionReport() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "retention-report",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "retention-report" with operation "replace".
     */
    public void markRetentionReportReplace() throws JNCException {
        markLeafReplace("retentionReport");
    }

    /**
     * Marks the leaf "retention-report" with operation "merge".
     */
    public void markRetentionReportMerge() throws JNCException {
        markLeafMerge("retentionReport");
    }

    /**
     * Marks the leaf "retention-report" with operation "create".
     */
    public void markRetentionReportCreate() throws JNCException {
        markLeafCreate("retentionReport");
    }

    /**
     * Marks the leaf "retention-report" with operation "delete".
     */
    public void markRetentionReportDelete() throws JNCException {
        markLeafDelete("retentionReport");
    }

    /* Access methods for optional leaf child: "retention-archive". */

    /**
     * Gets the value for child leaf "retention-archive".
     * @return The value of the leaf.
     */
    public YangUInt16 getRetentionArchiveValue() throws JNCException {
        YangUInt16 retentionArchive = (YangUInt16)getValue("retention-archive");
        if (retentionArchive == null) {
            retentionArchive = new YangUInt16("288");  // default
        }
        return retentionArchive;
    }

    /**
     * Sets the value for child leaf "retention-archive",
     * using instance of generated typedef class.
     * @param retentionArchiveValue The value to set.
     * @param retentionArchiveValue used during instantiation.
     */
    public void setRetentionArchiveValue(YangUInt16 retentionArchiveValue)
            throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "retention-archive",
            retentionArchiveValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "retention-archive",
     * using Java primitive values.
     * @param retentionArchiveValue used during instantiation.
     */
    public void setRetentionArchiveValue(int retentionArchiveValue)
            throws JNCException {
        setRetentionArchiveValue(new YangUInt16(retentionArchiveValue));
    }

    /**
     * Sets the value for child leaf "retention-archive",
     * using a String value.
     * @param retentionArchiveValue used during instantiation.
     */
    public void setRetentionArchiveValue(String retentionArchiveValue)
            throws JNCException {
        setRetentionArchiveValue(new YangUInt16(retentionArchiveValue));
    }

    /**
     * Unsets the value for child leaf "retention-archive".
     */
    public void unsetRetentionArchiveValue() throws JNCException {
        delete("retention-archive");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "retention-archive" leaf will not have a value.
     */
    public void addRetentionArchive() throws JNCException {
        setLeafValue(Epc.NAMESPACE,
            "retention-archive",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "retention-archive" with operation "replace".
     */
    public void markRetentionArchiveReplace() throws JNCException {
        markLeafReplace("retentionArchive");
    }

    /**
     * Marks the leaf "retention-archive" with operation "merge".
     */
    public void markRetentionArchiveMerge() throws JNCException {
        markLeafMerge("retentionArchive");
    }

    /**
     * Marks the leaf "retention-archive" with operation "create".
     */
    public void markRetentionArchiveCreate() throws JNCException {
        markLeafCreate("retentionArchive");
    }

    /**
     * Marks the leaf "retention-archive" with operation "delete".
     */
    public void markRetentionArchiveDelete() throws JNCException {
        markLeafDelete("retentionArchive");
    }

    /* Access methods for container child: "fgwBm". */

    /**
     * Adds container entry "fgwBm", using an existing object.
     * @param fgwBm The object to add.
     * @return The added child.
     */
    public FgwBm addFgwBm(FgwBm fgwBm) throws JNCException {
        this.fgwBm = fgwBm;
        insertChild(fgwBm, childrenNames());
        return fgwBm;
    }

    /**
     * Adds container entry "fgwBm".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public FgwBm addFgwBm() throws JNCException {
        FgwBm fgwBm = new FgwBm();
        this.fgwBm = fgwBm;
        insertChild(fgwBm, childrenNames());
        return fgwBm;
    }

    /**
     * Deletes container entry "fgwBm".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteFgwBm() throws JNCException {
        this.fgwBm = null;
        String path = "fgwBm";
        return delete(path);
    }

    /* Access methods for container child: "fgwCm". */

    /**
     * Adds container entry "fgwCm", using an existing object.
     * @param fgwCm The object to add.
     * @return The added child.
     */
    public FgwCm addFgwCm(FgwCm fgwCm) throws JNCException {
        this.fgwCm = fgwCm;
        insertChild(fgwCm, childrenNames());
        return fgwCm;
    }

    /**
     * Adds container entry "fgwCm".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public FgwCm addFgwCm() throws JNCException {
        FgwCm fgwCm = new FgwCm();
        this.fgwCm = fgwCm;
        insertChild(fgwCm, childrenNames());
        return fgwCm;
    }

    /**
     * Deletes container entry "fgwCm".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteFgwCm() throws JNCException {
        this.fgwCm = null;
        String path = "fgwCm";
        return delete(path);
    }

    /* Access methods for container child: "fgwHandover". */

    /**
     * Adds container entry "fgwHandover", using an existing object.
     * @param fgwHandover The object to add.
     * @return The added child.
     */
    public FgwHandover addFgwHandover(FgwHandover fgwHandover)
            throws JNCException {
        this.fgwHandover = fgwHandover;
        insertChild(fgwHandover, childrenNames());
        return fgwHandover;
    }

    /**
     * Adds container entry "fgwHandover".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public FgwHandover addFgwHandover() throws JNCException {
        FgwHandover fgwHandover = new FgwHandover();
        this.fgwHandover = fgwHandover;
        insertChild(fgwHandover, childrenNames());
        return fgwHandover;
    }

    /**
     * Deletes container entry "fgwHandover".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteFgwHandover() throws JNCException {
        this.fgwHandover = null;
        String path = "fgwHandover";
        return delete(path);
    }

    /* Access methods for container child: "s1MmePeer". */

    /**
     * Adds container entry "s1MmePeer", using an existing object.
     * @param s1MmePeer The object to add.
     * @return The added child.
     */
    public S1MmePeer addS1MmePeer(S1MmePeer s1MmePeer) throws JNCException {
        this.s1MmePeer = s1MmePeer;
        insertChild(s1MmePeer, childrenNames());
        return s1MmePeer;
    }

    /**
     * Adds container entry "s1MmePeer".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public S1MmePeer addS1MmePeer() throws JNCException {
        S1MmePeer s1MmePeer = new S1MmePeer();
        this.s1MmePeer = s1MmePeer;
        insertChild(s1MmePeer, childrenNames());
        return s1MmePeer;
    }

    /**
     * Deletes container entry "s1MmePeer".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteS1MmePeer() throws JNCException {
        this.s1MmePeer = null;
        String path = "s1MmePeer";
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
        if (child instanceof FgwBm) fgwBm = (FgwBm)child;
        else if (child instanceof FgwCm) fgwCm = (FgwCm)child;
        else if (child instanceof FgwHandover) fgwHandover = (FgwHandover)child;
        else if (child instanceof S1MmePeer) s1MmePeer = (S1MmePeer)child;
    }

}
