// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RETRIEVAL_POINTERS_BUFFER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ExtentCount"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("StartingVcn"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                    Constants$root.C_LONG$LAYOUT.withName("HighPart")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                    Constants$root.C_LONG$LAYOUT.withName("HighPart")
                ).withName("u"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
            ).withName("NextVcn"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                    Constants$root.C_LONG$LAYOUT.withName("HighPart")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                    Constants$root.C_LONG$LAYOUT.withName("HighPart")
                ).withName("u"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
            ).withName("Lcn")
        )).withName("Extents")
    ).withName("RETRIEVAL_POINTERS_BUFFER");
    public static MemoryLayout $LAYOUT() {
        return RETRIEVAL_POINTERS_BUFFER.$struct$LAYOUT;
    }
    static final VarHandle ExtentCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExtentCount"));
    public static VarHandle ExtentCount$VH() {
        return RETRIEVAL_POINTERS_BUFFER.ExtentCount$VH;
    }
    public static int ExtentCount$get(MemorySegment seg) {
        return (int)RETRIEVAL_POINTERS_BUFFER.ExtentCount$VH.get(seg);
    }
    public static void ExtentCount$set( MemorySegment seg, int x) {
        RETRIEVAL_POINTERS_BUFFER.ExtentCount$VH.set(seg, x);
    }
    public static int ExtentCount$get(MemorySegment seg, long index) {
        return (int)RETRIEVAL_POINTERS_BUFFER.ExtentCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExtentCount$set(MemorySegment seg, long index, int x) {
        RETRIEVAL_POINTERS_BUFFER.ExtentCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment StartingVcn$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment Extents$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


