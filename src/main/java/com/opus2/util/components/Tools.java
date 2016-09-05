package com.opus2.util.components;

import com.opus2.enums.Tool;
import com.opus2.util.components.impl.ToolsImpl;

import net.serenitybdd.core.annotations.ImplementedBy;

@ImplementedBy(ToolsImpl.class)
public interface Tools extends Component {
	void getOption(Tool page, String option);

}
