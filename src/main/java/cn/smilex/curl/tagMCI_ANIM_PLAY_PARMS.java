// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMCI_ANIM_PLAY_PARMS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwCallback"),
        Constants$root.C_LONG$LAYOUT.withName("dwFrom"),
        Constants$root.C_LONG$LAYOUT.withName("dwTo"),
        Constants$root.C_LONG$LAYOUT.withName("dwSpeed")
    ).withName("tagMCI_ANIM_PLAY_PARMS");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_ANIM_PLAY_PARMS.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_ANIM_PLAY_PARMS.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_ANIM_PLAY_PARMS.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_ANIM_PLAY_PARMS.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_ANIM_PLAY_PARMS.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_ANIM_PLAY_PARMS.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFrom$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFrom"));
    public static VarHandle dwFrom$VH() {
        return tagMCI_ANIM_PLAY_PARMS.dwFrom$VH;
    }
    public static int dwFrom$get(MemorySegment seg) {
        return (int)tagMCI_ANIM_PLAY_PARMS.dwFrom$VH.get(seg);
    }
    public static void dwFrom$set( MemorySegment seg, int x) {
        tagMCI_ANIM_PLAY_PARMS.dwFrom$VH.set(seg, x);
    }
    public static int dwFrom$get(MemorySegment seg, long index) {
        return (int)tagMCI_ANIM_PLAY_PARMS.dwFrom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFrom$set(MemorySegment seg, long index, int x) {
        tagMCI_ANIM_PLAY_PARMS.dwFrom$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTo"));
    public static VarHandle dwTo$VH() {
        return tagMCI_ANIM_PLAY_PARMS.dwTo$VH;
    }
    public static int dwTo$get(MemorySegment seg) {
        return (int)tagMCI_ANIM_PLAY_PARMS.dwTo$VH.get(seg);
    }
    public static void dwTo$set( MemorySegment seg, int x) {
        tagMCI_ANIM_PLAY_PARMS.dwTo$VH.set(seg, x);
    }
    public static int dwTo$get(MemorySegment seg, long index) {
        return (int)tagMCI_ANIM_PLAY_PARMS.dwTo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTo$set(MemorySegment seg, long index, int x) {
        tagMCI_ANIM_PLAY_PARMS.dwTo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSpeed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSpeed"));
    public static VarHandle dwSpeed$VH() {
        return tagMCI_ANIM_PLAY_PARMS.dwSpeed$VH;
    }
    public static int dwSpeed$get(MemorySegment seg) {
        return (int)tagMCI_ANIM_PLAY_PARMS.dwSpeed$VH.get(seg);
    }
    public static void dwSpeed$set( MemorySegment seg, int x) {
        tagMCI_ANIM_PLAY_PARMS.dwSpeed$VH.set(seg, x);
    }
    public static int dwSpeed$get(MemorySegment seg, long index) {
        return (int)tagMCI_ANIM_PLAY_PARMS.dwSpeed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSpeed$set(MemorySegment seg, long index, int x) {
        tagMCI_ANIM_PLAY_PARMS.dwSpeed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

