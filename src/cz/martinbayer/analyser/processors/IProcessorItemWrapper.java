package cz.martinbayer.analyser.processors;

import org.eclipse.swt.events.MouseEvent;

import cz.martinbayer.analyser.processors.model.IXMLog;

public interface IProcessorItemWrapper<T extends IXMLog> {
	IProcessorLogic<T> getProcessorLogic();

	IProcessorsPaletteItem getProcessorPaletteItem();

	void mouseDoubleClicked(MouseEvent e);

}
