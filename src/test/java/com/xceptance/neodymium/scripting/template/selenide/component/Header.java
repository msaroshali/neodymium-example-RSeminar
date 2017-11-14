package com.xceptance.neodymium.scripting.template.selenide.component;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class Header extends AbstractComponent
{
    public void isComponentAvailable()
    {
        $("body > header nav#globalNavigation").should(exist);
    }
}
