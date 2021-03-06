package crafttweaker.mc1120.events.handling;

import crafttweaker.api.event.BlockNeighborNotifyEvent;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.world.IFacing;
import net.minecraftforge.event.world.BlockEvent;

/**
 * @author youyihj
 */
public class MCBlockNeighborNotifyEvent extends MCBlockEvent implements BlockNeighborNotifyEvent {
    private final BlockEvent.NeighborNotifyEvent event;

    public MCBlockNeighborNotifyEvent(BlockEvent.NeighborNotifyEvent event) {
        super(event);
        this.event = event;
    }

    @Override
    public boolean getForceRedstoneUpdate() {
        return event.getForceRedstoneUpdate();
    }

    @Override
    public IFacing[] notifiedSides() {
        return event.getNotifiedSides().stream().map(CraftTweakerMC::getIFacing).toArray(IFacing[]::new);
    }

    @Override
    public boolean isCanceled() {
        return event.isCanceled();
    }

    @Override
    public void setCanceled(boolean canceled) {
        event.setCanceled(canceled);
    }
}
