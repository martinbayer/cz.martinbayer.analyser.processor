package cz.martinbayer.analyser.processors;

import cz.martinbayer.analyser.processors.model.IXMLog;

public interface IProcessorItemWrapper<T extends IXMLog> {
	IProcessorLogic<T> getProcessorLogic();
	
	IProcessorsPaletteItem getProcessorPaletteItem();
	
}
