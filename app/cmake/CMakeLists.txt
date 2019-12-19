cmake_minimum_required(VERSION 3.4.1)

add_compile_options(-std=c++11)

add_library(Helloworld SHARED ../src/main/cpp/Helloworld.cpp)

add_library(Bridge SHARED ../src/main/cpp/Bridge.cpp)

target_link_libraries(Bridge Helloworld)
