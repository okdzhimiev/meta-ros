HOMEPAGE = "https://github.com/ament/ament_cmake"

SRCREV = "128f26421af8100a8d290a6a9e8e6f07a30a36c0"
SRC_URI = "git://github.com/ament/ament_cmake.git;branch=bouncy;protocol=git;"

inherit cmake python3native

ROS_BPN = "${@d.getVar('BPN', True).replace('-', '_')}"

S = "${WORKDIR}/git/${ROS_BPN}"

DEPENDS += " python3-catkin-pkg"

do_install_append() {
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.bash
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.sh
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.zsh
}

FILES_${PN} += "${datadir}"

BBCLASSEXTEND += "native"
