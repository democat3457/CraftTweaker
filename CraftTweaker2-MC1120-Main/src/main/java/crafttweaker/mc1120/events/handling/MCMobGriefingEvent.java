package crafttweaker.mc1120.events.handling;

import crafttweaker.api.entity.IEntity;
import crafttweaker.api.event.MobGriefingEvent;
import crafttweaker.api.minecraft.CraftTweakerMC;
import net.minecraftforge.event.entity.EntityMobGriefingEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

public class MCMobGriefingEvent implements MobGriefingEvent {
    private EntityMobGriefingEvent event;

    public MCMobGriefingEvent(EntityMobGriefingEvent event) {
        this.event = event;
    }

    @Override
    public IEntity getEntity() {
        return CraftTweakerMC.getIEntity(event.getEntity());
    }

    @Override
    public String getResult() {
        return String.valueOf(event.getResult());
    }

    @Override
    public void setDenied() {
        event.setResult(Event.Result.DENY);
    }

    @Override
    public void setDefault() {
        event.setResult(Event.Result.DEFAULT);
    }

    @Override
    public void setAllowed() {
        event.setResult(Event.Result.ALLOW);
    }
}
