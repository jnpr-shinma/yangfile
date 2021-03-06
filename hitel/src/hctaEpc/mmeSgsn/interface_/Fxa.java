/* 
 * @(#)Fxa.java        1.0 09/12/14
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

import MmeFxaApn;

import MmeFxaIf;

import NodeSet;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/fxa"
 * <p>
 * See line 80 in
 * upsmConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Fxa extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "mme-fxa-if".
     */
    public MmeFxaIf mmeFxaIf = null;

    /**
     * Constructor for an empty Fxa object.
     */
    public Fxa() {
        super(Epc.NAMESPACE, "fxa");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Fxa clone() {
        return (Fxa)cloneContent(new Fxa());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Fxa cloneShallow() {
        return (Fxa)cloneShallowContent(new Fxa());
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
            "mme-fxa-apn",
            "mme-fxa-if",
        };
    }

    /* Access methods for list child: "mme-fxa-apn". */

    /**
     * Gets list entry "mmeFxaApn", with specified keys.
     * @param apnNameValue Key argument of child.
     */
    public MmeFxaApn getMmeFxaApn(YangString apnNameValue) throws JNCException {
        String path = "mme-fxa-apn[apnName='" + apnNameValue + "']";
        return (MmeFxaApn)searchOne(path);
    }

    /**
     * Gets list entry "mmeFxaApn", with specified keys.
     * The keys are specified as strings.
     * @param apnNameValue Key argument of child.
     */
    public MmeFxaApn getMmeFxaApn(String apnNameValue) throws JNCException {
        String path = "mme-fxa-apn[apnName='" + apnNameValue + "']";
        return (MmeFxaApn)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-fxa-apn".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeFxaApnIterator() {
        return new ElementChildrenIterator(children, "mme-fxa-apn");
    }

    /**
     * Adds list entry "mmeFxaApn", using an existing object.
     * @param mmeFxaApn The object to add.
     * @return The added child.
     */
    public MmeFxaApn addMmeFxaApn(MmeFxaApn mmeFxaApn) throws JNCException {
        insertChild(mmeFxaApn, childrenNames());
        return mmeFxaApn;
    }

    /**
     * Adds list entry "mmeFxaApn", with specified keys.
     * @param apnNameValue Key argument of child.
     * @return The added child.
     */
    public MmeFxaApn addMmeFxaApn(YangString apnNameValue) throws JNCException {
        MmeFxaApn mmeFxaApn = new MmeFxaApn(apnNameValue);
        return addMmeFxaApn(mmeFxaApn);
    }

    /**
     * Adds list entry "mmeFxaApn", with specified keys.
     * The keys are specified as strings.
     * @param apnNameValue Key argument of child.
     * @return The added child.
     */
    public MmeFxaApn addMmeFxaApn(String apnNameValue) throws JNCException {
        MmeFxaApn mmeFxaApn = new MmeFxaApn(apnNameValue);
        return addMmeFxaApn(mmeFxaApn);
    }

    /**
     * Adds list entry "mmeFxaApn".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeFxaApn addMmeFxaApn() throws JNCException {
        MmeFxaApn mmeFxaApn = new MmeFxaApn();
        insertChild(mmeFxaApn, childrenNames());
        return mmeFxaApn;
    }

    /**
     * Deletes list entry "mmeFxaApn", with specified keys.
     * @param apnNameValue Key argument of child.
     */
    public void deleteMmeFxaApn(YangString apnNameValue) throws JNCException {
        String path = "mme-fxa-apn[apnName='" + apnNameValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeFxaApn", with specified keys.
     * The keys are specified as strings.
     * @param apnNameValue Key argument of child.
     */
    public void deleteMmeFxaApn(String apnNameValue) throws JNCException {
        String path = "mme-fxa-apn[apnName='" + apnNameValue + "']";
        delete(path);
    }

    /* Access methods for container child: "mme-fxa-if". */

    /**
     * Adds container entry "mmeFxaIf", using an existing object.
     * @param mmeFxaIf The object to add.
     * @return The added child.
     */
    public MmeFxaIf addMmeFxaIf(MmeFxaIf mmeFxaIf) throws JNCException {
        this.mmeFxaIf = mmeFxaIf;
        insertChild(mmeFxaIf, childrenNames());
        return mmeFxaIf;
    }

    /**
     * Adds container entry "mmeFxaIf".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeFxaIf addMmeFxaIf() throws JNCException {
        MmeFxaIf mmeFxaIf = new MmeFxaIf();
        this.mmeFxaIf = mmeFxaIf;
        insertChild(mmeFxaIf, childrenNames());
        return mmeFxaIf;
    }

    /**
     * Deletes container entry "mmeFxaIf".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeFxaIf() throws JNCException {
        this.mmeFxaIf = null;
        String path = "mme-fxa-if";
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
        if (child instanceof MmeFxaIf) mmeFxaIf = (MmeFxaIf)child;
    }

}
