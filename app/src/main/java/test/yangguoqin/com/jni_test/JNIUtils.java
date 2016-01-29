package test.yangguoqin.com.jni_test;

/**
 * @创建者 Administrator
 * @创时间 2016/1/28 10:07
 * @描述 ${todo}
 * @包名 test.yangguoqin.com
 * @版本 $$Rev$$
 * @更新者 $$Author$$
 * @更新时间 $$Date$$
 * @更新描述 ${todo}
 */
public class JNIUtils {
    static {
        System.loadLibrary("app");
    }

    public static native String getStringFromC();

    //1创建并调用工具类和本地方法
    //2.java中调用这个方法,在gradle.properties中添加android.useDeprecatedNdk=true 编译
    //   project视图下  出现intermediates中的classes
    //3.执行javah的两种方法
    //      a.进行debug目录,右键fix path得到路径进dos,前提是要先编译,才能切换到classes-debug目录执行
    //      b.在src-main目录下执行就行
    //          javah 包名.类名
    //4.加载库文件

    //注意: 初次建立时需要设置NDK路径
    // 生成的各个平台的.so库在project-build-ndk下

}
