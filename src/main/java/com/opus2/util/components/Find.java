package com.opus2.util.components;

import com.opus2.util.components.impl.FindImpl;
import net.serenitybdd.core.annotations.ImplementedBy;

@ImplementedBy(FindImpl.class)
public interface Find extends Component {
	void find(String searchWord);
}
