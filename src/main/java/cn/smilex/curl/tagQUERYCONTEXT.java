// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagQUERYCONTEXT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwContext"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwPlatformId"),
            Constants$root.C_LONG$LAYOUT.withName("dwVersionHi"),
            Constants$root.C_LONG$LAYOUT.withName("dwVersionLo"),
            Constants$root.C_LONG$LAYOUT.withName("dwProcessorArch")
        ).withName("Platform"),
        Constants$root.C_LONG$LAYOUT.withName("Locale"),
        Constants$root.C_LONG$LAYOUT.withName("dwVersionHi"),
        Constants$root.C_LONG$LAYOUT.withName("dwVersionLo")
    ).withName("tagQUERYCONTEXT");
    public static MemoryLayout $LAYOUT() {
        return tagQUERYCONTEXT.$struct$LAYOUT;
    }
    static final VarHandle dwContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwContext"));
    public static VarHandle dwContext$VH() {
        return tagQUERYCONTEXT.dwContext$VH;
    }
    public static int dwContext$get(MemorySegment seg) {
        return (int)tagQUERYCONTEXT.dwContext$VH.get(seg);
    }
    public static void dwContext$set( MemorySegment seg, int x) {
        tagQUERYCONTEXT.dwContext$VH.set(seg, x);
    }
    public static int dwContext$get(MemorySegment seg, long index) {
        return (int)tagQUERYCONTEXT.dwContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwContext$set(MemorySegment seg, long index, int x) {
        tagQUERYCONTEXT.dwContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Platform$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    static final VarHandle Locale$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Locale"));
    public static VarHandle Locale$VH() {
        return tagQUERYCONTEXT.Locale$VH;
    }
    public static int Locale$get(MemorySegment seg) {
        return (int)tagQUERYCONTEXT.Locale$VH.get(seg);
    }
    public static void Locale$set( MemorySegment seg, int x) {
        tagQUERYCONTEXT.Locale$VH.set(seg, x);
    }
    public static int Locale$get(MemorySegment seg, long index) {
        return (int)tagQUERYCONTEXT.Locale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Locale$set(MemorySegment seg, long index, int x) {
        tagQUERYCONTEXT.Locale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwVersionHi$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersionHi"));
    public static VarHandle dwVersionHi$VH() {
        return tagQUERYCONTEXT.dwVersionHi$VH;
    }
    public static int dwVersionHi$get(MemorySegment seg) {
        return (int)tagQUERYCONTEXT.dwVersionHi$VH.get(seg);
    }
    public static void dwVersionHi$set( MemorySegment seg, int x) {
        tagQUERYCONTEXT.dwVersionHi$VH.set(seg, x);
    }
    public static int dwVersionHi$get(MemorySegment seg, long index) {
        return (int)tagQUERYCONTEXT.dwVersionHi$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersionHi$set(MemorySegment seg, long index, int x) {
        tagQUERYCONTEXT.dwVersionHi$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwVersionLo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersionLo"));
    public static VarHandle dwVersionLo$VH() {
        return tagQUERYCONTEXT.dwVersionLo$VH;
    }
    public static int dwVersionLo$get(MemorySegment seg) {
        return (int)tagQUERYCONTEXT.dwVersionLo$VH.get(seg);
    }
    public static void dwVersionLo$set( MemorySegment seg, int x) {
        tagQUERYCONTEXT.dwVersionLo$VH.set(seg, x);
    }
    public static int dwVersionLo$get(MemorySegment seg, long index) {
        return (int)tagQUERYCONTEXT.dwVersionLo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersionLo$set(MemorySegment seg, long index, int x) {
        tagQUERYCONTEXT.dwVersionLo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


