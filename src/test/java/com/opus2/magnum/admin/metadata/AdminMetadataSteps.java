package com.opus2.magnum.admin.metadata;

import net.thucydides.core.annotations.Step;

public class AdminMetadataSteps {
    AdminMetadata user;
    
    @Step()
    public String assertDIP() {
        return "TDIP";
    }

    @Step()
    public void edit(String column) {
        user.edit(column);
    }
    
    @Step()
    public void checkChronologyToPreview() {
        user.checkChronologyToPreview();
    }
    
    @Step()
    public void apply() {
        user.apply();
    }
}
