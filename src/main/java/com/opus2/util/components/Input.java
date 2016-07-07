package com.opus2.util.components;

import com.opus2.util.components.impl.InputImpl;

import net.serenitybdd.core.annotations.ImplementedBy;

@ImplementedBy(InputImpl.class)
public interface Input extends Component {
void fill(String value);
}
