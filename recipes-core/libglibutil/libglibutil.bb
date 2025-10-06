# Copyright (c) 2019 Christophe Chapuis <chris.chapuis@gmail.com>

DESCRIPTION = "Library of glib utilities."
LICENSE = "BSD-3-Clause"
SECTION = "webos/support"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b0c7662a54bc9e4dc8386acfbc694e0e"

SRC_URI = "git://github.com/sailfishos/libglibutil.git;protocol=https;branch=master"
SRCREV = "4150ffaddcc92172b62579ea4c327e610a4fe3c9"
PR = "r1"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"

DEPENDS = "glib-2.0"

inherit pkgconfig

EXTRA_OEMAKE = "KEEP_SYMBOLS=1"
PARALLEL_MAKE = ""

do_install() {
    make install DESTDIR=${D}
    make install-dev DESTDIR=${D}
}
