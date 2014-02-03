/**
 * 
 */
package cz.martinbayer.analyser.processors;

import org.eclipse.jface.resource.ImageDescriptor;

import cz.martinbayer.analyser.processors.model.IXMLog;
import cz.martinbayer.analyser.processors.types.LogProcessor;

/**
 * @author Martin Bayer
 */
public interface IProcessorsPaletteItem {

	public ImageDescriptor getImageDescriptor();

	public ImageDescriptor getSmallImageDescriptor();

	public ImageDescriptor getImageDescriptor(int width, int height);

	public void setType(Class<? extends LogProcessor<? extends IXMLog>> clazz);

	public Class<? extends LogProcessor<? extends IXMLog>> getType();
	
	public String getLabel();
}
