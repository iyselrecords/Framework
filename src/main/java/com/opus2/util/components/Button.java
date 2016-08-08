package com.opus2.util.components;

import com.opus2.util.components.impl.ButtonImpl;

import net.serenitybdd.core.annotations.ImplementedBy;

@ImplementedBy(ButtonImpl.class)
public interface Button extends Component {
  void click();
}
