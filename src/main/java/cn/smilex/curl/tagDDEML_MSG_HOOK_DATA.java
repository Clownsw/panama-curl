// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagDDEML_MSG_HOOK_DATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("uiLo"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("uiHi"),
        Constants$root.C_LONG$LAYOUT.withName("cbData"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_LONG$LAYOUT).withName("Data"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagDDEML_MSG_HOOK_DATA");
    public static MemoryLayout $LAYOUT() {
        return tagDDEML_MSG_HOOK_DATA.$struct$LAYOUT;
    }
    static final VarHandle uiLo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uiLo"));
    public static VarHandle uiLo$VH() {
        return tagDDEML_MSG_HOOK_DATA.uiLo$VH;
    }
    public static long uiLo$get(MemorySegment seg) {
        return (long)tagDDEML_MSG_HOOK_DATA.uiLo$VH.get(seg);
    }
    public static void uiLo$set( MemorySegment seg, long x) {
        tagDDEML_MSG_HOOK_DATA.uiLo$VH.set(seg, x);
    }
    public static long uiLo$get(MemorySegment seg, long index) {
        return (long)tagDDEML_MSG_HOOK_DATA.uiLo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uiLo$set(MemorySegment seg, long index, long x) {
        tagDDEML_MSG_HOOK_DATA.uiLo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uiHi$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uiHi"));
    public static VarHandle uiHi$VH() {
        return tagDDEML_MSG_HOOK_DATA.uiHi$VH;
    }
    public static long uiHi$get(MemorySegment seg) {
        return (long)tagDDEML_MSG_HOOK_DATA.uiHi$VH.get(seg);
    }
    public static void uiHi$set( MemorySegment seg, long x) {
        tagDDEML_MSG_HOOK_DATA.uiHi$VH.set(seg, x);
    }
    public static long uiHi$get(MemorySegment seg, long index) {
        return (long)tagDDEML_MSG_HOOK_DATA.uiHi$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uiHi$set(MemorySegment seg, long index, long x) {
        tagDDEML_MSG_HOOK_DATA.uiHi$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return tagDDEML_MSG_HOOK_DATA.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)tagDDEML_MSG_HOOK_DATA.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        tagDDEML_MSG_HOOK_DATA.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)tagDDEML_MSG_HOOK_DATA.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        tagDDEML_MSG_HOOK_DATA.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(20, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


