package crafttweaker.mc1120.util;

import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.util.IAxisAlignedBB;
import crafttweaker.api.world.IVector3d;
import net.minecraft.util.math.AxisAlignedBB;

public class MCAxisAlignedBB implements IAxisAlignedBB {
    private final AxisAlignedBB aabb;

    public MCAxisAlignedBB(AxisAlignedBB aabb) {
        this.aabb = aabb;
    }

    @Override
    public Object getInternal() {
        return this.aabb;
    }

    @Override
    public double getMinX() {
        return aabb.minX;
    }

    @Override
    public double getMinY() {
        return aabb.minY;
    }

    @Override
    public double getMinZ() {
        return aabb.minZ;
    }

    @Override
    public double getMaxX() {
        return aabb.maxX;
    }

    @Override
    public double getMaxY() {
        return aabb.maxY;
    }

    @Override
    public double getMaxZ() {
        return aabb.maxY;
    }

    @Override
    public IVector3d getCenter() {
        return CraftTweakerMC.getIVector3d(aabb.getCenter());
    }

    @Override
    public IAxisAlignedBB contract(double x, double y, double z) {
        return CraftTweakerMC.getIAxisAlignedBB(aabb.contract(x, y, z));
    }

    @Override
    public IAxisAlignedBB expand(double x, double y, double z) {
        return CraftTweakerMC.getIAxisAlignedBB(aabb.expand(x, y, z));
    }

    @Override
    public IAxisAlignedBB grow(double value) {
        return CraftTweakerMC.getIAxisAlignedBB(aabb.grow(value));
    }

    @Override
    public IAxisAlignedBB grow(double x, double y, double z) {
        return CraftTweakerMC.getIAxisAlignedBB(aabb.grow(x, y, z));
    }

    @Override
    public IAxisAlignedBB shrink(double value) {
        return CraftTweakerMC.getIAxisAlignedBB(aabb.shrink(value));
    }

    @Override
    public IAxisAlignedBB intersect(IAxisAlignedBB other) {
        return CraftTweakerMC.getIAxisAlignedBB(aabb.intersect(CraftTweakerMC.getAxisAlignedBB(other)));
    }

    @Override
    public boolean intersects(IAxisAlignedBB other) {
        return aabb.intersects(CraftTweakerMC.getAxisAlignedBB(other));
    }

    @Override
    public boolean contains(IVector3d vec) {
        return aabb.contains(CraftTweakerMC.getVec3d(vec));
    }

    @Override
    public IAxisAlignedBB union(IAxisAlignedBB other) {
        return CraftTweakerMC.getIAxisAlignedBB(aabb.union(CraftTweakerMC.getAxisAlignedBB(other)));
    }
}