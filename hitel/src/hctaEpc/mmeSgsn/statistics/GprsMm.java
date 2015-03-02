/* 
 * @(#)GprsMm.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn.statistics;

import Attach;

import AttachFail;

import DetachGroup;

import Element;

import ElementChildrenIterator;

import Epc;

import General;

import Irau;

import IrauFail;

import JNCException;

import Misc;

import Procedure;

import Rau;

import RauFail;

import Security;

import Snr;

import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/statistics/gprsMm"
 * <p>
 * See line 315 in
 * oamPmServerCli.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class GprsMm extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty GprsMm object.
     */
    public GprsMm() {
        super(Epc.NAMESPACE, "gprsMm");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public GprsMm clone() {
        return (GprsMm)cloneContent(new GprsMm());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public GprsMm cloneShallow() {
        return (GprsMm)cloneShallowContent(new GprsMm());
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
            "attach",
            "attachFail",
            "detach-group",
            "general",
            "irau",
            "irauFail",
            "misc",
            "procedure",
            "rau",
            "rauFail",
            "security",
            "snr",
        };
    }

    /* Access methods for list child: "attach". */

    /**
     * Gets list entry "attach", with specified keys.
     */
    public Attach getAttach() throws JNCException {
        String path = "attach";
        return (Attach)searchOne(path);
    }

    /**
     * Iterator method for the list "attach".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator attachIterator() {
        return new ElementChildrenIterator(children, "attach");
    }

    /**
     * Adds list entry "attach", using an existing object.
     * @param attach The object to add.
     * @return The added child.
     */
    public Attach addAttach(Attach attach) throws JNCException {
        insertChild(attach, childrenNames());
        return attach;
    }

    /**
     * Adds list entry "attach".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Attach addAttach() throws JNCException {
        Attach attach = new Attach();
        insertChild(attach, childrenNames());
        return attach;
    }

    /**
     * Deletes list entry "attach", with specified keys.
     */
    public void deleteAttach() throws JNCException {
        String path = "attach";
        delete(path);
    }

    /* Access methods for list child: "attachFail". */

    /**
     * Gets list entry "attachFail", with specified keys.
     */
    public AttachFail getAttachFail() throws JNCException {
        String path = "attachFail";
        return (AttachFail)searchOne(path);
    }

    /**
     * Iterator method for the list "attachFail".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator attachFailIterator() {
        return new ElementChildrenIterator(children, "attachFail");
    }

    /**
     * Adds list entry "attachFail", using an existing object.
     * @param attachFail The object to add.
     * @return The added child.
     */
    public AttachFail addAttachFail(AttachFail attachFail) throws JNCException {
        insertChild(attachFail, childrenNames());
        return attachFail;
    }

    /**
     * Adds list entry "attachFail".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AttachFail addAttachFail() throws JNCException {
        AttachFail attachFail = new AttachFail();
        insertChild(attachFail, childrenNames());
        return attachFail;
    }

    /**
     * Deletes list entry "attachFail", with specified keys.
     */
    public void deleteAttachFail() throws JNCException {
        String path = "attachFail";
        delete(path);
    }

    /* Access methods for list child: "detach-group". */

    /**
     * Gets list entry "detachGroup", with specified keys.
     */
    public DetachGroup getDetachGroup() throws JNCException {
        String path = "detach-group";
        return (DetachGroup)searchOne(path);
    }

    /**
     * Iterator method for the list "detach-group".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator detachGroupIterator() {
        return new ElementChildrenIterator(children, "detach-group");
    }

    /**
     * Adds list entry "detachGroup", using an existing object.
     * @param detachGroup The object to add.
     * @return The added child.
     */
    public DetachGroup addDetachGroup(DetachGroup detachGroup)
            throws JNCException {
        insertChild(detachGroup, childrenNames());
        return detachGroup;
    }

    /**
     * Adds list entry "detachGroup".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public DetachGroup addDetachGroup() throws JNCException {
        DetachGroup detachGroup = new DetachGroup();
        insertChild(detachGroup, childrenNames());
        return detachGroup;
    }

    /**
     * Deletes list entry "detachGroup", with specified keys.
     */
    public void deleteDetachGroup() throws JNCException {
        String path = "detach-group";
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

    /* Access methods for list child: "irau". */

    /**
     * Gets list entry "irau", with specified keys.
     */
    public Irau getIrau() throws JNCException {
        String path = "irau";
        return (Irau)searchOne(path);
    }

    /**
     * Iterator method for the list "irau".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator irauIterator() {
        return new ElementChildrenIterator(children, "irau");
    }

    /**
     * Adds list entry "irau", using an existing object.
     * @param irau The object to add.
     * @return The added child.
     */
    public Irau addIrau(Irau irau) throws JNCException {
        insertChild(irau, childrenNames());
        return irau;
    }

    /**
     * Adds list entry "irau".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Irau addIrau() throws JNCException {
        Irau irau = new Irau();
        insertChild(irau, childrenNames());
        return irau;
    }

    /**
     * Deletes list entry "irau", with specified keys.
     */
    public void deleteIrau() throws JNCException {
        String path = "irau";
        delete(path);
    }

    /* Access methods for list child: "irauFail". */

    /**
     * Gets list entry "irauFail", with specified keys.
     */
    public IrauFail getIrauFail() throws JNCException {
        String path = "irauFail";
        return (IrauFail)searchOne(path);
    }

    /**
     * Iterator method for the list "irauFail".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator irauFailIterator() {
        return new ElementChildrenIterator(children, "irauFail");
    }

    /**
     * Adds list entry "irauFail", using an existing object.
     * @param irauFail The object to add.
     * @return The added child.
     */
    public IrauFail addIrauFail(IrauFail irauFail) throws JNCException {
        insertChild(irauFail, childrenNames());
        return irauFail;
    }

    /**
     * Adds list entry "irauFail".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public IrauFail addIrauFail() throws JNCException {
        IrauFail irauFail = new IrauFail();
        insertChild(irauFail, childrenNames());
        return irauFail;
    }

    /**
     * Deletes list entry "irauFail", with specified keys.
     */
    public void deleteIrauFail() throws JNCException {
        String path = "irauFail";
        delete(path);
    }

    /* Access methods for list child: "misc". */

    /**
     * Gets list entry "misc", with specified keys.
     */
    public Misc getMisc() throws JNCException {
        String path = "misc";
        return (Misc)searchOne(path);
    }

    /**
     * Iterator method for the list "misc".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator miscIterator() {
        return new ElementChildrenIterator(children, "misc");
    }

    /**
     * Adds list entry "misc", using an existing object.
     * @param misc The object to add.
     * @return The added child.
     */
    public Misc addMisc(Misc misc) throws JNCException {
        insertChild(misc, childrenNames());
        return misc;
    }

    /**
     * Adds list entry "misc".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Misc addMisc() throws JNCException {
        Misc misc = new Misc();
        insertChild(misc, childrenNames());
        return misc;
    }

    /**
     * Deletes list entry "misc", with specified keys.
     */
    public void deleteMisc() throws JNCException {
        String path = "misc";
        delete(path);
    }

    /* Access methods for list child: "procedure". */

    /**
     * Gets list entry "procedure", with specified keys.
     */
    public Procedure getProcedure() throws JNCException {
        String path = "procedure";
        return (Procedure)searchOne(path);
    }

    /**
     * Iterator method for the list "procedure".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator procedureIterator() {
        return new ElementChildrenIterator(children, "procedure");
    }

    /**
     * Adds list entry "procedure", using an existing object.
     * @param procedure The object to add.
     * @return The added child.
     */
    public Procedure addProcedure(Procedure procedure) throws JNCException {
        insertChild(procedure, childrenNames());
        return procedure;
    }

    /**
     * Adds list entry "procedure".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Procedure addProcedure() throws JNCException {
        Procedure procedure = new Procedure();
        insertChild(procedure, childrenNames());
        return procedure;
    }

    /**
     * Deletes list entry "procedure", with specified keys.
     */
    public void deleteProcedure() throws JNCException {
        String path = "procedure";
        delete(path);
    }

    /* Access methods for list child: "rau". */

    /**
     * Gets list entry "rau", with specified keys.
     */
    public Rau getRau() throws JNCException {
        String path = "rau";
        return (Rau)searchOne(path);
    }

    /**
     * Iterator method for the list "rau".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator rauIterator() {
        return new ElementChildrenIterator(children, "rau");
    }

    /**
     * Adds list entry "rau", using an existing object.
     * @param rau The object to add.
     * @return The added child.
     */
    public Rau addRau(Rau rau) throws JNCException {
        insertChild(rau, childrenNames());
        return rau;
    }

    /**
     * Adds list entry "rau".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rau addRau() throws JNCException {
        Rau rau = new Rau();
        insertChild(rau, childrenNames());
        return rau;
    }

    /**
     * Deletes list entry "rau", with specified keys.
     */
    public void deleteRau() throws JNCException {
        String path = "rau";
        delete(path);
    }

    /* Access methods for list child: "rauFail". */

    /**
     * Gets list entry "rauFail", with specified keys.
     */
    public RauFail getRauFail() throws JNCException {
        String path = "rauFail";
        return (RauFail)searchOne(path);
    }

    /**
     * Iterator method for the list "rauFail".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator rauFailIterator() {
        return new ElementChildrenIterator(children, "rauFail");
    }

    /**
     * Adds list entry "rauFail", using an existing object.
     * @param rauFail The object to add.
     * @return The added child.
     */
    public RauFail addRauFail(RauFail rauFail) throws JNCException {
        insertChild(rauFail, childrenNames());
        return rauFail;
    }

    /**
     * Adds list entry "rauFail".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public RauFail addRauFail() throws JNCException {
        RauFail rauFail = new RauFail();
        insertChild(rauFail, childrenNames());
        return rauFail;
    }

    /**
     * Deletes list entry "rauFail", with specified keys.
     */
    public void deleteRauFail() throws JNCException {
        String path = "rauFail";
        delete(path);
    }

    /* Access methods for list child: "security". */

    /**
     * Gets list entry "security", with specified keys.
     */
    public Security getSecurity() throws JNCException {
        String path = "security";
        return (Security)searchOne(path);
    }

    /**
     * Iterator method for the list "security".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator securityIterator() {
        return new ElementChildrenIterator(children, "security");
    }

    /**
     * Adds list entry "security", using an existing object.
     * @param security The object to add.
     * @return The added child.
     */
    public Security addSecurity(Security security) throws JNCException {
        insertChild(security, childrenNames());
        return security;
    }

    /**
     * Adds list entry "security".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Security addSecurity() throws JNCException {
        Security security = new Security();
        insertChild(security, childrenNames());
        return security;
    }

    /**
     * Deletes list entry "security", with specified keys.
     */
    public void deleteSecurity() throws JNCException {
        String path = "security";
        delete(path);
    }

    /* Access methods for list child: "snr". */

    /**
     * Gets list entry "snr", with specified keys.
     */
    public Snr getSnr() throws JNCException {
        String path = "snr";
        return (Snr)searchOne(path);
    }

    /**
     * Iterator method for the list "snr".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator snrIterator() {
        return new ElementChildrenIterator(children, "snr");
    }

    /**
     * Adds list entry "snr", using an existing object.
     * @param snr The object to add.
     * @return The added child.
     */
    public Snr addSnr(Snr snr) throws JNCException {
        insertChild(snr, childrenNames());
        return snr;
    }

    /**
     * Adds list entry "snr".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Snr addSnr() throws JNCException {
        Snr snr = new Snr();
        insertChild(snr, childrenNames());
        return snr;
    }

    /**
     * Deletes list entry "snr", with specified keys.
     */
    public void deleteSnr() throws JNCException {
        String path = "snr";
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