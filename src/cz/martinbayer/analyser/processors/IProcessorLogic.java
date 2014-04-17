/**
 * 
 */
package cz.martinbayer.analyser.processors;

import java.io.Serializable;

import cz.martinbayer.analyser.processors.model.IE4LogsisLog;
import cz.martinbayer.analyser.processors.types.LogProcessor;

/**
 * @author Martin Bayer
 */
public interface IProcessorLogic<T extends IE4LogsisLog> extends Serializable {

	public LogProcessor<T> getProcessor();
}
