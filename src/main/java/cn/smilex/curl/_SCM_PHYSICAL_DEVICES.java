// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SCM_PHYSICAL_DEVICES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("DeviceCount"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Version"),
            Constants$root.C_LONG$LAYOUT.withName("Size"),
            Constants$root.C_LONG$LAYOUT.withName("NfitHandle"),
            MemoryLayout.sequenceLayout(256, Constants$root.C_SHORT$LAYOUT).withName("SymbolicLink")
        ).withName("_SCM_PHYSICAL_DEVICE_INSTANCE")).withName("Devices")
    ).withName("_SCM_PHYSICAL_DEVICES");
    public static MemoryLayout $LAYOUT() {
        return _SCM_PHYSICAL_DEVICES.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _SCM_PHYSICAL_DEVICES.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_SCM_PHYSICAL_DEVICES.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _SCM_PHYSICAL_DEVICES.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_SCM_PHYSICAL_DEVICES.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _SCM_PHYSICAL_DEVICES.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCM_PHYSICAL_DEVICES.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_SCM_PHYSICAL_DEVICES.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _SCM_PHYSICAL_DEVICES.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCM_PHYSICAL_DEVICES.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCM_PHYSICAL_DEVICES.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceCount"));
    public static VarHandle DeviceCount$VH() {
        return _SCM_PHYSICAL_DEVICES.DeviceCount$VH;
    }
    public static int DeviceCount$get(MemorySegment seg) {
        return (int)_SCM_PHYSICAL_DEVICES.DeviceCount$VH.get(seg);
    }
    public static void DeviceCount$set( MemorySegment seg, int x) {
        _SCM_PHYSICAL_DEVICES.DeviceCount$VH.set(seg, x);
    }
    public static int DeviceCount$get(MemorySegment seg, long index) {
        return (int)_SCM_PHYSICAL_DEVICES.DeviceCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceCount$set(MemorySegment seg, long index, int x) {
        _SCM_PHYSICAL_DEVICES.DeviceCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Devices$slice(MemorySegment seg) {
        return seg.asSlice(12, 524);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


