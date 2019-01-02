SUMMARY = "ROS2 libyaml_vendor"
HOMEPAGE = "https://github.com/ros2/libyaml_vendor"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=13;md5=5ef5aba2b1bc9f860fc442488b0cc9f0"
DEPENDS = " \
    ament-cmake-ros \
"

SRCREV = "c69f385ebb8c971b9bdd2a87fc983c5a12b12811"
SRC_URI = "git://github.com/ros2/libyaml_vendor.git;branch=bouncy;protocol=git;"

inherit ament

S = "${WORKDIR}/git"

FILES_${PN} = "/usr"

SYSROOT_DIRS += "/usr/cmake"
