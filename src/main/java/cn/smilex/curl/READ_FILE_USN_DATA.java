// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class READ_FILE_USN_DATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("MinMajorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MaxMajorVersion")
    );
    public static MemoryLayout $LAYOUT() {
        return READ_FILE_USN_DATA.$struct$LAYOUT;
    }
    static final VarHandle MinMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinMajorVersion"));
    public static VarHandle MinMajorVersion$VH() {
        return READ_FILE_USN_DATA.MinMajorVersion$VH;
    }
    public static short MinMajorVersion$get(MemorySegment seg) {
        return (short)READ_FILE_USN_DATA.MinMajorVersion$VH.get(seg);
    }
    public static void MinMajorVersion$set( MemorySegment seg, short x) {
        READ_FILE_USN_DATA.MinMajorVersion$VH.set(seg, x);
    }
    public static short MinMajorVersion$get(MemorySegment seg, long index) {
        return (short)READ_FILE_USN_DATA.MinMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinMajorVersion$set(MemorySegment seg, long index, short x) {
        READ_FILE_USN_DATA.MinMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxMajorVersion"));
    public static VarHandle MaxMajorVersion$VH() {
        return READ_FILE_USN_DATA.MaxMajorVersion$VH;
    }
    public static short MaxMajorVersion$get(MemorySegment seg) {
        return (short)READ_FILE_USN_DATA.MaxMajorVersion$VH.get(seg);
    }
    public static void MaxMajorVersion$set( MemorySegment seg, short x) {
        READ_FILE_USN_DATA.MaxMajorVersion$VH.set(seg, x);
    }
    public static short MaxMajorVersion$get(MemorySegment seg, long index) {
        return (short)READ_FILE_USN_DATA.MaxMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxMajorVersion$set(MemorySegment seg, long index, short x) {
        READ_FILE_USN_DATA.MaxMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


