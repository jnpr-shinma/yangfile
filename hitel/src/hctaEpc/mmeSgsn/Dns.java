/* 
 * @(#)Dns.java        1.0 09/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "hcta-epc", revision: "2014-09-18".
 */

package hctaEpc.mmeSgsn;

import AgwDnsIf;

import AgwDnsServer;

import DynamicCache;

import DynamicCacheOper;

import Element;

import ElementChildrenIterator;

import Epc;

import JNCException;

import NodeSet;

import ServerOper;

import StaticCache;

import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://hitachi-cta.com/ns/epc
 * generated to "src/hctaEpc/mmeSgsn/dns"
 * <p>
 * See line 22 in
 * agwCmnDnsConfig.yang
 *
 * @version 1.0 2014-12-09
 * @author Auto Generated
 */
public class Dns extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "static-cache".
     */
    public StaticCache staticCache = null;

    /**
     * Field for child container "agw-dns-if".
     */
    public AgwDnsIf agwDnsIf = null;

    /**
     * Field for child container "dynamic-cache".
     */
    public DynamicCache dynamicCache = null;

    /**
     * Field for child container "dynamic-cache-oper".
     */
    public DynamicCacheOper dynamicCacheOper = null;

    /**
     * Constructor for an empty Dns object.
     */
    public Dns() {
        super(Epc.NAMESPACE, "dns");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Dns clone() {
        return (Dns)cloneContent(new Dns());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Dns cloneShallow() {
        return (Dns)cloneShallowContent(new Dns());
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
            "agw-dns-server",
            "static-cache",
            "agw-dns-if",
            "dynamic-cache",
            "dynamic-cache-oper",
            "server-oper",
        };
    }

    /* Access methods for list child: "agw-dns-server". */

    /**
     * Gets list entry "agwDnsServer", with specified keys.
     * @param serverNameValue Key argument of child.
     */
    public AgwDnsServer getAgwDnsServer(YangString serverNameValue)
            throws JNCException {
        String path = "agw-dns-server[serverName='" + serverNameValue + "']";
        return (AgwDnsServer)searchOne(path);
    }

    /**
     * Gets list entry "agwDnsServer", with specified keys.
     * The keys are specified as strings.
     * @param serverNameValue Key argument of child.
     */
    public AgwDnsServer getAgwDnsServer(String serverNameValue)
            throws JNCException {
        String path = "agw-dns-server[serverName='" + serverNameValue + "']";
        return (AgwDnsServer)searchOne(path);
    }

    /**
     * Iterator method for the list "agw-dns-server".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator agwDnsServerIterator() {
        return new ElementChildrenIterator(children, "agw-dns-server");
    }

    /**
     * Adds list entry "agwDnsServer", using an existing object.
     * @param agwDnsServer The object to add.
     * @return The added child.
     */
    public AgwDnsServer addAgwDnsServer(AgwDnsServer agwDnsServer)
            throws JNCException {
        insertChild(agwDnsServer, childrenNames());
        return agwDnsServer;
    }

    /**
     * Adds list entry "agwDnsServer", with specified keys.
     * @param serverNameValue Key argument of child.
     * @return The added child.
     */
    public AgwDnsServer addAgwDnsServer(YangString serverNameValue)
            throws JNCException {
        AgwDnsServer agwDnsServer = new AgwDnsServer(serverNameValue);
        return addAgwDnsServer(agwDnsServer);
    }

    /**
     * Adds list entry "agwDnsServer", with specified keys.
     * The keys are specified as strings.
     * @param serverNameValue Key argument of child.
     * @return The added child.
     */
    public AgwDnsServer addAgwDnsServer(String serverNameValue)
            throws JNCException {
        AgwDnsServer agwDnsServer = new AgwDnsServer(serverNameValue);
        return addAgwDnsServer(agwDnsServer);
    }

    /**
     * Adds list entry "agwDnsServer".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AgwDnsServer addAgwDnsServer() throws JNCException {
        AgwDnsServer agwDnsServer = new AgwDnsServer();
        insertChild(agwDnsServer, childrenNames());
        return agwDnsServer;
    }

    /**
     * Deletes list entry "agwDnsServer", with specified keys.
     * @param serverNameValue Key argument of child.
     */
    public void deleteAgwDnsServer(YangString serverNameValue)
            throws JNCException {
        String path = "agw-dns-server[serverName='" + serverNameValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "agwDnsServer", with specified keys.
     * The keys are specified as strings.
     * @param serverNameValue Key argument of child.
     */
    public void deleteAgwDnsServer(String serverNameValue) throws JNCException {
        String path = "agw-dns-server[serverName='" + serverNameValue + "']";
        delete(path);
    }

    /* Access methods for container child: "static-cache". */

    /**
     * Adds container entry "staticCache", using an existing object.
     * @param staticCache The object to add.
     * @return The added child.
     */
    public StaticCache addStaticCache(StaticCache staticCache)
            throws JNCException {
        this.staticCache = staticCache;
        insertChild(staticCache, childrenNames());
        return staticCache;
    }

    /**
     * Adds container entry "staticCache".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public StaticCache addStaticCache() throws JNCException {
        StaticCache staticCache = new StaticCache();
        this.staticCache = staticCache;
        insertChild(staticCache, childrenNames());
        return staticCache;
    }

    /**
     * Deletes container entry "staticCache".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteStaticCache() throws JNCException {
        this.staticCache = null;
        String path = "static-cache";
        return delete(path);
    }

    /* Access methods for container child: "agw-dns-if". */

    /**
     * Adds container entry "agwDnsIf", using an existing object.
     * @param agwDnsIf The object to add.
     * @return The added child.
     */
    public AgwDnsIf addAgwDnsIf(AgwDnsIf agwDnsIf) throws JNCException {
        this.agwDnsIf = agwDnsIf;
        insertChild(agwDnsIf, childrenNames());
        return agwDnsIf;
    }

    /**
     * Adds container entry "agwDnsIf".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AgwDnsIf addAgwDnsIf() throws JNCException {
        AgwDnsIf agwDnsIf = new AgwDnsIf();
        this.agwDnsIf = agwDnsIf;
        insertChild(agwDnsIf, childrenNames());
        return agwDnsIf;
    }

    /**
     * Deletes container entry "agwDnsIf".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAgwDnsIf() throws JNCException {
        this.agwDnsIf = null;
        String path = "agw-dns-if";
        return delete(path);
    }

    /* Access methods for container child: "dynamic-cache". */

    /**
     * Adds container entry "dynamicCache", using an existing object.
     * @param dynamicCache The object to add.
     * @return The added child.
     */
    public DynamicCache addDynamicCache(DynamicCache dynamicCache)
            throws JNCException {
        this.dynamicCache = dynamicCache;
        insertChild(dynamicCache, childrenNames());
        return dynamicCache;
    }

    /**
     * Adds container entry "dynamicCache".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public DynamicCache addDynamicCache() throws JNCException {
        DynamicCache dynamicCache = new DynamicCache();
        this.dynamicCache = dynamicCache;
        insertChild(dynamicCache, childrenNames());
        return dynamicCache;
    }

    /**
     * Deletes container entry "dynamicCache".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDynamicCache() throws JNCException {
        this.dynamicCache = null;
        String path = "dynamic-cache";
        return delete(path);
    }

    /* Access methods for container child: "dynamic-cache-oper". */

    /**
     * Adds container entry "dynamicCacheOper", using an existing object.
     * @param dynamicCacheOper The object to add.
     * @return The added child.
     */
    public DynamicCacheOper addDynamicCacheOper(DynamicCacheOper dynamicCacheOper)
            throws JNCException {
        this.dynamicCacheOper = dynamicCacheOper;
        insertChild(dynamicCacheOper, childrenNames());
        return dynamicCacheOper;
    }

    /**
     * Adds container entry "dynamicCacheOper".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public DynamicCacheOper addDynamicCacheOper() throws JNCException {
        DynamicCacheOper dynamicCacheOper = new DynamicCacheOper();
        this.dynamicCacheOper = dynamicCacheOper;
        insertChild(dynamicCacheOper, childrenNames());
        return dynamicCacheOper;
    }

    /**
     * Deletes container entry "dynamicCacheOper".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDynamicCacheOper() throws JNCException {
        this.dynamicCacheOper = null;
        String path = "dynamic-cache-oper";
        return delete(path);
    }

    /* Access methods for list child: "server-oper". */

    /**
     * Gets list entry "serverOper", with specified keys.
     */
    public ServerOper getServerOper() throws JNCException {
        String path = "server-oper";
        return (ServerOper)searchOne(path);
    }

    /**
     * Iterator method for the list "server-oper".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator serverOperIterator() {
        return new ElementChildrenIterator(children, "server-oper");
    }

    /**
     * Adds list entry "serverOper", using an existing object.
     * @param serverOper The object to add.
     * @return The added child.
     */
    public ServerOper addServerOper(ServerOper serverOper) throws JNCException {
        insertChild(serverOper, childrenNames());
        return serverOper;
    }

    /**
     * Adds list entry "serverOper".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public ServerOper addServerOper() throws JNCException {
        ServerOper serverOper = new ServerOper();
        insertChild(serverOper, childrenNames());
        return serverOper;
    }

    /**
     * Deletes list entry "serverOper", with specified keys.
     */
    public void deleteServerOper() throws JNCException {
        String path = "server-oper";
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
        if (child instanceof StaticCache) staticCache = (StaticCache)child;
        else if (child instanceof AgwDnsIf) agwDnsIf = (AgwDnsIf)child;
        else if (child instanceof DynamicCache) dynamicCache = (DynamicCache)child;
        else if (child instanceof DynamicCacheOper) dynamicCacheOper = (DynamicCacheOper)child;
    }

}