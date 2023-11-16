/**
 * Copyright (C) 2011-2015 The XDocReport Team <xdocreport@googlegroups.com>
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package fr.opensagres.xdocreport.converter.internal.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import fr.opensagres.xdocreport.converter.ConverterRegistry;

/**
 * OSGi Activator to initialize/dispose converter registry when bundle start/stop.
 */
public class Activator
    implements BundleActivator
{

    public void start( BundleContext context )
        throws Exception
    {
        ClassLoader backup = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader( getClass().getClassLoader() );
        ConverterRegistry.getRegistry().initialize();
        Thread.currentThread().setContextClassLoader( backup );
        // TODO : discuss with Angelo to behave that way under OSGi context :
        // Collection<String> froms = ConverterRegistry.getRegistry().getFroms();
        // for (String from : froms) {
        // ConverterFrom converterFrom = ConverterRegistry.getRegistry()
        // .getConverterFrom(from);
        // Collection<ConverterTo> tos = converterFrom.getConvertersTo();
        // for (ConverterTo to : tos) {
        // Collection<String> vias = to.getVias();
        // for (String via : vias) {
        // Dictionary<String, String> properties=new java.util.Hashtable<String,String>();
        // properties.put("From", from);
        // properties.put("to", to.getTo());
        // properties.put("via", via);
        // ServiceRegistration registration= context.registerService(IConverter.class.getName(),
        // ConverterRegistry.getRegistry().findConverter(from, to.getTo(), via),
        // properties);
        //
        // }
        //
        // }
        // }

    }

    public void stop( BundleContext context )
        throws Exception
    {
        ConverterRegistry.getRegistry().dispose();
        // later :
        // registration.unregister();
    }

}
