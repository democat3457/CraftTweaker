package crafttweaker.api.formatting;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.text.ITextComponent;
import stanhebben.zenscript.annotations.*;

/**
 * @author Stan
 */
@ZenClass("crafttweaker.formatting.IFormattedText")
@ZenRegister
public interface IFormattedText {
    
    @ZenOperator(OperatorType.ADD)
    IFormattedText add(IFormattedText other);
    
    @ZenOperator(OperatorType.CAT)
    IFormattedText cat(IFormattedText other);
    
    String getText();

    @ZenCaster
    @ZenMethod
    default ITextComponent asTextComponent() {
        CraftTweakerAPI.logError(this.getClass().getCanonicalName() + " doesn't override IFormattedText#asTextComponent! It is a bug!");
        return null;
    }
}
