/* 
 * @(#)S10.java        1.0 09/12/14
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

import Path;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/interface_/s10"
 * <p>
 * See line 309 in
 * upmCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class S10 extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty S10 object.
     */
    public S10() {
        super(Epc.NAMESPACE, "s10");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public S10 clone() {
        return (S10)cloneContent(new S10());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public S10 cloneShallow() {
        return (S10)cloneShallowContent(new S10());
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
            "path",
        };
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
    }

}
