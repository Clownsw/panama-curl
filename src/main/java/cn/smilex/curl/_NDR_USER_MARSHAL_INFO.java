// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NDR_USER_MARSHAL_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("InformationLevel"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("Buffer"),
                Constants$root.C_LONG$LAYOUT.withName("BufferSize"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pfnAllocate"),
                Constants$root.C_POINTER$LAYOUT.withName("pfnFree"),
                Constants$root.C_POINTER$LAYOUT.withName("pRpcChannelBuffer"),
                MemoryLayout.sequenceLayout(5, Constants$root.C_LONG_LONG$LAYOUT).withName("Reserved")
            ).withName("Level1")
        ).withName("$anon$0")
    ).withName("_NDR_USER_MARSHAL_INFO");
    public static MemoryLayout $LAYOUT() {
        return _NDR_USER_MARSHAL_INFO.$struct$LAYOUT;
    }
    static final VarHandle InformationLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InformationLevel"));
    public static VarHandle InformationLevel$VH() {
        return _NDR_USER_MARSHAL_INFO.InformationLevel$VH;
    }
    public static int InformationLevel$get(MemorySegment seg) {
        return (int)_NDR_USER_MARSHAL_INFO.InformationLevel$VH.get(seg);
    }
    public static void InformationLevel$set( MemorySegment seg, int x) {
        _NDR_USER_MARSHAL_INFO.InformationLevel$VH.set(seg, x);
    }
    public static int InformationLevel$get(MemorySegment seg, long index) {
        return (int)_NDR_USER_MARSHAL_INFO.InformationLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InformationLevel$set(MemorySegment seg, long index, int x) {
        _NDR_USER_MARSHAL_INFO.InformationLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Level1$slice(MemorySegment seg) {
        return seg.asSlice(8, 80);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


