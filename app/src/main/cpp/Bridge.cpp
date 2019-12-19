#include "jni.h"
#include "Helloworld.h"

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_android_1helloworld_1sample_MainActivityKt_HelloWorldString(
    JNIEnv* env, jobject thiz)
{
    return env->NewStringUTF(Helloworld::String());
}