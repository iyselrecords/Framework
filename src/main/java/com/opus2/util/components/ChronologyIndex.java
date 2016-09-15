package com.opus2.util.components;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.ImplementedBy;

import com.opus2.util.components.impl.ChronologyIndexImpl;

@ImplementedBy(ChronologyIndexImpl.class)
public interface ChronologyIndex extends Component{
    WebElement getIndex();
}
