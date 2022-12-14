// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IBindStatusCallbackVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("OnStartBinding"),
        Constants$root.C_POINTER$LAYOUT.withName("GetPriority"),
        Constants$root.C_POINTER$LAYOUT.withName("OnLowResource"),
        Constants$root.C_POINTER$LAYOUT.withName("OnProgress"),
        Constants$root.C_POINTER$LAYOUT.withName("OnStopBinding"),
        Constants$root.C_POINTER$LAYOUT.withName("GetBindInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("OnDataAvailable"),
        Constants$root.C_POINTER$LAYOUT.withName("OnObjectAvailable")
    ).withName("IBindStatusCallbackVtbl");
    public static MemoryLayout $LAYOUT() {
        return IBindStatusCallbackVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IBindStatusCallbackVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IBindStatusCallbackVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IBindStatusCallbackVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IBindStatusCallbackVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IBindStatusCallbackVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IBindStatusCallbackVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IBindStatusCallbackVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IBindStatusCallbackVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IBindStatusCallbackVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IBindStatusCallbackVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IBindStatusCallbackVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IBindStatusCallbackVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor OnStartBinding$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnStartBinding$MH = RuntimeHelper.downcallHandle(
        IBindStatusCallbackVtbl.OnStartBinding$FUNC
    );
    public interface OnStartBinding {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(OnStartBinding fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnStartBinding.class, fi, IBindStatusCallbackVtbl.OnStartBinding$FUNC, session);
        }
        static OnStartBinding ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IBindStatusCallbackVtbl.OnStartBinding$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnStartBinding$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnStartBinding"));
    public static VarHandle OnStartBinding$VH() {
        return IBindStatusCallbackVtbl.OnStartBinding$VH;
    }
    public static MemoryAddress OnStartBinding$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.OnStartBinding$VH.get(seg);
    }
    public static void OnStartBinding$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackVtbl.OnStartBinding$VH.set(seg, x);
    }
    public static MemoryAddress OnStartBinding$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.OnStartBinding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnStartBinding$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackVtbl.OnStartBinding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnStartBinding OnStartBinding (MemorySegment segment, MemorySession session) {
        return OnStartBinding.ofAddress(OnStartBinding$get(segment), session);
    }
    static final FunctionDescriptor GetPriority$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPriority$MH = RuntimeHelper.downcallHandle(
        IBindStatusCallbackVtbl.GetPriority$FUNC
    );
    public interface GetPriority {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetPriority fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetPriority.class, fi, IBindStatusCallbackVtbl.GetPriority$FUNC, session);
        }
        static GetPriority ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IBindStatusCallbackVtbl.GetPriority$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetPriority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetPriority"));
    public static VarHandle GetPriority$VH() {
        return IBindStatusCallbackVtbl.GetPriority$VH;
    }
    public static MemoryAddress GetPriority$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.GetPriority$VH.get(seg);
    }
    public static void GetPriority$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackVtbl.GetPriority$VH.set(seg, x);
    }
    public static MemoryAddress GetPriority$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.GetPriority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetPriority$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackVtbl.GetPriority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetPriority GetPriority (MemorySegment segment, MemorySession session) {
        return GetPriority.ofAddress(GetPriority$get(segment), session);
    }
    static final FunctionDescriptor OnLowResource$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OnLowResource$MH = RuntimeHelper.downcallHandle(
        IBindStatusCallbackVtbl.OnLowResource$FUNC
    );
    public interface OnLowResource {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(OnLowResource fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnLowResource.class, fi, IBindStatusCallbackVtbl.OnLowResource$FUNC, session);
        }
        static OnLowResource ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IBindStatusCallbackVtbl.OnLowResource$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnLowResource$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnLowResource"));
    public static VarHandle OnLowResource$VH() {
        return IBindStatusCallbackVtbl.OnLowResource$VH;
    }
    public static MemoryAddress OnLowResource$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.OnLowResource$VH.get(seg);
    }
    public static void OnLowResource$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackVtbl.OnLowResource$VH.set(seg, x);
    }
    public static MemoryAddress OnLowResource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.OnLowResource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnLowResource$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackVtbl.OnLowResource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnLowResource OnLowResource (MemorySegment segment, MemorySession session) {
        return OnLowResource.ofAddress(OnLowResource$get(segment), session);
    }
    static final FunctionDescriptor OnProgress$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnProgress$MH = RuntimeHelper.downcallHandle(
        IBindStatusCallbackVtbl.OnProgress$FUNC
    );
    public interface OnProgress {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, int _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(OnProgress fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnProgress.class, fi, IBindStatusCallbackVtbl.OnProgress$FUNC, session);
        }
        static OnProgress ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, int __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IBindStatusCallbackVtbl.OnProgress$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, __x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnProgress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnProgress"));
    public static VarHandle OnProgress$VH() {
        return IBindStatusCallbackVtbl.OnProgress$VH;
    }
    public static MemoryAddress OnProgress$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.OnProgress$VH.get(seg);
    }
    public static void OnProgress$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackVtbl.OnProgress$VH.set(seg, x);
    }
    public static MemoryAddress OnProgress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.OnProgress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnProgress$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackVtbl.OnProgress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnProgress OnProgress (MemorySegment segment, MemorySession session) {
        return OnProgress.ofAddress(OnProgress$get(segment), session);
    }
    static final FunctionDescriptor OnStopBinding$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnStopBinding$MH = RuntimeHelper.downcallHandle(
        IBindStatusCallbackVtbl.OnStopBinding$FUNC
    );
    public interface OnStopBinding {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(OnStopBinding fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnStopBinding.class, fi, IBindStatusCallbackVtbl.OnStopBinding$FUNC, session);
        }
        static OnStopBinding ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IBindStatusCallbackVtbl.OnStopBinding$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnStopBinding$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnStopBinding"));
    public static VarHandle OnStopBinding$VH() {
        return IBindStatusCallbackVtbl.OnStopBinding$VH;
    }
    public static MemoryAddress OnStopBinding$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.OnStopBinding$VH.get(seg);
    }
    public static void OnStopBinding$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackVtbl.OnStopBinding$VH.set(seg, x);
    }
    public static MemoryAddress OnStopBinding$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.OnStopBinding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnStopBinding$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackVtbl.OnStopBinding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnStopBinding OnStopBinding (MemorySegment segment, MemorySession session) {
        return OnStopBinding.ofAddress(OnStopBinding$get(segment), session);
    }
    static final FunctionDescriptor GetBindInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetBindInfo$MH = RuntimeHelper.downcallHandle(
        IBindStatusCallbackVtbl.GetBindInfo$FUNC
    );
    public interface GetBindInfo {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(GetBindInfo fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetBindInfo.class, fi, IBindStatusCallbackVtbl.GetBindInfo$FUNC, session);
        }
        static GetBindInfo ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IBindStatusCallbackVtbl.GetBindInfo$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBindInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetBindInfo"));
    public static VarHandle GetBindInfo$VH() {
        return IBindStatusCallbackVtbl.GetBindInfo$VH;
    }
    public static MemoryAddress GetBindInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.GetBindInfo$VH.get(seg);
    }
    public static void GetBindInfo$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackVtbl.GetBindInfo$VH.set(seg, x);
    }
    public static MemoryAddress GetBindInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.GetBindInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBindInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackVtbl.GetBindInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBindInfo GetBindInfo (MemorySegment segment, MemorySession session) {
        return GetBindInfo.ofAddress(GetBindInfo$get(segment), session);
    }
    static final FunctionDescriptor OnDataAvailable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnDataAvailable$MH = RuntimeHelper.downcallHandle(
        IBindStatusCallbackVtbl.OnDataAvailable$FUNC
    );
    public interface OnDataAvailable {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(OnDataAvailable fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnDataAvailable.class, fi, IBindStatusCallbackVtbl.OnDataAvailable$FUNC, session);
        }
        static OnDataAvailable ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IBindStatusCallbackVtbl.OnDataAvailable$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnDataAvailable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnDataAvailable"));
    public static VarHandle OnDataAvailable$VH() {
        return IBindStatusCallbackVtbl.OnDataAvailable$VH;
    }
    public static MemoryAddress OnDataAvailable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.OnDataAvailable$VH.get(seg);
    }
    public static void OnDataAvailable$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackVtbl.OnDataAvailable$VH.set(seg, x);
    }
    public static MemoryAddress OnDataAvailable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.OnDataAvailable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnDataAvailable$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackVtbl.OnDataAvailable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnDataAvailable OnDataAvailable (MemorySegment segment, MemorySession session) {
        return OnDataAvailable.ofAddress(OnDataAvailable$get(segment), session);
    }
    static final FunctionDescriptor OnObjectAvailable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnObjectAvailable$MH = RuntimeHelper.downcallHandle(
        IBindStatusCallbackVtbl.OnObjectAvailable$FUNC
    );
    public interface OnObjectAvailable {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(OnObjectAvailable fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnObjectAvailable.class, fi, IBindStatusCallbackVtbl.OnObjectAvailable$FUNC, session);
        }
        static OnObjectAvailable ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IBindStatusCallbackVtbl.OnObjectAvailable$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnObjectAvailable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnObjectAvailable"));
    public static VarHandle OnObjectAvailable$VH() {
        return IBindStatusCallbackVtbl.OnObjectAvailable$VH;
    }
    public static MemoryAddress OnObjectAvailable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.OnObjectAvailable$VH.get(seg);
    }
    public static void OnObjectAvailable$set( MemorySegment seg, MemoryAddress x) {
        IBindStatusCallbackVtbl.OnObjectAvailable$VH.set(seg, x);
    }
    public static MemoryAddress OnObjectAvailable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindStatusCallbackVtbl.OnObjectAvailable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnObjectAvailable$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindStatusCallbackVtbl.OnObjectAvailable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnObjectAvailable OnObjectAvailable (MemorySegment segment, MemorySession session) {
        return OnObjectAvailable.ofAddress(OnObjectAvailable$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


