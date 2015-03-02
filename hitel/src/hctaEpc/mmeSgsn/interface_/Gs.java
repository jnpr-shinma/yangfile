/* 
 * @(#)Gs.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.interface_;

import Element;

import Epc;

import JNCException;

import MmeGsIf;

import NodeSet;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/gs"
 * <p>
 * See line 159 in
 * sgsnScConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Gs extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "mme-gs-if".
     */
    public MmeGsIf mmeGsIf = null;

    /**
     * Constructor for an empty Gs object.
     */
    public Gs() {
        super(Epc.NAMESPACE, "gs");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Gs clone() {
        return (Gs)cloneContent(new Gs());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Gs cloneShallow() {
        return (Gs)cloneShallowContent(new Gs());
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
            "mme-gs-if",
        };
    }

    /* Access methods for container child: "mme-gs-if". */

    /**
     * Adds container entry "mmeGsIf", using an existing object.
     * @param mmeGsIf The object to add.
     * @return The added child.
     */
    public MmeGsIf addMmeGsIf(MmeGsIf mmeGsIf) throws JNCException {
        this.mmeGsIf = mmeGsIf;
        insertChild(mmeGsIf, childrenNames());
        return mmeGsIf;
    }

    /**
     * Adds container entry "mmeGsIf".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeGsIf addMmeGsIf() throws JNCException {
        MmeGsIf mmeGsIf = new MmeGsIf();
        this.mmeGsIf = mmeGsIf;
        insertChild(mmeGsIf, childrenNames());
        return mmeGsIf;
    }

    /**
     * Deletes container entry "mmeGsIf".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeGsIf() throws JNCException {
        this.mmeGsIf = null;
        String path = "mme-gs-if";
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
        if (child instanceof MmeGsIf) mmeGsIf = (MmeGsIf)child;
    }

}
