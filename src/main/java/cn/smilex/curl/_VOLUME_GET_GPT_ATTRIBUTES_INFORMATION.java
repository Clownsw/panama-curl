// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _VOLUME_GET_GPT_ATTRIBUTES_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("GptAttributes")
    ).withName("_VOLUME_GET_GPT_ATTRIBUTES_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _VOLUME_GET_GPT_ATTRIBUTES_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle GptAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GptAttributes"));
    public static VarHandle GptAttributes$VH() {
        return _VOLUME_GET_GPT_ATTRIBUTES_INFORMATION.GptAttributes$VH;
    }
    public static long GptAttributes$get(MemorySegment seg) {
        return (long)_VOLUME_GET_GPT_ATTRIBUTES_INFORMATION.GptAttributes$VH.get(seg);
    }
    public static void GptAttributes$set( MemorySegment seg, long x) {
        _VOLUME_GET_GPT_ATTRIBUTES_INFORMATION.GptAttributes$VH.set(seg, x);
    }
    public static long GptAttributes$get(MemorySegment seg, long index) {
        return (long)_VOLUME_GET_GPT_ATTRIBUTES_INFORMATION.GptAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GptAttributes$set(MemorySegment seg, long index, long x) {
        _VOLUME_GET_GPT_ATTRIBUTES_INFORMATION.GptAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


