package com.company.demo.web.gui.components;

import com.haulmont.cuba.gui.components.Field;
import com.haulmont.cuba.gui.meta.PropertyType;
import com.haulmont.cuba.gui.meta.StudioComponent;
import com.haulmont.cuba.gui.meta.StudioProperties;
import com.haulmont.cuba.gui.meta.StudioProperty;

import javax.validation.constraints.Positive;

// note that Stepper should extend Field
@StudioComponent(category = "Samples",
        unsupportedProperties = {"description", "icon", "responsive"},
        xmlns = "http://schemas.company.com/demo/0.1/ui-component.xsd",
        xmlnsAlias = "app",
        icon = "com/company/demo/web/gui/components/icons/stepper.svg")
@StudioProperties(properties = {
        @StudioProperty(name = "datasource", type = PropertyType.DATASOURCE_REF),
        @StudioProperty(name = "property", type = PropertyType.PROPERTY_PATH_REF, options = "int"),
})
public interface Stepper extends Field<Integer> {

    String NAME = "stepper";

    @StudioProperty(name = "manualInput", type = PropertyType.BOOLEAN, defaultValue = "true")
    void setManualInputAllowed(boolean value);
    boolean isManualInputAllowed();

    @StudioProperty(name = "mouseWheel", type = PropertyType.BOOLEAN, defaultValue = "true")
    void setMouseWheelEnabled(boolean value);
    boolean isMouseWheelEnabled();

    @StudioProperty(type = PropertyType.INTEGER, defaultValue = "1")
    @Positive
    void setStepAmount(int amount);
    int getStepAmount();

    @StudioProperty(type = PropertyType.INTEGER)
    void setMaxValue(int maxValue);
    int getMaxValue();

    @StudioProperty(type = PropertyType.INTEGER)
    void setMinValue(int minValue);
    int getMinValue();
}