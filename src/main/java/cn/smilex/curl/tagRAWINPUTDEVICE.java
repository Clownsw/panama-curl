// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRAWINPUTDEVICE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("usUsagePage"),
        Constants$root.C_SHORT$LAYOUT.withName("usUsage"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndTarget")
    ).withName("tagRAWINPUTDEVICE");
    public static MemoryLayout $LAYOUT() {
        return tagRAWINPUTDEVICE.$struct$LAYOUT;
    }
    static final VarHandle usUsagePage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("usUsagePage"));
    public static VarHandle usUsagePage$VH() {
        return tagRAWINPUTDEVICE.usUsagePage$VH;
    }
    public static short usUsagePage$get(MemorySegment seg) {
        return (short)tagRAWINPUTDEVICE.usUsagePage$VH.get(seg);
    }
    public static void usUsagePage$set( MemorySegment seg, short x) {
        tagRAWINPUTDEVICE.usUsagePage$VH.set(seg, x);
    }
    public static short usUsagePage$get(MemorySegment seg, long index) {
        return (short)tagRAWINPUTDEVICE.usUsagePage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void usUsagePage$set(MemorySegment seg, long index, short x) {
        tagRAWINPUTDEVICE.usUsagePage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle usUsage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("usUsage"));
    public static VarHandle usUsage$VH() {
        return tagRAWINPUTDEVICE.usUsage$VH;
    }
    public static short usUsage$get(MemorySegment seg) {
        return (short)tagRAWINPUTDEVICE.usUsage$VH.get(seg);
    }
    public static void usUsage$set( MemorySegment seg, short x) {
        tagRAWINPUTDEVICE.usUsage$VH.set(seg, x);
    }
    public static short usUsage$get(MemorySegment seg, long index) {
        return (short)tagRAWINPUTDEVICE.usUsage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void usUsage$set(MemorySegment seg, long index, short x) {
        tagRAWINPUTDEVICE.usUsage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagRAWINPUTDEVICE.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagRAWINPUTDEVICE.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagRAWINPUTDEVICE.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagRAWINPUTDEVICE.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagRAWINPUTDEVICE.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndTarget$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndTarget"));
    public static VarHandle hwndTarget$VH() {
        return tagRAWINPUTDEVICE.hwndTarget$VH;
    }
    public static MemoryAddress hwndTarget$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagRAWINPUTDEVICE.hwndTarget$VH.get(seg);
    }
    public static void hwndTarget$set( MemorySegment seg, MemoryAddress x) {
        tagRAWINPUTDEVICE.hwndTarget$VH.set(seg, x);
    }
    public static MemoryAddress hwndTarget$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagRAWINPUTDEVICE.hwndTarget$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndTarget$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRAWINPUTDEVICE.hwndTarget$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


