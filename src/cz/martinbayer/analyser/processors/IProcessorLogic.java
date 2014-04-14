/**
 * 
 */
package cz.martinbayer.analyser.processors;

import java.io.Serializable;

import cz.martinbayer.analyser.processors.model.IXMLog;
import cz.martinbayer.analyser.processors.types.LogProcessor;

/**
 * @author Martin Bayer
 */
public interface IProcessorLogic<T extends IXMLog> extends Serializable {

	public LogProcessor<T> getProcessor();
}
