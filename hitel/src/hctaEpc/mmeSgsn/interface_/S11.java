/* 
 * @(#)S11.java        1.0 09/12/14
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

import MmeS11If;

import NodeSet;

import Path;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/s11"
 * <p>
 * See line 282 in
 * upmConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class S11 extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "mme-s11-if".
     */
    public MmeS11If mmeS11If = null;

    /**
     * Constructor for an empty S11 object.
     */
    public S11() {
        super(Epc.NAMESPACE, "s11");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public S11 clone() {
        return (S11)cloneContent(new S11());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public S11 cloneShallow() {
        return (S11)cloneShallowContent(new S11());
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
            "mme-s11-if",
            "path",
        };
    }

    /* Access methods for container child: "mme-s11-if". */

    /**
     * Adds container entry "mmeS11If", using an existing object.
     * @param mmeS11If The object to add.
     * @return The added child.
     */
    public MmeS11If addMmeS11If(MmeS11If mmeS11If) throws JNCException {
        this.mmeS11If = mmeS11If;
        insertChild(mmeS11If, childrenNames());
        return mmeS11If;
    }

    /**
     * Adds container entry "mmeS11If".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MmeS11If addMmeS11If() throws JNCException {
        MmeS11If mmeS11If = new MmeS11If();
        this.mmeS11If = mmeS11If;
        insertChild(mmeS11If, childrenNames());
        return mmeS11If;
    }

    /**
     * Deletes container entry "mmeS11If".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMmeS11If() throws JNCException {
        this.mmeS11If = null;
        String path = "mme-s11-if";
        return delete(path);
    }

    /* Access methods for list child: "path". */

    /**
     * Gets list entry "path", with specified keys.
     */
    public Path getPath() throws JNCException {
        String path = "path";
        return (Path)searchOne(path);
    }

    /**
     * Iterator method for the list "path".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator pathIterator() {
        return new ElementChildrenIterator(children, "path");
    }

    /**
     * Adds list entry "path", using an existing object.
     * @param path The object to add.
     * @return The added child.
     */
    public Path addPath(Path path) throws JNCException {
        insertChild(path, childrenNames());
        return path;
    }

    /**
     * Adds list entry "path".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Path addPath() throws JNCException {
        Path path = new Path();
        insertChild(path, childrenNames());
        return path;
    }

    /**
     * Deletes list entry "path", with specified keys.
     */
    public void deletePath() throws JNCException {
        String path = "path";
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
        if (child instanceof MmeS11If) mmeS11If = (MmeS11If)child;
    }

}
