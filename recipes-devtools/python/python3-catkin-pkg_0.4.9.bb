DESCRIPTION = "catkin package library"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"
PYPI_PACKAGE = "catkin_pkg"

SRC_URI[sha256sum] = "aed0d3ebc5fb449678b90e007ccf3c200c9e4e76aa09a676029b8713b361e3ef"

inherit pypi

RDEPENDS_${PN} = "${PYTHON_PN}-unixadmin"
RDEPENDS_${PN}_class-native = ""

BBCLASSEXTEND = "native nativesdk"

inherit distutils3
inherit setuptools3
