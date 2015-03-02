/* 
 * @(#)Slg.java        1.0 09/12/14
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

import MmeGmlc;

import MmeSlgIf;

import NodeSet;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/slg"
 * <p>
 * See line 336 in
 * dcConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Slg extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "mme-slg-if".
     */
    public MmeSlgIf mmeSlgIf = null;

    /**
     * Constructor for an empty Slg object.
     */
    public Slg() {
        super(Epc.NAMESPACE, "slg");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Slg clone() {
        return (Slg)cloneContent(new Slg());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Slg cloneShallow() {
        return (Slg)cloneShallowContent(new Slg());
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
            "mme-gmlc",
            "mme-slg-if",
        };
    }

    /* Access methods for list child: "mme-gmlc". */

    /**
     * Gets list entry "mmeGmlc", with specified keys.
     * @param gmlcNumberValue Key argument of child.
     */
    public MmeGmlc getMmeGmlc(YangString gmlcNumberValue) throws JNCException {
        String path = "mme-gmlc[gmlcNumber='" + gmlcNumberValue + "']";
        return (MmeGmlc)searchOne(path);
    }

    /**
     * Gets list entry "mmeGmlc", with specified keys.
     * The keys are specified as strings.
     * @param gmlcNumberValue Key argument of child.
     */
    public MmeGmlc getMmeGmlc(String gmlcNumberValue) throws JNCException {
        String path = "mme-gmlc[gmlcNumber='" + gmlcNumberValue + "']";
        return (MmeGmlc)searchOne(path);
    }

    /**
     * Iterator method for the list "mme-gmlc".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mmeGmlcIterator() {
        return new ElementChildrenIterator(children, "mme-gmlc");
    }

    /**
     * Adds list entry "mmeGmlc", using an existing object.
     * @param mmeGmlc The object to add.
     * @return The added child.
     */
    public MmeGmlc addMmeGmlc(MmeGmlc mmeGmlc) throws JNCException {
        insertChild(mmeGmlc, childrenNames());
        return mmeGmlc;
    }

    /**
     * Adds list entry "mmeGmlc", with specified keys.
     * @param gmlcNumberValue Key argument of child.
     * @return The added child.
     */
    public MmeGmlc addMmeGmlc(YangString gmlcNumberValue) throws JNCException {
        MmeGmlc mmeGmlc = new MmeGmlc(gmlcNumberValue);
        return addMmeGmlc(mmeGmlc);
    }

    /**
     * Adds list entry "mmeGmlc", with specified keys.
     * The keys are specified as strings.
     * @param gmlcNumberValue Key argument of child.
     * @return The added child.
     */
    public MmeGmlc addMmeGmlc(String gmlcNumberValue) throws JNCException {
        MmeGmlc mmeGmlc = new MmeGmlc(gmlcNumberValue);
        return addMmeGmlc(mmeGmlc);
    }

    /**
     * Adds list entry "mmeGmlc".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeGmlc addMmeGmlc() throws JNCException {
        MmeGmlc mmeGmlc = new MmeGmlc();
        insertChild(mmeGmlc, childrenNames());
        return mmeGmlc;
    }

    /**
     * Deletes list entry "mmeGmlc", with specified keys.
     * @param gmlcNumberValue Key argument of child.
     */
    public void deleteMmeGmlc(YangString gmlcNumberValue) throws JNCException {
        String path = "mme-gmlc[gmlcNumber='" + gmlcNumberValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mmeGmlc", with specified keys.
     * The keys are specified as strings.
     * @param gmlcNumberValue Key argument of child.
     */
    public void deleteMmeGmlc(String gmlcNumberValue) throws JNCException {
        String path = "mme-gmlc[gmlcNumber='" + gmlcNumberValue + "']";
        delete(path);
    }

    /* Access methods for container child: "mme-slg-if". */

    /**
     * Adds container entry "mmeSlgIf", using an existing object.
     * @param mmeSlgIf The object to add.
     * @return The added child.
     */
    public MmeSlgIf addMmeSlgIf(MmeSlgIf mmeSlgIf) throws JNCException {
        this.mmeSlgIf = mmeSlgIf;
        insertChild(mmeSlgIf, childrenNames());
        return mmeSlgIf;
    }

    /**
     * Adds container entry "mmeSlgIf".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeSlgIf addMmeSlgIf() throws JNCException {
        MmeSlgIf mmeSlgIf = new MmeSlgIf();
        this.mmeSlgIf = mmeSlgIf;
        insertChild(mmeSlgIf, childrenNames());
        return mmeSlgIf;
    }

    /**
     * Deletes container entry "mmeSlgIf".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeSlgIf() throws JNCException {
        this.mmeSlgIf = null;
        String path = "mme-slg-if";
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
        if (child instanceof MmeSlgIf) mmeSlgIf = (MmeSlgIf)child;
    }

}