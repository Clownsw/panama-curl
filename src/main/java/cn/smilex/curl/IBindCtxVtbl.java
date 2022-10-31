// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IBindCtxVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("RegisterObjectBound"),
        Constants$root.C_POINTER$LAYOUT.withName("RevokeObjectBound"),
        Constants$root.C_POINTER$LAYOUT.withName("ReleaseBoundObjects"),
        Constants$root.C_POINTER$LAYOUT.withName("SetBindOptions"),
        Constants$root.C_POINTER$LAYOUT.withName("GetBindOptions"),
        Constants$root.C_POINTER$LAYOUT.withName("GetRunningObjectTable"),
        Constants$root.C_POINTER$LAYOUT.withName("RegisterObjectParam"),
        Constants$root.C_POINTER$LAYOUT.withName("GetObjectParam"),
        Constants$root.C_POINTER$LAYOUT.withName("EnumObjectParam"),
        Constants$root.C_POINTER$LAYOUT.withName("RevokeObjectParam")
    ).withName("IBindCtxVtbl");
    public static MemoryLayout $LAYOUT() {
        return IBindCtxVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IBindCtxVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IBindCtxVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IBindCtxVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IBindCtxVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IBindCtxVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IBindCtxVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IBindCtxVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IBindCtxVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IBindCtxVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor RegisterObjectBound$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterObjectBound$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.RegisterObjectBound$FUNC
    );
    public interface RegisterObjectBound {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(RegisterObjectBound fi, MemorySession session) {
            return RuntimeHelper.upcallStub(RegisterObjectBound.class, fi, IBindCtxVtbl.RegisterObjectBound$FUNC, session);
        }
        static RegisterObjectBound ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IBindCtxVtbl.RegisterObjectBound$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RegisterObjectBound$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RegisterObjectBound"));
    public static VarHandle RegisterObjectBound$VH() {
        return IBindCtxVtbl.RegisterObjectBound$VH;
    }
    public static MemoryAddress RegisterObjectBound$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.RegisterObjectBound$VH.get(seg);
    }
    public static void RegisterObjectBound$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.RegisterObjectBound$VH.set(seg, x);
    }
    public static MemoryAddress RegisterObjectBound$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.RegisterObjectBound$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RegisterObjectBound$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.RegisterObjectBound$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RegisterObjectBound RegisterObjectBound (MemorySegment segment, MemorySession session) {
        return RegisterObjectBound.ofAddress(RegisterObjectBound$get(segment), session);
    }
    static final FunctionDescriptor RevokeObjectBound$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RevokeObjectBound$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.RevokeObjectBound$FUNC
    );
    public interface RevokeObjectBound {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(RevokeObjectBound fi, MemorySession session) {
            return RuntimeHelper.upcallStub(RevokeObjectBound.class, fi, IBindCtxVtbl.RevokeObjectBound$FUNC, session);
        }
        static RevokeObjectBound ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IBindCtxVtbl.RevokeObjectBound$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RevokeObjectBound$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RevokeObjectBound"));
    public static VarHandle RevokeObjectBound$VH() {
        return IBindCtxVtbl.RevokeObjectBound$VH;
    }
    public static MemoryAddress RevokeObjectBound$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.RevokeObjectBound$VH.get(seg);
    }
    public static void RevokeObjectBound$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.RevokeObjectBound$VH.set(seg, x);
    }
    public static MemoryAddress RevokeObjectBound$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.RevokeObjectBound$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RevokeObjectBound$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.RevokeObjectBound$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RevokeObjectBound RevokeObjectBound (MemorySegment segment, MemorySession session) {
        return RevokeObjectBound.ofAddress(RevokeObjectBound$get(segment), session);
    }
    static final FunctionDescriptor ReleaseBoundObjects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseBoundObjects$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.ReleaseBoundObjects$FUNC
    );
    public interface ReleaseBoundObjects {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(ReleaseBoundObjects fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ReleaseBoundObjects.class, fi, IBindCtxVtbl.ReleaseBoundObjects$FUNC, session);
        }
        static ReleaseBoundObjects ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IBindCtxVtbl.ReleaseBoundObjects$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReleaseBoundObjects$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReleaseBoundObjects"));
    public static VarHandle ReleaseBoundObjects$VH() {
        return IBindCtxVtbl.ReleaseBoundObjects$VH;
    }
    public static MemoryAddress ReleaseBoundObjects$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.ReleaseBoundObjects$VH.get(seg);
    }
    public static void ReleaseBoundObjects$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.ReleaseBoundObjects$VH.set(seg, x);
    }
    public static MemoryAddress ReleaseBoundObjects$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.ReleaseBoundObjects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReleaseBoundObjects$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.ReleaseBoundObjects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReleaseBoundObjects ReleaseBoundObjects (MemorySegment segment, MemorySession session) {
        return ReleaseBoundObjects.ofAddress(ReleaseBoundObjects$get(segment), session);
    }
    static final FunctionDescriptor SetBindOptions$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetBindOptions$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.SetBindOptions$FUNC
    );
    public interface SetBindOptions {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(SetBindOptions fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetBindOptions.class, fi, IBindCtxVtbl.SetBindOptions$FUNC, session);
        }
        static SetBindOptions ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IBindCtxVtbl.SetBindOptions$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetBindOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetBindOptions"));
    public static VarHandle SetBindOptions$VH() {
        return IBindCtxVtbl.SetBindOptions$VH;
    }
    public static MemoryAddress SetBindOptions$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.SetBindOptions$VH.get(seg);
    }
    public static void SetBindOptions$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.SetBindOptions$VH.set(seg, x);
    }
    public static MemoryAddress SetBindOptions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.SetBindOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetBindOptions$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.SetBindOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetBindOptions SetBindOptions (MemorySegment segment, MemorySession session) {
        return SetBindOptions.ofAddress(SetBindOptions$get(segment), session);
    }
    static final FunctionDescriptor GetBindOptions$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetBindOptions$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.GetBindOptions$FUNC
    );
    public interface GetBindOptions {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetBindOptions fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetBindOptions.class, fi, IBindCtxVtbl.GetBindOptions$FUNC, session);
        }
        static GetBindOptions ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IBindCtxVtbl.GetBindOptions$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBindOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetBindOptions"));
    public static VarHandle GetBindOptions$VH() {
        return IBindCtxVtbl.GetBindOptions$VH;
    }
    public static MemoryAddress GetBindOptions$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.GetBindOptions$VH.get(seg);
    }
    public static void GetBindOptions$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.GetBindOptions$VH.set(seg, x);
    }
    public static MemoryAddress GetBindOptions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.GetBindOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBindOptions$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.GetBindOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBindOptions GetBindOptions (MemorySegment segment, MemorySession session) {
        return GetBindOptions.ofAddress(GetBindOptions$get(segment), session);
    }
    static final FunctionDescriptor GetRunningObjectTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetRunningObjectTable$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.GetRunningObjectTable$FUNC
    );
    public interface GetRunningObjectTable {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetRunningObjectTable fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetRunningObjectTable.class, fi, IBindCtxVtbl.GetRunningObjectTable$FUNC, session);
        }
        static GetRunningObjectTable ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IBindCtxVtbl.GetRunningObjectTable$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetRunningObjectTable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetRunningObjectTable"));
    public static VarHandle GetRunningObjectTable$VH() {
        return IBindCtxVtbl.GetRunningObjectTable$VH;
    }
    public static MemoryAddress GetRunningObjectTable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.GetRunningObjectTable$VH.get(seg);
    }
    public static void GetRunningObjectTable$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.GetRunningObjectTable$VH.set(seg, x);
    }
    public static MemoryAddress GetRunningObjectTable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.GetRunningObjectTable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetRunningObjectTable$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.GetRunningObjectTable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetRunningObjectTable GetRunningObjectTable (MemorySegment segment, MemorySession session) {
        return GetRunningObjectTable.ofAddress(GetRunningObjectTable$get(segment), session);
    }
    static final FunctionDescriptor RegisterObjectParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterObjectParam$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.RegisterObjectParam$FUNC
    );
    public interface RegisterObjectParam {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(RegisterObjectParam fi, MemorySession session) {
            return RuntimeHelper.upcallStub(RegisterObjectParam.class, fi, IBindCtxVtbl.RegisterObjectParam$FUNC, session);
        }
        static RegisterObjectParam ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IBindCtxVtbl.RegisterObjectParam$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RegisterObjectParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RegisterObjectParam"));
    public static VarHandle RegisterObjectParam$VH() {
        return IBindCtxVtbl.RegisterObjectParam$VH;
    }
    public static MemoryAddress RegisterObjectParam$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.RegisterObjectParam$VH.get(seg);
    }
    public static void RegisterObjectParam$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.RegisterObjectParam$VH.set(seg, x);
    }
    public static MemoryAddress RegisterObjectParam$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.RegisterObjectParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RegisterObjectParam$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.RegisterObjectParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RegisterObjectParam RegisterObjectParam (MemorySegment segment, MemorySession session) {
        return RegisterObjectParam.ofAddress(RegisterObjectParam$get(segment), session);
    }
    static final FunctionDescriptor GetObjectParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetObjectParam$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.GetObjectParam$FUNC
    );
    public interface GetObjectParam {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(GetObjectParam fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetObjectParam.class, fi, IBindCtxVtbl.GetObjectParam$FUNC, session);
        }
        static GetObjectParam ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IBindCtxVtbl.GetObjectParam$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetObjectParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetObjectParam"));
    public static VarHandle GetObjectParam$VH() {
        return IBindCtxVtbl.GetObjectParam$VH;
    }
    public static MemoryAddress GetObjectParam$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.GetObjectParam$VH.get(seg);
    }
    public static void GetObjectParam$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.GetObjectParam$VH.set(seg, x);
    }
    public static MemoryAddress GetObjectParam$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.GetObjectParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetObjectParam$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.GetObjectParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetObjectParam GetObjectParam (MemorySegment segment, MemorySession session) {
        return GetObjectParam.ofAddress(GetObjectParam$get(segment), session);
    }
    static final FunctionDescriptor EnumObjectParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumObjectParam$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.EnumObjectParam$FUNC
    );
    public interface EnumObjectParam {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(EnumObjectParam fi, MemorySession session) {
            return RuntimeHelper.upcallStub(EnumObjectParam.class, fi, IBindCtxVtbl.EnumObjectParam$FUNC, session);
        }
        static EnumObjectParam ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IBindCtxVtbl.EnumObjectParam$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnumObjectParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnumObjectParam"));
    public static VarHandle EnumObjectParam$VH() {
        return IBindCtxVtbl.EnumObjectParam$VH;
    }
    public static MemoryAddress EnumObjectParam$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.EnumObjectParam$VH.get(seg);
    }
    public static void EnumObjectParam$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.EnumObjectParam$VH.set(seg, x);
    }
    public static MemoryAddress EnumObjectParam$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.EnumObjectParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnumObjectParam$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.EnumObjectParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnumObjectParam EnumObjectParam (MemorySegment segment, MemorySession session) {
        return EnumObjectParam.ofAddress(EnumObjectParam$get(segment), session);
    }
    static final FunctionDescriptor RevokeObjectParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RevokeObjectParam$MH = RuntimeHelper.downcallHandle(
        IBindCtxVtbl.RevokeObjectParam$FUNC
    );
    public interface RevokeObjectParam {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(RevokeObjectParam fi, MemorySession session) {
            return RuntimeHelper.upcallStub(RevokeObjectParam.class, fi, IBindCtxVtbl.RevokeObjectParam$FUNC, session);
        }
        static RevokeObjectParam ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IBindCtxVtbl.RevokeObjectParam$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RevokeObjectParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RevokeObjectParam"));
    public static VarHandle RevokeObjectParam$VH() {
        return IBindCtxVtbl.RevokeObjectParam$VH;
    }
    public static MemoryAddress RevokeObjectParam$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.RevokeObjectParam$VH.get(seg);
    }
    public static void RevokeObjectParam$set( MemorySegment seg, MemoryAddress x) {
        IBindCtxVtbl.RevokeObjectParam$VH.set(seg, x);
    }
    public static MemoryAddress RevokeObjectParam$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindCtxVtbl.RevokeObjectParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RevokeObjectParam$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindCtxVtbl.RevokeObjectParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RevokeObjectParam RevokeObjectParam (MemorySegment segment, MemorySession session) {
        return RevokeObjectParam.ofAddress(RevokeObjectParam$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


