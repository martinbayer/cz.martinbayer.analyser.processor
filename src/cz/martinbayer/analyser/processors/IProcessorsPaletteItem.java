/**
 * 
 */
package cz.martinbayer.analyser.processors;

import java.io.Serializable;

import org.eclipse.jface.resource.ImageDescriptor;

import cz.martinbayer.analyser.processors.model.IE4LogsisLog;
import cz.martinbayer.analyser.processors.types.LogProcessor;

/**
 * @author Martin Bayer
 */
public interface IProcessorsPaletteItem extends Serializable {

	/**
	 * Creates image descriptor for image - no resizing provided
	 * 
	 * @return - non-resized image descriptor
	 */
	public ImageDescriptor getImageDescriptor();

	/**
	 * Creates image descriptor for image - method should return image in size =
	 * 20x20px
	 * 
	 * @return - image descriptor resized to 20x20px
	 */
	public ImageDescriptor getSmallImageDescriptor();

	/**
	 * Creates image descriptor for image - method should return image in size =
	 * 20x20px
	 * 
	 * @return - image descriptor resized to width x height but keeping aspect
	 *         ratio
	 */
	public ImageDescriptor getImageDescriptor(int width, int height);

	public void setType(Class<? extends LogProcessor<? extends IE4LogsisLog>> clazz);

	public Class<? extends LogProcessor<? extends IE4LogsisLog>> getType();

	public String getLabel();

	public ImageDescriptor getDisabledImageDescriptor();

	public ImageDescriptor getDisabledSmallImageDescriptor();

	public ImageDescriptor getDisabledImageDescriptor(int width, int height);
}
