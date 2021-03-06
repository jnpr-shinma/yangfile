/* 
 * @(#)Gtpv1.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.statistics;

import AccessFlex;

import Element;

import ElementChildrenIterator;

import Epc;

import General;

import JNCException;

import Mobility;

import Path;

import Tunnel;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/statistics/gtpV1"
 * <p>
 * See line 653 in
 * oamPmServerCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Gtpv1 extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Gtpv1 object.
     */
    public Gtpv1() {
        super(Epc.NAMESPACE, "gtpV1");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Gtpv1 clone() {
        return (Gtpv1)cloneContent(new Gtpv1());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Gtpv1 cloneShallow() {
        return (Gtpv1)cloneShallowContent(new Gtpv1());
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
            "accessFlex",
            "general",
            "mobility",
            "path",
            "tunnel",
        };
    }

    /* Access methods for list child: "accessFlex". */

    /**
     * Gets list entry "accessFlex", with specified keys.
     */
    public AccessFlex getAccessFlex() throws JNCException {
        String path = "accessFlex";
        return (AccessFlex)searchOne(path);
    }

    /**
     * Iterator method for the list "accessFlex".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator accessFlexIterator() {
        return new ElementChildrenIterator(children, "accessFlex");
    }

    /**
     * Adds list entry "accessFlex", using an existing object.
     * @param accessFlex The object to add.
     * @return The added child.
     */
    public AccessFlex addAccessFlex(AccessFlex accessFlex) throws JNCException {
        insertChild(accessFlex, childrenNames());
        return accessFlex;
    }

    /**
     * Adds list entry "accessFlex".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AccessFlex addAccessFlex() throws JNCException {
        AccessFlex accessFlex = new AccessFlex();
        insertChild(accessFlex, childrenNames());
        return accessFlex;
    }

    /**
     * Deletes list entry "accessFlex", with specified keys.
     */
    public void deleteAccessFlex() throws JNCException {
        String path = "accessFlex";
        delete(path);
    }

    /* Access methods for list child: "general". */

    /**
     * Gets list entry "general", with specified keys.
     */
    public General getGeneral() throws JNCException {
        String path = "general";
        return (General)searchOne(path);
    }

    /**
     * Iterator method for the list "general".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator generalIterator() {
        return new ElementChildrenIterator(children, "general");
    }

    /**
     * Adds list entry "general", using an existing object.
     * @param general The object to add.
     * @return The added child.
     */
    public General addGeneral(General general) throws JNCException {
        insertChild(general, childrenNames());
        return general;
    }

    /**
     * Adds list entry "general".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public General addGeneral() throws JNCException {
        General general = new General();
        insertChild(general, childrenNames());
        return general;
    }

    /**
     * Deletes list entry "general", with specified keys.
     */
    public void deleteGeneral() throws JNCException {
        String path = "general";
        delete(path);
    }

    /* Access methods for list child: "mobility". */

    /**
     * Gets list entry "mobility", with specified keys.
     */
    public Mobility getMobility() throws JNCException {
        String path = "mobility";
        return (Mobility)searchOne(path);
    }

    /**
     * Iterator method for the list "mobility".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator mobilityIterator() {
        return new ElementChildrenIterator(children, "mobility");
    }

    /**
     * Adds list entry "mobility", using an existing object.
     * @param mobility The object to add.
     * @return The added child.
     */
    public Mobility addMobility(Mobility mobility) throws JNCException {
        insertChild(mobility, childrenNames());
        return mobility;
    }

    /**
     * Adds list entry "mobility".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Mobility addMobility() throws JNCException {
        Mobility mobility = new Mobility();
        insertChild(mobility, childrenNames());
        return mobility;
    }

    /**
     * Deletes list entry "mobility", with specified keys.
     */
    public void deleteMobility() throws JNCException {
        String path = "mobility";
        delete(path);
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

    /* Access methods for list child: "tunnel". */

    /**
     * Gets list entry "tunnel", with specified keys.
     */
    public Tunnel getTunnel() throws JNCException {
        String path = "tunnel";
        return (Tunnel)searchOne(path);
    }

    /**
     * Iterator method for the list "tunnel".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator tunnelIterator() {
        return new ElementChildrenIterator(children, "tunnel");
    }

    /**
     * Adds list entry "tunnel", using an existing object.
     * @param tunnel The object to add.
     * @return The added child.
     */
    public Tunnel addTunnel(Tunnel tunnel) throws JNCException {
        insertChild(tunnel, childrenNames());
        return tunnel;
    }

    /**
     * Adds list entry "tunnel".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Tunnel addTunnel() throws JNCException {
        Tunnel tunnel = new Tunnel();
        insertChild(tunnel, childrenNames());
        return tunnel;
    }

    /**
     * Deletes list entry "tunnel", with specified keys.
     */
    public void deleteTunnel() throws JNCException {
        String path = "tunnel";
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
