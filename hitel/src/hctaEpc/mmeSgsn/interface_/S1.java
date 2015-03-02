/* 
 * @(#)S1.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_;

import Element;

import ElementChildrenIterator;

import Enb;

import EnbOper;

import Epc;

import JNCException;

import MmeFgwEnodeb;

import MmeFgwUIf;

import MmeFgwUPeer;

import MmeS1Interface;

import NodeSet;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt32;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/s1"
 * <p>
 * See line 160 in
 * s1MasterConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class S1 extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "mme-s1-interface".
     */
    public MmeS1Interface mmeS1Interface = null;

    /**
     * Field for child container "mme-fgw-u-if".
     */
    public MmeFgwUIf mmeFgwUIf = null;

    /**
     * Field for child container "enb".
     */
    public Enb enb = null;

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
            "mme-s1-interface",
            "mme-fgw-enodeb",
            "mme-fgw-u-if",
            "mme-fgw-u-peer",
            "enb",
            "enb-oper",
        };
    }

    /* Access methods for container child: "mme-s1-interface". */

    /**
     * Adds container entry "mmeS1Interface", using an existing object.
     * @param mmeS1Interface The object to add.
     * @return The added child.
     */
    public MmeS1Interface addMmeS1Interface(MmeS1Interface mmeS1Interface)
            throws JNCException {
        this.mmeS1Interface = mmeS1Interface;
        insertChild(mmeS1Interface, childrenNames());
        return mmeS1Interface;
    }

    /**
     * Adds container entry "mmeS1Interface".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeS1Interface addMmeS1Interface() throws JNCException {
        MmeS1Interface mmeS1Interface = new MmeS1Interface();
        this.mmeS1Interface = mmeS1Interface;
        insertChild(mmeS1Interface, childrenNames());
        return mmeS1Interface;
    }

    /**
     * Deletes container entry "mmeS1Interface".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeS1Interface() throws JNCException {
        this.mmeS1Interface = null;
        String path = "mme-s1-interface";
        return delete(path);
    }

    /* Access methods for list child: "mme-fgw-enodeb". */

    /**
     * Gets list entry "mmeFgwEnodeb", with specified keys.
     * @param plmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     */
    public MmeFgwEnodeb getMmeFgwEnodeb(YangString plmnIdValue, YangUInt32 enodebIdValue)
            throws JNCException {
        String path = "mme-fgw-enodeb[plmnId='" + plmnIdValue + "'][enodebId='" + enodebIdValue + "']";
        return (MmeFgwEnodeb)searchOne(path);
    }

    /**
     * Gets list entry "mmeFgwEnodeb", with specified keys.
     * The keys are specified as strings.
     * @param plmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     */
    public MmeFgwEnodeb getMmeFgwEnodeb(String plmnIdValue, String enodebIdValue)
            throws JNCException {
        String path = "mme-fgw-enodeb[plmnId='" + plmnIdValue + "'][enodebId='" + enodebIdValue + "']";
        return (MmeFgwEnodeb)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-fgw-enodeb".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeFgwEnodebIterator() {
        return new ElementChildrenIterator(children, "mme-fgw-enodeb");
    }

    /**
     * Adds list entry "mmeFgwEnodeb", using an existing object.
     * @param mmeFgwEnodeb The object to add.
     * @return The added child.
     */
    public MmeFgwEnodeb addMmeFgwEnodeb(MmeFgwEnodeb mmeFgwEnodeb)
            throws JNCException {
        insertChild(mmeFgwEnodeb, childrenNames());
        return mmeFgwEnodeb;
    }

    /**
     * Adds list entry "mmeFgwEnodeb", with specified keys.
     * @param plmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     * @return The added child.
     */
    public MmeFgwEnodeb addMmeFgwEnodeb(YangString plmnIdValue, YangUInt32 enodebIdValue)
            throws JNCException {
        MmeFgwEnodeb mmeFgwEnodeb = new MmeFgwEnodeb(plmnIdValue, enodebIdValue);
        return addMmeFgwEnodeb(mmeFgwEnodeb);
    }

    /**
     * Adds list entry "mmeFgwEnodeb", with specified keys.
     * The keys are specified as strings.
     * @param plmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     * @return The added child.
     */
    public MmeFgwEnodeb addMmeFgwEnodeb(String plmnIdValue, String enodebIdValue)
            throws JNCException {
        MmeFgwEnodeb mmeFgwEnodeb = new MmeFgwEnodeb(plmnIdValue, enodebIdValue);
        return addMmeFgwEnodeb(mmeFgwEnodeb);
    }

    /**
     * Adds list entry "mmeFgwEnodeb".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeFgwEnodeb addMmeFgwEnodeb() throws JNCException {
        MmeFgwEnodeb mmeFgwEnodeb = new MmeFgwEnodeb();
        insertChild(mmeFgwEnodeb, childrenNames());
        return mmeFgwEnodeb;
    }

    /**
     * Deletes list entry "mmeFgwEnodeb", with specified keys.
     * @param plmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     */
    public void deleteMmeFgwEnodeb(YangString plmnIdValue, YangUInt32 enodebIdValue)
            throws JNCException {
        String path = "mme-fgw-enodeb[plmnId='" + plmnIdValue + "'][enodebId='" + enodebIdValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeFgwEnodeb", with specified keys.
     * The keys are specified as strings.
     * @param plmnIdValue Key argument of child.
     * @param enodebIdValue Key argument of child.
     */
    public void deleteMmeFgwEnodeb(String plmnIdValue, String enodebIdValue)
            throws JNCException {
        String path = "mme-fgw-enodeb[plmnId='" + plmnIdValue + "'][enodebId='" + enodebIdValue + "']";
        delete(path);
    }

    /* Access methods for container child: "mme-fgw-u-if". */

    /**
     * Adds container entry "mmeFgwUIf", using an existing object.
     * @param mmeFgwUIf The object to add.
     * @return The added child.
     */
    public MmeFgwUIf addMmeFgwUIf(MmeFgwUIf mmeFgwUIf) throws JNCException {
        this.mmeFgwUIf = mmeFgwUIf;
        insertChild(mmeFgwUIf, childrenNames());
        return mmeFgwUIf;
    }

    /**
     * Adds container entry "mmeFgwUIf".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeFgwUIf addMmeFgwUIf() throws JNCException {
        MmeFgwUIf mmeFgwUIf = new MmeFgwUIf();
        this.mmeFgwUIf = mmeFgwUIf;
        insertChild(mmeFgwUIf, childrenNames());
        return mmeFgwUIf;
    }

    /**
     * Deletes container entry "mmeFgwUIf".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeFgwUIf() throws JNCException {
        this.mmeFgwUIf = null;
        String path = "mme-fgw-u-if";
        return delete(path);
    }

    /* Access methods for list child: "mme-fgw-u-peer". */

    /**
     * Gets list entry "mmeFgwUPeer", with specified keys.
     * @param nameValue Key argument of child.
     */
    public MmeFgwUPeer getMmeFgwUPeer(YangString nameValue) throws JNCException {
        String path = "mme-fgw-u-peer[name='" + nameValue + "']";
        return (MmeFgwUPeer)searchOne(path);
    }

    /**
     * Gets list entry "mmeFgwUPeer", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public MmeFgwUPeer getMmeFgwUPeer(String nameValue) throws JNCException {
        String path = "mme-fgw-u-peer[name='" + nameValue + "']";
        return (MmeFgwUPeer)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-fgw-u-peer".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeFgwUPeerIterator() {
        return new ElementChildrenIterator(children, "mme-fgw-u-peer");
    }

    /**
     * Adds list entry "mmeFgwUPeer", using an existing object.
     * @param mmeFgwUPeer The object to add.
     * @return The added child.
     */
    public MmeFgwUPeer addMmeFgwUPeer(MmeFgwUPeer mmeFgwUPeer)
            throws JNCException {
        insertChild(mmeFgwUPeer, childrenNames());
        return mmeFgwUPeer;
    }

    /**
     * Adds list entry "mmeFgwUPeer", with specified keys.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public MmeFgwUPeer addMmeFgwUPeer(YangString nameValue) throws JNCException {
        MmeFgwUPeer mmeFgwUPeer = new MmeFgwUPeer(nameValue);
        return addMmeFgwUPeer(mmeFgwUPeer);
    }

    /**
     * Adds list entry "mmeFgwUPeer", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public MmeFgwUPeer addMmeFgwUPeer(String nameValue) throws JNCException {
        MmeFgwUPeer mmeFgwUPeer = new MmeFgwUPeer(nameValue);
        return addMmeFgwUPeer(mmeFgwUPeer);
    }

    /**
     * Adds list entry "mmeFgwUPeer".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeFgwUPeer addMmeFgwUPeer() throws JNCException {
        MmeFgwUPeer mmeFgwUPeer = new MmeFgwUPeer();
        insertChild(mmeFgwUPeer, childrenNames());
        return mmeFgwUPeer;
    }

    /**
     * Deletes list entry "mmeFgwUPeer", with specified keys.
     * @param nameValue Key argument of child.
     */
    public void deleteMmeFgwUPeer(YangString nameValue) throws JNCException {
        String path = "mme-fgw-u-peer[name='" + nameValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeFgwUPeer", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public void deleteMmeFgwUPeer(String nameValue) throws JNCException {
        String path = "mme-fgw-u-peer[name='" + nameValue + "']";
        delete(path);
    }

    /* Access methods for container child: "enb". */

    /**
     * Adds container entry "enb", using an existing object.
     * @param enb The object to add.
     * @return The added child.
     */
    public Enb addEnb(Enb enb) throws JNCException {
        this.enb = enb;
        insertChild(enb, childrenNames());
        return enb;
    }

    /**
     * Adds container entry "enb".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Enb addEnb() throws JNCException {
        Enb enb = new Enb();
        this.enb = enb;
        insertChild(enb, childrenNames());
        return enb;
    }

    /**
     * Deletes container entry "enb".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteEnb() throws JNCException {
        this.enb = null;
        String path = "enb";
        return delete(path);
    }

    /* Access methods for list child: "enb-oper". */

    /**
     * Gets list entry "enbOper", with specified keys.
     */
    public EnbOper getEnbOper() throws JNCException {
        String path = "enb-oper";
        return (EnbOper)searchOne(path);
    }

    /**
     * Iterator method for the list "enb-oper".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator enbOperIterator() {
        return new ElementChildrenIterator(children, "enb-oper");
    }

    /**
     * Adds list entry "enbOper", using an existing object.
     * @param enbOper The object to add.
     * @return The added child.
     */
    public EnbOper addEnbOper(EnbOper enbOper) throws JNCException {
        insertChild(enbOper, childrenNames());
        return enbOper;
    }

    /**
     * Adds list entry "enbOper".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public EnbOper addEnbOper() throws JNCException {
        EnbOper enbOper = new EnbOper();
        insertChild(enbOper, childrenNames());
        return enbOper;
    }

    /**
     * Deletes list entry "enbOper", with specified keys.
     */
    public void deleteEnbOper() throws JNCException {
        String path = "enb-oper";
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
        if (child instanceof MmeS1Interface) mmeS1Interface = (MmeS1Interface)child;
        else if (child instanceof MmeFgwUIf) mmeFgwUIf = (MmeFgwUIf)child;
        else if (child instanceof Enb) enb = (Enb)child;
    }

}
