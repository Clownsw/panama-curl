// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IClientSecurityVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("QueryBlanket"),
        Constants$root.C_POINTER$LAYOUT.withName("SetBlanket"),
        Constants$root.C_POINTER$LAYOUT.withName("CopyProxy")
    ).withName("IClientSecurityVtbl");
    public static MemoryLayout $LAYOUT() {
        return IClientSecurityVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IClientSecurityVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IClientSecurityVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IClientSecurityVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IClientSecurityVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IClientSecurityVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IClientSecurityVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IClientSecurityVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IClientSecurityVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IClientSecurityVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IClientSecurityVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IClientSecurityVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IClientSecurityVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IClientSecurityVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IClientSecurityVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IClientSecurityVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IClientSecurityVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IClientSecurityVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IClientSecurityVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IClientSecurityVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IClientSecurityVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IClientSecurityVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IClientSecurityVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IClientSecurityVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IClientSecurityVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor QueryBlanket$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryBlanket$MH = RuntimeHelper.downcallHandle(
        IClientSecurityVtbl.QueryBlanket$FUNC
    );
    public interface QueryBlanket {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4, java.lang.foreign.MemoryAddress _x5, java.lang.foreign.MemoryAddress _x6, java.lang.foreign.MemoryAddress _x7, java.lang.foreign.MemoryAddress _x8);
        static MemorySegment allocate(QueryBlanket fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryBlanket.class, fi, IClientSecurityVtbl.QueryBlanket$FUNC, session);
        }
        static QueryBlanket ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4, java.lang.foreign.MemoryAddress __x5, java.lang.foreign.MemoryAddress __x6, java.lang.foreign.MemoryAddress __x7, java.lang.foreign.MemoryAddress __x8) -> {
                try {
                    return (int)IClientSecurityVtbl.QueryBlanket$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4, (java.lang.foreign.Addressable)__x5, (java.lang.foreign.Addressable)__x6, (java.lang.foreign.Addressable)__x7, (java.lang.foreign.Addressable)__x8);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryBlanket$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryBlanket"));
    public static VarHandle QueryBlanket$VH() {
        return IClientSecurityVtbl.QueryBlanket$VH;
    }
    public static MemoryAddress QueryBlanket$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IClientSecurityVtbl.QueryBlanket$VH.get(seg);
    }
    public static void QueryBlanket$set( MemorySegment seg, MemoryAddress x) {
        IClientSecurityVtbl.QueryBlanket$VH.set(seg, x);
    }
    public static MemoryAddress QueryBlanket$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IClientSecurityVtbl.QueryBlanket$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryBlanket$set(MemorySegment seg, long index, MemoryAddress x) {
        IClientSecurityVtbl.QueryBlanket$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryBlanket QueryBlanket (MemorySegment segment, MemorySession session) {
        return QueryBlanket.ofAddress(QueryBlanket$get(segment), session);
    }
    static final FunctionDescriptor SetBlanket$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetBlanket$MH = RuntimeHelper.downcallHandle(
        IClientSecurityVtbl.SetBlanket$FUNC
    );
    public interface SetBlanket {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, int _x3, java.lang.foreign.MemoryAddress _x4, int _x5, int _x6, java.lang.foreign.MemoryAddress _x7, int _x8);
        static MemorySegment allocate(SetBlanket fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetBlanket.class, fi, IClientSecurityVtbl.SetBlanket$FUNC, session);
        }
        static SetBlanket ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, int __x3, java.lang.foreign.MemoryAddress __x4, int __x5, int __x6, java.lang.foreign.MemoryAddress __x7, int __x8) -> {
                try {
                    return (int)IClientSecurityVtbl.SetBlanket$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, __x3, (java.lang.foreign.Addressable)__x4, __x5, __x6, (java.lang.foreign.Addressable)__x7, __x8);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetBlanket$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetBlanket"));
    public static VarHandle SetBlanket$VH() {
        return IClientSecurityVtbl.SetBlanket$VH;
    }
    public static MemoryAddress SetBlanket$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IClientSecurityVtbl.SetBlanket$VH.get(seg);
    }
    public static void SetBlanket$set( MemorySegment seg, MemoryAddress x) {
        IClientSecurityVtbl.SetBlanket$VH.set(seg, x);
    }
    public static MemoryAddress SetBlanket$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IClientSecurityVtbl.SetBlanket$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetBlanket$set(MemorySegment seg, long index, MemoryAddress x) {
        IClientSecurityVtbl.SetBlanket$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetBlanket SetBlanket (MemorySegment segment, MemorySession session) {
        return SetBlanket.ofAddress(SetBlanket$get(segment), session);
    }
    static final FunctionDescriptor CopyProxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyProxy$MH = RuntimeHelper.downcallHandle(
        IClientSecurityVtbl.CopyProxy$FUNC
    );
    public interface CopyProxy {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(CopyProxy fi, MemorySession session) {
            return RuntimeHelper.upcallStub(CopyProxy.class, fi, IClientSecurityVtbl.CopyProxy$FUNC, session);
        }
        static CopyProxy ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IClientSecurityVtbl.CopyProxy$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CopyProxy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CopyProxy"));
    public static VarHandle CopyProxy$VH() {
        return IClientSecurityVtbl.CopyProxy$VH;
    }
    public static MemoryAddress CopyProxy$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IClientSecurityVtbl.CopyProxy$VH.get(seg);
    }
    public static void CopyProxy$set( MemorySegment seg, MemoryAddress x) {
        IClientSecurityVtbl.CopyProxy$VH.set(seg, x);
    }
    public static MemoryAddress CopyProxy$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IClientSecurityVtbl.CopyProxy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CopyProxy$set(MemorySegment seg, long index, MemoryAddress x) {
        IClientSecurityVtbl.CopyProxy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CopyProxy CopyProxy (MemorySegment segment, MemorySession session) {
        return CopyProxy.ofAddress(CopyProxy$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


