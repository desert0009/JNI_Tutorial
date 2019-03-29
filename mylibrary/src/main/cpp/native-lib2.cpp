#include <jni.h>
#include <string>


extern "C" JNIEXPORT jstring JNICALL
Java_com_example_mylibrary_JniUtils_stringFromJNI2(JNIEnv *env, jobject instance) {
    std::string hello = " Hello from Module C++ 2";
    return env->NewStringUTF(hello.c_str());
}