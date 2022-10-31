// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MALLOC_FREE_STRUCT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pfnAllocate"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnFree")
    ).withName("_MALLOC_FREE_STRUCT");
    public static MemoryLayout $LAYOUT() {
        return _MALLOC_FREE_STRUCT.$struct$LAYOUT;
    }
    static final FunctionDescriptor pfnAllocate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pfnAllocate$MH = RuntimeHelper.downcallHandle(
        _MALLOC_FREE_STRUCT.pfnAllocate$FUNC
    );
    public interface pfnAllocate {

        java.lang.foreign.Addressable apply(long _x0);
        static MemorySegment allocate(pfnAllocate fi, MemorySession session) {
            return RuntimeHelper.upcallStub(pfnAllocate.class, fi, _MALLOC_FREE_STRUCT.pfnAllocate$FUNC, session);
        }
        static pfnAllocate ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (long __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_MALLOC_FREE_STRUCT.pfnAllocate$MH.invokeExact((Addressable)symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle pfnAllocate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnAllocate"));
    public static VarHandle pfnAllocate$VH() {
        return _MALLOC_FREE_STRUCT.pfnAllocate$VH;
    }
    public static MemoryAddress pfnAllocate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MALLOC_FREE_STRUCT.pfnAllocate$VH.get(seg);
    }
    public static void pfnAllocate$set( MemorySegment seg, MemoryAddress x) {
        _MALLOC_FREE_STRUCT.pfnAllocate$VH.set(seg, x);
    }
    public static MemoryAddress pfnAllocate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MALLOC_FREE_STRUCT.pfnAllocate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnAllocate$set(MemorySegment seg, long index, MemoryAddress x) {
        _MALLOC_FREE_STRUCT.pfnAllocate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static pfnAllocate pfnAllocate (MemorySegment segment, MemorySession session) {
        return pfnAllocate.ofAddress(pfnAllocate$get(segment), session);
    }
    static final FunctionDescriptor pfnFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pfnFree$MH = RuntimeHelper.downcallHandle(
        _MALLOC_FREE_STRUCT.pfnFree$FUNC
    );
    public interface pfnFree {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(pfnFree fi, MemorySession session) {
            return RuntimeHelper.upcallStub(pfnFree.class, fi, _MALLOC_FREE_STRUCT.pfnFree$FUNC, session);
        }
        static pfnFree ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _MALLOC_FREE_STRUCT.pfnFree$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle pfnFree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnFree"));
    public static VarHandle pfnFree$VH() {
        return _MALLOC_FREE_STRUCT.pfnFree$VH;
    }
    public static MemoryAddress pfnFree$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MALLOC_FREE_STRUCT.pfnFree$VH.get(seg);
    }
    public static void pfnFree$set( MemorySegment seg, MemoryAddress x) {
        _MALLOC_FREE_STRUCT.pfnFree$VH.set(seg, x);
    }
    public static MemoryAddress pfnFree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MALLOC_FREE_STRUCT.pfnFree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFree$set(MemorySegment seg, long index, MemoryAddress x) {
        _MALLOC_FREE_STRUCT.pfnFree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static pfnFree pfnFree (MemorySegment segment, MemorySession session) {
        return pfnFree.ofAddress(pfnFree$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


