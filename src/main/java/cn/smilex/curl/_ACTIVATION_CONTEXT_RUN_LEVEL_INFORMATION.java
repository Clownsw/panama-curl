// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ulFlags"),
        Constants$root.C_LONG$LAYOUT.withName("RunLevel"),
        Constants$root.C_LONG$LAYOUT.withName("UiAccess")
    ).withName("_ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle ulFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulFlags"));
    public static VarHandle ulFlags$VH() {
        return _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.ulFlags$VH;
    }
    public static int ulFlags$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.ulFlags$VH.get(seg);
    }
    public static void ulFlags$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.ulFlags$VH.set(seg, x);
    }
    public static int ulFlags$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.ulFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulFlags$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.ulFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RunLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RunLevel"));
    public static VarHandle RunLevel$VH() {
        return _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.RunLevel$VH;
    }
    public static int RunLevel$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.RunLevel$VH.get(seg);
    }
    public static void RunLevel$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.RunLevel$VH.set(seg, x);
    }
    public static int RunLevel$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.RunLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RunLevel$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.RunLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UiAccess$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UiAccess"));
    public static VarHandle UiAccess$VH() {
        return _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.UiAccess$VH;
    }
    public static int UiAccess$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.UiAccess$VH.get(seg);
    }
    public static void UiAccess$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.UiAccess$VH.set(seg, x);
    }
    public static int UiAccess$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.UiAccess$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UiAccess$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION.UiAccess$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


