package cz.martinbayer.analyser.processors;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import cz.martinbayer.analyser.processors.model.IXMLog;
import cz.martinbayer.analyser.processors.types.LogProcessor;
import cz.martinbayer.utils.ImageUtils;
import cz.martinbayer.utils.StringUtils;

public abstract class BasicProcessorPaletteItem implements
		IProcessorsPaletteItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7901153044601272130L;

	private Class<? extends LogProcessor<? extends IXMLog>> clazz;

	/** Path must be initialized before image is gained */
	protected String imagePath;
	protected String disabledImagePath;

	@Override
	public ImageDescriptor getImageDescriptor() {
		return prepareImgDesc(imagePath);
	}

	@Override
	public ImageDescriptor getSmallImageDescriptor() {
		return ImageUtils.resize(prepareImgDesc(imagePath), 20, 20, true);
	}

	@Override
	public ImageDescriptor getImageDescriptor(int width, int height) {
		return ImageUtils
				.resize(prepareImgDesc(imagePath), width, height, true);
	}

	@Override
	public ImageDescriptor getDisabledImageDescriptor() {
		return prepareImgDesc(disabledImagePath);
	}

	@Override
	public ImageDescriptor getDisabledSmallImageDescriptor() {
		return ImageUtils.resize(prepareImgDesc(disabledImagePath), 20, 20,
				true);
	}

	@Override
	public ImageDescriptor getDisabledImageDescriptor(int width, int height) {
		return ImageUtils.resize(prepareImgDesc(disabledImagePath), width,
				height, true);
	}

	@Override
	public void setType(Class<? extends LogProcessor<? extends IXMLog>> clazz) {
		this.clazz = clazz;
	}

	@Override
	public Class<? extends LogProcessor<? extends IXMLog>> getType() {
		return this.clazz;
	}

	/**
	 * Prepares image descriptor
	 * 
	 * @param path
	 *            - path to the image in bundle context
	 * @return - {@link ImageDescriptor} in case the immage is found, otherwise
	 *         NULL
	 */
	protected final ImageDescriptor prepareImgDesc(String path) {
		if (StringUtils.isEmtpy(path)) {
			return null;
		}
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		URL url = FileLocator.find(bundle, new Path(path), null);
		return ImageDescriptor.createFromURL(url);
	}
}
