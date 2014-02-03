/**
 * 
 */
package cz.martinbayer.analyser.processors;

import cz.martinbayer.analyser.processors.model.IXMLog;
import cz.martinbayer.analyser.processors.types.LogProcessor;


/**
 * @author Martin Bayer
 */
public interface IProcessorLogic<T extends IXMLog> {

	public LogProcessor<T> getProcessor();
}
