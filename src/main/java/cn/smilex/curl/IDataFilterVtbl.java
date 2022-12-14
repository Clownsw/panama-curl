// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IDataFilterVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("DoEncode"),
        Constants$root.C_POINTER$LAYOUT.withName("DoDecode"),
        Constants$root.C_POINTER$LAYOUT.withName("SetEncodingLevel")
    ).withName("IDataFilterVtbl");
    public static MemoryLayout $LAYOUT() {
        return IDataFilterVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IDataFilterVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IDataFilterVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IDataFilterVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IDataFilterVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataFilterVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IDataFilterVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataFilterVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataFilterVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IDataFilterVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IDataFilterVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IDataFilterVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IDataFilterVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataFilterVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IDataFilterVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataFilterVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataFilterVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IDataFilterVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IDataFilterVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IDataFilterVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IDataFilterVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataFilterVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IDataFilterVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataFilterVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataFilterVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor DoEncode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DoEncode$MH = RuntimeHelper.downcallHandle(
        IDataFilterVtbl.DoEncode$FUNC
    );
    public interface DoEncode {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, java.lang.foreign.MemoryAddress _x3, int _x4, java.lang.foreign.MemoryAddress _x5, int _x6, java.lang.foreign.MemoryAddress _x7, java.lang.foreign.MemoryAddress _x8, int _x9);
        static MemorySegment allocate(DoEncode fi, MemorySession session) {
            return RuntimeHelper.upcallStub(DoEncode.class, fi, IDataFilterVtbl.DoEncode$FUNC, session);
        }
        static DoEncode ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, java.lang.foreign.MemoryAddress __x3, int __x4, java.lang.foreign.MemoryAddress __x5, int __x6, java.lang.foreign.MemoryAddress __x7, java.lang.foreign.MemoryAddress __x8, int __x9) -> {
                try {
                    return (int)IDataFilterVtbl.DoEncode$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3, __x4, (java.lang.foreign.Addressable)__x5, __x6, (java.lang.foreign.Addressable)__x7, (java.lang.foreign.Addressable)__x8, __x9);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DoEncode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DoEncode"));
    public static VarHandle DoEncode$VH() {
        return IDataFilterVtbl.DoEncode$VH;
    }
    public static MemoryAddress DoEncode$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataFilterVtbl.DoEncode$VH.get(seg);
    }
    public static void DoEncode$set( MemorySegment seg, MemoryAddress x) {
        IDataFilterVtbl.DoEncode$VH.set(seg, x);
    }
    public static MemoryAddress DoEncode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataFilterVtbl.DoEncode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DoEncode$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataFilterVtbl.DoEncode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DoEncode DoEncode (MemorySegment segment, MemorySession session) {
        return DoEncode.ofAddress(DoEncode$get(segment), session);
    }
    static final FunctionDescriptor DoDecode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DoDecode$MH = RuntimeHelper.downcallHandle(
        IDataFilterVtbl.DoDecode$FUNC
    );
    public interface DoDecode {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, java.lang.foreign.MemoryAddress _x3, int _x4, java.lang.foreign.MemoryAddress _x5, int _x6, java.lang.foreign.MemoryAddress _x7, java.lang.foreign.MemoryAddress _x8, int _x9);
        static MemorySegment allocate(DoDecode fi, MemorySession session) {
            return RuntimeHelper.upcallStub(DoDecode.class, fi, IDataFilterVtbl.DoDecode$FUNC, session);
        }
        static DoDecode ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, java.lang.foreign.MemoryAddress __x3, int __x4, java.lang.foreign.MemoryAddress __x5, int __x6, java.lang.foreign.MemoryAddress __x7, java.lang.foreign.MemoryAddress __x8, int __x9) -> {
                try {
                    return (int)IDataFilterVtbl.DoDecode$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3, __x4, (java.lang.foreign.Addressable)__x5, __x6, (java.lang.foreign.Addressable)__x7, (java.lang.foreign.Addressable)__x8, __x9);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DoDecode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DoDecode"));
    public static VarHandle DoDecode$VH() {
        return IDataFilterVtbl.DoDecode$VH;
    }
    public static MemoryAddress DoDecode$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataFilterVtbl.DoDecode$VH.get(seg);
    }
    public static void DoDecode$set( MemorySegment seg, MemoryAddress x) {
        IDataFilterVtbl.DoDecode$VH.set(seg, x);
    }
    public static MemoryAddress DoDecode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataFilterVtbl.DoDecode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DoDecode$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataFilterVtbl.DoDecode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DoDecode DoDecode (MemorySegment segment, MemorySession session) {
        return DoDecode.ofAddress(DoDecode$get(segment), session);
    }
    static final FunctionDescriptor SetEncodingLevel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetEncodingLevel$MH = RuntimeHelper.downcallHandle(
        IDataFilterVtbl.SetEncodingLevel$FUNC
    );
    public interface SetEncodingLevel {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(SetEncodingLevel fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetEncodingLevel.class, fi, IDataFilterVtbl.SetEncodingLevel$FUNC, session);
        }
        static SetEncodingLevel ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IDataFilterVtbl.SetEncodingLevel$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetEncodingLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetEncodingLevel"));
    public static VarHandle SetEncodingLevel$VH() {
        return IDataFilterVtbl.SetEncodingLevel$VH;
    }
    public static MemoryAddress SetEncodingLevel$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataFilterVtbl.SetEncodingLevel$VH.get(seg);
    }
    public static void SetEncodingLevel$set( MemorySegment seg, MemoryAddress x) {
        IDataFilterVtbl.SetEncodingLevel$VH.set(seg, x);
    }
    public static MemoryAddress SetEncodingLevel$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataFilterVtbl.SetEncodingLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetEncodingLevel$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataFilterVtbl.SetEncodingLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetEncodingLevel SetEncodingLevel (MemorySegment segment, MemorySession session) {
        return SetEncodingLevel.ofAddress(SetEncodingLevel$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


