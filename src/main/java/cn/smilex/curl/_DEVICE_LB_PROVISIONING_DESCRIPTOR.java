// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DEVICE_LB_PROVISIONING_DESCRIPTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(1).withName("ThinProvisioningEnabled"),
            MemoryLayout.paddingLayout(1).withName("ThinProvisioningReadZeros"),
            MemoryLayout.paddingLayout(3).withName("AnchorSupported"),
            MemoryLayout.paddingLayout(1).withName("UnmapGranularityAlignmentValid"),
            MemoryLayout.paddingLayout(2).withName("Reserved0")
        ),
        MemoryLayout.sequenceLayout(7, Constants$root.C_CHAR$LAYOUT).withName("Reserved1"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("OptimalUnmapGranularity"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("UnmapGranularityAlignment"),
        Constants$root.C_LONG$LAYOUT.withName("MaxUnmapLbaCount"),
        Constants$root.C_LONG$LAYOUT.withName("MaxUnmapBlockDescriptorCount")
    ).withName("_DEVICE_LB_PROVISIONING_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved1$slice(MemorySegment seg) {
        return seg.asSlice(9, 7);
    }
    static final VarHandle OptimalUnmapGranularity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OptimalUnmapGranularity"));
    public static VarHandle OptimalUnmapGranularity$VH() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.OptimalUnmapGranularity$VH;
    }
    public static long OptimalUnmapGranularity$get(MemorySegment seg) {
        return (long)_DEVICE_LB_PROVISIONING_DESCRIPTOR.OptimalUnmapGranularity$VH.get(seg);
    }
    public static void OptimalUnmapGranularity$set( MemorySegment seg, long x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.OptimalUnmapGranularity$VH.set(seg, x);
    }
    public static long OptimalUnmapGranularity$get(MemorySegment seg, long index) {
        return (long)_DEVICE_LB_PROVISIONING_DESCRIPTOR.OptimalUnmapGranularity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OptimalUnmapGranularity$set(MemorySegment seg, long index, long x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.OptimalUnmapGranularity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UnmapGranularityAlignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UnmapGranularityAlignment"));
    public static VarHandle UnmapGranularityAlignment$VH() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.UnmapGranularityAlignment$VH;
    }
    public static long UnmapGranularityAlignment$get(MemorySegment seg) {
        return (long)_DEVICE_LB_PROVISIONING_DESCRIPTOR.UnmapGranularityAlignment$VH.get(seg);
    }
    public static void UnmapGranularityAlignment$set( MemorySegment seg, long x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.UnmapGranularityAlignment$VH.set(seg, x);
    }
    public static long UnmapGranularityAlignment$get(MemorySegment seg, long index) {
        return (long)_DEVICE_LB_PROVISIONING_DESCRIPTOR.UnmapGranularityAlignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnmapGranularityAlignment$set(MemorySegment seg, long index, long x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.UnmapGranularityAlignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxUnmapLbaCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxUnmapLbaCount"));
    public static VarHandle MaxUnmapLbaCount$VH() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapLbaCount$VH;
    }
    public static int MaxUnmapLbaCount$get(MemorySegment seg) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapLbaCount$VH.get(seg);
    }
    public static void MaxUnmapLbaCount$set( MemorySegment seg, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapLbaCount$VH.set(seg, x);
    }
    public static int MaxUnmapLbaCount$get(MemorySegment seg, long index) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapLbaCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxUnmapLbaCount$set(MemorySegment seg, long index, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapLbaCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxUnmapBlockDescriptorCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxUnmapBlockDescriptorCount"));
    public static VarHandle MaxUnmapBlockDescriptorCount$VH() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapBlockDescriptorCount$VH;
    }
    public static int MaxUnmapBlockDescriptorCount$get(MemorySegment seg) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapBlockDescriptorCount$VH.get(seg);
    }
    public static void MaxUnmapBlockDescriptorCount$set( MemorySegment seg, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapBlockDescriptorCount$VH.set(seg, x);
    }
    public static int MaxUnmapBlockDescriptorCount$get(MemorySegment seg, long index) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapBlockDescriptorCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxUnmapBlockDescriptorCount$set(MemorySegment seg, long index, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapBlockDescriptorCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


