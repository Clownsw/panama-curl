// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _POWER_SESSION_TIMEOUTS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("InputTimeout"),
        Constants$root.C_LONG$LAYOUT.withName("DisplayTimeout")
    ).withName("_POWER_SESSION_TIMEOUTS");
    public static MemoryLayout $LAYOUT() {
        return _POWER_SESSION_TIMEOUTS.$struct$LAYOUT;
    }
    static final VarHandle InputTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InputTimeout"));
    public static VarHandle InputTimeout$VH() {
        return _POWER_SESSION_TIMEOUTS.InputTimeout$VH;
    }
    public static int InputTimeout$get(MemorySegment seg) {
        return (int)_POWER_SESSION_TIMEOUTS.InputTimeout$VH.get(seg);
    }
    public static void InputTimeout$set( MemorySegment seg, int x) {
        _POWER_SESSION_TIMEOUTS.InputTimeout$VH.set(seg, x);
    }
    public static int InputTimeout$get(MemorySegment seg, long index) {
        return (int)_POWER_SESSION_TIMEOUTS.InputTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InputTimeout$set(MemorySegment seg, long index, int x) {
        _POWER_SESSION_TIMEOUTS.InputTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DisplayTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DisplayTimeout"));
    public static VarHandle DisplayTimeout$VH() {
        return _POWER_SESSION_TIMEOUTS.DisplayTimeout$VH;
    }
    public static int DisplayTimeout$get(MemorySegment seg) {
        return (int)_POWER_SESSION_TIMEOUTS.DisplayTimeout$VH.get(seg);
    }
    public static void DisplayTimeout$set( MemorySegment seg, int x) {
        _POWER_SESSION_TIMEOUTS.DisplayTimeout$VH.set(seg, x);
    }
    public static int DisplayTimeout$get(MemorySegment seg, long index) {
        return (int)_POWER_SESSION_TIMEOUTS.DisplayTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DisplayTimeout$set(MemorySegment seg, long index, int x) {
        _POWER_SESSION_TIMEOUTS.DisplayTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


