load("@bazel_tools//tools/jdk:remote_java_repository.bzl", "remote_java_repository")

remote_java_repository(
  name = "openjdk_linux_x64",
  prefix = "openjdk", # Can be used with --java_runtime_version=openjdk_canary_11
  version = "17",            # or --java_runtime_version=11
  exec_compatible_with = [   # Specifies constraints this JVM is compatible with "@platforms//cpu:arm",
    "@platforms//os:linux",
    "@platforms//cpu:x86_64",
  ],
  urls = [
           "https://cdn.azul.com/zulu/bin/zulu17.32.13-ca-jdk17.0.2-linux_x64.tar.gz",
  ],
  strip_prefix = "zulu17.32.13-ca-jdk17.0.2-linux_x64",
  sha256 = "73d5c4bae20325ca41b606f7eae64669db3aac638c5b3ead4a975055846ad6de",
)
