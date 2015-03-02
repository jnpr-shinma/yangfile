/* 
 * @(#)Nas.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_;

import Element;

import ElementChildrenIterator;

import Epc;

import JNCException;

import MmeEmergencyNumberList;

import MmeEmmCauseMapping;

import MmeGmmCauseMapping;

import MmeNasCommon;

import MmeNasGmm;

import MmeNasMm;

import MmeNasSgsnSm;

import MmeNasSm;

import NodeSet;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/nas"
 * <p>
 * See line 30 in
 * scConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Nas extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "mme-nas-mm".
     */
    public MmeNasMm mmeNasMm = null;

    /**
     * Field for child container "mme-nas-sm".
     */
    public MmeNasSm mmeNasSm = null;

    /**
     * Field for child container "mme-nas-common".
     */
    public MmeNasCommon mmeNasCommon = null;

    /**
     * Field for child container "mme-nas-gmm".
     */
    public MmeNasGmm mmeNasGmm = null;

    /**
     * Field for child container "mme-nas-sgsn-sm".
     */
    public MmeNasSgsnSm mmeNasSgsnSm = null;

    /**
     * Constructor for an empty Nas object.
     */
    public Nas() {
        super(Epc.NAMESPACE, "nas");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Nas clone() {
        return (Nas)cloneContent(new Nas());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Nas cloneShallow() {
        return (Nas)cloneShallowContent(new Nas());
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
            "mme-nas-mm",
            "mme-emm-cause-mapping",
            "mme-emergency-number-list",
            "mme-nas-sm",
            "mme-nas-common",
            "mme-nas-gmm",
            "mme-gmm-cause-mapping",
            "mme-nas-sgsn-sm",
        };
    }

    /* Access methods for container child: "mme-nas-mm". */

    /**
     * Adds container entry "mmeNasMm", using an existing object.
     * @param mmeNasMm The object to add.
     * @return The added child.
     */
    public MmeNasMm addMmeNasMm(MmeNasMm mmeNasMm) throws JNCException {
        this.mmeNasMm = mmeNasMm;
        insertChild(mmeNasMm, childrenNames());
        return mmeNasMm;
    }

    /**
     * Adds container entry "mmeNasMm".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeNasMm addMmeNasMm() throws JNCException {
        MmeNasMm mmeNasMm = new MmeNasMm();
        this.mmeNasMm = mmeNasMm;
        insertChild(mmeNasMm, childrenNames());
        return mmeNasMm;
    }

    /**
     * Deletes container entry "mmeNasMm".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeNasMm() throws JNCException {
        this.mmeNasMm = null;
        String path = "mme-nas-mm";
        return delete(path);
    }

    /* Access methods for list child: "mme-emm-cause-mapping". */

    /**
     * Gets list entry "mmeEmmCauseMapping", with specified keys.
     * @param errorValue Key argument of child.
     */
    public MmeEmmCauseMapping getMmeEmmCauseMapping(YangEnumeration errorValue)
            throws JNCException {
        String path = "mme-emm-cause-mapping[error='" + errorValue + "']";
        return (MmeEmmCauseMapping)searchOne(path);
    }

    /**
     * Gets list entry "mmeEmmCauseMapping", with specified keys.
     * The keys are specified as strings.
     * @param errorValue Key argument of child.
     */
    public MmeEmmCauseMapping getMmeEmmCauseMapping(String errorValue)
            throws JNCException {
        String path = "mme-emm-cause-mapping[error='" + errorValue + "']";
        return (MmeEmmCauseMapping)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-emm-cause-mapping".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeEmmCauseMappingIterator() {
        return new ElementChildrenIterator(children, "mme-emm-cause-mapping");
    }

    /**
     * Adds list entry "mmeEmmCauseMapping", using an existing object.
     * @param mmeEmmCauseMapping The object to add.
     * @return The added child.
     */
    public MmeEmmCauseMapping addMmeEmmCauseMapping(MmeEmmCauseMapping mmeEmmCauseMapping)
            throws JNCException {
        insertChild(mmeEmmCauseMapping, childrenNames());
        return mmeEmmCauseMapping;
    }

    /**
     * Adds list entry "mmeEmmCauseMapping", with specified keys.
     * @param errorValue Key argument of child.
     * @return The added child.
     */
    public MmeEmmCauseMapping addMmeEmmCauseMapping(YangEnumeration errorValue)
            throws JNCException {
        MmeEmmCauseMapping mmeEmmCauseMapping = new MmeEmmCauseMapping(errorValue);
        return addMmeEmmCauseMapping(mmeEmmCauseMapping);
    }

    /**
     * Adds list entry "mmeEmmCauseMapping", with specified keys.
     * The keys are specified as strings.
     * @param errorValue Key argument of child.
     * @return The added child.
     */
    public MmeEmmCauseMapping addMmeEmmCauseMapping(String errorValue)
            throws JNCException {
        MmeEmmCauseMapping mmeEmmCauseMapping = new MmeEmmCauseMapping(errorValue);
        return addMmeEmmCauseMapping(mmeEmmCauseMapping);
    }

    /**
     * Adds list entry "mmeEmmCauseMapping".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeEmmCauseMapping addMmeEmmCauseMapping() throws JNCException {
        MmeEmmCauseMapping mmeEmmCauseMapping = new MmeEmmCauseMapping();
        insertChild(mmeEmmCauseMapping, childrenNames());
        return mmeEmmCauseMapping;
    }

    /**
     * Deletes list entry "mmeEmmCauseMapping", with specified keys.
     * @param errorValue Key argument of child.
     */
    public void deleteMmeEmmCauseMapping(YangEnumeration errorValue)
            throws JNCException {
        String path = "mme-emm-cause-mapping[error='" + errorValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeEmmCauseMapping", with specified keys.
     * The keys are specified as strings.
     * @param errorValue Key argument of child.
     */
    public void deleteMmeEmmCauseMapping(String errorValue) throws JNCException {
        String path = "mme-emm-cause-mapping[error='" + errorValue + "']";
        delete(path);
    }

    /* Access methods for list child: "mme-emergency-number-list". */

    /**
     * Gets list entry "mmeEmergencyNumberList", with specified keys.
     * @param emergencyNumberValue Key argument of child.
     */
    public MmeEmergencyNumberList getMmeEmergencyNumberList(YangString emergencyNumberValue)
            throws JNCException {
        String path = "mme-emergency-number-list[emergencyNumber='" + emergencyNumberValue + "']";
        return (MmeEmergencyNumberList)searchOne(path);
    }

    /**
     * Gets list entry "mmeEmergencyNumberList", with specified keys.
     * The keys are specified as strings.
     * @param emergencyNumberValue Key argument of child.
     */
    public MmeEmergencyNumberList getMmeEmergencyNumberList(String emergencyNumberValue)
            throws JNCException {
        String path = "mme-emergency-number-list[emergencyNumber='" + emergencyNumberValue + "']";
        return (MmeEmergencyNumberList)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-emergency-number-list".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeEmergencyNumberListIterator() {
        return new ElementChildrenIterator(children, "mme-emergency-number-list");
    }

    /**
     * Adds list entry "mmeEmergencyNumberList", using an existing object.
     * @param mmeEmergencyNumberList The object to add.
     * @return The added child.
     */
    public MmeEmergencyNumberList addMmeEmergencyNumberList(MmeEmergencyNumberList mmeEmergencyNumberList)
            throws JNCException {
        insertChild(mmeEmergencyNumberList, childrenNames());
        return mmeEmergencyNumberList;
    }

    /**
     * Adds list entry "mmeEmergencyNumberList", with specified keys.
     * @param emergencyNumberValue Key argument of child.
     * @return The added child.
     */
    public MmeEmergencyNumberList addMmeEmergencyNumberList(YangString emergencyNumberValue)
            throws JNCException {
        MmeEmergencyNumberList mmeEmergencyNumberList = new MmeEmergencyNumberList(emergencyNumberValue);
        return addMmeEmergencyNumberList(mmeEmergencyNumberList);
    }

    /**
     * Adds list entry "mmeEmergencyNumberList", with specified keys.
     * The keys are specified as strings.
     * @param emergencyNumberValue Key argument of child.
     * @return The added child.
     */
    public MmeEmergencyNumberList addMmeEmergencyNumberList(String emergencyNumberValue)
            throws JNCException {
        MmeEmergencyNumberList mmeEmergencyNumberList = new MmeEmergencyNumberList(emergencyNumberValue);
        return addMmeEmergencyNumberList(mmeEmergencyNumberList);
    }

    /**
     * Adds list entry "mmeEmergencyNumberList".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeEmergencyNumberList addMmeEmergencyNumberList()
            throws JNCException {
        MmeEmergencyNumberList mmeEmergencyNumberList = new MmeEmergencyNumberList();
        insertChild(mmeEmergencyNumberList, childrenNames());
        return mmeEmergencyNumberList;
    }

    /**
     * Deletes list entry "mmeEmergencyNumberList", with specified keys.
     * @param emergencyNumberValue Key argument of child.
     */
    public void deleteMmeEmergencyNumberList(YangString emergencyNumberValue)
            throws JNCException {
        String path = "mme-emergency-number-list[emergencyNumber='" + emergencyNumberValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeEmergencyNumberList", with specified keys.
     * The keys are specified as strings.
     * @param emergencyNumberValue Key argument of child.
     */
    public void deleteMmeEmergencyNumberList(String emergencyNumberValue)
            throws JNCException {
        String path = "mme-emergency-number-list[emergencyNumber='" + emergencyNumberValue + "']";
        delete(path);
    }

    /* Access methods for container child: "mme-nas-sm". */

    /**
     * Adds container entry "mmeNasSm", using an existing object.
     * @param mmeNasSm The object to add.
     * @return The added child.
     */
    public MmeNasSm addMmeNasSm(MmeNasSm mmeNasSm) throws JNCException {
        this.mmeNasSm = mmeNasSm;
        insertChild(mmeNasSm, childrenNames());
        return mmeNasSm;
    }

    /**
     * Adds container entry "mmeNasSm".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeNasSm addMmeNasSm() throws JNCException {
        MmeNasSm mmeNasSm = new MmeNasSm();
        this.mmeNasSm = mmeNasSm;
        insertChild(mmeNasSm, childrenNames());
        return mmeNasSm;
    }

    /**
     * Deletes container entry "mmeNasSm".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeNasSm() throws JNCException {
        this.mmeNasSm = null;
        String path = "mme-nas-sm";
        return delete(path);
    }

    /* Access methods for container child: "mme-nas-common". */

    /**
     * Adds container entry "mmeNasCommon", using an existing object.
     * @param mmeNasCommon The object to add.
     * @return The added child.
     */
    public MmeNasCommon addMmeNasCommon(MmeNasCommon mmeNasCommon)
            throws JNCException {
        this.mmeNasCommon = mmeNasCommon;
        insertChild(mmeNasCommon, childrenNames());
        return mmeNasCommon;
    }

    /**
     * Adds container entry "mmeNasCommon".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeNasCommon addMmeNasCommon() throws JNCException {
        MmeNasCommon mmeNasCommon = new MmeNasCommon();
        this.mmeNasCommon = mmeNasCommon;
        insertChild(mmeNasCommon, childrenNames());
        return mmeNasCommon;
    }

    /**
     * Deletes container entry "mmeNasCommon".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeNasCommon() throws JNCException {
        this.mmeNasCommon = null;
        String path = "mme-nas-common";
        return delete(path);
    }

    /* Access methods for container child: "mme-nas-gmm". */

    /**
     * Adds container entry "mmeNasGmm", using an existing object.
     * @param mmeNasGmm The object to add.
     * @return The added child.
     */
    public MmeNasGmm addMmeNasGmm(MmeNasGmm mmeNasGmm) throws JNCException {
        this.mmeNasGmm = mmeNasGmm;
        insertChild(mmeNasGmm, childrenNames());
        return mmeNasGmm;
    }

    /**
     * Adds container entry "mmeNasGmm".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeNasGmm addMmeNasGmm() throws JNCException {
        MmeNasGmm mmeNasGmm = new MmeNasGmm();
        this.mmeNasGmm = mmeNasGmm;
        insertChild(mmeNasGmm, childrenNames());
        return mmeNasGmm;
    }

    /**
     * Deletes container entry "mmeNasGmm".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeNasGmm() throws JNCException {
        this.mmeNasGmm = null;
        String path = "mme-nas-gmm";
        return delete(path);
    }

    /* Access methods for list child: "mme-gmm-cause-mapping". */

    /**
     * Gets list entry "mmeGmmCauseMapping", with specified keys.
     * @param errorValue Key argument of child.
     */
    public MmeGmmCauseMapping getMmeGmmCauseMapping(YangEnumeration errorValue)
            throws JNCException {
        String path = "mme-gmm-cause-mapping[error='" + errorValue + "']";
        return (MmeGmmCauseMapping)searchOne(path);
    }

    /**
     * Gets list entry "mmeGmmCauseMapping", with specified keys.
     * The keys are specified as strings.
     * @param errorValue Key argument of child.
     */
    public MmeGmmCauseMapping getMmeGmmCauseMapping(String errorValue)
            throws JNCException {
        String path = "mme-gmm-cause-mapping[error='" + errorValue + "']";
        return (MmeGmmCauseMapping)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-gmm-cause-mapping".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeGmmCauseMappingIterator() {
        return new ElementChildrenIterator(children, "mme-gmm-cause-mapping");
    }

    /**
     * Adds list entry "mmeGmmCauseMapping", using an existing object.
     * @param mmeGmmCauseMapping The object to add.
     * @return The added child.
     */
    public MmeGmmCauseMapping addMmeGmmCauseMapping(MmeGmmCauseMapping mmeGmmCauseMapping)
            throws JNCException {
        insertChild(mmeGmmCauseMapping, childrenNames());
        return mmeGmmCauseMapping;
    }

    /**
     * Adds list entry "mmeGmmCauseMapping", with specified keys.
     * @param errorValue Key argument of child.
     * @return The added child.
     */
    public MmeGmmCauseMapping addMmeGmmCauseMapping(YangEnumeration errorValue)
            throws JNCException {
        MmeGmmCauseMapping mmeGmmCauseMapping = new MmeGmmCauseMapping(errorValue);
        return addMmeGmmCauseMapping(mmeGmmCauseMapping);
    }

    /**
     * Adds list entry "mmeGmmCauseMapping", with specified keys.
     * The keys are specified as strings.
     * @param errorValue Key argument of child.
     * @return The added child.
     */
    public MmeGmmCauseMapping addMmeGmmCauseMapping(String errorValue)
            throws JNCException {
        MmeGmmCauseMapping mmeGmmCauseMapping = new MmeGmmCauseMapping(errorValue);
        return addMmeGmmCauseMapping(mmeGmmCauseMapping);
    }

    /**
     * Adds list entry "mmeGmmCauseMapping".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeGmmCauseMapping addMmeGmmCauseMapping() throws JNCException {
        MmeGmmCauseMapping mmeGmmCauseMapping = new MmeGmmCauseMapping();
        insertChild(mmeGmmCauseMapping, childrenNames());
        return mmeGmmCauseMapping;
    }

    /**
     * Deletes list entry "mmeGmmCauseMapping", with specified keys.
     * @param errorValue Key argument of child.
     */
    public void deleteMmeGmmCauseMapping(YangEnumeration errorValue)
            throws JNCException {
        String path = "mme-gmm-cause-mapping[error='" + errorValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeGmmCauseMapping", with specified keys.
     * The keys are specified as strings.
     * @param errorValue Key argument of child.
     */
    public void deleteMmeGmmCauseMapping(String errorValue) throws JNCException {
        String path = "mme-gmm-cause-mapping[error='" + errorValue + "']";
        delete(path);
    }

    /* Access methods for container child: "mme-nas-sgsn-sm". */

    /**
     * Adds container entry "mmeNasSgsnSm", using an existing object.
     * @param mmeNasSgsnSm The object to add.
     * @return The added child.
     */
    public MmeNasSgsnSm addMmeNasSgsnSm(MmeNasSgsnSm mmeNasSgsnSm)
            throws JNCException {
        this.mmeNasSgsnSm = mmeNasSgsnSm;
        insertChild(mmeNasSgsnSm, childrenNames());
        return mmeNasSgsnSm;
    }

    /**
     * Adds container entry "mmeNasSgsnSm".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeNasSgsnSm addMmeNasSgsnSm() throws JNCException {
        MmeNasSgsnSm mmeNasSgsnSm = new MmeNasSgsnSm();
        this.mmeNasSgsnSm = mmeNasSgsnSm;
        insertChild(mmeNasSgsnSm, childrenNames());
        return mmeNasSgsnSm;
    }

    /**
     * Deletes container entry "mmeNasSgsnSm".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeNasSgsnSm() throws JNCException {
        this.mmeNasSgsnSm = null;
        String path = "mme-nas-sgsn-sm";
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
        if (child instanceof MmeNasMm) mmeNasMm = (MmeNasMm)child;
        else if (child instanceof MmeNasSm) mmeNasSm = (MmeNasSm)child;
        else if (child instanceof MmeNasCommon) mmeNasCommon = (MmeNasCommon)child;
        else if (child instanceof MmeNasGmm) mmeNasGmm = (MmeNasGmm)child;
        else if (child instanceof MmeNasSgsnSm) mmeNasSgsnSm = (MmeNasSgsnSm)child;
    }

}
