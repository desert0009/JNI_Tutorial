#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_mylibrary_JniUtils_stringFromJNI(JNIEnv *env, jobject instance, jstring msg) {

    const char *storage_path_ptr = env->GetStringUTFChars(msg, nullptr);

    return env->NewStringUTF(storage_path_ptr);
}
