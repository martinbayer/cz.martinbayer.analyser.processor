package cz.martinbayer.analyser.processors;

import java.io.Serializable;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.events.MouseEvent;

import cz.martinbayer.analyser.processors.model.IE4LogsisLog;

public interface IProcessorItemWrapper<T extends IE4LogsisLog> extends
		Serializable {
	public static final String SERVICE_NAME = "IProcessorItemWrapper";

	IProcessorLogic<T> getProcessorLogic();

	IProcessorsPaletteItem getProcessorPaletteItem();

	void mouseDoubleClicked(MouseEvent e);

	/**
	 * Returns wrapper which contains distinct processor logic instance created
	 * 
	 * @return
	 */
	IProcessorItemWrapper<T> getInstance();

	/**
	 * Best way to set eclipse context is via DI so annotate the method with @Inject
	 * annotation and inject the proper value when instance is gained as service
	 * with {@link ContextInjectionFactory#inject(Object, IEclipseContext)}
	 * 
	 * @param ctx
	 */
	void setContext(IEclipseContext ctx);
}
