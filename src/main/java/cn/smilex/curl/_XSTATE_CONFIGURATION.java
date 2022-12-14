// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _XSTATE_CONFIGURATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("EnabledFeatures"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("EnabledVolatileFeatures"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("ControlFlags"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1).withName("OptimizedSave"),
                    MemoryLayout.paddingLayout(1).withName("CompactionEnabled"),
                    MemoryLayout.paddingLayout(30)
                )
            ).withName("$anon$0")
        ).withName("$anon$0"),
        MemoryLayout.sequenceLayout(64, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Offset"),
            Constants$root.C_LONG$LAYOUT.withName("Size")
        ).withName("_XSTATE_FEATURE")).withName("Features"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("EnabledSupervisorFeatures"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("AlignedFeatures"),
        Constants$root.C_LONG$LAYOUT.withName("AllFeatureSize"),
        MemoryLayout.sequenceLayout(64, Constants$root.C_LONG$LAYOUT).withName("AllFeatures"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("EnabledUserVisibleSupervisorFeatures")
    ).withName("_XSTATE_CONFIGURATION");
    public static MemoryLayout $LAYOUT() {
        return _XSTATE_CONFIGURATION.$struct$LAYOUT;
    }
    static final VarHandle EnabledFeatures$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnabledFeatures"));
    public static VarHandle EnabledFeatures$VH() {
        return _XSTATE_CONFIGURATION.EnabledFeatures$VH;
    }
    public static long EnabledFeatures$get(MemorySegment seg) {
        return (long)_XSTATE_CONFIGURATION.EnabledFeatures$VH.get(seg);
    }
    public static void EnabledFeatures$set( MemorySegment seg, long x) {
        _XSTATE_CONFIGURATION.EnabledFeatures$VH.set(seg, x);
    }
    public static long EnabledFeatures$get(MemorySegment seg, long index) {
        return (long)_XSTATE_CONFIGURATION.EnabledFeatures$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnabledFeatures$set(MemorySegment seg, long index, long x) {
        _XSTATE_CONFIGURATION.EnabledFeatures$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EnabledVolatileFeatures$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnabledVolatileFeatures"));
    public static VarHandle EnabledVolatileFeatures$VH() {
        return _XSTATE_CONFIGURATION.EnabledVolatileFeatures$VH;
    }
    public static long EnabledVolatileFeatures$get(MemorySegment seg) {
        return (long)_XSTATE_CONFIGURATION.EnabledVolatileFeatures$VH.get(seg);
    }
    public static void EnabledVolatileFeatures$set( MemorySegment seg, long x) {
        _XSTATE_CONFIGURATION.EnabledVolatileFeatures$VH.set(seg, x);
    }
    public static long EnabledVolatileFeatures$get(MemorySegment seg, long index) {
        return (long)_XSTATE_CONFIGURATION.EnabledVolatileFeatures$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnabledVolatileFeatures$set(MemorySegment seg, long index, long x) {
        _XSTATE_CONFIGURATION.EnabledVolatileFeatures$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _XSTATE_CONFIGURATION.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_XSTATE_CONFIGURATION.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _XSTATE_CONFIGURATION.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_XSTATE_CONFIGURATION.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _XSTATE_CONFIGURATION.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ControlFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("ControlFlags"));
    public static VarHandle ControlFlags$VH() {
        return _XSTATE_CONFIGURATION.ControlFlags$VH;
    }
    public static int ControlFlags$get(MemorySegment seg) {
        return (int)_XSTATE_CONFIGURATION.ControlFlags$VH.get(seg);
    }
    public static void ControlFlags$set( MemorySegment seg, int x) {
        _XSTATE_CONFIGURATION.ControlFlags$VH.set(seg, x);
    }
    public static int ControlFlags$get(MemorySegment seg, long index) {
        return (int)_XSTATE_CONFIGURATION.ControlFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlFlags$set(MemorySegment seg, long index, int x) {
        _XSTATE_CONFIGURATION.ControlFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Features$slice(MemorySegment seg) {
        return seg.asSlice(24, 512);
    }
    static final VarHandle EnabledSupervisorFeatures$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnabledSupervisorFeatures"));
    public static VarHandle EnabledSupervisorFeatures$VH() {
        return _XSTATE_CONFIGURATION.EnabledSupervisorFeatures$VH;
    }
    public static long EnabledSupervisorFeatures$get(MemorySegment seg) {
        return (long)_XSTATE_CONFIGURATION.EnabledSupervisorFeatures$VH.get(seg);
    }
    public static void EnabledSupervisorFeatures$set( MemorySegment seg, long x) {
        _XSTATE_CONFIGURATION.EnabledSupervisorFeatures$VH.set(seg, x);
    }
    public static long EnabledSupervisorFeatures$get(MemorySegment seg, long index) {
        return (long)_XSTATE_CONFIGURATION.EnabledSupervisorFeatures$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnabledSupervisorFeatures$set(MemorySegment seg, long index, long x) {
        _XSTATE_CONFIGURATION.EnabledSupervisorFeatures$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AlignedFeatures$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AlignedFeatures"));
    public static VarHandle AlignedFeatures$VH() {
        return _XSTATE_CONFIGURATION.AlignedFeatures$VH;
    }
    public static long AlignedFeatures$get(MemorySegment seg) {
        return (long)_XSTATE_CONFIGURATION.AlignedFeatures$VH.get(seg);
    }
    public static void AlignedFeatures$set( MemorySegment seg, long x) {
        _XSTATE_CONFIGURATION.AlignedFeatures$VH.set(seg, x);
    }
    public static long AlignedFeatures$get(MemorySegment seg, long index) {
        return (long)_XSTATE_CONFIGURATION.AlignedFeatures$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AlignedFeatures$set(MemorySegment seg, long index, long x) {
        _XSTATE_CONFIGURATION.AlignedFeatures$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AllFeatureSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AllFeatureSize"));
    public static VarHandle AllFeatureSize$VH() {
        return _XSTATE_CONFIGURATION.AllFeatureSize$VH;
    }
    public static int AllFeatureSize$get(MemorySegment seg) {
        return (int)_XSTATE_CONFIGURATION.AllFeatureSize$VH.get(seg);
    }
    public static void AllFeatureSize$set( MemorySegment seg, int x) {
        _XSTATE_CONFIGURATION.AllFeatureSize$VH.set(seg, x);
    }
    public static int AllFeatureSize$get(MemorySegment seg, long index) {
        return (int)_XSTATE_CONFIGURATION.AllFeatureSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AllFeatureSize$set(MemorySegment seg, long index, int x) {
        _XSTATE_CONFIGURATION.AllFeatureSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment AllFeatures$slice(MemorySegment seg) {
        return seg.asSlice(556, 256);
    }
    static final VarHandle EnabledUserVisibleSupervisorFeatures$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnabledUserVisibleSupervisorFeatures"));
    public static VarHandle EnabledUserVisibleSupervisorFeatures$VH() {
        return _XSTATE_CONFIGURATION.EnabledUserVisibleSupervisorFeatures$VH;
    }
    public static long EnabledUserVisibleSupervisorFeatures$get(MemorySegment seg) {
        return (long)_XSTATE_CONFIGURATION.EnabledUserVisibleSupervisorFeatures$VH.get(seg);
    }
    public static void EnabledUserVisibleSupervisorFeatures$set( MemorySegment seg, long x) {
        _XSTATE_CONFIGURATION.EnabledUserVisibleSupervisorFeatures$VH.set(seg, x);
    }
    public static long EnabledUserVisibleSupervisorFeatures$get(MemorySegment seg, long index) {
        return (long)_XSTATE_CONFIGURATION.EnabledUserVisibleSupervisorFeatures$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnabledUserVisibleSupervisorFeatures$set(MemorySegment seg, long index, long x) {
        _XSTATE_CONFIGURATION.EnabledUserVisibleSupervisorFeatures$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


